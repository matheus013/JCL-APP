package laccan.memory;

import laccan.devices.MicazMsg;

import java.util.Comparator;

public class MicazCompare implements Comparator<MicazMsg> {
    public int compare(MicazMsg msg_a, MicazMsg msg_b) {
        double temperature_a;
        double temperature_b;
        if(temperature_a > temperature_b) return 1;
        else return -1;
        return 0;
    }
}
