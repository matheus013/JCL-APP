package laccan.devices;

import java.io.File;
import java.io.IOException;

import laccan.gatewayApp.EnvironmentMonitor;
import laccan.gatewayApp.Server;
import laccan.persistence.StorageCSV;
import net.tinyos.message.Message;
import net.tinyos.message.MessageListener;
import net.tinyos.message.MoteIF;
import net.tinyos.packet.BuildSource;
import net.tinyos.packet.PhoenixSource;
import net.tinyos.util.PrintStreamMessenger;

public class Micaz implements MessageListener  {

	private static String nativeLibraryPath =
			System.getProperty("user.dir") + "/sense_lib/native/Linux/x86_64-unknown-linux-gnu/";

	//	static {
	////		System.load(nativeLibraryPath + "libgetenv.so");
	////		System.load(nativeLibraryPath + "libtoscomm.so");
	//	}

	private PhoenixSource phoenix;
	private MoteIF mif;	
	private long msDate;
	
	 //nodeID
	private int nodeID;
	private int nodeLimit;

	//Current node voltage (in millivolt)
	private double voltage;
	
	private double[] temperatures = new double[10];
	
	//Node location
	private String environment;

	public Micaz(final String source){
		phoenix = BuildSource.makePhoenix(source, PrintStreamMessenger.err);
		mif = new MoteIF(phoenix);
		mif.registerListener(new MicazMsg(),this);
	}

	public void messageReceived(int dest_addr, Message msg) {
		msDate = System.currentTimeMillis();	//Get current date
		processPacket(msg);
		try {
			printData(); //Display sensor data
		} catch (IOException e) {
			e.printStackTrace();
		}
//		Server.saveData(toServerString(msg)); //Send to cloud
	}
	
//	public void sendPackets() {
//		int counter = 0;
//		MicazMsg payload = new MicazMsg();
//
//		try {
//			while (true) {
//				System.out.println("Sending packet " + counter);
//				payload.set_nodeAndLimit_nodeid(230);
//				payload.set_nodeAndLimit_limit(750);
//
//				mif.send(230, payload);
//				counter++;
//				try {Thread.sleep(1000);}
//				catch (InterruptedException exception) {}
//			}
//		}
//		catch (IOException exception) {
//			System.err.println("Exception thrown when sending packets. Exiting.");
//			System.err.println(exception);
//		}
//	}
	
	private void processPacket(Message message) {
		if(message instanceof MicazMsg) {
			//Get packet
			MicazMsg tempMessage = (MicazMsg) message;
						
			nodeID = tempMessage.get_NodeID();
//			nodeLimit = tempMessage.get_nodeAndLimit_limit();
//			System.out.println(nodeID);
						
			try {
				environment = EnvironmentMonitor.environments[(nodeID - 1)/ 5];
			} catch (ArrayIndexOutOfBoundsException e) {
				environment = "unknownEnvironment";
				System.out.println("Unexpected environment id error.");
			}
			
			for(int i = 0; i < tempMessage.get_Buffer().length; i++) {
				temperatures[i] = 
						calculateSensirion(tempMessage.getElement_Buffer(i), 0)[0];
			}
			
			voltage =
					(1223 * 1024)/tempMessage.get_Voltage();
			return;
		}
		System.out.println("Unable to process packet.");
		return;
	}

	private double calculateTaosLight(int visibleLight, int infraredLight) {
		final int CHORD_VAL[] = {0,16,49,115,247,511,1039,2095};
		final int STEP_VAL[] = {1,2,4,8,16,32,64,128};
		int chordNumber, stepNumber, ch0Counts, ch1Counts;

		chordNumber = (visibleLight>>4) & 7;
		stepNumber = visibleLight & 15;
		ch0Counts = CHORD_VAL[chordNumber] + stepNumber * STEP_VAL[chordNumber];

		chordNumber = (infraredLight>>4) & 7;
		stepNumber = infraredLight & 15;
		ch1Counts = CHORD_VAL[chordNumber] + stepNumber * STEP_VAL[chordNumber];

		double pConst = -3.13 * ch1Counts/ch0Counts;
		return ch0Counts * 0.46 * Math.exp(pConst);
	}

	private double[] calculateSensirion(int Temperature, int Humidity){
		double [] converted = new double[2];
		converted[0] = -39.4+(0.01*(double)Temperature);
		converted[1] = (-2.0468+0.0367*(double)Humidity-0.0000015955*Math.pow((double)Humidity,(double )2))
				+ (converted[0]-25)*(0.01+0.00008*(double)Humidity);
		return converted;
	}	
	
	@SuppressWarnings("unused")
	private void printData() throws IOException {
		System.out.println("Measured micaz data:");
		System.out.println();
		System.out.println("Node:                   " + nodeID);
		System.out.println("NodeType:               " + "micaz");
		System.out.println("Environment id:\t\t" + environment);
		System.out.println("NodeLimit:              " + nodeLimit);
		StorageCSV storageCSV = new StorageCSV();
		File f = new File("full.csv");
		for (int i = 0; i < 8; i++) {
			storageCSV
					.local("full.csv")
					.save(new String[]{String.valueOf((msDate - i * 8000)), String.valueOf(temperatures[i])});
			System.out.println("Temperature " + i + ":\t\t" + temperatures[i]);

		}
		for (int i = 8; i < 10; i++) {
			storageCSV
					.local("reduce.csv")
				.save(new String[]{String.valueOf((msDate - (i - 4) * 8000)), String.valueOf(temperatures[i])});
			System.out.println("Temperature " + i + ":\t\t" + temperatures[i]);
	}

		System.out.println("Voltage:                " + voltage);
		System.out.println("date:\t\t\t" + msDate);
	}
	
	@SuppressWarnings("unused")
	private void toCSVFile() {
		
	}
	
	//Save sensor data to a formatted server string
	@SuppressWarnings("unused")
	private String toServerString(Message message) {
		String data = String.format("nodeID=%s&nodeType=%s&"
				+ "env_id=%s&sensirion_temp=%s&sensirion_hum=%s&"
				+ "intersema_temp=%s&intersema_press=%s&light=%s&"
				+ "voltage=%s&country=%s&state=%s&city=%s&"
				+ "latitude=%s&longitude=%s&"
				+ "date=%s",
				nodeID,"micaz", environment,
//				temperatureHumidity[0], temperatureHumidity[1],
//				temperaturePressure[0], temperaturePressure[1], light,
				voltage, "Brazil", "Alagoas", "Maceio",
				"-9.555032", "-35.774708",
				msDate);
		return data;
	}
}