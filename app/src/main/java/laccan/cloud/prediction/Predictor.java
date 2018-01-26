package laccan.cloud.prediction;

import laccan.devices.MicazMsg;
import laccan.utils.Pair;

import java.util.ArrayList;

public abstract class Predictor {

    ArrayList<MicazMsg> input;
    ArrayList<Double> output;


    public void init(ArrayList<MicazMsg> input, ArrayList<Double> output) {
        this.input = input;
        this.output = output;
    }

    public abstract void train();

    public abstract ArrayList<Pair<String, Double>> result(ArrayList<MicazMsg> test);

    public abstract Pair<Double, Double> mse();
}
