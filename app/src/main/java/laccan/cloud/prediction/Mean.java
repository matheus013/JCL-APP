package laccan.cloud.prediction;

import laccan.cloud.parse.ParseMessage;
import laccan.devices.helper.utils.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Mean extends Predictor {
    HashMap<String, Double> average;

    @Override
    public void train() {
        this.average = new HashMap<String, Double>();
        for (Object object : this.input) {
            double average = this.average.get(ParseMessage.type(object));
            average += ParseMessage.temperature(object);
            this.average.put(ParseMessage.type(object), average);
        }
    }

    @Override
    public List<Double> result(List<Long> test) {
        ArrayList<Pair<String, Double>> result = new ArrayList<Pair<String, Double>>();
        for (Object object : test) {
            String key = ParseMessage.id(object);
            Double pre = this.average.get(ParseMessage.type(object));
            result.add(new Pair<String, Double>(key, pre));
        }
        return new ArrayList<Double>();
    }

    @Override
    public double mse() {
        Pair<Double, Double> result = new Pair<Double, Double>(0.0, 0.0);
        for (Object object : this.input) {
            if (ParseMessage.type(object).equals("indoor")) {
                double mse = result.getFirst();
                double error = (this.average.get("indoor") - ParseMessage.temperature(object));
                result.setFirst(mse + Math.pow(error, 2));
            } else {
                double mse = result.getFirst();
                double error = (this.average.get("outdoor") - ParseMessage.temperature(object));
                result.setFirst(mse + Math.pow(error, 2));
            }
        }
        return result.getFirst();
    }
}
