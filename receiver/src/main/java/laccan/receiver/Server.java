/**
 * @author <Matheus Inácio>
 * @email: <matheus.inacio@laccan.ufal.com>
 * Universidade Federal de Alagoas - UFAL
 * Laboratório de Computação Científica e Análise Numérica - LACCAN
 * <p>
 * last update at August 15, 2017
 **/

package laccan.receiver;

import implementations.dm_kernel.user.JCL_FacadeImpl;
import interfaces.kernel.JCL_facade;
import interfaces.kernel.JCL_result;
import laccan.devices.MicazMsg;
import laccan.memory.Memory;
import net.tinyos.message.Message;

import java.io.File;
import java.util.ArrayList;

public class Server {


    public static void toFog(Message message) {
        MicazMsg micazTemp = (MicazMsg) message;
        String key = String.valueOf(micazTemp.get_nodeid());
        nodeCheck(key);

        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        jcl.instantiateGlobalVarAsy("lastReading", micazTemp);
        System.out.println("Temporary variable created.");
        jcl.executeAll("reduction");
    }

    private static void nodeCheck(String id) {
        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        JCL_result result = jcl.getValue("nodes");
        ArrayList<String> buffer = (ArrayList<String>) result.getCorrectResult();
        if (!buffer.contains(id)) {
            buffer.add(id);
        }
        jcl.setValueUnlocking("nodes", buffer);
    }

    public static void init() {
        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        if (jcl.containsGlobalVar("init")) return;
        ArrayList<String> nodeIDs = new ArrayList<String>();
        Memory memory = new Memory();
        memory.buildRandomReduction(10);
        jcl.instantiateGlobalVarAsy("nodes", nodeIDs);
        jcl.instantiateGlobalVarAsy("buffer", memory);
        jcl.instantiateGlobalVarAsy("init", "init");
        jcl.register(new File[]{new File(
                        "/home/matheus/jcl-apps/fog/out/artifacts/fog_jar/fog.jar")},
                "reduction");
    }
}
