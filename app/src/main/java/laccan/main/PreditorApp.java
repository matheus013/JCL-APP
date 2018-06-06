/**
 * @author <Matheus Inácio>
 * @email: <matheus.inacio@laccan.cloud.com>
 * Universidade Federal de Alagoas - UFAL
 * Laboratório de Computação Científica e Análise Numérica - LACCAN
 * <p>
 * last update at January 15, 2017
 **/

package laccan.main;

import laccan.cloud.prediction.Regression;
import laccan.devices.Sample;
import laccan.persistence.StorageCSV;
import org.apache.commons.lang3.time.StopWatch;

import java.io.IOException;
import java.util.List;

/**
 * fazer predrição de um conjunto de valores
 */
public class PreditorApp {
    public static void main(String[] args) throws IOException {
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        StorageCSV storageCSV = new StorageCSV();
        Regression regression = new Regression();

        List<Sample> input = storageCSV
                .local("C:\\Users\\Matheus\\Documents\\csv\\resultado\\sample.csv")
                .read();
        List<Sample> test = storageCSV
                .local("C:\\Users\\Matheus\\Documents\\csv\\resultado\\test.csv")
                .read();
        regression.init(input, Regression.makeTests(test));
        regression.train();
        List<Double> result = regression.result();
        storageCSV
                .local("C:\\Users\\Matheus\\Documents\\csv\\resultado\\out.csv")
                .save(new String[]{"t", "esperado"});
        for (int i = 0; i < result.size(); i++) {
            String[] sample = {String.valueOf(test.get(i).getDate()), String.valueOf(result.get(i))};
            storageCSV
                    .local("C:\\Users\\Matheus\\Documents\\csv\\resultado\\out.csv")
                    .save(sample);
        }
        stopwatch.stop();
        long timeTaken = stopwatch.getTime();
        System.out.println(timeTaken);
    }
}
