package laccan;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test001");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (byte) 10, (int) 'a');
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test002");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, (long) 0);
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg2, (long) (byte) 10);
        sample7.setDate(1L);
        long long10 = sample7.getDate();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test003");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(256, 52);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 64, 65);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        micazMsg8.set_Voltage((int) '#');
        micazMsg8.amTypeSet(52);
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray17, 48);
        micazMsg8.dataSet(byteArray17);
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray17, (int) '#');
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray17);
        micazMsg6.dataSet(byteArray17);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray17);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test004");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        memory0.build();
        java.lang.Class<?> wildcardClass10 = memory0.getClass();
        int int11 = memory0.length();
        laccan.memory.Container container12 = memory0.getMemory();
        laccan.memory.Container container13 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(container12);
        org.junit.Assert.assertNotNull(container13);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test005");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(32, (-30));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test006");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        java.lang.String str7 = sample4.toString();
        sample4.setTemperature((double) (short) 10);
        laccan.devices.Type type10 = sample4.getType();
        double double11 = sample4.getDateDouble();
        java.lang.String[] strArray12 = sample4.toCSV();
        java.lang.String str13 = sample4.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null;-19.699999999999996;0" + "'", str7.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null;10.0;0" + "'", str13.equals("null;10.0;0"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test007");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone(2);
        byte[] byteArray10 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray10);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray10);
        int int14 = micazMsg13.amType();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg13, 16, (-139));
        short[] shortArray18 = micazMsg13.get_Buffer();
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg13);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 172 + "'", int14 == 172);
        org.junit.Assert.assertNotNull(shortArray18);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test008");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg7.set_Buffer(shortArray13);
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg7);
        laccan.devices.Sample sample16 = new laccan.devices.Sample();
        laccan.devices.Type type17 = laccan.devices.Type.FULL;
        sample16.setType(type17);
        sample15.setType(type17);
        sample5.setType(type17);
        java.lang.String[] strArray21 = sample5.toCSV();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + type17 + "' != '" + laccan.devices.Type.FULL + "'", type17.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test009");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        short short12 = micazMsg1.getElement_Buffer(0);
        int int13 = micazMsg1.dataLength();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj17 = micazMsg16.clone();
        int int18 = micazMsg16.get_NodeID();
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg16, (long) (byte) -1);
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray23 = micazMsg22.get_Buffer();
        java.lang.Object obj24 = micazMsg22.clone();
        java.lang.String str25 = micazMsg22.toString();
        short[] shortArray26 = micazMsg22.get_Buffer();
        micazMsg16.set_Buffer(shortArray26);
        micazMsg1.set_Buffer(shortArray26);
        java.lang.Object obj29 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket30 = micazMsg1.getSerialPacket();
        try {
            laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) serialPacket30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str25.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(serialPacket30);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test010");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        laccan.devices.Type type6 = laccan.devices.Type.FULL;
        sample4.setType(type6);
        sample4.setNode("reduction");
        java.lang.String str10 = sample4.toString();
        sample4.setNode("reduction;-19.699999999999996;0");
        sample4.setTemperature((double) (-1L));
        double double15 = sample4.getDateDouble();
        sample4.setTemperature((double) (byte) 1);
        long long18 = sample4.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "reduction;-19.699999999999996;0" + "'", str10.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test011");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(3, 128);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test012");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        laccan.devices.Type type6 = laccan.devices.Type.FULL;
        sample4.setType(type6);
        sample4.setNode("reduction");
        java.lang.String str10 = sample4.toString();
        sample4.setNode("reduction;-19.699999999999996;0");
        sample4.setTemperature((double) (-1L));
        laccan.devices.Type type15 = sample4.getType();
        double double16 = sample4.getTemperature();
        laccan.devices.Sample sample17 = new laccan.devices.Sample();
        laccan.devices.Type type18 = laccan.devices.Type.FULL;
        sample17.setType(type18);
        sample4.setType(type18);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "reduction;-19.699999999999996;0" + "'", str10.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + laccan.devices.Type.FULL + "'", type15.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + laccan.devices.Type.FULL + "'", type18.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test013");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        micazMsg1.amTypeSet(52);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        int int7 = micazMsg1.get_NodeID();
        int int8 = micazMsg1.baseOffset();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test014");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(52, 0);
        int int3 = micazMsg2.baseOffset();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg2.getSerialPacket();
        try {
            int int5 = serialPacket4.amType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(serialPacket4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test015");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) (byte) 100);
        micazMsg1.amTypeSet(2);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        byte[] byteArray10 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray10, 6);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray10, 2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test016");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone(2);
        byte[] byteArray10 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray10);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg11, 10, (int) (byte) 0);
        java.lang.String str15 = micazMsg14.toString();
        try {
            laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg14, 512L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str15.equals("Message <MicazMsg> \n  [Buffer="));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test017");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        int int13 = micazMsg1.get_Voltage();
        micazMsg1.set_Voltage(100);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (-1), (int) (byte) -1);
        int int19 = micazMsg1.get_Voltage();
        java.lang.String str20 = micazMsg1.toString();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (short) 1, 0);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) '4');
        micazMsg25.set_Voltage((int) '#');
        micazMsg25.amTypeSet(52);
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg(byteArray34, 48);
        micazMsg25.dataSet(byteArray34);
        byte[] byteArray38 = micazMsg25.dataGet();
        laccan.devices.MicazMsg micazMsg41 = new laccan.devices.MicazMsg(byteArray38, (int) (byte) -1, (int) ' ');
        micazMsg1.dataSet(byteArray38);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x64]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 " + "'", str20.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x64]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 "));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertNotNull(byteArray38);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test018");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(24, (int) (byte) 10);
        int int3 = micazMsg2.amType();
        net.tinyos.message.Message message5 = micazMsg2.clone(6);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = micazMsg7.get_Buffer();
        java.lang.Object obj9 = micazMsg7.clone();
        micazMsg7.set_NodeID(20);
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray14);
        micazMsg7.dataSet(byteArray14);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray14, 0);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray14, 10);
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray14, (int) (byte) 10);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray14);
        message5.dataSet(byteArray14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 172 + "'", int3 == 172);
        org.junit.Assert.assertNotNull(message5);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(byteArray14);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test019");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.Container container3 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg5.set_Buffer(shortArray11);
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg5);
        java.lang.String[] strArray14 = sample13.toCSV();
        sample13.setNode("hi!");
        memory0.add(sample13);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = micazMsg19.get_Buffer();
        java.lang.Object obj21 = micazMsg19.clone();
        laccan.devices.Sample sample22 = new laccan.devices.Sample(micazMsg19);
        long long23 = sample22.getDate();
        java.lang.Class<?> wildcardClass24 = sample22.getClass();
        java.lang.String str25 = sample22.toString();
        java.lang.String str26 = sample22.toString();
        memory0.add(sample22);
        double double28 = sample22.getDateDouble();
        double double29 = sample22.getTemperature();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "null;-19.699999999999996;0" + "'", str25.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "null;-19.699999999999996;0" + "'", str26.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-19.699999999999996d) + "'", double29 == (-19.699999999999996d));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test020");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        int int3 = micazMsg1.get_NodeID();
        java.lang.Object obj4 = micazMsg1.clone();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        micazMsg6.set_NodeID(20);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray13);
        micazMsg6.dataSet(byteArray13);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray13, 0);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg17, (int) (short) 0);
        int int20 = micazMsg1.dataLength();
        micazMsg1.amTypeSet(2);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray25 = micazMsg24.get_Buffer();
        micazMsg24.setElement_Buffer(0, (short) 10);
        micazMsg24.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray33 = micazMsg32.get_Buffer();
        java.lang.Object obj34 = micazMsg32.clone();
        int int35 = micazMsg32.get_NodeID();
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg39 = new laccan.devices.MicazMsg(byteArray38);
        laccan.devices.MicazMsg micazMsg41 = new laccan.devices.MicazMsg(byteArray38, 2);
        micazMsg32.dataSet(byteArray38);
        micazMsg24.dataSet(byteArray38);
        laccan.devices.MicazMsg micazMsg45 = new laccan.devices.MicazMsg(byteArray38, (int) (short) 1);
        laccan.devices.MicazMsg micazMsg46 = new laccan.devices.MicazMsg(byteArray38);
        try {
            micazMsg1.dataSet(byteArray38, (int) 'a', 51, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteArray38);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test021");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        sample4.setDate((long) '#');
        long long7 = sample4.getDate();
        sample4.setDate(0L);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test022");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(172, (int) '4');
        net.tinyos.message.SerialPacket serialPacket3 = micazMsg2.getSerialPacket();
        org.junit.Assert.assertNull(serialPacket3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test023");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        int int13 = micazMsg12.baseOffset();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg12, (int) (byte) -1, 1);
        try {
            laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg16, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset -1, data_length 35 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test024");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        net.tinyos.message.Message message9 = micazMsg7.clone(52);
        micazMsg7.set_Voltage((int) '4');
        int int12 = micazMsg7.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 24 + "'", int12 == 24);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test025");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(2, (int) ' ');
        int int3 = micazMsg2.amType();
        micazMsg2.set_NodeID(12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 172 + "'", int3 == 172);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test026");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        java.lang.Object obj5 = micazMsg1.clone();
        int int6 = micazMsg1.baseOffset();
        micazMsg1.init(52);
        micazMsg1.set_Voltage(51);
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg1);
        java.lang.String[] strArray12 = sample11.toCSV();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test027");
        laccan.devices.Sample sample0 = new laccan.devices.Sample();
        double double1 = sample0.getDateDouble();
        double double2 = sample0.getDateDouble();
        sample0.setTemperature((double) 1);
        laccan.devices.Type type5 = sample0.getType();
        double double6 = sample0.getDateDouble();
        java.lang.String str7 = sample0.toString();
        double double8 = sample0.getTemperature();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null;1.0;0" + "'", str7.equals("null;1.0;0"));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test028");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(512, 16);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test029");
        byte[] byteArray0 = null;
        try {
            laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray0, 96, 172);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test030");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 512);
        micazMsg2.set_Voltage(16);
        byte[] byteArray9 = micazMsg2.dataGet();
        java.lang.String str10 = micazMsg2.toString();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg2, (long) 172);
        micazMsg2.amTypeSet((int) (byte) 0);
        java.lang.String str15 = micazMsg2.toString();
        try {
            short short17 = micazMsg2.getElement_Buffer((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str10.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str15.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test031");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.dataLength();
        net.tinyos.message.SerialPacket serialPacket3 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (byte) 10);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg7.set_Buffer(shortArray13);
        micazMsg7.init(16);
        short short18 = micazMsg7.getElement_Buffer(2);
        int int19 = micazMsg7.get_Voltage();
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray22 = micazMsg21.get_Buffer();
        java.lang.Object obj23 = micazMsg21.clone();
        micazMsg21.set_NodeID(20);
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray28);
        micazMsg21.dataSet(byteArray28);
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg(byteArray28, 0);
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg(byteArray28, 10);
        micazMsg7.dataSet(byteArray28);
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg(byteArray28);
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray39 = micazMsg38.get_Buffer();
        java.lang.Object obj40 = micazMsg38.clone();
        int int41 = micazMsg38.get_NodeID();
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg45 = new laccan.devices.MicazMsg(byteArray44);
        laccan.devices.MicazMsg micazMsg47 = new laccan.devices.MicazMsg(byteArray44, 2);
        micazMsg38.dataSet(byteArray44);
        int int49 = micazMsg38.baseOffset();
        byte[] byteArray50 = micazMsg38.dataGet();
        micazMsg36.dataSet(byteArray50);
        micazMsg1.dataSet(byteArray50);
        laccan.devices.MicazMsg micazMsg54 = new laccan.devices.MicazMsg(byteArray50, 1);
        java.lang.String str55 = micazMsg54.toString();
        micazMsg54.set_Voltage(12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNull(serialPacket3);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str55.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test032");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        memory0.build();
        laccan.memory.Container container10 = memory0.getMemory();
        laccan.memory.Container container11 = memory0.getMemory();
        java.util.List<laccan.devices.Sample> sampleList12 = container11.get();
        java.util.List<java.lang.Double> doubleList13 = laccan.cloud.prediction.Regression.makeTests(sampleList12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertNotNull(sampleList12);
        org.junit.Assert.assertNotNull(doubleList13);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test033");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(3);
        micazMsg1.set_NodeID((int) ' ');
        try {
            short[] shortArray4 = micazMsg1.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 3 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test034");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        java.util.List<laccan.devices.Sample> sampleList6 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV8 = storageCSV4.local("");
        laccan.devices.Sample sample12 = new laccan.devices.Sample("memory", (double) (byte) -1, (long) ' ');
        java.lang.String str13 = sample12.toString();
        java.lang.String[] strArray14 = sample12.toCSV();
        storageCSV8.save(strArray14);
        laccan.persistence.StorageCSV storageCSV17 = storageCSV8.local("memory;-1.0;32");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "memory;-1.0;32" + "'", str13.equals("memory;-1.0;32"));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(storageCSV17);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test035");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        memory0.build();
        laccan.memory.Container container10 = memory0.getMemory();
        memory0.build();
        laccan.memory.Container container12 = memory0.getMemory();
        memory0.build();
        memory0.build();
        laccan.memory.Container container15 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        java.lang.String str20 = micazMsg17.toString();
        short[] shortArray21 = micazMsg17.get_Buffer();
        byte[] byteArray22 = micazMsg17.dataGet();
        java.lang.Object obj23 = micazMsg17.clone();
        net.tinyos.message.Message message25 = micazMsg17.clone(2);
        byte[] byteArray26 = micazMsg17.dataGet();
        java.lang.Class<?> wildcardClass27 = micazMsg17.getClass();
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg17, (long) (short) 100);
        laccan.devices.Sample sample30 = new laccan.devices.Sample(micazMsg17);
        memory0.add(sample30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container12);
        org.junit.Assert.assertNotNull(container15);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str20.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(message25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test036");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 4, (long) 2, 112);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test037");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        byte[] byteArray7 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, (int) (short) -1);
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.String str12 = micazMsg10.toString();
        java.lang.Object obj13 = micazMsg10.clone();
        net.tinyos.message.SerialPacket serialPacket14 = micazMsg10.getSerialPacket();
        try {
            laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) serialPacket14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(serialPacket14);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test038");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        int int10 = micazMsg1.get_NodeID();
        try {
            short short12 = micazMsg1.getElement_Buffer(160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test039");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 1, (-1));
        try {
            short[] shortArray8 = micazMsg7.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length -1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test040");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        net.tinyos.message.Message message6 = micazMsg2.clone((int) '4');
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg2);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        java.lang.Object obj11 = micazMsg9.clone();
        int int12 = micazMsg9.get_NodeID();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray15);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray15, 2);
        micazMsg9.dataSet(byteArray15);
        int int20 = micazMsg9.baseOffset();
        micazMsg9.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg9, (int) (short) 10);
        byte[] byteArray25 = micazMsg9.dataGet();
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray25);
        micazMsg2.dataSet(byteArray25);
        int int28 = micazMsg2.dataLength();
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test041");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone(2);
        byte[] byteArray10 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray10);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray10);
        int int13 = micazMsg12.baseOffset();
        micazMsg12.amTypeSet((int) (byte) -1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test042");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("memory");
        java.lang.String[] strArray8 = laccan.devices.helper.utils.Assistant.environments;
        storageCSV4.save(strArray8);
        java.util.List<laccan.devices.Sample> sampleList10 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV12 = storageCSV4.local("result");
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = micazMsg14.get_Buffer();
        java.lang.Object obj16 = micazMsg14.clone();
        laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg14);
        long long18 = sample17.getDate();
        laccan.devices.Type type19 = laccan.devices.Type.FULL;
        sample17.setType(type19);
        sample17.setNode("reduction");
        java.lang.String str23 = sample17.toString();
        sample17.setNode("reduction;-19.699999999999996;0");
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray28 = micazMsg27.get_Buffer();
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg27);
        int int30 = micazMsg27.dataLength();
        micazMsg27.init((int) '4');
        laccan.devices.Sample sample33 = new laccan.devices.Sample(micazMsg27);
        double double34 = sample33.getDateDouble();
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray42 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg36.set_Buffer(shortArray42);
        laccan.devices.Sample sample44 = new laccan.devices.Sample(micazMsg36);
        laccan.devices.Sample sample45 = new laccan.devices.Sample();
        laccan.devices.Type type46 = laccan.devices.Type.FULL;
        sample45.setType(type46);
        sample44.setType(type46);
        sample44.setTemperature((double) 'a');
        laccan.devices.Type type51 = sample44.getType();
        sample33.setType(type51);
        laccan.devices.MicazMsg micazMsg54 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray55 = micazMsg54.get_Buffer();
        laccan.devices.Sample sample56 = new laccan.devices.Sample(micazMsg54);
        int int57 = micazMsg54.dataLength();
        micazMsg54.init((int) '4');
        laccan.devices.Sample sample60 = new laccan.devices.Sample(micazMsg54);
        double double61 = sample60.getDateDouble();
        laccan.devices.MicazMsg micazMsg63 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray69 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg63.set_Buffer(shortArray69);
        laccan.devices.Sample sample71 = new laccan.devices.Sample(micazMsg63);
        laccan.devices.Sample sample72 = new laccan.devices.Sample();
        laccan.devices.Type type73 = laccan.devices.Type.FULL;
        sample72.setType(type73);
        sample71.setType(type73);
        sample71.setTemperature((double) 'a');
        laccan.devices.Type type78 = sample71.getType();
        sample60.setType(type78);
        sample33.setType(type78);
        sample17.setType(type78);
        java.lang.String[] strArray82 = sample17.toCSV();
        storageCSV4.save(strArray82);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(sampleList10);
        org.junit.Assert.assertNotNull(storageCSV12);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + laccan.devices.Type.FULL + "'", type19.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "reduction;-19.699999999999996;0" + "'", str23.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertTrue("'" + type46 + "' != '" + laccan.devices.Type.FULL + "'", type46.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type51 + "' != '" + laccan.devices.Type.FULL + "'", type51.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 52 + "'", int57 == 52);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertTrue("'" + type73 + "' != '" + laccan.devices.Type.FULL + "'", type73.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type78 + "' != '" + laccan.devices.Type.FULL + "'", type78.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(strArray82);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test043");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        micazMsg1.amTypeSet(512);
        net.tinyos.message.SerialPacket serialPacket8 = micazMsg1.getSerialPacket();
        java.lang.Class<?> wildcardClass9 = micazMsg1.getClass();
        net.tinyos.message.SerialPacket serialPacket10 = micazMsg1.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(serialPacket10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test044");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        memory0.build();
        laccan.memory.Container container10 = memory0.getMemory();
        laccan.memory.Container container11 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        micazMsg13.set_NodeID(20);
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg13);
        memory0.add(sample18);
        memory0.build();
        int int21 = memory0.length();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = micazMsg23.get_Buffer();
        java.lang.Object obj25 = micazMsg23.clone();
        micazMsg23.amTypeSet(20);
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg23);
        java.lang.Object obj29 = micazMsg23.clone();
        net.tinyos.message.Message message31 = micazMsg23.clone((int) ' ');
        laccan.devices.Sample sample32 = new laccan.devices.Sample(micazMsg23);
        sample32.setTemperature(16.0d);
        memory0.add(sample32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(message31);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test045");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        int int3 = micazMsg1.get_NodeID();
        java.lang.Object obj4 = micazMsg1.clone();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        micazMsg6.set_NodeID(20);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray13);
        micazMsg6.dataSet(byteArray13);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray13, 0);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg17, (int) (short) 0);
        int int20 = micazMsg1.dataLength();
        micazMsg1.amTypeSet(2);
        micazMsg1.set_Voltage(1);
        java.lang.String str25 = micazMsg1.toString();
        micazMsg1.set_NodeID((int) (byte) 100);
        int int28 = micazMsg1.amType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x1]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str25.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x1]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test046");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        int int9 = memory0.length();
        laccan.memory.Container container10 = memory0.getMemory();
        laccan.memory.Memory memory11 = new laccan.memory.Memory();
        memory11.build();
        int int13 = memory11.length();
        laccan.memory.data.reduction.KeepingAll keepingAll14 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample15 = new laccan.devices.Sample();
        keepingAll14.add(sample15);
        sample15.setDate(10L);
        memory11.add(sample15);
        memory0.add(sample15);
        memory0.build();
        laccan.memory.Container container22 = memory0.getMemory();
        memory0.build();
        int int24 = memory0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(container22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test047");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.699999999999996;0", (double) 0.0f, (long) (short) 100);
        java.lang.String str4 = sample3.getNode();
        java.lang.String str5 = sample3.getNode();
        java.lang.String[] strArray6 = sample3.toCSV();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null;-19.699999999999996;0" + "'", str4.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null;-19.699999999999996;0" + "'", str5.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test048");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg(byteArray2, 16);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        int int7 = micazMsg6.dataLength();
        try {
            short[] shortArray8 = micazMsg6.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test049");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        java.lang.String str7 = sample4.toString();
        java.lang.String str8 = sample4.toString();
        sample4.setDate(32L);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null;-19.699999999999996;0" + "'", str7.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null;-19.699999999999996;0" + "'", str8.equals("null;-19.699999999999996;0"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test050");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll2 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll2.get();
        laccan.cloud.prediction.Regression regression4 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        laccan.devices.Sample sample10 = new laccan.devices.Sample();
        laccan.devices.Sample sample11 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray12 = new laccan.devices.Sample[] { sample9, sample10, sample11 };
        java.util.ArrayList<laccan.devices.Sample> sampleList13 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList13, sampleArray12);
        java.util.List<java.lang.Double> doubleList15 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList13);
        java.util.List<java.lang.Double> doubleList16 = regression4.result(doubleList15);
        regression0.init(sampleList3, doubleList15);
        double double18 = regression0.mse();
        double double19 = regression0.mse();
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(sampleArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals((double) double18, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double19, Double.NaN, 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test051");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 116, 1L, 172);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test052");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        double double7 = sample6.getTemperature();
        java.lang.String str8 = sample6.toString();
        long long9 = sample6.getDate();
        java.lang.String[] strArray10 = sample6.toCSV();
        java.lang.String str11 = sample6.getNode();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-19.699999999999996d) + "'", double7 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null;-19.699999999999996;0" + "'", str8.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test053");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        int int6 = micazMsg1.get_Voltage();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg1, (long) (byte) 0);
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray11);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray11, 2);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray11);
        micazMsg15.set_NodeID((int) (byte) 10);
        byte[] byteArray18 = micazMsg15.dataGet();
        int int19 = micazMsg15.dataLength();
        net.tinyos.message.SerialPacket serialPacket20 = micazMsg15.getSerialPacket();
        micazMsg15.amTypeSet(52);
        int int23 = micazMsg15.dataLength();
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg15, 10);
        micazMsg15.set_NodeID(2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNull(serialPacket20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test054");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, 2);
        micazMsg1.dataSet(byteArray7);
        int int12 = micazMsg1.baseOffset();
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (short) 10);
        int int17 = micazMsg16.amType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 172 + "'", int17 == 172);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test055");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray6, (int) (short) 100);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray6, (int) (byte) 1);
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg11);
        int int13 = micazMsg11.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test056");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 10);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (short) 1);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        int int16 = micazMsg13.get_NodeID();
        micazMsg13.setElement_Buffer(1, (short) (byte) 0);
        micazMsg13.amTypeSet(0);
        micazMsg13.set_NodeID((int) (byte) -1);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg13, 16);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(512);
        byte[] byteArray28 = micazMsg27.dataGet();
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray28);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg(byteArray28, (int) (byte) 1);
        micazMsg13.dataSet(byteArray28);
        micazMsg11.dataSet(byteArray28);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test057");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        java.lang.String str6 = sample5.getNode();
        java.lang.String str7 = sample5.getNode();
        java.lang.String str8 = sample5.getNode();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test058");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        int int8 = micazMsg1.get_NodeID();
        int int9 = micazMsg1.baseOffset();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test059");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        java.lang.Class<?> wildcardClass6 = sample4.getClass();
        java.lang.String str7 = sample4.toString();
        java.lang.String str8 = sample4.getNode();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null;-19.699999999999996;0" + "'", str7.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test060");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        micazMsg1.set_Voltage(20);
        byte[] byteArray11 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray11, 6);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(byteArray11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test061");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray3 = micazMsg2.get_Buffer();
        java.lang.Object obj4 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2);
        laccan.devices.Type type6 = null;
        sample5.setType(type6);
        keepingAll0.add(sample5);
        sample5.setDate((long) (byte) 100);
        sample5.setDate((long) 32);
        long long13 = sample5.getDate();
        java.lang.String str14 = sample5.getNode();
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test062");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '#');
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test063");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        memory0.build();
        int int3 = memory0.length();
        int int4 = memory0.length();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        laccan.devices.Type type10 = null;
        sample9.setType(type10);
        laccan.devices.Type type12 = null;
        sample9.setType(type12);
        sample9.setNode("hi!");
        memory0.add(sample9);
        laccan.memory.Container container17 = memory0.getMemory();
        memory0.build();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = micazMsg20.get_Buffer();
        java.lang.Object obj22 = micazMsg20.clone();
        laccan.devices.Sample sample23 = new laccan.devices.Sample(micazMsg20);
        laccan.devices.Type type24 = null;
        sample23.setType(type24);
        laccan.devices.Type type26 = null;
        sample23.setType(type26);
        java.lang.String str28 = sample23.toString();
        java.lang.String[] strArray29 = sample23.toCSV();
        memory0.add(sample23);
        java.lang.String[] strArray31 = sample23.toCSV();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(container17);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "null;-19.699999999999996;0" + "'", str28.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test064");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        short[] shortArray10 = micazMsg1.get_Buffer();
        net.tinyos.message.Message message12 = micazMsg1.clone((int) (byte) 0);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = micazMsg14.get_Buffer();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg14);
        int int17 = micazMsg14.dataLength();
        micazMsg14.init((int) '4');
        micazMsg14.init((int) '4');
        micazMsg14.amTypeSet(160);
        byte[] byteArray24 = micazMsg14.dataGet();
        micazMsg1.dataSet(byteArray24);
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg1);
        int int27 = micazMsg1.dataLength();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(message12);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test065");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray3 = micazMsg2.dataGet();
        micazMsg2.set_Voltage((int) (short) 0);
        net.tinyos.message.SerialPacket serialPacket6 = micazMsg2.getSerialPacket();
        short[] shortArray7 = micazMsg2.get_Buffer();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNull(serialPacket6);
        org.junit.Assert.assertNotNull(shortArray7);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test066");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5);
        laccan.devices.Type type9 = null;
        sample8.setType(type9);
        laccan.devices.Type type11 = null;
        sample8.setType(type11);
        sample8.setNode("hi!");
        keepingAll0.add(sample8);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg17);
        laccan.devices.Type type21 = null;
        sample20.setType(type21);
        java.lang.String str23 = sample20.toString();
        java.lang.String str24 = sample20.getNode();
        keepingAll0.add(sample20);
        java.util.List<laccan.devices.Sample> sampleList26 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList27 = keepingAll0.get();
        int int28 = keepingAll0.length();
        laccan.devices.Sample sample32 = new laccan.devices.Sample("memory", (double) (byte) -1, (long) ' ');
        java.lang.String str33 = sample32.toString();
        java.lang.String[] strArray34 = sample32.toCSV();
        double double35 = sample32.getTemperature();
        keepingAll0.add(sample32);
        java.lang.String[] strArray37 = sample32.toCSV();
        sample32.setTemperature((double) 128);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "null;-19.699999999999996;0" + "'", str23.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(sampleList26);
        org.junit.Assert.assertNotNull(sampleList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "memory;-1.0;32" + "'", str33.equals("memory;-1.0;32"));
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertNotNull(strArray37);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test067");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.Container container3 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg5.set_Buffer(shortArray11);
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg5);
        java.lang.String[] strArray14 = sample13.toCSV();
        sample13.setNode("hi!");
        memory0.add(sample13);
        laccan.memory.Container container18 = memory0.getMemory();
        laccan.memory.Container container19 = memory0.getMemory();
        int int20 = memory0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(container18);
        org.junit.Assert.assertNotNull(container19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test068");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        java.lang.Class<?> wildcardClass6 = sample4.getClass();
        java.lang.String str7 = sample4.toString();
        java.lang.String[] strArray8 = sample4.toCSV();
        laccan.devices.Type type9 = sample4.getType();
        laccan.devices.Type type10 = sample4.getType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null;-19.699999999999996;0" + "'", str7.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(type9);
        org.junit.Assert.assertNull(type10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test069");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 10, 10);
        net.tinyos.message.Message message4 = micazMsg2.clone((int) (byte) 10);
        java.lang.String str5 = micazMsg2.toString();
        micazMsg2.amTypeSet(12);
        java.lang.String str8 = micazMsg2.toString();
        org.junit.Assert.assertNotNull(message4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 " + "'", str5.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 "));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 " + "'", str8.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 "));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test070");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        int int9 = micazMsg1.get_Voltage();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg1, (long) 20);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 5);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test071");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.lang.String[] strArray10 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV4.save(strArray10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        int int14 = micazMsg13.dataLength();
        net.tinyos.message.SerialPacket serialPacket15 = micazMsg13.getSerialPacket();
        laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg13, (long) (byte) 10);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj21 = micazMsg20.clone();
        laccan.devices.Sample sample23 = new laccan.devices.Sample(micazMsg20, (long) 0);
        java.lang.String str24 = sample23.getNode();
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray27 = micazMsg26.get_Buffer();
        java.lang.Object obj28 = micazMsg26.clone();
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg26);
        long long30 = sample29.getDate();
        java.lang.Class<?> wildcardClass31 = sample29.getClass();
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray34 = micazMsg33.get_Buffer();
        java.lang.Object obj35 = micazMsg33.clone();
        laccan.devices.Sample sample36 = new laccan.devices.Sample(micazMsg33);
        long long37 = sample36.getDate();
        laccan.devices.Type type38 = laccan.devices.Type.FULL;
        sample36.setType(type38);
        sample29.setType(type38);
        sample23.setType(type38);
        sample17.setType(type38);
        java.lang.String[] strArray43 = sample17.toCSV();
        storageCSV4.save(strArray43);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNull(serialPacket15);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + type38 + "' != '" + laccan.devices.Type.FULL + "'", type38.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(strArray43);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test072");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) 0.0f, (long) (short) 1);
        sample3.setTemperature((double) (-1L));
        double double6 = sample3.getTemperature();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test073");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        storageCSV3.save(strArray4);
        storageCSV0.save(strArray4);
        laccan.persistence.StorageCSV storageCSV8 = storageCSV0.local("nodes");
        laccan.persistence.StorageCSV storageCSV10 = storageCSV0.local("init");
        laccan.persistence.StorageCSV storageCSV12 = storageCSV10.local("reduction;-19.699999999999996;0");
        laccan.persistence.StorageCSV storageCSV14 = storageCSV10.local("lastReading");
        laccan.persistence.StorageCSV storageCSV15 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV17 = storageCSV15.local("hi!");
        laccan.persistence.StorageCSV storageCSV19 = storageCSV17.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList20 = storageCSV19.read();
        laccan.persistence.StorageCSV storageCSV22 = storageCSV19.local("memory");
        laccan.persistence.StorageCSV storageCSV23 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV25 = storageCSV23.local("hi!");
        laccan.persistence.StorageCSV storageCSV27 = storageCSV25.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList28 = storageCSV27.read();
        java.util.List<laccan.devices.Sample> sampleList29 = storageCSV27.read();
        laccan.persistence.StorageCSV storageCSV31 = storageCSV27.local("");
        laccan.persistence.StorageCSV storageCSV32 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV34 = storageCSV32.local("hi!");
        laccan.persistence.StorageCSV storageCSV36 = storageCSV34.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList37 = storageCSV36.read();
        laccan.persistence.StorageCSV storageCSV39 = storageCSV36.local("memory");
        laccan.persistence.StorageCSV storageCSV40 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV42 = storageCSV40.local("hi!");
        laccan.persistence.StorageCSV storageCSV44 = storageCSV42.local("lastReading");
        java.lang.String[] strArray50 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV44.save(strArray50);
        storageCSV36.save(strArray50);
        storageCSV27.save(strArray50);
        storageCSV22.save(strArray50);
        storageCSV10.save(strArray50);
        laccan.persistence.StorageCSV storageCSV56 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV58 = storageCSV56.local("hi!");
        laccan.persistence.StorageCSV storageCSV60 = storageCSV58.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList61 = storageCSV60.read();
        laccan.persistence.StorageCSV storageCSV63 = storageCSV60.local("init");
        java.util.List<laccan.devices.Sample> sampleList64 = storageCSV60.read();
        laccan.memory.data.reduction.KeepingAll keepingAll65 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList66 = keepingAll65.get();
        int int67 = keepingAll65.length();
        java.util.List<laccan.devices.Sample> sampleList68 = keepingAll65.get();
        laccan.devices.MicazMsg micazMsg70 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray71 = micazMsg70.get_Buffer();
        java.lang.Object obj72 = micazMsg70.clone();
        laccan.devices.Sample sample73 = new laccan.devices.Sample(micazMsg70);
        laccan.devices.Type type74 = null;
        sample73.setType(type74);
        laccan.devices.Type type76 = null;
        sample73.setType(type76);
        sample73.setNode("hi!");
        keepingAll65.add(sample73);
        laccan.devices.Type type81 = sample73.getType();
        java.lang.String[] strArray82 = sample73.toCSV();
        storageCSV60.save(strArray82);
        storageCSV10.save(strArray82);
        laccan.persistence.StorageCSV storageCSV86 = storageCSV10.local("null;-19.699999999999996;512");
        java.util.List<laccan.devices.Sample> sampleList87 = storageCSV10.read();
        laccan.persistence.StorageCSV storageCSV89 = storageCSV10.local("null;-19.648499999999995;32");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV12);
        org.junit.Assert.assertNotNull(storageCSV14);
        org.junit.Assert.assertNotNull(storageCSV17);
        org.junit.Assert.assertNotNull(storageCSV19);
        org.junit.Assert.assertNotNull(sampleList20);
        org.junit.Assert.assertNotNull(storageCSV22);
        org.junit.Assert.assertNotNull(storageCSV25);
        org.junit.Assert.assertNotNull(storageCSV27);
        org.junit.Assert.assertNotNull(sampleList28);
        org.junit.Assert.assertNotNull(sampleList29);
        org.junit.Assert.assertNotNull(storageCSV31);
        org.junit.Assert.assertNotNull(storageCSV34);
        org.junit.Assert.assertNotNull(storageCSV36);
        org.junit.Assert.assertNotNull(sampleList37);
        org.junit.Assert.assertNotNull(storageCSV39);
        org.junit.Assert.assertNotNull(storageCSV42);
        org.junit.Assert.assertNotNull(storageCSV44);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(storageCSV58);
        org.junit.Assert.assertNotNull(storageCSV60);
        org.junit.Assert.assertNotNull(sampleList61);
        org.junit.Assert.assertNotNull(storageCSV63);
        org.junit.Assert.assertNotNull(sampleList64);
        org.junit.Assert.assertNotNull(sampleList66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(sampleList68);
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNull(type81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(storageCSV86);
        org.junit.Assert.assertNotNull(sampleList87);
        org.junit.Assert.assertNotNull(storageCSV89);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test074");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        laccan.devices.Type type6 = laccan.devices.Type.FULL;
        sample4.setType(type6);
        sample4.setNode("reduction");
        java.lang.String str10 = sample4.toString();
        sample4.setNode("reduction;-19.699999999999996;0");
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = micazMsg14.get_Buffer();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg14);
        int int17 = micazMsg14.dataLength();
        micazMsg14.init((int) '4');
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg14);
        double double21 = sample20.getDateDouble();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray29 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg23.set_Buffer(shortArray29);
        laccan.devices.Sample sample31 = new laccan.devices.Sample(micazMsg23);
        laccan.devices.Sample sample32 = new laccan.devices.Sample();
        laccan.devices.Type type33 = laccan.devices.Type.FULL;
        sample32.setType(type33);
        sample31.setType(type33);
        sample31.setTemperature((double) 'a');
        laccan.devices.Type type38 = sample31.getType();
        sample20.setType(type38);
        laccan.devices.MicazMsg micazMsg41 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray42 = micazMsg41.get_Buffer();
        laccan.devices.Sample sample43 = new laccan.devices.Sample(micazMsg41);
        int int44 = micazMsg41.dataLength();
        micazMsg41.init((int) '4');
        laccan.devices.Sample sample47 = new laccan.devices.Sample(micazMsg41);
        double double48 = sample47.getDateDouble();
        laccan.devices.MicazMsg micazMsg50 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray56 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg50.set_Buffer(shortArray56);
        laccan.devices.Sample sample58 = new laccan.devices.Sample(micazMsg50);
        laccan.devices.Sample sample59 = new laccan.devices.Sample();
        laccan.devices.Type type60 = laccan.devices.Type.FULL;
        sample59.setType(type60);
        sample58.setType(type60);
        sample58.setTemperature((double) 'a');
        laccan.devices.Type type65 = sample58.getType();
        sample47.setType(type65);
        sample20.setType(type65);
        sample4.setType(type65);
        java.lang.String[] strArray69 = sample4.toCSV();
        java.lang.String[] strArray70 = sample4.toCSV();
        double double71 = sample4.getTemperature();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "reduction;-19.699999999999996;0" + "'", str10.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertTrue("'" + type33 + "' != '" + laccan.devices.Type.FULL + "'", type33.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type38 + "' != '" + laccan.devices.Type.FULL + "'", type38.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertTrue("'" + type60 + "' != '" + laccan.devices.Type.FULL + "'", type60.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type65 + "' != '" + laccan.devices.Type.FULL + "'", type65.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-19.699999999999996d) + "'", double71 == (-19.699999999999996d));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test075");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(32, (int) (byte) 0);
        net.tinyos.message.Message message4 = micazMsg2.clone(10);
        try {
            laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 512, data_length 24 and data array size 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(message4);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test076");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray8, 10);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray8, (int) (byte) 10);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray8);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray8);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test077");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        java.util.List<laccan.devices.Sample> sampleList6 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV8 = storageCSV4.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x64]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 ");
        laccan.persistence.StorageCSV storageCSV10 = storageCSV4.local("reduction;-19.699999999999996;0;-1.0;0");
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        java.lang.String str15 = micazMsg12.toString();
        short[] shortArray16 = micazMsg12.get_Buffer();
        byte[] byteArray17 = micazMsg12.dataGet();
        java.lang.Object obj18 = micazMsg12.clone();
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg12);
        int int20 = micazMsg12.dataLength();
        int int21 = micazMsg12.baseOffset();
        laccan.devices.Sample sample22 = new laccan.devices.Sample(micazMsg12);
        double double23 = sample22.getDateDouble();
        java.lang.String[] strArray24 = sample22.toCSV();
        java.lang.Class<?> wildcardClass25 = strArray24.getClass();
        storageCSV10.save(strArray24);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str15.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test078");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        java.lang.String str7 = sample4.toString();
        java.lang.String str8 = sample4.getNode();
        java.lang.String[] strArray9 = sample4.toCSV();
        sample4.setTemperature((double) (-139L));
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null;-19.699999999999996;0" + "'", str7.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test079");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 20);
        byte[] byteArray11 = micazMsg10.dataGet();
        int int12 = micazMsg10.amType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 172 + "'", int12 == 172);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test080");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(2, (int) ' ');
        int int3 = micazMsg2.amType();
        net.tinyos.message.Message message5 = micazMsg2.clone((int) (short) 0);
        try {
            micazMsg2.set_Voltage(128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 172 + "'", int3 == 172);
        org.junit.Assert.assertNotNull(message5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test081");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        micazMsg1.amTypeSet(0);
        micazMsg1.set_NodeID((int) (byte) -1);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 16);
        java.lang.Object obj14 = micazMsg13.clone();
        short short16 = micazMsg13.getElement_Buffer((int) (short) 0);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg18.set_Buffer(shortArray24);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray28 = micazMsg27.get_Buffer();
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg27);
        int int30 = micazMsg27.get_NodeID();
        micazMsg27.amTypeSet((int) (byte) 100);
        micazMsg18.dataSet((net.tinyos.message.Message) micazMsg27, (int) (short) 0);
        int int35 = micazMsg18.dataLength();
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray38 = micazMsg37.get_Buffer();
        micazMsg37.setElement_Buffer(0, (short) 10);
        micazMsg37.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg45 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray46 = micazMsg45.get_Buffer();
        java.lang.Object obj47 = micazMsg45.clone();
        int int48 = micazMsg45.get_NodeID();
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg52 = new laccan.devices.MicazMsg(byteArray51);
        laccan.devices.MicazMsg micazMsg54 = new laccan.devices.MicazMsg(byteArray51, 2);
        micazMsg45.dataSet(byteArray51);
        micazMsg37.dataSet(byteArray51);
        micazMsg18.dataSet(byteArray51);
        laccan.devices.MicazMsg micazMsg58 = new laccan.devices.MicazMsg(byteArray51);
        micazMsg13.dataSet(byteArray51);
        laccan.devices.MicazMsg micazMsg60 = new laccan.devices.MicazMsg(byteArray51);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteArray51);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test082");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        int int2 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray5 = micazMsg4.get_Buffer();
        java.lang.Object obj6 = micazMsg4.clone();
        java.lang.String str7 = micazMsg4.toString();
        short[] shortArray8 = micazMsg4.get_Buffer();
        byte[] byteArray9 = micazMsg4.dataGet();
        java.lang.Object obj10 = micazMsg4.clone();
        net.tinyos.message.Message message12 = micazMsg4.clone(2);
        byte[] byteArray13 = micazMsg4.dataGet();
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray13);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg14, 10, (int) (byte) 0);
        int int18 = micazMsg14.dataLength();
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg14, 48);
        micazMsg1.set_Voltage(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(message12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test083");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        java.util.List<laccan.devices.Sample> sampleList6 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV8 = storageCSV4.local("");
        laccan.persistence.StorageCSV storageCSV10 = storageCSV8.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        laccan.persistence.StorageCSV storageCSV11 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV13 = storageCSV11.local("hi!");
        laccan.persistence.StorageCSV storageCSV14 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray15 = new java.lang.String[] {};
        storageCSV14.save(strArray15);
        storageCSV11.save(strArray15);
        laccan.persistence.StorageCSV storageCSV19 = storageCSV11.local("nodes");
        laccan.persistence.StorageCSV storageCSV21 = storageCSV11.local("init");
        java.util.List<laccan.devices.Sample> sampleList22 = storageCSV11.read();
        laccan.memory.data.reduction.KeepingAll keepingAll23 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample24 = new laccan.devices.Sample();
        keepingAll23.add(sample24);
        sample24.setTemperature((double) 0L);
        java.lang.String[] strArray28 = sample24.toCSV();
        storageCSV11.save(strArray28);
        storageCSV10.save(strArray28);
        java.lang.String[] strArray35 = new java.lang.String[] { "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n", "null;-19.699999999999996;0;-19.699999999999996;0", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "null;-19.699999999999996;0;-19.699999999999996;0" };
        storageCSV10.save(strArray35);
        laccan.persistence.StorageCSV storageCSV38 = storageCSV10.local("memory;2.0;-1");
        laccan.persistence.StorageCSV storageCSV40 = storageCSV10.local("null;-19.699999999999996;24");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(storageCSV19);
        org.junit.Assert.assertNotNull(storageCSV21);
        org.junit.Assert.assertNotNull(sampleList22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(storageCSV38);
        org.junit.Assert.assertNotNull(storageCSV40);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test084");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 10);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (short) 1);
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg1);
        java.lang.String[] strArray13 = sample12.toCSV();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test085");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample();
        laccan.devices.Type type11 = laccan.devices.Type.FULL;
        sample10.setType(type11);
        sample9.setType(type11);
        sample9.setTemperature((double) (short) 100);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test086");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg1);
        int int9 = micazMsg1.dataLength();
        try {
            micazMsg1.setElement_Buffer((int) (byte) 10, (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test087");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone((int) ' ');
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray12, 16);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray12);
        message9.dataSet(byteArray12);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray12, (int) ' ');
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray12, 4);
        try {
            short[] shortArray21 = micazMsg20.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length -2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test088");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(0);
        int int2 = micazMsg1.amType();
        net.tinyos.message.Message message4 = micazMsg1.clone((int) (byte) 1);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        micazMsg6.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg6, (int) (byte) 0);
        int int13 = micazMsg6.baseOffset();
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg6, (long) 100);
        micazMsg6.amTypeSet(10);
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg6);
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172 + "'", int2 == 172);
        org.junit.Assert.assertNotNull(message4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test089");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        storageCSV3.save(strArray4);
        storageCSV0.save(strArray4);
        java.util.List<laccan.devices.Sample> sampleList7 = storageCSV0.read();
        laccan.persistence.StorageCSV storageCSV9 = storageCSV0.local("null;4.0;0");
        laccan.persistence.StorageCSV storageCSV11 = storageCSV9.local("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        java.lang.String[] strArray12 = null;
        storageCSV9.save(strArray12);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(sampleList7);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(storageCSV11);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test090");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        int int6 = micazMsg1.amType();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        micazMsg8.set_NodeID(20);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray15);
        micazMsg8.dataSet(byteArray15);
        short short19 = micazMsg8.getElement_Buffer(0);
        net.tinyos.message.Message message21 = micazMsg8.clone((int) (byte) 100);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(message21, 10);
        byte[] byteArray24 = micazMsg23.dataGet();
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray24, 3);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray24, (int) (byte) 10);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray24);
        try {
            micazMsg1.dataSet(byteArray24, 0, (int) (short) 100, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 172 + "'", int6 == 172);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertNotNull(message21);
        org.junit.Assert.assertNotNull(byteArray24);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test091");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.get_NodeID();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        java.lang.String str10 = sample9.toString();
        java.lang.String str11 = sample9.getNode();
        sample9.setDate((long) 52);
        java.lang.String str14 = sample9.toString();
        long long15 = sample9.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null;-19.699999999999996;0" + "'", str10.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null;-19.699999999999996;52" + "'", str14.equals("null;-19.699999999999996;52"));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test092");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList4 = keepingAll0.get();
        laccan.devices.Sample sample8 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) 3, (long) 3);
        keepingAll0.add(sample8);
        double double10 = sample8.getTemperature();
        sample8.setTemperature(0.0d);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test093");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        micazMsg1.set_Voltage(20);
        byte[] byteArray11 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray11);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(byteArray11);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test094");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        memory0.build();
        int int3 = memory0.length();
        java.lang.Class<?> wildcardClass4 = memory0.getClass();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        long long10 = sample9.getDate();
        laccan.devices.Type type11 = laccan.devices.Type.FULL;
        sample9.setType(type11);
        sample9.setNode("reduction");
        java.lang.String str15 = sample9.toString();
        java.lang.String str16 = sample9.toString();
        memory0.add(sample9);
        sample9.setNode("full_memory");
        double double20 = sample9.getDateDouble();
        java.lang.String str21 = sample9.getNode();
        java.lang.String str22 = sample9.getNode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "reduction;-19.699999999999996;0" + "'", str15.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "reduction;-19.699999999999996;0" + "'", str16.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "full_memory" + "'", str21.equals("full_memory"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "full_memory" + "'", str22.equals("full_memory"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test095");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 512);
        java.lang.Object obj7 = micazMsg2.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test096");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 512);
        java.lang.Object obj7 = micazMsg2.clone();
        micazMsg2.amTypeSet((int) (short) 1);
        net.tinyos.message.Message message11 = micazMsg2.clone(65535);
        java.lang.String str12 = micazMsg2.toString();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test097");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(24, 0);
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg2, 1L);
        sample4.setDate(10L);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test098");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        short short7 = micazMsg1.getElement_Buffer(4);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        java.lang.Object obj11 = micazMsg9.clone();
        micazMsg9.set_NodeID(20);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray16);
        micazMsg9.dataSet(byteArray16);
        short short20 = micazMsg9.getElement_Buffer(0);
        net.tinyos.message.Message message22 = micazMsg9.clone((int) (byte) 100);
        int int23 = micazMsg9.get_Voltage();
        micazMsg9.init((int) (short) 0);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray28 = micazMsg27.get_Buffer();
        java.lang.Object obj29 = micazMsg27.clone();
        micazMsg27.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg27, (int) (byte) 0);
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray36 = micazMsg35.get_Buffer();
        java.lang.Object obj37 = micazMsg35.clone();
        micazMsg35.set_NodeID(20);
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg43 = new laccan.devices.MicazMsg(byteArray42);
        micazMsg35.dataSet(byteArray42);
        micazMsg27.dataSet(byteArray42);
        micazMsg9.dataSet(byteArray42, (int) (byte) 0, (int) (short) 0, (int) (byte) 0);
        laccan.devices.MicazMsg micazMsg50 = new laccan.devices.MicazMsg(byteArray42);
        laccan.devices.MicazMsg micazMsg51 = new laccan.devices.MicazMsg(byteArray42);
        micazMsg1.dataSet(byteArray42);
        laccan.devices.MicazMsg micazMsg53 = new laccan.devices.MicazMsg(byteArray42);
        try {
            short short55 = micazMsg53.getElement_Buffer(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertNotNull(message22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(byteArray42);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test099");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(48, (-30));
        java.lang.String str3 = micazMsg2.toString();
        try {
            laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 35, data_length 24 and data array size 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str3.equals("Message <MicazMsg> \n  [Buffer="));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test100");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg4.set_Buffer(shortArray10);
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg4);
        keepingAll0.add(sample12);
        java.util.List<laccan.devices.Sample> sampleList14 = keepingAll0.get();
        java.util.List<java.lang.Double> doubleList15 = laccan.cloud.prediction.Regression.makeTests(sampleList14);
        java.util.List<java.lang.Double> doubleList16 = laccan.cloud.prediction.Regression.makeTests(sampleList14);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(sampleList14);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test101");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1);
        double double8 = sample7.getDateDouble();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg10.set_Buffer(shortArray16);
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg10);
        laccan.devices.Sample sample19 = new laccan.devices.Sample();
        laccan.devices.Type type20 = laccan.devices.Type.FULL;
        sample19.setType(type20);
        sample18.setType(type20);
        sample18.setTemperature((double) 'a');
        laccan.devices.Type type25 = sample18.getType();
        sample7.setType(type25);
        laccan.devices.Type type27 = sample7.getType();
        double double28 = sample7.getTemperature();
        java.lang.String str29 = sample7.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + laccan.devices.Type.FULL + "'", type20.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + laccan.devices.Type.FULL + "'", type25.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type27 + "' != '" + laccan.devices.Type.FULL + "'", type27.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-19.699999999999996d) + "'", double28 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "null;-19.699999999999996;0" + "'", str29.equals("null;-19.699999999999996;0"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test102");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample();
        laccan.devices.Type type11 = laccan.devices.Type.FULL;
        sample10.setType(type11);
        sample9.setType(type11);
        sample9.setTemperature((double) 'a');
        laccan.devices.Type type16 = sample9.getType();
        sample9.setDate((long) (byte) 100);
        java.lang.String[] strArray19 = sample9.toCSV();
        sample9.setDate((long) 51);
        sample9.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;-19.648499999999995;0");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + laccan.devices.Type.FULL + "'", type16.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test103");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        micazMsg8.set_NodeID(20);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray15);
        micazMsg8.dataSet(byteArray15);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray15);
        micazMsg1.dataSet(byteArray15);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 1);
        micazMsg1.init(256);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test104");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        memory0.build();
        laccan.memory.Container container10 = memory0.getMemory();
        memory0.build();
        memory0.build();
        memory0.build();
        laccan.memory.Container container14 = memory0.getMemory();
        int int15 = memory0.length();
        memory0.build();
        int int17 = memory0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test105");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        int int4 = micazMsg2.get_NodeID();
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) (byte) -1);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        java.lang.String str11 = micazMsg8.toString();
        short[] shortArray12 = micazMsg8.get_Buffer();
        micazMsg2.set_Buffer(shortArray12);
        micazMsg2.set_Voltage(0);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray20, 48);
        micazMsg2.dataSet(byteArray20);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray20);
        byte[] byteArray25 = micazMsg24.dataGet();
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray25);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray25, (int) (byte) -1, 3);
        try {
            short[] shortArray30 = micazMsg29.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 3 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteArray25);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test106");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        int int9 = memory0.length();
        laccan.memory.Container container10 = memory0.getMemory();
        laccan.memory.Memory memory11 = new laccan.memory.Memory();
        memory11.build();
        int int13 = memory11.length();
        laccan.memory.data.reduction.KeepingAll keepingAll14 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample15 = new laccan.devices.Sample();
        keepingAll14.add(sample15);
        sample15.setDate(10L);
        memory11.add(sample15);
        memory0.add(sample15);
        memory0.build();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = micazMsg23.get_Buffer();
        java.lang.Object obj25 = micazMsg23.clone();
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg23);
        sample26.setDate((long) '#');
        sample26.setTemperature((-1.0d));
        memory0.add(sample26);
        sample26.setTemperature((-19.648499999999995d));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test107");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        java.lang.String str11 = micazMsg8.toString();
        short[] shortArray12 = micazMsg8.get_Buffer();
        byte[] byteArray13 = micazMsg8.dataGet();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray13, 100);
        try {
            micazMsg1.dataSet(byteArray13, 48, 128, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(byteArray13);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test108");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.set_NodeID((int) (byte) -1);
        byte[] byteArray5 = micazMsg1.dataGet();
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1, (long) 16);
        micazMsg1.amTypeSet((int) (byte) 10);
        java.lang.String str10 = micazMsg1.toString();
        try {
            laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 20, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 20, data_length 65535 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str10.equals("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test109");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, (long) 0);
        sample5.setDate((long) 24);
        laccan.devices.Type type8 = sample5.getType();
        double double9 = sample5.getTemperature();
        double double10 = sample5.getTemperature();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-19.699999999999996d) + "'", double9 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-19.699999999999996d) + "'", double10 == (-19.699999999999996d));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test110");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        java.lang.String str7 = micazMsg1.toString();
        micazMsg1.amTypeSet(16);
        int int10 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 10);
        micazMsg1.setElement_Buffer((int) (byte) 0, (short) -1);
        byte[] byteArray16 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray16, (int) '4');
        try {
            laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg18, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test111");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1 };
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray5, (int) (short) -1);
        micazMsg1.dataSet(byteArray5);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        java.lang.String str13 = micazMsg10.toString();
        short[] shortArray14 = micazMsg10.get_Buffer();
        byte[] byteArray15 = micazMsg10.dataGet();
        java.lang.Object obj16 = micazMsg10.clone();
        net.tinyos.message.Message message18 = micazMsg10.clone(2);
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg10, (-30));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(message18);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test112");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests(0L, (long) 97, 10);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test113");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("init");
        laccan.persistence.StorageCSV storageCSV9 = storageCSV4.local("lastReading");
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg11);
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg11, (long) (short) 10);
        java.lang.String str16 = sample15.getNode();
        java.lang.String str17 = sample15.getNode();
        long long18 = sample15.getDate();
        double double19 = sample15.getTemperature();
        sample15.setNode("hi!");
        sample15.setDate(24L);
        java.lang.String[] strArray24 = sample15.toCSV();
        storageCSV9.save(strArray24);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-19.699999999999996d) + "'", double19 == (-19.699999999999996d));
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test114");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(0, 256);
        net.tinyos.message.SerialPacket serialPacket3 = micazMsg2.getSerialPacket();
        java.lang.Object obj4 = micazMsg2.clone();
        try {
            laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 112);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(serialPacket3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test115");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(20, 1);
        try {
            short[] shortArray3 = micazMsg2.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (160) or length (16), for data_length 20 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test116");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        java.lang.String str13 = micazMsg10.toString();
        short[] shortArray14 = micazMsg10.get_Buffer();
        byte[] byteArray15 = micazMsg10.dataGet();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray15);
        micazMsg1.dataSet(byteArray15);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray15);
        net.tinyos.message.Message message20 = micazMsg18.clone((int) (short) 0);
        micazMsg18.set_NodeID((int) '4');
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray25, 16);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray25);
        micazMsg18.dataSet(byteArray25);
        micazMsg18.set_Voltage(5);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(message20);
        org.junit.Assert.assertNotNull(byteArray25);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test117");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        memory0.build();
        int int3 = memory0.length();
        int int4 = memory0.length();
        java.lang.Class<?> wildcardClass5 = memory0.getClass();
        int int6 = memory0.length();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg8);
        laccan.devices.Type type11 = sample10.getType();
        memory0.add(sample10);
        laccan.devices.Sample sample16 = new laccan.devices.Sample("null;-19.648499999999995;0", (double) 52, 0L);
        double double17 = sample16.getDateDouble();
        memory0.add(sample16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNull(type11);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test118");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5);
        laccan.devices.Type type9 = null;
        sample8.setType(type9);
        laccan.devices.Type type11 = null;
        sample8.setType(type11);
        sample8.setNode("hi!");
        keepingAll0.add(sample8);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg17);
        laccan.devices.Type type21 = null;
        sample20.setType(type21);
        java.lang.String str23 = sample20.toString();
        java.lang.String str24 = sample20.getNode();
        keepingAll0.add(sample20);
        java.util.List<laccan.devices.Sample> sampleList26 = keepingAll0.get();
        laccan.devices.Sample sample27 = new laccan.devices.Sample();
        double double28 = sample27.getDateDouble();
        double double29 = sample27.getDateDouble();
        sample27.setTemperature((double) 1);
        double double32 = sample27.getDateDouble();
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray40 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg34.set_Buffer(shortArray40);
        laccan.devices.Sample sample42 = new laccan.devices.Sample(micazMsg34);
        laccan.devices.Sample sample43 = new laccan.devices.Sample();
        laccan.devices.Type type44 = laccan.devices.Type.FULL;
        sample43.setType(type44);
        sample42.setType(type44);
        double double47 = sample42.getDateDouble();
        double double48 = sample42.getTemperature();
        laccan.devices.Type type49 = sample42.getType();
        sample27.setType(type49);
        keepingAll0.add(sample27);
        java.util.List<laccan.devices.Sample> sampleList52 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg54 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray60 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg54.set_Buffer(shortArray60);
        laccan.devices.Sample sample62 = new laccan.devices.Sample(micazMsg54);
        laccan.devices.Sample sample63 = new laccan.devices.Sample();
        laccan.devices.Type type64 = laccan.devices.Type.FULL;
        sample63.setType(type64);
        sample62.setType(type64);
        double double67 = sample62.getDateDouble();
        laccan.devices.MicazMsg micazMsg69 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray70 = micazMsg69.get_Buffer();
        java.lang.Object obj71 = micazMsg69.clone();
        laccan.devices.Sample sample72 = new laccan.devices.Sample(micazMsg69);
        long long73 = sample72.getDate();
        java.lang.Class<?> wildcardClass74 = sample72.getClass();
        laccan.devices.MicazMsg micazMsg76 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray77 = micazMsg76.get_Buffer();
        java.lang.Object obj78 = micazMsg76.clone();
        laccan.devices.Sample sample79 = new laccan.devices.Sample(micazMsg76);
        long long80 = sample79.getDate();
        laccan.devices.Type type81 = laccan.devices.Type.FULL;
        sample79.setType(type81);
        sample72.setType(type81);
        sample62.setType(type81);
        keepingAll0.add(sample62);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "null;-19.699999999999996;0" + "'", str23.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(sampleList26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertTrue("'" + type44 + "' != '" + laccan.devices.Type.FULL + "'", type44.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-19.648499999999995d) + "'", double48 == (-19.648499999999995d));
        org.junit.Assert.assertTrue("'" + type49 + "' != '" + laccan.devices.Type.FULL + "'", type49.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(sampleList52);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertTrue("'" + type64 + "' != '" + laccan.devices.Type.FULL + "'", type64.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue("'" + type81 + "' != '" + laccan.devices.Type.FULL + "'", type81.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test119");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        java.lang.String str16 = micazMsg13.toString();
        micazMsg13.set_NodeID(172);
        try {
            laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg13, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset -1, data_length 24 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=" + "'", str16.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer="));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test120");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (-139), (long) '4', 256);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test121");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray3 = micazMsg2.dataGet();
        int int4 = micazMsg2.get_Voltage();
        byte[] byteArray5 = micazMsg2.dataGet();
        try {
            laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray5, (-139), 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset -139, data_length 256 and data array size 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test122");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone((int) ' ');
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray12, 16);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray12);
        message9.dataSet(byteArray12);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray12);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray12);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test123");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(10, (int) (short) 100);
        try {
            laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (80) or length (16), for data_length 10 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test124");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        java.lang.Class<?> wildcardClass13 = micazMsg1.getClass();
        short short15 = micazMsg1.getElement_Buffer((int) (short) 0);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        micazMsg17.amTypeSet(20);
        int int22 = micazMsg17.baseOffset();
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg17, 0);
        java.lang.String str25 = micazMsg24.toString();
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray33 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg27.set_Buffer(shortArray33);
        int int35 = micazMsg27.get_NodeID();
        int int36 = micazMsg27.amType();
        laccan.devices.MicazMsg micazMsg39 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj40 = micazMsg39.clone();
        int int41 = micazMsg39.get_NodeID();
        laccan.devices.Sample sample43 = new laccan.devices.Sample(micazMsg39, (long) (byte) -1);
        laccan.devices.MicazMsg micazMsg45 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray46 = micazMsg45.get_Buffer();
        java.lang.Object obj47 = micazMsg45.clone();
        java.lang.String str48 = micazMsg45.toString();
        short[] shortArray49 = micazMsg45.get_Buffer();
        micazMsg39.set_Buffer(shortArray49);
        byte[] byteArray51 = micazMsg39.dataGet();
        micazMsg27.dataSet(byteArray51);
        micazMsg24.dataSet(byteArray51);
        laccan.devices.MicazMsg micazMsg55 = new laccan.devices.MicazMsg(byteArray51, (int) '#');
        laccan.devices.MicazMsg micazMsg57 = new laccan.devices.MicazMsg(byteArray51, 20);
        try {
            micazMsg1.dataSet(byteArray51, 0, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str25.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 172 + "'", int36 == 172);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str48.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertNotNull(byteArray51);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test125");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1);
        int int11 = micazMsg1.dataLength();
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray15 = micazMsg14.dataGet();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray15, (int) (byte) -1, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray15);
        micazMsg1.dataSet(byteArray15);
        short[] shortArray21 = micazMsg1.get_Buffer();
        int int22 = micazMsg1.baseOffset();
        byte[] byteArray23 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray23, (-30));
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test126");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray5 = micazMsg4.get_Buffer();
        java.lang.Object obj6 = micazMsg4.clone();
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg4);
        long long8 = sample7.getDate();
        laccan.devices.Type type9 = laccan.devices.Type.FULL;
        sample7.setType(type9);
        sample7.setNode("reduction");
        java.lang.String str13 = sample7.toString();
        sample7.setNode("reduction;-19.699999999999996;0");
        sample7.setTemperature((double) (-1L));
        double double18 = sample7.getDateDouble();
        sample7.setTemperature((double) (byte) 1);
        sample7.setNode("result");
        keepingAll0.add(sample7);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + laccan.devices.Type.FULL + "'", type9.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "reduction;-19.699999999999996;0" + "'", str13.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test127");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        micazMsg1.amTypeSet(52);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray10, 48);
        micazMsg1.dataSet(byteArray10);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray16);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray16, 2);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray16);
        micazMsg20.set_NodeID((int) (byte) 10);
        byte[] byteArray23 = micazMsg20.dataGet();
        micazMsg1.dataSet(byteArray23);
        net.tinyos.message.Message message26 = micazMsg1.clone(20);
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg1);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(message26);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test128");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        int int13 = micazMsg12.amType();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg12, (int) (short) 0, (-1));
        byte[] byteArray17 = micazMsg12.dataGet();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 172 + "'", int13 == 172);
        org.junit.Assert.assertNotNull(byteArray17);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test129");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray5 = micazMsg4.get_Buffer();
        java.lang.Object obj6 = micazMsg4.clone();
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg4);
        long long8 = sample7.getDate();
        java.lang.Class<?> wildcardClass9 = sample7.getClass();
        java.lang.String str10 = sample7.getNode();
        sample7.setNode("full_memory");
        memory0.add(sample7);
        laccan.memory.data.reduction.KeepingAll keepingAll14 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList15 = keepingAll14.get();
        int int16 = keepingAll14.length();
        java.util.List<laccan.devices.Sample> sampleList17 = keepingAll14.get();
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = micazMsg19.get_Buffer();
        java.lang.Object obj21 = micazMsg19.clone();
        laccan.devices.Sample sample22 = new laccan.devices.Sample(micazMsg19);
        laccan.devices.Type type23 = null;
        sample22.setType(type23);
        laccan.devices.Type type25 = null;
        sample22.setType(type25);
        sample22.setNode("hi!");
        keepingAll14.add(sample22);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray32 = micazMsg31.get_Buffer();
        java.lang.Object obj33 = micazMsg31.clone();
        laccan.devices.Sample sample34 = new laccan.devices.Sample(micazMsg31);
        laccan.devices.Type type35 = null;
        sample34.setType(type35);
        java.lang.String str37 = sample34.toString();
        java.lang.String str38 = sample34.getNode();
        keepingAll14.add(sample34);
        laccan.devices.Sample sample40 = new laccan.devices.Sample();
        laccan.devices.Type type41 = laccan.devices.Type.FULL;
        sample40.setType(type41);
        sample34.setType(type41);
        double double44 = sample34.getTemperature();
        sample34.setNode("");
        memory0.add(sample34);
        java.lang.String str48 = sample34.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(sampleList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(sampleList17);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "null;-19.699999999999996;0" + "'", str37.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + type41 + "' != '" + laccan.devices.Type.FULL + "'", type41.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-19.699999999999996d) + "'", double44 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + ";-19.699999999999996;0" + "'", str48.equals(";-19.699999999999996;0"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test130");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        memory0.build();
        int int3 = memory0.length();
        int int4 = memory0.length();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        laccan.devices.Type type10 = null;
        sample9.setType(type10);
        laccan.devices.Type type12 = null;
        sample9.setType(type12);
        sample9.setNode("hi!");
        memory0.add(sample9);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg18.set_Buffer(shortArray24);
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg18);
        laccan.devices.Sample sample27 = new laccan.devices.Sample();
        laccan.devices.Type type28 = laccan.devices.Type.FULL;
        sample27.setType(type28);
        sample26.setType(type28);
        java.lang.String str31 = sample26.toString();
        memory0.add(sample26);
        memory0.build();
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg36.amTypeSet(2);
        laccan.devices.Sample sample40 = new laccan.devices.Sample(micazMsg36, (long) 512);
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray43 = micazMsg42.get_Buffer();
        java.lang.Object obj44 = micazMsg42.clone();
        int int45 = micazMsg42.get_NodeID();
        micazMsg42.setElement_Buffer(1, (short) (byte) 0);
        laccan.devices.Sample sample50 = new laccan.devices.Sample(micazMsg42, (long) 512);
        laccan.devices.MicazMsg micazMsg52 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray53 = micazMsg52.get_Buffer();
        java.lang.Object obj54 = micazMsg52.clone();
        laccan.devices.Sample sample55 = new laccan.devices.Sample(micazMsg52);
        long long56 = sample55.getDate();
        laccan.devices.Type type57 = laccan.devices.Type.FULL;
        sample55.setType(type57);
        sample55.setNode("reduction");
        java.lang.Class<?> wildcardClass61 = sample55.getClass();
        laccan.devices.Type type62 = sample55.getType();
        sample50.setType(type62);
        sample40.setType(type62);
        memory0.add(sample40);
        laccan.memory.Container container66 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertTrue("'" + type28 + "' != '" + laccan.devices.Type.FULL + "'", type28.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "null;-19.648499999999995;0" + "'", str31.equals("null;-19.648499999999995;0"));
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + type57 + "' != '" + laccan.devices.Type.FULL + "'", type57.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + type62 + "' != '" + laccan.devices.Type.FULL + "'", type62.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(container66);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test131");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        int int13 = micazMsg12.amType();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg12, (int) (short) 0, (-1));
        micazMsg12.set_NodeID(8);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 172 + "'", int13 == 172);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test132");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj12 = micazMsg11.clone();
        int int13 = micazMsg11.get_NodeID();
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg11, (long) (byte) -1);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        java.lang.String str20 = micazMsg17.toString();
        short[] shortArray21 = micazMsg17.get_Buffer();
        micazMsg11.set_Buffer(shortArray21);
        micazMsg11.set_Voltage(0);
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg(byteArray29, 48);
        micazMsg11.dataSet(byteArray29);
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray35 = micazMsg34.get_Buffer();
        java.lang.Object obj36 = micazMsg34.clone();
        java.lang.String str37 = micazMsg34.toString();
        short[] shortArray38 = micazMsg34.get_Buffer();
        byte[] byteArray39 = micazMsg34.dataGet();
        java.lang.Object obj40 = micazMsg34.clone();
        laccan.devices.Sample sample41 = new laccan.devices.Sample(micazMsg34);
        int int42 = micazMsg34.dataLength();
        int int43 = micazMsg34.baseOffset();
        laccan.devices.Sample sample44 = new laccan.devices.Sample(micazMsg34);
        short[] shortArray45 = micazMsg34.get_Buffer();
        micazMsg11.set_Buffer(shortArray45);
        micazMsg8.set_Buffer(shortArray45);
        int int48 = micazMsg8.dataLength();
        micazMsg8.init((int) (short) 10);
        net.tinyos.message.SerialPacket serialPacket51 = micazMsg8.getSerialPacket();
        try {
            short short53 = micazMsg8.getElement_Buffer((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str20.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str37.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 52 + "'", int48 == 52);
        org.junit.Assert.assertNull(serialPacket51);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test133");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("memory");
        java.lang.String[] strArray8 = laccan.devices.helper.utils.Assistant.environments;
        storageCSV4.save(strArray8);
        laccan.persistence.StorageCSV storageCSV11 = storageCSV4.local("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        laccan.persistence.StorageCSV storageCSV13 = storageCSV11.local("null;-19.699999999999996;35");
        laccan.persistence.StorageCSV storageCSV14 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV16 = storageCSV14.local("hi!");
        laccan.persistence.StorageCSV storageCSV17 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray18 = new java.lang.String[] {};
        storageCSV17.save(strArray18);
        storageCSV14.save(strArray18);
        laccan.persistence.StorageCSV storageCSV22 = storageCSV14.local("nodes");
        laccan.persistence.StorageCSV storageCSV24 = storageCSV14.local("init");
        laccan.persistence.StorageCSV storageCSV26 = storageCSV24.local("reduction;-19.699999999999996;0");
        laccan.persistence.StorageCSV storageCSV28 = storageCSV26.local("full_memory");
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray31 = micazMsg30.get_Buffer();
        java.lang.Object obj32 = micazMsg30.clone();
        laccan.devices.Sample sample33 = new laccan.devices.Sample(micazMsg30);
        long long34 = sample33.getDate();
        laccan.devices.Type type35 = laccan.devices.Type.FULL;
        sample33.setType(type35);
        sample33.setNode("reduction");
        java.lang.String str39 = sample33.toString();
        sample33.setNode("reduction;-19.699999999999996;0");
        sample33.setTemperature((double) (-1L));
        double double44 = sample33.getDateDouble();
        java.lang.String[] strArray45 = sample33.toCSV();
        storageCSV28.save(strArray45);
        storageCSV11.save(strArray45);
        laccan.persistence.StorageCSV storageCSV48 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV50 = storageCSV48.local("hi!");
        laccan.persistence.StorageCSV storageCSV52 = storageCSV50.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList53 = storageCSV52.read();
        laccan.persistence.StorageCSV storageCSV55 = storageCSV52.local("memory");
        java.lang.String[] strArray56 = laccan.devices.helper.utils.Assistant.environments;
        storageCSV52.save(strArray56);
        java.util.List<laccan.devices.Sample> sampleList58 = storageCSV52.read();
        laccan.persistence.StorageCSV storageCSV60 = storageCSV52.local("null;-19.699999999999996;35");
        laccan.persistence.StorageCSV storageCSV61 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV63 = storageCSV61.local("hi!");
        laccan.persistence.StorageCSV storageCSV65 = storageCSV63.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList66 = storageCSV65.read();
        laccan.persistence.StorageCSV storageCSV68 = storageCSV65.local("init");
        laccan.memory.data.reduction.KeepingAll keepingAll69 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList70 = keepingAll69.get();
        int int71 = keepingAll69.length();
        java.util.List<laccan.devices.Sample> sampleList72 = keepingAll69.get();
        laccan.devices.MicazMsg micazMsg74 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray75 = micazMsg74.get_Buffer();
        java.lang.Object obj76 = micazMsg74.clone();
        laccan.devices.Sample sample77 = new laccan.devices.Sample(micazMsg74);
        laccan.devices.Type type78 = null;
        sample77.setType(type78);
        laccan.devices.Type type80 = null;
        sample77.setType(type80);
        sample77.setNode("hi!");
        keepingAll69.add(sample77);
        laccan.devices.Type type85 = sample77.getType();
        java.lang.String[] strArray86 = sample77.toCSV();
        storageCSV68.save(strArray86);
        storageCSV60.save(strArray86);
        storageCSV11.save(strArray86);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(storageCSV16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(storageCSV22);
        org.junit.Assert.assertNotNull(storageCSV24);
        org.junit.Assert.assertNotNull(storageCSV26);
        org.junit.Assert.assertNotNull(storageCSV28);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + type35 + "' != '" + laccan.devices.Type.FULL + "'", type35.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "reduction;-19.699999999999996;0" + "'", str39.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(storageCSV50);
        org.junit.Assert.assertNotNull(storageCSV52);
        org.junit.Assert.assertNotNull(sampleList53);
        org.junit.Assert.assertNotNull(storageCSV55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(sampleList58);
        org.junit.Assert.assertNotNull(storageCSV60);
        org.junit.Assert.assertNotNull(storageCSV63);
        org.junit.Assert.assertNotNull(storageCSV65);
        org.junit.Assert.assertNotNull(sampleList66);
        org.junit.Assert.assertNotNull(storageCSV68);
        org.junit.Assert.assertNotNull(sampleList70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(sampleList72);
        org.junit.Assert.assertNotNull(shortArray75);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertNull(type85);
        org.junit.Assert.assertNotNull(strArray86);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test134");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll2 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll2.get();
        laccan.cloud.prediction.Regression regression4 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        laccan.devices.Sample sample10 = new laccan.devices.Sample();
        laccan.devices.Sample sample11 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray12 = new laccan.devices.Sample[] { sample9, sample10, sample11 };
        java.util.ArrayList<laccan.devices.Sample> sampleList13 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList13, sampleArray12);
        java.util.List<java.lang.Double> doubleList15 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList13);
        java.util.List<java.lang.Double> doubleList16 = regression4.result(doubleList15);
        regression0.init(sampleList3, doubleList15);
        laccan.cloud.prediction.Regression regression18 = new laccan.cloud.prediction.Regression();
        double double19 = regression18.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll20 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList21 = keepingAll20.get();
        laccan.cloud.prediction.Regression regression22 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray25 = micazMsg24.get_Buffer();
        java.lang.Object obj26 = micazMsg24.clone();
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg24);
        laccan.devices.Sample sample28 = new laccan.devices.Sample();
        laccan.devices.Sample sample29 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray30 = new laccan.devices.Sample[] { sample27, sample28, sample29 };
        java.util.ArrayList<laccan.devices.Sample> sampleList31 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList31, sampleArray30);
        java.util.List<java.lang.Double> doubleList33 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList31);
        java.util.List<java.lang.Double> doubleList34 = regression22.result(doubleList33);
        regression18.init(sampleList21, doubleList33);
        laccan.cloud.prediction.Regression regression36 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray39 = micazMsg38.get_Buffer();
        java.lang.Object obj40 = micazMsg38.clone();
        laccan.devices.Sample sample41 = new laccan.devices.Sample(micazMsg38);
        laccan.devices.Sample sample42 = new laccan.devices.Sample();
        laccan.devices.Sample sample43 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray44 = new laccan.devices.Sample[] { sample41, sample42, sample43 };
        java.util.ArrayList<laccan.devices.Sample> sampleList45 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList45, sampleArray44);
        java.util.List<java.lang.Double> doubleList47 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList45);
        java.util.List<java.lang.Double> doubleList48 = regression36.result(doubleList47);
        regression0.init(sampleList21, doubleList48);
        double double50 = regression0.mse();
        double double51 = regression0.mse();
        laccan.persistence.StorageCSV storageCSV52 = new laccan.persistence.StorageCSV();
        java.util.List<laccan.devices.Sample> sampleList53 = storageCSV52.read();
        java.util.List<java.lang.Double> doubleList54 = laccan.cloud.prediction.Regression.makeTests(sampleList53);
        java.util.List<java.lang.Double> doubleList55 = laccan.cloud.prediction.Regression.makeTests(sampleList53);
        laccan.persistence.StorageCSV storageCSV56 = new laccan.persistence.StorageCSV();
        java.util.List<laccan.devices.Sample> sampleList57 = storageCSV56.read();
        java.util.List<java.lang.Double> doubleList58 = laccan.cloud.prediction.Regression.makeTests(sampleList57);
        java.util.List<java.lang.Double> doubleList59 = laccan.cloud.prediction.Regression.makeTests(sampleList57);
        regression0.init(sampleList53, doubleList59);
        java.util.List<java.lang.Double> doubleList61 = regression0.result();
        double double62 = regression0.mse();
        laccan.persistence.StorageCSV storageCSV63 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV65 = storageCSV63.local("hi!");
        java.util.List<laccan.devices.Sample> sampleList66 = storageCSV63.read();
        java.util.List<laccan.devices.Sample> sampleList67 = storageCSV63.read();
        laccan.cloud.prediction.Regression regression68 = new laccan.cloud.prediction.Regression();
        double double69 = regression68.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll70 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList71 = keepingAll70.get();
        laccan.cloud.prediction.Regression regression72 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg74 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray75 = micazMsg74.get_Buffer();
        java.lang.Object obj76 = micazMsg74.clone();
        laccan.devices.Sample sample77 = new laccan.devices.Sample(micazMsg74);
        laccan.devices.Sample sample78 = new laccan.devices.Sample();
        laccan.devices.Sample sample79 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray80 = new laccan.devices.Sample[] { sample77, sample78, sample79 };
        java.util.ArrayList<laccan.devices.Sample> sampleList81 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList81, sampleArray80);
        java.util.List<java.lang.Double> doubleList83 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList81);
        java.util.List<java.lang.Double> doubleList84 = regression72.result(doubleList83);
        regression68.init(sampleList71, doubleList83);
        regression0.init(sampleList67, doubleList83);
        java.util.List<java.lang.Double> doubleList87 = regression0.result();
        java.util.List<java.lang.Double> doubleList88 = regression0.result();
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(sampleArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals((double) double19, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList21);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(sampleArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doubleList33);
        org.junit.Assert.assertNotNull(doubleList34);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(sampleArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(doubleList47);
        org.junit.Assert.assertNotNull(doubleList48);
        org.junit.Assert.assertEquals((double) double50, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double51, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList53);
        org.junit.Assert.assertNotNull(doubleList54);
        org.junit.Assert.assertNotNull(doubleList55);
        org.junit.Assert.assertNotNull(sampleList57);
        org.junit.Assert.assertNotNull(doubleList58);
        org.junit.Assert.assertNotNull(doubleList59);
        org.junit.Assert.assertNotNull(doubleList61);
        org.junit.Assert.assertEquals((double) double62, Double.NaN, 0);
        org.junit.Assert.assertNotNull(storageCSV65);
        org.junit.Assert.assertNotNull(sampleList66);
        org.junit.Assert.assertNotNull(sampleList67);
        org.junit.Assert.assertEquals((double) double69, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList71);
        org.junit.Assert.assertNotNull(shortArray75);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertNotNull(sampleArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(doubleList83);
        org.junit.Assert.assertNotNull(doubleList84);
        org.junit.Assert.assertNotNull(doubleList87);
        org.junit.Assert.assertNotNull(doubleList88);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test135");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        micazMsg1.amTypeSet(52);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray10, 48);
        micazMsg1.dataSet(byteArray10);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray16);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray16, 2);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray16);
        micazMsg20.set_NodeID((int) (byte) 10);
        byte[] byteArray23 = micazMsg20.dataGet();
        micazMsg1.dataSet(byteArray23);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray23);
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray23);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray23, (int) 'a');
        try {
            short short30 = micazMsg28.getElement_Buffer(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray23);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test136");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        byte[] byteArray7 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, 16);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test137");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        storageCSV3.save(strArray4);
        storageCSV0.save(strArray4);
        laccan.persistence.StorageCSV storageCSV8 = storageCSV0.local("nodes");
        laccan.persistence.StorageCSV storageCSV10 = storageCSV0.local("init");
        laccan.persistence.StorageCSV storageCSV12 = storageCSV10.local("reduction;-19.699999999999996;0");
        laccan.persistence.StorageCSV storageCSV14 = storageCSV10.local("lastReading");
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = micazMsg16.get_Buffer();
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg16);
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg16, (long) (short) 10);
        double double21 = sample20.getDateDouble();
        java.lang.String[] strArray22 = sample20.toCSV();
        storageCSV10.save(strArray22);
        java.util.List<laccan.devices.Sample> sampleList24 = storageCSV10.read();
        laccan.persistence.StorageCSV storageCSV25 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV27 = storageCSV25.local("hi!");
        laccan.persistence.StorageCSV storageCSV29 = storageCSV27.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList30 = storageCSV29.read();
        laccan.persistence.StorageCSV storageCSV32 = storageCSV29.local("memory");
        laccan.persistence.StorageCSV storageCSV33 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV35 = storageCSV33.local("hi!");
        laccan.persistence.StorageCSV storageCSV37 = storageCSV35.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList38 = storageCSV37.read();
        java.util.List<laccan.devices.Sample> sampleList39 = storageCSV37.read();
        laccan.persistence.StorageCSV storageCSV41 = storageCSV37.local("");
        laccan.persistence.StorageCSV storageCSV42 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV44 = storageCSV42.local("hi!");
        laccan.persistence.StorageCSV storageCSV46 = storageCSV44.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList47 = storageCSV46.read();
        laccan.persistence.StorageCSV storageCSV49 = storageCSV46.local("memory");
        laccan.persistence.StorageCSV storageCSV50 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV52 = storageCSV50.local("hi!");
        laccan.persistence.StorageCSV storageCSV54 = storageCSV52.local("lastReading");
        java.lang.String[] strArray60 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV54.save(strArray60);
        storageCSV46.save(strArray60);
        storageCSV37.save(strArray60);
        storageCSV29.save(strArray60);
        laccan.persistence.StorageCSV storageCSV66 = storageCSV29.local("lastReading");
        laccan.devices.MicazMsg micazMsg68 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray69 = micazMsg68.get_Buffer();
        java.lang.Object obj70 = micazMsg68.clone();
        laccan.devices.Sample sample71 = new laccan.devices.Sample(micazMsg68);
        long long72 = sample71.getDate();
        java.lang.Class<?> wildcardClass73 = sample71.getClass();
        java.lang.String str74 = sample71.toString();
        java.lang.String[] strArray75 = sample71.toCSV();
        storageCSV66.save(strArray75);
        storageCSV10.save(strArray75);
        java.util.List<laccan.devices.Sample> sampleList78 = storageCSV10.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV12);
        org.junit.Assert.assertNotNull(storageCSV14);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(sampleList24);
        org.junit.Assert.assertNotNull(storageCSV27);
        org.junit.Assert.assertNotNull(storageCSV29);
        org.junit.Assert.assertNotNull(sampleList30);
        org.junit.Assert.assertNotNull(storageCSV32);
        org.junit.Assert.assertNotNull(storageCSV35);
        org.junit.Assert.assertNotNull(storageCSV37);
        org.junit.Assert.assertNotNull(sampleList38);
        org.junit.Assert.assertNotNull(sampleList39);
        org.junit.Assert.assertNotNull(storageCSV41);
        org.junit.Assert.assertNotNull(storageCSV44);
        org.junit.Assert.assertNotNull(storageCSV46);
        org.junit.Assert.assertNotNull(sampleList47);
        org.junit.Assert.assertNotNull(storageCSV49);
        org.junit.Assert.assertNotNull(storageCSV52);
        org.junit.Assert.assertNotNull(storageCSV54);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(storageCSV66);
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "null;-19.699999999999996;0" + "'", str74.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(sampleList78);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test138");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer(116);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test139");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (byte) 100, 160);
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg2, (long) (byte) 100);
        java.lang.String str5 = sample4.toString();
        long long6 = sample4.getDate();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null;-19.699999999999996;100" + "'", str5.equals("null;-19.699999999999996;100"));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test140");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        micazMsg1.set_NodeID((int) 'a');
        int int10 = micazMsg1.dataLength();
        short[] shortArray11 = micazMsg1.get_Buffer();
        short[] shortArray12 = micazMsg1.get_Buffer();
        micazMsg1.set_Voltage(24);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = micazMsg16.get_Buffer();
        java.lang.Object obj18 = micazMsg16.clone();
        int int19 = micazMsg16.get_NodeID();
        micazMsg16.setElement_Buffer(1, (short) (byte) 0);
        int int23 = micazMsg16.get_NodeID();
        laccan.devices.Sample sample24 = new laccan.devices.Sample(micazMsg16);
        java.lang.Class<?> wildcardClass25 = micazMsg16.getClass();
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray28 = micazMsg27.get_Buffer();
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg27);
        int int30 = micazMsg27.get_NodeID();
        byte[] byteArray31 = micazMsg27.dataGet();
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg(byteArray31);
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray35 = micazMsg34.get_Buffer();
        java.lang.Object obj36 = micazMsg34.clone();
        int int37 = micazMsg34.get_NodeID();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg41 = new laccan.devices.MicazMsg(byteArray40);
        laccan.devices.MicazMsg micazMsg43 = new laccan.devices.MicazMsg(byteArray40, 2);
        micazMsg34.dataSet(byteArray40);
        laccan.devices.MicazMsg micazMsg45 = new laccan.devices.MicazMsg(byteArray40);
        micazMsg32.dataSet(byteArray40);
        laccan.devices.MicazMsg micazMsg47 = new laccan.devices.MicazMsg(byteArray40);
        micazMsg16.dataSet(byteArray40);
        laccan.devices.MicazMsg micazMsg50 = new laccan.devices.MicazMsg(byteArray40, (int) (short) 1);
        micazMsg1.dataSet(byteArray40);
        try {
            laccan.devices.MicazMsg micazMsg54 = new laccan.devices.MicazMsg(byteArray40, 32, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 32, data_length 51 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(byteArray40);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test141");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        int int13 = micazMsg1.dataLength();
        java.lang.Object obj14 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket15 = micazMsg1.getSerialPacket();
        net.tinyos.message.SerialPacket serialPacket16 = micazMsg1.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(serialPacket15);
        org.junit.Assert.assertNull(serialPacket16);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test142");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(160, (-1));
        try {
            short short4 = micazMsg2.getElement_Buffer(128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test143");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList4 = keepingAll3.get();
        int int5 = keepingAll3.length();
        java.util.List<laccan.devices.Sample> sampleList6 = keepingAll3.get();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg8);
        laccan.devices.Type type12 = null;
        sample11.setType(type12);
        laccan.devices.Type type14 = null;
        sample11.setType(type14);
        sample11.setNode("hi!");
        keepingAll3.add(sample11);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = micazMsg20.get_Buffer();
        java.lang.Object obj22 = micazMsg20.clone();
        laccan.devices.Sample sample23 = new laccan.devices.Sample(micazMsg20);
        laccan.devices.Type type24 = null;
        sample23.setType(type24);
        java.lang.String str26 = sample23.toString();
        java.lang.String str27 = sample23.getNode();
        keepingAll3.add(sample23);
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray31 = micazMsg30.get_Buffer();
        laccan.devices.Sample sample32 = new laccan.devices.Sample(micazMsg30);
        int int33 = micazMsg30.dataLength();
        micazMsg30.init((int) '4');
        laccan.devices.Sample sample36 = new laccan.devices.Sample(micazMsg30);
        double double37 = sample36.getDateDouble();
        laccan.devices.MicazMsg micazMsg39 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray45 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg39.set_Buffer(shortArray45);
        laccan.devices.Sample sample47 = new laccan.devices.Sample(micazMsg39);
        laccan.devices.Sample sample48 = new laccan.devices.Sample();
        laccan.devices.Type type49 = laccan.devices.Type.FULL;
        sample48.setType(type49);
        sample47.setType(type49);
        sample47.setTemperature((double) 'a');
        laccan.devices.Type type54 = sample47.getType();
        sample36.setType(type54);
        laccan.devices.MicazMsg micazMsg57 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray58 = micazMsg57.get_Buffer();
        laccan.devices.Sample sample59 = new laccan.devices.Sample(micazMsg57);
        int int60 = micazMsg57.dataLength();
        micazMsg57.init((int) '4');
        laccan.devices.Sample sample63 = new laccan.devices.Sample(micazMsg57);
        double double64 = sample63.getDateDouble();
        laccan.devices.MicazMsg micazMsg66 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray72 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg66.set_Buffer(shortArray72);
        laccan.devices.Sample sample74 = new laccan.devices.Sample(micazMsg66);
        laccan.devices.Sample sample75 = new laccan.devices.Sample();
        laccan.devices.Type type76 = laccan.devices.Type.FULL;
        sample75.setType(type76);
        sample74.setType(type76);
        sample74.setTemperature((double) 'a');
        laccan.devices.Type type81 = sample74.getType();
        sample63.setType(type81);
        sample36.setType(type81);
        double double84 = sample36.getDateDouble();
        keepingAll3.add(sample36);
        laccan.devices.MicazMsg micazMsg87 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray88 = micazMsg87.get_Buffer();
        java.lang.Object obj89 = micazMsg87.clone();
        laccan.devices.Sample sample90 = new laccan.devices.Sample(micazMsg87);
        sample90.setTemperature((double) 2);
        keepingAll3.add(sample90);
        keepingAll0.add(sample90);
        laccan.devices.MicazMsg micazMsg95 = new laccan.devices.MicazMsg();
        laccan.devices.Sample sample96 = new laccan.devices.Sample(micazMsg95);
        keepingAll0.add(sample96);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "null;-19.699999999999996;0" + "'", str26.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertTrue("'" + type49 + "' != '" + laccan.devices.Type.FULL + "'", type49.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type54 + "' != '" + laccan.devices.Type.FULL + "'", type54.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 52 + "'", int60 == 52);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertTrue("'" + type76 + "' != '" + laccan.devices.Type.FULL + "'", type76.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type81 + "' != '" + laccan.devices.Type.FULL + "'", type81.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.0d + "'", double84 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray88);
        org.junit.Assert.assertNotNull(obj89);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test144");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        sample4.setNode("null;-19.699999999999996;0");
        laccan.devices.Type type9 = sample4.getType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(type9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test145");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        micazMsg1.set_NodeID((int) 'a');
        int int10 = micazMsg1.dataLength();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg1);
        net.tinyos.message.Message message13 = micazMsg1.clone((int) (byte) 0);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg15);
        int int18 = micazMsg15.dataLength();
        micazMsg15.init((int) '4');
        micazMsg15.init((int) '4');
        micazMsg15.set_Voltage(20);
        micazMsg15.set_NodeID(10);
        micazMsg15.init(51);
        int int29 = micazMsg15.baseOffset();
        try {
            message13.dataSet((net.tinyos.message.Message) micazMsg15, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(message13);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test146");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.get_NodeID();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        double double10 = sample9.getDateDouble();
        double double11 = sample9.getDateDouble();
        double double12 = sample9.getTemperature();
        sample9.setNode("lastReading");
        java.lang.String str15 = sample9.toString();
        sample9.setDate((long) 52);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-19.699999999999996d) + "'", double12 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "lastReading;-19.699999999999996;0" + "'", str15.equals("lastReading;-19.699999999999996;0"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test147");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, 2);
        micazMsg1.dataSet(byteArray7);
        int int12 = micazMsg1.baseOffset();
        byte[] byteArray13 = micazMsg1.dataGet();
        micazMsg1.set_NodeID((int) 'a');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test148");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray3 = micazMsg2.dataGet();
        micazMsg2.set_Voltage(24);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = micazMsg7.get_Buffer();
        micazMsg7.setElement_Buffer(0, (short) 10);
        micazMsg7.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        int int18 = micazMsg15.get_NodeID();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray21);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray21, 2);
        micazMsg15.dataSet(byteArray21);
        micazMsg7.dataSet(byteArray21);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray21, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray21);
        micazMsg2.dataSet(byteArray21);
        java.lang.String str31 = micazMsg2.toString();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x1]\n  [Voltage=0x18]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str31.equals("Message <MicazMsg> \n  [NodeID=0x1]\n  [Voltage=0x18]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test149");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=", Double.NaN, (long) '#');
        long long4 = sample3.getDate();
        sample3.setDate((long) 512);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test150");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1);
        int int11 = micazMsg1.dataLength();
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray15 = micazMsg14.dataGet();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray15, (int) (byte) -1, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray15);
        micazMsg1.dataSet(byteArray15);
        short[] shortArray21 = micazMsg1.get_Buffer();
        int int22 = micazMsg1.baseOffset();
        byte[] byteArray23 = micazMsg1.dataGet();
        try {
            laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray23, 52, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 52, data_length 52 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test151");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        laccan.devices.Type type6 = laccan.devices.Type.FULL;
        sample4.setType(type6);
        sample4.setNode("reduction");
        java.lang.String str10 = sample4.toString();
        sample4.setNode("reduction;-19.699999999999996;0");
        sample4.setTemperature((double) (-1L));
        double double15 = sample4.getDateDouble();
        java.lang.String[] strArray16 = sample4.toCSV();
        java.lang.String str17 = sample4.toString();
        long long18 = sample4.getDate();
        sample4.setTemperature((double) 10L);
        java.lang.String[] strArray21 = sample4.toCSV();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "reduction;-19.699999999999996;0" + "'", str10.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "reduction;-19.699999999999996;0;-1.0;0" + "'", str17.equals("reduction;-19.699999999999996;0;-1.0;0"));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test152");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (byte) 10, (int) (byte) 10);
        try {
            micazMsg2.init((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test153");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        laccan.devices.Type type6 = laccan.devices.Type.FULL;
        sample4.setType(type6);
        sample4.setNode("reduction");
        java.lang.Class<?> wildcardClass10 = sample4.getClass();
        laccan.devices.Type type11 = sample4.getType();
        sample4.setTemperature(0.0d);
        double double14 = sample4.getTemperature();
        double double15 = sample4.getDateDouble();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test154");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        short short12 = micazMsg1.getElement_Buffer(0);
        net.tinyos.message.Message message14 = micazMsg1.clone((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = micazMsg1.getClass();
        int int16 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        java.lang.Object obj20 = micazMsg18.clone();
        int int21 = micazMsg18.get_NodeID();
        micazMsg18.setElement_Buffer(1, (short) (byte) 0);
        micazMsg18.set_NodeID((int) 'a');
        int int27 = micazMsg18.dataLength();
        short[] shortArray28 = micazMsg18.get_Buffer();
        micazMsg1.set_Buffer(shortArray28);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 5);
        byte[] byteArray32 = null;
        try {
            micazMsg1.dataSet(byteArray32, 64, 24, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertNotNull(shortArray28);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test155");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.get_NodeID();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        java.lang.Class<?> wildcardClass10 = micazMsg1.getClass();
        int int11 = micazMsg1.get_NodeID();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test156");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        java.lang.String[] strArray4 = new java.lang.String[] { "result" };
        storageCSV0.save(strArray4);
        java.util.List<laccan.devices.Sample> sampleList6 = storageCSV0.read();
        laccan.persistence.StorageCSV storageCSV7 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV9 = storageCSV7.local("hi!");
        laccan.persistence.StorageCSV storageCSV11 = storageCSV9.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList12 = storageCSV11.read();
        laccan.persistence.StorageCSV storageCSV14 = storageCSV11.local("memory");
        laccan.persistence.StorageCSV storageCSV15 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV17 = storageCSV15.local("hi!");
        laccan.persistence.StorageCSV storageCSV19 = storageCSV17.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList20 = storageCSV19.read();
        java.util.List<laccan.devices.Sample> sampleList21 = storageCSV19.read();
        laccan.persistence.StorageCSV storageCSV23 = storageCSV19.local("");
        laccan.persistence.StorageCSV storageCSV24 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV26 = storageCSV24.local("hi!");
        laccan.persistence.StorageCSV storageCSV28 = storageCSV26.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList29 = storageCSV28.read();
        laccan.persistence.StorageCSV storageCSV31 = storageCSV28.local("memory");
        laccan.persistence.StorageCSV storageCSV32 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV34 = storageCSV32.local("hi!");
        laccan.persistence.StorageCSV storageCSV36 = storageCSV34.local("lastReading");
        java.lang.String[] strArray42 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV36.save(strArray42);
        storageCSV28.save(strArray42);
        storageCSV19.save(strArray42);
        storageCSV11.save(strArray42);
        laccan.persistence.StorageCSV storageCSV48 = storageCSV11.local("lastReading");
        laccan.devices.MicazMsg micazMsg50 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray51 = micazMsg50.get_Buffer();
        java.lang.Object obj52 = micazMsg50.clone();
        laccan.devices.Sample sample53 = new laccan.devices.Sample(micazMsg50);
        long long54 = sample53.getDate();
        java.lang.Class<?> wildcardClass55 = sample53.getClass();
        java.lang.String str56 = sample53.toString();
        java.lang.String[] strArray57 = sample53.toCSV();
        storageCSV48.save(strArray57);
        storageCSV0.save(strArray57);
        laccan.persistence.StorageCSV storageCSV61 = storageCSV0.local("null;-19.699999999999996;512");
        laccan.persistence.StorageCSV storageCSV63 = storageCSV0.local(";-19.699999999999996;0");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(sampleList12);
        org.junit.Assert.assertNotNull(storageCSV14);
        org.junit.Assert.assertNotNull(storageCSV17);
        org.junit.Assert.assertNotNull(storageCSV19);
        org.junit.Assert.assertNotNull(sampleList20);
        org.junit.Assert.assertNotNull(sampleList21);
        org.junit.Assert.assertNotNull(storageCSV23);
        org.junit.Assert.assertNotNull(storageCSV26);
        org.junit.Assert.assertNotNull(storageCSV28);
        org.junit.Assert.assertNotNull(sampleList29);
        org.junit.Assert.assertNotNull(storageCSV31);
        org.junit.Assert.assertNotNull(storageCSV34);
        org.junit.Assert.assertNotNull(storageCSV36);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(storageCSV48);
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "null;-19.699999999999996;0" + "'", str56.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(storageCSV61);
        org.junit.Assert.assertNotNull(storageCSV63);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test157");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray6);
        int int9 = micazMsg8.get_Voltage();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg8);
        java.lang.String str11 = micazMsg8.toString();
        int int12 = micazMsg8.amType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 172 + "'", int12 == 172);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test158");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        micazMsg1.amTypeSet(52);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray10, 48);
        micazMsg1.dataSet(byteArray10);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray10, (int) '#');
        try {
            net.tinyos.message.Message message17 = micazMsg15.clone((-30));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(byteArray10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test159");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test160");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        short short7 = micazMsg1.getElement_Buffer(4);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        java.lang.Object obj11 = micazMsg9.clone();
        micazMsg9.set_NodeID(20);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray16);
        micazMsg9.dataSet(byteArray16);
        short short20 = micazMsg9.getElement_Buffer(0);
        net.tinyos.message.Message message22 = micazMsg9.clone((int) (byte) 100);
        int int23 = micazMsg9.get_Voltage();
        micazMsg9.init((int) (short) 0);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray28 = micazMsg27.get_Buffer();
        java.lang.Object obj29 = micazMsg27.clone();
        micazMsg27.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg27, (int) (byte) 0);
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray36 = micazMsg35.get_Buffer();
        java.lang.Object obj37 = micazMsg35.clone();
        micazMsg35.set_NodeID(20);
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg43 = new laccan.devices.MicazMsg(byteArray42);
        micazMsg35.dataSet(byteArray42);
        micazMsg27.dataSet(byteArray42);
        micazMsg9.dataSet(byteArray42, (int) (byte) 0, (int) (short) 0, (int) (byte) 0);
        laccan.devices.MicazMsg micazMsg50 = new laccan.devices.MicazMsg(byteArray42);
        laccan.devices.MicazMsg micazMsg51 = new laccan.devices.MicazMsg(byteArray42);
        micazMsg1.dataSet(byteArray42);
        laccan.devices.MicazMsg micazMsg53 = new laccan.devices.MicazMsg(byteArray42);
        try {
            laccan.devices.MicazMsg micazMsg56 = new laccan.devices.MicazMsg(byteArray42, 52, 112);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 52, data_length 112 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertNotNull(message22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(byteArray42);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test161");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1);
        java.lang.Object obj8 = micazMsg1.clone();
        micazMsg1.set_Voltage(20);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        micazMsg12.set_NodeID(20);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray19);
        micazMsg12.dataSet(byteArray19);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = micazMsg23.get_Buffer();
        java.lang.Object obj25 = micazMsg23.clone();
        java.lang.String str26 = micazMsg23.toString();
        short[] shortArray27 = micazMsg23.get_Buffer();
        byte[] byteArray28 = micazMsg23.dataGet();
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray28);
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg(byteArray28, 32, 10);
        micazMsg12.dataSet(byteArray28);
        micazMsg1.dataSet(byteArray28);
        micazMsg1.setElement_Buffer(6, (short) 100);
        int int38 = micazMsg1.amType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str26.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 172 + "'", int38 == 172);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test162");
        laccan.devices.helper.utils.Assistant.reducerType = "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xffff 0x0 0x0 0x0 0x0 0x0 ";
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test163");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 65535, 0L, 100);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test164");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll2 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll2.get();
        laccan.cloud.prediction.Regression regression4 = new laccan.cloud.prediction.Regression();
        double double5 = regression4.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll6 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList7 = keepingAll6.get();
        laccan.cloud.prediction.Regression regression8 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg10);
        laccan.devices.Sample sample14 = new laccan.devices.Sample();
        laccan.devices.Sample sample15 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray16 = new laccan.devices.Sample[] { sample13, sample14, sample15 };
        java.util.ArrayList<laccan.devices.Sample> sampleList17 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList17, sampleArray16);
        java.util.List<java.lang.Double> doubleList19 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList17);
        java.util.List<java.lang.Double> doubleList20 = regression8.result(doubleList19);
        regression4.init(sampleList7, doubleList19);
        laccan.cloud.prediction.Regression regression22 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray25 = micazMsg24.get_Buffer();
        java.lang.Object obj26 = micazMsg24.clone();
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg24);
        laccan.devices.Sample sample28 = new laccan.devices.Sample();
        laccan.devices.Sample sample29 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray30 = new laccan.devices.Sample[] { sample27, sample28, sample29 };
        java.util.ArrayList<laccan.devices.Sample> sampleList31 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList31, sampleArray30);
        java.util.List<java.lang.Double> doubleList33 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList31);
        java.util.List<java.lang.Double> doubleList34 = regression22.result(doubleList33);
        java.util.List<java.lang.Double> doubleList35 = regression4.result(doubleList33);
        regression0.init(sampleList3, doubleList33);
        regression0.train();
        java.util.List<java.lang.Double> doubleList38 = regression0.result();
        java.util.List<java.lang.Double> doubleList39 = regression0.result();
        java.util.List<java.lang.Double> doubleList40 = regression0.result();
        double double41 = regression0.mse();
        regression0.train();
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertEquals((double) double5, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(sampleArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertNotNull(doubleList20);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(sampleArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doubleList33);
        org.junit.Assert.assertNotNull(doubleList34);
        org.junit.Assert.assertNotNull(doubleList35);
        org.junit.Assert.assertNotNull(doubleList38);
        org.junit.Assert.assertNotNull(doubleList39);
        org.junit.Assert.assertNotNull(doubleList40);
        org.junit.Assert.assertEquals((double) double41, Double.NaN, 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test165");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        int int13 = micazMsg1.get_Voltage();
        micazMsg1.set_Voltage(100);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (-1), (int) (byte) -1);
        try {
            laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 1, data_length 24 and data array size 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test166");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 4, (long) (-139), 20);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test167");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5);
        laccan.devices.Type type9 = null;
        sample8.setType(type9);
        laccan.devices.Type type11 = null;
        sample8.setType(type11);
        sample8.setNode("hi!");
        keepingAll0.add(sample8);
        int int16 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        java.lang.Object obj20 = micazMsg18.clone();
        laccan.devices.Sample sample21 = new laccan.devices.Sample(micazMsg18);
        sample21.setTemperature((double) 2);
        keepingAll0.add(sample21);
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray27 = micazMsg26.get_Buffer();
        java.lang.Object obj28 = micazMsg26.clone();
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg26);
        laccan.devices.Type type30 = null;
        sample29.setType(type30);
        java.lang.String str32 = sample29.toString();
        sample29.setTemperature((double) (short) 10);
        java.lang.String[] strArray35 = sample29.toCSV();
        keepingAll0.add(sample29);
        laccan.memory.Memory memory37 = new laccan.memory.Memory();
        memory37.build();
        int int39 = memory37.length();
        laccan.memory.data.reduction.KeepingAll keepingAll40 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample41 = new laccan.devices.Sample();
        keepingAll40.add(sample41);
        sample41.setDate(10L);
        memory37.add(sample41);
        memory37.build();
        laccan.memory.Container container47 = memory37.getMemory();
        laccan.devices.Sample sample51 = new laccan.devices.Sample("memory", (double) (byte) -1, (long) ' ');
        java.lang.String str52 = sample51.getNode();
        memory37.add(sample51);
        keepingAll0.add(sample51);
        laccan.devices.MicazMsg micazMsg56 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray57 = micazMsg56.get_Buffer();
        java.lang.Object obj58 = micazMsg56.clone();
        int int59 = micazMsg56.get_NodeID();
        micazMsg56.setElement_Buffer(1, (short) (byte) 0);
        int int63 = micazMsg56.get_NodeID();
        laccan.devices.Sample sample64 = new laccan.devices.Sample(micazMsg56);
        java.lang.String str65 = sample64.toString();
        java.lang.String str66 = sample64.toString();
        keepingAll0.add(sample64);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "null;-19.699999999999996;0" + "'", str32.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(container47);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "memory" + "'", str52.equals("memory"));
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "null;-19.699999999999996;0" + "'", str65.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "null;-19.699999999999996;0" + "'", str66.equals("null;-19.699999999999996;0"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test168");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        short short12 = micazMsg1.getElement_Buffer(0);
        net.tinyos.message.Message message14 = micazMsg1.clone((int) (byte) 100);
        int int15 = micazMsg1.get_Voltage();
        micazMsg1.init((int) (short) 0);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = micazMsg19.get_Buffer();
        java.lang.Object obj21 = micazMsg19.clone();
        micazMsg19.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg19, (int) (byte) 0);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray28 = micazMsg27.get_Buffer();
        java.lang.Object obj29 = micazMsg27.clone();
        micazMsg27.set_NodeID(20);
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg(byteArray34);
        micazMsg27.dataSet(byteArray34);
        micazMsg19.dataSet(byteArray34);
        micazMsg1.dataSet(byteArray34, (int) (byte) 0, (int) (short) 0, (int) (byte) 0);
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg(byteArray34);
        int int43 = micazMsg42.baseOffset();
        try {
            short[] shortArray44 = micazMsg42.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test169");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        java.lang.String str7 = micazMsg1.toString();
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg9);
        int int12 = micazMsg9.get_NodeID();
        byte[] byteArray13 = micazMsg9.dataGet();
        micazMsg1.dataSet(byteArray13);
        micazMsg1.init(52);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test170");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray4 = micazMsg3.get_Buffer();
        java.lang.Object obj5 = micazMsg3.clone();
        micazMsg3.set_NodeID(20);
        short[] shortArray10 = new short[] { (byte) -1, (short) 0 };
        micazMsg3.set_Buffer(shortArray10);
        micazMsg1.set_Buffer(shortArray10);
        int int13 = micazMsg1.amType();
        micazMsg1.amTypeSet(32);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 172 + "'", int13 == 172);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test171");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) 'a', 116);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test172");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray6, 24);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray6, (int) '#');
        net.tinyos.message.SerialPacket serialPacket13 = micazMsg12.getSerialPacket();
        try {
            short short15 = micazMsg12.getElement_Buffer(48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNull(serialPacket13);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test173");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList4 = keepingAll0.get();
        laccan.memory.data.reduction.KeepingAll keepingAll5 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList6 = keepingAll5.get();
        int int7 = keepingAll5.length();
        java.util.List<laccan.devices.Sample> sampleList8 = keepingAll5.get();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg10);
        laccan.devices.Type type14 = null;
        sample13.setType(type14);
        laccan.devices.Type type16 = null;
        sample13.setType(type16);
        sample13.setNode("hi!");
        keepingAll5.add(sample13);
        keepingAll0.add(sample13);
        java.lang.String str22 = sample13.toString();
        double double23 = sample13.getDateDouble();
        double double24 = sample13.getDateDouble();
        java.lang.String str25 = sample13.toString();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(sampleList8);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!;-19.699999999999996;0" + "'", str22.equals("hi!;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!;-19.699999999999996;0" + "'", str25.equals("hi!;-19.699999999999996;0"));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test174");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        micazMsg1.set_NodeID((int) (byte) -1);
        java.lang.String str7 = micazMsg1.toString();
        micazMsg1.init((int) (short) 100);
        int int10 = micazMsg1.amType();
        int int11 = micazMsg1.baseOffset();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 172 + "'", int10 == 172);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test175");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((-139L), (long) 128, (-1));
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test176");
        laccan.devices.helper.utils.Assistant.reducerType = "null;-19.699999999999996;1;-19.699999999999996;0";
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test177");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll2 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll2.get();
        laccan.cloud.prediction.Regression regression4 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        laccan.devices.Sample sample10 = new laccan.devices.Sample();
        laccan.devices.Sample sample11 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray12 = new laccan.devices.Sample[] { sample9, sample10, sample11 };
        java.util.ArrayList<laccan.devices.Sample> sampleList13 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList13, sampleArray12);
        java.util.List<java.lang.Double> doubleList15 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList13);
        java.util.List<java.lang.Double> doubleList16 = regression4.result(doubleList15);
        regression0.init(sampleList3, doubleList15);
        laccan.cloud.prediction.Regression regression18 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = micazMsg20.get_Buffer();
        java.lang.Object obj22 = micazMsg20.clone();
        laccan.devices.Sample sample23 = new laccan.devices.Sample(micazMsg20);
        laccan.devices.Sample sample24 = new laccan.devices.Sample();
        laccan.devices.Sample sample25 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray26 = new laccan.devices.Sample[] { sample23, sample24, sample25 };
        java.util.ArrayList<laccan.devices.Sample> sampleList27 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList27, sampleArray26);
        java.util.List<java.lang.Double> doubleList29 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList27);
        java.util.List<java.lang.Double> doubleList30 = regression18.result(doubleList29);
        java.util.List<java.lang.Double> doubleList31 = regression0.result(doubleList29);
        double double32 = regression0.mse();
        laccan.cloud.prediction.Regression regression33 = new laccan.cloud.prediction.Regression();
        double double34 = regression33.mse();
        double double35 = regression33.mse();
        laccan.cloud.prediction.Regression regression36 = new laccan.cloud.prediction.Regression();
        laccan.cloud.prediction.Regression regression37 = new laccan.cloud.prediction.Regression();
        double double38 = regression37.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll39 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList40 = keepingAll39.get();
        laccan.cloud.prediction.Regression regression41 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg43 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray44 = micazMsg43.get_Buffer();
        java.lang.Object obj45 = micazMsg43.clone();
        laccan.devices.Sample sample46 = new laccan.devices.Sample(micazMsg43);
        laccan.devices.Sample sample47 = new laccan.devices.Sample();
        laccan.devices.Sample sample48 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray49 = new laccan.devices.Sample[] { sample46, sample47, sample48 };
        java.util.ArrayList<laccan.devices.Sample> sampleList50 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList50, sampleArray49);
        java.util.List<java.lang.Double> doubleList52 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList50);
        java.util.List<java.lang.Double> doubleList53 = regression41.result(doubleList52);
        regression37.init(sampleList40, doubleList52);
        java.util.List<java.lang.Double> doubleList55 = regression36.result(doubleList52);
        laccan.devices.MicazMsg micazMsg57 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray58 = micazMsg57.get_Buffer();
        java.lang.Object obj59 = micazMsg57.clone();
        laccan.devices.Sample sample60 = new laccan.devices.Sample(micazMsg57);
        laccan.devices.Sample sample61 = new laccan.devices.Sample();
        laccan.devices.Sample sample62 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray63 = new laccan.devices.Sample[] { sample60, sample61, sample62 };
        java.util.ArrayList<laccan.devices.Sample> sampleList64 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList64, sampleArray63);
        java.util.List<java.lang.Double> doubleList66 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList64);
        laccan.memory.data.reduction.KeepingAll keepingAll67 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample68 = new laccan.devices.Sample();
        keepingAll67.add(sample68);
        int int70 = keepingAll67.length();
        java.util.List<laccan.devices.Sample> sampleList71 = keepingAll67.get();
        java.util.List<laccan.devices.Sample> sampleList72 = keepingAll67.get();
        java.util.List<java.lang.Double> doubleList73 = laccan.cloud.prediction.Regression.makeTests(sampleList72);
        regression36.init((java.util.List<laccan.devices.Sample>) sampleList64, doubleList73);
        java.util.List<java.lang.Double> doubleList75 = regression33.result(doubleList73);
        java.util.List<java.lang.Double> doubleList76 = regression0.result(doubleList73);
        regression0.train();
        laccan.memory.data.reduction.KeepingAll keepingAll78 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList79 = keepingAll78.get();
        int int80 = keepingAll78.length();
        java.util.List<laccan.devices.Sample> sampleList81 = keepingAll78.get();
        java.util.List<laccan.devices.Sample> sampleList82 = keepingAll78.get();
        java.util.List<laccan.devices.Sample> sampleList83 = keepingAll78.get();
        java.util.List<java.lang.Double> doubleList84 = laccan.cloud.prediction.Regression.makeTests(sampleList83);
        java.util.List<java.lang.Double> doubleList85 = regression0.result(doubleList84);
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(sampleArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(sampleArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(doubleList29);
        org.junit.Assert.assertNotNull(doubleList30);
        org.junit.Assert.assertNotNull(doubleList31);
        org.junit.Assert.assertEquals((double) double32, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double34, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double35, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double38, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList40);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(sampleArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleList52);
        org.junit.Assert.assertNotNull(doubleList53);
        org.junit.Assert.assertNotNull(doubleList55);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(sampleArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(doubleList66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(sampleList71);
        org.junit.Assert.assertNotNull(sampleList72);
        org.junit.Assert.assertNotNull(doubleList73);
        org.junit.Assert.assertNotNull(doubleList75);
        org.junit.Assert.assertNotNull(doubleList76);
        org.junit.Assert.assertNotNull(sampleList79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(sampleList81);
        org.junit.Assert.assertNotNull(sampleList82);
        org.junit.Assert.assertNotNull(sampleList83);
        org.junit.Assert.assertNotNull(doubleList84);
        org.junit.Assert.assertNotNull(doubleList85);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test178");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        micazMsg1.set_Voltage((int) (short) 1);
        java.lang.Object obj18 = micazMsg1.clone();
        try {
            short short20 = micazMsg1.getElement_Buffer(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test179");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        int int10 = micazMsg1.amType();
        micazMsg1.set_NodeID(0);
        byte[] byteArray13 = micazMsg1.dataGet();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 172 + "'", int10 == 172);
        org.junit.Assert.assertNotNull(byteArray13);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test180");
        laccan.devices.Sample sample0 = new laccan.devices.Sample();
        laccan.devices.Type type1 = laccan.devices.Type.FULL;
        sample0.setType(type1);
        double double3 = sample0.getDateDouble();
        sample0.setDate((long) 100);
        long long6 = sample0.getDate();
        long long7 = sample0.getDate();
        long long8 = sample0.getDate();
        sample0.setDate(32L);
        sample0.setNode("memory;-19.699999999999996;3");
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + laccan.devices.Type.FULL + "'", type1.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test181");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        java.lang.String[] strArray10 = sample9.toCSV();
        sample9.setNode("hi!");
        java.lang.String str13 = sample9.getNode();
        double double14 = sample9.getTemperature();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-19.648499999999995d) + "'", double14 == (-19.648499999999995d));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test182");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.get_NodeID();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        java.lang.Class<?> wildcardClass10 = micazMsg1.getClass();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg12);
        int int15 = micazMsg12.get_NodeID();
        byte[] byteArray16 = micazMsg12.dataGet();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray16);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = micazMsg19.get_Buffer();
        java.lang.Object obj21 = micazMsg19.clone();
        int int22 = micazMsg19.get_NodeID();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray25);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray25, 2);
        micazMsg19.dataSet(byteArray25);
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray25);
        micazMsg17.dataSet(byteArray25);
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg(byteArray25);
        micazMsg1.dataSet(byteArray25);
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg(byteArray25, (int) (short) 1);
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg(byteArray25);
        net.tinyos.message.Message message38 = micazMsg36.clone(128);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(message38);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test183");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        java.lang.String str13 = micazMsg10.toString();
        short[] shortArray14 = micazMsg10.get_Buffer();
        byte[] byteArray15 = micazMsg10.dataGet();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray15);
        micazMsg1.dataSet(byteArray15);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray15);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray15);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray15, 112);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test184");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray6, (int) (short) 100);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray6, (int) (byte) 1);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray6, (int) (short) 100);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg15);
        int int18 = micazMsg15.dataLength();
        micazMsg15.init((int) '4');
        micazMsg15.init((int) '4');
        micazMsg15.set_Voltage(20);
        byte[] byteArray25 = micazMsg15.dataGet();
        try {
            micazMsg13.dataSet(byteArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(byteArray25);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test185");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        micazMsg13.amTypeSet(1);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray20);
        micazMsg13.dataSet(byteArray20);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray20, (int) ' ');
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray20);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray20);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test186");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        micazMsg1.set_Voltage((int) (short) 1);
        int int18 = micazMsg1.dataLength();
        short short20 = micazMsg1.getElement_Buffer(4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 1 + "'", short20 == (short) 1);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test187");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, 2);
        micazMsg1.dataSet(byteArray7);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        int int18 = micazMsg15.get_NodeID();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray21);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray21, 2);
        micazMsg15.dataSet(byteArray21);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray21, (int) (short) 10);
        micazMsg13.dataSet(byteArray21);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray21);
        micazMsg29.amTypeSet((int) (byte) 10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test188");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample();
        laccan.devices.Type type11 = laccan.devices.Type.FULL;
        sample10.setType(type11);
        sample9.setType(type11);
        double double14 = sample9.getDateDouble();
        java.lang.String str15 = sample9.toString();
        sample9.setTemperature(0.0d);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null;-19.648499999999995;0" + "'", str15.equals("null;-19.648499999999995;0"));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test189");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5);
        laccan.devices.Type type9 = null;
        sample8.setType(type9);
        laccan.devices.Type type11 = null;
        sample8.setType(type11);
        sample8.setNode("hi!");
        keepingAll0.add(sample8);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg17);
        laccan.devices.Type type21 = null;
        sample20.setType(type21);
        java.lang.String str23 = sample20.toString();
        java.lang.String str24 = sample20.getNode();
        keepingAll0.add(sample20);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray28 = micazMsg27.get_Buffer();
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg27);
        int int30 = micazMsg27.dataLength();
        micazMsg27.init((int) '4');
        laccan.devices.Sample sample33 = new laccan.devices.Sample(micazMsg27);
        double double34 = sample33.getDateDouble();
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray42 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg36.set_Buffer(shortArray42);
        laccan.devices.Sample sample44 = new laccan.devices.Sample(micazMsg36);
        laccan.devices.Sample sample45 = new laccan.devices.Sample();
        laccan.devices.Type type46 = laccan.devices.Type.FULL;
        sample45.setType(type46);
        sample44.setType(type46);
        sample44.setTemperature((double) 'a');
        laccan.devices.Type type51 = sample44.getType();
        sample33.setType(type51);
        laccan.devices.MicazMsg micazMsg54 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray55 = micazMsg54.get_Buffer();
        laccan.devices.Sample sample56 = new laccan.devices.Sample(micazMsg54);
        int int57 = micazMsg54.dataLength();
        micazMsg54.init((int) '4');
        laccan.devices.Sample sample60 = new laccan.devices.Sample(micazMsg54);
        double double61 = sample60.getDateDouble();
        laccan.devices.MicazMsg micazMsg63 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray69 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg63.set_Buffer(shortArray69);
        laccan.devices.Sample sample71 = new laccan.devices.Sample(micazMsg63);
        laccan.devices.Sample sample72 = new laccan.devices.Sample();
        laccan.devices.Type type73 = laccan.devices.Type.FULL;
        sample72.setType(type73);
        sample71.setType(type73);
        sample71.setTemperature((double) 'a');
        laccan.devices.Type type78 = sample71.getType();
        sample60.setType(type78);
        sample33.setType(type78);
        double double81 = sample33.getDateDouble();
        keepingAll0.add(sample33);
        laccan.devices.MicazMsg micazMsg85 = new laccan.devices.MicazMsg(52, 0);
        laccan.devices.Sample sample86 = new laccan.devices.Sample(micazMsg85);
        long long87 = sample86.getDate();
        keepingAll0.add(sample86);
        int int89 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList90 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList91 = keepingAll0.get();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "null;-19.699999999999996;0" + "'", str23.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertTrue("'" + type46 + "' != '" + laccan.devices.Type.FULL + "'", type46.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type51 + "' != '" + laccan.devices.Type.FULL + "'", type51.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 52 + "'", int57 == 52);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertTrue("'" + type73 + "' != '" + laccan.devices.Type.FULL + "'", type73.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type78 + "' != '" + laccan.devices.Type.FULL + "'", type78.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 4 + "'", int89 == 4);
        org.junit.Assert.assertNotNull(sampleList90);
        org.junit.Assert.assertNotNull(sampleList91);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test190");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1);
        int int11 = micazMsg1.dataLength();
        micazMsg1.amTypeSet((int) '#');
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test191");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        java.lang.Object obj10 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg13, 0);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg15, (int) (short) 0);
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg1, (long) 3);
        sample19.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;10.0;35");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(serialPacket11);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test192");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(0, 64);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test193");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        short[] shortArray2 = micazMsg1.get_Buffer();
        net.tinyos.message.SerialPacket serialPacket3 = micazMsg1.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(serialPacket3);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test194");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory;-19.699999999999996;-1", (double) 24, 32L);
        java.lang.String[] strArray4 = sample3.toCSV();
        sample3.setNode("null;-19.694999999999997;1");
        sample3.setDate((long) 10);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test195");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        memory0.build();
        laccan.memory.Container container10 = memory0.getMemory();
        laccan.devices.Sample sample14 = new laccan.devices.Sample("memory", (double) (byte) -1, (long) ' ');
        java.lang.String str15 = sample14.getNode();
        memory0.add(sample14);
        laccan.memory.Container container17 = memory0.getMemory();
        laccan.memory.Container container18 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "memory" + "'", str15.equals("memory"));
        org.junit.Assert.assertNotNull(container17);
        org.junit.Assert.assertNotNull(container18);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test196");
        byte[] byteArray0 = null;
        try {
            laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(byteArray0, (-30));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test197");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        micazMsg1.set_Voltage((int) (short) 1);
        int int18 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = micazMsg20.get_Buffer();
        java.lang.Object obj22 = micazMsg20.clone();
        micazMsg20.amTypeSet(20);
        int int25 = micazMsg20.baseOffset();
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg20, 0);
        int int28 = micazMsg27.get_Voltage();
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg31.amTypeSet(2);
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray36 = micazMsg35.get_Buffer();
        java.lang.Object obj37 = micazMsg35.clone();
        java.lang.String str38 = micazMsg35.toString();
        short[] shortArray39 = micazMsg35.get_Buffer();
        micazMsg31.set_Buffer(shortArray39);
        micazMsg27.set_Buffer(shortArray39);
        micazMsg1.set_Buffer(shortArray39);
        laccan.devices.Sample sample43 = new laccan.devices.Sample(micazMsg1);
        sample43.setNode("memory;-19.699999999999996;-1");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str38.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray39);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test198");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray3 = micazMsg2.get_Buffer();
        java.lang.Object obj4 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2);
        laccan.devices.Type type6 = null;
        sample5.setType(type6);
        keepingAll0.add(sample5);
        java.util.List<laccan.devices.Sample> sampleList9 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        java.lang.Object obj13 = micazMsg11.clone();
        net.tinyos.message.SerialPacket serialPacket14 = micazMsg11.getSerialPacket();
        java.lang.Object obj15 = micazMsg11.clone();
        laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg11, (long) 8);
        keepingAll0.add(sample17);
        sample17.setTemperature((double) 32);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(sampleList9);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(serialPacket14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test199");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        int int9 = memory0.length();
        int int10 = memory0.length();
        laccan.memory.Container container11 = memory0.getMemory();
        memory0.build();
        memory0.build();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg15);
        long long19 = sample18.getDate();
        laccan.devices.Type type20 = laccan.devices.Type.FULL;
        sample18.setType(type20);
        sample18.setNode("reduction");
        java.lang.String str24 = sample18.toString();
        sample18.setNode("reduction;-19.699999999999996;0");
        sample18.setTemperature((double) (-1L));
        sample18.setTemperature((double) 100L);
        java.lang.String str31 = sample18.getNode();
        memory0.add(sample18);
        java.lang.String str33 = sample18.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + laccan.devices.Type.FULL + "'", type20.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "reduction;-19.699999999999996;0" + "'", str24.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "reduction;-19.699999999999996;0" + "'", str31.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "reduction;-19.699999999999996;0;100.0;0" + "'", str33.equals("reduction;-19.699999999999996;0;100.0;0"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test200");
        laccan.devices.helper.utils.Assistant.predictorType = "null;-19.648499999999995;32";
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test201");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        micazMsg1.amTypeSet(0);
        micazMsg1.set_NodeID((int) (byte) -1);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 16);
        java.lang.Object obj14 = micazMsg13.clone();
        short short16 = micazMsg13.getElement_Buffer((int) (short) 0);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        java.lang.Object obj20 = micazMsg18.clone();
        int int21 = micazMsg18.get_NodeID();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray24);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray24, 2);
        micazMsg18.dataSet(byteArray24);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray24);
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray24);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg(byteArray24);
        micazMsg13.dataSet(byteArray24);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test202");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray5 = micazMsg4.get_Buffer();
        java.lang.Object obj6 = micazMsg4.clone();
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg4);
        long long8 = sample7.getDate();
        java.lang.Class<?> wildcardClass9 = sample7.getClass();
        java.lang.String str10 = sample7.getNode();
        sample7.setNode("full_memory");
        memory0.add(sample7);
        laccan.memory.data.reduction.KeepingAll keepingAll14 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList15 = keepingAll14.get();
        int int16 = keepingAll14.length();
        java.util.List<laccan.devices.Sample> sampleList17 = keepingAll14.get();
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = micazMsg19.get_Buffer();
        java.lang.Object obj21 = micazMsg19.clone();
        laccan.devices.Sample sample22 = new laccan.devices.Sample(micazMsg19);
        laccan.devices.Type type23 = null;
        sample22.setType(type23);
        laccan.devices.Type type25 = null;
        sample22.setType(type25);
        sample22.setNode("hi!");
        keepingAll14.add(sample22);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray32 = micazMsg31.get_Buffer();
        java.lang.Object obj33 = micazMsg31.clone();
        laccan.devices.Sample sample34 = new laccan.devices.Sample(micazMsg31);
        laccan.devices.Type type35 = null;
        sample34.setType(type35);
        java.lang.String str37 = sample34.toString();
        java.lang.String str38 = sample34.getNode();
        keepingAll14.add(sample34);
        laccan.devices.Sample sample40 = new laccan.devices.Sample();
        laccan.devices.Type type41 = laccan.devices.Type.FULL;
        sample40.setType(type41);
        sample34.setType(type41);
        double double44 = sample34.getTemperature();
        sample34.setNode("");
        memory0.add(sample34);
        laccan.devices.Type type48 = sample34.getType();
        sample34.setNode("memory;-1.0;32");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(sampleList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(sampleList17);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "null;-19.699999999999996;0" + "'", str37.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + type41 + "' != '" + laccan.devices.Type.FULL + "'", type41.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-19.699999999999996d) + "'", double44 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + type48 + "' != '" + laccan.devices.Type.FULL + "'", type48.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test203");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5);
        long long9 = sample8.getDate();
        java.lang.Class<?> wildcardClass10 = sample8.getClass();
        keepingAll0.add(sample8);
        java.util.List<laccan.devices.Sample> sampleList12 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(52, 0);
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg15);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        java.lang.Object obj20 = micazMsg18.clone();
        laccan.devices.Sample sample21 = new laccan.devices.Sample(micazMsg18);
        sample21.setTemperature((double) 16);
        double double24 = sample21.getTemperature();
        laccan.devices.Sample sample25 = new laccan.devices.Sample();
        double double26 = sample25.getDateDouble();
        double double27 = sample25.getDateDouble();
        sample25.setTemperature((double) 1);
        double double30 = sample25.getDateDouble();
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray38 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg32.set_Buffer(shortArray38);
        laccan.devices.Sample sample40 = new laccan.devices.Sample(micazMsg32);
        laccan.devices.Sample sample41 = new laccan.devices.Sample();
        laccan.devices.Type type42 = laccan.devices.Type.FULL;
        sample41.setType(type42);
        sample40.setType(type42);
        double double45 = sample40.getDateDouble();
        double double46 = sample40.getTemperature();
        laccan.devices.Type type47 = sample40.getType();
        sample25.setType(type47);
        sample21.setType(type47);
        sample16.setType(type47);
        keepingAll0.add(sample16);
        java.lang.String str52 = sample16.getNode();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(sampleList12);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 16.0d + "'", double24 == 16.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertTrue("'" + type42 + "' != '" + laccan.devices.Type.FULL + "'", type42.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-19.648499999999995d) + "'", double46 == (-19.648499999999995d));
        org.junit.Assert.assertTrue("'" + type47 + "' != '" + laccan.devices.Type.FULL + "'", type47.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test204");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.dataLength();
        net.tinyos.message.SerialPacket serialPacket3 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (byte) 10);
        micazMsg1.set_Voltage(16);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray10, 2);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray10);
        micazMsg1.dataSet(byteArray10);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        int int20 = micazMsg17.get_NodeID();
        micazMsg17.setElement_Buffer(1, (short) (byte) 0);
        int int24 = micazMsg17.get_NodeID();
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg17);
        java.lang.Class<?> wildcardClass26 = micazMsg17.getClass();
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray29 = micazMsg28.get_Buffer();
        laccan.devices.Sample sample30 = new laccan.devices.Sample(micazMsg28);
        int int31 = micazMsg28.get_NodeID();
        byte[] byteArray32 = micazMsg28.dataGet();
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg(byteArray32);
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray36 = micazMsg35.get_Buffer();
        java.lang.Object obj37 = micazMsg35.clone();
        int int38 = micazMsg35.get_NodeID();
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg(byteArray41);
        laccan.devices.MicazMsg micazMsg44 = new laccan.devices.MicazMsg(byteArray41, 2);
        micazMsg35.dataSet(byteArray41);
        laccan.devices.MicazMsg micazMsg46 = new laccan.devices.MicazMsg(byteArray41);
        micazMsg33.dataSet(byteArray41);
        laccan.devices.MicazMsg micazMsg48 = new laccan.devices.MicazMsg(byteArray41);
        micazMsg17.dataSet(byteArray41);
        laccan.devices.MicazMsg micazMsg51 = new laccan.devices.MicazMsg(byteArray41, (int) (short) 1);
        laccan.devices.MicazMsg micazMsg53 = new laccan.devices.MicazMsg(byteArray41, 32);
        try {
            micazMsg1.dataSet(byteArray41, 128, 20, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNull(serialPacket3);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteArray41);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test205");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        java.util.List<laccan.devices.Sample> sampleList1 = storageCSV0.read();
        java.lang.Class<?> wildcardClass2 = storageCSV0.getClass();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test206");
        byte[] byteArray0 = null;
        try {
            laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(byteArray0, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test207");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        int int3 = micazMsg1.get_NodeID();
        java.lang.Object obj4 = micazMsg1.clone();
        micazMsg1.init((int) (short) 10);
        java.lang.String str7 = micazMsg1.toString();
        try {
            short short9 = micazMsg1.getElement_Buffer(128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 " + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 "));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test208");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone((int) ' ');
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray12, 16);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray12);
        message9.dataSet(byteArray12);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray12, (int) ' ');
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray12, 4);
        int int21 = micazMsg20.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test209");
        laccan.devices.helper.utils.Assistant.reducerType = "null;-19.699999999999996;100";
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test210");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        int int7 = micazMsg1.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test211");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        int int5 = micazMsg2.dataLength();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 4);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg9, 0);
        short[] shortArray12 = micazMsg9.get_Buffer();
        micazMsg2.set_Buffer(shortArray12);
        java.lang.String str14 = micazMsg2.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str14.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test212");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        memory0.build();
        int int3 = memory0.length();
        java.lang.Class<?> wildcardClass4 = memory0.getClass();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        long long10 = sample9.getDate();
        laccan.devices.Type type11 = laccan.devices.Type.FULL;
        sample9.setType(type11);
        sample9.setNode("reduction");
        java.lang.String str15 = sample9.toString();
        java.lang.String str16 = sample9.toString();
        memory0.add(sample9);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = micazMsg19.get_Buffer();
        java.lang.Object obj21 = micazMsg19.clone();
        int int22 = micazMsg19.get_NodeID();
        micazMsg19.setElement_Buffer(1, (short) (byte) 0);
        int int26 = micazMsg19.get_NodeID();
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg19);
        java.lang.String str28 = sample27.toString();
        memory0.add(sample27);
        sample27.setTemperature((double) (-139));
        java.lang.String str32 = sample27.getNode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "reduction;-19.699999999999996;0" + "'", str15.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "reduction;-19.699999999999996;0" + "'", str16.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "null;-19.699999999999996;0" + "'", str28.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test213");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        int int4 = micazMsg2.get_NodeID();
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) (byte) -1);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        java.lang.String str11 = micazMsg8.toString();
        short[] shortArray12 = micazMsg8.get_Buffer();
        micazMsg2.set_Buffer(shortArray12);
        micazMsg2.set_Voltage(0);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray20, 48);
        micazMsg2.dataSet(byteArray20);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray20);
        byte[] byteArray25 = micazMsg24.dataGet();
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray25);
        int int27 = micazMsg26.get_NodeID();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 266 + "'", int27 == 266);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test214");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.dataLength();
        net.tinyos.message.SerialPacket serialPacket3 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (byte) 10);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1);
        sample7.setTemperature((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNull(serialPacket3);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test215");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer(48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test216");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 20);
        int int11 = micazMsg1.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test217");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0);
        int int9 = micazMsg8.get_Voltage();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg11);
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg11, (long) (short) 10);
        net.tinyos.message.SerialPacket serialPacket16 = micazMsg11.getSerialPacket();
        byte[] byteArray17 = micazMsg11.dataGet();
        short[] shortArray18 = micazMsg11.get_Buffer();
        micazMsg8.set_Buffer(shortArray18);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNull(serialPacket16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(shortArray18);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test218");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        java.lang.Object obj10 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg1);
        net.tinyos.message.Message message14 = micazMsg1.clone(0);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = micazMsg16.get_Buffer();
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg16);
        int int19 = micazMsg16.get_NodeID();
        byte[] byteArray20 = micazMsg16.dataGet();
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray20);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = micazMsg23.get_Buffer();
        java.lang.Object obj25 = micazMsg23.clone();
        int int26 = micazMsg23.get_NodeID();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray29);
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg(byteArray29, 2);
        micazMsg23.dataSet(byteArray29);
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg(byteArray29);
        micazMsg21.dataSet(byteArray29);
        byte[] byteArray36 = micazMsg21.dataGet();
        micazMsg1.dataSet(byteArray36);
        int int38 = micazMsg1.get_NodeID();
        net.tinyos.message.Message message40 = micazMsg1.clone((int) (byte) 1);
        int int41 = message40.dataLength();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 256 + "'", int38 == 256);
        org.junit.Assert.assertNotNull(message40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test219");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll2 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll2.get();
        laccan.cloud.prediction.Regression regression4 = new laccan.cloud.prediction.Regression();
        double double5 = regression4.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll6 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList7 = keepingAll6.get();
        laccan.cloud.prediction.Regression regression8 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg10);
        laccan.devices.Sample sample14 = new laccan.devices.Sample();
        laccan.devices.Sample sample15 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray16 = new laccan.devices.Sample[] { sample13, sample14, sample15 };
        java.util.ArrayList<laccan.devices.Sample> sampleList17 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList17, sampleArray16);
        java.util.List<java.lang.Double> doubleList19 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList17);
        java.util.List<java.lang.Double> doubleList20 = regression8.result(doubleList19);
        regression4.init(sampleList7, doubleList19);
        laccan.cloud.prediction.Regression regression22 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray25 = micazMsg24.get_Buffer();
        java.lang.Object obj26 = micazMsg24.clone();
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg24);
        laccan.devices.Sample sample28 = new laccan.devices.Sample();
        laccan.devices.Sample sample29 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray30 = new laccan.devices.Sample[] { sample27, sample28, sample29 };
        java.util.ArrayList<laccan.devices.Sample> sampleList31 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList31, sampleArray30);
        java.util.List<java.lang.Double> doubleList33 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList31);
        java.util.List<java.lang.Double> doubleList34 = regression22.result(doubleList33);
        java.util.List<java.lang.Double> doubleList35 = regression4.result(doubleList33);
        regression0.init(sampleList3, doubleList33);
        regression0.train();
        java.util.List<java.lang.Double> doubleList38 = regression0.result();
        regression0.train();
        java.util.List<java.lang.Double> doubleList40 = regression0.result();
        regression0.train();
        laccan.memory.data.reduction.KeepingAll keepingAll42 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList43 = keepingAll42.get();
        int int44 = keepingAll42.length();
        java.util.List<laccan.devices.Sample> sampleList45 = keepingAll42.get();
        java.util.List<laccan.devices.Sample> sampleList46 = keepingAll42.get();
        java.util.List<laccan.devices.Sample> sampleList47 = keepingAll42.get();
        java.util.List<java.lang.Double> doubleList48 = laccan.cloud.prediction.Regression.makeTests(sampleList47);
        laccan.memory.data.reduction.KeepingAll keepingAll49 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList50 = keepingAll49.get();
        int int51 = keepingAll49.length();
        java.util.List<laccan.devices.Sample> sampleList52 = keepingAll49.get();
        java.util.List<laccan.devices.Sample> sampleList53 = keepingAll49.get();
        java.util.List<laccan.devices.Sample> sampleList54 = keepingAll49.get();
        java.util.List<java.lang.Double> doubleList55 = laccan.cloud.prediction.Regression.makeTests(sampleList54);
        regression0.init(sampleList47, doubleList55);
        java.util.List<java.lang.Double> doubleList57 = laccan.cloud.prediction.Regression.makeTests(sampleList47);
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertEquals((double) double5, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(sampleArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertNotNull(doubleList20);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(sampleArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doubleList33);
        org.junit.Assert.assertNotNull(doubleList34);
        org.junit.Assert.assertNotNull(doubleList35);
        org.junit.Assert.assertNotNull(doubleList38);
        org.junit.Assert.assertNotNull(doubleList40);
        org.junit.Assert.assertNotNull(sampleList43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(sampleList45);
        org.junit.Assert.assertNotNull(sampleList46);
        org.junit.Assert.assertNotNull(sampleList47);
        org.junit.Assert.assertNotNull(doubleList48);
        org.junit.Assert.assertNotNull(sampleList50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(sampleList52);
        org.junit.Assert.assertNotNull(sampleList53);
        org.junit.Assert.assertNotNull(sampleList54);
        org.junit.Assert.assertNotNull(doubleList55);
        org.junit.Assert.assertNotNull(doubleList57);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test220");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        micazMsg1.amTypeSet(52);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray10, 48);
        micazMsg1.dataSet(byteArray10);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray16);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray16, 2);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray16);
        micazMsg20.set_NodeID((int) (byte) 10);
        byte[] byteArray23 = micazMsg20.dataGet();
        micazMsg1.dataSet(byteArray23);
        net.tinyos.message.Message message26 = micazMsg1.clone(20);
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg1);
        micazMsg1.set_Voltage((int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(message26);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test221");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        micazMsg1.amTypeSet(512);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, 32);
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg10);
        java.lang.Object obj12 = micazMsg10.clone();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test222");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(0, (int) ' ');
        net.tinyos.message.SerialPacket serialPacket3 = micazMsg2.getSerialPacket();
        org.junit.Assert.assertNull(serialPacket3);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test223");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 100);
        long long11 = sample10.getDate();
        double double12 = sample10.getDateDouble();
        laccan.devices.Type type13 = sample10.getType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNull(type13);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test224");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone(2);
        byte[] byteArray10 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray10);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray10);
        net.tinyos.message.SerialPacket serialPacket13 = micazMsg12.getSerialPacket();
        short short15 = micazMsg12.getElement_Buffer(3);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNull(serialPacket13);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test225");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        micazMsg1.set_Voltage(20);
        micazMsg1.set_NodeID(10);
        micazMsg1.init(51);
        java.lang.Class<?> wildcardClass15 = micazMsg1.getClass();
        byte[] byteArray16 = micazMsg1.dataGet();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(byteArray16);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test226");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        memory0.build();
        laccan.memory.Container container10 = memory0.getMemory();
        memory0.build();
        laccan.memory.Container container12 = memory0.getMemory();
        memory0.build();
        memory0.build();
        laccan.memory.Container container15 = memory0.getMemory();
        java.util.List<laccan.devices.Sample> sampleList16 = container15.get();
        java.util.List<java.lang.Double> doubleList17 = laccan.cloud.prediction.Regression.makeTests(sampleList16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container12);
        org.junit.Assert.assertNotNull(container15);
        org.junit.Assert.assertNotNull(sampleList16);
        org.junit.Assert.assertNotNull(doubleList17);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test227");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        int int3 = micazMsg1.get_NodeID();
        java.lang.Object obj4 = micazMsg1.clone();
        micazMsg1.init((int) (short) 10);
        net.tinyos.message.SerialPacket serialPacket7 = micazMsg1.getSerialPacket();
        net.tinyos.message.Message message9 = micazMsg1.clone((int) (byte) 0);
        byte[] byteArray10 = micazMsg1.dataGet();
        micazMsg1.amTypeSet(112);
        int int13 = micazMsg1.get_Voltage();
        int int14 = micazMsg1.get_NodeID();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(serialPacket7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test228");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer(14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test229");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray6);
        java.lang.String str9 = micazMsg8.toString();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg8, (int) (short) 10, (int) ' ');
        java.lang.String str13 = micazMsg12.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test230");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        int int9 = micazMsg1.get_Voltage();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg1, (long) 20);
        sample11.setTemperature((double) 51);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test231");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.699999999999996;-1", (double) 32, 52L);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test232");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        long long10 = sample9.getDate();
        long long11 = sample9.getDate();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test233");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        java.lang.Object obj11 = micazMsg9.clone();
        int int12 = micazMsg9.get_NodeID();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray15);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray15, 2);
        micazMsg9.dataSet(byteArray15);
        micazMsg1.dataSet(byteArray15);
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray15, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray15);
        try {
            laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg23, (long) 14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test234");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5);
        laccan.devices.Type type9 = null;
        sample8.setType(type9);
        laccan.devices.Type type11 = null;
        sample8.setType(type11);
        sample8.setNode("hi!");
        keepingAll0.add(sample8);
        laccan.devices.Type type16 = sample8.getType();
        sample8.setDate((long) (-1));
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(type16);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test235");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        laccan.devices.Type type6 = laccan.devices.Type.FULL;
        sample4.setType(type6);
        sample4.setNode("reduction");
        java.lang.String[] strArray10 = sample4.toCSV();
        java.lang.String str11 = sample4.getNode();
        double double12 = sample4.getDateDouble();
        sample4.setNode("null;-19.699999999999996;10");
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "reduction" + "'", str11.equals("reduction"));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test236");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg10);
        int int13 = micazMsg10.get_NodeID();
        micazMsg10.amTypeSet((int) (byte) 100);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg10, (int) (short) 0);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 1);
        micazMsg19.init(65);
        int int22 = micazMsg19.amType();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 172 + "'", int22 == 172);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test237");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 10);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (short) 1);
        try {
            micazMsg11.setElement_Buffer((int) (short) 10, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test238");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '#', (-1));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test239");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll2 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll2.get();
        laccan.cloud.prediction.Regression regression4 = new laccan.cloud.prediction.Regression();
        double double5 = regression4.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll6 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList7 = keepingAll6.get();
        laccan.cloud.prediction.Regression regression8 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg10);
        laccan.devices.Sample sample14 = new laccan.devices.Sample();
        laccan.devices.Sample sample15 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray16 = new laccan.devices.Sample[] { sample13, sample14, sample15 };
        java.util.ArrayList<laccan.devices.Sample> sampleList17 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList17, sampleArray16);
        java.util.List<java.lang.Double> doubleList19 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList17);
        java.util.List<java.lang.Double> doubleList20 = regression8.result(doubleList19);
        regression4.init(sampleList7, doubleList19);
        laccan.cloud.prediction.Regression regression22 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray25 = micazMsg24.get_Buffer();
        java.lang.Object obj26 = micazMsg24.clone();
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg24);
        laccan.devices.Sample sample28 = new laccan.devices.Sample();
        laccan.devices.Sample sample29 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray30 = new laccan.devices.Sample[] { sample27, sample28, sample29 };
        java.util.ArrayList<laccan.devices.Sample> sampleList31 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList31, sampleArray30);
        java.util.List<java.lang.Double> doubleList33 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList31);
        java.util.List<java.lang.Double> doubleList34 = regression22.result(doubleList33);
        java.util.List<java.lang.Double> doubleList35 = regression4.result(doubleList33);
        regression0.init(sampleList3, doubleList33);
        regression0.train();
        java.util.List<java.lang.Double> doubleList38 = regression0.result();
        double double39 = regression0.mse();
        java.util.List<java.lang.Double> doubleList40 = regression0.result();
        java.util.List<java.lang.Double> doubleList41 = regression0.result();
        java.util.List<java.lang.Double> doubleList42 = regression0.result();
        java.util.List<java.lang.Double> doubleList43 = regression0.result();
        java.util.List<java.lang.Double> doubleList44 = regression0.result();
        java.util.List<java.lang.Double> doubleList45 = regression0.result();
        laccan.devices.MicazMsg micazMsg47 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray48 = micazMsg47.get_Buffer();
        java.lang.Object obj49 = micazMsg47.clone();
        laccan.devices.Sample sample50 = new laccan.devices.Sample(micazMsg47);
        laccan.devices.Sample sample51 = new laccan.devices.Sample();
        laccan.devices.Sample sample52 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray53 = new laccan.devices.Sample[] { sample50, sample51, sample52 };
        java.util.ArrayList<laccan.devices.Sample> sampleList54 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList54, sampleArray53);
        java.util.List<java.lang.Double> doubleList56 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList54);
        java.util.List<java.lang.Double> doubleList57 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList54);
        java.util.List<java.lang.Double> doubleList58 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList54);
        java.util.List<java.lang.Double> doubleList59 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList54);
        java.util.List<java.lang.Double> doubleList60 = regression0.result(doubleList59);
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertEquals((double) double5, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(sampleArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertNotNull(doubleList20);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(sampleArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doubleList33);
        org.junit.Assert.assertNotNull(doubleList34);
        org.junit.Assert.assertNotNull(doubleList35);
        org.junit.Assert.assertNotNull(doubleList38);
        org.junit.Assert.assertEquals((double) double39, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList40);
        org.junit.Assert.assertNotNull(doubleList41);
        org.junit.Assert.assertNotNull(doubleList42);
        org.junit.Assert.assertNotNull(doubleList43);
        org.junit.Assert.assertNotNull(doubleList44);
        org.junit.Assert.assertNotNull(doubleList45);
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(sampleArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(doubleList56);
        org.junit.Assert.assertNotNull(doubleList57);
        org.junit.Assert.assertNotNull(doubleList58);
        org.junit.Assert.assertNotNull(doubleList59);
        org.junit.Assert.assertNotNull(doubleList60);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test240");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5);
        laccan.devices.Type type9 = null;
        sample8.setType(type9);
        laccan.devices.Type type11 = null;
        sample8.setType(type11);
        sample8.setNode("hi!");
        keepingAll0.add(sample8);
        int int16 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList17 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg20.amTypeSet(2);
        laccan.devices.Sample sample24 = new laccan.devices.Sample(micazMsg20, (long) 512);
        laccan.devices.Type type25 = sample24.getType();
        keepingAll0.add(sample24);
        laccan.devices.Sample sample27 = null;
        keepingAll0.add(sample27);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(sampleList17);
        org.junit.Assert.assertNull(type25);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test241");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.699999999999996;24", (double) (byte) 10, (long) 64);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test242");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        micazMsg1.amTypeSet(52);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray10, 48);
        micazMsg1.dataSet(byteArray10);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray10);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray10);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray23 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg17.set_Buffer(shortArray23);
        java.lang.String str25 = micazMsg17.toString();
        java.lang.Object obj26 = micazMsg17.clone();
        net.tinyos.message.SerialPacket serialPacket27 = micazMsg17.getSerialPacket();
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg17);
        net.tinyos.message.Message message30 = micazMsg17.clone(0);
        byte[] byteArray31 = message30.dataGet();
        micazMsg15.dataSet(byteArray31);
        micazMsg15.amTypeSet(20);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str25.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(serialPacket27);
        org.junit.Assert.assertNotNull(message30);
        org.junit.Assert.assertNotNull(byteArray31);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test243");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        memory0.build();
        int int4 = memory0.length();
        int int5 = memory0.length();
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test244");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        laccan.devices.Type type6 = laccan.devices.Type.FULL;
        sample4.setType(type6);
        sample4.setNode("reduction");
        java.lang.String str10 = sample4.toString();
        sample4.setNode("reduction;-19.699999999999996;0");
        sample4.setTemperature((double) (-1L));
        double double15 = sample4.getDateDouble();
        sample4.setDate((long) (short) 0);
        long long18 = sample4.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "reduction;-19.699999999999996;0" + "'", str10.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test245");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(4, 32);
        try {
            laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 83, data_length 24 and data array size 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test246");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;16.0;100", 35.0d, (long) 116);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test247");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll2 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll2.get();
        laccan.cloud.prediction.Regression regression4 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        laccan.devices.Sample sample10 = new laccan.devices.Sample();
        laccan.devices.Sample sample11 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray12 = new laccan.devices.Sample[] { sample9, sample10, sample11 };
        java.util.ArrayList<laccan.devices.Sample> sampleList13 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList13, sampleArray12);
        java.util.List<java.lang.Double> doubleList15 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList13);
        java.util.List<java.lang.Double> doubleList16 = regression4.result(doubleList15);
        regression0.init(sampleList3, doubleList15);
        laccan.cloud.prediction.Regression regression18 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = micazMsg20.get_Buffer();
        java.lang.Object obj22 = micazMsg20.clone();
        laccan.devices.Sample sample23 = new laccan.devices.Sample(micazMsg20);
        laccan.devices.Sample sample24 = new laccan.devices.Sample();
        laccan.devices.Sample sample25 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray26 = new laccan.devices.Sample[] { sample23, sample24, sample25 };
        java.util.ArrayList<laccan.devices.Sample> sampleList27 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList27, sampleArray26);
        java.util.List<java.lang.Double> doubleList29 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList27);
        java.util.List<java.lang.Double> doubleList30 = regression18.result(doubleList29);
        java.util.List<java.lang.Double> doubleList31 = regression0.result(doubleList29);
        laccan.cloud.prediction.Regression regression32 = new laccan.cloud.prediction.Regression();
        double double33 = regression32.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll34 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList35 = keepingAll34.get();
        laccan.cloud.prediction.Regression regression36 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray39 = micazMsg38.get_Buffer();
        java.lang.Object obj40 = micazMsg38.clone();
        laccan.devices.Sample sample41 = new laccan.devices.Sample(micazMsg38);
        laccan.devices.Sample sample42 = new laccan.devices.Sample();
        laccan.devices.Sample sample43 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray44 = new laccan.devices.Sample[] { sample41, sample42, sample43 };
        java.util.ArrayList<laccan.devices.Sample> sampleList45 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList45, sampleArray44);
        java.util.List<java.lang.Double> doubleList47 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList45);
        java.util.List<java.lang.Double> doubleList48 = regression36.result(doubleList47);
        regression32.init(sampleList35, doubleList47);
        java.util.List<java.lang.Double> doubleList50 = null;
        regression0.init(sampleList35, doubleList50);
        java.lang.Double[] doubleArray54 = new java.lang.Double[] { (-19.699999999999996d), Double.NaN };
        java.util.ArrayList<java.lang.Double> doubleList55 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList55, doubleArray54);
        java.util.List<java.lang.Double> doubleList57 = regression0.result((java.util.List<java.lang.Double>) doubleList55);
        regression0.train();
        regression0.train();
        laccan.cloud.prediction.Regression regression60 = new laccan.cloud.prediction.Regression();
        double double61 = regression60.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll62 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList63 = keepingAll62.get();
        laccan.cloud.prediction.Regression regression64 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg66 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray67 = micazMsg66.get_Buffer();
        java.lang.Object obj68 = micazMsg66.clone();
        laccan.devices.Sample sample69 = new laccan.devices.Sample(micazMsg66);
        laccan.devices.Sample sample70 = new laccan.devices.Sample();
        laccan.devices.Sample sample71 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray72 = new laccan.devices.Sample[] { sample69, sample70, sample71 };
        java.util.ArrayList<laccan.devices.Sample> sampleList73 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList73, sampleArray72);
        java.util.List<java.lang.Double> doubleList75 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList73);
        java.util.List<java.lang.Double> doubleList76 = regression64.result(doubleList75);
        regression60.init(sampleList63, doubleList75);
        java.util.List<java.lang.Double> doubleList78 = laccan.cloud.prediction.Regression.makeTests(sampleList63);
        laccan.cloud.prediction.Regression regression79 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg81 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray82 = micazMsg81.get_Buffer();
        java.lang.Object obj83 = micazMsg81.clone();
        laccan.devices.Sample sample84 = new laccan.devices.Sample(micazMsg81);
        laccan.devices.Sample sample85 = new laccan.devices.Sample();
        laccan.devices.Sample sample86 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray87 = new laccan.devices.Sample[] { sample84, sample85, sample86 };
        java.util.ArrayList<laccan.devices.Sample> sampleList88 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList88, sampleArray87);
        java.util.List<java.lang.Double> doubleList90 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList88);
        java.util.List<java.lang.Double> doubleList91 = regression79.result(doubleList90);
        laccan.memory.data.reduction.KeepingAll keepingAll92 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList93 = keepingAll92.get();
        java.util.List<java.lang.Double> doubleList94 = laccan.cloud.prediction.Regression.makeTests(sampleList93);
        java.util.List<java.lang.Double> doubleList95 = regression79.result(doubleList94);
        regression0.init(sampleList63, doubleList94);
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(sampleArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(sampleArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(doubleList29);
        org.junit.Assert.assertNotNull(doubleList30);
        org.junit.Assert.assertNotNull(doubleList31);
        org.junit.Assert.assertEquals((double) double33, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList35);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(sampleArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(doubleList47);
        org.junit.Assert.assertNotNull(doubleList48);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(doubleList57);
        org.junit.Assert.assertEquals((double) double61, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList63);
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNotNull(sampleArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(doubleList75);
        org.junit.Assert.assertNotNull(doubleList76);
        org.junit.Assert.assertNotNull(doubleList78);
        org.junit.Assert.assertNotNull(shortArray82);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertNotNull(sampleArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(doubleList90);
        org.junit.Assert.assertNotNull(doubleList91);
        org.junit.Assert.assertNotNull(sampleList93);
        org.junit.Assert.assertNotNull(doubleList94);
        org.junit.Assert.assertNotNull(doubleList95);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test248");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        java.lang.String str4 = micazMsg1.toString();
        micazMsg1.amTypeSet((int) ' ');
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        int int11 = micazMsg8.get_NodeID();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray14);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray14, 2);
        micazMsg8.dataSet(byteArray14);
        int int19 = micazMsg8.baseOffset();
        byte[] byteArray20 = micazMsg8.dataGet();
        micazMsg1.dataSet(byteArray20);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray20, 4);
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((int) (byte) 100, 160);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray34 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg28.set_Buffer(shortArray34);
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray38 = micazMsg37.get_Buffer();
        laccan.devices.Sample sample39 = new laccan.devices.Sample(micazMsg37);
        int int40 = micazMsg37.get_NodeID();
        micazMsg37.amTypeSet((int) (byte) 100);
        micazMsg28.dataSet((net.tinyos.message.Message) micazMsg37, (int) (short) 0);
        int int45 = micazMsg28.dataLength();
        micazMsg28.set_Voltage(24);
        short[] shortArray48 = micazMsg28.get_Buffer();
        micazMsg26.set_Buffer(shortArray48);
        micazMsg23.set_Buffer(shortArray48);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertNotNull(shortArray48);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test249");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        micazMsg1.set_NodeID((int) 'a');
        int int10 = micazMsg1.dataLength();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg1);
        sample11.setNode("null;0.0;100");
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test250");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("", (double) 16, (-1L));
        java.lang.Class<?> wildcardClass4 = sample3.getClass();
        java.lang.String str5 = sample3.toString();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ";16.0;-1" + "'", str5.equals(";16.0;-1"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test251");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("init");
        java.util.List<laccan.devices.Sample> sampleList8 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV10 = storageCSV4.local("memory;-19.699999999999996;-1;10.0;-1");
        laccan.persistence.StorageCSV storageCSV12 = storageCSV4.local("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(sampleList8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV12);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test252");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray8, 10);
        try {
            micazMsg14.setElement_Buffer(0, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length -8 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test253");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        int int9 = memory0.length();
        int int10 = memory0.length();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg12.set_Buffer(shortArray18);
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg12);
        memory0.add(sample20);
        java.lang.String str22 = sample20.getNode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test254");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.699999999999996;0", (double) 100.0f, (long) (short) 1);
        java.lang.String[] strArray4 = sample3.toCSV();
        laccan.devices.Type type5 = sample3.getType();
        sample3.setTemperature((double) 100.0f);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test255");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        java.lang.Object obj10 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg1);
        int int13 = micazMsg1.get_Voltage();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        micazMsg15.amTypeSet(20);
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg15);
        java.lang.Object obj21 = micazMsg15.clone();
        net.tinyos.message.Message message23 = micazMsg15.clone((int) ' ');
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray26, 16);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray26);
        message23.dataSet(byteArray26);
        micazMsg1.dataSet(byteArray26);
        micazMsg1.setElement_Buffer((int) (short) 0, (short) (byte) 1);
        short[] shortArray35 = micazMsg1.get_Buffer();
        java.lang.String str36 = micazMsg1.toString();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg40 = new laccan.devices.MicazMsg(byteArray39);
        micazMsg40.init((int) '#');
        laccan.devices.MicazMsg micazMsg44 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray45 = micazMsg44.get_Buffer();
        java.lang.Object obj46 = micazMsg44.clone();
        java.lang.String str47 = micazMsg44.toString();
        short[] shortArray48 = micazMsg44.get_Buffer();
        micazMsg40.set_Buffer(shortArray48);
        micazMsg1.set_Buffer(shortArray48);
        try {
            micazMsg1.setElement_Buffer(65, (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(message23);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x6401]\n  [Voltage=0x0]\n  [Buffer=0x1 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str36.equals("Message <MicazMsg> \n  [NodeID=0x6401]\n  [Voltage=0x0]\n  [Buffer=0x1 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str47.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray48);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test256");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("reduction;-19.699999999999996;0", 2.0d, 35L);
        double double4 = sample3.getTemperature();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test257");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        int int4 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        long long10 = sample9.getDate();
        laccan.devices.Type type11 = laccan.devices.Type.FULL;
        sample9.setType(type11);
        sample9.setNode("reduction");
        java.lang.String str15 = sample9.toString();
        sample9.setNode("reduction;-19.699999999999996;0");
        sample9.setTemperature((double) (-1L));
        double double20 = sample9.getDateDouble();
        java.lang.String[] strArray21 = sample9.toCSV();
        keepingAll0.add(sample9);
        sample9.setNode("Message <MicazMsg> \n  [NodeID=0x6401]\n  [Voltage=0x0]\n  [Buffer=0x1 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n");
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "reduction;-19.699999999999996;0" + "'", str15.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test258");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        micazMsg1.set_NodeID((int) (byte) -1);
        java.lang.String str7 = micazMsg1.toString();
        int int8 = micazMsg1.get_NodeID();
        int int9 = micazMsg1.amType();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        java.lang.Object obj13 = micazMsg11.clone();
        micazMsg11.amTypeSet(20);
        int int16 = micazMsg11.baseOffset();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        java.lang.Object obj20 = micazMsg18.clone();
        micazMsg18.set_NodeID(20);
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray25);
        micazMsg18.dataSet(byteArray25);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray25);
        micazMsg11.dataSet(byteArray25);
        try {
            micazMsg1.dataSet(byteArray25, (int) ' ', (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 65535 + "'", int8 == 65535);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 172 + "'", int9 == 172);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(byteArray25);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test259");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone(2);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (short) 10);
        micazMsg11.init(3);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test260");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        micazMsg1.amTypeSet(0);
        micazMsg1.set_Voltage(65535);
        org.junit.Assert.assertNotNull(shortArray7);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test261");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, (long) 0);
        sample5.setDate((long) 24);
        laccan.devices.Type type8 = sample5.getType();
        sample5.setDate((long) 100);
        java.lang.String str11 = sample5.getNode();
        java.lang.String str12 = sample5.getNode();
        laccan.devices.Type type13 = sample5.getType();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(type13);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test262");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg(byteArray2, 16);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2);
        java.lang.Object obj6 = micazMsg5.clone();
        net.tinyos.message.SerialPacket serialPacket7 = micazMsg5.getSerialPacket();
        try {
            int int8 = serialPacket7.dataLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(serialPacket7);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test263");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        java.lang.String str7 = sample4.toString();
        sample4.setTemperature((double) (short) 10);
        double double10 = sample4.getTemperature();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null;-19.699999999999996;0" + "'", str7.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test264");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        short short12 = micazMsg1.getElement_Buffer(0);
        net.tinyos.message.Message message14 = micazMsg1.clone((int) (byte) 100);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(message14, 10);
        byte[] byteArray17 = micazMsg16.dataGet();
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray17, 3);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray17, (int) (byte) 10);
        net.tinyos.message.SerialPacket serialPacket22 = micazMsg21.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNull(serialPacket22);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test265");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        micazMsg1.amTypeSet(512);
        net.tinyos.message.SerialPacket serialPacket8 = micazMsg1.getSerialPacket();
        java.lang.Class<?> wildcardClass9 = micazMsg1.getClass();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray13 = micazMsg12.dataGet();
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg12, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(byteArray13);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test266");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.lang.String[] strArray10 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV4.save(strArray10);
        laccan.devices.Sample sample15 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=", Double.NaN, (long) '#');
        java.lang.String[] strArray16 = sample15.toCSV();
        storageCSV4.save(strArray16);
        laccan.persistence.StorageCSV storageCSV18 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV20 = storageCSV18.local("hi!");
        laccan.persistence.StorageCSV storageCSV22 = storageCSV20.local("lastReading");
        java.lang.String[] strArray28 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV22.save(strArray28);
        java.lang.String[] strArray36 = new java.lang.String[] { "reduction;-19.699999999999996;0", "hi!", "nodes", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n", "memory" };
        storageCSV22.save(strArray36);
        java.lang.String[] strArray38 = laccan.devices.helper.utils.Assistant.environments;
        storageCSV22.save(strArray38);
        storageCSV4.save(strArray38);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(storageCSV20);
        org.junit.Assert.assertNotNull(storageCSV22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray38);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test267");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll2 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll2.get();
        laccan.cloud.prediction.Regression regression4 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        laccan.devices.Sample sample10 = new laccan.devices.Sample();
        laccan.devices.Sample sample11 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray12 = new laccan.devices.Sample[] { sample9, sample10, sample11 };
        java.util.ArrayList<laccan.devices.Sample> sampleList13 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList13, sampleArray12);
        java.util.List<java.lang.Double> doubleList15 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList13);
        java.util.List<java.lang.Double> doubleList16 = regression4.result(doubleList15);
        regression0.init(sampleList3, doubleList15);
        regression0.train();
        java.util.List<java.lang.Double> doubleList19 = regression0.result();
        double double20 = regression0.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll21 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList22 = keepingAll21.get();
        int int23 = keepingAll21.length();
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray31 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg25.set_Buffer(shortArray31);
        laccan.devices.Sample sample33 = new laccan.devices.Sample(micazMsg25);
        keepingAll21.add(sample33);
        java.util.List<laccan.devices.Sample> sampleList35 = keepingAll21.get();
        java.util.List<laccan.devices.Sample> sampleList36 = keepingAll21.get();
        java.util.List<java.lang.Double> doubleList37 = laccan.cloud.prediction.Regression.makeTests(sampleList36);
        java.util.List<java.lang.Double> doubleList38 = regression0.result(doubleList37);
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(sampleArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertEquals((double) double20, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(sampleList35);
        org.junit.Assert.assertNotNull(sampleList36);
        org.junit.Assert.assertNotNull(doubleList37);
        org.junit.Assert.assertNotNull(doubleList38);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test268");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        int int6 = micazMsg1.get_Voltage();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        java.lang.String str11 = micazMsg8.toString();
        short[] shortArray12 = micazMsg8.get_Buffer();
        byte[] byteArray13 = micazMsg8.dataGet();
        java.lang.Object obj14 = micazMsg8.clone();
        net.tinyos.message.Message message16 = micazMsg8.clone(2);
        byte[] byteArray17 = micazMsg8.dataGet();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray17);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray17);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray17);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray17);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray17, 52);
        micazMsg1.dataSet(byteArray17);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray17);
        int int26 = micazMsg25.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(message16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test269");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        java.lang.String[] strArray4 = new java.lang.String[] { "result" };
        storageCSV0.save(strArray4);
        java.util.List<laccan.devices.Sample> sampleList6 = storageCSV0.read();
        laccan.persistence.StorageCSV storageCSV7 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV9 = storageCSV7.local("hi!");
        laccan.persistence.StorageCSV storageCSV11 = storageCSV9.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList12 = storageCSV11.read();
        laccan.persistence.StorageCSV storageCSV14 = storageCSV11.local("memory");
        laccan.persistence.StorageCSV storageCSV15 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV17 = storageCSV15.local("hi!");
        laccan.persistence.StorageCSV storageCSV19 = storageCSV17.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList20 = storageCSV19.read();
        java.util.List<laccan.devices.Sample> sampleList21 = storageCSV19.read();
        laccan.persistence.StorageCSV storageCSV23 = storageCSV19.local("");
        laccan.persistence.StorageCSV storageCSV24 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV26 = storageCSV24.local("hi!");
        laccan.persistence.StorageCSV storageCSV28 = storageCSV26.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList29 = storageCSV28.read();
        laccan.persistence.StorageCSV storageCSV31 = storageCSV28.local("memory");
        laccan.persistence.StorageCSV storageCSV32 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV34 = storageCSV32.local("hi!");
        laccan.persistence.StorageCSV storageCSV36 = storageCSV34.local("lastReading");
        java.lang.String[] strArray42 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV36.save(strArray42);
        storageCSV28.save(strArray42);
        storageCSV19.save(strArray42);
        storageCSV11.save(strArray42);
        laccan.persistence.StorageCSV storageCSV48 = storageCSV11.local("lastReading");
        laccan.devices.MicazMsg micazMsg50 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray51 = micazMsg50.get_Buffer();
        java.lang.Object obj52 = micazMsg50.clone();
        laccan.devices.Sample sample53 = new laccan.devices.Sample(micazMsg50);
        long long54 = sample53.getDate();
        java.lang.Class<?> wildcardClass55 = sample53.getClass();
        java.lang.String str56 = sample53.toString();
        java.lang.String[] strArray57 = sample53.toCSV();
        storageCSV48.save(strArray57);
        storageCSV0.save(strArray57);
        laccan.persistence.StorageCSV storageCSV61 = storageCSV0.local("null;-19.699999999999996;512");
        laccan.devices.MicazMsg micazMsg63 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray64 = micazMsg63.get_Buffer();
        java.lang.Object obj65 = micazMsg63.clone();
        laccan.devices.Sample sample66 = new laccan.devices.Sample(micazMsg63);
        sample66.setDate((long) '#');
        java.lang.String[] strArray69 = sample66.toCSV();
        java.lang.String[] strArray70 = sample66.toCSV();
        storageCSV61.save(strArray70);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(sampleList12);
        org.junit.Assert.assertNotNull(storageCSV14);
        org.junit.Assert.assertNotNull(storageCSV17);
        org.junit.Assert.assertNotNull(storageCSV19);
        org.junit.Assert.assertNotNull(sampleList20);
        org.junit.Assert.assertNotNull(sampleList21);
        org.junit.Assert.assertNotNull(storageCSV23);
        org.junit.Assert.assertNotNull(storageCSV26);
        org.junit.Assert.assertNotNull(storageCSV28);
        org.junit.Assert.assertNotNull(sampleList29);
        org.junit.Assert.assertNotNull(storageCSV31);
        org.junit.Assert.assertNotNull(storageCSV34);
        org.junit.Assert.assertNotNull(storageCSV36);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(storageCSV48);
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "null;-19.699999999999996;0" + "'", str56.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(storageCSV61);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test270");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(6, (int) '4');
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test271");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        double double7 = sample4.getDateDouble();
        java.lang.String str8 = sample4.toString();
        double double9 = sample4.getDateDouble();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null;-19.699999999999996;0" + "'", str8.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test272");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        int int13 = micazMsg12.amType();
        int int14 = micazMsg12.get_NodeID();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = micazMsg16.get_Buffer();
        java.lang.Object obj18 = micazMsg16.clone();
        int int19 = micazMsg16.get_NodeID();
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray22);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray22, 2);
        micazMsg16.dataSet(byteArray22);
        micazMsg12.dataSet(byteArray22);
        try {
            int int28 = micazMsg12.get_Voltage();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 172 + "'", int13 == 172);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test273");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        int int4 = micazMsg2.get_NodeID();
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) (byte) -1);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        java.lang.String str11 = micazMsg8.toString();
        short[] shortArray12 = micazMsg8.get_Buffer();
        micazMsg2.set_Buffer(shortArray12);
        micazMsg2.set_Voltage(0);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray20, 48);
        micazMsg2.dataSet(byteArray20);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray20);
        int int25 = micazMsg24.baseOffset();
        net.tinyos.message.SerialPacket serialPacket26 = micazMsg24.getSerialPacket();
        java.lang.String str27 = micazMsg24.toString();
        int int28 = micazMsg24.dataLength();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(serialPacket26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x10a]\n  [Voltage=0x64]\n  [Buffer=" + "'", str27.equals("Message <MicazMsg> \n  [NodeID=0x10a]\n  [Voltage=0x64]\n  [Buffer="));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test274");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        storageCSV3.save(strArray4);
        storageCSV0.save(strArray4);
        laccan.persistence.StorageCSV storageCSV8 = storageCSV0.local("nodes");
        laccan.persistence.StorageCSV storageCSV10 = storageCSV0.local("init");
        laccan.persistence.StorageCSV storageCSV12 = storageCSV10.local("reduction;-19.699999999999996;0");
        laccan.persistence.StorageCSV storageCSV13 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV15 = storageCSV13.local("hi!");
        laccan.persistence.StorageCSV storageCSV17 = storageCSV15.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList18 = storageCSV17.read();
        java.util.List<laccan.devices.Sample> sampleList19 = storageCSV17.read();
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray22 = micazMsg21.get_Buffer();
        java.lang.Object obj23 = micazMsg21.clone();
        laccan.devices.Sample sample24 = new laccan.devices.Sample(micazMsg21);
        laccan.devices.Type type25 = null;
        sample24.setType(type25);
        laccan.devices.Type type27 = null;
        sample24.setType(type27);
        sample24.setNode("hi!");
        java.lang.String[] strArray31 = sample24.toCSV();
        storageCSV17.save(strArray31);
        storageCSV10.save(strArray31);
        java.util.List<laccan.devices.Sample> sampleList34 = storageCSV10.read();
        laccan.persistence.StorageCSV storageCSV36 = storageCSV10.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 ");
        laccan.persistence.StorageCSV storageCSV38 = storageCSV36.local("null;97.0;100");
        laccan.persistence.StorageCSV storageCSV39 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV41 = storageCSV39.local("hi!");
        laccan.persistence.StorageCSV storageCSV43 = storageCSV41.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList44 = storageCSV43.read();
        laccan.persistence.StorageCSV storageCSV46 = storageCSV43.local("init");
        java.util.List<laccan.devices.Sample> sampleList47 = storageCSV43.read();
        laccan.memory.data.reduction.KeepingAll keepingAll48 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList49 = keepingAll48.get();
        int int50 = keepingAll48.length();
        java.util.List<laccan.devices.Sample> sampleList51 = keepingAll48.get();
        laccan.devices.MicazMsg micazMsg53 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray54 = micazMsg53.get_Buffer();
        java.lang.Object obj55 = micazMsg53.clone();
        laccan.devices.Sample sample56 = new laccan.devices.Sample(micazMsg53);
        laccan.devices.Type type57 = null;
        sample56.setType(type57);
        laccan.devices.Type type59 = null;
        sample56.setType(type59);
        sample56.setNode("hi!");
        keepingAll48.add(sample56);
        laccan.devices.Type type64 = sample56.getType();
        java.lang.String[] strArray65 = sample56.toCSV();
        storageCSV43.save(strArray65);
        storageCSV36.save(strArray65);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV12);
        org.junit.Assert.assertNotNull(storageCSV15);
        org.junit.Assert.assertNotNull(storageCSV17);
        org.junit.Assert.assertNotNull(sampleList18);
        org.junit.Assert.assertNotNull(sampleList19);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(sampleList34);
        org.junit.Assert.assertNotNull(storageCSV36);
        org.junit.Assert.assertNotNull(storageCSV38);
        org.junit.Assert.assertNotNull(storageCSV41);
        org.junit.Assert.assertNotNull(storageCSV43);
        org.junit.Assert.assertNotNull(sampleList44);
        org.junit.Assert.assertNotNull(storageCSV46);
        org.junit.Assert.assertNotNull(sampleList47);
        org.junit.Assert.assertNotNull(sampleList49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(sampleList51);
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNull(type64);
        org.junit.Assert.assertNotNull(strArray65);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test275");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        short short12 = micazMsg1.getElement_Buffer(0);
        net.tinyos.message.Message message14 = micazMsg1.clone((int) (byte) 100);
        int int15 = micazMsg1.get_Voltage();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        int int20 = micazMsg17.get_NodeID();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray23);
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray23, 2);
        micazMsg17.dataSet(byteArray23);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray23);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray23);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray32 = micazMsg31.get_Buffer();
        java.lang.Object obj33 = micazMsg31.clone();
        int int34 = micazMsg31.get_NodeID();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg(byteArray37);
        laccan.devices.MicazMsg micazMsg40 = new laccan.devices.MicazMsg(byteArray37, 2);
        micazMsg31.dataSet(byteArray37);
        laccan.devices.MicazMsg micazMsg43 = new laccan.devices.MicazMsg(byteArray37, (int) (short) 10);
        micazMsg29.dataSet(byteArray37);
        laccan.devices.MicazMsg micazMsg45 = new laccan.devices.MicazMsg(byteArray37);
        micazMsg1.dataSet(byteArray37);
        laccan.devices.MicazMsg micazMsg48 = new laccan.devices.MicazMsg(byteArray37, 65535);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteArray37);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test276");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        micazMsg3.init((int) '#');
        java.lang.String str6 = micazMsg3.toString();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str6.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test277");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1, (long) 512);
        sample9.setDate((long) (byte) 100);
        sample9.setDate((long) 2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test278");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        int int13 = micazMsg10.get_NodeID();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray16);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray16, 2);
        micazMsg10.dataSet(byteArray16);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray16);
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray16);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray25 = micazMsg24.get_Buffer();
        java.lang.Object obj26 = micazMsg24.clone();
        int int27 = micazMsg24.get_NodeID();
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg(byteArray30);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg(byteArray30, 2);
        micazMsg24.dataSet(byteArray30);
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg(byteArray30, (int) (short) 10);
        micazMsg22.dataSet(byteArray30);
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg(byteArray30);
        micazMsg1.dataSet(byteArray30);
        micazMsg1.set_Voltage(5);
        laccan.devices.MicazMsg micazMsg43 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray49 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg43.set_Buffer(shortArray49);
        int int51 = micazMsg43.get_NodeID();
        int int52 = micazMsg43.amType();
        laccan.devices.MicazMsg micazMsg54 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray55 = micazMsg54.get_Buffer();
        java.lang.Object obj56 = micazMsg54.clone();
        micazMsg54.set_NodeID(20);
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg62 = new laccan.devices.MicazMsg(byteArray61);
        micazMsg54.dataSet(byteArray61);
        short short65 = micazMsg54.getElement_Buffer(0);
        net.tinyos.message.Message message67 = micazMsg54.clone((int) (byte) 100);
        short[] shortArray68 = micazMsg54.get_Buffer();
        micazMsg43.set_Buffer(shortArray68);
        micazMsg1.set_Buffer(shortArray68);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 172 + "'", int52 == 172);
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertTrue("'" + short65 + "' != '" + (short) 0 + "'", short65 == (short) 0);
        org.junit.Assert.assertNotNull(message67);
        org.junit.Assert.assertNotNull(shortArray68);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test279");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        java.lang.String str6 = sample5.getNode();
        java.lang.String str7 = sample5.getNode();
        long long8 = sample5.getDate();
        java.lang.String[] strArray9 = sample5.toCSV();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test280");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(51, 64);
        byte[] byteArray3 = micazMsg2.dataGet();
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test281");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        byte[] byteArray7 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) '#', (-139));
        java.lang.Object obj11 = micazMsg1.clone();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test282");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        int int3 = micazMsg1.get_NodeID();
        java.lang.Object obj4 = micazMsg1.clone();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        micazMsg6.set_NodeID(20);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray13);
        micazMsg6.dataSet(byteArray13);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray13, 0);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg17, (int) (short) 0);
        int int20 = micazMsg1.dataLength();
        java.lang.Object obj21 = micazMsg1.clone();
        byte[] byteArray22 = micazMsg1.dataGet();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(byteArray22);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test283");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        laccan.devices.Type type6 = laccan.devices.Type.FULL;
        sample4.setType(type6);
        sample4.setNode("reduction");
        java.lang.Class<?> wildcardClass10 = sample4.getClass();
        sample4.setDate((long) 10);
        double double13 = sample4.getDateDouble();
        long long14 = sample4.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test284");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        memory0.build();
        laccan.memory.Container container4 = memory0.getMemory();
        memory0.build();
        int int6 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll7 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList8 = keepingAll7.get();
        int int9 = keepingAll7.length();
        int int10 = keepingAll7.length();
        java.util.List<laccan.devices.Sample> sampleList11 = keepingAll7.get();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg13.set_Buffer(shortArray19);
        laccan.devices.Sample sample21 = new laccan.devices.Sample(micazMsg13);
        java.lang.String[] strArray22 = sample21.toCSV();
        java.lang.String str23 = sample21.getNode();
        keepingAll7.add(sample21);
        java.lang.String[] strArray25 = sample21.toCSV();
        memory0.add(sample21);
        sample21.setNode("null;-19.699999999999996;512");
        sample21.setTemperature((double) 1);
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sampleList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(sampleList11);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test285");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        short short12 = micazMsg1.getElement_Buffer(0);
        net.tinyos.message.Message message14 = micazMsg1.clone((int) (byte) 100);
        short[] shortArray15 = micazMsg1.get_Buffer();
        int int16 = micazMsg1.baseOffset();
        try {
            micazMsg1.init((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test286");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        micazMsg3.init((int) '#');
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = micazMsg7.get_Buffer();
        java.lang.Object obj9 = micazMsg7.clone();
        micazMsg7.amTypeSet(20);
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg7);
        byte[] byteArray13 = micazMsg7.dataGet();
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray13);
        micazMsg3.dataSet(byteArray13);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(byteArray13);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test287");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = micazMsg1.getClass();
        micazMsg1.init(2);
        net.tinyos.message.Message message9 = micazMsg1.clone(2);
        message9.amTypeSet(0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(message9);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test288");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        int int13 = micazMsg1.amType();
        micazMsg1.amTypeSet(10);
        java.lang.Object obj16 = micazMsg1.clone();
        try {
            laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (128) or length (16), for data_length 16 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 172 + "'", int13 == 172);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test289");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        int int4 = micazMsg2.get_NodeID();
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) (byte) -1);
        micazMsg2.setElement_Buffer((int) (short) 0, (short) (byte) 100);
        try {
            micazMsg2.setElement_Buffer(32, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test290");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(48, 24);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test291");
        laccan.devices.helper.utils.Assistant.predictorType = "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;10.0;35";
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test292");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        int int9 = memory0.length();
        memory0.build();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg12);
        sample15.setDate((long) '#');
        sample15.setNode("null;-19.699999999999996;35");
        memory0.add(sample15);
        java.lang.String str21 = sample15.getNode();
        sample15.setTemperature((double) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "null;-19.699999999999996;35" + "'", str21.equals("null;-19.699999999999996;35"));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test293");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        java.lang.String str7 = micazMsg1.toString();
        micazMsg1.amTypeSet(16);
        net.tinyos.message.Message message11 = micazMsg1.clone(65);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        java.lang.String str16 = micazMsg13.toString();
        short[] shortArray17 = micazMsg13.get_Buffer();
        byte[] byteArray18 = micazMsg13.dataGet();
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray18);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray18, (int) (short) 100);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray18, (int) (byte) 1);
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray18, (int) (byte) 10, 0);
        try {
            micazMsg1.dataSet(byteArray18, 256, 52, 512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(message11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str16.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(byteArray18);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test294");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, (long) 0);
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg2, (long) (byte) 10);
        micazMsg2.set_NodeID(4);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test295");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 116, (long) 65535, 0);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test296");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        int int9 = memory0.length();
        laccan.memory.Container container10 = memory0.getMemory();
        int int11 = container10.length();
        int int12 = container10.length();
        java.util.List<laccan.devices.Sample> sampleList13 = container10.get();
        java.util.List<laccan.devices.Sample> sampleList14 = container10.get();
        java.util.List<laccan.devices.Sample> sampleList15 = container10.get();
        java.util.List<java.lang.Double> doubleList16 = laccan.cloud.prediction.Regression.makeTests(sampleList15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(sampleList13);
        org.junit.Assert.assertNotNull(sampleList14);
        org.junit.Assert.assertNotNull(sampleList15);
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test297");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        micazMsg1.set_NodeID((int) (byte) -1);
        java.lang.String str7 = micazMsg1.toString();
        micazMsg1.init((int) (short) 100);
        net.tinyos.message.SerialPacket serialPacket10 = micazMsg1.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNull(serialPacket10);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test298");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) (byte) 0);
        int int2 = micazMsg1.amType();
        try {
            micazMsg1.set_Voltage(64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172 + "'", int2 == 172);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test299");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) ' ');
        java.lang.String str12 = micazMsg1.toString();
        net.tinyos.message.SerialPacket serialPacket13 = micazMsg1.getSerialPacket();
        int int14 = micazMsg1.amType();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNull(serialPacket13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test300");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        micazMsg1.set_Voltage(20);
        byte[] byteArray11 = micazMsg1.dataGet();
        net.tinyos.message.Message message13 = micazMsg1.clone(2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(message13);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test301");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        int int9 = micazMsg1.baseOffset();
        int int10 = micazMsg1.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test302");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        int int4 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList5 = keepingAll0.get();
        java.lang.Class<?> wildcardClass6 = sampleList5.getClass();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test303");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        laccan.devices.Type type6 = laccan.devices.Type.FULL;
        sample4.setType(type6);
        sample4.setNode("reduction");
        java.lang.String str10 = sample4.toString();
        java.lang.String str11 = sample4.getNode();
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(52, 0);
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg14);
        java.lang.String str16 = sample15.getNode();
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj20 = micazMsg19.clone();
        laccan.devices.Sample sample22 = new laccan.devices.Sample(micazMsg19, (long) 0);
        java.lang.String str23 = sample22.getNode();
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray26 = micazMsg25.get_Buffer();
        java.lang.Object obj27 = micazMsg25.clone();
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg25);
        long long29 = sample28.getDate();
        java.lang.Class<?> wildcardClass30 = sample28.getClass();
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray33 = micazMsg32.get_Buffer();
        java.lang.Object obj34 = micazMsg32.clone();
        laccan.devices.Sample sample35 = new laccan.devices.Sample(micazMsg32);
        long long36 = sample35.getDate();
        laccan.devices.Type type37 = laccan.devices.Type.FULL;
        sample35.setType(type37);
        sample28.setType(type37);
        sample22.setType(type37);
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray43 = micazMsg42.get_Buffer();
        java.lang.Object obj44 = micazMsg42.clone();
        laccan.devices.Sample sample45 = new laccan.devices.Sample(micazMsg42);
        laccan.devices.Type type46 = null;
        sample45.setType(type46);
        sample45.setNode("");
        laccan.devices.Type type50 = laccan.devices.Type.REDUCE;
        sample45.setType(type50);
        sample22.setType(type50);
        sample15.setType(type50);
        sample4.setType(type50);
        long long55 = sample4.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "reduction;-19.699999999999996;0" + "'", str10.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "reduction" + "'", str11.equals("reduction"));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + type37 + "' != '" + laccan.devices.Type.FULL + "'", type37.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + type50 + "' != '" + laccan.devices.Type.REDUCE + "'", type50.equals(laccan.devices.Type.REDUCE));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test304");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.get_NodeID();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        java.lang.Class<?> wildcardClass10 = micazMsg1.getClass();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg12);
        int int15 = micazMsg12.get_NodeID();
        byte[] byteArray16 = micazMsg12.dataGet();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray16);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = micazMsg19.get_Buffer();
        java.lang.Object obj21 = micazMsg19.clone();
        int int22 = micazMsg19.get_NodeID();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray25);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray25, 2);
        micazMsg19.dataSet(byteArray25);
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray25);
        micazMsg17.dataSet(byteArray25);
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg(byteArray25);
        micazMsg1.dataSet(byteArray25);
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg(byteArray25, (int) (short) 1);
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg(byteArray25, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg39 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray40 = micazMsg39.get_Buffer();
        java.lang.Object obj41 = micazMsg39.clone();
        java.lang.String str42 = micazMsg39.toString();
        short[] shortArray43 = micazMsg39.get_Buffer();
        byte[] byteArray44 = micazMsg39.dataGet();
        java.lang.Object obj45 = micazMsg39.clone();
        laccan.devices.Sample sample46 = new laccan.devices.Sample(micazMsg39);
        int int47 = micazMsg39.baseOffset();
        short[] shortArray48 = micazMsg39.get_Buffer();
        micazMsg39.amTypeSet((int) (byte) 0);
        short[] shortArray51 = micazMsg39.get_Buffer();
        try {
            micazMsg37.set_Buffer(shortArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 3 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str42.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertNotNull(shortArray51);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test305");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll2 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll2.get();
        laccan.cloud.prediction.Regression regression4 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        laccan.devices.Sample sample10 = new laccan.devices.Sample();
        laccan.devices.Sample sample11 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray12 = new laccan.devices.Sample[] { sample9, sample10, sample11 };
        java.util.ArrayList<laccan.devices.Sample> sampleList13 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList13, sampleArray12);
        java.util.List<java.lang.Double> doubleList15 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList13);
        java.util.List<java.lang.Double> doubleList16 = regression4.result(doubleList15);
        regression0.init(sampleList3, doubleList15);
        double double18 = regression0.mse();
        java.util.List<java.lang.Double> doubleList19 = regression0.result();
        double double20 = regression0.mse();
        double double21 = regression0.mse();
        regression0.train();
        java.util.List<java.lang.Double> doubleList23 = regression0.result();
        double double24 = regression0.mse();
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(sampleArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals((double) double18, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertEquals((double) double20, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double21, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList23);
        org.junit.Assert.assertEquals((double) double24, Double.NaN, 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test306");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, (long) 0);
        sample5.setDate((long) 24);
        laccan.devices.Type type8 = sample5.getType();
        sample5.setDate((long) 100);
        java.lang.String str11 = sample5.getNode();
        java.lang.String str12 = sample5.getNode();
        double double13 = sample5.getTemperature();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-19.699999999999996d) + "'", double13 == (-19.699999999999996d));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test307");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        int int3 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList4 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList5 = keepingAll0.get();
        int int6 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList7 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList8 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg10.set_Buffer(shortArray16);
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg10);
        laccan.devices.Sample sample19 = new laccan.devices.Sample();
        laccan.devices.Type type20 = laccan.devices.Type.FULL;
        sample19.setType(type20);
        sample18.setType(type20);
        sample18.setTemperature((double) 'a');
        laccan.devices.Type type25 = sample18.getType();
        keepingAll0.add(sample18);
        double double27 = sample18.getTemperature();
        java.lang.String[] strArray28 = sample18.toCSV();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(sampleList7);
        org.junit.Assert.assertNotNull(sampleList8);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + laccan.devices.Type.FULL + "'", type20.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + laccan.devices.Type.FULL + "'", type25.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 97.0d + "'", double27 == 97.0d);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test308");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        short short12 = micazMsg1.getElement_Buffer(0);
        net.tinyos.message.Message message14 = micazMsg1.clone((int) (byte) 100);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(message14, 10);
        byte[] byteArray17 = micazMsg16.dataGet();
        try {
            laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray17, 112, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 112, data_length 128 and data array size 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(byteArray17);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test309");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        laccan.devices.Type type7 = null;
        sample4.setType(type7);
        sample4.setNode("hi!");
        java.lang.String[] strArray11 = sample4.toCSV();
        sample4.setTemperature((double) 2);
        long long14 = sample4.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test310");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        double double7 = sample6.getTemperature();
        laccan.devices.Type type8 = sample6.getType();
        java.lang.String str9 = sample6.getNode();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-19.699999999999996d) + "'", double7 == (-19.699999999999996d));
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test311");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray5 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray5, 100);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray5, (int) (short) 100);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray5, 6);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test312");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5);
        laccan.devices.Type type9 = null;
        sample8.setType(type9);
        laccan.devices.Type type11 = null;
        sample8.setType(type11);
        sample8.setNode("hi!");
        keepingAll0.add(sample8);
        int int16 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        java.lang.Object obj20 = micazMsg18.clone();
        laccan.devices.Sample sample21 = new laccan.devices.Sample(micazMsg18);
        sample21.setTemperature((double) 2);
        keepingAll0.add(sample21);
        int int25 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray28 = micazMsg27.get_Buffer();
        java.lang.Object obj29 = micazMsg27.clone();
        laccan.devices.Sample sample30 = new laccan.devices.Sample(micazMsg27);
        laccan.devices.Type type31 = null;
        sample30.setType(type31);
        sample30.setNode("");
        java.lang.String[] strArray35 = sample30.toCSV();
        keepingAll0.add(sample30);
        int int37 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg39 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray40 = micazMsg39.get_Buffer();
        java.lang.Object obj41 = micazMsg39.clone();
        micazMsg39.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg45 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg39, (int) (byte) 0);
        int int46 = micazMsg39.baseOffset();
        laccan.devices.Sample sample48 = new laccan.devices.Sample(micazMsg39, (long) 100);
        sample48.setDate(3L);
        sample48.setNode("");
        laccan.devices.Type type53 = sample48.getType();
        laccan.devices.Type type54 = sample48.getType();
        keepingAll0.add(sample48);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(type53);
        org.junit.Assert.assertNull(type54);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test313");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        laccan.devices.Type type7 = null;
        sample4.setType(type7);
        sample4.setNode("hi!");
        double double11 = sample4.getTemperature();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-19.699999999999996d) + "'", double11 == (-19.699999999999996d));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test314");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        memory0.build();
        int int4 = memory0.length();
        laccan.memory.Container container5 = memory0.getMemory();
        int int6 = memory0.length();
        memory0.build();
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        java.lang.Object obj11 = micazMsg9.clone();
        short short13 = micazMsg9.getElement_Buffer((int) (short) 0);
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg9, (long) (short) 0);
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg9);
        java.lang.String str17 = sample16.getNode();
        java.lang.String str18 = sample16.getNode();
        long long19 = sample16.getDate();
        memory0.add(sample16);
        int int21 = memory0.length();
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(container5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test315");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        net.tinyos.message.Message message5 = micazMsg3.clone(10);
        int int6 = micazMsg3.dataLength();
        java.lang.Object obj7 = micazMsg3.clone();
        try {
            micazMsg3.set_Voltage((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(message5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test316");
        laccan.devices.helper.utils.Assistant.predictorType = "null;-19.694999999999997;1";
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test317");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory", (double) (byte) -1, (long) ' ');
        java.lang.String str4 = sample3.toString();
        java.lang.String[] strArray5 = sample3.toCSV();
        double double6 = sample3.getTemperature();
        java.lang.String str7 = sample3.getNode();
        laccan.devices.Type type8 = sample3.getType();
        long long9 = sample3.getDate();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "memory;-1.0;32" + "'", str4.equals("memory;-1.0;32"));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "memory" + "'", str7.equals("memory"));
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test318");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, (long) 0);
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg2, (long) (byte) 10);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg2, (long) (byte) -1);
        double double10 = sample9.getDateDouble();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test319");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        byte[] byteArray8 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray8, (-2), 14);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test320");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        java.lang.String str5 = micazMsg1.toString();
        net.tinyos.message.SerialPacket serialPacket6 = micazMsg1.getSerialPacket();
        java.lang.Object obj7 = micazMsg1.clone();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str5.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNull(serialPacket6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test321");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray3 = micazMsg2.get_Buffer();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg2);
        int int5 = micazMsg2.dataLength();
        micazMsg2.init((int) '4');
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg2);
        double double9 = sample8.getDateDouble();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg11.set_Buffer(shortArray17);
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg11);
        laccan.devices.Sample sample20 = new laccan.devices.Sample();
        laccan.devices.Type type21 = laccan.devices.Type.FULL;
        sample20.setType(type21);
        sample19.setType(type21);
        sample19.setTemperature((double) 'a');
        laccan.devices.Type type26 = sample19.getType();
        sample8.setType(type26);
        keepingAll0.add(sample8);
        sample8.setTemperature((double) 8);
        java.lang.String str31 = sample8.toString();
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + laccan.devices.Type.FULL + "'", type21.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type26 + "' != '" + laccan.devices.Type.FULL + "'", type26.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "null;8.0;0" + "'", str31.equals("null;8.0;0"));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test322");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        int int4 = micazMsg2.get_NodeID();
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) (byte) -1);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        java.lang.String str11 = micazMsg8.toString();
        short[] shortArray12 = micazMsg8.get_Buffer();
        micazMsg2.set_Buffer(shortArray12);
        int int14 = micazMsg2.dataLength();
        int int15 = micazMsg2.get_Voltage();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        micazMsg17.setElement_Buffer(0, (short) 10);
        micazMsg17.set_Voltage(0);
        int int24 = micazMsg17.get_NodeID();
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg17, (int) (short) 1);
        net.tinyos.message.Message message28 = micazMsg26.clone(512);
        int int29 = micazMsg26.baseOffset();
        micazMsg2.dataSet((net.tinyos.message.Message) micazMsg26, (int) (byte) 10);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(message28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test323");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        int int13 = micazMsg12.amType();
        java.lang.Object obj14 = micazMsg12.clone();
        micazMsg12.amTypeSet(6);
        net.tinyos.message.SerialPacket serialPacket17 = micazMsg12.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 172 + "'", int13 == 172);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(serialPacket17);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test324");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        memory0.build();
        int int3 = memory0.length();
        int int4 = memory0.length();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        laccan.devices.Type type10 = null;
        sample9.setType(type10);
        laccan.devices.Type type12 = null;
        sample9.setType(type12);
        sample9.setNode("hi!");
        memory0.add(sample9);
        laccan.memory.Container container17 = memory0.getMemory();
        memory0.build();
        laccan.memory.Container container19 = memory0.getMemory();
        int int20 = container19.length();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(container17);
        org.junit.Assert.assertNotNull(container19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test325");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        int int13 = micazMsg1.get_Voltage();
        micazMsg1.set_Voltage(100);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (-1), (int) (byte) -1);
        int int19 = micazMsg1.get_Voltage();
        java.lang.String str20 = micazMsg1.toString();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (short) 1, 0);
        java.lang.String str24 = micazMsg23.toString();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x64]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 " + "'", str20.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x64]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 "));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str24.equals("Message <MicazMsg> \n  [Buffer="));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test326");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray6);
        java.lang.Object obj9 = micazMsg8.clone();
        micazMsg8.init((int) (short) 10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test327");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1);
        double double8 = sample7.getDateDouble();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg10.set_Buffer(shortArray16);
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg10);
        laccan.devices.Sample sample19 = new laccan.devices.Sample();
        laccan.devices.Type type20 = laccan.devices.Type.FULL;
        sample19.setType(type20);
        sample18.setType(type20);
        sample18.setTemperature((double) 'a');
        laccan.devices.Type type25 = sample18.getType();
        sample7.setType(type25);
        java.lang.String[] strArray27 = sample7.toCSV();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + laccan.devices.Type.FULL + "'", type20.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + laccan.devices.Type.FULL + "'", type25.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test328");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 2);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        micazMsg6.set_NodeID((int) (byte) 10);
        byte[] byteArray9 = micazMsg6.dataGet();
        int int10 = micazMsg6.dataLength();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg6.getSerialPacket();
        micazMsg6.amTypeSet(52);
        net.tinyos.message.Message message15 = micazMsg6.clone(3);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertNotNull(message15);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test329");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        java.lang.String[] strArray4 = new java.lang.String[] { "result" };
        storageCSV0.save(strArray4);
        java.util.List<laccan.devices.Sample> sampleList6 = storageCSV0.read();
        laccan.persistence.StorageCSV storageCSV7 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV9 = storageCSV7.local("hi!");
        laccan.persistence.StorageCSV storageCSV11 = storageCSV9.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList12 = storageCSV11.read();
        laccan.persistence.StorageCSV storageCSV14 = storageCSV11.local("init");
        java.util.List<laccan.devices.Sample> sampleList15 = storageCSV11.read();
        laccan.memory.data.reduction.KeepingAll keepingAll16 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList17 = keepingAll16.get();
        int int18 = keepingAll16.length();
        java.util.List<laccan.devices.Sample> sampleList19 = keepingAll16.get();
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray22 = micazMsg21.get_Buffer();
        java.lang.Object obj23 = micazMsg21.clone();
        laccan.devices.Sample sample24 = new laccan.devices.Sample(micazMsg21);
        laccan.devices.Type type25 = null;
        sample24.setType(type25);
        laccan.devices.Type type27 = null;
        sample24.setType(type27);
        sample24.setNode("hi!");
        keepingAll16.add(sample24);
        laccan.devices.Type type32 = sample24.getType();
        java.lang.String[] strArray33 = sample24.toCSV();
        storageCSV11.save(strArray33);
        storageCSV0.save(strArray33);
        laccan.persistence.StorageCSV storageCSV37 = storageCSV0.local("reduction");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(sampleList12);
        org.junit.Assert.assertNotNull(storageCSV14);
        org.junit.Assert.assertNotNull(sampleList15);
        org.junit.Assert.assertNotNull(sampleList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(sampleList19);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(type32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(storageCSV37);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test330");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg10);
        int int13 = micazMsg10.get_NodeID();
        micazMsg10.amTypeSet((int) (byte) 100);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg10, (int) (short) 0);
        int int18 = micazMsg1.get_Voltage();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = micazMsg20.get_Buffer();
        java.lang.Object obj22 = micazMsg20.clone();
        int int23 = micazMsg20.get_NodeID();
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray26);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray26, 2);
        micazMsg20.dataSet(byteArray26);
        int int31 = micazMsg20.baseOffset();
        byte[] byteArray32 = micazMsg20.dataGet();
        short[] shortArray33 = micazMsg20.get_Buffer();
        micazMsg1.set_Buffer(shortArray33);
        micazMsg1.amTypeSet(65535);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertNotNull(shortArray33);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test331");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        laccan.memory.data.reduction.KeepingAll keepingAll9 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        java.lang.Object obj13 = micazMsg11.clone();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg11);
        laccan.devices.Type type15 = null;
        sample14.setType(type15);
        keepingAll9.add(sample14);
        sample14.setDate((long) (byte) 100);
        memory0.add(sample14);
        memory0.build();
        laccan.memory.Container container22 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(container22);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test332");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory;-19.699999999999996;-1;10.0;-1", 32.0d, 10L);
        sample3.setNode("null;10.0;0");
        java.lang.String str6 = sample3.toString();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null;10.0;0;32.0;10" + "'", str6.equals("null;10.0;0;32.0;10"));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test333");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        int int6 = micazMsg1.get_Voltage();
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj10 = micazMsg9.clone();
        int int11 = micazMsg9.get_NodeID();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg9, (long) (byte) -1);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        java.lang.String str18 = micazMsg15.toString();
        short[] shortArray19 = micazMsg15.get_Buffer();
        micazMsg9.set_Buffer(shortArray19);
        micazMsg9.set_Voltage(0);
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray27, 48);
        micazMsg9.dataSet(byteArray27);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg(byteArray27);
        micazMsg1.dataSet(byteArray27);
        java.lang.String str33 = micazMsg1.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str18.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x10a]\n  [Voltage=0x64]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str33.equals("Message <MicazMsg> \n  [NodeID=0x10a]\n  [Voltage=0x64]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test334");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone((int) ' ');
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg12.amTypeSet(2);
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg12, (long) 512);
        micazMsg12.set_Voltage(16);
        byte[] byteArray19 = micazMsg12.dataGet();
        short[] shortArray20 = micazMsg12.get_Buffer();
        micazMsg1.set_Buffer(shortArray20);
        micazMsg1.set_Voltage((int) (short) 10);
        micazMsg1.init((int) 'a');
        java.lang.String str26 = micazMsg1.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str26.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test335");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(16, (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test336");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg10);
        int int13 = micazMsg10.get_NodeID();
        micazMsg10.amTypeSet((int) (byte) 100);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg10, (int) (short) 0);
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg1);
        try {
            micazMsg1.setElement_Buffer((int) '#', (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test337");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        laccan.devices.Type type6 = laccan.devices.Type.FULL;
        sample4.setType(type6);
        sample4.setNode("reduction");
        java.lang.String str10 = sample4.toString();
        sample4.setNode("reduction;-19.699999999999996;0");
        sample4.setTemperature((double) '4');
        double double15 = sample4.getDateDouble();
        sample4.setDate((long) (short) 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "reduction;-19.699999999999996;0" + "'", str10.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test338");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg5.amTypeSet(2);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg5, (long) 512);
        micazMsg5.set_Voltage(16);
        byte[] byteArray12 = micazMsg5.dataGet();
        micazMsg2.dataSet(byteArray12);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray12, 160);
        byte[] byteArray16 = null;
        try {
            micazMsg15.dataSet(byteArray16, 3, (int) (short) 10, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byteArray12);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test339");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        memory0.build();
        int int3 = memory0.length();
        int int4 = memory0.length();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        laccan.devices.Type type10 = null;
        sample9.setType(type10);
        laccan.devices.Type type12 = null;
        sample9.setType(type12);
        sample9.setNode("hi!");
        memory0.add(sample9);
        java.lang.String str17 = sample9.toString();
        java.lang.String[] strArray18 = sample9.toCSV();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!;-19.699999999999996;0" + "'", str17.equals("hi!;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test340");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) (byte) 100);
        micazMsg1.amTypeSet(2);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        byte[] byteArray10 = micazMsg1.dataGet();
        short[] shortArray11 = micazMsg1.get_Buffer();
        micazMsg1.amTypeSet((int) (byte) -1);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        int int16 = micazMsg15.dataLength();
        java.lang.Object obj17 = micazMsg15.clone();
        short short19 = micazMsg15.getElement_Buffer(0);
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray22);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray22, 2);
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray22);
        net.tinyos.message.Message message28 = micazMsg26.clone(160);
        micazMsg15.dataSet((net.tinyos.message.Message) micazMsg26, 0);
        micazMsg15.set_Voltage(3);
        net.tinyos.message.Message message34 = micazMsg15.clone(0);
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg15, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(message28);
        org.junit.Assert.assertNotNull(message34);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test341");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        int int3 = micazMsg1.get_NodeID();
        java.lang.Object obj4 = micazMsg1.clone();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        micazMsg6.set_NodeID(20);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray13);
        micazMsg6.dataSet(byteArray13);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray13, 0);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg17, (int) (short) 0);
        try {
            laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg17, 65, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 65, data_length -1 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(byteArray13);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test342");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(6, 16);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test343");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        net.tinyos.message.Message message6 = micazMsg2.clone((int) '4');
        java.lang.Object obj7 = message6.clone();
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        java.lang.Object obj11 = micazMsg9.clone();
        micazMsg9.set_NodeID(20);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray16);
        micazMsg9.dataSet(byteArray16);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray16, 0);
        int int21 = micazMsg20.amType();
        int int22 = micazMsg20.get_NodeID();
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray25 = micazMsg24.get_Buffer();
        java.lang.Object obj26 = micazMsg24.clone();
        int int27 = micazMsg24.get_NodeID();
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg(byteArray30);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg(byteArray30, 2);
        micazMsg24.dataSet(byteArray30);
        micazMsg20.dataSet(byteArray30);
        message6.dataSet(byteArray30);
        try {
            laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg(message6, 266);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 266, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 172 + "'", int21 == 172);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 256 + "'", int22 == 256);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test344");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        micazMsg1.amTypeSet(52);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray10, 48);
        micazMsg1.dataSet(byteArray10);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray16);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray16, 2);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray16);
        micazMsg20.set_NodeID((int) (byte) 10);
        byte[] byteArray23 = micazMsg20.dataGet();
        micazMsg1.dataSet(byteArray23);
        net.tinyos.message.Message message26 = micazMsg1.clone(20);
        net.tinyos.message.SerialPacket serialPacket27 = message26.getSerialPacket();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(message26);
        org.junit.Assert.assertNull(serialPacket27);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test345");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        int int5 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = micazMsg7.get_Buffer();
        java.lang.Object obj9 = micazMsg7.clone();
        micazMsg7.set_NodeID(20);
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray14);
        micazMsg7.dataSet(byteArray14);
        short short18 = micazMsg7.getElement_Buffer(0);
        net.tinyos.message.Message message20 = micazMsg7.clone((int) (byte) 100);
        short[] shortArray21 = micazMsg7.get_Buffer();
        micazMsg1.set_Buffer(shortArray21);
        micazMsg1.amTypeSet(100);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 4, 0);
        int int28 = micazMsg1.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
        org.junit.Assert.assertNotNull(message20);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test346");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray6);
        java.lang.Object obj9 = micazMsg8.clone();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        java.lang.Object obj13 = micazMsg11.clone();
        micazMsg11.set_NodeID(20);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray18);
        micazMsg11.dataSet(byteArray18);
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray18, 0);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray18, 3);
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray18, 32);
        micazMsg8.dataSet(byteArray18);
        micazMsg8.set_Voltage(52);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray32 = micazMsg31.get_Buffer();
        java.lang.Object obj33 = micazMsg31.clone();
        net.tinyos.message.SerialPacket serialPacket34 = micazMsg31.getSerialPacket();
        java.lang.Object obj35 = micazMsg31.clone();
        laccan.devices.Sample sample37 = new laccan.devices.Sample(micazMsg31, (long) 8);
        try {
            micazMsg8.dataSet((net.tinyos.message.Message) micazMsg31, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNull(serialPacket34);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test347");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        byte[] byteArray7 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7);
        int int11 = micazMsg10.get_Voltage();
        byte[] byteArray12 = micazMsg10.dataGet();
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray12, 12);
        java.lang.String str15 = micazMsg14.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str15.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test348");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        storageCSV3.save(strArray4);
        storageCSV0.save(strArray4);
        laccan.persistence.StorageCSV storageCSV8 = storageCSV0.local("nodes");
        laccan.persistence.StorageCSV storageCSV10 = storageCSV0.local("init");
        java.util.List<laccan.devices.Sample> sampleList11 = storageCSV0.read();
        laccan.persistence.StorageCSV storageCSV13 = storageCSV0.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        laccan.persistence.StorageCSV storageCSV15 = storageCSV0.local("full_memory;1.0;172");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(sampleList11);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(storageCSV15);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test349");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        java.lang.String str4 = micazMsg2.toString();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg6.set_Buffer(shortArray12);
        java.lang.String str14 = micazMsg6.toString();
        micazMsg6.set_NodeID(24);
        int int17 = micazMsg6.amType();
        micazMsg2.dataSet((net.tinyos.message.Message) micazMsg6, 1);
        int int20 = micazMsg6.get_NodeID();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str14.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 172 + "'", int17 == 172);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 24 + "'", int20 == 24);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test350");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 ", (double) (byte) 100, (long) ' ');
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test351");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(12, 4);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test352");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(96, 8);
        byte[] byteArray3 = micazMsg2.dataGet();
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test353");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5);
        laccan.devices.Type type9 = null;
        sample8.setType(type9);
        laccan.devices.Type type11 = null;
        sample8.setType(type11);
        sample8.setNode("hi!");
        keepingAll0.add(sample8);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg17);
        laccan.devices.Type type21 = null;
        sample20.setType(type21);
        java.lang.String str23 = sample20.toString();
        java.lang.String str24 = sample20.getNode();
        keepingAll0.add(sample20);
        int int26 = keepingAll0.length();
        laccan.devices.Sample sample27 = null;
        keepingAll0.add(sample27);
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray31 = micazMsg30.get_Buffer();
        laccan.devices.Sample sample32 = new laccan.devices.Sample(micazMsg30);
        laccan.devices.Sample sample34 = new laccan.devices.Sample(micazMsg30, (long) (short) 10);
        double double35 = sample34.getDateDouble();
        java.lang.String[] strArray36 = sample34.toCSV();
        keepingAll0.add(sample34);
        java.util.List<laccan.devices.Sample> sampleList38 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList39 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList40 = keepingAll0.get();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "null;-19.699999999999996;0" + "'", str23.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(sampleList38);
        org.junit.Assert.assertNotNull(sampleList39);
        org.junit.Assert.assertNotNull(sampleList40);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test354");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) 10.0f, (long) (short) 100);
        double double4 = sample3.getTemperature();
        double double5 = sample3.getDateDouble();
        java.lang.String str6 = sample3.toString();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;10.0;100" + "'", str6.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;10.0;100"));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test355");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        short short12 = micazMsg1.getElement_Buffer(0);
        net.tinyos.message.Message message14 = micazMsg1.clone((int) (byte) 100);
        net.tinyos.message.SerialPacket serialPacket15 = micazMsg1.getSerialPacket();
        try {
            laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) serialPacket15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNull(serialPacket15);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test356");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5);
        laccan.devices.Type type9 = null;
        sample8.setType(type9);
        laccan.devices.Type type11 = null;
        sample8.setType(type11);
        sample8.setNode("hi!");
        keepingAll0.add(sample8);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg17);
        laccan.devices.Type type21 = null;
        sample20.setType(type21);
        java.lang.String str23 = sample20.toString();
        java.lang.String str24 = sample20.getNode();
        keepingAll0.add(sample20);
        int int26 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray29 = micazMsg28.get_Buffer();
        java.lang.Object obj30 = micazMsg28.clone();
        laccan.devices.Sample sample31 = new laccan.devices.Sample(micazMsg28);
        sample31.setDate((long) '#');
        java.lang.String[] strArray34 = sample31.toCSV();
        keepingAll0.add(sample31);
        sample31.setTemperature((double) 256);
        long long38 = sample31.getDate();
        sample31.setTemperature((double) (-2));
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "null;-19.699999999999996;0" + "'", str23.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 35L + "'", long38 == 35L);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test357");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj12 = micazMsg11.clone();
        int int13 = micazMsg11.get_NodeID();
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg11, (long) (byte) -1);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        java.lang.String str20 = micazMsg17.toString();
        short[] shortArray21 = micazMsg17.get_Buffer();
        micazMsg11.set_Buffer(shortArray21);
        micazMsg11.set_Voltage(0);
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg(byteArray29, 48);
        micazMsg11.dataSet(byteArray29);
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray35 = micazMsg34.get_Buffer();
        java.lang.Object obj36 = micazMsg34.clone();
        java.lang.String str37 = micazMsg34.toString();
        short[] shortArray38 = micazMsg34.get_Buffer();
        byte[] byteArray39 = micazMsg34.dataGet();
        java.lang.Object obj40 = micazMsg34.clone();
        laccan.devices.Sample sample41 = new laccan.devices.Sample(micazMsg34);
        int int42 = micazMsg34.dataLength();
        int int43 = micazMsg34.baseOffset();
        laccan.devices.Sample sample44 = new laccan.devices.Sample(micazMsg34);
        short[] shortArray45 = micazMsg34.get_Buffer();
        micazMsg11.set_Buffer(shortArray45);
        micazMsg8.set_Buffer(shortArray45);
        int int48 = micazMsg8.dataLength();
        laccan.devices.Sample sample49 = new laccan.devices.Sample(micazMsg8);
        java.lang.String str50 = sample49.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str20.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str37.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 52 + "'", int48 == 52);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "null;-19.699999999999996;0" + "'", str50.equals("null;-19.699999999999996;0"));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test358");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory;-19.699999999999996;-1", (double) 24, 32L);
        sample3.setNode("");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test359");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        laccan.memory.data.reduction.KeepingAll keepingAll9 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        java.lang.Object obj13 = micazMsg11.clone();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg11);
        laccan.devices.Type type15 = null;
        sample14.setType(type15);
        keepingAll9.add(sample14);
        sample14.setDate((long) (byte) 100);
        memory0.add(sample14);
        memory0.build();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = micazMsg23.get_Buffer();
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg23);
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg23, (long) (short) 10);
        java.lang.String str28 = sample27.getNode();
        java.lang.String str29 = sample27.getNode();
        memory0.add(sample27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test360");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        micazMsg3.amTypeSet(0);
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test361");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        memory0.build();
        laccan.memory.Container container10 = memory0.getMemory();
        laccan.memory.Container container11 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        micazMsg13.set_NodeID(20);
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg13);
        memory0.add(sample18);
        memory0.build();
        int int21 = memory0.length();
        laccan.devices.Sample sample22 = null;
        memory0.add(sample22);
        java.lang.Class<?> wildcardClass24 = memory0.getClass();
        int int25 = memory0.length();
        memory0.build();
        int int27 = memory0.length();
        laccan.devices.Sample sample28 = null;
        memory0.add(sample28);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray32 = micazMsg31.get_Buffer();
        java.lang.Object obj33 = micazMsg31.clone();
        short short35 = micazMsg31.getElement_Buffer((int) (short) 0);
        byte[] byteArray36 = micazMsg31.dataGet();
        byte[] byteArray37 = micazMsg31.dataGet();
        laccan.devices.Sample sample38 = new laccan.devices.Sample(micazMsg31);
        memory0.add(sample38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 0 + "'", short35 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertNotNull(byteArray37);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test362");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) ' ');
        micazMsg1.set_NodeID((int) ' ');
        net.tinyos.message.SerialPacket serialPacket14 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg1, (long) 100);
        micazMsg1.init((int) '4');
        int int19 = micazMsg1.amType();
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg1);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(serialPacket14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test363");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(512, 52);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test364");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg10);
        int int13 = micazMsg10.get_NodeID();
        micazMsg10.amTypeSet((int) (byte) 100);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg10, (int) (short) 0);
        int int18 = micazMsg1.dataLength();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = micazMsg20.get_Buffer();
        micazMsg20.setElement_Buffer(0, (short) 10);
        micazMsg20.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray29 = micazMsg28.get_Buffer();
        java.lang.Object obj30 = micazMsg28.clone();
        int int31 = micazMsg28.get_NodeID();
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg(byteArray34);
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg(byteArray34, 2);
        micazMsg28.dataSet(byteArray34);
        micazMsg20.dataSet(byteArray34);
        micazMsg1.dataSet(byteArray34);
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg(byteArray34, (int) (short) 1);
        laccan.devices.MicazMsg micazMsg44 = new laccan.devices.MicazMsg(byteArray34, 4);
        laccan.devices.MicazMsg micazMsg46 = new laccan.devices.MicazMsg(byteArray34, 4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test365");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1);
        net.tinyos.message.SerialPacket serialPacket8 = micazMsg1.getSerialPacket();
        try {
            laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) serialPacket8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNull(serialPacket8);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test366");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 100);
        double double11 = sample10.getTemperature();
        java.lang.String str12 = sample10.getNode();
        sample10.setNode("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=;NaN;35");
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-19.699999999999996d) + "'", double11 == (-19.699999999999996d));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test367");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        laccan.cloud.prediction.Regression regression1 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray4 = micazMsg3.get_Buffer();
        java.lang.Object obj5 = micazMsg3.clone();
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg3);
        laccan.devices.Sample sample7 = new laccan.devices.Sample();
        laccan.devices.Sample sample8 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray9 = new laccan.devices.Sample[] { sample6, sample7, sample8 };
        java.util.ArrayList<laccan.devices.Sample> sampleList10 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList10, sampleArray9);
        java.util.List<java.lang.Double> doubleList12 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList10);
        java.util.List<java.lang.Double> doubleList13 = regression1.result(doubleList12);
        java.util.List<java.lang.Double> doubleList14 = regression0.result(doubleList13);
        laccan.cloud.prediction.Regression regression15 = new laccan.cloud.prediction.Regression();
        double double16 = regression15.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll17 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList18 = keepingAll17.get();
        laccan.cloud.prediction.Regression regression19 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray22 = micazMsg21.get_Buffer();
        java.lang.Object obj23 = micazMsg21.clone();
        laccan.devices.Sample sample24 = new laccan.devices.Sample(micazMsg21);
        laccan.devices.Sample sample25 = new laccan.devices.Sample();
        laccan.devices.Sample sample26 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray27 = new laccan.devices.Sample[] { sample24, sample25, sample26 };
        java.util.ArrayList<laccan.devices.Sample> sampleList28 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList28, sampleArray27);
        java.util.List<java.lang.Double> doubleList30 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList28);
        java.util.List<java.lang.Double> doubleList31 = regression19.result(doubleList30);
        regression15.init(sampleList18, doubleList30);
        laccan.cloud.prediction.Regression regression33 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray36 = micazMsg35.get_Buffer();
        java.lang.Object obj37 = micazMsg35.clone();
        laccan.devices.Sample sample38 = new laccan.devices.Sample(micazMsg35);
        laccan.devices.Sample sample39 = new laccan.devices.Sample();
        laccan.devices.Sample sample40 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray41 = new laccan.devices.Sample[] { sample38, sample39, sample40 };
        java.util.ArrayList<laccan.devices.Sample> sampleList42 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList42, sampleArray41);
        java.util.List<java.lang.Double> doubleList44 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList42);
        java.util.List<java.lang.Double> doubleList45 = regression33.result(doubleList44);
        regression0.init(sampleList18, doubleList44);
        laccan.persistence.StorageCSV storageCSV47 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV49 = storageCSV47.local("hi!");
        laccan.persistence.StorageCSV storageCSV51 = storageCSV49.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList52 = storageCSV51.read();
        laccan.persistence.StorageCSV storageCSV54 = storageCSV51.local("init");
        laccan.persistence.StorageCSV storageCSV56 = storageCSV51.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList57 = storageCSV51.read();
        java.util.List<java.lang.Double> doubleList58 = laccan.cloud.prediction.Regression.makeTests(sampleList57);
        java.util.List<java.lang.Double> doubleList59 = regression0.result(doubleList58);
        double double60 = regression0.mse();
        double double61 = regression0.mse();
        java.util.List<java.lang.Double> doubleList62 = regression0.result();
        laccan.memory.Memory memory63 = new laccan.memory.Memory();
        memory63.build();
        int int65 = memory63.length();
        laccan.memory.data.reduction.KeepingAll keepingAll66 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample67 = new laccan.devices.Sample();
        keepingAll66.add(sample67);
        sample67.setDate(10L);
        memory63.add(sample67);
        memory63.build();
        laccan.memory.Container container73 = memory63.getMemory();
        java.lang.Class<?> wildcardClass74 = container73.getClass();
        java.util.List<laccan.devices.Sample> sampleList75 = container73.get();
        java.util.List<java.lang.Double> doubleList76 = laccan.cloud.prediction.Regression.makeTests(sampleList75);
        java.util.List<java.lang.Double> doubleList77 = regression0.result(doubleList76);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(sampleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertEquals((double) double16, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList18);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(sampleArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doubleList30);
        org.junit.Assert.assertNotNull(doubleList31);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(sampleArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(doubleList44);
        org.junit.Assert.assertNotNull(doubleList45);
        org.junit.Assert.assertNotNull(storageCSV49);
        org.junit.Assert.assertNotNull(storageCSV51);
        org.junit.Assert.assertNotNull(sampleList52);
        org.junit.Assert.assertNotNull(storageCSV54);
        org.junit.Assert.assertNotNull(storageCSV56);
        org.junit.Assert.assertNotNull(sampleList57);
        org.junit.Assert.assertNotNull(doubleList58);
        org.junit.Assert.assertNotNull(doubleList59);
        org.junit.Assert.assertEquals((double) double60, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double61, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(container73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(sampleList75);
        org.junit.Assert.assertNotNull(doubleList76);
        org.junit.Assert.assertNotNull(doubleList77);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test368");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        memory0.build();
        int int4 = memory0.length();
        laccan.memory.Container container5 = memory0.getMemory();
        int int6 = memory0.length();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg8);
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg8, (long) (short) 10);
        java.lang.String str13 = sample12.getNode();
        long long14 = sample12.getDate();
        memory0.add(sample12);
        laccan.memory.Memory memory16 = new laccan.memory.Memory();
        memory16.build();
        int int18 = memory16.length();
        laccan.memory.Container container19 = memory16.getMemory();
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray27 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg21.set_Buffer(shortArray27);
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg21);
        java.lang.String[] strArray30 = sample29.toCSV();
        sample29.setNode("hi!");
        memory16.add(sample29);
        sample29.setDate((long) ' ');
        memory0.add(sample29);
        sample29.setNode("reduction;-19.699999999999996;0;100.0;0");
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(container5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(container19);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test369");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.set_NodeID((int) (byte) 100);
        int int9 = micazMsg1.get_NodeID();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test370");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        java.util.List<laccan.devices.Sample> sampleList6 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV8 = storageCSV4.local("");
        laccan.persistence.StorageCSV storageCSV10 = storageCSV8.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        laccan.persistence.StorageCSV storageCSV11 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV13 = storageCSV11.local("hi!");
        laccan.persistence.StorageCSV storageCSV14 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray15 = new java.lang.String[] {};
        storageCSV14.save(strArray15);
        storageCSV11.save(strArray15);
        laccan.persistence.StorageCSV storageCSV19 = storageCSV11.local("nodes");
        laccan.persistence.StorageCSV storageCSV21 = storageCSV11.local("init");
        java.util.List<laccan.devices.Sample> sampleList22 = storageCSV11.read();
        laccan.memory.data.reduction.KeepingAll keepingAll23 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample24 = new laccan.devices.Sample();
        keepingAll23.add(sample24);
        sample24.setTemperature((double) 0L);
        java.lang.String[] strArray28 = sample24.toCSV();
        storageCSV11.save(strArray28);
        storageCSV10.save(strArray28);
        java.util.List<laccan.devices.Sample> sampleList31 = storageCSV10.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(storageCSV19);
        org.junit.Assert.assertNotNull(storageCSV21);
        org.junit.Assert.assertNotNull(sampleList22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(sampleList31);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test371");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        java.lang.String str8 = micazMsg7.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str8.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test372");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        short short12 = micazMsg1.getElement_Buffer(0);
        net.tinyos.message.Message message14 = micazMsg1.clone((int) (byte) 100);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(message14, 10);
        byte[] byteArray17 = micazMsg16.dataGet();
        int int18 = micazMsg16.dataLength();
        micazMsg16.set_Voltage(160);
        micazMsg16.setElement_Buffer((int) (byte) 1, (short) -1);
        net.tinyos.message.SerialPacket serialPacket24 = micazMsg16.getSerialPacket();
        micazMsg16.set_Voltage(20);
        micazMsg16.init(0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 24 + "'", int18 == 24);
        org.junit.Assert.assertNull(serialPacket24);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test373");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll2 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll2.get();
        laccan.cloud.prediction.Regression regression4 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        laccan.devices.Sample sample10 = new laccan.devices.Sample();
        laccan.devices.Sample sample11 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray12 = new laccan.devices.Sample[] { sample9, sample10, sample11 };
        java.util.ArrayList<laccan.devices.Sample> sampleList13 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList13, sampleArray12);
        java.util.List<java.lang.Double> doubleList15 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList13);
        java.util.List<java.lang.Double> doubleList16 = regression4.result(doubleList15);
        regression0.init(sampleList3, doubleList15);
        laccan.cloud.prediction.Regression regression18 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = micazMsg20.get_Buffer();
        java.lang.Object obj22 = micazMsg20.clone();
        laccan.devices.Sample sample23 = new laccan.devices.Sample(micazMsg20);
        laccan.devices.Sample sample24 = new laccan.devices.Sample();
        laccan.devices.Sample sample25 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray26 = new laccan.devices.Sample[] { sample23, sample24, sample25 };
        java.util.ArrayList<laccan.devices.Sample> sampleList27 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList27, sampleArray26);
        java.util.List<java.lang.Double> doubleList29 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList27);
        java.util.List<java.lang.Double> doubleList30 = regression18.result(doubleList29);
        java.util.List<java.lang.Double> doubleList31 = regression0.result(doubleList29);
        double double32 = regression0.mse();
        laccan.cloud.prediction.Regression regression33 = new laccan.cloud.prediction.Regression();
        double double34 = regression33.mse();
        double double35 = regression33.mse();
        java.util.List<laccan.devices.Sample> sampleList36 = null;
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray39 = micazMsg38.get_Buffer();
        java.lang.Object obj40 = micazMsg38.clone();
        laccan.devices.Sample sample41 = new laccan.devices.Sample(micazMsg38);
        laccan.devices.Sample sample42 = new laccan.devices.Sample();
        laccan.devices.Sample sample43 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray44 = new laccan.devices.Sample[] { sample41, sample42, sample43 };
        java.util.ArrayList<laccan.devices.Sample> sampleList45 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList45, sampleArray44);
        java.util.List<java.lang.Double> doubleList47 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList45);
        regression33.init(sampleList36, doubleList47);
        java.util.List<java.lang.Double> doubleList49 = regression0.result(doubleList47);
        double double50 = regression0.mse();
        laccan.cloud.prediction.Regression regression51 = new laccan.cloud.prediction.Regression();
        double double52 = regression51.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll53 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList54 = keepingAll53.get();
        laccan.cloud.prediction.Regression regression55 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg57 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray58 = micazMsg57.get_Buffer();
        java.lang.Object obj59 = micazMsg57.clone();
        laccan.devices.Sample sample60 = new laccan.devices.Sample(micazMsg57);
        laccan.devices.Sample sample61 = new laccan.devices.Sample();
        laccan.devices.Sample sample62 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray63 = new laccan.devices.Sample[] { sample60, sample61, sample62 };
        java.util.ArrayList<laccan.devices.Sample> sampleList64 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList64, sampleArray63);
        java.util.List<java.lang.Double> doubleList66 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList64);
        java.util.List<java.lang.Double> doubleList67 = regression55.result(doubleList66);
        regression51.init(sampleList54, doubleList66);
        laccan.devices.MicazMsg micazMsg70 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray71 = micazMsg70.get_Buffer();
        java.lang.Object obj72 = micazMsg70.clone();
        laccan.devices.Sample sample73 = new laccan.devices.Sample(micazMsg70);
        laccan.devices.Sample sample74 = new laccan.devices.Sample();
        laccan.devices.Sample sample75 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray76 = new laccan.devices.Sample[] { sample73, sample74, sample75 };
        java.util.ArrayList<laccan.devices.Sample> sampleList77 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList77, sampleArray76);
        java.util.List<java.lang.Double> doubleList79 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList77);
        java.util.List<java.lang.Double> doubleList80 = regression51.result(doubleList79);
        java.util.List<java.lang.Double> doubleList81 = regression0.result(doubleList79);
        java.util.List<java.lang.Double> doubleList82 = regression0.result();
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(sampleArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(sampleArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(doubleList29);
        org.junit.Assert.assertNotNull(doubleList30);
        org.junit.Assert.assertNotNull(doubleList31);
        org.junit.Assert.assertEquals((double) double32, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double34, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double35, Double.NaN, 0);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(sampleArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(doubleList47);
        org.junit.Assert.assertNotNull(doubleList49);
        org.junit.Assert.assertEquals((double) double50, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double52, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList54);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(sampleArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(doubleList66);
        org.junit.Assert.assertNotNull(doubleList67);
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(sampleArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(doubleList79);
        org.junit.Assert.assertNotNull(doubleList80);
        org.junit.Assert.assertNotNull(doubleList81);
        org.junit.Assert.assertNotNull(doubleList82);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test374");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        java.lang.Object obj8 = micazMsg1.clone();
        byte[] byteArray9 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray9, 6, 0);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray9);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray9);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test375");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.set_NodeID((int) (byte) 100);
        java.lang.Object obj9 = micazMsg1.clone();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test376");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        short short12 = micazMsg1.getElement_Buffer(0);
        net.tinyos.message.Message message14 = micazMsg1.clone((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = micazMsg1.getClass();
        int int16 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        java.lang.Object obj20 = micazMsg18.clone();
        int int21 = micazMsg18.get_NodeID();
        micazMsg18.setElement_Buffer(1, (short) (byte) 0);
        micazMsg18.set_NodeID((int) 'a');
        int int27 = micazMsg18.dataLength();
        short[] shortArray28 = micazMsg18.get_Buffer();
        micazMsg1.set_Buffer(shortArray28);
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (-1), 1);
        micazMsg1.amTypeSet((int) ' ');
        java.lang.Object obj35 = micazMsg1.clone();
        int int36 = micazMsg1.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test377");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(112);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test378");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        int int9 = micazMsg1.get_Voltage();
        micazMsg1.amTypeSet((int) '#');
        net.tinyos.message.Message message13 = micazMsg1.clone((int) (byte) 10);
        micazMsg1.set_Voltage(0);
        micazMsg1.amTypeSet(4);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(2, (int) ' ');
        int int21 = micazMsg20.amType();
        int int22 = micazMsg20.baseOffset();
        net.tinyos.message.SerialPacket serialPacket23 = micazMsg20.getSerialPacket();
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg20, (int) (short) 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(message13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 172 + "'", int21 == 172);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNull(serialPacket23);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test379");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(512, 0);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test380");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        int int13 = micazMsg12.amType();
        int int14 = micazMsg12.get_NodeID();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = micazMsg16.get_Buffer();
        java.lang.Object obj18 = micazMsg16.clone();
        int int19 = micazMsg16.get_NodeID();
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray22);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray22, 2);
        micazMsg16.dataSet(byteArray22);
        micazMsg12.dataSet(byteArray22);
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray22, (int) (byte) 1, 0);
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg(byteArray22, 48);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg(byteArray22);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 172 + "'", int13 == 172);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test381");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg10);
        int int13 = micazMsg10.get_NodeID();
        micazMsg10.amTypeSet((int) (byte) 100);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg10, (int) (short) 0);
        int int18 = micazMsg1.dataLength();
        int int19 = micazMsg1.get_Voltage();
        micazMsg1.set_NodeID(3);
        int int22 = micazMsg1.amType();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 172 + "'", int22 == 172);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test382");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        memory0.build();
        laccan.memory.Container container10 = memory0.getMemory();
        laccan.memory.Container container11 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        micazMsg13.set_NodeID(20);
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg13);
        memory0.add(sample18);
        memory0.build();
        int int21 = memory0.length();
        laccan.devices.Sample sample22 = null;
        memory0.add(sample22);
        java.lang.Class<?> wildcardClass24 = memory0.getClass();
        int int25 = memory0.length();
        memory0.build();
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray29 = micazMsg28.get_Buffer();
        java.lang.Object obj30 = micazMsg28.clone();
        micazMsg28.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg28, (int) (byte) 0);
        int int35 = micazMsg28.baseOffset();
        laccan.devices.Sample sample37 = new laccan.devices.Sample(micazMsg28, (long) 100);
        long long38 = sample37.getDate();
        double double39 = sample37.getDateDouble();
        memory0.add(sample37);
        java.lang.String str41 = sample37.getNode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test383");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        net.tinyos.message.Message message14 = micazMsg1.clone(24);
        message14.amTypeSet(172);
        net.tinyos.message.Message message17 = null;
        try {
            message14.dataSet(message17, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test384");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample();
        laccan.devices.Type type11 = laccan.devices.Type.FULL;
        sample10.setType(type11);
        sample9.setType(type11);
        java.lang.String str14 = sample9.toString();
        sample9.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        double double17 = sample9.getTemperature();
        sample9.setDate((long) 48);
        laccan.devices.Type type20 = sample9.getType();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null;-19.648499999999995;0" + "'", str14.equals("null;-19.648499999999995;0"));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-19.648499999999995d) + "'", double17 == (-19.648499999999995d));
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + laccan.devices.Type.FULL + "'", type20.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test385");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("memory");
        laccan.persistence.StorageCSV storageCSV9 = storageCSV7.local("null;-19.699999999999996;0");
        laccan.persistence.StorageCSV storageCSV11 = storageCSV7.local("null;-19.699999999999996;24");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(storageCSV11);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test386");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        int int13 = micazMsg12.amType();
        int int14 = micazMsg12.get_NodeID();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = micazMsg16.get_Buffer();
        java.lang.Object obj18 = micazMsg16.clone();
        int int19 = micazMsg16.get_NodeID();
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray22);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray22, 2);
        micazMsg16.dataSet(byteArray22);
        micazMsg12.dataSet(byteArray22);
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray22, (int) (byte) 1, 0);
        java.lang.Object obj31 = micazMsg30.clone();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 172 + "'", int13 == 172);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test387");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        int int9 = memory0.length();
        laccan.memory.Container container10 = memory0.getMemory();
        laccan.memory.Memory memory11 = new laccan.memory.Memory();
        memory11.build();
        int int13 = memory11.length();
        laccan.memory.data.reduction.KeepingAll keepingAll14 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample15 = new laccan.devices.Sample();
        keepingAll14.add(sample15);
        sample15.setDate(10L);
        memory11.add(sample15);
        memory0.add(sample15);
        memory0.build();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = micazMsg23.get_Buffer();
        java.lang.Object obj25 = micazMsg23.clone();
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg23);
        sample26.setDate((long) '#');
        sample26.setTemperature((-1.0d));
        memory0.add(sample26);
        laccan.memory.Container container32 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray35 = micazMsg34.get_Buffer();
        java.lang.Object obj36 = micazMsg34.clone();
        micazMsg34.amTypeSet(20);
        laccan.devices.Sample sample39 = new laccan.devices.Sample(micazMsg34);
        java.lang.Object obj40 = micazMsg34.clone();
        net.tinyos.message.Message message42 = micazMsg34.clone((int) ' ');
        laccan.devices.Sample sample43 = new laccan.devices.Sample(micazMsg34);
        java.lang.String str44 = sample43.toString();
        memory0.add(sample43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(container32);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(message42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "null;-19.699999999999996;0" + "'", str44.equals("null;-19.699999999999996;0"));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test388");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("init", (double) 100.0f, (long) 32);
        sample3.setTemperature((double) ' ');
        sample3.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;1.0;10");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test389");
        laccan.devices.Sample sample0 = new laccan.devices.Sample();
        laccan.devices.Type type1 = laccan.devices.Type.FULL;
        sample0.setType(type1);
        java.lang.Class<?> wildcardClass3 = sample0.getClass();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + laccan.devices.Type.FULL + "'", type1.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test390");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        laccan.devices.Type type6 = laccan.devices.Type.FULL;
        sample4.setType(type6);
        sample4.setNode("reduction");
        java.lang.String[] strArray10 = sample4.toCSV();
        java.lang.String str11 = sample4.getNode();
        sample4.setNode("memory;-1.0;32");
        sample4.setTemperature((double) 96);
        sample4.setTemperature((double) 20);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "reduction" + "'", str11.equals("reduction"));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test391");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        double double2 = regression0.mse();
        java.util.List<laccan.devices.Sample> sampleList3 = null;
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5);
        laccan.devices.Sample sample9 = new laccan.devices.Sample();
        laccan.devices.Sample sample10 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray11 = new laccan.devices.Sample[] { sample8, sample9, sample10 };
        java.util.ArrayList<laccan.devices.Sample> sampleList12 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList12, sampleArray11);
        java.util.List<java.lang.Double> doubleList14 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList12);
        regression0.init(sampleList3, doubleList14);
        laccan.cloud.prediction.Regression regression16 = new laccan.cloud.prediction.Regression();
        double double17 = regression16.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll18 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList19 = keepingAll18.get();
        laccan.cloud.prediction.Regression regression20 = new laccan.cloud.prediction.Regression();
        double double21 = regression20.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll22 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList23 = keepingAll22.get();
        laccan.cloud.prediction.Regression regression24 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray27 = micazMsg26.get_Buffer();
        java.lang.Object obj28 = micazMsg26.clone();
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg26);
        laccan.devices.Sample sample30 = new laccan.devices.Sample();
        laccan.devices.Sample sample31 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray32 = new laccan.devices.Sample[] { sample29, sample30, sample31 };
        java.util.ArrayList<laccan.devices.Sample> sampleList33 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList33, sampleArray32);
        java.util.List<java.lang.Double> doubleList35 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList33);
        java.util.List<java.lang.Double> doubleList36 = regression24.result(doubleList35);
        regression20.init(sampleList23, doubleList35);
        laccan.cloud.prediction.Regression regression38 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg40 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray41 = micazMsg40.get_Buffer();
        java.lang.Object obj42 = micazMsg40.clone();
        laccan.devices.Sample sample43 = new laccan.devices.Sample(micazMsg40);
        laccan.devices.Sample sample44 = new laccan.devices.Sample();
        laccan.devices.Sample sample45 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray46 = new laccan.devices.Sample[] { sample43, sample44, sample45 };
        java.util.ArrayList<laccan.devices.Sample> sampleList47 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList47, sampleArray46);
        java.util.List<java.lang.Double> doubleList49 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList47);
        java.util.List<java.lang.Double> doubleList50 = regression38.result(doubleList49);
        java.util.List<java.lang.Double> doubleList51 = regression20.result(doubleList49);
        regression16.init(sampleList19, doubleList49);
        regression16.train();
        java.util.List<java.lang.Double> doubleList54 = regression16.result();
        double double55 = regression16.mse();
        java.util.List<java.lang.Double> doubleList56 = regression16.result();
        java.util.List<java.lang.Double> doubleList57 = regression16.result();
        java.util.List<java.lang.Double> doubleList58 = regression0.result(doubleList57);
        laccan.devices.MicazMsg micazMsg60 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray61 = micazMsg60.get_Buffer();
        java.lang.Object obj62 = micazMsg60.clone();
        laccan.devices.Sample sample63 = new laccan.devices.Sample(micazMsg60);
        laccan.devices.Sample sample64 = new laccan.devices.Sample();
        laccan.devices.Sample sample65 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray66 = new laccan.devices.Sample[] { sample63, sample64, sample65 };
        java.util.ArrayList<laccan.devices.Sample> sampleList67 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList67, sampleArray66);
        java.util.List<java.lang.Double> doubleList69 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList67);
        java.util.List<java.lang.Double> doubleList70 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList67);
        java.util.List<java.lang.Double> doubleList71 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList67);
        java.util.List<java.lang.Double> doubleList72 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList67);
        java.util.List<java.lang.Double> doubleList73 = regression0.result(doubleList72);
        double double74 = regression0.mse();
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double2, Double.NaN, 0);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(sampleArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertEquals((double) double17, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList19);
        org.junit.Assert.assertEquals((double) double21, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList23);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(sampleArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleList35);
        org.junit.Assert.assertNotNull(doubleList36);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(sampleArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(doubleList49);
        org.junit.Assert.assertNotNull(doubleList50);
        org.junit.Assert.assertNotNull(doubleList51);
        org.junit.Assert.assertNotNull(doubleList54);
        org.junit.Assert.assertEquals((double) double55, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList56);
        org.junit.Assert.assertNotNull(doubleList57);
        org.junit.Assert.assertNotNull(doubleList58);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNotNull(sampleArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(doubleList69);
        org.junit.Assert.assertNotNull(doubleList70);
        org.junit.Assert.assertNotNull(doubleList71);
        org.junit.Assert.assertNotNull(doubleList72);
        org.junit.Assert.assertNotNull(doubleList73);
        org.junit.Assert.assertEquals((double) double74, Double.NaN, 0);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test392");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone(2);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (short) 10);
        try {
            net.tinyos.message.Message message13 = micazMsg11.clone((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test393");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("hi!;-19.699999999999996;0", (double) 48, (long) '#');
        sample3.setNode("null;10.0;0;32.0;10");
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test394");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray8);
        try {
            micazMsg13.setElement_Buffer(32, (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test395");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        laccan.cloud.prediction.Regression regression1 = new laccan.cloud.prediction.Regression();
        double double2 = regression1.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList4 = keepingAll3.get();
        laccan.cloud.prediction.Regression regression5 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = micazMsg7.get_Buffer();
        java.lang.Object obj9 = micazMsg7.clone();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg7);
        laccan.devices.Sample sample11 = new laccan.devices.Sample();
        laccan.devices.Sample sample12 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray13 = new laccan.devices.Sample[] { sample10, sample11, sample12 };
        java.util.ArrayList<laccan.devices.Sample> sampleList14 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList14, sampleArray13);
        java.util.List<java.lang.Double> doubleList16 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList14);
        java.util.List<java.lang.Double> doubleList17 = regression5.result(doubleList16);
        regression1.init(sampleList4, doubleList16);
        java.util.List<java.lang.Double> doubleList19 = regression0.result(doubleList16);
        double double20 = regression0.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll21 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample22 = new laccan.devices.Sample();
        keepingAll21.add(sample22);
        java.util.List<laccan.devices.Sample> sampleList24 = keepingAll21.get();
        laccan.cloud.prediction.Regression regression25 = new laccan.cloud.prediction.Regression();
        double double26 = regression25.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll27 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList28 = keepingAll27.get();
        laccan.cloud.prediction.Regression regression29 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray32 = micazMsg31.get_Buffer();
        java.lang.Object obj33 = micazMsg31.clone();
        laccan.devices.Sample sample34 = new laccan.devices.Sample(micazMsg31);
        laccan.devices.Sample sample35 = new laccan.devices.Sample();
        laccan.devices.Sample sample36 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray37 = new laccan.devices.Sample[] { sample34, sample35, sample36 };
        java.util.ArrayList<laccan.devices.Sample> sampleList38 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList38, sampleArray37);
        java.util.List<java.lang.Double> doubleList40 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList38);
        java.util.List<java.lang.Double> doubleList41 = regression29.result(doubleList40);
        regression25.init(sampleList28, doubleList40);
        laccan.cloud.prediction.Regression regression43 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg45 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray46 = micazMsg45.get_Buffer();
        java.lang.Object obj47 = micazMsg45.clone();
        laccan.devices.Sample sample48 = new laccan.devices.Sample(micazMsg45);
        laccan.devices.Sample sample49 = new laccan.devices.Sample();
        laccan.devices.Sample sample50 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray51 = new laccan.devices.Sample[] { sample48, sample49, sample50 };
        java.util.ArrayList<laccan.devices.Sample> sampleList52 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList52, sampleArray51);
        java.util.List<java.lang.Double> doubleList54 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList52);
        java.util.List<java.lang.Double> doubleList55 = regression43.result(doubleList54);
        java.util.List<java.lang.Double> doubleList56 = regression25.result(doubleList54);
        regression0.init(sampleList24, doubleList56);
        java.util.List<java.lang.Double> doubleList58 = regression0.result();
        org.junit.Assert.assertEquals((double) double2, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(sampleArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertEquals((double) double20, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList24);
        org.junit.Assert.assertEquals((double) double26, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList28);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(sampleArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleList40);
        org.junit.Assert.assertNotNull(doubleList41);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(sampleArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(doubleList54);
        org.junit.Assert.assertNotNull(doubleList55);
        org.junit.Assert.assertNotNull(doubleList56);
        org.junit.Assert.assertNotNull(doubleList58);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test396");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5);
        long long9 = sample8.getDate();
        java.lang.Class<?> wildcardClass10 = sample8.getClass();
        keepingAll0.add(sample8);
        laccan.devices.Sample sample15 = new laccan.devices.Sample("memory;2.0;-1", (double) 512, 1L);
        keepingAll0.add(sample15);
        int int17 = keepingAll0.length();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test397");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        int int5 = micazMsg2.dataLength();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 4);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg9, 0);
        short[] shortArray12 = micazMsg9.get_Buffer();
        micazMsg2.set_Buffer(shortArray12);
        try {
            short short15 = micazMsg2.getElement_Buffer(20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(shortArray12);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test398");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.699999999999996;512", (double) (short) 1, 0L);
        java.lang.String str4 = sample3.getNode();
        double double5 = sample3.getTemperature();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null;-19.699999999999996;512" + "'", str4.equals("null;-19.699999999999996;512"));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test399");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 10);
        micazMsg9.setElement_Buffer((int) (short) 0, (short) 0);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg9, 0);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg9, (int) ' ', (int) (short) 1);
        short[] shortArray18 = micazMsg9.get_Buffer();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray18);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test400");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        int int9 = memory0.length();
        laccan.memory.Container container10 = memory0.getMemory();
        laccan.memory.Memory memory11 = new laccan.memory.Memory();
        memory11.build();
        int int13 = memory11.length();
        laccan.memory.data.reduction.KeepingAll keepingAll14 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample15 = new laccan.devices.Sample();
        keepingAll14.add(sample15);
        sample15.setDate(10L);
        memory11.add(sample15);
        memory0.add(sample15);
        sample15.setTemperature((double) 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test401");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, 2);
        micazMsg1.dataSet(byteArray7);
        int int12 = micazMsg1.baseOffset();
        int int13 = micazMsg1.get_Voltage();
        int int14 = micazMsg1.baseOffset();
        short[] shortArray15 = micazMsg1.get_Buffer();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(shortArray15);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test402");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        memory0.build();
        laccan.memory.Container container10 = memory0.getMemory();
        memory0.build();
        memory0.build();
        int int13 = memory0.length();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg15);
        int int18 = micazMsg15.dataLength();
        micazMsg15.init((int) '4');
        laccan.devices.Sample sample21 = new laccan.devices.Sample(micazMsg15);
        short[] shortArray22 = micazMsg15.get_Buffer();
        int int23 = micazMsg15.baseOffset();
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg15, (long) 3);
        memory0.add(sample25);
        laccan.memory.Container container27 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray30 = micazMsg29.get_Buffer();
        java.lang.Object obj31 = micazMsg29.clone();
        micazMsg29.set_NodeID(20);
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg(byteArray36);
        micazMsg29.dataSet(byteArray36);
        short short40 = micazMsg29.getElement_Buffer(0);
        net.tinyos.message.Message message42 = micazMsg29.clone((int) (byte) 100);
        int int43 = micazMsg29.get_Voltage();
        laccan.devices.Sample sample44 = new laccan.devices.Sample(micazMsg29);
        memory0.add(sample44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(container27);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertTrue("'" + short40 + "' != '" + (short) 0 + "'", short40 == (short) 0);
        org.junit.Assert.assertNotNull(message42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test403");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) -1, 24);
        net.tinyos.message.Message message4 = micazMsg2.clone(2);
        byte[] byteArray5 = message4.dataGet();
        int int6 = message4.baseOffset();
        org.junit.Assert.assertNotNull(message4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test404");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(0);
        java.lang.String str2 = micazMsg1.toString();
        try {
            laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 0, data_length 8 and data array size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str2.equals("Message <MicazMsg> \n  [Buffer="));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test405");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(24);
        int int2 = micazMsg1.amType();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        micazMsg6.set_NodeID(20);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray13);
        micazMsg6.dataSet(byteArray13);
        short short17 = micazMsg6.getElement_Buffer(0);
        net.tinyos.message.Message message19 = micazMsg6.clone((int) (byte) 100);
        short[] shortArray20 = micazMsg6.get_Buffer();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg23.amTypeSet(2);
        short[] shortArray26 = micazMsg23.get_Buffer();
        micazMsg6.set_Buffer(shortArray26);
        micazMsg4.set_Buffer(shortArray26);
        micazMsg1.set_Buffer(shortArray26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172 + "'", int2 == 172);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertNotNull(message19);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(shortArray26);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test406");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) ' ');
        int int5 = micazMsg1.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test407");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        micazMsg7.set_NodeID((-1));
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test408");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        int int3 = keepingAll0.length();
        int int4 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList5 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg7.set_Buffer(shortArray13);
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg7);
        laccan.devices.Sample sample16 = new laccan.devices.Sample();
        laccan.devices.Type type17 = laccan.devices.Type.FULL;
        sample16.setType(type17);
        sample15.setType(type17);
        double double20 = sample15.getDateDouble();
        java.lang.String str21 = sample15.toString();
        double double22 = sample15.getTemperature();
        sample15.setDate((long) 160);
        keepingAll0.add(sample15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + type17 + "' != '" + laccan.devices.Type.FULL + "'", type17.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "null;-19.648499999999995;0" + "'", str21.equals("null;-19.648499999999995;0"));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-19.648499999999995d) + "'", double22 == (-19.648499999999995d));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test409");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 1, 0L, 8);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test410");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.Container container3 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg5.set_Buffer(shortArray11);
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg5);
        java.lang.String[] strArray14 = sample13.toCSV();
        sample13.setNode("hi!");
        memory0.add(sample13);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = micazMsg19.get_Buffer();
        java.lang.Object obj21 = micazMsg19.clone();
        laccan.devices.Sample sample22 = new laccan.devices.Sample(micazMsg19);
        long long23 = sample22.getDate();
        java.lang.Class<?> wildcardClass24 = sample22.getClass();
        java.lang.String str25 = sample22.toString();
        java.lang.String str26 = sample22.toString();
        memory0.add(sample22);
        sample22.setNode("memory;-19.699999999999996;-1");
        long long30 = sample22.getDate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "null;-19.699999999999996;0" + "'", str25.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "null;-19.699999999999996;0" + "'", str26.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test411");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        laccan.devices.Type type7 = null;
        sample4.setType(type7);
        java.lang.String str9 = sample4.toString();
        java.lang.String str10 = sample4.toString();
        sample4.setDate((long) 97);
        double double13 = sample4.getDateDouble();
        sample4.setTemperature((double) 4);
        double double16 = sample4.getDateDouble();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null;-19.699999999999996;0" + "'", str9.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null;-19.699999999999996;0" + "'", str10.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test412");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5);
        laccan.devices.Type type9 = null;
        sample8.setType(type9);
        laccan.devices.Type type11 = null;
        sample8.setType(type11);
        sample8.setNode("hi!");
        keepingAll0.add(sample8);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg17);
        laccan.devices.Type type21 = null;
        sample20.setType(type21);
        java.lang.String str23 = sample20.toString();
        java.lang.String str24 = sample20.getNode();
        keepingAll0.add(sample20);
        int int26 = keepingAll0.length();
        laccan.devices.Sample sample27 = null;
        keepingAll0.add(sample27);
        int int29 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList30 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList31 = keepingAll0.get();
        try {
            java.util.List<java.lang.Double> doubleList32 = laccan.cloud.prediction.Regression.makeTests(sampleList31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "null;-19.699999999999996;0" + "'", str23.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(sampleList30);
        org.junit.Assert.assertNotNull(sampleList31);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test413");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.Container container3 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg5.set_Buffer(shortArray11);
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg5);
        java.lang.String[] strArray14 = sample13.toCSV();
        sample13.setNode("hi!");
        memory0.add(sample13);
        laccan.memory.Container container18 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = micazMsg20.get_Buffer();
        java.lang.Object obj22 = micazMsg20.clone();
        laccan.devices.Sample sample23 = new laccan.devices.Sample(micazMsg20);
        sample23.setDate((long) '#');
        memory0.add(sample23);
        laccan.memory.Container container27 = memory0.getMemory();
        int int28 = container27.length();
        java.util.List<laccan.devices.Sample> sampleList29 = container27.get();
        java.util.List<laccan.devices.Sample> sampleList30 = container27.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(container18);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(container27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(sampleList29);
        org.junit.Assert.assertNotNull(sampleList30);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test414");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        java.lang.String str13 = micazMsg10.toString();
        short[] shortArray14 = micazMsg10.get_Buffer();
        byte[] byteArray15 = micazMsg10.dataGet();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray15);
        micazMsg1.dataSet(byteArray15);
        int int18 = micazMsg1.get_Voltage();
        byte[] byteArray19 = micazMsg1.dataGet();
        micazMsg1.set_Voltage(2);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test415");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 10, 10);
        net.tinyos.message.Message message4 = micazMsg2.clone((int) (byte) 10);
        int int5 = message4.dataLength();
        org.junit.Assert.assertNotNull(message4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test416");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        int int16 = micazMsg13.dataLength();
        int int17 = micazMsg13.amType();
        micazMsg13.amTypeSet((-1));
        int int20 = micazMsg13.dataLength();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 172 + "'", int17 == 172);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test417");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray3 = micazMsg2.get_Buffer();
        java.lang.Object obj4 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample();
        laccan.devices.Sample sample7 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray8 = new laccan.devices.Sample[] { sample5, sample6, sample7 };
        java.util.ArrayList<laccan.devices.Sample> sampleList9 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList9, sampleArray8);
        java.util.List<java.lang.Double> doubleList11 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList9);
        java.util.List<java.lang.Double> doubleList12 = regression0.result(doubleList11);
        double double13 = regression0.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll14 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList15 = keepingAll14.get();
        int int16 = keepingAll14.length();
        laccan.memory.data.reduction.KeepingAll keepingAll17 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample18 = new laccan.devices.Sample();
        keepingAll17.add(sample18);
        sample18.setDate(10L);
        keepingAll14.add(sample18);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray30 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg24.set_Buffer(shortArray30);
        laccan.devices.Sample sample32 = new laccan.devices.Sample(micazMsg24);
        laccan.devices.Sample sample33 = new laccan.devices.Sample();
        laccan.devices.Type type34 = laccan.devices.Type.FULL;
        sample33.setType(type34);
        sample32.setType(type34);
        sample32.setTemperature((double) 'a');
        keepingAll14.add(sample32);
        java.util.List<laccan.devices.Sample> sampleList40 = keepingAll14.get();
        laccan.cloud.prediction.Regression regression41 = new laccan.cloud.prediction.Regression();
        double double42 = regression41.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll43 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList44 = keepingAll43.get();
        laccan.cloud.prediction.Regression regression45 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg47 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray48 = micazMsg47.get_Buffer();
        java.lang.Object obj49 = micazMsg47.clone();
        laccan.devices.Sample sample50 = new laccan.devices.Sample(micazMsg47);
        laccan.devices.Sample sample51 = new laccan.devices.Sample();
        laccan.devices.Sample sample52 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray53 = new laccan.devices.Sample[] { sample50, sample51, sample52 };
        java.util.ArrayList<laccan.devices.Sample> sampleList54 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList54, sampleArray53);
        java.util.List<java.lang.Double> doubleList56 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList54);
        java.util.List<java.lang.Double> doubleList57 = regression45.result(doubleList56);
        regression41.init(sampleList44, doubleList56);
        laccan.cloud.prediction.Regression regression59 = new laccan.cloud.prediction.Regression();
        double double60 = regression59.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll61 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList62 = keepingAll61.get();
        laccan.cloud.prediction.Regression regression63 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg65 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray66 = micazMsg65.get_Buffer();
        java.lang.Object obj67 = micazMsg65.clone();
        laccan.devices.Sample sample68 = new laccan.devices.Sample(micazMsg65);
        laccan.devices.Sample sample69 = new laccan.devices.Sample();
        laccan.devices.Sample sample70 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray71 = new laccan.devices.Sample[] { sample68, sample69, sample70 };
        java.util.ArrayList<laccan.devices.Sample> sampleList72 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList72, sampleArray71);
        java.util.List<java.lang.Double> doubleList74 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList72);
        java.util.List<java.lang.Double> doubleList75 = regression63.result(doubleList74);
        regression59.init(sampleList62, doubleList74);
        laccan.cloud.prediction.Regression regression77 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg79 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray80 = micazMsg79.get_Buffer();
        java.lang.Object obj81 = micazMsg79.clone();
        laccan.devices.Sample sample82 = new laccan.devices.Sample(micazMsg79);
        laccan.devices.Sample sample83 = new laccan.devices.Sample();
        laccan.devices.Sample sample84 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray85 = new laccan.devices.Sample[] { sample82, sample83, sample84 };
        java.util.ArrayList<laccan.devices.Sample> sampleList86 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList86, sampleArray85);
        java.util.List<java.lang.Double> doubleList88 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList86);
        java.util.List<java.lang.Double> doubleList89 = regression77.result(doubleList88);
        regression41.init(sampleList62, doubleList89);
        regression0.init(sampleList40, doubleList89);
        java.util.List<java.lang.Double> doubleList92 = laccan.cloud.prediction.Regression.makeTests(sampleList40);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(sampleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals((double) double13, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertTrue("'" + type34 + "' != '" + laccan.devices.Type.FULL + "'", type34.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(sampleList40);
        org.junit.Assert.assertEquals((double) double42, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList44);
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(sampleArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(doubleList56);
        org.junit.Assert.assertNotNull(doubleList57);
        org.junit.Assert.assertEquals((double) double60, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList62);
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNotNull(sampleArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(doubleList74);
        org.junit.Assert.assertNotNull(doubleList75);
        org.junit.Assert.assertNotNull(shortArray80);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertNotNull(sampleArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(doubleList88);
        org.junit.Assert.assertNotNull(doubleList89);
        org.junit.Assert.assertNotNull(doubleList92);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test418");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        memory0.build();
        laccan.memory.Container container4 = memory0.getMemory();
        laccan.memory.Container container5 = memory0.getMemory();
        int int6 = container5.length();
        java.util.List<laccan.devices.Sample> sampleList7 = container5.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertNotNull(container5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sampleList7);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test419");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        memory0.build();
        laccan.memory.Container container10 = memory0.getMemory();
        laccan.memory.Container container11 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        micazMsg13.set_NodeID(20);
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg13);
        memory0.add(sample18);
        memory0.build();
        int int21 = memory0.length();
        memory0.build();
        int int23 = memory0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test420");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        int int3 = micazMsg1.get_NodeID();
        java.lang.Object obj4 = micazMsg1.clone();
        int int5 = micazMsg1.get_Voltage();
        micazMsg1.set_Voltage(20);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test421");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        int int13 = micazMsg1.get_Voltage();
        int int14 = micazMsg1.dataLength();
        int int15 = micazMsg1.amType();
        int int16 = micazMsg1.get_NodeID();
        int int17 = micazMsg1.dataLength();
        micazMsg1.init((int) (short) 0);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray27 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg21.set_Buffer(shortArray27);
        java.lang.String str29 = micazMsg21.toString();
        java.lang.Object obj30 = micazMsg21.clone();
        net.tinyos.message.SerialPacket serialPacket31 = micazMsg21.getSerialPacket();
        laccan.devices.Sample sample32 = new laccan.devices.Sample(micazMsg21);
        int int33 = micazMsg21.get_Voltage();
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray36 = micazMsg35.get_Buffer();
        java.lang.Object obj37 = micazMsg35.clone();
        micazMsg35.amTypeSet(20);
        laccan.devices.Sample sample40 = new laccan.devices.Sample(micazMsg35);
        java.lang.Object obj41 = micazMsg35.clone();
        net.tinyos.message.Message message43 = micazMsg35.clone((int) ' ');
        byte[] byteArray46 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg48 = new laccan.devices.MicazMsg(byteArray46, 16);
        laccan.devices.MicazMsg micazMsg49 = new laccan.devices.MicazMsg(byteArray46);
        message43.dataSet(byteArray46);
        micazMsg21.dataSet(byteArray46);
        micazMsg21.setElement_Buffer((int) (short) 0, (short) (byte) 1);
        short[] shortArray55 = micazMsg21.get_Buffer();
        try {
            micazMsg1.set_Buffer(shortArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 172 + "'", int15 == 172);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str29.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(serialPacket31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(message43);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertNotNull(shortArray55);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test422");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(2);
        micazMsg1.init((int) (byte) 10);
        int int4 = micazMsg1.get_Voltage();
        int int5 = micazMsg1.get_NodeID();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test423");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        micazMsg1.set_NodeID((int) 'a');
        int int10 = micazMsg1.dataLength();
        short[] shortArray11 = micazMsg1.get_Buffer();
        int int12 = micazMsg1.get_NodeID();
        int int13 = micazMsg1.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test424");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.699999999999996;8", 32.0d, (long) 172);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test425");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(116, 65);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test426");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 24);
        short[] shortArray3 = micazMsg2.get_Buffer();
        byte[] byteArray4 = micazMsg2.dataGet();
        java.lang.Class<?> wildcardClass5 = micazMsg2.getClass();
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test427");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        int int3 = keepingAll0.length();
        int int4 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList5 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList6 = keepingAll0.get();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(sampleList6);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test428");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(256, 52);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test429");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        java.lang.Object obj11 = micazMsg9.clone();
        int int12 = micazMsg9.get_NodeID();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray15);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray15, 2);
        micazMsg9.dataSet(byteArray15);
        micazMsg1.dataSet(byteArray15);
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray15, 172);
        micazMsg22.amTypeSet(256);
        try {
            micazMsg22.setElement_Buffer((int) 'a', (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test430");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        int int13 = micazMsg12.amType();
        int int14 = micazMsg12.get_NodeID();
        net.tinyos.message.SerialPacket serialPacket15 = micazMsg12.getSerialPacket();
        try {
            laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((net.tinyos.message.Message) serialPacket15, (-2), 51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 172 + "'", int13 == 172);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
        org.junit.Assert.assertNull(serialPacket15);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test431");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        int int13 = micazMsg1.get_Voltage();
        int int14 = micazMsg1.dataLength();
        int int15 = micazMsg1.amType();
        int int16 = micazMsg1.get_NodeID();
        int int17 = micazMsg1.dataLength();
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = micazMsg19.get_Buffer();
        java.lang.Object obj21 = micazMsg19.clone();
        micazMsg19.amTypeSet(20);
        laccan.devices.Sample sample24 = new laccan.devices.Sample(micazMsg19);
        java.lang.Object obj25 = micazMsg19.clone();
        net.tinyos.message.Message message27 = micazMsg19.clone((int) ' ');
        byte[] byteArray30 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg(byteArray30, 16);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg(byteArray30);
        message27.dataSet(byteArray30);
        try {
            micazMsg1.dataSet(byteArray30, 266, 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 172 + "'", int15 == 172);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(message27);
        org.junit.Assert.assertNotNull(byteArray30);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test432");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        laccan.devices.Type type6 = laccan.devices.Type.FULL;
        sample4.setType(type6);
        sample4.setNode("reduction");
        java.lang.String str10 = sample4.toString();
        java.lang.String str11 = sample4.getNode();
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(52, 0);
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg14);
        java.lang.String str16 = sample15.getNode();
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj20 = micazMsg19.clone();
        laccan.devices.Sample sample22 = new laccan.devices.Sample(micazMsg19, (long) 0);
        java.lang.String str23 = sample22.getNode();
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray26 = micazMsg25.get_Buffer();
        java.lang.Object obj27 = micazMsg25.clone();
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg25);
        long long29 = sample28.getDate();
        java.lang.Class<?> wildcardClass30 = sample28.getClass();
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray33 = micazMsg32.get_Buffer();
        java.lang.Object obj34 = micazMsg32.clone();
        laccan.devices.Sample sample35 = new laccan.devices.Sample(micazMsg32);
        long long36 = sample35.getDate();
        laccan.devices.Type type37 = laccan.devices.Type.FULL;
        sample35.setType(type37);
        sample28.setType(type37);
        sample22.setType(type37);
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray43 = micazMsg42.get_Buffer();
        java.lang.Object obj44 = micazMsg42.clone();
        laccan.devices.Sample sample45 = new laccan.devices.Sample(micazMsg42);
        laccan.devices.Type type46 = null;
        sample45.setType(type46);
        sample45.setNode("");
        laccan.devices.Type type50 = laccan.devices.Type.REDUCE;
        sample45.setType(type50);
        sample22.setType(type50);
        sample15.setType(type50);
        sample4.setType(type50);
        double double55 = sample4.getDateDouble();
        laccan.devices.Type type56 = sample4.getType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "reduction;-19.699999999999996;0" + "'", str10.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "reduction" + "'", str11.equals("reduction"));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + type37 + "' != '" + laccan.devices.Type.FULL + "'", type37.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + type50 + "' != '" + laccan.devices.Type.REDUCE + "'", type50.equals(laccan.devices.Type.REDUCE));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + type56 + "' != '" + laccan.devices.Type.REDUCE + "'", type56.equals(laccan.devices.Type.REDUCE));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test433");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        micazMsg1.amTypeSet(52);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray10, 48);
        micazMsg1.dataSet(byteArray10);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray16);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray16, 2);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray16);
        micazMsg20.set_NodeID((int) (byte) 10);
        byte[] byteArray23 = micazMsg20.dataGet();
        micazMsg1.dataSet(byteArray23);
        net.tinyos.message.Message message26 = micazMsg1.clone(20);
        byte[] byteArray27 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray27, 48);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(message26);
        org.junit.Assert.assertNotNull(byteArray27);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test434");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5);
        laccan.devices.Type type9 = null;
        sample8.setType(type9);
        laccan.devices.Type type11 = null;
        sample8.setType(type11);
        sample8.setNode("hi!");
        keepingAll0.add(sample8);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg17);
        laccan.devices.Type type21 = null;
        sample20.setType(type21);
        java.lang.String str23 = sample20.toString();
        java.lang.String str24 = sample20.getNode();
        keepingAll0.add(sample20);
        java.util.List<laccan.devices.Sample> sampleList26 = keepingAll0.get();
        laccan.devices.Sample sample27 = new laccan.devices.Sample();
        double double28 = sample27.getDateDouble();
        double double29 = sample27.getDateDouble();
        sample27.setTemperature((double) 1);
        double double32 = sample27.getDateDouble();
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray40 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg34.set_Buffer(shortArray40);
        laccan.devices.Sample sample42 = new laccan.devices.Sample(micazMsg34);
        laccan.devices.Sample sample43 = new laccan.devices.Sample();
        laccan.devices.Type type44 = laccan.devices.Type.FULL;
        sample43.setType(type44);
        sample42.setType(type44);
        double double47 = sample42.getDateDouble();
        double double48 = sample42.getTemperature();
        laccan.devices.Type type49 = sample42.getType();
        sample27.setType(type49);
        keepingAll0.add(sample27);
        int int52 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg54 = new laccan.devices.MicazMsg((int) '4');
        int int55 = micazMsg54.dataLength();
        net.tinyos.message.SerialPacket serialPacket56 = micazMsg54.getSerialPacket();
        laccan.devices.Sample sample58 = new laccan.devices.Sample(micazMsg54, (long) (byte) 10);
        laccan.devices.MicazMsg micazMsg61 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj62 = micazMsg61.clone();
        laccan.devices.Sample sample64 = new laccan.devices.Sample(micazMsg61, (long) 0);
        java.lang.String str65 = sample64.getNode();
        laccan.devices.MicazMsg micazMsg67 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray68 = micazMsg67.get_Buffer();
        java.lang.Object obj69 = micazMsg67.clone();
        laccan.devices.Sample sample70 = new laccan.devices.Sample(micazMsg67);
        long long71 = sample70.getDate();
        java.lang.Class<?> wildcardClass72 = sample70.getClass();
        laccan.devices.MicazMsg micazMsg74 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray75 = micazMsg74.get_Buffer();
        java.lang.Object obj76 = micazMsg74.clone();
        laccan.devices.Sample sample77 = new laccan.devices.Sample(micazMsg74);
        long long78 = sample77.getDate();
        laccan.devices.Type type79 = laccan.devices.Type.FULL;
        sample77.setType(type79);
        sample70.setType(type79);
        sample64.setType(type79);
        sample58.setType(type79);
        keepingAll0.add(sample58);
        double double85 = sample58.getDateDouble();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "null;-19.699999999999996;0" + "'", str23.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(sampleList26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertTrue("'" + type44 + "' != '" + laccan.devices.Type.FULL + "'", type44.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-19.648499999999995d) + "'", double48 == (-19.648499999999995d));
        org.junit.Assert.assertTrue("'" + type49 + "' != '" + laccan.devices.Type.FULL + "'", type49.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 52 + "'", int55 == 52);
        org.junit.Assert.assertNull(serialPacket56);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(shortArray75);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertTrue("'" + type79 + "' != '" + laccan.devices.Type.FULL + "'", type79.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 10.0d + "'", double85 == 10.0d);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test435");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone(2);
        byte[] byteArray10 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray10);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray10);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray10);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray10, 52);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray10, 97);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray10);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test436");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        laccan.persistence.StorageCSV storageCSV1 = new laccan.persistence.StorageCSV();
        java.util.List<laccan.devices.Sample> sampleList2 = storageCSV1.read();
        java.util.List<java.lang.Double> doubleList3 = laccan.cloud.prediction.Regression.makeTests(sampleList2);
        java.util.List<java.lang.Double> doubleList4 = laccan.cloud.prediction.Regression.makeTests(sampleList2);
        java.util.List<java.lang.Double> doubleList5 = regression0.result(doubleList4);
        double double6 = regression0.mse();
        org.junit.Assert.assertNotNull(sampleList2);
        org.junit.Assert.assertNotNull(doubleList3);
        org.junit.Assert.assertNotNull(doubleList4);
        org.junit.Assert.assertNotNull(doubleList5);
        org.junit.Assert.assertEquals((double) double6, Double.NaN, 0);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test437");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.648499999999995;32", (double) 10L, (long) 97);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test438");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0);
        java.lang.String str9 = micazMsg8.toString();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg11.set_Buffer(shortArray17);
        int int19 = micazMsg11.get_NodeID();
        int int20 = micazMsg11.amType();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj24 = micazMsg23.clone();
        int int25 = micazMsg23.get_NodeID();
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg23, (long) (byte) -1);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray30 = micazMsg29.get_Buffer();
        java.lang.Object obj31 = micazMsg29.clone();
        java.lang.String str32 = micazMsg29.toString();
        short[] shortArray33 = micazMsg29.get_Buffer();
        micazMsg23.set_Buffer(shortArray33);
        byte[] byteArray35 = micazMsg23.dataGet();
        micazMsg11.dataSet(byteArray35);
        micazMsg8.dataSet(byteArray35);
        laccan.devices.MicazMsg micazMsg39 = new laccan.devices.MicazMsg(byteArray35, (int) '#');
        micazMsg39.init(6);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 172 + "'", int20 == 172);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str32.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertNotNull(byteArray35);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test439");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        net.tinyos.message.Message message6 = micazMsg1.clone(3);
        java.lang.Object obj7 = message6.clone();
        int int8 = message6.baseOffset();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test440");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1);
        int int11 = micazMsg1.dataLength();
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray15 = micazMsg14.dataGet();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray15, (int) (byte) -1, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray15);
        micazMsg1.dataSet(byteArray15);
        short[] shortArray21 = micazMsg1.get_Buffer();
        byte[] byteArray22 = micazMsg1.dataGet();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(byteArray22);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test441");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(256, 52);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 64, 65);
        int int7 = micazMsg2.baseOffset();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test442");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        net.tinyos.message.SerialPacket serialPacket2 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        java.lang.Class<?> wildcardClass4 = sample3.getClass();
        org.junit.Assert.assertNull(serialPacket2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test443");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        sample1.setDate(10L);
        laccan.memory.data.reduction.KeepingAll keepingAll5 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList6 = keepingAll5.get();
        int int7 = keepingAll5.length();
        java.util.List<laccan.devices.Sample> sampleList8 = keepingAll5.get();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg10);
        laccan.devices.Type type14 = null;
        sample13.setType(type14);
        laccan.devices.Type type16 = null;
        sample13.setType(type16);
        sample13.setNode("hi!");
        keepingAll5.add(sample13);
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray23 = micazMsg22.get_Buffer();
        java.lang.Object obj24 = micazMsg22.clone();
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg22);
        laccan.devices.Type type26 = null;
        sample25.setType(type26);
        java.lang.String str28 = sample25.toString();
        java.lang.String str29 = sample25.getNode();
        keepingAll5.add(sample25);
        laccan.devices.Sample sample31 = new laccan.devices.Sample();
        laccan.devices.Type type32 = laccan.devices.Type.FULL;
        sample31.setType(type32);
        sample25.setType(type32);
        double double35 = sample25.getTemperature();
        sample25.setNode("");
        sample25.setDate((long) 52);
        laccan.memory.data.reduction.KeepingAll keepingAll40 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray43 = micazMsg42.get_Buffer();
        java.lang.Object obj44 = micazMsg42.clone();
        laccan.devices.Sample sample45 = new laccan.devices.Sample(micazMsg42);
        laccan.devices.Type type46 = null;
        sample45.setType(type46);
        keepingAll40.add(sample45);
        double double49 = sample45.getDateDouble();
        laccan.memory.Memory memory50 = new laccan.memory.Memory();
        laccan.memory.Container container51 = memory50.getMemory();
        laccan.memory.Container container52 = memory50.getMemory();
        memory50.build();
        memory50.build();
        int int55 = memory50.length();
        laccan.devices.MicazMsg micazMsg57 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray63 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg57.set_Buffer(shortArray63);
        laccan.devices.Sample sample65 = new laccan.devices.Sample(micazMsg57);
        laccan.devices.Sample sample66 = new laccan.devices.Sample();
        laccan.devices.Type type67 = laccan.devices.Type.FULL;
        sample66.setType(type67);
        sample65.setType(type67);
        sample65.setTemperature((double) 'a');
        java.lang.Class<?> wildcardClass72 = sample65.getClass();
        memory50.add(sample65);
        laccan.devices.Type type74 = sample65.getType();
        sample45.setType(type74);
        sample25.setType(type74);
        sample1.setType(type74);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(sampleList8);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "null;-19.699999999999996;0" + "'", str28.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + type32 + "' != '" + laccan.devices.Type.FULL + "'", type32.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-19.699999999999996d) + "'", double35 == (-19.699999999999996d));
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNull(container51);
        org.junit.Assert.assertNull(container52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertTrue("'" + type67 + "' != '" + laccan.devices.Type.FULL + "'", type67.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + type74 + "' != '" + laccan.devices.Type.FULL + "'", type74.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test444");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", 65535.0d, (long) 24);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test445");
        laccan.devices.helper.utils.Assistant.predictorType = "null;-19.699999999999996;32";
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test446");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        short short12 = micazMsg1.getElement_Buffer(0);
        net.tinyos.message.Message message14 = micazMsg1.clone((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = micazMsg1.getClass();
        int int16 = micazMsg1.baseOffset();
        int int17 = micazMsg1.dataLength();
        int int18 = micazMsg1.get_NodeID();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        micazMsg20.set_Voltage((int) '#');
        micazMsg20.amTypeSet(52);
        short short26 = micazMsg20.getElement_Buffer(0);
        short[] shortArray27 = micazMsg20.get_Buffer();
        micazMsg1.set_Buffer(shortArray27);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 256 + "'", int18 == 256);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 0 + "'", short26 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray27);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test447");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        int int8 = micazMsg1.dataLength();
        micazMsg1.set_NodeID(10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 4, 0);
        int int14 = micazMsg13.baseOffset();
        try {
            laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test448");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        java.lang.String str13 = micazMsg10.toString();
        short[] shortArray14 = micazMsg10.get_Buffer();
        byte[] byteArray15 = micazMsg10.dataGet();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray15);
        micazMsg1.dataSet(byteArray15);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = micazMsg19.get_Buffer();
        java.lang.Object obj21 = micazMsg19.clone();
        short short23 = micazMsg19.getElement_Buffer((int) (short) 0);
        short[] shortArray24 = micazMsg19.get_Buffer();
        micazMsg1.set_Buffer(shortArray24);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray24);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test449");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone((int) ' ');
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1);
        sample10.setTemperature((double) 1L);
        double double13 = sample10.getDateDouble();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test450");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        java.lang.String str13 = micazMsg10.toString();
        short[] shortArray14 = micazMsg10.get_Buffer();
        byte[] byteArray15 = micazMsg10.dataGet();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray15);
        micazMsg1.dataSet(byteArray15);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray15, (int) (short) 100);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray15, 2);
        micazMsg21.amTypeSet(20);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test451");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        memory0.build();
        laccan.memory.Container container4 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        long long10 = sample9.getDate();
        java.lang.Class<?> wildcardClass11 = sample9.getClass();
        java.lang.String str12 = sample9.toString();
        memory0.add(sample9);
        int int14 = memory0.length();
        int int15 = memory0.length();
        memory0.build();
        int int17 = memory0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null;-19.699999999999996;0" + "'", str12.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test452");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(100, (int) (short) 1);
        java.lang.String str3 = micazMsg2.toString();
        int int4 = micazMsg2.get_NodeID();
        int int5 = micazMsg2.get_Voltage();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = micazMsg7.get_Buffer();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg7);
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg7, (long) (short) 10);
        net.tinyos.message.SerialPacket serialPacket12 = micazMsg7.getSerialPacket();
        byte[] byteArray13 = micazMsg7.dataGet();
        short[] shortArray14 = micazMsg7.get_Buffer();
        micazMsg2.set_Buffer(shortArray14);
        net.tinyos.message.SerialPacket serialPacket16 = micazMsg2.getSerialPacket();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str3.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNull(serialPacket12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNull(serialPacket16);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test453");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) (byte) 100);
        micazMsg1.amTypeSet(2);
        java.lang.Object obj9 = micazMsg1.clone();
        int int10 = micazMsg1.get_Voltage();
        try {
            short short12 = micazMsg1.getElement_Buffer(48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test454");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        micazMsg3.set_Voltage((int) '#');
        micazMsg3.amTypeSet(52);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray12, 48);
        micazMsg3.dataSet(byteArray12);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray12);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray12);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray25 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg19.set_Buffer(shortArray25);
        java.lang.String str27 = micazMsg19.toString();
        java.lang.Object obj28 = micazMsg19.clone();
        net.tinyos.message.SerialPacket serialPacket29 = micazMsg19.getSerialPacket();
        laccan.devices.Sample sample30 = new laccan.devices.Sample(micazMsg19);
        net.tinyos.message.Message message32 = micazMsg19.clone(0);
        byte[] byteArray33 = message32.dataGet();
        micazMsg17.dataSet(byteArray33);
        try {
            micazMsg1.dataSet(byteArray33, 6, 65, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str27.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNull(serialPacket29);
        org.junit.Assert.assertNotNull(message32);
        org.junit.Assert.assertNotNull(byteArray33);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test455");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("init", (double) 10, (long) (byte) 0);
        sample3.setTemperature((double) (byte) 1);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test456");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg10);
        int int13 = micazMsg10.get_NodeID();
        micazMsg10.amTypeSet((int) (byte) 100);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg10, (int) (short) 0);
        int int18 = micazMsg10.amType();
        int int19 = micazMsg10.baseOffset();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test457");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        memory0.build();
        int int3 = memory0.length();
        int int4 = memory0.length();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        laccan.devices.Type type10 = null;
        sample9.setType(type10);
        laccan.devices.Type type12 = null;
        sample9.setType(type12);
        sample9.setNode("hi!");
        memory0.add(sample9);
        java.lang.String[] strArray17 = sample9.toCSV();
        java.lang.String str18 = sample9.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!;-19.699999999999996;0" + "'", str18.equals("hi!;-19.699999999999996;0"));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test458");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        laccan.devices.Type type6 = laccan.devices.Type.FULL;
        sample4.setType(type6);
        java.lang.String str8 = sample4.getNode();
        java.lang.String str9 = sample4.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null;-19.699999999999996;0" + "'", str9.equals("null;-19.699999999999996;0"));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test459");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5);
        laccan.devices.Type type9 = null;
        sample8.setType(type9);
        laccan.devices.Type type11 = null;
        sample8.setType(type11);
        sample8.setNode("hi!");
        keepingAll0.add(sample8);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg17);
        laccan.devices.Type type21 = null;
        sample20.setType(type21);
        java.lang.String str23 = sample20.toString();
        java.lang.String str24 = sample20.getNode();
        keepingAll0.add(sample20);
        laccan.devices.Sample sample26 = new laccan.devices.Sample();
        laccan.devices.Type type27 = laccan.devices.Type.FULL;
        sample26.setType(type27);
        sample20.setType(type27);
        double double30 = sample20.getTemperature();
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray33 = micazMsg32.get_Buffer();
        java.lang.Object obj34 = micazMsg32.clone();
        laccan.devices.Sample sample35 = new laccan.devices.Sample(micazMsg32);
        long long36 = sample35.getDate();
        laccan.devices.Type type37 = laccan.devices.Type.FULL;
        sample35.setType(type37);
        sample20.setType(type37);
        sample20.setDate((long) 160);
        long long42 = sample20.getDate();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "null;-19.699999999999996;0" + "'", str23.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + type27 + "' != '" + laccan.devices.Type.FULL + "'", type27.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-19.699999999999996d) + "'", double30 == (-19.699999999999996d));
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + type37 + "' != '" + laccan.devices.Type.FULL + "'", type37.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 160L + "'", long42 == 160L);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test460");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        micazMsg1.amTypeSet(52);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray10, 48);
        micazMsg1.dataSet(byteArray10);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray16);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray16, 2);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray16);
        micazMsg20.set_NodeID((int) (byte) 10);
        byte[] byteArray23 = micazMsg20.dataGet();
        micazMsg1.dataSet(byteArray23);
        net.tinyos.message.Message message26 = micazMsg1.clone(20);
        byte[] byteArray27 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray35 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg29.set_Buffer(shortArray35);
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray39 = micazMsg38.get_Buffer();
        laccan.devices.Sample sample40 = new laccan.devices.Sample(micazMsg38);
        int int41 = micazMsg38.get_NodeID();
        micazMsg38.amTypeSet((int) (byte) 100);
        micazMsg29.dataSet((net.tinyos.message.Message) micazMsg38, (int) (short) 0);
        int int46 = micazMsg38.amType();
        micazMsg38.amTypeSet(32);
        short[] shortArray49 = micazMsg38.get_Buffer();
        micazMsg1.set_Buffer(shortArray49);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(message26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(shortArray49);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test461");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg10);
        int int13 = micazMsg10.get_NodeID();
        micazMsg10.amTypeSet((int) (byte) 100);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg10, (int) (short) 0);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 1);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray22 = micazMsg21.get_Buffer();
        java.lang.Object obj23 = micazMsg21.clone();
        micazMsg21.amTypeSet(20);
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg21);
        java.lang.Object obj27 = micazMsg21.clone();
        net.tinyos.message.Message message29 = micazMsg21.clone((int) ' ');
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray32 = micazMsg31.get_Buffer();
        java.lang.Object obj33 = micazMsg31.clone();
        int int34 = micazMsg31.get_NodeID();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg(byteArray37);
        laccan.devices.MicazMsg micazMsg40 = new laccan.devices.MicazMsg(byteArray37, 2);
        micazMsg31.dataSet(byteArray37);
        message29.dataSet(byteArray37);
        net.tinyos.message.Message message44 = message29.clone(160);
        net.tinyos.message.Message message46 = message29.clone(128);
        int int47 = message46.baseOffset();
        laccan.devices.MicazMsg micazMsg49 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray50 = micazMsg49.get_Buffer();
        java.lang.Object obj51 = micazMsg49.clone();
        java.lang.String str52 = micazMsg49.toString();
        short[] shortArray53 = micazMsg49.get_Buffer();
        byte[] byteArray54 = micazMsg49.dataGet();
        java.lang.Object obj55 = micazMsg49.clone();
        net.tinyos.message.Message message57 = micazMsg49.clone(2);
        byte[] byteArray58 = micazMsg49.dataGet();
        java.lang.Class<?> wildcardClass59 = micazMsg49.getClass();
        laccan.devices.Sample sample61 = new laccan.devices.Sample(micazMsg49, (long) (short) 100);
        byte[] byteArray62 = micazMsg49.dataGet();
        laccan.devices.MicazMsg micazMsg64 = new laccan.devices.MicazMsg(byteArray62, 256);
        laccan.devices.MicazMsg micazMsg65 = new laccan.devices.MicazMsg(byteArray62);
        message46.dataSet(byteArray62);
        try {
            micazMsg19.dataSet(byteArray62, 14, (int) 'a', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(message29);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertNotNull(message44);
        org.junit.Assert.assertNotNull(message46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str52.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(message57);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(byteArray62);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test462");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll2 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll2.get();
        laccan.cloud.prediction.Regression regression4 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        laccan.devices.Sample sample10 = new laccan.devices.Sample();
        laccan.devices.Sample sample11 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray12 = new laccan.devices.Sample[] { sample9, sample10, sample11 };
        java.util.ArrayList<laccan.devices.Sample> sampleList13 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList13, sampleArray12);
        java.util.List<java.lang.Double> doubleList15 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList13);
        java.util.List<java.lang.Double> doubleList16 = regression4.result(doubleList15);
        regression0.init(sampleList3, doubleList15);
        laccan.cloud.prediction.Regression regression18 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = micazMsg20.get_Buffer();
        java.lang.Object obj22 = micazMsg20.clone();
        laccan.devices.Sample sample23 = new laccan.devices.Sample(micazMsg20);
        laccan.devices.Sample sample24 = new laccan.devices.Sample();
        laccan.devices.Sample sample25 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray26 = new laccan.devices.Sample[] { sample23, sample24, sample25 };
        java.util.ArrayList<laccan.devices.Sample> sampleList27 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList27, sampleArray26);
        java.util.List<java.lang.Double> doubleList29 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList27);
        java.util.List<java.lang.Double> doubleList30 = regression18.result(doubleList29);
        java.util.List<java.lang.Double> doubleList31 = regression0.result(doubleList29);
        double double32 = regression0.mse();
        laccan.cloud.prediction.Regression regression33 = new laccan.cloud.prediction.Regression();
        double double34 = regression33.mse();
        double double35 = regression33.mse();
        java.util.List<laccan.devices.Sample> sampleList36 = null;
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray39 = micazMsg38.get_Buffer();
        java.lang.Object obj40 = micazMsg38.clone();
        laccan.devices.Sample sample41 = new laccan.devices.Sample(micazMsg38);
        laccan.devices.Sample sample42 = new laccan.devices.Sample();
        laccan.devices.Sample sample43 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray44 = new laccan.devices.Sample[] { sample41, sample42, sample43 };
        java.util.ArrayList<laccan.devices.Sample> sampleList45 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList45, sampleArray44);
        java.util.List<java.lang.Double> doubleList47 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList45);
        regression33.init(sampleList36, doubleList47);
        java.util.List<java.lang.Double> doubleList49 = regression0.result(doubleList47);
        double double50 = regression0.mse();
        laccan.cloud.prediction.Regression regression51 = new laccan.cloud.prediction.Regression();
        double double52 = regression51.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll53 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList54 = keepingAll53.get();
        laccan.cloud.prediction.Regression regression55 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg57 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray58 = micazMsg57.get_Buffer();
        java.lang.Object obj59 = micazMsg57.clone();
        laccan.devices.Sample sample60 = new laccan.devices.Sample(micazMsg57);
        laccan.devices.Sample sample61 = new laccan.devices.Sample();
        laccan.devices.Sample sample62 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray63 = new laccan.devices.Sample[] { sample60, sample61, sample62 };
        java.util.ArrayList<laccan.devices.Sample> sampleList64 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList64, sampleArray63);
        java.util.List<java.lang.Double> doubleList66 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList64);
        java.util.List<java.lang.Double> doubleList67 = regression55.result(doubleList66);
        regression51.init(sampleList54, doubleList66);
        laccan.devices.MicazMsg micazMsg70 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray71 = micazMsg70.get_Buffer();
        java.lang.Object obj72 = micazMsg70.clone();
        laccan.devices.Sample sample73 = new laccan.devices.Sample(micazMsg70);
        laccan.devices.Sample sample74 = new laccan.devices.Sample();
        laccan.devices.Sample sample75 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray76 = new laccan.devices.Sample[] { sample73, sample74, sample75 };
        java.util.ArrayList<laccan.devices.Sample> sampleList77 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList77, sampleArray76);
        java.util.List<java.lang.Double> doubleList79 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList77);
        java.util.List<java.lang.Double> doubleList80 = regression51.result(doubleList79);
        java.util.List<java.lang.Double> doubleList81 = regression0.result(doubleList79);
        java.lang.Class<?> wildcardClass82 = regression0.getClass();
        laccan.devices.MicazMsg micazMsg84 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray85 = micazMsg84.get_Buffer();
        java.lang.Object obj86 = micazMsg84.clone();
        laccan.devices.Sample sample87 = new laccan.devices.Sample(micazMsg84);
        laccan.devices.Sample sample88 = new laccan.devices.Sample();
        laccan.devices.Sample sample89 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray90 = new laccan.devices.Sample[] { sample87, sample88, sample89 };
        java.util.ArrayList<laccan.devices.Sample> sampleList91 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList91, sampleArray90);
        java.util.List<java.lang.Double> doubleList93 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList91);
        java.util.List<java.lang.Double> doubleList94 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList91);
        java.util.List<java.lang.Double> doubleList95 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList91);
        java.util.List<java.lang.Double> doubleList96 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList91);
        java.util.List<java.lang.Double> doubleList97 = regression0.result(doubleList96);
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(sampleArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(sampleArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(doubleList29);
        org.junit.Assert.assertNotNull(doubleList30);
        org.junit.Assert.assertNotNull(doubleList31);
        org.junit.Assert.assertEquals((double) double32, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double34, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double35, Double.NaN, 0);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(sampleArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(doubleList47);
        org.junit.Assert.assertNotNull(doubleList49);
        org.junit.Assert.assertEquals((double) double50, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double52, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList54);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(sampleArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(doubleList66);
        org.junit.Assert.assertNotNull(doubleList67);
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(sampleArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(doubleList79);
        org.junit.Assert.assertNotNull(doubleList80);
        org.junit.Assert.assertNotNull(doubleList81);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(shortArray85);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertNotNull(sampleArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(doubleList93);
        org.junit.Assert.assertNotNull(doubleList94);
        org.junit.Assert.assertNotNull(doubleList95);
        org.junit.Assert.assertNotNull(doubleList96);
        org.junit.Assert.assertNotNull(doubleList97);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test463");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.get_NodeID();
        net.tinyos.message.SerialPacket serialPacket9 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg12.set_Buffer(shortArray18);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray22 = micazMsg21.get_Buffer();
        java.lang.Object obj23 = micazMsg21.clone();
        java.lang.String str24 = micazMsg21.toString();
        short[] shortArray25 = micazMsg21.get_Buffer();
        byte[] byteArray26 = micazMsg21.dataGet();
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray26);
        micazMsg12.dataSet(byteArray26);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray26);
        net.tinyos.message.Message message31 = micazMsg29.clone((int) (short) 0);
        short[] shortArray32 = micazMsg29.get_Buffer();
        micazMsg1.set_Buffer(shortArray32);
        net.tinyos.message.Message message35 = micazMsg1.clone((int) (byte) 10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(serialPacket9);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str24.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(message31);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(message35);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test464");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray5 = micazMsg4.get_Buffer();
        java.lang.Object obj6 = micazMsg4.clone();
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg4);
        long long8 = sample7.getDate();
        java.lang.Class<?> wildcardClass9 = sample7.getClass();
        java.lang.String str10 = sample7.getNode();
        sample7.setNode("full_memory");
        memory0.add(sample7);
        laccan.devices.Sample sample17 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=", Double.NaN, (long) '#');
        memory0.add(sample17);
        sample17.setTemperature((double) 8L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test465");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray3, (int) (byte) -1, (int) (byte) -1);
        try {
            laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray3, 51, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 51, data_length -2 and data array size 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test466");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        byte[] byteArray6 = micazMsg1.dataGet();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test467");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone(2);
        byte[] byteArray10 = micazMsg1.dataGet();
        java.lang.Class<?> wildcardClass11 = micazMsg1.getClass();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1, (long) (short) 100);
        byte[] byteArray14 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray14, 256);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray14);
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg17, 1L);
        double double20 = sample19.getTemperature();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-19.699999999999996d) + "'", double20 == (-19.699999999999996d));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test468");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        micazMsg1.set_Voltage((int) (short) 1);
        micazMsg1.set_Voltage((int) (byte) 100);
        byte[] byteArray20 = micazMsg1.dataGet();
        laccan.devices.Sample sample22 = new laccan.devices.Sample(micazMsg1, (long) 'a');
        net.tinyos.message.Message message24 = micazMsg1.clone((int) '#');
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(message24);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test469");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5);
        long long9 = sample8.getDate();
        java.lang.Class<?> wildcardClass10 = sample8.getClass();
        keepingAll0.add(sample8);
        java.util.List<laccan.devices.Sample> sampleList12 = keepingAll0.get();
        int int13 = keepingAll0.length();
        int int14 = keepingAll0.length();
        laccan.devices.Sample sample18 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) (short) -1, (long) 10);
        sample18.setDate((long) 52);
        keepingAll0.add(sample18);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(sampleList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test470");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        int int13 = micazMsg12.amType();
        int int14 = micazMsg12.get_NodeID();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = micazMsg16.get_Buffer();
        java.lang.Object obj18 = micazMsg16.clone();
        int int19 = micazMsg16.get_NodeID();
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray22);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray22, 2);
        micazMsg16.dataSet(byteArray22);
        micazMsg12.dataSet(byteArray22);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray22);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray22);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 172 + "'", int13 == 172);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test471");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        short[] shortArray6 = micazMsg1.get_Buffer();
        micazMsg1.set_NodeID(51);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray6);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test472");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        int int4 = micazMsg3.get_NodeID();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg6);
        int int9 = micazMsg6.get_NodeID();
        byte[] byteArray10 = micazMsg6.dataGet();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray10, 100);
        micazMsg3.dataSet(byteArray10);
        micazMsg3.amTypeSet((int) (byte) 100);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        java.lang.String str20 = micazMsg17.toString();
        short[] shortArray21 = micazMsg17.get_Buffer();
        byte[] byteArray22 = micazMsg17.dataGet();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray22);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray22);
        int int25 = micazMsg24.get_Voltage();
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg24);
        java.lang.String str27 = micazMsg24.toString();
        try {
            micazMsg3.dataSet((net.tinyos.message.Message) micazMsg24, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 256 + "'", int4 == 256);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str20.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str27.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test473");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone((int) ' ');
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        java.lang.Object obj13 = micazMsg11.clone();
        int int14 = micazMsg11.get_NodeID();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray17);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray17, 2);
        micazMsg11.dataSet(byteArray17);
        message9.dataSet(byteArray17);
        net.tinyos.message.Message message24 = message9.clone(160);
        net.tinyos.message.Message message26 = message9.clone(128);
        int int27 = message26.baseOffset();
        int int28 = message26.baseOffset();
        byte[] byteArray29 = message26.dataGet();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(message24);
        org.junit.Assert.assertNotNull(message26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test474");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        java.lang.String str13 = micazMsg10.toString();
        short[] shortArray14 = micazMsg10.get_Buffer();
        byte[] byteArray15 = micazMsg10.dataGet();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray15);
        micazMsg1.dataSet(byteArray15);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray15);
        net.tinyos.message.Message message20 = micazMsg18.clone((int) (short) 0);
        short[] shortArray21 = micazMsg18.get_Buffer();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg18, (int) (short) -1);
        micazMsg23.set_Voltage((int) (byte) 0);
        short[] shortArray26 = micazMsg23.get_Buffer();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(message20);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(shortArray26);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test475");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        memory0.build();
        int int4 = memory0.length();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        laccan.devices.Type type10 = null;
        sample9.setType(type10);
        double double12 = sample9.getDateDouble();
        double double13 = sample9.getDateDouble();
        memory0.add(sample9);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray22 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg16.set_Buffer(shortArray22);
        laccan.devices.Sample sample24 = new laccan.devices.Sample(micazMsg16);
        java.lang.String[] strArray25 = sample24.toCSV();
        sample24.setNode("hi!");
        memory0.add(sample24);
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray31 = micazMsg30.get_Buffer();
        java.lang.Object obj32 = micazMsg30.clone();
        laccan.devices.Sample sample33 = new laccan.devices.Sample(micazMsg30);
        long long34 = sample33.getDate();
        laccan.devices.Type type35 = laccan.devices.Type.FULL;
        sample33.setType(type35);
        sample33.setNode("reduction");
        java.lang.String str39 = sample33.toString();
        sample33.setNode("reduction;-19.699999999999996;0");
        sample33.setTemperature((double) (-1L));
        double double44 = sample33.getDateDouble();
        memory0.add(sample33);
        laccan.devices.MicazMsg micazMsg48 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj49 = micazMsg48.clone();
        int int50 = micazMsg48.get_NodeID();
        laccan.devices.Sample sample52 = new laccan.devices.Sample(micazMsg48, (long) (byte) -1);
        java.lang.String[] strArray53 = sample52.toCSV();
        long long54 = sample52.getDate();
        memory0.add(sample52);
        memory0.build();
        memory0.build();
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + type35 + "' != '" + laccan.devices.Type.FULL + "'", type35.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "reduction;-19.699999999999996;0" + "'", str39.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test476");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("reduction;-19.699999999999996;0;-1.0;0", 0.0d, (long) 'a');
        sample3.setNode("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        java.lang.String str6 = sample3.getNode();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str6.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test477");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        java.lang.Class<?> wildcardClass6 = sample4.getClass();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg8);
        long long12 = sample11.getDate();
        laccan.devices.Type type13 = laccan.devices.Type.FULL;
        sample11.setType(type13);
        sample4.setType(type13);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray23 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg17.set_Buffer(shortArray23);
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg17);
        laccan.devices.Sample sample26 = new laccan.devices.Sample();
        laccan.devices.Type type27 = laccan.devices.Type.FULL;
        sample26.setType(type27);
        sample25.setType(type27);
        sample4.setType(type27);
        java.lang.String str31 = sample4.getNode();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + laccan.devices.Type.FULL + "'", type13.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertTrue("'" + type27 + "' != '" + laccan.devices.Type.FULL + "'", type27.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test478");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        short[] shortArray8 = new short[] { (byte) -1, (short) 0 };
        micazMsg1.set_Buffer(shortArray8);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 20);
        micazMsg11.setElement_Buffer(1, (short) (byte) -1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(shortArray8);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test479");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        memory0.build();
        int int3 = memory0.length();
        int int4 = memory0.length();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        laccan.devices.Type type10 = null;
        sample9.setType(type10);
        laccan.devices.Type type12 = null;
        sample9.setType(type12);
        sample9.setNode("hi!");
        memory0.add(sample9);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg18.set_Buffer(shortArray24);
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg18);
        laccan.devices.Sample sample27 = new laccan.devices.Sample();
        laccan.devices.Type type28 = laccan.devices.Type.FULL;
        sample27.setType(type28);
        sample26.setType(type28);
        java.lang.String str31 = sample26.toString();
        memory0.add(sample26);
        int int33 = memory0.length();
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj37 = micazMsg36.clone();
        laccan.devices.Sample sample39 = new laccan.devices.Sample(micazMsg36, (long) 0);
        sample39.setDate((long) 24);
        double double42 = sample39.getDateDouble();
        long long43 = sample39.getDate();
        java.lang.String str44 = sample39.getNode();
        memory0.add(sample39);
        java.lang.String str46 = sample39.toString();
        double double47 = sample39.getDateDouble();
        sample39.setDate((long) 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertTrue("'" + type28 + "' != '" + laccan.devices.Type.FULL + "'", type28.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "null;-19.648499999999995;0" + "'", str31.equals("null;-19.648499999999995;0"));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 24.0d + "'", double42 == 24.0d);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 24L + "'", long43 == 24L);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "null;-19.699999999999996;24" + "'", str46.equals("null;-19.699999999999996;24"));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 24.0d + "'", double47 == 24.0d);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test480");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        memory0.build();
        laccan.memory.Container container10 = memory0.getMemory();
        laccan.memory.Container container11 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        micazMsg13.set_NodeID(20);
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg13);
        memory0.add(sample18);
        int int20 = memory0.length();
        laccan.memory.Container container21 = memory0.getMemory();
        laccan.memory.Container container22 = memory0.getMemory();
        laccan.memory.Container container23 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(container21);
        org.junit.Assert.assertNotNull(container22);
        org.junit.Assert.assertNotNull(container23);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test481");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x64]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 ", (double) 51, (long) 8);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test482");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        storageCSV3.save(strArray4);
        storageCSV0.save(strArray4);
        laccan.persistence.StorageCSV storageCSV8 = storageCSV0.local("nodes");
        java.util.List<laccan.devices.Sample> sampleList9 = storageCSV0.read();
        laccan.persistence.StorageCSV storageCSV11 = storageCSV0.local("lastReading");
        laccan.persistence.StorageCSV storageCSV13 = storageCSV0.local("nodes");
        laccan.persistence.StorageCSV storageCSV14 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray15 = new java.lang.String[] {};
        storageCSV14.save(strArray15);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        java.lang.Object obj20 = micazMsg18.clone();
        laccan.devices.Sample sample21 = new laccan.devices.Sample(micazMsg18);
        long long22 = sample21.getDate();
        laccan.devices.Type type23 = laccan.devices.Type.FULL;
        sample21.setType(type23);
        sample21.setNode("reduction");
        java.lang.String str27 = sample21.toString();
        sample21.setNode("reduction;-19.699999999999996;0");
        sample21.setTemperature((double) (-1L));
        double double32 = sample21.getDateDouble();
        java.lang.String[] strArray33 = sample21.toCSV();
        storageCSV14.save(strArray33);
        storageCSV13.save(strArray33);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(sampleList9);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + type23 + "' != '" + laccan.devices.Type.FULL + "'", type23.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "reduction;-19.699999999999996;0" + "'", str27.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test483");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        memory0.build();
        laccan.memory.Container container4 = memory0.getMemory();
        int int5 = memory0.length();
        memory0.build();
        int int7 = memory0.length();
        int int8 = memory0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test484");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (byte) 0, 10);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test485");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        int int5 = micazMsg2.dataLength();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 4);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg9, 0);
        short[] shortArray12 = micazMsg9.get_Buffer();
        micazMsg2.set_Buffer(shortArray12);
        int int14 = micazMsg2.get_Voltage();
        micazMsg2.amTypeSet((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test486");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, 2);
        micazMsg1.dataSet(byteArray7);
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1, (long) (byte) 100);
        laccan.devices.Type type14 = sample13.getType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNull(type14);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test487");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg10);
        int int13 = micazMsg10.get_NodeID();
        micazMsg10.amTypeSet((int) (byte) 100);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg10, (int) (short) 0);
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg1, (long) 14);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test488");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;10.0;0", (double) 160, (long) 172);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test489");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg7.get_NodeID();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg7, (long) 96);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test490");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type4 = sample3.getType();
        double double5 = sample3.getDateDouble();
        long long6 = sample3.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test491");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        short short5 = micazMsg1.getElement_Buffer((int) (short) 0);
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1, (long) (short) 0);
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg1);
        java.lang.String str9 = sample8.getNode();
        java.lang.String str10 = sample8.getNode();
        double double11 = sample8.getTemperature();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-19.699999999999996d) + "'", double11 == (-19.699999999999996d));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test492");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        int int9 = memory0.length();
        laccan.memory.Container container10 = memory0.getMemory();
        laccan.memory.Container container11 = memory0.getMemory();
        java.util.List<laccan.devices.Sample> sampleList12 = container11.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertNotNull(sampleList12);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test493");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(266);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test494");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg1);
        int int9 = micazMsg1.dataLength();
        int int10 = micazMsg1.baseOffset();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg1);
        double double12 = sample11.getTemperature();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-19.699999999999996d) + "'", double12 == (-19.699999999999996d));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test495");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        java.lang.String[] strArray4 = new java.lang.String[] { "result" };
        storageCSV0.save(strArray4);
        laccan.persistence.StorageCSV storageCSV7 = storageCSV0.local("nodes");
        laccan.persistence.StorageCSV storageCSV8 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV10 = storageCSV8.local("hi!");
        laccan.persistence.StorageCSV storageCSV11 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray12 = new java.lang.String[] {};
        storageCSV11.save(strArray12);
        storageCSV8.save(strArray12);
        laccan.persistence.StorageCSV storageCSV16 = storageCSV8.local("nodes");
        laccan.persistence.StorageCSV storageCSV18 = storageCSV8.local("init");
        java.util.List<laccan.devices.Sample> sampleList19 = storageCSV8.read();
        laccan.devices.Sample sample23 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=", Double.NaN, (long) '#');
        java.lang.String[] strArray24 = sample23.toCSV();
        storageCSV8.save(strArray24);
        storageCSV7.save(strArray24);
        laccan.persistence.StorageCSV storageCSV27 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV29 = storageCSV27.local("hi!");
        laccan.persistence.StorageCSV storageCSV31 = storageCSV29.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList32 = storageCSV31.read();
        laccan.persistence.StorageCSV storageCSV34 = storageCSV31.local("memory");
        laccan.persistence.StorageCSV storageCSV35 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV37 = storageCSV35.local("hi!");
        laccan.persistence.StorageCSV storageCSV39 = storageCSV37.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList40 = storageCSV39.read();
        java.util.List<laccan.devices.Sample> sampleList41 = storageCSV39.read();
        laccan.persistence.StorageCSV storageCSV43 = storageCSV39.local("");
        laccan.persistence.StorageCSV storageCSV44 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV46 = storageCSV44.local("hi!");
        laccan.persistence.StorageCSV storageCSV48 = storageCSV46.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList49 = storageCSV48.read();
        laccan.persistence.StorageCSV storageCSV51 = storageCSV48.local("memory");
        laccan.persistence.StorageCSV storageCSV52 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV54 = storageCSV52.local("hi!");
        laccan.persistence.StorageCSV storageCSV56 = storageCSV54.local("lastReading");
        java.lang.String[] strArray62 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV56.save(strArray62);
        storageCSV48.save(strArray62);
        storageCSV39.save(strArray62);
        storageCSV34.save(strArray62);
        laccan.persistence.StorageCSV storageCSV68 = storageCSV34.local("null;-19.699999999999996;0");
        laccan.persistence.StorageCSV storageCSV69 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV71 = storageCSV69.local("hi!");
        laccan.persistence.StorageCSV storageCSV73 = storageCSV71.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList74 = storageCSV73.read();
        laccan.persistence.StorageCSV storageCSV76 = storageCSV73.local("init");
        java.util.List<laccan.devices.Sample> sampleList77 = storageCSV73.read();
        laccan.memory.data.reduction.KeepingAll keepingAll78 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList79 = keepingAll78.get();
        int int80 = keepingAll78.length();
        java.util.List<laccan.devices.Sample> sampleList81 = keepingAll78.get();
        laccan.devices.MicazMsg micazMsg83 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray84 = micazMsg83.get_Buffer();
        java.lang.Object obj85 = micazMsg83.clone();
        laccan.devices.Sample sample86 = new laccan.devices.Sample(micazMsg83);
        laccan.devices.Type type87 = null;
        sample86.setType(type87);
        laccan.devices.Type type89 = null;
        sample86.setType(type89);
        sample86.setNode("hi!");
        keepingAll78.add(sample86);
        laccan.devices.Type type94 = sample86.getType();
        java.lang.String[] strArray95 = sample86.toCSV();
        storageCSV73.save(strArray95);
        storageCSV34.save(strArray95);
        storageCSV7.save(strArray95);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(storageCSV16);
        org.junit.Assert.assertNotNull(storageCSV18);
        org.junit.Assert.assertNotNull(sampleList19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(storageCSV29);
        org.junit.Assert.assertNotNull(storageCSV31);
        org.junit.Assert.assertNotNull(sampleList32);
        org.junit.Assert.assertNotNull(storageCSV34);
        org.junit.Assert.assertNotNull(storageCSV37);
        org.junit.Assert.assertNotNull(storageCSV39);
        org.junit.Assert.assertNotNull(sampleList40);
        org.junit.Assert.assertNotNull(sampleList41);
        org.junit.Assert.assertNotNull(storageCSV43);
        org.junit.Assert.assertNotNull(storageCSV46);
        org.junit.Assert.assertNotNull(storageCSV48);
        org.junit.Assert.assertNotNull(sampleList49);
        org.junit.Assert.assertNotNull(storageCSV51);
        org.junit.Assert.assertNotNull(storageCSV54);
        org.junit.Assert.assertNotNull(storageCSV56);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(storageCSV68);
        org.junit.Assert.assertNotNull(storageCSV71);
        org.junit.Assert.assertNotNull(storageCSV73);
        org.junit.Assert.assertNotNull(sampleList74);
        org.junit.Assert.assertNotNull(storageCSV76);
        org.junit.Assert.assertNotNull(sampleList77);
        org.junit.Assert.assertNotNull(sampleList79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(sampleList81);
        org.junit.Assert.assertNotNull(shortArray84);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertNull(type94);
        org.junit.Assert.assertNotNull(strArray95);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test496");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        memory0.build();
        laccan.memory.Container container4 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        long long10 = sample9.getDate();
        java.lang.Class<?> wildcardClass11 = sample9.getClass();
        java.lang.String str12 = sample9.toString();
        memory0.add(sample9);
        int int14 = memory0.length();
        laccan.memory.Container container15 = memory0.getMemory();
        memory0.build();
        laccan.memory.Container container17 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null;-19.699999999999996;0" + "'", str12.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(container15);
        org.junit.Assert.assertNotNull(container17);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test497");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg(byteArray2);
        int int5 = micazMsg4.dataLength();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test498");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        double double6 = sample5.getDateDouble();
        java.lang.String[] strArray7 = sample5.toCSV();
        java.lang.String str8 = sample5.toString();
        long long9 = sample5.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null;-19.699999999999996;10" + "'", str8.equals("null;-19.699999999999996;10"));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test499");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        short short7 = micazMsg1.getElement_Buffer(4);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        java.lang.Object obj11 = micazMsg9.clone();
        micazMsg9.set_NodeID(20);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray16);
        micazMsg9.dataSet(byteArray16);
        short short20 = micazMsg9.getElement_Buffer(0);
        net.tinyos.message.Message message22 = micazMsg9.clone((int) (byte) 100);
        int int23 = micazMsg9.get_Voltage();
        micazMsg9.init((int) (short) 0);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray28 = micazMsg27.get_Buffer();
        java.lang.Object obj29 = micazMsg27.clone();
        micazMsg27.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg27, (int) (byte) 0);
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray36 = micazMsg35.get_Buffer();
        java.lang.Object obj37 = micazMsg35.clone();
        micazMsg35.set_NodeID(20);
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg43 = new laccan.devices.MicazMsg(byteArray42);
        micazMsg35.dataSet(byteArray42);
        micazMsg27.dataSet(byteArray42);
        micazMsg9.dataSet(byteArray42, (int) (byte) 0, (int) (short) 0, (int) (byte) 0);
        laccan.devices.MicazMsg micazMsg50 = new laccan.devices.MicazMsg(byteArray42);
        laccan.devices.MicazMsg micazMsg51 = new laccan.devices.MicazMsg(byteArray42);
        micazMsg1.dataSet(byteArray42);
        laccan.devices.MicazMsg micazMsg53 = new laccan.devices.MicazMsg(byteArray42);
        try {
            laccan.devices.MicazMsg micazMsg56 = new laccan.devices.MicazMsg(byteArray42, 3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 3, data_length 10 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertNotNull(message22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(byteArray42);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test500");
        laccan.devices.helper.utils.Assistant.reducerType = "Message <MicazMsg> \n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n";
    }
}

