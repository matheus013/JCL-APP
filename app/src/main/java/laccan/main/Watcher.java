package laccan.main;

import laccan.lang.Lang;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class Watcher implements MqttCallback {

    MqttClient clientR;
    MqttClient clientS;
    String msg = "0000";

    public Watcher() {
    }

    public static void main(String[] args) {
        new Watcher().doDemo();
    }

    public void doDemo() {
        try {
            MemoryPersistence persistenceS = new MemoryPersistence();
            MemoryPersistence persistenceR = new MemoryPersistence();
            clientS = new MqttClient("tcp://localhost:1883", "Sender1", persistenceS);
            clientR = new MqttClient("tcp://localhost:1883", "Reiever1", persistenceR);
            clientR.connect();
            clientS.connect();

            clientR.subscribe(Lang.REQUEST);
            clientR.subscribe(Lang.LAST_READ_KEY);
            clientR.setCallback(this);
        } catch (MqttException e) {
            System.out.println("ERROR");
            System.out.println(e);
        }
    }

    @Override
    public void connectionLost(Throwable cause) {
        // TODO Auto-generated method stub

    }

    @Override
    public void messageArrived(String topic, MqttMessage message) throws MqttException {

        System.out.println("Received: " + message.toString());
        if (message.toString().equals("GET"))
            clientS.publish(Lang.RESPONSE, new MqttMessage(msg.getBytes()));
        else
            msg = message.toString();
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken token) {

    }

}