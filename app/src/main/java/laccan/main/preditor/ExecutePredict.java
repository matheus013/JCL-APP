package laccan.main.preditor;

import laccan.cloud.prediction.Regression;
import laccan.devices.Sample;
import laccan.persistence.StorageCSV;

import java.util.List;

public class ExecutePredict {
    List<Sample> input;
    List<Sample> test;
    private Regression regression;

    public ExecutePredict() {
        regression = new Regression();
    }

    public boolean loadSets(List<Sample> input){
        return input != null && test != null;
    }

    public boolean loadSets(String training, String test) {
        StorageCSV storageCSV = new StorageCSV();
        this.input = storageCSV.local(training).read();
        this.test = storageCSV.local(test).read();
        return input != null && test != null;
    }

    public void fit() {
        if (input == null || test == null)
            return;
        regression.init(input, Regression.makeTests(test));
        regression.train();
    }

    public List<Double> predict() {
        System.out.println(mse());
        return regression.result();
    }

    public List<Double> predict(List<Double> test) {
        return regression.result(test);
    }
    public double mse(){
        return regression.mse();
    }
}
