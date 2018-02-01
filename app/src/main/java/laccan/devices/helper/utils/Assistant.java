/**
 * Possui metodos que são usados em estaticamente.
 *
 * @author Matheus In&aacute;cio
 **/

package laccan.devices.helper.utils;

import implementations.dm_kernel.user.JCL_FacadeImpl;
import interfaces.kernel.JCL_facade;
import interfaces.kernel.JCL_result;
import laccan.devices.MicazMsg;
import laccan.memory.builder.Memory;
import net.tinyos.message.Message;

import java.io.File;
import java.util.ArrayList;

/**
 * possui metodos comumente usado na aplicação
 */
public class Assistant {


    public static String predictorType = null;
    public static String reducerType = null;

    /**
     * Envia mensagem recebida da rede micaz para buffer global do JCL
     *
     * @param message mensagem recebida
     */
    public static void toFog(Message message) {
        MicazMsg micazTemp = (MicazMsg) message;
        String key = String.valueOf(micazTemp.get_nodeid());
        nodeCheck(key);

        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        jcl.instantiateGlobalVarAsy("lastReading", micazTemp);
        System.out.println("Temporary variable created.");
        jcl.executeAll("reduction");
    }

    /**
     * Registra novos nós sensores, caso seja novo
     *
     * @param id identificador do nó sensor
     */
    private static void nodeCheck(String id) {
        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        JCL_result result = jcl.getValue("nodes");
        ArrayList<String> buffer = (ArrayList<String>) result.getCorrectResult();
        if (!buffer.contains(id)) {
            buffer.add(id);
        }
        jcl.setValueUnlocking("nodes", buffer);
    }

    /**
     * Inicia variaveis globais
     */
    public static void init() {
        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        if (jcl.containsGlobalVar("init")) return;
        ArrayList<String> nodeIDs = new ArrayList<String>();
        Memory memory = new Memory();
        if (Assistant.reducerType == null) {
            Assistant.reducerType = "";
        }
        memory.build(reducerType);
        jcl.instantiateGlobalVarAsy("nodes", nodeIDs);
        jcl.instantiateGlobalVarAsy("buffer", memory);
        jcl.instantiateGlobalVarAsy("init", "init");
        jcl.register(new File[]{
                        new File(System.getProperty("user.dir") +
                                "/out/artifacts/reducer_jar/jcl-app.jar")},
                "reduction");

    }

    /**
     * indetificadores verbosos dos nós sensores
     */
    public static final String[] environments = {
            "lab_15", "lab_16", "lab_17", "lab_18_1",
            "lab_18_2", "lab_18_3", "room_19", "room_20",
            "room_21", "room_22", "room_23"
    };
}
