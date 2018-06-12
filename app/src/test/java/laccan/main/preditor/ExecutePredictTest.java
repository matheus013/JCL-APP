package laccan.main.preditor;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ExecutePredictTest {

    @Test
    void loadSets() {
        ExecutePredict predict = new ExecutePredict();
        boolean sucess = predict.loadSets(null, null);
        if (sucess) {
            predict.fit();
            predict.predict();
        }
        predict.fit();
        predict.predict();

        predict.loadSets("train.csv", "test.csv");
        predict.fit();
        predict.predict();

        predict.predict(new ArrayList<Double>());
    }

}