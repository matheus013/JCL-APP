package laccan.cloud.prediction;

import laccan.devices.MicazMsg;
import laccan.devices.helper.utils.Pair;

import java.util.ArrayList;

/**
 * Abstração dos preditores
 */
public abstract class Predictor {

    ArrayList<MicazMsg> input;
    ArrayList<Double> output;


    public void init(ArrayList<MicazMsg> input, ArrayList<Double> output) {
        this.input = input;
        this.output = output;
    }

    /**
     * metodos responsavel pelo treinamento
     */
    public abstract void train();

    /**
     * metodo avaliador
     *
     * @param test entrada para o test
     * @return predição, onde cada par possui uma String representando região e Double respresentando valor
     */
    public abstract ArrayList<Pair<String, Double>> result(ArrayList<MicazMsg> test);

    /**
     * @return erro medio quadrado, respectivamente indoor e outdoor
     */
    public abstract Pair<Double, Double> mse();
}
