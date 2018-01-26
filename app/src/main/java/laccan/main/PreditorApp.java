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
import laccan.devices.helper.utils.Pair;
import laccan.cloud.prediction.Mean;
import laccan.memory.Memory;

import java.util.ArrayList;

public class PreditorApp {
    public static void main(String[] args) {
        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        Mean mean = new Mean();
        JCL_result result = jcl.getValueLocking("buffer");
        Memory memory = (Memory) result.getCorrectResult();
        ArrayList<MicazMsg> input = memory.getMemory().get();
        if (input.size() == 0) {
            System.out.println("Obs not found.");
        } else {
            mean.init(input, null);
            mean.train();
            result = jcl.getValueLocking("testCase");
            ArrayList<MicazMsg> testCase = (ArrayList<MicazMsg>) result.getCorrectResult();
            ArrayList<Pair<String, Double>> prediction = mean.result(testCase);

            for (Pair<String, Double> pre : prediction) {
                System.out.println("Expected temperature at node " + pre.getFirst() + " is" +
                        pre.getSecond());
            }
            System.out.println("Mean square error" + mean.mse().getFirst() + "indoor and " +
                    mean.mse().getSecond() + " outdoor");
        }
    }
}
