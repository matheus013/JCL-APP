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
import laccan.devices.Sample;
import laccan.lang.Lang;
import laccan.memory.Memory;
import net.tinyos.message.Message;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

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
        Sample sample = new Sample(micazTemp);
        nodeCheck(sample.getNode());

        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        jcl.instantiateGlobalVarAsy(Lang.LAST_READ_KEY, sample);
        System.out.println("Temporary variable created.");
        jcl.executeAll(Lang.READER_KEY);
    }

    /**
     * Registra novos nós sensores, caso seja novo
     *
     * @param id identificador do nó sensor
     */
    private static void nodeCheck(String id) {
        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        JCL_result result = jcl.getValue(Lang.NODES_IDS_KEY);
        List<String> buffer = (List<String>) result.getCorrectResult();
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
        if (jcl.containsGlobalVar(Lang.INIT_KEY)) return;
        List<String> nodeIDs = new ArrayList<String>();
        Memory memory = new Memory(), fullBuffer = new Memory();
        memory.build();
        fullBuffer.build();
        jcl.instantiateGlobalVarAsy(Lang.NODES_IDS_KEY, nodeIDs);
        jcl.instantiateGlobalVarAsy(Lang.MEMORY_KEY, memory);
        jcl.instantiateGlobalVarAsy(Lang.FULL_MEMORY_KEY, memory);
        jcl.instantiateGlobalVarAsy(Lang.INIT_KEY, "init");
        jcl.register(new File[]{
                        new File(System.getProperty("user.dir") +
                                "/out/artifacts/reducer_jar/jcl-app.jar")},
                Lang.READER_KEY);

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
