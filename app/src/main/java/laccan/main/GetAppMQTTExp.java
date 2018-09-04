package laccan.main;

import laccan.lang.Lang;
import laccan.persistence.StorageCSV;
import org.apache.commons.lang3.time.StopWatch;
import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class GetAppMQTTExp implements MqttCallback {

    MqttClient clientR;
    MqttClient clientS;

    public GetAppMQTTExp() {
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask myTask = new TimerTask() {
            @Override
            public void run() {
                StopWatch stopwatch = new StopWatch();
                stopwatch.start();
                new GetAppMQTTExp().doDemo();
                long timeTaken = stopwatch.getTime();
                StorageCSV storageCSV = new StorageCSV();
                try {
                    storageCSV.local("log.csv").save(new String[]{String.valueOf(timeTaken), "time", "get", "mqtt"});
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        timer.schedule(myTask, 5000, 5000);

    }

    public void doDemo() {
        try {
            MemoryPersistence persistenceS = new MemoryPersistence();
            MemoryPersistence persistenceR = new MemoryPersistence();
            clientS = new MqttClient("tcp://localhost:1883", "Sender", persistenceS);
            clientR = new MqttClient("tcp://localhost:1883", "Reiever", persistenceR);
            clientR.connect();
            clientS.connect();

            clientR.subscribe(Lang.RESPONSE);
            clientS.publish(Lang.REQUEST, new MqttMessage("GET".getBytes()));
            clientR.setCallback(this);

            clientR.disconnect();
            clientS.disconnect();
            clientR.close();
            clientS.close();

        } catch (MqttException e) {
            System.out.println("ERROR");
        }
    }

    @Override
    public void connectionLost(Throwable cause) {
        // TODO Auto-generated method stub

    }

    @Override
    public void messageArrived(String topic, MqttMessage message) {
        System.out.println("Received: " + message.toString());
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken token) {

    }

}