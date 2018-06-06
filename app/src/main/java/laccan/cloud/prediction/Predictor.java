package laccan.cloud.prediction;

import laccan.devices.Sample;

import java.util.List;

/**
 * Abstração dos preditores
 */
public abstract class Predictor {

    List<Sample> input;
    List<Double> output;


    public void init(List<Sample> input, List<Double> output) {
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
    public abstract List<Double> result(List<Double> test);

    /**
     * @return erro medio quadrado, respectivamente indoor e outdoor
     */
    public abstract double mse();
}
