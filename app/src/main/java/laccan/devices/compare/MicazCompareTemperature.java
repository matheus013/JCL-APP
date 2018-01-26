package laccan.devices.compare;

import laccan.devices.Micaz;
import laccan.devices.MicazMsg;

import java.util.Comparator;

/**
 * implementa comparação entre MicazMsg baseado na temperatura
 */
public class MicazCompareTemperature implements Comparator<MicazMsg> {

    public int compare(MicazMsg msg_a, MicazMsg msg_b) {
        double temperature_a = Micaz.calculateSensirion(msg_a.get_Temp_data(), msg_a.get_Hum_data())[0];
        double temperature_b = Micaz.calculateSensirion(msg_b.get_Temp_data(), msg_b.get_Hum_data())[0];
        if (temperature_a > temperature_b) return 1;
        else return -1;
    }
}
