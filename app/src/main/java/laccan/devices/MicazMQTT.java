package laccan.devices;

import laccan.devices.helper.utils.Assistant;
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

import java.io.IOException;

public class MicazMQTT implements MessageListener, MqttCallback {
    private static String nativeLibraryPath =
            System.getProperty("user.dir") + "/sense_lib/native/Linux/x86_64-unknown-linux-gnu/";

    private PhoenixSource phoenix;
    private MoteIF mif;
    private long msDate;

    //nodeID
    private int nodeID;
    private int nodeLimit;

    //Current node voltage (in millivolt)
    private double voltage;

    private double[] temperatures = new double[10];

    //Node location
    private String environment;

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
            try {
                environment = Assistant.environments[(nodeID - 1) / 5];
            } catch (ArrayIndexOutOfBoundsException e) {
                environment = "unknownEnvironment";
                System.out.println("Unexpected environment id error.");
            }

            for (int i = 0; i < tempMessage.get_Buffer().length; i++) {
                temperatures[i] =
                        Micaz.calculateSensirion(tempMessage.getElement_Buffer(i), 0)[0];
            }
            voltage =
                    (1223 * 1024) / tempMessage.get_Voltage();
            return;
        }
        System.out.println("Unable to process packet.");
        return;
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
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MqttException e) {
            e.printStackTrace();
        }
        long timeTaken = stopwatch.getTime();
        System.out.println(timeTaken);
        StorageCSV storageCSV = new StorageCSV();
        try {
            storageCSV.local("times_colet").save(new String[]{String.valueOf(timeTaken)});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void save() throws IOException, MqttException {
        StorageCSV storageCSV = new StorageCSV();
        MqttClient myClient = new MqttClient("tcp://localhost:1883", "00");
        myClient.setCallback(this);
        myClient.connect();
        for (int i = 0; i < 8; i++) {
            storageCSV
                    .local("full.csv")
                    .save(new String[]{String.valueOf((msDate - i * 8000)), String.valueOf(temperatures[i])});
            Sample sample = new Sample(String.valueOf(nodeID), temperatures[i], (msDate - i * 8000));
            MqttMessage message = new MqttMessage(sample.toJson().getBytes());
            myClient.publish(Lang.FULL_MEMORY_KEY, message);
        }
        for (int i = 8; i < 10; i++) {
            storageCSV
                    .local("reduce.csv")
                    .save(new String[]{String.valueOf((msDate - (i - 4) * 8000)), String.valueOf(temperatures[i])});
            Sample sample = new Sample(String.valueOf(nodeID), temperatures[i], (msDate - i * 8000));
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
