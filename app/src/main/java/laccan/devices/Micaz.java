package laccan.devices;

import implementations.dm_kernel.user.JCL_FacadeImpl;
import interfaces.kernel.JCL_facade;
import interfaces.kernel.JCL_result;
import laccan.lang.Lang;
import laccan.memory.Memory;
import laccan.persistence.StorageCSV;
import net.tinyos.message.Message;
import net.tinyos.message.MessageListener;
import net.tinyos.message.MoteIF;
import net.tinyos.packet.BuildSource;
import net.tinyos.packet.PhoenixSource;
import net.tinyos.util.PrintStreamMessenger;
import org.apache.commons.lang3.time.StopWatch;

import java.io.IOException;

public class Micaz implements MessageListener {

    private PhoenixSource phoenix;
    private MoteIF mif;
    private long msDate;

    //nodeID
    private int nodeID;

    //Current node voltage (in millivolt)
    private double voltage;

    private double[] temperatures = new double[10];


    public Micaz(final String source) {
        phoenix = BuildSource.makePhoenix(source, PrintStreamMessenger.err);
        mif = new MoteIF(phoenix);
        mif.registerListener(new MicazMsg(), this);
    }

    public void messageReceived(int dest_addr, Message msg) {
        msDate = System.currentTimeMillis();    //Get current date
        processPacket(msg);
        printData(); //Display sensor data

        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        try {
            save(); //Send to cloud
        } catch (IOException e) {
            e.printStackTrace();
        }
        long timeTaken = stopwatch.getTime();
        System.out.println(timeTaken);
        StorageCSV storageCSV = new StorageCSV();
        try {
            storageCSV.local("log.csv").save(new String[]{String.valueOf(timeTaken), "time", "post", "jcl"});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void processPacket(Message message) {
        if (message instanceof MicazMsg) {
            //Get packet
            MicazMsg tempMessage = (MicazMsg) message;

            nodeID = tempMessage.get_NodeID();

            for (int i = 0; i < tempMessage.get_Buffer().length; i++) {
                temperatures[i] =
                        calculateSensirion(tempMessage.getElement_Buffer(i), 0)[0];
            }
            if (tempMessage.get_Voltage() != 0)
                voltage = (1223 * 1024) / tempMessage.get_Voltage();
            else System.err.println("err in voltage read");
            return;
        }
        System.err.println("Unable to process packet.");
        return;
    }

    public static double[] calculateSensirion(int Temperature, int Humidity) {
        double[] converted = new double[2];
        converted[0] = -39.4 + (0.01 * (double) Temperature);
        converted[1] = (-2.0468 + 0.0367 * (double) Humidity - 0.0000015955 * Math.pow((double) Humidity, (double) 2))
                + (converted[0] - 25) * (0.01 + 0.00008 * (double) Humidity);
        return converted;
    }

    @SuppressWarnings("unused")
    private void printData() {
        System.out.println("Measured micaz data:");
        System.out.println();
        System.out.println("Node:                   " + nodeID);
        System.out.println("NodeType:               " + "micaz");
        System.out.println("Voltage:                " + voltage);
        System.out.println("date:\t\t\t" + msDate);
    }

    private void save() throws IOException {
        StorageCSV storageCSV = new StorageCSV();
        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        JCL_result result = jcl.getValue(Lang.FULL_MEMORY_KEY);
        Memory fullMemory = (Memory) result.getCorrectResult();
        result = jcl.getValue(Lang.MEMORY_KEY);
        Memory memory = (Memory) result.getCorrectResult();

        if (fullMemory.length() == 1440) {
            fullMemory.clear();
            memory.clear();
        }

        for (int i = 0; i < 8; i++) {
            storageCSV
                    .local("full.csv")
                    .save(new String[]{String.valueOf((msDate - i * 60000)), String.valueOf(temperatures[i])});
            Sample sample = new Sample(String.valueOf(nodeID), temperatures[i], (msDate - i * 60000));
            fullMemory.add(sample);
            if(i == 7)
                jcl.setValueUnlocking(Lang.LAST_READ_KEY, temperatures[i]);
        }
        boolean t = jcl.setValueUnlocking(Lang.FULL_MEMORY_KEY, fullMemory);
        for (int i = 8; i < 10; i++) {
            storageCSV
                    .local("reduce.csv")
                    .save(new String[]{String.valueOf((msDate - (i - 4) * 60000)), String.valueOf(temperatures[i])});
            Sample sample = new Sample(String.valueOf(nodeID), temperatures[i], (msDate - i * 60000));
            memory.add(sample);
        }
        jcl.setValueUnlocking(Lang.MEMORY_KEY, memory);
    }
}