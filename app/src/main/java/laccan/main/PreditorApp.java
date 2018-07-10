/**
 * @author <Matheus Inácio>
 * @email: <matheus.inacio@laccan.cloud.com>
 * Universidade Federal de Alagoas - UFAL
 * Laboratório de Computação Científica e Análise Numérica - LACCAN
 * <p>
 * last update at January 15, 2017
 **/

package laccan.main;

import laccan.main.preditor.ExecutePredict;

import java.io.IOException;

/**
 * fazer predrição de um conjunto de valores
 */
public class PreditorApp {
    public static void main(String[] args) throws IOException {
//        StopWatch stopwatch = new StopWatch();
//        stopwatch.start();
        ExecutePredict predict = new ExecutePredict();
        boolean sucess = predict.loadSets("train.csv", "test.csv");
        if (sucess) {
            predict.fit();
            predict.predict();
        }
//        stopwatch.stop();
//        long timeTaken = stopwatch.getTime();
//        System.out.println(timeTaken);
    }
}
