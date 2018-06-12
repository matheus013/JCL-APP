package laccan.cloud.prediction;

import laccan.devices.Sample;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RegressionModelTest {
    @Test
    void result() {
        // predição com treino vazio
        Regression regression = new Regression();
        List<Sample> samples = new ArrayList<>();
        assertEquals(null, regression.input);
        regression.result();
        regression.setInput(samples);
        regression.train();
        regression.result();
        System.out.println(regression.mse());

        //predição com treino constante
        regression = new Regression();
        samples = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            samples.add(new Sample("0", 1, i));
        }
        regression.setInput(samples);
        regression.train();
        regression.result();
        assertEquals(regression.mse(), 0.0);
        //predição com treino random
        regression = new Regression();
        samples = new ArrayList<>();
        Random rng = new Random();
        for (int i = 0; i < 100; i++) {
            samples.add(new Sample("0", rng.nextInt(100), i));
        }
        regression.setInput(samples);
        regression.train();
        regression.result();
        assertThat(regression.mse(), not(equalTo(0.0)));

    }

    @Test
    void makeTests() {
        long x0 = 0;
        long e = 12;
        List<Long> result = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            result.add(x0 + e * i);
        }
        Regression regression = new Regression();
        regression.init(new ArrayList<Sample>(), new ArrayList<Double>());
        List<Long> t = regression.makeTests(x0, e, 1000);
        assertEquals(t, result);

    }


}