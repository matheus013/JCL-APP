package laccan.main;

import laccan.devices.MicazMQTT;

public class MQTTApp {
    public static void main(String[] args) {
        MicazMQTT micazMQTT = new MicazMQTT("serial@/dev/ttyUSB1:57600");
    }
}
