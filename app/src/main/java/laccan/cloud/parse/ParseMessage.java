package laccan.cloud.parse;

import implementations.dm_kernel.user.JCL_FacadeImpl;
import interfaces.kernel.JCL_facade;
import interfaces.kernel.JCL_result;
import laccan.devices.Micaz;
import laccan.devices.MicazMsg;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Extrair informações das mensagens de forma simplificada
 */
public class ParseMessage {
    /**
     * extrai temperatura
     *
     * @param object mensagen referencia
     * @return temperatura
     */
    public static double temperature(Object object) {
        MicazMsg micazMsg = (MicazMsg) object;
        return Micaz.calculateSensirion(micazMsg.get_Temp_data(), micazMsg.get_Hum_data())[0];
    }

    /**
     * extrai tipo do nó que enviou mensagem
     *
     * @param object mensagem
     * @return tipo do nó, que pode ser indoor ou outdoor
     */
    public static String type(Object object) {
        MicazMsg micazMsg = (MicazMsg) object;
        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        String key = String.valueOf(micazMsg.get_nodeid());
        JCL_result result = jcl.getValueLocking("type:" + key);
        return result.getCorrectResult().toString();
    }

    /**
     * extrai tipo do nó que enviou mensagem
     *
     * @param object mensagem
     * @return tipo do nó, que pode ser indoor(1.0) ou outdoor(0.0)
     */
    public static double typeNumeric(Object object) {
        String aux = ParseMessage.type(object);
        return (aux == "indoor") ? 1.0 : 0.0;
    }

    public static double timeNormalized(Object object) {
        return 0;
    }

    public static double stringToNumeric(String str) {
        LocalDateTime dateTime = LocalDateTime.parse(str);
        LocalTime time = dateTime.toLocalTime();
        System.out.println(time.toNanoOfDay());
        System.out.println(LocalTime.MAX.toNanoOfDay());
        return ((double) time.toNanoOfDay()) / ((double) LocalTime.MAX.toNanoOfDay());

    }

    /**
     * extrai id do remetente
     *
     * @param object mensagem
     * @return id
     */
    public static String id(Object object) {
        MicazMsg micazMsg = (MicazMsg) object;
        return String.valueOf(micazMsg.get_nodeid());
    }
}
