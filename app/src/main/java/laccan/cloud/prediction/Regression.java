package laccan.cloud.prediction;

import laccan.devices.Sample;
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
    public List<Double> result(List<Double> test) {
        List<Double> results = new ArrayList<>();
        test.stream().forEach(v -> results.add(simpleRegression.predict(v)));
        return results;
    }

    public List<Double> result() {
        if (input == null)
            return new ArrayList<>();
        if (output == null)
            output = makeTests(input);
        return result(output);
    }

    @Override
    public double mse() {
        return simpleRegression.getMeanSquareError();
    }

    private double[][] getData() {
        double[][] samples = new double[input.size()][];
        for (int i = 0; i < input.size(); i++) {
            samples[i] = new double[]{input.get(i).getDateDouble(), input.get(i).getTemperature()};
//            System.out.println(times[i] + "," + temperatures[i]);
        }
        return samples;

    }

    public static List<Long> makeTests(long x0, long e, int length) {
        List<Long> result = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            result.add(x0 + e * i);
        }
        return result;
    }

    public static List<Double> makeTests(List<Sample> list) {
        List<Double> result = new ArrayList<>();
        for (Sample sample : list) {
            result.add((double) sample.getDate());
        }
        return result;
    }

}