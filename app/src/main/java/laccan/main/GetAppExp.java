package laccan.main;

import implementations.dm_kernel.user.JCL_FacadeImpl;
import interfaces.kernel.JCL_facade;
import interfaces.kernel.JCL_result;
import laccan.lang.Lang;
import laccan.persistence.StorageCSV;
import org.apache.commons.lang3.time.StopWatch;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class GetAppExp {

    public static void main(String args[]) {
        Timer timer = new Timer();
        TimerTask myTask = new TimerTask() {
            @Override
            public void run() {
                StopWatch stopwatch = new StopWatch();
                stopwatch.start();
                JCL_facade jcl = JCL_FacadeImpl.getInstance();
                JCL_result result = jcl.getValue(Lang.LAST_READ_KEY);
                long timeTaken = stopwatch.getTime();
                StorageCSV storageCSV = new StorageCSV();
                try {
                    storageCSV.local("log.csv").save(new String[]{String.valueOf(timeTaken), "time", "get", "jcl"});
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        timer.schedule(myTask, 5000, 5000);
    }
}
