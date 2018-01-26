/**
 * @author <Matheus Inácio>
 * @email: <matheus.inacio@laccan.cloud.com>
 * Universidade Federal de Alagoas - UFAL
 * Laboratório de Computação Científica e Análise Numérica - LACCAN
 * <p>
 * last update at January 15, 2017
 **/

package laccan.main;

import implementations.dm_kernel.user.JCL_FacadeImpl;
import interfaces.kernel.JCL_facade;
import interfaces.kernel.JCL_result;
import laccan.devices.MicazMsg;
import laccan.memory.Memory;

public class ReducerApp {
    public static void main(String[] args) {
        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        JCL_result temp = jcl.getValueLocking("lastReading");
        JCL_result result = jcl.getValueLocking("buffer");
        MicazMsg micazTemp = (MicazMsg) temp.getCorrectResult();
        if (micazTemp != null) {
            Memory buffer = (Memory) result.getCorrectResult();
            buffer.add(micazTemp);

            jcl.setValueUnlocking("buffer", buffer);
        } else System.out.println("Failed to access memory.");
        jcl.deleteGlobalVar("lastReading");
    }
}
