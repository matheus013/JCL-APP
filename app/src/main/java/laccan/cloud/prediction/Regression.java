package laccan.cloud.prediction;

import org.apache.commons.math3.stat.regression.SimpleRegression;

import java.util.ArrayList;
import java.util.List;

public class Regression extends Predictor {
    SimpleRegression simpleRegression = new SimpleRegression();

    @Override
    public void train() {
        simpleRegression.addData(getData());
    }

    @Override
    public List<Double> result(List<Long> test) {
        List<Double> results = new ArrayList<>();
        test.stream().forEach(v -> results.add(simpleRegression.predict(v)));
        return results;
    }

    @Override
    public double mse() {
        return simpleRegression.getMeanSquareError();
    }

    private double[][] getData() {
        double[] times = new double[input.size()];
        double[] temperatures = new double[input.size()];
        for (int i = 0; i < input.size(); i++) {
            times[i] = input.get(i).getDate();
            temperatures[i] = input.get(i).getTemperature();
        }
        return new double[][]{times, temperatures};

    }

    public static List<Long> makeTests(long x0, long e, int length) {
        List<Long> result = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            result.add(x0 + e * i);
        }
        return result;
    }

}
