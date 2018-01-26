package laccan.cloud.parse;

import implementations.dm_kernel.user.JCL_FacadeImpl;
import interfaces.kernel.JCL_facade;
import interfaces.kernel.JCL_result;
import laccan.devices.Micaz;
import laccan.devices.MicazMsg;

public class ParseMessage {
    public static double temperature(Object object) {
        MicazMsg micazMsg = (MicazMsg) object;
        return Micaz.calculateSensirion(micazMsg.get_Temp_data(), micazMsg.get_Hum_data())[0];
    }

    public static String type(Object object) {
        MicazMsg micazMsg = (MicazMsg) object;
        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        String key = String.valueOf(micazMsg.get_nodeid());
        JCL_result result = jcl.getValueLocking("type:" + key);
        return result.getCorrectResult().toString();
    }

    public static String id(Object object) {
        MicazMsg micazMsg = (MicazMsg) object;
        return String.valueOf(micazMsg.get_nodeid());
    }
}
