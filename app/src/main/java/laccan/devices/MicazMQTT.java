package laccan.devices;

import laccan.lang.Lang;
import laccan.persistence.StorageCSV;
import net.tinyos.message.Message;
import net.tinyos.message.MessageListener;
import net.tinyos.message.MoteIF;
import net.tinyos.packet.BuildSource;
import net.tinyos.packet.PhoenixSource;
import net.tinyos.util.PrintStreamMessenger;
import org.apache.commons.lang3.time.StopWatch;
import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import java.io.IOException;

public class MicazMQTT implements MessageListener, MqttCallback {

    private PhoenixSource phoenix;
    private MoteIF mif;
    private long msDate;
    private double voltage;
    //nodeID
    private int nodeID;

    private double[] temperatures = new double[10];

    public MicazMQTT(String source) {
        phoenix = BuildSource.makePhoenix(source, PrintStreamMessenger.err);
        mif = new MoteIF(phoenix);
        mif.registerListener(new MicazMsg(), this);
    }

    private void processPacket(Message message) {
        if (message instanceof MicazMsg) {
            //Get packet
            MicazMsg tempMessage = (MicazMsg) message;

            nodeID = tempMessage.get_NodeID();

            for (int i = 0; i < tempMessage.get_Buffer().length; i++) {
                temperatures[i] =
                        Micaz.calculateSensirion(tempMessage.getElement_Buffer(i), 0)[0];
            }
            if (tempMessage.get_Voltage() != 0)
                voltage = (1223 * 1024) / tempMessage.get_Voltage();
            else System.err.println("err in voltage read");
            return;
        }
        System.out.println("Unable to process packet.");
    }

    @Override
    public void messageReceived(int dest_addr, Message msg) {
        msDate = System.currentTimeMillis();    //Get current date
        processPacket(msg);
//        printData(); //Display sensor data

        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        try {
            save(); //Send to cloud
        } catch (IOException | MqttException e) {
            e.printStackTrace();
        }
        long timeTaken = stopwatch.getTime();
        System.out.println(timeTaken);
        StorageCSV storageCSV = new StorageCSV();
        try {
            storageCSV.local("log.csv").save(new String[]{String.valueOf(timeTaken), "time", "post", "mqtt-p"});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void save() throws IOException, MqttException {
        StorageCSV storageCSV = new StorageCSV();
        MemoryPersistence persistence = new MemoryPersistence();
        MqttClient myClient = new MqttClient("tcp://localhost:1883", "00", persistence);
        MqttConnectOptions connOpts = new MqttConnectOptions();
        connOpts.setCleanSession(true);
        myClient.setCallback(this);
        myClient.connect();
        for (int i = 0; i < 8; i++) {
            storageCSV
                    .local("full.csv")
                    .save(new String[]{String.valueOf((msDate - i * 60000)), String.valueOf(temperatures[i])});
            Sample sample = new Sample(String.valueOf(nodeID), temperatures[i], (msDate - i * 8000));
            MqttMessage message = new MqttMessage(sample.toJson().getBytes());
            myClient.publish(Lang.FULL_MEMORY_KEY, message);
        }
        for (int i = 8; i < 10; i++) {
            storageCSV
                    .local("reduce.csv")
                    .save(new String[]{String.valueOf((msDate - (i - 4) * 60000)), String.valueOf(temperatures[i])});
            Sample sample = new Sample(String.valueOf(nodeID), temperatures[i], (msDate - i * 60000));
            MqttMessage message = new MqttMessage(sample.toJson().getBytes());
            myClient.publish(Lang.MEMORY_KEY, message);
        }
    }

    @Override
    public void connectionLost(Throwable throwable) {

    }

    @Override
    public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {

    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {

    }
}
