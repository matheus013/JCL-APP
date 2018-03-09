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
import laccan.devices.Sample;
import laccan.devices.Type;
import laccan.lang.Lang;
import laccan.memory.Memory;

/**
 * Aplicar algoritmo de redução
 *
 * @author Matheus In&aacute;cio
 */
public class ReaderApp {
    public static void main(String[] args) {
        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        JCL_result temp = jcl.getValueLocking(Lang.LAST_READ_KEY);
        String key = "";
        Sample sample = (Sample) temp.getCorrectResult();
        if (sample != null) {
            if (sample.getType() == Type.FULL) {
                key = Lang.FULL_MEMORY_KEY;
            } else if (sample.getType() == Type.REDUCE) {
                key = Lang.MEMORY_KEY;
            }

            JCL_result result = jcl.getValueLocking(key);
            Memory buffer = (Memory) result.getCorrectResult();
            buffer.add(sample);

            jcl.setValueUnlocking(key, buffer);
        } else System.out.println("Null message.");
        jcl.deleteGlobalVar(Lang.LAST_READ_KEY);
    }
}
