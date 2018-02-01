package laccan.cloud.prediction;


import laccan.devices.MicazMsg;
import laccan.devices.helper.utils.Pair;
import smile.interpolation.KrigingInterpolation;

import java.util.ArrayList;

public class KrigingPrediction extends Predictor {
    KrigingInterpolation interpolator;
    double[][] x;
    double[] y;

    public void train() {
        normalize();
        interpolator = new KrigingInterpolation(x, y);
    }

    public ArrayList<Pair<String, Double>> result(ArrayList<MicazMsg> test) {
        return null;
    }

    public Pair<Double, Double> mse() {
        return null;
    }

    private void normalize() {

    }
}
