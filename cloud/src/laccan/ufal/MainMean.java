package laccan.ufal;

import implementations.dm_kernel.user.JCL_FacadeImpl;
import interfaces.kernel.JCL_facade;
import interfaces.kernel.JCL_result;
import laccan.devices.MicazMsg;
import laccan.receiver.Pair;
import laccan.ufal.prediction.Mean;

import java.util.ArrayList;

public class MainMean {
    public static void main(String[] args) {
        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        Mean mean = new Mean();
        JCL_result result = jcl.getValueLocking("buffer");
        ArrayList<MicazMsg> input = (ArrayList<MicazMsg>) result.getCorrectResult();
        mean.init(input, null);
        mean.train();
        result = jcl.getValueLocking("testCase");
        ArrayList<MicazMsg> testCase = (ArrayList<MicazMsg>) result.getCorrectResult();
        ArrayList<Pair<String, Double>> prediction = mean.result(testCase);

        for (Pair<String, Double> pre : prediction) {
            System.out.println("Expected temperature at node " + pre.getFirst() + " is" +
                    pre.getSecond());
        }
        System.out.println("Mean square error" + mean.mse().getFirst() + "indoor and " +
                mean.mse().getSecond() + " outdoor");
    }
}
