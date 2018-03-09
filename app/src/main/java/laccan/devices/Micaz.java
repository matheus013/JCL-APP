package laccan.devices;

import laccan.devices.helper.utils.Assistant;
import laccan.persistence.StorageCSV;
import net.tinyos.message.Message;
import net.tinyos.message.MessageListener;
import net.tinyos.message.MoteIF;
import net.tinyos.packet.BuildSource;
import net.tinyos.packet.PhoenixSource;
import net.tinyos.util.PrintStreamMessenger;

import java.io.IOException;

/**
 * Classe responsavel por receber e manipular mensagens recebidas de um Micaz.
 */
public class Micaz implements MessageListener {

    //private static String nativeLibraryPath =
    //System.getProperty("user.dir") + "/src/libs/native/Linux/x86_64-unknown-linux-gnu/";
    //	static {
    //		System.load(nativeLibraryPath + "libgetenv.so");
    //		System.load(nativeLibraryPath + "libtoscomm.so");
    //	}

    private PhoenixSource phoenix;
    private MoteIF mif;
    private long msDate;

    private int nodeID;
    private double light;
    private double[] temperatureHumidity = new double[2];
    private double[] temperaturePressure = new double[2];
    private double voltage;
    private String environment;

    public Micaz(final String source) {
        phoenix = BuildSource.makePhoenix(source, PrintStreamMessenger.err);
        mif = new MoteIF(phoenix);
        mif.registerListener(new MicazMsg(), this);
    }

    /**
     * Quando uma mensagem é recebida, esse metodo é acionado
     *
     * @param dest_addr endereço do destinatario
     * @param message   mensagem
     */
    public void messageReceived(int dest_addr, Message message) {
        msDate = System.currentTimeMillis();
        processPacket(message);
        printData(); //Display sensor data
        Assistant.toFog(message);
        StorageCSV storageCSV = new StorageCSV();
        try {
            storageCSV
                    .local("./delay.csv")
                    .save(new String[]{String.valueOf(System.currentTimeMillis() - msDate)});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Processa mensagem recebidas
     *
     * @param message mensagem
     */
    private void processPacket(Message message) {
        if (message instanceof MicazMsg) {
            MicazMsg tempMessage = (MicazMsg) message;
            nodeID = tempMessage.get_nodeid();

            try {
                environment = Assistant.environments[(nodeID - 1) / 5];
            } catch (ArrayIndexOutOfBoundsException e) {
                environment = "unknownEnvironment";
                System.out.println("Unexpected environment id error.");
            }

            light = calculateTaosLight(tempMessage.get_VisLight_data(), tempMessage.get_InfLight_data());

            temperatureHumidity =
                    calculateSensirion(tempMessage.get_Temp_data(), tempMessage.get_Hum_data());

            temperaturePressure[0] = tempMessage.getElement_Intersema_data(0) / 10;
            temperaturePressure[1] = tempMessage.getElement_Intersema_data(1) / 10;

            voltage = (1223 * 1024) / tempMessage.get_Voltage_data();
            return;
        }
        System.out.println("Unable to process packet.");
    }

    /**
     * Extrai dados de luminosidade dos das mensagens
     *
     * @param visibleLight  luz visivel
     * @param infraredLight luz infravermelha
     * @return valor da luminosidade em lux
     */
    private double calculateTaosLight(int visibleLight, int infraredLight) {
        final int CHORD_VAL[] = {0, 16, 49, 115, 247, 511, 1039, 2095};
        final int STEP_VAL[] = {1, 2, 4, 8, 16, 32, 64, 128};
        int chordNumber, stepNumber, ch0Counts, ch1Counts;

        chordNumber = (visibleLight >> 4) & 7;
        stepNumber = visibleLight & 15;
        ch0Counts = CHORD_VAL[chordNumber] + stepNumber * STEP_VAL[chordNumber];

        chordNumber = (infraredLight >> 4) & 7;
        stepNumber = infraredLight & 15;
        ch1Counts = CHORD_VAL[chordNumber] + stepNumber * STEP_VAL[chordNumber];

        double pConst = -3.13 * ch1Counts / ch0Counts;
        return ch0Counts * 0.46 * Math.exp(pConst);
    }

    /**
     * Extrai dados de temperatura e humidade dos das mensagens
     *
     * @param Temperature dados de temperatura no formato que sensor envia
     * @param Humidity    dados de humidade no formato que sensor envia
     * @return vetor onde na posição 0 temos temperatura e na posição 1 temos humidade
     */
    public static double[] calculateSensirion(int Temperature, int Humidity) {
        double[] converted = new double[2];
        converted[0] = -39.4 + (0.01 * (double) Temperature);
        converted[1] = (-2.0468 + 0.0367 * (double) Humidity - 0.0000015955 * Math.pow((double) Humidity, (double) 2))
                + (converted[0] - 25) * (0.01 + 0.00008 * (double) Humidity);
        return converted;
    }

    /**
     * imprime dados extraidos da mensagem
     */
    private void printData() {
        System.out.println("Measured micaz data:");
        System.out.println();
        System.out.println("Node:                   " + nodeID);
        System.out.println("NodeType:               " + "micaz");
        System.out.println("Environment id:\t\t" + environment);
        System.out.printf("Sensirion temperature:  %.2f\n", temperatureHumidity[0]);
        System.out.printf("Sensirion humidity:     %.2f\n", temperatureHumidity[1]);
        System.out.println("Intersema temperature:  " + temperaturePressure[0]);
        System.out.println("Intersema pressure:     " + temperaturePressure[1]);
        System.out.printf("Taos light:             %.2f\n", light);
        System.out.println("Voltage:                " + voltage);
        System.out.println("date:\t\t\t" + msDate);
    }
}