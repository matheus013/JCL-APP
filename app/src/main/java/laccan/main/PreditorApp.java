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
import laccan.cloud.prediction.Regression;
import laccan.devices.Sample;
import laccan.lang.Lang;
import laccan.memory.Memory;
import laccan.persistence.StorageCSV;

import java.io.IOException;
import java.util.List;

/**
 * fazer predrição de um conjunto de valores
 */
public class PreditorApp {
    public static void main(String[] args) throws IOException {
        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        Regression regression = new Regression();
        JCL_result result = jcl.getValueLocking(Lang.MEMORY_KEY);
        Memory memory = (Memory) result.getCorrectResult();
        List<Sample> input = memory.getMemory().get();

        if (input.size() == 0) {
            System.out.println("Obs not found.");
        } else {
            regression.init(input, null);
            regression.train();

            List<Long> x = Regression.makeTests(0, 30, 100);
            List<Double> prediction = regression.result(x);
            StorageCSV storageCSV = new StorageCSV();
            for (int i = 0; i < x.size(); i++) {
                storageCSV
                        .local("./predictions")
                        .save(new String[]{String.valueOf(prediction.get(i)), String.valueOf(x.get(i))});
            }
            System.out.println("Mean square error" + regression.mse());
        }
    }
}
