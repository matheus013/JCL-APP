package laccan.devices;

import java.io.IOException;

public class Micaz  {

    private static String nativeLibraryPath =
            System.getProperty("user.dir") + "/sense_lib/native/Linux/x86_64-unknown-linux-gnu/";

    //	static {
    ////		System.load(nativeLibraryPath + "libgetenv.so");
    ////		System.load(nativeLibraryPath + "libtoscomm.so");
    //	}

    private long msDate;

    //nodeID
    private int nodeID;
    private int nodeLimit;

    //Current node voltage (in millivolt)
    private double voltage;

    private double[] temperatures = new double[10];

    //Node location
    private String environment;

    public Micaz(final String source) {

    }

    public void messageReceived(int dest_addr, Object msg) {

    }

    private void processPacket(Object message) {

    }

    public static double[] calculateSensirion(int Temperature, int Humidity) {
        return null;
    }

    @SuppressWarnings("unused")
    private void printData() {

    }

    private void save() throws IOException {

    }
}