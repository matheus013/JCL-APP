package laccan;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test001");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = micazMsg14.get_Buffer();
        java.lang.Object obj16 = micazMsg14.clone();
        int int17 = micazMsg14.get_NodeID();
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray20);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray20, 2);
        micazMsg14.dataSet(byteArray20);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray20);
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray20);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray20);
        try {
            micazMsg1.dataSet(byteArray20, 160, 172, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test002");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 512);
        java.lang.Object obj7 = micazMsg2.clone();
        micazMsg2.amTypeSet((int) (short) 1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg2);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(512);
        try {
            micazMsg2.dataSet((net.tinyos.message.Message) micazMsg12, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test003");
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
        java.lang.String str52 = sample27.getNode();
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
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test004");
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
        int int16 = micazMsg1.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNull(serialPacket15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test005");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        micazMsg1.amTypeSet(160);
        java.lang.Object obj11 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket12 = micazMsg1.getSerialPacket();
        try {
            laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((net.tinyos.message.Message) serialPacket12, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(serialPacket12);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test006");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        short[] shortArray2 = micazMsg1.get_Buffer();
        int int3 = micazMsg1.baseOffset();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test007");
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
        memory0.build();
        int int23 = memory0.length();
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray26 = micazMsg25.get_Buffer();
        java.lang.Object obj27 = micazMsg25.clone();
        short short29 = micazMsg25.getElement_Buffer((int) (short) 0);
        laccan.devices.Sample sample31 = new laccan.devices.Sample(micazMsg25, (long) (short) 0);
        laccan.devices.Sample sample32 = new laccan.devices.Sample(micazMsg25);
        java.lang.String str33 = sample32.getNode();
        java.lang.String str34 = sample32.getNode();
        long long35 = sample32.getDate();
        memory0.add(sample32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 0 + "'", short29 == (short) 0);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test008");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        laccan.devices.Type type7 = null;
        sample4.setType(type7);
        sample4.setNode("hi!");
        sample4.setDate((long) 1);
        sample4.setTemperature((double) (short) -1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test009");
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
        int int11 = container10.length();
        java.util.List<laccan.devices.Sample> sampleList12 = container10.get();
        java.util.List<java.lang.Double> doubleList13 = laccan.cloud.prediction.Regression.makeTests(sampleList12);
        java.util.List<java.lang.Double> doubleList14 = laccan.cloud.prediction.Regression.makeTests(sampleList12);
        java.util.List<java.lang.Double> doubleList15 = laccan.cloud.prediction.Regression.makeTests(sampleList12);
        java.util.List<java.lang.Double> doubleList16 = laccan.cloud.prediction.Regression.makeTests(sampleList12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(sampleList12);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test010");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 1, 100L, (int) (byte) 0);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test011");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, (long) 0);
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg2, (long) (byte) 10);
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg2);
        java.lang.String str9 = sample8.toString();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null;-19.699999999999996;0" + "'", str9.equals("null;-19.699999999999996;0"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test012");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (short) 1, (int) 'a');
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test013");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray6);
        java.lang.Object obj9 = micazMsg8.clone();
        int int10 = micazMsg8.get_NodeID();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        micazMsg12.set_NodeID(20);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray19);
        micazMsg12.dataSet(byteArray19);
        int int22 = micazMsg12.dataLength();
        java.lang.Object obj23 = micazMsg12.clone();
        short[] shortArray24 = micazMsg12.get_Buffer();
        micazMsg8.set_Buffer(shortArray24);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(shortArray24);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test014");
        laccan.devices.helper.utils.Assistant.reducerType = "Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n";
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test015");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (byte) 10, 24);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test016");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV0.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV0.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV0.local("lastReading");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test017");
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
        laccan.devices.Sample sample32 = new laccan.devices.Sample("memory", (double) 2, (-1L));
        double double33 = sample32.getDateDouble();
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray36 = micazMsg35.get_Buffer();
        java.lang.Object obj37 = micazMsg35.clone();
        laccan.devices.Sample sample38 = new laccan.devices.Sample(micazMsg35);
        long long39 = sample38.getDate();
        java.lang.Class<?> wildcardClass40 = sample38.getClass();
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray43 = micazMsg42.get_Buffer();
        java.lang.Object obj44 = micazMsg42.clone();
        laccan.devices.Sample sample45 = new laccan.devices.Sample(micazMsg42);
        long long46 = sample45.getDate();
        laccan.devices.Type type47 = laccan.devices.Type.FULL;
        sample45.setType(type47);
        sample38.setType(type47);
        laccan.devices.MicazMsg micazMsg51 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray57 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg51.set_Buffer(shortArray57);
        laccan.devices.Sample sample59 = new laccan.devices.Sample(micazMsg51);
        laccan.devices.Sample sample60 = new laccan.devices.Sample();
        laccan.devices.Type type61 = laccan.devices.Type.FULL;
        sample60.setType(type61);
        sample59.setType(type61);
        sample38.setType(type61);
        sample32.setType(type61);
        keepingAll0.add(sample32);
        sample32.setDate((long) 48);
        sample32.setDate((long) 24);
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + type47 + "' != '" + laccan.devices.Type.FULL + "'", type47.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertTrue("'" + type61 + "' != '" + laccan.devices.Type.FULL + "'", type61.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test018");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone(2);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray12, 2);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg16.set_NodeID((int) (byte) 10);
        byte[] byteArray19 = micazMsg16.dataGet();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray19);
        message9.dataSet(byteArray19);
        try {
            laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray19, 24, 512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 24, data_length 512 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray19);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test019");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0);
        java.lang.Object obj4 = micazMsg1.clone();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg10.amTypeSet(2);
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg10, (long) 512);
        micazMsg10.set_Voltage(16);
        byte[] byteArray17 = micazMsg10.dataGet();
        micazMsg7.dataSet(byteArray17);
        micazMsg1.dataSet(byteArray17);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(byteArray17);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test020");
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
        laccan.devices.MicazMsg micazMsg44 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray45 = micazMsg44.get_Buffer();
        micazMsg44.setElement_Buffer(0, (short) 10);
        micazMsg44.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg52 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray53 = micazMsg52.get_Buffer();
        java.lang.Object obj54 = micazMsg52.clone();
        int int55 = micazMsg52.get_NodeID();
        byte[] byteArray58 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg59 = new laccan.devices.MicazMsg(byteArray58);
        laccan.devices.MicazMsg micazMsg61 = new laccan.devices.MicazMsg(byteArray58, 2);
        micazMsg52.dataSet(byteArray58);
        micazMsg44.dataSet(byteArray58);
        laccan.devices.MicazMsg micazMsg65 = new laccan.devices.MicazMsg(byteArray58, (int) (byte) -1);
        try {
            micazMsg42.dataSet(byteArray58, 24, 160, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(byteArray58);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test021");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 2);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        micazMsg6.set_NodeID((int) (byte) 10);
        byte[] byteArray9 = micazMsg6.dataGet();
        int int10 = micazMsg6.dataLength();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg6.getSerialPacket();
        java.lang.Class<?> wildcardClass12 = micazMsg6.getClass();
        java.lang.Object obj13 = micazMsg6.clone();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test022");
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
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray15, (int) '#', 1);
        try {
            micazMsg22.set_NodeID(24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (0) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test023");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        int int8 = micazMsg7.get_Voltage();
        net.tinyos.message.Message message10 = micazMsg7.clone(52);
        short[] shortArray11 = micazMsg7.get_Buffer();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(message10);
        org.junit.Assert.assertNotNull(shortArray11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test024");
        laccan.devices.MicazMsg micazMsg0 = null;
        try {
            laccan.devices.Sample sample2 = new laccan.devices.Sample(micazMsg0, (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test025");
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
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = micazMsg16.get_Buffer();
        java.lang.Object obj18 = micazMsg16.clone();
        short short20 = micazMsg16.getElement_Buffer((int) (short) 0);
        laccan.devices.Sample sample22 = new laccan.devices.Sample(micazMsg16, (long) (short) 0);
        java.lang.Object obj23 = micazMsg16.clone();
        int int24 = micazMsg16.baseOffset();
        try {
            micazMsg11.dataSet((net.tinyos.message.Message) micazMsg16, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test026");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        int int1 = keepingAll0.length();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test027");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("reduction");
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV5 = storageCSV3.local("hi!");
        laccan.persistence.StorageCSV storageCSV7 = storageCSV5.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList8 = storageCSV7.read();
        laccan.persistence.StorageCSV storageCSV10 = storageCSV7.local("memory");
        java.lang.String[] strArray11 = laccan.devices.helper.utils.Assistant.environments;
        storageCSV7.save(strArray11);
        laccan.persistence.StorageCSV storageCSV13 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray14 = new java.lang.String[] {};
        storageCSV13.save(strArray14);
        storageCSV7.save(strArray14);
        storageCSV2.save(strArray14);
        java.util.List<laccan.devices.Sample> sampleList18 = storageCSV2.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(sampleList8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(sampleList18);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test028");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        int int13 = micazMsg1.get_Voltage();
        int int14 = micazMsg1.dataLength();
        int int15 = micazMsg1.get_Voltage();
        try {
            laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (128) or length (16), for data_length 16 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test029");
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
        int int21 = micazMsg1.get_NodeID();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test030");
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
        laccan.devices.Type type27 = sample24.getType();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(sampleList17);
        org.junit.Assert.assertNull(type25);
        org.junit.Assert.assertNull(type27);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test031");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test032");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test033");
        laccan.devices.helper.utils.Assistant.predictorType = "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 ";
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test034");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("reduction;-19.699999999999996;0", (double) 32L, (long) (short) 1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test035");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        keepingAll0.add(sample4);
        laccan.memory.data.reduction.KeepingAll keepingAll9 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList10 = keepingAll9.get();
        int int11 = keepingAll9.length();
        java.util.List<laccan.devices.Sample> sampleList12 = keepingAll9.get();
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = micazMsg14.get_Buffer();
        java.lang.Object obj16 = micazMsg14.clone();
        laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg14);
        laccan.devices.Type type18 = null;
        sample17.setType(type18);
        laccan.devices.Type type20 = null;
        sample17.setType(type20);
        sample17.setNode("hi!");
        keepingAll9.add(sample17);
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray27 = micazMsg26.get_Buffer();
        java.lang.Object obj28 = micazMsg26.clone();
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg26);
        laccan.devices.Type type30 = null;
        sample29.setType(type30);
        java.lang.String str32 = sample29.toString();
        java.lang.String str33 = sample29.getNode();
        keepingAll9.add(sample29);
        laccan.devices.Sample sample35 = new laccan.devices.Sample();
        laccan.devices.Type type36 = laccan.devices.Type.FULL;
        sample35.setType(type36);
        sample29.setType(type36);
        sample4.setType(type36);
        java.lang.Class<?> wildcardClass40 = type36.getClass();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(sampleList12);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "null;-19.699999999999996;0" + "'", str32.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + type36 + "' != '" + laccan.devices.Type.FULL + "'", type36.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test036");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        micazMsg1.set_NodeID(256);
        micazMsg1.set_Voltage(2);
        net.tinyos.message.SerialPacket serialPacket13 = micazMsg1.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(serialPacket13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test037");
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
        laccan.devices.Sample sample32 = new laccan.devices.Sample("memory", (double) 2, (-1L));
        double double33 = sample32.getDateDouble();
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray36 = micazMsg35.get_Buffer();
        java.lang.Object obj37 = micazMsg35.clone();
        laccan.devices.Sample sample38 = new laccan.devices.Sample(micazMsg35);
        long long39 = sample38.getDate();
        java.lang.Class<?> wildcardClass40 = sample38.getClass();
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray43 = micazMsg42.get_Buffer();
        java.lang.Object obj44 = micazMsg42.clone();
        laccan.devices.Sample sample45 = new laccan.devices.Sample(micazMsg42);
        long long46 = sample45.getDate();
        laccan.devices.Type type47 = laccan.devices.Type.FULL;
        sample45.setType(type47);
        sample38.setType(type47);
        laccan.devices.MicazMsg micazMsg51 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray57 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg51.set_Buffer(shortArray57);
        laccan.devices.Sample sample59 = new laccan.devices.Sample(micazMsg51);
        laccan.devices.Sample sample60 = new laccan.devices.Sample();
        laccan.devices.Type type61 = laccan.devices.Type.FULL;
        sample60.setType(type61);
        sample59.setType(type61);
        sample38.setType(type61);
        sample32.setType(type61);
        keepingAll0.add(sample32);
        sample32.setDate((long) 48);
        double double69 = sample32.getTemperature();
        double double70 = sample32.getTemperature();
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + type47 + "' != '" + laccan.devices.Type.FULL + "'", type47.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertTrue("'" + type61 + "' != '" + laccan.devices.Type.FULL + "'", type61.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 2.0d + "'", double69 == 2.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 2.0d + "'", double70 == 2.0d);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test038");
        try {
            laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((-30));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test039");
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
        try {
            laccan.devices.Sample sample30 = new laccan.devices.Sample(micazMsg29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
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
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test040");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (-30), (long) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test041");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        try {
            laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 256, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test042");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        int int11 = micazMsg1.dataLength();
        java.lang.Object obj12 = micazMsg1.clone();
        java.lang.Object obj13 = micazMsg1.clone();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 16);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test043");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 1, (long) (byte) 100, 1);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test044");
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
        double double23 = sample13.getTemperature();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-19.699999999999996d) + "'", double23 == (-19.699999999999996d));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test045");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (short) 1, (-1));
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test046");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 1);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        micazMsg6.init(48);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        micazMsg10.set_NodeID(20);
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray17);
        micazMsg10.dataSet(byteArray17);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray17, 0);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray17, 10);
        try {
            micazMsg6.dataSet(byteArray17, (-30), 0, 172);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(byteArray17);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test047");
        laccan.devices.helper.utils.Assistant.predictorType = "Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 ";
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test048");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        micazMsg1.set_NodeID(0);
        try {
            short short9 = micazMsg1.getElement_Buffer((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test049");
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
        int int32 = micazMsg1.dataLength();
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray35 = micazMsg34.get_Buffer();
        java.lang.Object obj36 = micazMsg34.clone();
        int int37 = micazMsg34.get_NodeID();
        laccan.devices.MicazMsg micazMsg39 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray40 = micazMsg39.get_Buffer();
        micazMsg34.set_Buffer(shortArray40);
        micazMsg1.set_Buffer(shortArray40);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(shortArray40);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test050");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        double double7 = sample6.getTemperature();
        long long8 = sample6.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-19.699999999999996d) + "'", double7 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test051");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        byte[] byteArray7 = micazMsg1.dataGet();
        int int8 = micazMsg1.get_NodeID();
        short short10 = micazMsg1.getElement_Buffer(1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test052");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        micazMsg1.set_NodeID((int) (byte) -1);
        micazMsg1.amTypeSet(256);
        java.lang.String str9 = micazMsg1.toString();
        try {
            net.tinyos.message.Message message11 = micazMsg1.clone((-30));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test053");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV5 = storageCSV3.local("hi!");
        laccan.persistence.StorageCSV storageCSV7 = storageCSV5.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList8 = storageCSV7.read();
        laccan.persistence.StorageCSV storageCSV10 = storageCSV7.local("memory");
        laccan.persistence.StorageCSV storageCSV11 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV13 = storageCSV11.local("hi!");
        laccan.persistence.StorageCSV storageCSV15 = storageCSV13.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList16 = storageCSV15.read();
        java.util.List<laccan.devices.Sample> sampleList17 = storageCSV15.read();
        laccan.persistence.StorageCSV storageCSV19 = storageCSV15.local("");
        laccan.persistence.StorageCSV storageCSV20 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV22 = storageCSV20.local("hi!");
        laccan.persistence.StorageCSV storageCSV24 = storageCSV22.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList25 = storageCSV24.read();
        laccan.persistence.StorageCSV storageCSV27 = storageCSV24.local("memory");
        laccan.persistence.StorageCSV storageCSV28 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV30 = storageCSV28.local("hi!");
        laccan.persistence.StorageCSV storageCSV32 = storageCSV30.local("lastReading");
        java.lang.String[] strArray38 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV32.save(strArray38);
        storageCSV24.save(strArray38);
        storageCSV15.save(strArray38);
        storageCSV10.save(strArray38);
        laccan.persistence.StorageCSV storageCSV44 = storageCSV10.local("null;-19.699999999999996;0");
        laccan.persistence.StorageCSV storageCSV45 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV47 = storageCSV45.local("hi!");
        laccan.persistence.StorageCSV storageCSV49 = storageCSV47.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList50 = storageCSV49.read();
        laccan.persistence.StorageCSV storageCSV52 = storageCSV49.local("init");
        java.util.List<laccan.devices.Sample> sampleList53 = storageCSV49.read();
        laccan.memory.data.reduction.KeepingAll keepingAll54 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList55 = keepingAll54.get();
        int int56 = keepingAll54.length();
        java.util.List<laccan.devices.Sample> sampleList57 = keepingAll54.get();
        laccan.devices.MicazMsg micazMsg59 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray60 = micazMsg59.get_Buffer();
        java.lang.Object obj61 = micazMsg59.clone();
        laccan.devices.Sample sample62 = new laccan.devices.Sample(micazMsg59);
        laccan.devices.Type type63 = null;
        sample62.setType(type63);
        laccan.devices.Type type65 = null;
        sample62.setType(type65);
        sample62.setNode("hi!");
        keepingAll54.add(sample62);
        laccan.devices.Type type70 = sample62.getType();
        java.lang.String[] strArray71 = sample62.toCSV();
        storageCSV49.save(strArray71);
        storageCSV10.save(strArray71);
        storageCSV0.save(strArray71);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(sampleList8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(storageCSV15);
        org.junit.Assert.assertNotNull(sampleList16);
        org.junit.Assert.assertNotNull(sampleList17);
        org.junit.Assert.assertNotNull(storageCSV19);
        org.junit.Assert.assertNotNull(storageCSV22);
        org.junit.Assert.assertNotNull(storageCSV24);
        org.junit.Assert.assertNotNull(sampleList25);
        org.junit.Assert.assertNotNull(storageCSV27);
        org.junit.Assert.assertNotNull(storageCSV30);
        org.junit.Assert.assertNotNull(storageCSV32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(storageCSV44);
        org.junit.Assert.assertNotNull(storageCSV47);
        org.junit.Assert.assertNotNull(storageCSV49);
        org.junit.Assert.assertNotNull(sampleList50);
        org.junit.Assert.assertNotNull(storageCSV52);
        org.junit.Assert.assertNotNull(sampleList53);
        org.junit.Assert.assertNotNull(sampleList55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(sampleList57);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNull(type70);
        org.junit.Assert.assertNotNull(strArray71);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test054");
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
        try {
            regression0.train();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double2, Double.NaN, 0);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(sampleArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test055");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        sample4.setTemperature((double) 2);
        laccan.devices.Type type7 = sample4.getType();
        laccan.devices.Type type8 = sample4.getType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertNull(type8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test056");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(16, (int) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test057");
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
        laccan.cloud.prediction.Regression regression50 = new laccan.cloud.prediction.Regression();
        double double51 = regression50.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll52 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList53 = keepingAll52.get();
        laccan.cloud.prediction.Regression regression54 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg56 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray57 = micazMsg56.get_Buffer();
        java.lang.Object obj58 = micazMsg56.clone();
        laccan.devices.Sample sample59 = new laccan.devices.Sample(micazMsg56);
        laccan.devices.Sample sample60 = new laccan.devices.Sample();
        laccan.devices.Sample sample61 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray62 = new laccan.devices.Sample[] { sample59, sample60, sample61 };
        java.util.ArrayList<laccan.devices.Sample> sampleList63 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList63, sampleArray62);
        java.util.List<java.lang.Double> doubleList65 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList63);
        java.util.List<java.lang.Double> doubleList66 = regression54.result(doubleList65);
        regression50.init(sampleList53, doubleList65);
        laccan.cloud.prediction.Regression regression68 = new laccan.cloud.prediction.Regression();
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
        java.util.List<java.lang.Double> doubleList80 = regression68.result(doubleList79);
        java.util.List<java.lang.Double> doubleList81 = regression50.result(doubleList79);
        java.util.List<java.lang.Double> doubleList82 = regression0.result(doubleList79);
        regression0.train();
        regression0.train();
        java.util.List<java.lang.Double> doubleList85 = regression0.result();
        regression0.train();
        java.util.List<java.lang.Double> doubleList87 = regression0.result();
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
        org.junit.Assert.assertEquals((double) double51, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList53);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(sampleArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(doubleList65);
        org.junit.Assert.assertNotNull(doubleList66);
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(sampleArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(doubleList79);
        org.junit.Assert.assertNotNull(doubleList80);
        org.junit.Assert.assertNotNull(doubleList81);
        org.junit.Assert.assertNotNull(doubleList82);
        org.junit.Assert.assertNotNull(doubleList85);
        org.junit.Assert.assertNotNull(doubleList87);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test058");
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
        laccan.memory.data.reduction.KeepingAll keepingAll35 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList36 = keepingAll35.get();
        laccan.cloud.prediction.Regression regression37 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg39 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray40 = micazMsg39.get_Buffer();
        java.lang.Object obj41 = micazMsg39.clone();
        laccan.devices.Sample sample42 = new laccan.devices.Sample(micazMsg39);
        laccan.devices.Sample sample43 = new laccan.devices.Sample();
        laccan.devices.Sample sample44 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray45 = new laccan.devices.Sample[] { sample42, sample43, sample44 };
        java.util.ArrayList<laccan.devices.Sample> sampleList46 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList46, sampleArray45);
        java.util.List<java.lang.Double> doubleList48 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList46);
        java.util.List<java.lang.Double> doubleList49 = regression37.result(doubleList48);
        regression33.init(sampleList36, doubleList48);
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
        laccan.cloud.prediction.Regression regression69 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg71 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray72 = micazMsg71.get_Buffer();
        java.lang.Object obj73 = micazMsg71.clone();
        laccan.devices.Sample sample74 = new laccan.devices.Sample(micazMsg71);
        laccan.devices.Sample sample75 = new laccan.devices.Sample();
        laccan.devices.Sample sample76 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray77 = new laccan.devices.Sample[] { sample74, sample75, sample76 };
        java.util.ArrayList<laccan.devices.Sample> sampleList78 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList78, sampleArray77);
        java.util.List<java.lang.Double> doubleList80 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList78);
        java.util.List<java.lang.Double> doubleList81 = regression69.result(doubleList80);
        regression33.init(sampleList54, doubleList81);
        java.util.List<java.lang.Double> doubleList83 = laccan.cloud.prediction.Regression.makeTests(sampleList54);
        java.util.List<java.lang.Double> doubleList84 = null;
        regression0.init(sampleList54, doubleList84);
        try {
            java.util.List<java.lang.Double> doubleList86 = regression0.result();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
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
        org.junit.Assert.assertNotNull(sampleList36);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(sampleArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(doubleList48);
        org.junit.Assert.assertNotNull(doubleList49);
        org.junit.Assert.assertEquals((double) double52, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList54);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(sampleArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(doubleList66);
        org.junit.Assert.assertNotNull(doubleList67);
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(sampleArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(doubleList80);
        org.junit.Assert.assertNotNull(doubleList81);
        org.junit.Assert.assertNotNull(doubleList83);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test059");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 52, (long) 4, (int) 'a');
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test060");
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
        micazMsg10.amTypeSet(32);
        short[] shortArray21 = micazMsg10.get_Buffer();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg10, (int) (short) 1);
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg10, (long) ' ');
        java.lang.String[] strArray26 = sample25.toCSV();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test061");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        int int9 = micazMsg1.dataLength();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg1, 0L);
        java.lang.String str12 = sample11.toString();
        long long13 = sample11.getDate();
        java.lang.String[] strArray14 = sample11.toCSV();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null;-19.699999999999996;0" + "'", str12.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test062");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer(160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test063");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        storageCSV3.save(strArray4);
        storageCSV0.save(strArray4);
        laccan.persistence.StorageCSV storageCSV8 = storageCSV0.local("nodes");
        laccan.persistence.StorageCSV storageCSV10 = storageCSV0.local("init");
        laccan.persistence.StorageCSV storageCSV12 = storageCSV10.local("reduction;-19.699999999999996;0");
        laccan.persistence.StorageCSV storageCSV14 = storageCSV12.local("full_memory");
        laccan.persistence.StorageCSV storageCSV16 = storageCSV12.local("memory;-1.0;32");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV12);
        org.junit.Assert.assertNotNull(storageCSV14);
        org.junit.Assert.assertNotNull(storageCSV16);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test064");
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
        java.util.List<laccan.devices.Sample> sampleList39 = storageCSV10.read();
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
        org.junit.Assert.assertNotNull(sampleList39);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test065");
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
        net.tinyos.message.Message message17 = micazMsg1.clone(3);
        try {
            laccan.devices.helper.utils.Assistant.toFog(message17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 3 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNull(serialPacket15);
        org.junit.Assert.assertNotNull(message17);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test066");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("reduction;-19.699999999999996;0", (double) (short) 100, (long) 32);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test067");
        laccan.devices.MicazMsg micazMsg0 = new laccan.devices.MicazMsg();
        laccan.devices.Sample sample1 = new laccan.devices.Sample(micazMsg0);
        micazMsg0.init(16);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test068");
        laccan.devices.helper.utils.Assistant.reducerType = "null;4.0;0";
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test069");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (short) -1, (long) 0, 32);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test070");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(1, (int) (byte) 10);
        java.lang.Object obj3 = micazMsg2.clone();
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test071");
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
        java.util.List<java.lang.Double> doubleList51 = regression0.result();
        java.util.List<java.lang.Double> doubleList52 = regression0.result();
        java.util.List<java.lang.Double> doubleList53 = regression0.result();
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
        org.junit.Assert.assertNotNull(doubleList51);
        org.junit.Assert.assertNotNull(doubleList52);
        org.junit.Assert.assertNotNull(doubleList53);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test072");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory", (double) (byte) -1, (long) ' ');
        java.lang.String str4 = sample3.toString();
        double double5 = sample3.getTemperature();
        long long6 = sample3.getDate();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "memory;-1.0;32" + "'", str4.equals("memory;-1.0;32"));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test073");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray3, (int) (byte) -1, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray3);
        short[] shortArray8 = micazMsg7.get_Buffer();
        short[] shortArray9 = micazMsg7.get_Buffer();
        micazMsg7.amTypeSet(0);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg15.set_Buffer(shortArray21);
        laccan.devices.Sample sample23 = new laccan.devices.Sample(micazMsg15);
        short[] shortArray24 = micazMsg15.get_Buffer();
        micazMsg13.set_Buffer(shortArray24);
        micazMsg7.set_Buffer(shortArray24);
        try {
            laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg7, 172, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 172, data_length 6 and data array size 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(shortArray24);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test074");
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
        regression0.train();
        regression0.train();
        laccan.cloud.prediction.Regression regression54 = new laccan.cloud.prediction.Regression();
        double double55 = regression54.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll56 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList57 = keepingAll56.get();
        laccan.cloud.prediction.Regression regression58 = new laccan.cloud.prediction.Regression();
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
        java.util.List<java.lang.Double> doubleList70 = regression58.result(doubleList69);
        regression54.init(sampleList57, doubleList69);
        double double72 = regression54.mse();
        java.util.List<java.lang.Double> doubleList73 = regression54.result();
        java.util.List<java.lang.Double> doubleList74 = regression0.result(doubleList73);
        java.util.List<java.lang.Double> doubleList75 = null;
        try {
            java.util.List<java.lang.Double> doubleList76 = regression0.result(doubleList75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
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
        org.junit.Assert.assertEquals((double) double55, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList57);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNotNull(sampleArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(doubleList69);
        org.junit.Assert.assertNotNull(doubleList70);
        org.junit.Assert.assertEquals((double) double72, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList73);
        org.junit.Assert.assertNotNull(doubleList74);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test075");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory", (double) (byte) -1, (long) ' ');
        java.lang.String str4 = sample3.toString();
        long long5 = sample3.getDate();
        double double6 = sample3.getTemperature();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "memory;-1.0;32" + "'", str4.equals("memory;-1.0;32"));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test076");
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
        laccan.devices.MicazMsg micazMsg84 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray85 = micazMsg84.get_Buffer();
        java.lang.Object obj86 = micazMsg84.clone();
        laccan.devices.Sample sample87 = new laccan.devices.Sample(micazMsg84);
        sample87.setTemperature((double) 2);
        keepingAll0.add(sample87);
        laccan.memory.data.reduction.KeepingAll keepingAll91 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample92 = new laccan.devices.Sample();
        keepingAll91.add(sample92);
        keepingAll0.add(sample92);
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
        org.junit.Assert.assertNotNull(shortArray85);
        org.junit.Assert.assertNotNull(obj86);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test077");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (byte) 1, (int) 'a');
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test078");
        laccan.devices.helper.utils.Assistant.predictorType = "hi!";
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test079");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (byte) -1, 512);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test080");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        laccan.devices.Type type6 = sample4.getType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(type6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test081");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(24, 0);
        net.tinyos.message.SerialPacket serialPacket3 = micazMsg2.getSerialPacket();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        int int8 = micazMsg5.get_NodeID();
        micazMsg5.setElement_Buffer(1, (short) (byte) 0);
        int int12 = micazMsg5.get_NodeID();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg5);
        java.lang.Class<?> wildcardClass14 = micazMsg5.getClass();
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
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg(byteArray29);
        micazMsg5.dataSet(byteArray29);
        laccan.devices.MicazMsg micazMsg39 = new laccan.devices.MicazMsg(byteArray29, (int) (short) 1);
        try {
            serialPacket3.dataSet(byteArray29, 100, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(serialPacket3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test082");
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
        java.util.List<laccan.devices.Sample> sampleList62 = storageCSV61.read();
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
        org.junit.Assert.assertNotNull(sampleList62);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test083");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1);
        java.lang.Object obj8 = micazMsg1.clone();
        micazMsg1.set_Voltage(20);
        try {
            laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 256, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test084");
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
        int int16 = micazMsg1.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test085");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        short short12 = micazMsg1.getElement_Buffer(0);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = micazMsg14.get_Buffer();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg14);
        int int17 = micazMsg14.get_NodeID();
        byte[] byteArray18 = micazMsg14.dataGet();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray18, 100);
        micazMsg1.dataSet(byteArray18);
        int int22 = micazMsg1.baseOffset();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test086");
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
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray15, (int) (short) 1);
        int int23 = micazMsg22.baseOffset();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test087");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        java.lang.String str16 = micazMsg13.toString();
        java.lang.Class<?> wildcardClass17 = micazMsg13.getClass();
        try {
            laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=" + "'", str16.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer="));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test088");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) -1, 24);
        net.tinyos.message.Message message4 = micazMsg2.clone(2);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        micazMsg6.setElement_Buffer(0, (short) 10);
        micazMsg6.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg6, (int) (byte) 10);
        micazMsg14.setElement_Buffer((int) (short) 0, (short) 0);
        try {
            micazMsg2.dataSet((net.tinyos.message.Message) micazMsg14, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(message4);
        org.junit.Assert.assertNotNull(shortArray7);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test089");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        int int4 = micazMsg1.baseOffset();
        java.lang.String str5 = micazMsg1.toString();
        try {
            short short7 = micazMsg1.getElement_Buffer((-30));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str5.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test090");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        int int13 = micazMsg1.amType();
        micazMsg1.amTypeSet(10);
        micazMsg1.set_Voltage((-30));
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 172 + "'", int13 == 172);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test091");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        memory0.build();
        memory0.build();
        int int5 = memory0.length();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg7.set_Buffer(shortArray13);
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg7);
        laccan.devices.Sample sample16 = new laccan.devices.Sample();
        laccan.devices.Type type17 = laccan.devices.Type.FULL;
        sample16.setType(type17);
        sample15.setType(type17);
        sample15.setTemperature((double) 'a');
        java.lang.Class<?> wildcardClass22 = sample15.getClass();
        memory0.add(sample15);
        laccan.devices.Type type24 = sample15.getType();
        sample15.setTemperature((double) (byte) 1);
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + type17 + "' != '" + laccan.devices.Type.FULL + "'", type17.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + laccan.devices.Type.FULL + "'", type24.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test092");
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
        net.tinyos.message.SerialPacket serialPacket16 = micazMsg1.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(message13);
        org.junit.Assert.assertNull(serialPacket16);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test093");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        storageCSV3.save(strArray4);
        storageCSV0.save(strArray4);
        laccan.persistence.StorageCSV storageCSV8 = storageCSV0.local("nodes");
        laccan.persistence.StorageCSV storageCSV10 = storageCSV0.local("init");
        laccan.persistence.StorageCSV storageCSV12 = storageCSV10.local("reduction;-19.699999999999996;0");
        laccan.persistence.StorageCSV storageCSV14 = storageCSV12.local("full_memory");
        java.util.List<laccan.devices.Sample> sampleList15 = storageCSV12.read();
        java.util.List<java.lang.Double> doubleList16 = laccan.cloud.prediction.Regression.makeTests(sampleList15);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV12);
        org.junit.Assert.assertNotNull(storageCSV14);
        org.junit.Assert.assertNotNull(sampleList15);
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test094");
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
        laccan.memory.data.reduction.KeepingAll keepingAll22 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList23 = keepingAll22.get();
        int int24 = keepingAll22.length();
        java.util.List<laccan.devices.Sample> sampleList25 = keepingAll22.get();
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray28 = micazMsg27.get_Buffer();
        java.lang.Object obj29 = micazMsg27.clone();
        laccan.devices.Sample sample30 = new laccan.devices.Sample(micazMsg27);
        laccan.devices.Type type31 = null;
        sample30.setType(type31);
        laccan.devices.Type type33 = null;
        sample30.setType(type33);
        sample30.setNode("hi!");
        keepingAll22.add(sample30);
        java.lang.String[] strArray38 = sample30.toCSV();
        sample30.setNode("");
        memory0.add(sample30);
        memory0.build();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(sampleList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(sampleList25);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(strArray38);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test095");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        try {
            micazMsg1.setElement_Buffer(172, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test096");
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
        java.lang.String[] strArray37 = null;
        storageCSV10.save(strArray37);
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
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test097");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(0, 1);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test098");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        memory0.build();
        int int4 = memory0.length();
        laccan.memory.Container container5 = memory0.getMemory();
        int int6 = memory0.length();
        memory0.build();
        int int8 = memory0.length();
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(container5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test099");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1);
        double double8 = sample7.getDateDouble();
        sample7.setDate((long) (short) 0);
        sample7.setNode("Message <MicazMsg> \n  [Buffer=");
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = micazMsg14.get_Buffer();
        java.lang.Object obj16 = micazMsg14.clone();
        laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg14);
        long long18 = sample17.getDate();
        laccan.devices.Type type19 = laccan.devices.Type.FULL;
        sample17.setType(type19);
        sample17.setNode("reduction");
        java.lang.Class<?> wildcardClass23 = sample17.getClass();
        laccan.devices.Type type24 = sample17.getType();
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray27 = micazMsg26.get_Buffer();
        java.lang.Object obj28 = micazMsg26.clone();
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg26);
        long long30 = sample29.getDate();
        laccan.devices.Type type31 = laccan.devices.Type.FULL;
        sample29.setType(type31);
        sample29.setNode("reduction");
        laccan.devices.Type type35 = sample29.getType();
        sample17.setType(type35);
        sample7.setType(type35);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + laccan.devices.Type.FULL + "'", type19.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + laccan.devices.Type.FULL + "'", type24.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + laccan.devices.Type.FULL + "'", type31.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type35 + "' != '" + laccan.devices.Type.FULL + "'", type35.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test100");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray1 = new java.lang.String[] {};
        storageCSV0.save(strArray1);
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
        java.lang.String[] strArray19 = sample7.toCSV();
        storageCSV0.save(strArray19);
        java.util.List<laccan.devices.Sample> sampleList21 = storageCSV0.read();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + laccan.devices.Type.FULL + "'", type9.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "reduction;-19.699999999999996;0" + "'", str13.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(sampleList21);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test101");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        micazMsg1.set_NodeID(160);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test102");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg(byteArray2, 16);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2);
        net.tinyos.message.Message message7 = micazMsg5.clone(16);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg9.set_Buffer(shortArray15);
        int int17 = micazMsg9.get_NodeID();
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray20);
        micazMsg9.dataSet((net.tinyos.message.Message) micazMsg21, (int) (byte) 0);
        micazMsg9.set_Voltage((int) (short) 1);
        int int26 = micazMsg9.dataLength();
        try {
            message7.dataSet((net.tinyos.message.Message) micazMsg9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(message7);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test103");
        laccan.devices.Sample sample0 = new laccan.devices.Sample();
        double double1 = sample0.getDateDouble();
        double double2 = sample0.getDateDouble();
        sample0.setTemperature((double) 1);
        double double5 = sample0.getDateDouble();
        sample0.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test104");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        micazMsg1.amTypeSet(512);
        int int8 = micazMsg1.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test105");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        int int3 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList4 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg6.set_Buffer(shortArray12);
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg6);
        java.lang.String[] strArray15 = sample14.toCSV();
        java.lang.String str16 = sample14.getNode();
        keepingAll0.add(sample14);
        int int18 = keepingAll0.length();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test106");
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
        regression0.train();
        regression0.train();
        regression0.train();
        laccan.persistence.StorageCSV storageCSV55 = new laccan.persistence.StorageCSV();
        java.util.List<laccan.devices.Sample> sampleList56 = storageCSV55.read();
        java.util.List<java.lang.Double> doubleList57 = laccan.cloud.prediction.Regression.makeTests(sampleList56);
        java.util.List<java.lang.Double> doubleList58 = regression0.result(doubleList57);
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
        org.junit.Assert.assertNotNull(sampleList56);
        org.junit.Assert.assertNotNull(doubleList57);
        org.junit.Assert.assertNotNull(doubleList58);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test107");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;97.0;0", (-19.699999999999996d), (long) 100);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test108");
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
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = micazMsg16.get_Buffer();
        java.lang.Object obj18 = micazMsg16.clone();
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg16);
        long long20 = sample19.getDate();
        laccan.devices.Type type21 = laccan.devices.Type.FULL;
        sample19.setType(type21);
        sample19.setNode("reduction");
        java.lang.Class<?> wildcardClass25 = sample19.getClass();
        laccan.devices.Type type26 = sample19.getType();
        sample4.setType(type26);
        sample4.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 ");
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "reduction;-19.699999999999996;0" + "'", str10.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + laccan.devices.Type.FULL + "'", type21.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + type26 + "' != '" + laccan.devices.Type.FULL + "'", type26.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test109");
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
        laccan.memory.Container container12 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertNotNull(container12);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test110");
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
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj21 = micazMsg20.clone();
        int int22 = micazMsg20.get_NodeID();
        laccan.devices.Sample sample24 = new laccan.devices.Sample(micazMsg20, (long) (byte) -1);
        sample24.setTemperature((double) 3);
        memory0.add(sample24);
        long long28 = sample24.getDate();
        long long29 = sample24.getDate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(container17);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test111");
        int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test112");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray3 = micazMsg2.get_Buffer();
        java.lang.Object obj4 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2);
        laccan.devices.Type type6 = null;
        sample5.setType(type6);
        keepingAll0.add(sample5);
        double double9 = sample5.getDateDouble();
        sample5.setNode("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test113");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        int int4 = micazMsg2.get_NodeID();
        micazMsg2.init((int) 'a');
        net.tinyos.message.Message message8 = micazMsg2.clone((int) ' ');
        java.lang.Object obj9 = micazMsg2.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(message8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test114");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg(byteArray2, 16);
        try {
            micazMsg4.set_Voltage(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length -14 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test115");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.Container container3 = memory0.getMemory();
        java.util.List<laccan.devices.Sample> sampleList4 = container3.get();
        java.util.List<java.lang.Double> doubleList5 = laccan.cloud.prediction.Regression.makeTests(sampleList4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(doubleList5);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test116");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("init", (double) 100.0f, (long) 32);
        sample3.setDate((long) 160);
        java.lang.Class<?> wildcardClass6 = sample3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test117");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg7.set_Buffer(shortArray13);
        micazMsg1.set_Buffer(shortArray13);
        micazMsg1.set_Voltage((-1));
        java.lang.Object obj18 = micazMsg1.clone();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test118");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        micazMsg1.set_NodeID((int) 'a');
        micazMsg1.init((int) (byte) 1);
        try {
            laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test119");
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
        micazMsg1.set_NodeID((-1));
        try {
            short[] shortArray26 = micazMsg1.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (128) or length (16), for data_length 16 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x64]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 " + "'", str20.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x64]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 "));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test120");
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
        double double17 = sample8.getDateDouble();
        sample8.setDate((long) (byte) 100);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(type16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test121");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, 2);
        micazMsg1.dataSet(byteArray7);
        micazMsg1.set_NodeID(10);
        net.tinyos.message.Message message15 = micazMsg1.clone(256);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(message15);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test122");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4', 256);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test123");
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
        int int13 = memory0.length();
        laccan.memory.Container container14 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(container14);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test124");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        java.lang.String str16 = micazMsg13.toString();
        try {
            laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg13, 6, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 6, data_length 2 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=" + "'", str16.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer="));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test125");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1);
        java.lang.String str8 = sample7.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null;-19.699999999999996;0" + "'", str8.equals("null;-19.699999999999996;0"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test126");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(256, 52);
        try {
            short short4 = micazMsg2.getElement_Buffer((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test127");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray5 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray5);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        int int11 = micazMsg8.get_NodeID();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray14);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray14, 2);
        micazMsg8.dataSet(byteArray14);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray14);
        micazMsg6.dataSet(byteArray14);
        byte[] byteArray21 = micazMsg6.dataGet();
        try {
            micazMsg6.setElement_Buffer((int) (short) 100, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray21);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test128");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.699999999999996;0", (double) 160, (long) (short) 1);
        java.lang.String[] strArray4 = sample3.toCSV();
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
        laccan.devices.Type type20 = sample9.getType();
        sample3.setType(type20);
        java.lang.String str22 = sample3.getNode();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "reduction;-19.699999999999996;0" + "'", str15.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + laccan.devices.Type.FULL + "'", type20.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "null;-19.699999999999996;0" + "'", str22.equals("null;-19.699999999999996;0"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test129");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((-30), 512);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test130");
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
        laccan.persistence.StorageCSV storageCSV37 = storageCSV0.local("memory;-1.0;32");
        java.util.List<laccan.devices.Sample> sampleList38 = storageCSV0.read();
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
        org.junit.Assert.assertNotNull(sampleList38);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test131");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        try {
            net.tinyos.message.Message message12 = micazMsg1.clone((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test132");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(1, (int) (byte) 1);
        net.tinyos.message.Message message4 = micazMsg2.clone(10);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        micazMsg6.setElement_Buffer(0, (short) 10);
        micazMsg6.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = micazMsg14.get_Buffer();
        java.lang.Object obj16 = micazMsg14.clone();
        int int17 = micazMsg14.get_NodeID();
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray20);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray20, 2);
        micazMsg14.dataSet(byteArray20);
        micazMsg6.dataSet(byteArray20);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray20, (int) (short) 1);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray20);
        try {
            micazMsg2.dataSet(byteArray20, 2, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(message4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test133");
        laccan.devices.Sample sample0 = new laccan.devices.Sample();
        double double1 = sample0.getDateDouble();
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg3.set_Buffer(shortArray9);
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg3);
        laccan.devices.Sample sample12 = new laccan.devices.Sample();
        laccan.devices.Type type13 = laccan.devices.Type.FULL;
        sample12.setType(type13);
        sample11.setType(type13);
        sample0.setType(type13);
        java.lang.String str17 = sample0.getNode();
        java.lang.String str18 = sample0.toString();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + laccan.devices.Type.FULL + "'", type13.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null;0.0;0" + "'", str18.equals("null;0.0;0"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test134");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        micazMsg1.set_NodeID(24);
        micazMsg1.set_NodeID(3);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        java.lang.String str18 = micazMsg15.toString();
        short[] shortArray19 = micazMsg15.get_Buffer();
        byte[] byteArray20 = micazMsg15.dataGet();
        java.lang.Object obj21 = micazMsg15.clone();
        net.tinyos.message.Message message23 = micazMsg15.clone(2);
        byte[] byteArray24 = micazMsg15.dataGet();
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray24);
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray24);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray24);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray24);
        micazMsg1.dataSet(byteArray24);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str18.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(message23);
        org.junit.Assert.assertNotNull(byteArray24);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test135");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        java.lang.Object obj10 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg1);
        java.lang.Object obj13 = micazMsg1.clone();
        java.lang.Object obj14 = micazMsg1.clone();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test136");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        keepingAll0.add(sample4);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg10.set_Buffer(shortArray16);
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg10);
        laccan.devices.Sample sample19 = new laccan.devices.Sample();
        laccan.devices.Type type20 = laccan.devices.Type.FULL;
        sample19.setType(type20);
        sample18.setType(type20);
        sample18.setTemperature((double) 'a');
        keepingAll0.add(sample18);
        java.util.List<laccan.devices.Sample> sampleList26 = keepingAll0.get();
        int int27 = keepingAll0.length();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + laccan.devices.Type.FULL + "'", type20.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(sampleList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test137");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) ' ');
        micazMsg1.set_NodeID((int) ' ');
        net.tinyos.message.SerialPacket serialPacket14 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg1, (long) 100);
        double double17 = sample16.getDateDouble();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(serialPacket14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test138");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray6, (int) (byte) -1);
        try {
            micazMsg9.set_NodeID((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test139");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        int int5 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) '#', (int) (short) 1);
        try {
            int int9 = micazMsg8.get_Voltage();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test140");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        java.lang.String str16 = micazMsg13.toString();
        try {
            laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg13, 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=" + "'", str16.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer="));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test141");
        net.tinyos.message.Message message0 = null;
        try {
            laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(message0, 6, 172);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test142");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(4, 2);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test143");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("hi!", (double) (-1), (long) (byte) 100);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test144");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        micazMsg1.set_NodeID((int) (byte) -1);
        int int7 = micazMsg1.baseOffset();
        int int8 = micazMsg1.get_NodeID();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 65535 + "'", int8 == 65535);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test145");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray8, 10);
        int int15 = micazMsg14.amType();
        int int16 = micazMsg14.amType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 172 + "'", int15 == 172);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 172 + "'", int16 == 172);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test146");
        laccan.devices.helper.utils.Assistant.predictorType = "null;97.0;0";
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test147");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        net.tinyos.message.Message message4 = micazMsg2.clone(10);
        micazMsg2.set_NodeID((-30));
        org.junit.Assert.assertNotNull(message4);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test148");
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
        double double33 = regression0.mse();
        java.util.List<java.lang.Double> doubleList34 = regression0.result();
        java.util.List<java.lang.Double> doubleList35 = regression0.result();
        java.util.List<java.lang.Double> doubleList36 = null;
        try {
            java.util.List<java.lang.Double> doubleList37 = regression0.result(doubleList36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
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
        org.junit.Assert.assertEquals((double) double33, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList34);
        org.junit.Assert.assertNotNull(doubleList35);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test149");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray3 = micazMsg2.get_Buffer();
        java.lang.Object obj4 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2);
        laccan.devices.Type type6 = null;
        sample5.setType(type6);
        keepingAll0.add(sample5);
        sample5.setDate((long) (byte) 100);
        sample5.setDate((long) '4');
        java.lang.String str13 = sample5.toString();
        java.lang.String[] strArray14 = sample5.toCSV();
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null;-19.699999999999996;52" + "'", str13.equals("null;-19.699999999999996;52"));
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test150");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 2);
        try {
            laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test151");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (short) 10, (long) '4', (int) (short) 1);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test152");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        short short12 = micazMsg1.getElement_Buffer(0);
        net.tinyos.message.Message message14 = micazMsg1.clone((int) (byte) 100);
        int int15 = message14.amType();
        int int16 = message14.baseOffset();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 172 + "'", int15 == 172);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test153");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(32, 160);
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray5 = micazMsg4.get_Buffer();
        java.lang.Object obj6 = micazMsg4.clone();
        int int7 = micazMsg4.get_NodeID();
        micazMsg4.setElement_Buffer(1, (short) (byte) 0);
        micazMsg4.amTypeSet(0);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = micazMsg14.get_Buffer();
        java.lang.Object obj16 = micazMsg14.clone();
        micazMsg14.amTypeSet(20);
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg14);
        java.lang.Object obj20 = micazMsg14.clone();
        net.tinyos.message.Message message22 = micazMsg14.clone((int) ' ');
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg25.amTypeSet(2);
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg25, (long) 512);
        micazMsg25.set_Voltage(16);
        byte[] byteArray32 = micazMsg25.dataGet();
        short[] shortArray33 = micazMsg25.get_Buffer();
        micazMsg14.set_Buffer(shortArray33);
        micazMsg4.set_Buffer(shortArray33);
        micazMsg2.set_Buffer(shortArray33);
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray44 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg38.set_Buffer(shortArray44);
        java.lang.String str46 = micazMsg38.toString();
        java.lang.Object obj47 = micazMsg38.clone();
        net.tinyos.message.SerialPacket serialPacket48 = micazMsg38.getSerialPacket();
        laccan.devices.Sample sample49 = new laccan.devices.Sample(micazMsg38);
        net.tinyos.message.Message message51 = micazMsg38.clone(0);
        int int52 = message51.dataLength();
        micazMsg2.dataSet(message51, 1);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(message22);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str46.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNull(serialPacket48);
        org.junit.Assert.assertNotNull(message51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test154");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) 1, (long) (short) 10);
        sample3.setTemperature((double) (short) 1);
        sample3.setDate((long) 1);
        double double8 = sample3.getTemperature();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test155");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray3 = micazMsg2.get_Buffer();
        java.lang.Object obj4 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2);
        laccan.devices.Type type6 = null;
        sample5.setType(type6);
        keepingAll0.add(sample5);
        laccan.memory.data.reduction.KeepingAll keepingAll9 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList10 = keepingAll9.get();
        int int11 = keepingAll9.length();
        int int12 = keepingAll9.length();
        java.util.List<laccan.devices.Sample> sampleList13 = keepingAll9.get();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg15.set_Buffer(shortArray21);
        laccan.devices.Sample sample23 = new laccan.devices.Sample(micazMsg15);
        java.lang.String[] strArray24 = sample23.toCSV();
        java.lang.String str25 = sample23.getNode();
        keepingAll9.add(sample23);
        keepingAll0.add(sample23);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(sampleList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(sampleList13);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test156");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 1, (-1));
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        java.lang.Object obj11 = micazMsg9.clone();
        java.lang.String str12 = micazMsg9.toString();
        short[] shortArray13 = micazMsg9.get_Buffer();
        byte[] byteArray14 = micazMsg9.dataGet();
        java.lang.Object obj15 = micazMsg9.clone();
        net.tinyos.message.Message message17 = micazMsg9.clone(2);
        byte[] byteArray18 = micazMsg9.dataGet();
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray18, (int) ' ', (int) (short) 0);
        micazMsg1.dataSet(byteArray18, 0, 48, 2);
        micazMsg1.set_NodeID((int) (short) -1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(message17);
        org.junit.Assert.assertNotNull(byteArray18);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test157");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1, (long) 512);
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg1, 0L);
        sample11.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test158");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(24);
        int int2 = micazMsg1.baseOffset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test159");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        laccan.devices.Type type6 = laccan.devices.Type.FULL;
        sample4.setType(type6);
        sample4.setNode("reduction");
        sample4.setDate((long) 10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test160");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 20);
        java.lang.Object obj11 = micazMsg1.clone();
        int int12 = micazMsg1.amType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 172 + "'", int12 == 172);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test161");
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
        java.lang.String[] strArray15 = sample4.toCSV();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "reduction;-19.699999999999996;0" + "'", str10.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test162");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg2);
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test163");
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
        java.lang.String[] strArray60 = new java.lang.String[] { "result" };
        storageCSV56.save(strArray60);
        java.util.List<laccan.devices.Sample> sampleList62 = storageCSV56.read();
        laccan.persistence.StorageCSV storageCSV63 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV65 = storageCSV63.local("hi!");
        laccan.persistence.StorageCSV storageCSV67 = storageCSV65.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList68 = storageCSV67.read();
        laccan.persistence.StorageCSV storageCSV70 = storageCSV67.local("init");
        java.util.List<laccan.devices.Sample> sampleList71 = storageCSV67.read();
        laccan.memory.data.reduction.KeepingAll keepingAll72 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList73 = keepingAll72.get();
        int int74 = keepingAll72.length();
        java.util.List<laccan.devices.Sample> sampleList75 = keepingAll72.get();
        laccan.devices.MicazMsg micazMsg77 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray78 = micazMsg77.get_Buffer();
        java.lang.Object obj79 = micazMsg77.clone();
        laccan.devices.Sample sample80 = new laccan.devices.Sample(micazMsg77);
        laccan.devices.Type type81 = null;
        sample80.setType(type81);
        laccan.devices.Type type83 = null;
        sample80.setType(type83);
        sample80.setNode("hi!");
        keepingAll72.add(sample80);
        laccan.devices.Type type88 = sample80.getType();
        java.lang.String[] strArray89 = sample80.toCSV();
        storageCSV67.save(strArray89);
        storageCSV56.save(strArray89);
        laccan.devices.Sample sample95 = new laccan.devices.Sample("memory", (double) (byte) -1, (long) ' ');
        java.lang.String str96 = sample95.toString();
        java.lang.String[] strArray97 = sample95.toCSV();
        storageCSV56.save(strArray97);
        storageCSV10.save(strArray97);
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
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(sampleList62);
        org.junit.Assert.assertNotNull(storageCSV65);
        org.junit.Assert.assertNotNull(storageCSV67);
        org.junit.Assert.assertNotNull(sampleList68);
        org.junit.Assert.assertNotNull(storageCSV70);
        org.junit.Assert.assertNotNull(sampleList71);
        org.junit.Assert.assertNotNull(sampleList73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(sampleList75);
        org.junit.Assert.assertNotNull(shortArray78);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertNull(type88);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertTrue("'" + str96 + "' != '" + "memory;-1.0;32" + "'", str96.equals("memory;-1.0;32"));
        org.junit.Assert.assertNotNull(strArray97);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test164");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 4);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg4);
        sample5.setNode("null;-19.699999999999996;35");
        org.junit.Assert.assertNotNull(shortArray2);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test165");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        micazMsg1.amTypeSet(0);
        micazMsg1.set_NodeID((int) (byte) -1);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 16);
        java.lang.Object obj14 = micazMsg13.clone();
        byte[] byteArray15 = micazMsg13.dataGet();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg17);
        int int20 = micazMsg17.get_NodeID();
        int int21 = micazMsg17.baseOffset();
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg17, (int) '#', (int) (short) 1);
        try {
            micazMsg13.dataSet((net.tinyos.message.Message) micazMsg17, (-30));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test166");
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
        laccan.devices.Type type17 = sample9.getType();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(type17);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test167");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(172);
        laccan.devices.Sample sample2 = new laccan.devices.Sample(micazMsg1);
        java.lang.String str3 = sample2.getNode();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg5);
        int int8 = micazMsg5.dataLength();
        micazMsg5.init((int) '4');
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg5);
        double double12 = sample11.getDateDouble();
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg14.set_Buffer(shortArray20);
        laccan.devices.Sample sample22 = new laccan.devices.Sample(micazMsg14);
        laccan.devices.Sample sample23 = new laccan.devices.Sample();
        laccan.devices.Type type24 = laccan.devices.Type.FULL;
        sample23.setType(type24);
        sample22.setType(type24);
        sample22.setTemperature((double) 'a');
        laccan.devices.Type type29 = sample22.getType();
        sample11.setType(type29);
        laccan.devices.Type type31 = sample11.getType();
        sample2.setType(type31);
        laccan.memory.data.reduction.KeepingAll keepingAll33 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample34 = new laccan.devices.Sample();
        keepingAll33.add(sample34);
        java.util.List<laccan.devices.Sample> sampleList36 = keepingAll33.get();
        laccan.memory.Memory memory37 = new laccan.memory.Memory();
        memory37.build();
        int int39 = memory37.length();
        laccan.memory.Container container40 = memory37.getMemory();
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray48 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg42.set_Buffer(shortArray48);
        laccan.devices.Sample sample50 = new laccan.devices.Sample(micazMsg42);
        java.lang.String[] strArray51 = sample50.toCSV();
        sample50.setNode("hi!");
        memory37.add(sample50);
        keepingAll33.add(sample50);
        double double56 = sample50.getTemperature();
        laccan.devices.MicazMsg micazMsg58 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray59 = micazMsg58.get_Buffer();
        java.lang.Object obj60 = micazMsg58.clone();
        laccan.devices.Sample sample61 = new laccan.devices.Sample(micazMsg58);
        sample61.setTemperature((double) 16);
        double double64 = sample61.getTemperature();
        laccan.devices.Sample sample65 = new laccan.devices.Sample();
        double double66 = sample65.getDateDouble();
        double double67 = sample65.getDateDouble();
        sample65.setTemperature((double) 1);
        double double70 = sample65.getDateDouble();
        laccan.devices.MicazMsg micazMsg72 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray78 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg72.set_Buffer(shortArray78);
        laccan.devices.Sample sample80 = new laccan.devices.Sample(micazMsg72);
        laccan.devices.Sample sample81 = new laccan.devices.Sample();
        laccan.devices.Type type82 = laccan.devices.Type.FULL;
        sample81.setType(type82);
        sample80.setType(type82);
        double double85 = sample80.getDateDouble();
        double double86 = sample80.getTemperature();
        laccan.devices.Type type87 = sample80.getType();
        sample65.setType(type87);
        sample61.setType(type87);
        sample50.setType(type87);
        sample2.setType(type87);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + laccan.devices.Type.FULL + "'", type24.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + laccan.devices.Type.FULL + "'", type29.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + laccan.devices.Type.FULL + "'", type31.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(sampleList36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(container40);
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-19.648499999999995d) + "'", double56 == (-19.648499999999995d));
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 16.0d + "'", double64 == 16.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray78);
        org.junit.Assert.assertTrue("'" + type82 + "' != '" + laccan.devices.Type.FULL + "'", type82.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-19.648499999999995d) + "'", double86 == (-19.648499999999995d));
        org.junit.Assert.assertTrue("'" + type87 + "' != '" + laccan.devices.Type.FULL + "'", type87.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test168");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1, (long) 512);
        double double10 = sample9.getDateDouble();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 512.0d + "'", double10 == 512.0d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test169");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test170");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(52, (int) (short) -1);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        micazMsg5.amTypeSet(20);
        int int10 = micazMsg5.baseOffset();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg5, 0);
        java.lang.String str13 = micazMsg12.toString();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg15.set_Buffer(shortArray21);
        int int23 = micazMsg15.get_NodeID();
        int int24 = micazMsg15.amType();
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj28 = micazMsg27.clone();
        int int29 = micazMsg27.get_NodeID();
        laccan.devices.Sample sample31 = new laccan.devices.Sample(micazMsg27, (long) (byte) -1);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray34 = micazMsg33.get_Buffer();
        java.lang.Object obj35 = micazMsg33.clone();
        java.lang.String str36 = micazMsg33.toString();
        short[] shortArray37 = micazMsg33.get_Buffer();
        micazMsg27.set_Buffer(shortArray37);
        byte[] byteArray39 = micazMsg27.dataGet();
        micazMsg15.dataSet(byteArray39);
        micazMsg12.dataSet(byteArray39);
        laccan.devices.MicazMsg micazMsg43 = new laccan.devices.MicazMsg(byteArray39, (int) '#');
        try {
            micazMsg2.dataSet(byteArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 172 + "'", int24 == 172);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str36.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertNotNull(byteArray39);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test171");
        laccan.devices.helper.utils.Assistant.reducerType = "reduction";
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test172");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.get_NodeID();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        java.lang.String str10 = sample9.toString();
        java.lang.String str11 = sample9.toString();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(172);
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg13);
        java.lang.String str15 = sample14.getNode();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg17);
        int int20 = micazMsg17.dataLength();
        micazMsg17.init((int) '4');
        laccan.devices.Sample sample23 = new laccan.devices.Sample(micazMsg17);
        double double24 = sample23.getDateDouble();
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray32 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg26.set_Buffer(shortArray32);
        laccan.devices.Sample sample34 = new laccan.devices.Sample(micazMsg26);
        laccan.devices.Sample sample35 = new laccan.devices.Sample();
        laccan.devices.Type type36 = laccan.devices.Type.FULL;
        sample35.setType(type36);
        sample34.setType(type36);
        sample34.setTemperature((double) 'a');
        laccan.devices.Type type41 = sample34.getType();
        sample23.setType(type41);
        laccan.devices.Type type43 = sample23.getType();
        sample14.setType(type43);
        sample9.setType(type43);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null;-19.699999999999996;0" + "'", str10.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null;-19.699999999999996;0" + "'", str11.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertTrue("'" + type36 + "' != '" + laccan.devices.Type.FULL + "'", type36.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type41 + "' != '" + laccan.devices.Type.FULL + "'", type41.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type43 + "' != '" + laccan.devices.Type.FULL + "'", type43.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test173");
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
        java.util.List<java.lang.Double> doubleList18 = laccan.cloud.prediction.Regression.makeTests(sampleList3);
        java.lang.Class<?> wildcardClass19 = sampleList3.getClass();
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(sampleArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(doubleList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test174");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (byte) 100, 0L, 172);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test175");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        sample1.setTemperature((double) 0L);
        java.lang.String[] strArray5 = sample1.toCSV();
        sample1.setTemperature((double) (short) 10);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test176");
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
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray30 = micazMsg29.get_Buffer();
        laccan.devices.Sample sample31 = new laccan.devices.Sample(micazMsg29);
        laccan.devices.Type type32 = sample31.getType();
        double double33 = sample31.getDateDouble();
        memory0.add(sample31);
        memory0.build();
        memory0.build();
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
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNull(type32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test177");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        int int8 = micazMsg7.get_Voltage();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        micazMsg10.set_NodeID(20);
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray17);
        micazMsg10.dataSet(byteArray17);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray17, 0);
        int int22 = micazMsg21.amType();
        micazMsg7.dataSet((net.tinyos.message.Message) micazMsg21, 8);
        java.lang.Class<?> wildcardClass25 = micazMsg21.getClass();
        try {
            micazMsg21.setElement_Buffer(48, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 172 + "'", int22 == 172);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test178");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg4.set_Buffer(shortArray10);
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg4);
        keepingAll0.add(sample12);
        java.util.List<laccan.devices.Sample> sampleList14 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList15 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg17);
        long long21 = sample20.getDate();
        laccan.devices.Type type22 = laccan.devices.Type.FULL;
        sample20.setType(type22);
        sample20.setNode("reduction");
        java.lang.String str26 = sample20.toString();
        sample20.setNode("reduction;-19.699999999999996;0");
        sample20.setTemperature((double) '4');
        keepingAll0.add(sample20);
        java.lang.String[] strArray32 = sample20.toCSV();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(sampleList14);
        org.junit.Assert.assertNotNull(sampleList15);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + laccan.devices.Type.FULL + "'", type22.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "reduction;-19.699999999999996;0" + "'", str26.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray32);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test179");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        java.lang.Class<?> wildcardClass8 = micazMsg1.getClass();
        short short10 = micazMsg1.getElement_Buffer(0);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        java.lang.String str15 = micazMsg12.toString();
        short[] shortArray16 = micazMsg12.get_Buffer();
        byte[] byteArray17 = micazMsg12.dataGet();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray17);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray17, (int) (byte) -1);
        try {
            micazMsg1.dataSet(byteArray17, 160, 8, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str15.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(byteArray17);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test180");
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
        int int14 = memory0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test181");
        laccan.devices.helper.utils.Assistant.reducerType = "null;-19.699999999999996;52";
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test182");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1);
        short[] shortArray8 = micazMsg1.get_Buffer();
        int int9 = micazMsg1.baseOffset();
        try {
            laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 0, data_length 97 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test183");
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
        sample4.setTemperature((double) 4);
        double double14 = sample4.getTemperature();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test184");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        laccan.cloud.prediction.Regression regression2 = new laccan.cloud.prediction.Regression();
        double double3 = regression2.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll4 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList5 = keepingAll4.get();
        laccan.cloud.prediction.Regression regression6 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg8);
        laccan.devices.Sample sample12 = new laccan.devices.Sample();
        laccan.devices.Sample sample13 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray14 = new laccan.devices.Sample[] { sample11, sample12, sample13 };
        java.util.ArrayList<laccan.devices.Sample> sampleList15 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList15, sampleArray14);
        java.util.List<java.lang.Double> doubleList17 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList15);
        java.util.List<java.lang.Double> doubleList18 = regression6.result(doubleList17);
        regression2.init(sampleList5, doubleList17);
        laccan.cloud.prediction.Regression regression20 = new laccan.cloud.prediction.Regression();
        double double21 = regression20.mse();
        double double22 = regression20.mse();
        java.util.List<laccan.devices.Sample> sampleList23 = null;
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray26 = micazMsg25.get_Buffer();
        java.lang.Object obj27 = micazMsg25.clone();
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg25);
        laccan.devices.Sample sample29 = new laccan.devices.Sample();
        laccan.devices.Sample sample30 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray31 = new laccan.devices.Sample[] { sample28, sample29, sample30 };
        java.util.ArrayList<laccan.devices.Sample> sampleList32 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList32, sampleArray31);
        java.util.List<java.lang.Double> doubleList34 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList32);
        regression20.init(sampleList23, doubleList34);
        laccan.cloud.prediction.Regression regression36 = new laccan.cloud.prediction.Regression();
        double double37 = regression36.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll38 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList39 = keepingAll38.get();
        laccan.cloud.prediction.Regression regression40 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray43 = micazMsg42.get_Buffer();
        java.lang.Object obj44 = micazMsg42.clone();
        laccan.devices.Sample sample45 = new laccan.devices.Sample(micazMsg42);
        laccan.devices.Sample sample46 = new laccan.devices.Sample();
        laccan.devices.Sample sample47 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray48 = new laccan.devices.Sample[] { sample45, sample46, sample47 };
        java.util.ArrayList<laccan.devices.Sample> sampleList49 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList49, sampleArray48);
        java.util.List<java.lang.Double> doubleList51 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList49);
        java.util.List<java.lang.Double> doubleList52 = regression40.result(doubleList51);
        regression36.init(sampleList39, doubleList51);
        laccan.cloud.prediction.Regression regression54 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg56 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray57 = micazMsg56.get_Buffer();
        java.lang.Object obj58 = micazMsg56.clone();
        laccan.devices.Sample sample59 = new laccan.devices.Sample(micazMsg56);
        laccan.devices.Sample sample60 = new laccan.devices.Sample();
        laccan.devices.Sample sample61 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray62 = new laccan.devices.Sample[] { sample59, sample60, sample61 };
        java.util.ArrayList<laccan.devices.Sample> sampleList63 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList63, sampleArray62);
        java.util.List<java.lang.Double> doubleList65 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList63);
        java.util.List<java.lang.Double> doubleList66 = regression54.result(doubleList65);
        java.util.List<java.lang.Double> doubleList67 = regression36.result(doubleList65);
        double double68 = regression36.mse();
        laccan.cloud.prediction.Regression regression69 = new laccan.cloud.prediction.Regression();
        double double70 = regression69.mse();
        double double71 = regression69.mse();
        java.util.List<laccan.devices.Sample> sampleList72 = null;
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
        regression69.init(sampleList72, doubleList83);
        java.util.List<java.lang.Double> doubleList85 = regression36.result(doubleList83);
        java.util.List<java.lang.Double> doubleList86 = regression20.result(doubleList85);
        regression0.init(sampleList5, doubleList86);
        java.util.List<java.lang.Double> doubleList88 = laccan.cloud.prediction.Regression.makeTests(sampleList5);
        java.util.List<java.lang.Double> doubleList89 = laccan.cloud.prediction.Regression.makeTests(sampleList5);
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double3, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(sampleArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNotNull(doubleList18);
        org.junit.Assert.assertEquals((double) double21, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double22, Double.NaN, 0);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(sampleArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(doubleList34);
        org.junit.Assert.assertEquals((double) double37, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList39);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(sampleArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(doubleList51);
        org.junit.Assert.assertNotNull(doubleList52);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(sampleArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(doubleList65);
        org.junit.Assert.assertNotNull(doubleList66);
        org.junit.Assert.assertNotNull(doubleList67);
        org.junit.Assert.assertEquals((double) double68, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double70, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double71, Double.NaN, 0);
        org.junit.Assert.assertNotNull(shortArray75);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertNotNull(sampleArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(doubleList83);
        org.junit.Assert.assertNotNull(doubleList85);
        org.junit.Assert.assertNotNull(doubleList86);
        org.junit.Assert.assertNotNull(doubleList88);
        org.junit.Assert.assertNotNull(doubleList89);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test185");
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
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray15, (int) (short) 10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test186");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        micazMsg1.amTypeSet(52);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray10, 48);
        micazMsg1.dataSet(byteArray10);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray10, (int) '#');
        try {
            micazMsg15.set_Voltage((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length -31 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test187");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.lang.String[] strArray10 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV4.save(strArray10);
        java.lang.String[] strArray18 = new java.lang.String[] { "reduction;-19.699999999999996;0", "hi!", "nodes", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n", "memory" };
        storageCSV4.save(strArray18);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg();
        laccan.devices.Sample sample21 = new laccan.devices.Sample(micazMsg20);
        sample21.setTemperature(0.0d);
        java.lang.String[] strArray24 = sample21.toCSV();
        storageCSV4.save(strArray24);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test188");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        int int13 = micazMsg1.get_Voltage();
        micazMsg1.set_Voltage(100);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (-1), (int) (byte) -1);
        java.lang.Object obj19 = micazMsg18.clone();
        try {
            micazMsg18.setElement_Buffer(32, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test189");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        net.tinyos.message.SerialPacket serialPacket6 = micazMsg1.getSerialPacket();
        byte[] byteArray7 = micazMsg1.dataGet();
        short[] shortArray8 = micazMsg1.get_Buffer();
        try {
            short short10 = micazMsg1.getElement_Buffer((-30));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(serialPacket6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(shortArray8);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test190");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.Container container3 = memory0.getMemory();
        laccan.memory.Container container4 = memory0.getMemory();
        int int5 = container4.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test191");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample();
        laccan.devices.Type type11 = laccan.devices.Type.FULL;
        sample10.setType(type11);
        sample9.setType(type11);
        double double14 = sample9.getDateDouble();
        sample9.setTemperature((double) 64);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test192");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 1);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray2, (int) '4');
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test193");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("", (double) (byte) 100, (long) 52);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test194");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        java.lang.Object obj10 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg1);
        int int13 = micazMsg1.get_Voltage();
        micazMsg1.set_Voltage((int) (byte) 0);
        net.tinyos.message.Message message17 = micazMsg1.clone(512);
        short[] shortArray18 = micazMsg1.get_Buffer();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(message17);
        org.junit.Assert.assertNotNull(shortArray18);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test195");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 100);
        micazMsg1.set_NodeID((int) 'a');
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test196");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) 0.0f, (long) (short) 1);
        double double4 = sample3.getDateDouble();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test197");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(0, (-30));
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test198");
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
        int int11 = memory0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test199");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 1, (int) (byte) 10);
        try {
            int int3 = micazMsg2.get_NodeID();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (0) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test200");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(16, 16);
        try {
            short[] shortArray3 = micazMsg2.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (128) or length (16), for data_length 16 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test201");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        java.lang.Object obj8 = micazMsg1.clone();
        byte[] byteArray9 = micazMsg1.dataGet();
        micazMsg1.amTypeSet(32);
        try {
            laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 52, data_length 1 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
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
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test202");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 1);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        byte[] byteArray7 = micazMsg6.dataGet();
        try {
            laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, 16, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 16, data_length 6 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test203");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) 'a', (int) '#');
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test204");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(16, 32);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test205");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 10, (int) (short) -1);
        try {
            laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (80) or length (16), for data_length 10 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test206");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        short short12 = micazMsg1.getElement_Buffer(0);
        net.tinyos.message.Message message14 = micazMsg1.clone((int) (byte) 100);
        net.tinyos.message.Message message16 = message14.clone(32);
        net.tinyos.message.Message message18 = message14.clone(0);
        java.lang.Object obj19 = message18.clone();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(message16);
        org.junit.Assert.assertNotNull(message18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test207");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 10, 10);
        micazMsg2.set_NodeID((int) 'a');
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test208");
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
        int int19 = memory0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(container18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test209");
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
        int int20 = micazMsg19.baseOffset();
        try {
            short[] shortArray21 = micazMsg19.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length -48 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test210");
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
        try {
            short[] shortArray29 = micazMsg28.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
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
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test211");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        micazMsg1.set_Voltage(0);
        int int13 = micazMsg1.baseOffset();
        java.lang.Object obj14 = micazMsg1.clone();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test212");
        laccan.devices.helper.utils.Assistant.predictorType = "nodes";
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test213");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) (byte) 100);
        micazMsg1.amTypeSet(2);
        int int9 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) '4');
        int int12 = micazMsg1.get_Voltage();
        try {
            laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 97, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test214");
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
        laccan.memory.data.reduction.KeepingAll keepingAll11 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample12 = new laccan.devices.Sample();
        keepingAll11.add(sample12);
        sample12.setTemperature((double) 0L);
        java.lang.String[] strArray16 = sample12.toCSV();
        memory0.add(sample12);
        laccan.devices.Type type18 = sample12.getType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNull(type18);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test215");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        net.tinyos.message.Message message14 = micazMsg1.clone(24);
        int int15 = micazMsg1.baseOffset();
        micazMsg1.set_NodeID(52);
        try {
            micazMsg1.setElement_Buffer((-139), (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test216");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        short[] shortArray5 = micazMsg2.get_Buffer();
        int int6 = micazMsg2.baseOffset();
        byte[] byteArray7 = micazMsg2.dataGet();
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test217");
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
        java.util.List<laccan.devices.Sample> sampleList37 = keepingAll0.get();
        laccan.devices.Sample sample38 = new laccan.devices.Sample();
        laccan.devices.Type type39 = laccan.devices.Type.FULL;
        sample38.setType(type39);
        double double41 = sample38.getDateDouble();
        sample38.setDate((long) 100);
        keepingAll0.add(sample38);
        laccan.memory.Memory memory45 = new laccan.memory.Memory();
        memory45.build();
        memory45.build();
        int int48 = memory45.length();
        java.lang.Class<?> wildcardClass49 = memory45.getClass();
        laccan.devices.MicazMsg micazMsg51 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray52 = micazMsg51.get_Buffer();
        java.lang.Object obj53 = micazMsg51.clone();
        laccan.devices.Sample sample54 = new laccan.devices.Sample(micazMsg51);
        long long55 = sample54.getDate();
        laccan.devices.Type type56 = laccan.devices.Type.FULL;
        sample54.setType(type56);
        sample54.setNode("reduction");
        java.lang.String str60 = sample54.toString();
        java.lang.String str61 = sample54.toString();
        memory45.add(sample54);
        keepingAll0.add(sample54);
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
        org.junit.Assert.assertNotNull(sampleList37);
        org.junit.Assert.assertTrue("'" + type39 + "' != '" + laccan.devices.Type.FULL + "'", type39.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + type56 + "' != '" + laccan.devices.Type.FULL + "'", type56.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "reduction;-19.699999999999996;0" + "'", str60.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "reduction;-19.699999999999996;0" + "'", str61.equals("reduction;-19.699999999999996;0"));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test218");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        net.tinyos.message.SerialPacket serialPacket3 = micazMsg2.getSerialPacket();
        org.junit.Assert.assertNull(serialPacket3);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test219");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        int int13 = micazMsg1.get_Voltage();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        micazMsg15.set_NodeID(20);
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray22);
        micazMsg15.dataSet(byteArray22);
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray22, 0);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray22, 10);
        micazMsg1.dataSet(byteArray22);
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray22);
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray33 = micazMsg32.get_Buffer();
        laccan.devices.Sample sample34 = new laccan.devices.Sample(micazMsg32);
        int int35 = micazMsg32.get_NodeID();
        byte[] byteArray36 = micazMsg32.dataGet();
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg(byteArray36);
        micazMsg30.dataSet(byteArray36, 8, (int) (byte) 0, 0);
        int int42 = micazMsg30.amType();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 172 + "'", int42 == 172);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test220");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        byte[] byteArray7 = micazMsg1.dataGet();
        try {
            laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, 10, 512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 10, data_length 512 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test221");
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
        int int37 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg39 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray40 = micazMsg39.get_Buffer();
        laccan.devices.Sample sample41 = new laccan.devices.Sample(micazMsg39);
        laccan.devices.Sample sample43 = new laccan.devices.Sample(micazMsg39, (long) (short) 10);
        java.lang.String str44 = sample43.getNode();
        java.lang.String str45 = sample43.getNode();
        long long46 = sample43.getDate();
        double double47 = sample43.getTemperature();
        sample43.setNode("hi!");
        double double50 = sample43.getTemperature();
        keepingAll0.add(sample43);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-19.699999999999996d) + "'", double47 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-19.699999999999996d) + "'", double50 == (-19.699999999999996d));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test222");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.dataLength();
        net.tinyos.message.SerialPacket serialPacket3 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (byte) 10);
        short short7 = micazMsg1.getElement_Buffer(4);
        try {
            micazMsg1.setElement_Buffer(24, (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNull(serialPacket3);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test223");
        net.tinyos.message.Message message0 = null;
        try {
            laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(message0, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test224");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        int int5 = micazMsg2.dataLength();
        int int6 = micazMsg2.amType();
        try {
            micazMsg2.setElement_Buffer((-139), (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test225");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (byte) 1, (int) (byte) 100);
        try {
            micazMsg2.setElement_Buffer(64, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test226");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        int int8 = micazMsg1.get_NodeID();
        net.tinyos.message.SerialPacket serialPacket9 = micazMsg1.getSerialPacket();
        short[] shortArray10 = micazMsg1.get_Buffer();
        java.lang.Object obj11 = micazMsg1.clone();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(serialPacket9);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test227");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 100, (long) 4, 0);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test228");
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
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray12, 0);
        try {
            short[] shortArray19 = micazMsg18.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray12);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test229");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(10, (int) (short) 100);
        try {
            short[] shortArray3 = micazMsg2.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (80) or length (16), for data_length 10 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test230");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        java.lang.Object obj8 = micazMsg1.clone();
        int int9 = micazMsg1.get_Voltage();
        net.tinyos.message.Message message11 = micazMsg1.clone(64);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(message11);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test231");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(1, (int) (byte) -1);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test232");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        int int11 = micazMsg1.dataLength();
        int int12 = micazMsg1.get_NodeID();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 256 + "'", int12 == 256);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test233");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        int int3 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList4 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg6.set_Buffer(shortArray12);
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg6);
        java.lang.String[] strArray15 = sample14.toCSV();
        java.lang.String str16 = sample14.getNode();
        keepingAll0.add(sample14);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = micazMsg19.get_Buffer();
        java.lang.Object obj21 = micazMsg19.clone();
        laccan.devices.Sample sample22 = new laccan.devices.Sample(micazMsg19);
        long long23 = sample22.getDate();
        java.lang.Class<?> wildcardClass24 = sample22.getClass();
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray27 = micazMsg26.get_Buffer();
        java.lang.Object obj28 = micazMsg26.clone();
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg26);
        long long30 = sample29.getDate();
        laccan.devices.Type type31 = laccan.devices.Type.FULL;
        sample29.setType(type31);
        sample22.setType(type31);
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray41 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg35.set_Buffer(shortArray41);
        laccan.devices.Sample sample43 = new laccan.devices.Sample(micazMsg35);
        laccan.devices.Sample sample44 = new laccan.devices.Sample();
        laccan.devices.Type type45 = laccan.devices.Type.FULL;
        sample44.setType(type45);
        sample43.setType(type45);
        sample22.setType(type45);
        keepingAll0.add(sample22);
        int int50 = keepingAll0.length();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + laccan.devices.Type.FULL + "'", type31.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertTrue("'" + type45 + "' != '" + laccan.devices.Type.FULL + "'", type45.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test234");
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
        java.lang.String str30 = sample20.toString();
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray33 = micazMsg32.get_Buffer();
        java.lang.Object obj34 = micazMsg32.clone();
        laccan.devices.Sample sample35 = new laccan.devices.Sample(micazMsg32);
        long long36 = sample35.getDate();
        java.lang.String str37 = sample35.getNode();
        long long38 = sample35.getDate();
        laccan.memory.data.reduction.KeepingAll keepingAll39 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList40 = keepingAll39.get();
        int int41 = keepingAll39.length();
        java.util.List<laccan.devices.Sample> sampleList42 = keepingAll39.get();
        laccan.devices.MicazMsg micazMsg44 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray45 = micazMsg44.get_Buffer();
        java.lang.Object obj46 = micazMsg44.clone();
        laccan.devices.Sample sample47 = new laccan.devices.Sample(micazMsg44);
        laccan.devices.Type type48 = null;
        sample47.setType(type48);
        laccan.devices.Type type50 = null;
        sample47.setType(type50);
        sample47.setNode("hi!");
        keepingAll39.add(sample47);
        laccan.devices.Type type55 = sample47.getType();
        java.lang.String[] strArray56 = sample47.toCSV();
        laccan.devices.MicazMsg micazMsg58 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray64 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg58.set_Buffer(shortArray64);
        laccan.devices.Sample sample66 = new laccan.devices.Sample(micazMsg58);
        laccan.devices.Sample sample67 = new laccan.devices.Sample();
        laccan.devices.Type type68 = laccan.devices.Type.FULL;
        sample67.setType(type68);
        sample66.setType(type68);
        sample47.setType(type68);
        sample35.setType(type68);
        sample20.setType(type68);
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
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "null;-19.699999999999996;0" + "'", str30.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(sampleList40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(sampleList42);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNull(type55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertTrue("'" + type68 + "' != '" + laccan.devices.Type.FULL + "'", type68.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test235");
        int int1 = laccan.devices.MicazMsg.offset_Buffer(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test236");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) '#', (int) '#');
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test237");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 10);
        micazMsg9.set_NodeID(20);
        net.tinyos.message.Message message13 = micazMsg9.clone((int) (byte) 10);
        int int14 = micazMsg9.baseOffset();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = micazMsg16.get_Buffer();
        micazMsg16.set_NodeID((int) (byte) -1);
        byte[] byteArray20 = micazMsg16.dataGet();
        micazMsg9.dataSet(byteArray20);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(message13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(byteArray20);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test238");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests(10L, (long) '#', (int) (short) 1);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test239");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        micazMsg1.set_NodeID((int) (byte) -1);
        java.lang.String str7 = micazMsg1.toString();
        short[] shortArray8 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        micazMsg1.init(2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray8);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test240");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("hi!;-19.699999999999996;0", (double) 48, (long) '#');
        java.lang.String str4 = sample3.getNode();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!;-19.699999999999996;0" + "'", str4.equals("hi!;-19.699999999999996;0"));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test241");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) (byte) 100);
        micazMsg1.amTypeSet(2);
        int int9 = micazMsg1.get_NodeID();
        int int10 = micazMsg1.get_NodeID();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test242");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1);
        sample7.setNode("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test243");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        int int3 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList4 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        micazMsg6.amTypeSet(20);
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg6);
        java.lang.Object obj12 = micazMsg6.clone();
        net.tinyos.message.Message message14 = micazMsg6.clone((int) ' ');
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg6);
        keepingAll0.add(sample15);
        java.util.List<laccan.devices.Sample> sampleList17 = keepingAll0.get();
        int int18 = keepingAll0.length();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(sampleList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test244");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.dataLength();
        net.tinyos.message.SerialPacket serialPacket3 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (byte) 10);
        short short7 = micazMsg1.getElement_Buffer(4);
        int int8 = micazMsg1.get_NodeID();
        java.lang.String str9 = micazMsg1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNull(serialPacket3);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test245");
        try {
            laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((-139), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test246");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 10);
        net.tinyos.message.Message message11 = micazMsg9.clone(0);
        int int12 = micazMsg9.amType();
        int int13 = micazMsg9.dataLength();
        short[] shortArray14 = micazMsg9.get_Buffer();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(message11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 172 + "'", int12 == 172);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 24 + "'", int13 == 24);
        org.junit.Assert.assertNotNull(shortArray14);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test247");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test248");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test249");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        int int9 = micazMsg1.dataLength();
        net.tinyos.message.SerialPacket serialPacket10 = micazMsg1.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNull(serialPacket10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test250");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        net.tinyos.message.Message message14 = micazMsg1.clone(24);
        micazMsg1.amTypeSet(0);
        int int17 = micazMsg1.amType();
        java.lang.String str18 = micazMsg1.toString();
        try {
            short[] shortArray19 = micazMsg1.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (128) or length (16), for data_length 16 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 " + "'", str18.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 "));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test251");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray5 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray5, 0, (int) (byte) 1);
        java.lang.Object obj9 = micazMsg8.clone();
        int int10 = micazMsg8.amType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 172 + "'", int10 == 172);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test252");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(24, 0);
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg2, 1L);
        java.lang.String str5 = sample4.toString();
        java.lang.String[] strArray6 = sample4.toCSV();
        sample4.setDate(10L);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null;-19.699999999999996;1" + "'", str5.equals("null;-19.699999999999996;1"));
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test253");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(1, (int) (byte) 1);
        net.tinyos.message.Message message4 = micazMsg2.clone(10);
        java.lang.String str5 = micazMsg2.toString();
        try {
            short short7 = micazMsg2.getElement_Buffer((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (48) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(message4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str5.equals("Message <MicazMsg> \n  [Buffer="));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test254");
        net.tinyos.message.Message message0 = null;
        try {
            laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(message0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test255");
        laccan.devices.helper.utils.Assistant.reducerType = "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n";
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test256");
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
        int int18 = micazMsg1.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test257");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 100);
        micazMsg1.amTypeSet(10);
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        double double14 = sample13.getTemperature();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-19.699999999999996d) + "'", double14 == (-19.699999999999996d));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test258");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(24, 64);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test259");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(256, 52);
        byte[] byteArray3 = micazMsg2.dataGet();
        micazMsg2.setElement_Buffer((int) (short) 1, (short) (byte) 10);
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test260");
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
        java.lang.String str30 = sample20.toString();
        java.lang.String str31 = sample20.getNode();
        sample20.setNode("null;0.0;512");
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray36 = micazMsg35.get_Buffer();
        java.lang.Object obj37 = micazMsg35.clone();
        laccan.devices.Sample sample38 = new laccan.devices.Sample(micazMsg35);
        long long39 = sample38.getDate();
        laccan.devices.Type type40 = laccan.devices.Type.FULL;
        sample38.setType(type40);
        sample38.setNode("reduction");
        java.lang.String str44 = sample38.toString();
        sample38.setNode("reduction;-19.699999999999996;0");
        sample38.setTemperature((double) '4');
        laccan.devices.MicazMsg micazMsg50 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray51 = micazMsg50.get_Buffer();
        java.lang.Object obj52 = micazMsg50.clone();
        laccan.devices.Sample sample53 = new laccan.devices.Sample(micazMsg50);
        long long54 = sample53.getDate();
        laccan.devices.Type type55 = laccan.devices.Type.FULL;
        sample53.setType(type55);
        sample53.setNode("reduction");
        java.lang.Class<?> wildcardClass59 = sample53.getClass();
        laccan.devices.Type type60 = sample53.getType();
        sample38.setType(type60);
        sample20.setType(type60);
        sample20.setNode("Message <MicazMsg> \n  [NodeID=0x6401]\n  [Voltage=0x0]\n  [Buffer=0x1 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n");
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
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "null;-19.699999999999996;0" + "'", str30.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + type40 + "' != '" + laccan.devices.Type.FULL + "'", type40.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "reduction;-19.699999999999996;0" + "'", str44.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + type55 + "' != '" + laccan.devices.Type.FULL + "'", type55.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + type60 + "' != '" + laccan.devices.Type.FULL + "'", type60.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test261");
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
        double double52 = regression0.mse();
        try {
            java.util.List<java.lang.Double> doubleList53 = regression0.result();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
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
        org.junit.Assert.assertEquals((double) double52, Double.NaN, 0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test262");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("reduction;-19.699999999999996;0", (double) 0, (long) (byte) 0);
        double double4 = sample3.getTemperature();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test263");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        micazMsg1.amTypeSet(0);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg14.set_Buffer(shortArray20);
        int int22 = micazMsg14.get_NodeID();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray25);
        micazMsg14.dataSet((net.tinyos.message.Message) micazMsg26, (int) (byte) 0);
        micazMsg14.set_Voltage((int) (short) 1);
        int int31 = micazMsg14.dataLength();
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg14, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test264");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 4);
        java.lang.String str5 = micazMsg1.toString();
        net.tinyos.message.SerialPacket serialPacket6 = micazMsg1.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str5.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNull(serialPacket6);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test265");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        micazMsg1.set_Voltage(20);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        micazMsg12.amTypeSet(20);
        laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg12);
        java.lang.Object obj18 = micazMsg12.clone();
        net.tinyos.message.Message message20 = micazMsg12.clone((int) ' ');
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray23, 16);
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray23);
        message20.dataSet(byteArray23);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray23, (int) ' ');
        try {
            micazMsg1.dataSet(byteArray23, 6, 48, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(message20);
        org.junit.Assert.assertNotNull(byteArray23);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test266");
        laccan.devices.helper.utils.Assistant.reducerType = "memory;-19.699999999999996;-1";
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test267");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 512);
        micazMsg2.set_Voltage(16);
        micazMsg2.init(100);
        int int11 = micazMsg2.dataLength();
        java.lang.Class<?> wildcardClass12 = micazMsg2.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test268");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        memory0.build();
        memory0.build();
        int int5 = memory0.length();
        laccan.memory.Container container6 = memory0.getMemory();
        java.util.List<laccan.devices.Sample> sampleList7 = container6.get();
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(container6);
        org.junit.Assert.assertNotNull(sampleList7);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test269");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test270");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        int int5 = micazMsg2.dataLength();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 4);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg9, 0);
        short[] shortArray12 = micazMsg9.get_Buffer();
        micazMsg2.set_Buffer(shortArray12);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        java.lang.String str18 = micazMsg15.toString();
        short[] shortArray19 = micazMsg15.get_Buffer();
        byte[] byteArray20 = micazMsg15.dataGet();
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray20);
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray20);
        java.lang.Object obj23 = micazMsg22.clone();
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray26 = micazMsg25.get_Buffer();
        java.lang.Object obj27 = micazMsg25.clone();
        micazMsg25.set_NodeID(20);
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg(byteArray32);
        micazMsg25.dataSet(byteArray32);
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg(byteArray32, 0);
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg(byteArray32, 3);
        laccan.devices.MicazMsg micazMsg40 = new laccan.devices.MicazMsg(byteArray32, 32);
        micazMsg22.dataSet(byteArray32);
        try {
            micazMsg2.dataSet(byteArray32, (-139), 20, 160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str18.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(byteArray32);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test271");
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
        java.util.List<laccan.devices.Sample> sampleList56 = storageCSV10.read();
        laccan.persistence.StorageCSV storageCSV58 = storageCSV10.local("null;0.0;512");
        laccan.persistence.StorageCSV storageCSV59 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV61 = storageCSV59.local("hi!");
        java.lang.String[] strArray63 = new java.lang.String[] { "result" };
        storageCSV59.save(strArray63);
        laccan.persistence.StorageCSV storageCSV66 = storageCSV59.local("nodes");
        laccan.persistence.StorageCSV storageCSV67 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV69 = storageCSV67.local("hi!");
        laccan.persistence.StorageCSV storageCSV70 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray71 = new java.lang.String[] {};
        storageCSV70.save(strArray71);
        storageCSV67.save(strArray71);
        laccan.persistence.StorageCSV storageCSV75 = storageCSV67.local("nodes");
        laccan.persistence.StorageCSV storageCSV77 = storageCSV67.local("init");
        java.util.List<laccan.devices.Sample> sampleList78 = storageCSV67.read();
        laccan.devices.Sample sample82 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=", Double.NaN, (long) '#');
        java.lang.String[] strArray83 = sample82.toCSV();
        storageCSV67.save(strArray83);
        storageCSV66.save(strArray83);
        storageCSV10.save(strArray83);
        java.util.List<laccan.devices.Sample> sampleList87 = storageCSV10.read();
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
        org.junit.Assert.assertNotNull(sampleList56);
        org.junit.Assert.assertNotNull(storageCSV58);
        org.junit.Assert.assertNotNull(storageCSV61);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(storageCSV66);
        org.junit.Assert.assertNotNull(storageCSV69);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(storageCSV75);
        org.junit.Assert.assertNotNull(storageCSV77);
        org.junit.Assert.assertNotNull(sampleList78);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(sampleList87);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test272");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(24, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test273");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray5 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray5);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        int int11 = micazMsg8.get_NodeID();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray14);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray14, 2);
        micazMsg8.dataSet(byteArray14);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray14);
        micazMsg6.dataSet(byteArray14);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray14);
        micazMsg21.amTypeSet(0);
        try {
            laccan.devices.Sample sample24 = new laccan.devices.Sample(micazMsg21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test274");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        micazMsg1.set_NodeID((int) (byte) -1);
        java.lang.String str7 = micazMsg1.toString();
        short[] shortArray8 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        micazMsg1.set_NodeID(512);
        micazMsg1.amTypeSet((int) (byte) 100);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray8);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test275");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray3, (int) (byte) -1, (int) (byte) -1);
        micazMsg6.init(1);
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test276");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        int int5 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) '#', (int) (short) 1);
        micazMsg8.init((int) (short) 100);
        int int11 = micazMsg8.get_NodeID();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test277");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=", Double.NaN, (long) '#');
        sample3.setNode("full_memory");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test278");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("", (double) 172, (long) (byte) -1);
        sample3.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;10.0;35");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test279");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 512);
        micazMsg2.set_Voltage(16);
        byte[] byteArray9 = micazMsg2.dataGet();
        int int10 = micazMsg2.amType();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test280");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(52, 4);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test281");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        laccan.memory.data.reduction.KeepingAll keepingAll7 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList8 = keepingAll7.get();
        int int9 = keepingAll7.length();
        java.util.List<laccan.devices.Sample> sampleList10 = keepingAll7.get();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg12);
        laccan.devices.Type type16 = null;
        sample15.setType(type16);
        laccan.devices.Type type18 = null;
        sample15.setType(type18);
        sample15.setNode("hi!");
        keepingAll7.add(sample15);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray25 = micazMsg24.get_Buffer();
        java.lang.Object obj26 = micazMsg24.clone();
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg24);
        laccan.devices.Type type28 = null;
        sample27.setType(type28);
        java.lang.String str30 = sample27.toString();
        java.lang.String str31 = sample27.getNode();
        keepingAll7.add(sample27);
        laccan.devices.Sample sample33 = new laccan.devices.Sample();
        laccan.devices.Type type34 = laccan.devices.Type.FULL;
        sample33.setType(type34);
        sample27.setType(type34);
        double double37 = sample27.getTemperature();
        laccan.devices.MicazMsg micazMsg39 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray40 = micazMsg39.get_Buffer();
        java.lang.Object obj41 = micazMsg39.clone();
        laccan.devices.Sample sample42 = new laccan.devices.Sample(micazMsg39);
        long long43 = sample42.getDate();
        laccan.devices.Type type44 = laccan.devices.Type.FULL;
        sample42.setType(type44);
        sample27.setType(type44);
        sample4.setType(type44);
        double double48 = sample4.getDateDouble();
        sample4.setTemperature((double) 100);
        long long51 = sample4.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(sampleList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(sampleList10);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "null;-19.699999999999996;0" + "'", str30.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + type34 + "' != '" + laccan.devices.Type.FULL + "'", type34.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-19.699999999999996d) + "'", double37 == (-19.699999999999996d));
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + type44 + "' != '" + laccan.devices.Type.FULL + "'", type44.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test282");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        net.tinyos.message.Message message6 = micazMsg2.clone((int) '4');
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        micazMsg8.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg8, (int) (byte) 0);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = micazMsg16.get_Buffer();
        java.lang.Object obj18 = micazMsg16.clone();
        micazMsg16.set_NodeID(20);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray23);
        micazMsg16.dataSet(byteArray23);
        micazMsg8.dataSet(byteArray23);
        micazMsg2.dataSet(byteArray23);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray23);
        net.tinyos.message.Message message30 = micazMsg28.clone(0);
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(message30);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test283");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(1, (int) (byte) 1);
        net.tinyos.message.Message message4 = micazMsg2.clone(10);
        java.lang.String str5 = micazMsg2.toString();
        java.lang.String str6 = micazMsg2.toString();
        org.junit.Assert.assertNotNull(message4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str5.equals("Message <MicazMsg> \n  [Buffer="));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str6.equals("Message <MicazMsg> \n  [Buffer="));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test284");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type4 = sample3.getType();
        sample3.setDate((long) (byte) 1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(type4);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test285");
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
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray7);
        try {
            laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray7, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 100, data_length 52 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test286");
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
        regression0.train();
        regression0.train();
        laccan.cloud.prediction.Regression regression54 = new laccan.cloud.prediction.Regression();
        double double55 = regression54.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll56 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList57 = keepingAll56.get();
        laccan.cloud.prediction.Regression regression58 = new laccan.cloud.prediction.Regression();
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
        java.util.List<java.lang.Double> doubleList70 = regression58.result(doubleList69);
        regression54.init(sampleList57, doubleList69);
        java.util.List<java.lang.Double> doubleList72 = regression0.result(doubleList69);
        double double73 = regression0.mse();
        double double74 = regression0.mse();
        regression0.train();
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
        org.junit.Assert.assertEquals((double) double55, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList57);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNotNull(sampleArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(doubleList69);
        org.junit.Assert.assertNotNull(doubleList70);
        org.junit.Assert.assertNotNull(doubleList72);
        org.junit.Assert.assertEquals((double) double73, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double74, Double.NaN, 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test287");
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
        try {
            int int33 = micazMsg32.get_NodeID();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (0) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test288");
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
        java.lang.String str49 = sample34.toString();
        long long50 = sample34.getDate();
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
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + ";-19.699999999999996;0" + "'", str49.equals(";-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test289");
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
        try {
            regression0.train();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
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
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test290");
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
        laccan.persistence.StorageCSV storageCSV40 = new laccan.persistence.StorageCSV();
        java.util.List<laccan.devices.Sample> sampleList41 = storageCSV40.read();
        laccan.cloud.prediction.Regression regression42 = new laccan.cloud.prediction.Regression();
        double double43 = regression42.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll44 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList45 = keepingAll44.get();
        laccan.cloud.prediction.Regression regression46 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg48 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray49 = micazMsg48.get_Buffer();
        java.lang.Object obj50 = micazMsg48.clone();
        laccan.devices.Sample sample51 = new laccan.devices.Sample(micazMsg48);
        laccan.devices.Sample sample52 = new laccan.devices.Sample();
        laccan.devices.Sample sample53 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray54 = new laccan.devices.Sample[] { sample51, sample52, sample53 };
        java.util.ArrayList<laccan.devices.Sample> sampleList55 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList55, sampleArray54);
        java.util.List<java.lang.Double> doubleList57 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList55);
        java.util.List<java.lang.Double> doubleList58 = regression46.result(doubleList57);
        regression42.init(sampleList45, doubleList57);
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
        laccan.cloud.prediction.Regression regression78 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg80 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray81 = micazMsg80.get_Buffer();
        java.lang.Object obj82 = micazMsg80.clone();
        laccan.devices.Sample sample83 = new laccan.devices.Sample(micazMsg80);
        laccan.devices.Sample sample84 = new laccan.devices.Sample();
        laccan.devices.Sample sample85 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray86 = new laccan.devices.Sample[] { sample83, sample84, sample85 };
        java.util.ArrayList<laccan.devices.Sample> sampleList87 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList87, sampleArray86);
        java.util.List<java.lang.Double> doubleList89 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList87);
        java.util.List<java.lang.Double> doubleList90 = regression78.result(doubleList89);
        regression42.init(sampleList63, doubleList90);
        double double92 = regression42.mse();
        java.util.List<java.lang.Double> doubleList93 = regression42.result();
        regression0.init(sampleList41, doubleList93);
        java.util.List<java.lang.Double> doubleList95 = laccan.cloud.prediction.Regression.makeTests(sampleList41);
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
        org.junit.Assert.assertNotNull(sampleList41);
        org.junit.Assert.assertEquals((double) double43, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList45);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(sampleArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(doubleList57);
        org.junit.Assert.assertNotNull(doubleList58);
        org.junit.Assert.assertEquals((double) double61, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList63);
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNotNull(sampleArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(doubleList75);
        org.junit.Assert.assertNotNull(doubleList76);
        org.junit.Assert.assertNotNull(shortArray81);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertNotNull(sampleArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(doubleList89);
        org.junit.Assert.assertNotNull(doubleList90);
        org.junit.Assert.assertEquals((double) double92, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList93);
        org.junit.Assert.assertNotNull(doubleList95);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test291");
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
        laccan.persistence.StorageCSV storageCSV59 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV61 = storageCSV59.local("hi!");
        laccan.persistence.StorageCSV storageCSV63 = storageCSV61.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList64 = storageCSV63.read();
        laccan.persistence.StorageCSV storageCSV66 = storageCSV63.local("init");
        laccan.persistence.StorageCSV storageCSV68 = storageCSV63.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList69 = storageCSV63.read();
        java.util.List<java.lang.Double> doubleList70 = laccan.cloud.prediction.Regression.makeTests(sampleList69);
        laccan.cloud.prediction.Regression regression71 = new laccan.cloud.prediction.Regression();
        double double72 = regression71.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll73 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList74 = keepingAll73.get();
        laccan.cloud.prediction.Regression regression75 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg77 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray78 = micazMsg77.get_Buffer();
        java.lang.Object obj79 = micazMsg77.clone();
        laccan.devices.Sample sample80 = new laccan.devices.Sample(micazMsg77);
        laccan.devices.Sample sample81 = new laccan.devices.Sample();
        laccan.devices.Sample sample82 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray83 = new laccan.devices.Sample[] { sample80, sample81, sample82 };
        java.util.ArrayList<laccan.devices.Sample> sampleList84 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList84, sampleArray83);
        java.util.List<java.lang.Double> doubleList86 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList84);
        java.util.List<java.lang.Double> doubleList87 = regression75.result(doubleList86);
        regression71.init(sampleList74, doubleList86);
        double double89 = regression71.mse();
        java.util.List<java.lang.Double> doubleList90 = regression71.result();
        java.util.List<java.lang.Double> doubleList91 = regression71.result();
        regression0.init(sampleList69, doubleList91);
        java.util.List<java.lang.Double> doubleList93 = laccan.cloud.prediction.Regression.makeTests(sampleList69);
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
        org.junit.Assert.assertNotNull(storageCSV61);
        org.junit.Assert.assertNotNull(storageCSV63);
        org.junit.Assert.assertNotNull(sampleList64);
        org.junit.Assert.assertNotNull(storageCSV66);
        org.junit.Assert.assertNotNull(storageCSV68);
        org.junit.Assert.assertNotNull(sampleList69);
        org.junit.Assert.assertNotNull(doubleList70);
        org.junit.Assert.assertEquals((double) double72, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList74);
        org.junit.Assert.assertNotNull(shortArray78);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertNotNull(sampleArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(doubleList86);
        org.junit.Assert.assertNotNull(doubleList87);
        org.junit.Assert.assertEquals((double) double89, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList90);
        org.junit.Assert.assertNotNull(doubleList91);
        org.junit.Assert.assertNotNull(doubleList93);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test292");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test293");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        java.lang.String str7 = sample4.toString();
        sample4.setTemperature((double) (short) 10);
        java.lang.String[] strArray10 = sample4.toCSV();
        double double11 = sample4.getTemperature();
        double double12 = sample4.getDateDouble();
        java.lang.String str13 = sample4.getNode();
        sample4.setDate((long) 172);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null;-19.699999999999996;0" + "'", str7.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test294");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 100);
        sample10.setDate(3L);
        sample10.setNode("");
        laccan.devices.Type type15 = sample10.getType();
        double double16 = sample10.getDateDouble();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(type15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.0d + "'", double16 == 3.0d);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test295");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray6);
        int int9 = micazMsg8.get_Voltage();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg8, (long) 4);
        double double12 = sample11.getDateDouble();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test296");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        micazMsg1.amTypeSet(52);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray10, 48);
        micazMsg1.dataSet(byteArray10);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg15.set_Buffer(shortArray21);
        int int23 = micazMsg15.get_NodeID();
        micazMsg15.amTypeSet((int) ' ');
        micazMsg15.set_NodeID((int) ' ');
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg15, 0);
        laccan.devices.Sample sample30 = new laccan.devices.Sample(micazMsg15);
        long long31 = sample30.getDate();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test297");
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
        sample4.setTemperature((double) (short) -1);
        java.lang.String str13 = sample4.toString();
        java.lang.String str14 = sample4.getNode();
        long long15 = sample4.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null;-19.699999999999996;0" + "'", str9.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null;-19.699999999999996;0" + "'", str10.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null;-1.0;0" + "'", str13.equals("null;-1.0;0"));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test298");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("init", (double) 100.0f, (long) 32);
        sample3.setNode("reduction;-19.699999999999996;0");
        long long6 = sample3.getDate();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test299");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        byte[] byteArray7 = micazMsg1.dataGet();
        try {
            laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 65535, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test300");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg(byteArray2, 16);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        int int7 = micazMsg6.amType();
        try {
            laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 172 + "'", int7 == 172);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test301");
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
        laccan.memory.Memory memory18 = new laccan.memory.Memory();
        memory18.build();
        memory18.build();
        int int21 = memory18.length();
        int int22 = memory18.length();
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray25 = micazMsg24.get_Buffer();
        java.lang.Object obj26 = micazMsg24.clone();
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg24);
        laccan.devices.Type type28 = null;
        sample27.setType(type28);
        laccan.devices.Type type30 = null;
        sample27.setType(type30);
        sample27.setNode("hi!");
        memory18.add(sample27);
        int int35 = memory18.length();
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray38 = micazMsg37.get_Buffer();
        java.lang.Object obj39 = micazMsg37.clone();
        java.lang.String str40 = micazMsg37.toString();
        short[] shortArray41 = micazMsg37.get_Buffer();
        byte[] byteArray42 = micazMsg37.dataGet();
        java.lang.Object obj43 = micazMsg37.clone();
        laccan.devices.Sample sample44 = new laccan.devices.Sample(micazMsg37);
        int int45 = micazMsg37.dataLength();
        int int46 = micazMsg37.baseOffset();
        laccan.devices.Sample sample47 = new laccan.devices.Sample(micazMsg37);
        double double48 = sample47.getDateDouble();
        memory18.add(sample47);
        memory0.add(sample47);
        laccan.devices.MicazMsg micazMsg52 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray58 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg52.set_Buffer(shortArray58);
        laccan.devices.Sample sample60 = new laccan.devices.Sample(micazMsg52);
        laccan.devices.Sample sample61 = new laccan.devices.Sample();
        laccan.devices.Type type62 = laccan.devices.Type.FULL;
        sample61.setType(type62);
        sample60.setType(type62);
        sample60.setTemperature((double) 'a');
        laccan.devices.Type type67 = sample60.getType();
        sample47.setType(type67);
        long long69 = sample47.getDate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "reduction;-19.699999999999996;0" + "'", str15.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "reduction;-19.699999999999996;0" + "'", str16.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str40.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertTrue("'" + type62 + "' != '" + laccan.devices.Type.FULL + "'", type62.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type67 + "' != '" + laccan.devices.Type.FULL + "'", type67.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test302");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (byte) 100, 0L, (int) (byte) -1);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test303");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        micazMsg1.amTypeSet(512);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, 32);
        short short12 = micazMsg10.getElement_Buffer((int) (short) 0);
        int int13 = micazMsg10.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test304");
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
        regression0.train();
        regression0.train();
        regression0.train();
        double double55 = regression0.mse();
        try {
            java.util.List<java.lang.Double> doubleList56 = regression0.result();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
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
        org.junit.Assert.assertEquals((double) double55, Double.NaN, 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test305");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        micazMsg1.set_Voltage((int) (short) 1);
        int int18 = micazMsg1.dataLength();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg20, 4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = micazMsg20.getClass();
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg20, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test306");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(100, (int) (short) 1);
        java.lang.String str3 = micazMsg2.toString();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, 100L);
        byte[] byteArray6 = micazMsg2.dataGet();
        net.tinyos.message.SerialPacket serialPacket7 = micazMsg2.getSerialPacket();
        micazMsg2.set_NodeID((int) ' ');
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str3.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNull(serialPacket7);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test307");
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
        try {
            micazMsg1.setElement_Buffer(24, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test308");
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
        java.lang.String str14 = sample5.toString();
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null;-19.699999999999996;32" + "'", str14.equals("null;-19.699999999999996;32"));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test309");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 2);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        micazMsg6.set_NodeID((int) (byte) 10);
        byte[] byteArray9 = micazMsg6.dataGet();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray9);
        try {
            laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg10, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 0, data_length 100 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test310");
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
        java.lang.String str49 = sample34.toString();
        java.lang.String str50 = sample34.getNode();
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
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + ";-19.699999999999996;0" + "'", str49.equals(";-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test311");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test312");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 1, (int) (short) 0);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj6 = micazMsg5.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5, (long) 0);
        try {
            micazMsg2.dataSet((net.tinyos.message.Message) micazMsg5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test313");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        laccan.devices.Type type3 = sample1.getType();
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test314");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory", (double) (byte) -1, (long) ' ');
        sample3.setTemperature((double) 512);
        java.lang.Class<?> wildcardClass6 = sample3.getClass();
        java.lang.String str7 = sample3.getNode();
        java.lang.String[] strArray8 = sample3.toCSV();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "memory" + "'", str7.equals("memory"));
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test315");
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
        try {
            laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray17, 24, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 24, data_length 32 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test316");
        int int1 = laccan.devices.MicazMsg.offsetBits_Buffer((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test317");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        laccan.devices.Type type7 = null;
        sample4.setType(type7);
        java.lang.String str9 = sample4.toString();
        double double10 = sample4.getDateDouble();
        sample4.setDate((long) (short) 1);
        long long13 = sample4.getDate();
        double double14 = sample4.getTemperature();
        sample4.setNode("null;4.0;0");
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null;-19.699999999999996;0" + "'", str9.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-19.699999999999996d) + "'", double14 == (-19.699999999999996d));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test318");
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
        try {
            laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 100, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test319");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        memory0.build();
        memory0.build();
        int int5 = memory0.length();
        laccan.memory.Container container6 = memory0.getMemory();
        int int7 = memory0.length();
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(container6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test320");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        int int8 = micazMsg7.dataLength();
        int int9 = micazMsg7.get_Voltage();
        int int10 = micazMsg7.amType();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg7.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 172 + "'", int10 == 172);
        org.junit.Assert.assertNull(serialPacket11);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test321");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer((-139));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test322");
        int int1 = laccan.devices.MicazMsg.offset_Buffer(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test323");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        memory0.build();
        laccan.memory.Container container3 = memory0.getMemory();
        org.junit.Assert.assertNotNull(container3);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test324");
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
        laccan.persistence.StorageCSV storageCSV40 = new laccan.persistence.StorageCSV();
        java.util.List<laccan.devices.Sample> sampleList41 = storageCSV40.read();
        laccan.cloud.prediction.Regression regression42 = new laccan.cloud.prediction.Regression();
        double double43 = regression42.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll44 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList45 = keepingAll44.get();
        laccan.cloud.prediction.Regression regression46 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg48 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray49 = micazMsg48.get_Buffer();
        java.lang.Object obj50 = micazMsg48.clone();
        laccan.devices.Sample sample51 = new laccan.devices.Sample(micazMsg48);
        laccan.devices.Sample sample52 = new laccan.devices.Sample();
        laccan.devices.Sample sample53 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray54 = new laccan.devices.Sample[] { sample51, sample52, sample53 };
        java.util.ArrayList<laccan.devices.Sample> sampleList55 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList55, sampleArray54);
        java.util.List<java.lang.Double> doubleList57 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList55);
        java.util.List<java.lang.Double> doubleList58 = regression46.result(doubleList57);
        regression42.init(sampleList45, doubleList57);
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
        laccan.cloud.prediction.Regression regression78 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg80 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray81 = micazMsg80.get_Buffer();
        java.lang.Object obj82 = micazMsg80.clone();
        laccan.devices.Sample sample83 = new laccan.devices.Sample(micazMsg80);
        laccan.devices.Sample sample84 = new laccan.devices.Sample();
        laccan.devices.Sample sample85 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray86 = new laccan.devices.Sample[] { sample83, sample84, sample85 };
        java.util.ArrayList<laccan.devices.Sample> sampleList87 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList87, sampleArray86);
        java.util.List<java.lang.Double> doubleList89 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList87);
        java.util.List<java.lang.Double> doubleList90 = regression78.result(doubleList89);
        regression42.init(sampleList63, doubleList90);
        double double92 = regression42.mse();
        java.util.List<java.lang.Double> doubleList93 = regression42.result();
        regression0.init(sampleList41, doubleList93);
        regression0.train();
        double double96 = regression0.mse();
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
        org.junit.Assert.assertNotNull(sampleList41);
        org.junit.Assert.assertEquals((double) double43, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList45);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(sampleArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(doubleList57);
        org.junit.Assert.assertNotNull(doubleList58);
        org.junit.Assert.assertEquals((double) double61, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList63);
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNotNull(sampleArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(doubleList75);
        org.junit.Assert.assertNotNull(doubleList76);
        org.junit.Assert.assertNotNull(shortArray81);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertNotNull(sampleArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(doubleList89);
        org.junit.Assert.assertNotNull(doubleList90);
        org.junit.Assert.assertEquals((double) double92, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList93);
        org.junit.Assert.assertEquals((double) double96, Double.NaN, 0);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test325");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 1);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray2, 64);
        try {
            short[] shortArray9 = micazMsg8.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length -62 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test326");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 512);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        int int11 = micazMsg8.get_NodeID();
        micazMsg8.setElement_Buffer(1, (short) (byte) 0);
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg8, (long) 512);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        java.lang.Object obj20 = micazMsg18.clone();
        laccan.devices.Sample sample21 = new laccan.devices.Sample(micazMsg18);
        long long22 = sample21.getDate();
        laccan.devices.Type type23 = laccan.devices.Type.FULL;
        sample21.setType(type23);
        sample21.setNode("reduction");
        java.lang.Class<?> wildcardClass27 = sample21.getClass();
        laccan.devices.Type type28 = sample21.getType();
        sample16.setType(type28);
        sample6.setType(type28);
        java.lang.String[] strArray31 = sample6.toCSV();
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + type23 + "' != '" + laccan.devices.Type.FULL + "'", type23.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + type28 + "' != '" + laccan.devices.Type.FULL + "'", type28.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test327");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0);
        short[] shortArray4 = micazMsg1.get_Buffer();
        micazMsg1.set_Voltage((int) (byte) 10);
        int int7 = micazMsg1.get_Voltage();
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg9);
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg9, (long) (short) 10);
        net.tinyos.message.SerialPacket serialPacket14 = micazMsg9.getSerialPacket();
        byte[] byteArray15 = micazMsg9.dataGet();
        short[] shortArray16 = micazMsg9.get_Buffer();
        micazMsg1.set_Buffer(shortArray16);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNull(serialPacket14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(shortArray16);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test328");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(32, 160);
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray5 = micazMsg4.get_Buffer();
        java.lang.Object obj6 = micazMsg4.clone();
        int int7 = micazMsg4.get_NodeID();
        micazMsg4.setElement_Buffer(1, (short) (byte) 0);
        micazMsg4.amTypeSet(0);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = micazMsg14.get_Buffer();
        java.lang.Object obj16 = micazMsg14.clone();
        micazMsg14.amTypeSet(20);
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg14);
        java.lang.Object obj20 = micazMsg14.clone();
        net.tinyos.message.Message message22 = micazMsg14.clone((int) ' ');
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg25.amTypeSet(2);
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg25, (long) 512);
        micazMsg25.set_Voltage(16);
        byte[] byteArray32 = micazMsg25.dataGet();
        short[] shortArray33 = micazMsg25.get_Buffer();
        micazMsg14.set_Buffer(shortArray33);
        micazMsg4.set_Buffer(shortArray33);
        micazMsg2.set_Buffer(shortArray33);
        java.lang.Object obj37 = micazMsg2.clone();
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(message22);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test329");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(52, 0);
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg2);
        long long4 = sample3.getDate();
        java.lang.String str5 = sample3.getNode();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test330");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0);
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg8, (long) 160);
        java.lang.Object obj11 = micazMsg8.clone();
        java.lang.Class<?> wildcardClass12 = micazMsg8.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test331");
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
        java.util.List<java.lang.Double> doubleList33 = regression0.result();
        laccan.cloud.prediction.Regression regression34 = new laccan.cloud.prediction.Regression();
        double double35 = regression34.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll36 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList37 = keepingAll36.get();
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
        regression34.init(sampleList37, doubleList49);
        laccan.cloud.prediction.Regression regression52 = new laccan.cloud.prediction.Regression();
        double double53 = regression52.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll54 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList55 = keepingAll54.get();
        laccan.cloud.prediction.Regression regression56 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg58 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray59 = micazMsg58.get_Buffer();
        java.lang.Object obj60 = micazMsg58.clone();
        laccan.devices.Sample sample61 = new laccan.devices.Sample(micazMsg58);
        laccan.devices.Sample sample62 = new laccan.devices.Sample();
        laccan.devices.Sample sample63 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray64 = new laccan.devices.Sample[] { sample61, sample62, sample63 };
        java.util.ArrayList<laccan.devices.Sample> sampleList65 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList65, sampleArray64);
        java.util.List<java.lang.Double> doubleList67 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList65);
        java.util.List<java.lang.Double> doubleList68 = regression56.result(doubleList67);
        regression52.init(sampleList55, doubleList67);
        laccan.cloud.prediction.Regression regression70 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg72 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray73 = micazMsg72.get_Buffer();
        java.lang.Object obj74 = micazMsg72.clone();
        laccan.devices.Sample sample75 = new laccan.devices.Sample(micazMsg72);
        laccan.devices.Sample sample76 = new laccan.devices.Sample();
        laccan.devices.Sample sample77 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray78 = new laccan.devices.Sample[] { sample75, sample76, sample77 };
        java.util.ArrayList<laccan.devices.Sample> sampleList79 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList79, sampleArray78);
        java.util.List<java.lang.Double> doubleList81 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList79);
        java.util.List<java.lang.Double> doubleList82 = regression70.result(doubleList81);
        regression34.init(sampleList55, doubleList82);
        java.util.List<java.lang.Double> doubleList84 = laccan.cloud.prediction.Regression.makeTests(sampleList55);
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
        org.junit.Assert.assertNotNull(doubleList33);
        org.junit.Assert.assertEquals((double) double35, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList37);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(sampleArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(doubleList49);
        org.junit.Assert.assertNotNull(doubleList50);
        org.junit.Assert.assertEquals((double) double53, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList55);
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(sampleArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(doubleList67);
        org.junit.Assert.assertNotNull(doubleList68);
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertNotNull(sampleArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(doubleList81);
        org.junit.Assert.assertNotNull(doubleList82);
        org.junit.Assert.assertNotNull(doubleList84);
        org.junit.Assert.assertNotNull(doubleList85);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test332");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("memory");
        laccan.persistence.StorageCSV storageCSV8 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV10 = storageCSV8.local("hi!");
        laccan.persistence.StorageCSV storageCSV12 = storageCSV10.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList13 = storageCSV12.read();
        java.util.List<laccan.devices.Sample> sampleList14 = storageCSV12.read();
        laccan.persistence.StorageCSV storageCSV16 = storageCSV12.local("");
        laccan.persistence.StorageCSV storageCSV17 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV19 = storageCSV17.local("hi!");
        laccan.persistence.StorageCSV storageCSV21 = storageCSV19.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList22 = storageCSV21.read();
        laccan.persistence.StorageCSV storageCSV24 = storageCSV21.local("memory");
        laccan.persistence.StorageCSV storageCSV25 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV27 = storageCSV25.local("hi!");
        laccan.persistence.StorageCSV storageCSV29 = storageCSV27.local("lastReading");
        java.lang.String[] strArray35 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV29.save(strArray35);
        storageCSV21.save(strArray35);
        storageCSV12.save(strArray35);
        storageCSV7.save(strArray35);
        laccan.persistence.StorageCSV storageCSV40 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV42 = storageCSV40.local("hi!");
        laccan.persistence.StorageCSV storageCSV44 = storageCSV42.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList45 = storageCSV44.read();
        java.util.List<laccan.devices.Sample> sampleList46 = storageCSV44.read();
        laccan.persistence.StorageCSV storageCSV48 = storageCSV44.local("");
        laccan.persistence.StorageCSV storageCSV50 = storageCSV48.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        laccan.persistence.StorageCSV storageCSV51 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV53 = storageCSV51.local("hi!");
        laccan.persistence.StorageCSV storageCSV54 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray55 = new java.lang.String[] {};
        storageCSV54.save(strArray55);
        storageCSV51.save(strArray55);
        laccan.persistence.StorageCSV storageCSV59 = storageCSV51.local("nodes");
        laccan.persistence.StorageCSV storageCSV61 = storageCSV51.local("init");
        java.util.List<laccan.devices.Sample> sampleList62 = storageCSV51.read();
        laccan.memory.data.reduction.KeepingAll keepingAll63 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample64 = new laccan.devices.Sample();
        keepingAll63.add(sample64);
        sample64.setTemperature((double) 0L);
        java.lang.String[] strArray68 = sample64.toCSV();
        storageCSV51.save(strArray68);
        storageCSV50.save(strArray68);
        java.lang.String[] strArray75 = new java.lang.String[] { "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n", "null;-19.699999999999996;0;-19.699999999999996;0", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "null;-19.699999999999996;0;-19.699999999999996;0" };
        storageCSV50.save(strArray75);
        storageCSV7.save(strArray75);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV12);
        org.junit.Assert.assertNotNull(sampleList13);
        org.junit.Assert.assertNotNull(sampleList14);
        org.junit.Assert.assertNotNull(storageCSV16);
        org.junit.Assert.assertNotNull(storageCSV19);
        org.junit.Assert.assertNotNull(storageCSV21);
        org.junit.Assert.assertNotNull(sampleList22);
        org.junit.Assert.assertNotNull(storageCSV24);
        org.junit.Assert.assertNotNull(storageCSV27);
        org.junit.Assert.assertNotNull(storageCSV29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(storageCSV42);
        org.junit.Assert.assertNotNull(storageCSV44);
        org.junit.Assert.assertNotNull(sampleList45);
        org.junit.Assert.assertNotNull(sampleList46);
        org.junit.Assert.assertNotNull(storageCSV48);
        org.junit.Assert.assertNotNull(storageCSV50);
        org.junit.Assert.assertNotNull(storageCSV53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(storageCSV59);
        org.junit.Assert.assertNotNull(storageCSV61);
        org.junit.Assert.assertNotNull(sampleList62);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray75);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test333");
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
        laccan.cloud.prediction.Regression regression50 = new laccan.cloud.prediction.Regression();
        double double51 = regression50.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll52 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList53 = keepingAll52.get();
        laccan.cloud.prediction.Regression regression54 = new laccan.cloud.prediction.Regression();
        double double55 = regression54.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll56 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList57 = keepingAll56.get();
        laccan.cloud.prediction.Regression regression58 = new laccan.cloud.prediction.Regression();
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
        java.util.List<java.lang.Double> doubleList70 = regression58.result(doubleList69);
        regression54.init(sampleList57, doubleList69);
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
        java.util.List<java.lang.Double> doubleList85 = regression54.result(doubleList83);
        regression50.init(sampleList53, doubleList83);
        regression50.train();
        java.util.List<java.lang.Double> doubleList88 = regression50.result();
        regression50.train();
        java.util.List<java.lang.Double> doubleList90 = regression50.result();
        java.util.List<java.lang.Double> doubleList91 = regression0.result(doubleList90);
        double double92 = regression0.mse();
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
        org.junit.Assert.assertEquals((double) double51, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList53);
        org.junit.Assert.assertEquals((double) double55, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList57);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNotNull(sampleArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(doubleList69);
        org.junit.Assert.assertNotNull(doubleList70);
        org.junit.Assert.assertNotNull(shortArray75);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertNotNull(sampleArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(doubleList83);
        org.junit.Assert.assertNotNull(doubleList84);
        org.junit.Assert.assertNotNull(doubleList85);
        org.junit.Assert.assertNotNull(doubleList88);
        org.junit.Assert.assertNotNull(doubleList90);
        org.junit.Assert.assertNotNull(doubleList91);
        org.junit.Assert.assertEquals((double) double92, Double.NaN, 0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test334");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("full_memory", (double) (short) 1, (long) 172);
        laccan.devices.Type type4 = sample3.getType();
        sample3.setDate((long) (short) 0);
        sample3.setNode("init");
        sample3.setDate((long) (-1));
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg12);
        long long16 = sample15.getDate();
        laccan.devices.Type type17 = laccan.devices.Type.FULL;
        sample15.setType(type17);
        sample15.setNode("reduction");
        java.lang.Class<?> wildcardClass21 = sample15.getClass();
        laccan.devices.Type type22 = sample15.getType();
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray25 = micazMsg24.get_Buffer();
        java.lang.Object obj26 = micazMsg24.clone();
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg24);
        long long28 = sample27.getDate();
        laccan.devices.Type type29 = laccan.devices.Type.FULL;
        sample27.setType(type29);
        sample27.setNode("reduction");
        laccan.devices.Type type33 = sample27.getType();
        sample15.setType(type33);
        sample3.setType(type33);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + type17 + "' != '" + laccan.devices.Type.FULL + "'", type17.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + laccan.devices.Type.FULL + "'", type22.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + laccan.devices.Type.FULL + "'", type29.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type33 + "' != '" + laccan.devices.Type.FULL + "'", type33.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test335");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        int int5 = micazMsg1.baseOffset();
        micazMsg1.amTypeSet((int) '4');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test336");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((-30), 256);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test337");
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
        java.util.List<java.lang.Double> doubleList47 = laccan.cloud.prediction.Regression.makeTests(sampleList18);
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
        org.junit.Assert.assertNotNull(doubleList47);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test338");
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
        laccan.memory.data.reduction.KeepingAll keepingAll15 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList16 = keepingAll15.get();
        int int17 = keepingAll15.length();
        java.util.List<laccan.devices.Sample> sampleList18 = keepingAll15.get();
        laccan.persistence.StorageCSV storageCSV19 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV21 = storageCSV19.local("hi!");
        laccan.persistence.StorageCSV storageCSV23 = storageCSV21.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList24 = storageCSV23.read();
        laccan.persistence.StorageCSV storageCSV26 = storageCSV23.local("memory");
        laccan.persistence.StorageCSV storageCSV27 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV29 = storageCSV27.local("hi!");
        laccan.persistence.StorageCSV storageCSV31 = storageCSV29.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList32 = storageCSV31.read();
        java.util.List<laccan.devices.Sample> sampleList33 = storageCSV31.read();
        laccan.persistence.StorageCSV storageCSV35 = storageCSV31.local("");
        laccan.persistence.StorageCSV storageCSV36 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV38 = storageCSV36.local("hi!");
        laccan.persistence.StorageCSV storageCSV40 = storageCSV38.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList41 = storageCSV40.read();
        laccan.persistence.StorageCSV storageCSV43 = storageCSV40.local("memory");
        laccan.persistence.StorageCSV storageCSV44 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV46 = storageCSV44.local("hi!");
        laccan.persistence.StorageCSV storageCSV48 = storageCSV46.local("lastReading");
        java.lang.String[] strArray54 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV48.save(strArray54);
        storageCSV40.save(strArray54);
        storageCSV31.save(strArray54);
        storageCSV26.save(strArray54);
        java.util.List<laccan.devices.Sample> sampleList59 = storageCSV26.read();
        java.util.List<java.lang.Double> doubleList60 = laccan.cloud.prediction.Regression.makeTests(sampleList59);
        regression0.init(sampleList18, doubleList60);
        laccan.cloud.prediction.Regression regression62 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg64 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray65 = micazMsg64.get_Buffer();
        java.lang.Object obj66 = micazMsg64.clone();
        laccan.devices.Sample sample67 = new laccan.devices.Sample(micazMsg64);
        laccan.devices.Sample sample68 = new laccan.devices.Sample();
        laccan.devices.Sample sample69 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray70 = new laccan.devices.Sample[] { sample67, sample68, sample69 };
        java.util.ArrayList<laccan.devices.Sample> sampleList71 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList71, sampleArray70);
        java.util.List<java.lang.Double> doubleList73 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList71);
        java.util.List<java.lang.Double> doubleList74 = regression62.result(doubleList73);
        laccan.memory.data.reduction.KeepingAll keepingAll75 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList76 = keepingAll75.get();
        java.util.List<java.lang.Double> doubleList77 = laccan.cloud.prediction.Regression.makeTests(sampleList76);
        java.util.List<java.lang.Double> doubleList78 = regression62.result(doubleList77);
        java.util.List<java.lang.Double> doubleList79 = regression0.result(doubleList77);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(sampleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(sampleList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(sampleList18);
        org.junit.Assert.assertNotNull(storageCSV21);
        org.junit.Assert.assertNotNull(storageCSV23);
        org.junit.Assert.assertNotNull(sampleList24);
        org.junit.Assert.assertNotNull(storageCSV26);
        org.junit.Assert.assertNotNull(storageCSV29);
        org.junit.Assert.assertNotNull(storageCSV31);
        org.junit.Assert.assertNotNull(sampleList32);
        org.junit.Assert.assertNotNull(sampleList33);
        org.junit.Assert.assertNotNull(storageCSV35);
        org.junit.Assert.assertNotNull(storageCSV38);
        org.junit.Assert.assertNotNull(storageCSV40);
        org.junit.Assert.assertNotNull(sampleList41);
        org.junit.Assert.assertNotNull(storageCSV43);
        org.junit.Assert.assertNotNull(storageCSV46);
        org.junit.Assert.assertNotNull(storageCSV48);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(sampleList59);
        org.junit.Assert.assertNotNull(doubleList60);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(sampleArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(doubleList73);
        org.junit.Assert.assertNotNull(doubleList74);
        org.junit.Assert.assertNotNull(sampleList76);
        org.junit.Assert.assertNotNull(doubleList77);
        org.junit.Assert.assertNotNull(doubleList78);
        org.junit.Assert.assertNotNull(doubleList79);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test339");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        int int12 = micazMsg1.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test340");
        net.tinyos.message.Message message0 = null;
        try {
            laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(message0, 160, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test341");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(0, 100);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test342");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) ' ');
        int int12 = micazMsg1.amType();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test343");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        sample4.setTemperature((double) 16);
        double double7 = sample4.getTemperature();
        sample4.setDate((long) (short) 100);
        java.lang.String str10 = sample4.toString();
        java.lang.String[] strArray11 = sample4.toCSV();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 16.0d + "'", double7 == 16.0d);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null;16.0;100" + "'", str10.equals("null;16.0;100"));
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test344");
        int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 96 + "'", int1 == 96);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test345");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        micazMsg6.setElement_Buffer(0, (short) 10);
        micazMsg6.set_Voltage(0);
        java.lang.Object obj13 = micazMsg6.clone();
        short[] shortArray14 = micazMsg6.get_Buffer();
        micazMsg1.set_Buffer(shortArray14);
        try {
            laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 100, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 100, data_length 12 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(shortArray14);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test346");
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
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray10, 2);
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
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test347");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 2, (long) 'a', (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = longList3.getClass();
        java.lang.Class<?> wildcardClass5 = longList3.getClass();
        org.junit.Assert.assertNotNull(longList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test348");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, 2);
        micazMsg1.dataSet(byteArray7);
        java.lang.String str12 = micazMsg1.toString();
        try {
            micazMsg1.setElement_Buffer(96, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test349");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        double double7 = sample6.getTemperature();
        java.lang.String str8 = sample6.toString();
        java.lang.String[] strArray9 = sample6.toCSV();
        java.lang.String[] strArray10 = sample6.toCSV();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-19.699999999999996d) + "'", double7 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null;-19.699999999999996;0" + "'", str8.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test350");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests(1L, (long) 2, 12);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test351");
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
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray30 = micazMsg29.get_Buffer();
        laccan.devices.Sample sample31 = new laccan.devices.Sample(micazMsg29);
        laccan.devices.Type type32 = sample31.getType();
        double double33 = sample31.getDateDouble();
        memory0.add(sample31);
        memory0.build();
        laccan.devices.Sample sample39 = new laccan.devices.Sample("init", (double) 100.0f, (long) 32);
        sample39.setDate((long) 160);
        memory0.add(sample39);
        double double43 = sample39.getTemperature();
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
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNull(type32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test352");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        short[] shortArray8 = new short[] { (byte) -1, (short) 0 };
        micazMsg1.set_Buffer(shortArray8);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 20);
        int int12 = micazMsg11.get_NodeID();
        try {
            short short14 = micazMsg11.getElement_Buffer((-139));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test353");
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
        java.lang.String str40 = sample20.getNode();
        java.lang.String str41 = sample20.getNode();
        double double42 = sample20.getDateDouble();
        java.lang.String str43 = sample20.toString();
        long long44 = sample20.getDate();
        long long45 = sample20.getDate();
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
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "null;-19.699999999999996;0" + "'", str43.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test354");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("memory");
        laccan.persistence.StorageCSV storageCSV9 = storageCSV7.local("null;-19.699999999999996;0");
        java.util.List<laccan.devices.Sample> sampleList10 = storageCSV7.read();
        laccan.persistence.StorageCSV storageCSV11 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV13 = storageCSV11.local("hi!");
        laccan.persistence.StorageCSV storageCSV15 = storageCSV13.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList16 = storageCSV15.read();
        laccan.persistence.StorageCSV storageCSV18 = storageCSV15.local("memory");
        laccan.persistence.StorageCSV storageCSV19 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV21 = storageCSV19.local("hi!");
        laccan.persistence.StorageCSV storageCSV23 = storageCSV21.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList24 = storageCSV23.read();
        java.util.List<laccan.devices.Sample> sampleList25 = storageCSV23.read();
        laccan.persistence.StorageCSV storageCSV27 = storageCSV23.local("");
        laccan.persistence.StorageCSV storageCSV28 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV30 = storageCSV28.local("hi!");
        laccan.persistence.StorageCSV storageCSV32 = storageCSV30.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList33 = storageCSV32.read();
        laccan.persistence.StorageCSV storageCSV35 = storageCSV32.local("memory");
        laccan.persistence.StorageCSV storageCSV36 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV38 = storageCSV36.local("hi!");
        laccan.persistence.StorageCSV storageCSV40 = storageCSV38.local("lastReading");
        java.lang.String[] strArray46 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV40.save(strArray46);
        storageCSV32.save(strArray46);
        storageCSV23.save(strArray46);
        storageCSV15.save(strArray46);
        java.util.List<laccan.devices.Sample> sampleList51 = storageCSV15.read();
        laccan.devices.MicazMsg micazMsg53 = new laccan.devices.MicazMsg((int) '4');
        int int54 = micazMsg53.dataLength();
        net.tinyos.message.SerialPacket serialPacket55 = micazMsg53.getSerialPacket();
        laccan.devices.Sample sample57 = new laccan.devices.Sample(micazMsg53, (long) (byte) 10);
        laccan.devices.MicazMsg micazMsg60 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj61 = micazMsg60.clone();
        laccan.devices.Sample sample63 = new laccan.devices.Sample(micazMsg60, (long) 0);
        java.lang.String str64 = sample63.getNode();
        laccan.devices.MicazMsg micazMsg66 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray67 = micazMsg66.get_Buffer();
        java.lang.Object obj68 = micazMsg66.clone();
        laccan.devices.Sample sample69 = new laccan.devices.Sample(micazMsg66);
        long long70 = sample69.getDate();
        java.lang.Class<?> wildcardClass71 = sample69.getClass();
        laccan.devices.MicazMsg micazMsg73 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray74 = micazMsg73.get_Buffer();
        java.lang.Object obj75 = micazMsg73.clone();
        laccan.devices.Sample sample76 = new laccan.devices.Sample(micazMsg73);
        long long77 = sample76.getDate();
        laccan.devices.Type type78 = laccan.devices.Type.FULL;
        sample76.setType(type78);
        sample69.setType(type78);
        sample63.setType(type78);
        sample57.setType(type78);
        java.lang.String[] strArray83 = sample57.toCSV();
        storageCSV15.save(strArray83);
        storageCSV7.save(strArray83);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(sampleList10);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(storageCSV15);
        org.junit.Assert.assertNotNull(sampleList16);
        org.junit.Assert.assertNotNull(storageCSV18);
        org.junit.Assert.assertNotNull(storageCSV21);
        org.junit.Assert.assertNotNull(storageCSV23);
        org.junit.Assert.assertNotNull(sampleList24);
        org.junit.Assert.assertNotNull(sampleList25);
        org.junit.Assert.assertNotNull(storageCSV27);
        org.junit.Assert.assertNotNull(storageCSV30);
        org.junit.Assert.assertNotNull(storageCSV32);
        org.junit.Assert.assertNotNull(sampleList33);
        org.junit.Assert.assertNotNull(storageCSV35);
        org.junit.Assert.assertNotNull(storageCSV38);
        org.junit.Assert.assertNotNull(storageCSV40);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(sampleList51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 52 + "'", int54 == 52);
        org.junit.Assert.assertNull(serialPacket55);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue("'" + type78 + "' != '" + laccan.devices.Type.FULL + "'", type78.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(strArray83);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test355");
        net.tinyos.message.Message message0 = null;
        try {
            laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(message0, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test356");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        sample4.setTemperature((double) 10L);
        laccan.devices.Type type11 = sample4.getType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(type11);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test357");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (short) 10);
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray6, 2);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray6);
        try {
            micazMsg3.dataSet(byteArray6, (-30), 65535, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test358");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test359");
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
        memory0.build();
        memory0.build();
        laccan.memory.Container container24 = memory0.getMemory();
        laccan.memory.Container container25 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(container24);
        org.junit.Assert.assertNotNull(container25);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test360");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        net.tinyos.message.Message message6 = micazMsg2.clone((int) '4');
        java.lang.Object obj7 = message6.clone();
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        java.lang.Object obj11 = micazMsg9.clone();
        micazMsg9.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg9, (int) (byte) 0);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        micazMsg17.set_NodeID(20);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray24);
        micazMsg17.dataSet(byteArray24);
        micazMsg9.dataSet(byteArray24);
        message6.dataSet(byteArray24);
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(byteArray24);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test361");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (byte) 1, 20);
        byte[] byteArray3 = micazMsg2.dataGet();
        try {
            laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test362");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        java.lang.Class<?> wildcardClass8 = micazMsg1.getClass();
        net.tinyos.message.SerialPacket serialPacket9 = micazMsg1.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(serialPacket9);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test363");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) '#', 64);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test364");
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
        try {
            micazMsg19.setElement_Buffer(256, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test365");
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
        int int37 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList38 = keepingAll0.get();
        laccan.devices.Sample sample42 = new laccan.devices.Sample("memory", (double) (byte) -1, (long) ' ');
        java.lang.String str43 = sample42.toString();
        double double44 = sample42.getTemperature();
        keepingAll0.add(sample42);
        java.util.List<laccan.devices.Sample> sampleList46 = keepingAll0.get();
        laccan.devices.Sample sample50 = new laccan.devices.Sample("memory", (double) (byte) -1, (long) ' ');
        java.lang.String str51 = sample50.toString();
        java.lang.String[] strArray52 = sample50.toCSV();
        double double53 = sample50.getTemperature();
        java.lang.String str54 = sample50.getNode();
        keepingAll0.add(sample50);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(sampleList38);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "memory;-1.0;32" + "'", str43.equals("memory;-1.0;32"));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertNotNull(sampleList46);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "memory;-1.0;32" + "'", str51.equals("memory;-1.0;32"));
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "memory" + "'", str54.equals("memory"));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test366");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(100, 32);
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray5 = micazMsg4.get_Buffer();
        java.lang.Object obj6 = micazMsg4.clone();
        java.lang.String str7 = micazMsg4.toString();
        short[] shortArray8 = micazMsg4.get_Buffer();
        byte[] byteArray9 = micazMsg4.dataGet();
        java.lang.Object obj10 = micazMsg4.clone();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg4);
        int int12 = micazMsg4.dataLength();
        int int13 = micazMsg4.baseOffset();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg4);
        short[] shortArray15 = micazMsg4.get_Buffer();
        micazMsg2.set_Buffer(shortArray15);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 48);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(shortArray15);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test367");
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
        double double83 = regression0.mse();
        java.util.List<java.lang.Double> doubleList84 = regression0.result();
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
        org.junit.Assert.assertEquals((double) double83, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList84);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test368");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        int int5 = micazMsg1.baseOffset();
        java.lang.Class<?> wildcardClass6 = micazMsg1.getClass();
        java.lang.String str7 = micazMsg1.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test369");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray3 = micazMsg2.get_Buffer();
        java.lang.Object obj4 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2);
        laccan.devices.Type type6 = null;
        sample5.setType(type6);
        keepingAll0.add(sample5);
        double double9 = sample5.getTemperature();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        java.lang.Object obj13 = micazMsg11.clone();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg11);
        long long15 = sample14.getDate();
        java.lang.String str16 = sample14.getNode();
        long long17 = sample14.getDate();
        laccan.memory.data.reduction.KeepingAll keepingAll18 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList19 = keepingAll18.get();
        int int20 = keepingAll18.length();
        java.util.List<laccan.devices.Sample> sampleList21 = keepingAll18.get();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = micazMsg23.get_Buffer();
        java.lang.Object obj25 = micazMsg23.clone();
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg23);
        laccan.devices.Type type27 = null;
        sample26.setType(type27);
        laccan.devices.Type type29 = null;
        sample26.setType(type29);
        sample26.setNode("hi!");
        keepingAll18.add(sample26);
        laccan.devices.Type type34 = sample26.getType();
        java.lang.String[] strArray35 = sample26.toCSV();
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray43 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg37.set_Buffer(shortArray43);
        laccan.devices.Sample sample45 = new laccan.devices.Sample(micazMsg37);
        laccan.devices.Sample sample46 = new laccan.devices.Sample();
        laccan.devices.Type type47 = laccan.devices.Type.FULL;
        sample46.setType(type47);
        sample45.setType(type47);
        sample26.setType(type47);
        sample14.setType(type47);
        sample5.setType(type47);
        laccan.devices.Type type53 = sample5.getType();
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-19.699999999999996d) + "'", double9 == (-19.699999999999996d));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(sampleList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(sampleList21);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(type34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertTrue("'" + type47 + "' != '" + laccan.devices.Type.FULL + "'", type47.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type53 + "' != '" + laccan.devices.Type.FULL + "'", type53.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test370");
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
        long long46 = sample33.getDate();
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
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test371");
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
        java.lang.Object obj29 = micazMsg27.clone();
        micazMsg27.amTypeSet(20);
        laccan.devices.Sample sample32 = new laccan.devices.Sample(micazMsg27);
        sample32.setDate((long) (byte) 1);
        keepingAll0.add(sample32);
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray38 = micazMsg37.get_Buffer();
        laccan.devices.Sample sample39 = new laccan.devices.Sample(micazMsg37);
        keepingAll0.add(sample39);
        java.util.List<laccan.devices.Sample> sampleList41 = keepingAll0.get();
        java.util.List<java.lang.Double> doubleList42 = laccan.cloud.prediction.Regression.makeTests(sampleList41);
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
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(sampleList41);
        org.junit.Assert.assertNotNull(doubleList42);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test372");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4', (int) '4');
        micazMsg2.init((int) ' ');
        java.lang.Object obj5 = micazMsg2.clone();
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test373");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(100, (int) (short) 1);
        java.lang.String str3 = micazMsg2.toString();
        int int4 = micazMsg2.get_NodeID();
        int int5 = micazMsg2.get_NodeID();
        micazMsg2.init((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str3.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test374");
        laccan.devices.Sample sample0 = new laccan.devices.Sample();
        double double1 = sample0.getDateDouble();
        double double2 = sample0.getDateDouble();
        double double3 = sample0.getDateDouble();
        sample0.setNode("null;97.0;0");
        laccan.devices.Type type6 = sample0.getType();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(type6);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test375");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.get_NodeID();
        int int9 = micazMsg1.amType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 172 + "'", int9 == 172);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test376");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        net.tinyos.message.Message message5 = micazMsg3.clone(10);
        int int6 = micazMsg3.dataLength();
        try {
            micazMsg3.set_Voltage(65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(message5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test377");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(3, (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test378");
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
        int int26 = memory0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test379");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone(2);
        byte[] byteArray10 = micazMsg1.dataGet();
        try {
            net.tinyos.message.Message message12 = micazMsg1.clone((-30));
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
        org.junit.Assert.assertNotNull(byteArray10);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test380");
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
        java.lang.String str40 = sample20.getNode();
        java.lang.String str41 = sample20.getNode();
        long long42 = sample20.getDate();
        sample20.setNode("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=");
        sample20.setNode("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=");
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
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test381");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray1 = new java.lang.String[] {};
        storageCSV0.save(strArray1);
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV5 = storageCSV3.local("hi!");
        laccan.persistence.StorageCSV storageCSV7 = storageCSV5.local("lastReading");
        java.lang.String[] strArray13 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV7.save(strArray13);
        java.lang.String[] strArray21 = new java.lang.String[] { "reduction;-19.699999999999996;0", "hi!", "nodes", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n", "memory" };
        storageCSV7.save(strArray21);
        storageCSV0.save(strArray21);
        java.util.List<laccan.devices.Sample> sampleList24 = storageCSV0.read();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(storageCSV5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(sampleList24);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test382");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        int int8 = micazMsg1.dataLength();
        int int9 = micazMsg1.baseOffset();
        micazMsg1.setElement_Buffer((int) (byte) 1, (short) 100);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) ' ', 1);
        java.lang.String str16 = micazMsg15.toString();
        short[] shortArray17 = micazMsg15.get_Buffer();
        micazMsg1.set_Buffer(shortArray17);
        try {
            laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 512, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 512, data_length 10 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str16.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray17);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test383");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        java.lang.Object obj10 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        short short13 = micazMsg1.getElement_Buffer(3);
        int int14 = micazMsg1.get_NodeID();
        java.lang.Object obj15 = micazMsg1.clone();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test384");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        short[] shortArray10 = micazMsg1.get_Buffer();
        micazMsg1.init(100);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray10);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test385");
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
        java.util.List<java.lang.Double> doubleList20 = regression0.result();
        regression0.train();
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
        org.junit.Assert.assertNotNull(doubleList20);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test386");
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
            laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray8, 3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 3, data_length 0 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test387");
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
        int int22 = micazMsg19.get_NodeID();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray25);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray25, 2);
        micazMsg19.dataSet(byteArray25);
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray25);
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg(byteArray25, (int) ' ');
        try {
            micazMsg1.dataSet(byteArray25, (int) (byte) 1, (int) (short) -1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test388");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        storageCSV3.save(strArray4);
        storageCSV0.save(strArray4);
        laccan.persistence.StorageCSV storageCSV8 = storageCSV0.local("nodes");
        laccan.persistence.StorageCSV storageCSV10 = storageCSV0.local("init");
        laccan.persistence.StorageCSV storageCSV12 = storageCSV10.local("reduction;-19.699999999999996;0");
        laccan.persistence.StorageCSV storageCSV14 = storageCSV12.local("full_memory");
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = micazMsg16.get_Buffer();
        java.lang.Object obj18 = micazMsg16.clone();
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg16);
        long long20 = sample19.getDate();
        laccan.devices.Type type21 = laccan.devices.Type.FULL;
        sample19.setType(type21);
        sample19.setNode("reduction");
        java.lang.String str25 = sample19.toString();
        sample19.setNode("reduction;-19.699999999999996;0");
        sample19.setTemperature((double) (-1L));
        double double30 = sample19.getDateDouble();
        java.lang.String[] strArray31 = sample19.toCSV();
        storageCSV14.save(strArray31);
        java.util.List<laccan.devices.Sample> sampleList33 = storageCSV14.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV12);
        org.junit.Assert.assertNotNull(storageCSV14);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + laccan.devices.Type.FULL + "'", type21.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "reduction;-19.699999999999996;0" + "'", str25.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(sampleList33);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test389");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        laccan.devices.Sample sample6 = new laccan.devices.Sample("memory;2.0;-1", (double) 512, 1L);
        keepingAll0.add(sample6);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test390");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg13.init(100);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test391");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(96, (int) (byte) -1);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test392");
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
        try {
            java.util.List<java.lang.Double> doubleList31 = laccan.cloud.prediction.Regression.makeTests(sampleList30);
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
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test393");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 1);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        byte[] byteArray7 = micazMsg6.dataGet();
        try {
            laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test394");
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
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray10);
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
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test395");
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
        java.util.List<java.lang.Double> doubleList20 = regression0.result();
        regression0.train();
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(sampleArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertNotNull(doubleList20);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test396");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        short short12 = micazMsg1.getElement_Buffer(0);
        micazMsg1.setElement_Buffer(0, (short) (byte) 1);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray19 = micazMsg18.dataGet();
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray19, (int) (byte) -1, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray19);
        short[] shortArray24 = micazMsg23.get_Buffer();
        short[] shortArray25 = micazMsg23.get_Buffer();
        micazMsg23.amTypeSet(0);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray37 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg31.set_Buffer(shortArray37);
        laccan.devices.Sample sample39 = new laccan.devices.Sample(micazMsg31);
        short[] shortArray40 = micazMsg31.get_Buffer();
        micazMsg29.set_Buffer(shortArray40);
        micazMsg23.set_Buffer(shortArray40);
        micazMsg1.set_Buffer(shortArray40);
        try {
            short short45 = micazMsg1.getElement_Buffer((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertNotNull(shortArray40);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test397");
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
        laccan.memory.data.reduction.KeepingAll keepingAll31 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample32 = new laccan.devices.Sample();
        keepingAll31.add(sample32);
        int int34 = keepingAll31.length();
        java.util.List<laccan.devices.Sample> sampleList35 = keepingAll31.get();
        java.util.List<laccan.devices.Sample> sampleList36 = keepingAll31.get();
        java.util.List<java.lang.Double> doubleList37 = laccan.cloud.prediction.Regression.makeTests(sampleList36);
        regression0.init((java.util.List<laccan.devices.Sample>) sampleList28, doubleList37);
        java.util.List<java.lang.Double> doubleList39 = regression0.result();
        double double40 = regression0.mse();
        regression0.train();
        org.junit.Assert.assertEquals((double) double2, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(sampleArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(sampleArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doubleList30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(sampleList35);
        org.junit.Assert.assertNotNull(sampleList36);
        org.junit.Assert.assertNotNull(doubleList37);
        org.junit.Assert.assertNotNull(doubleList39);
        org.junit.Assert.assertEquals((double) double40, Double.NaN, 0);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test398");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("reduction", (double) 1L, (long) 0);
        java.lang.String str4 = sample3.getNode();
        double double5 = sample3.getDateDouble();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "reduction" + "'", str4.equals("reduction"));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test399");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        memory0.build();
        memory0.build();
        int int5 = memory0.length();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg7.set_Buffer(shortArray13);
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg7);
        laccan.devices.Sample sample16 = new laccan.devices.Sample();
        laccan.devices.Type type17 = laccan.devices.Type.FULL;
        sample16.setType(type17);
        sample15.setType(type17);
        sample15.setTemperature((double) 'a');
        java.lang.Class<?> wildcardClass22 = sample15.getClass();
        memory0.add(sample15);
        laccan.devices.Sample sample27 = new laccan.devices.Sample("null;-19.699999999999996;0", (double) 160, (long) (short) 1);
        java.lang.String[] strArray28 = sample27.toCSV();
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
        laccan.devices.Type type44 = sample33.getType();
        sample27.setType(type44);
        memory0.add(sample27);
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + type17 + "' != '" + laccan.devices.Type.FULL + "'", type17.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + type35 + "' != '" + laccan.devices.Type.FULL + "'", type35.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "reduction;-19.699999999999996;0" + "'", str39.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + type44 + "' != '" + laccan.devices.Type.FULL + "'", type44.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test400");
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
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg1);
        try {
            short short14 = micazMsg1.getElement_Buffer(32);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test401");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 100);
        micazMsg1.set_Voltage(24);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test402");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(10, 2);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test403");
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
        laccan.memory.data.reduction.KeepingAll keepingAll15 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList16 = keepingAll15.get();
        int int17 = keepingAll15.length();
        java.util.List<laccan.devices.Sample> sampleList18 = keepingAll15.get();
        laccan.persistence.StorageCSV storageCSV19 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV21 = storageCSV19.local("hi!");
        laccan.persistence.StorageCSV storageCSV23 = storageCSV21.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList24 = storageCSV23.read();
        laccan.persistence.StorageCSV storageCSV26 = storageCSV23.local("memory");
        laccan.persistence.StorageCSV storageCSV27 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV29 = storageCSV27.local("hi!");
        laccan.persistence.StorageCSV storageCSV31 = storageCSV29.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList32 = storageCSV31.read();
        java.util.List<laccan.devices.Sample> sampleList33 = storageCSV31.read();
        laccan.persistence.StorageCSV storageCSV35 = storageCSV31.local("");
        laccan.persistence.StorageCSV storageCSV36 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV38 = storageCSV36.local("hi!");
        laccan.persistence.StorageCSV storageCSV40 = storageCSV38.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList41 = storageCSV40.read();
        laccan.persistence.StorageCSV storageCSV43 = storageCSV40.local("memory");
        laccan.persistence.StorageCSV storageCSV44 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV46 = storageCSV44.local("hi!");
        laccan.persistence.StorageCSV storageCSV48 = storageCSV46.local("lastReading");
        java.lang.String[] strArray54 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV48.save(strArray54);
        storageCSV40.save(strArray54);
        storageCSV31.save(strArray54);
        storageCSV26.save(strArray54);
        java.util.List<laccan.devices.Sample> sampleList59 = storageCSV26.read();
        java.util.List<java.lang.Double> doubleList60 = laccan.cloud.prediction.Regression.makeTests(sampleList59);
        regression0.init(sampleList18, doubleList60);
        java.util.List<java.lang.Double> doubleList62 = regression0.result();
        java.lang.Double[] doubleArray65 = new java.lang.Double[] { 1.0d, 97.0d };
        java.util.ArrayList<java.lang.Double> doubleList66 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList66, doubleArray65);
        java.util.List<java.lang.Double> doubleList68 = regression0.result((java.util.List<java.lang.Double>) doubleList66);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(sampleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(sampleList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(sampleList18);
        org.junit.Assert.assertNotNull(storageCSV21);
        org.junit.Assert.assertNotNull(storageCSV23);
        org.junit.Assert.assertNotNull(sampleList24);
        org.junit.Assert.assertNotNull(storageCSV26);
        org.junit.Assert.assertNotNull(storageCSV29);
        org.junit.Assert.assertNotNull(storageCSV31);
        org.junit.Assert.assertNotNull(sampleList32);
        org.junit.Assert.assertNotNull(sampleList33);
        org.junit.Assert.assertNotNull(storageCSV35);
        org.junit.Assert.assertNotNull(storageCSV38);
        org.junit.Assert.assertNotNull(storageCSV40);
        org.junit.Assert.assertNotNull(sampleList41);
        org.junit.Assert.assertNotNull(storageCSV43);
        org.junit.Assert.assertNotNull(storageCSV46);
        org.junit.Assert.assertNotNull(storageCSV48);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(sampleList59);
        org.junit.Assert.assertNotNull(doubleList60);
        org.junit.Assert.assertNotNull(doubleList62);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(doubleList68);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test404");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) 10.0f, (long) (short) 100);
        java.lang.String str4 = sample3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;10.0;100" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;10.0;100"));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test405");
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
        net.tinyos.message.SerialPacket serialPacket14 = micazMsg1.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(serialPacket14);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test406");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        micazMsg1.set_Voltage((int) ' ');
        net.tinyos.message.Message message11 = micazMsg1.clone(0);
        java.lang.Class<?> wildcardClass12 = message11.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(message11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test407");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        java.lang.String str6 = sample5.getNode();
        java.lang.String str7 = sample5.getNode();
        long long8 = sample5.getDate();
        double double9 = sample5.getTemperature();
        double double10 = sample5.getTemperature();
        java.lang.String str11 = sample5.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-19.699999999999996d) + "'", double9 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-19.699999999999996d) + "'", double10 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null;-19.699999999999996;10" + "'", str11.equals("null;-19.699999999999996;10"));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test408");
        laccan.devices.helper.utils.Assistant.reducerType = "null;-1.0;0";
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test409");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory", (double) (byte) -1, (long) ' ');
        sample3.setTemperature((double) 512);
        long long6 = sample3.getDate();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test410");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) '4', (long) (byte) 10, (int) '4');
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test411");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        short[] shortArray6 = micazMsg1.get_Buffer();
        micazMsg1.set_NodeID(2);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg10);
        int int13 = micazMsg10.get_NodeID();
        byte[] byteArray14 = micazMsg10.dataGet();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray14);
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg15, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test412");
        laccan.devices.helper.utils.Assistant.reducerType = "null;-19.699999999999996;32";
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test413");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        memory0.build();
        int int3 = memory0.length();
        java.lang.Class<?> wildcardClass4 = memory0.getClass();
        laccan.memory.Container container5 = memory0.getMemory();
        memory0.build();
        memory0.build();
        memory0.build();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(container5);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test414");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, 2);
        micazMsg1.dataSet(byteArray7);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray7, (int) ' ');
        try {
            laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray7, (int) (short) -1, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset -1, data_length 51 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test415");
        byte[] byteArray0 = null;
        try {
            laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray0, 65535, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test416");
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
        sample13.setDate((long) ' ');
        sample13.setNode("reduction;-19.699999999999996;0");
        sample13.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x64]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test417");
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
        int int12 = memory0.length();
        laccan.memory.Container container13 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(container13);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test418");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 ", (double) 2, (long) 0);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test419");
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
        int int12 = micazMsg10.dataLength();
        micazMsg10.set_NodeID(3);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test420");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(512);
        byte[] byteArray2 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, (int) (byte) 1);
        try {
            micazMsg5.setElement_Buffer(51, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test421");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer((-139));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test422");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample();
        laccan.devices.Type type11 = laccan.devices.Type.FULL;
        sample10.setType(type11);
        sample9.setType(type11);
        double double14 = sample9.getDateDouble();
        double double15 = sample9.getTemperature();
        laccan.devices.Type type16 = sample9.getType();
        sample9.setTemperature((double) 100L);
        double double19 = sample9.getDateDouble();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-19.648499999999995d) + "'", double15 == (-19.648499999999995d));
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + laccan.devices.Type.FULL + "'", type16.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test423");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        memory0.build();
        memory0.build();
        int int5 = memory0.length();
        memory0.build();
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test424");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        double double7 = sample4.getDateDouble();
        java.lang.String str8 = sample4.getNode();
        sample4.setDate((long) (short) 1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test425");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        try {
            short short6 = micazMsg2.getElement_Buffer(51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test426");
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
        laccan.persistence.StorageCSV storageCSV24 = new laccan.persistence.StorageCSV();
        java.util.List<laccan.devices.Sample> sampleList25 = storageCSV24.read();
        laccan.persistence.StorageCSV storageCSV26 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV28 = storageCSV26.local("hi!");
        laccan.persistence.StorageCSV storageCSV29 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray30 = new java.lang.String[] {};
        storageCSV29.save(strArray30);
        storageCSV26.save(strArray30);
        laccan.persistence.StorageCSV storageCSV34 = storageCSV26.local("nodes");
        laccan.persistence.StorageCSV storageCSV36 = storageCSV26.local("init");
        laccan.persistence.StorageCSV storageCSV38 = storageCSV36.local("reduction;-19.699999999999996;0");
        laccan.persistence.StorageCSV storageCSV40 = storageCSV36.local("lastReading");
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray43 = micazMsg42.get_Buffer();
        laccan.devices.Sample sample44 = new laccan.devices.Sample(micazMsg42);
        laccan.devices.Sample sample46 = new laccan.devices.Sample(micazMsg42, (long) (short) 10);
        double double47 = sample46.getDateDouble();
        java.lang.String[] strArray48 = sample46.toCSV();
        storageCSV36.save(strArray48);
        storageCSV24.save(strArray48);
        storageCSV10.save(strArray48);
        laccan.memory.data.reduction.KeepingAll keepingAll52 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList53 = keepingAll52.get();
        int int54 = keepingAll52.length();
        java.util.List<laccan.devices.Sample> sampleList55 = keepingAll52.get();
        laccan.devices.MicazMsg micazMsg57 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray58 = micazMsg57.get_Buffer();
        java.lang.Object obj59 = micazMsg57.clone();
        laccan.devices.Sample sample60 = new laccan.devices.Sample(micazMsg57);
        laccan.devices.Type type61 = null;
        sample60.setType(type61);
        laccan.devices.Type type63 = null;
        sample60.setType(type63);
        sample60.setNode("hi!");
        keepingAll52.add(sample60);
        laccan.devices.Type type68 = sample60.getType();
        java.lang.String[] strArray69 = sample60.toCSV();
        storageCSV10.save(strArray69);
        laccan.persistence.StorageCSV storageCSV72 = storageCSV10.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 ");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV12);
        org.junit.Assert.assertNotNull(storageCSV14);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(sampleList25);
        org.junit.Assert.assertNotNull(storageCSV28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(storageCSV34);
        org.junit.Assert.assertNotNull(storageCSV36);
        org.junit.Assert.assertNotNull(storageCSV38);
        org.junit.Assert.assertNotNull(storageCSV40);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(sampleList53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(sampleList55);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNull(type68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(storageCSV72);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test427");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test428");
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
        long long14 = sample7.getDate();
        double double15 = sample7.getTemperature();
        java.lang.String str16 = sample7.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-19.699999999999996d) + "'", double15 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "full_memory;-19.699999999999996;0" + "'", str16.equals("full_memory;-19.699999999999996;0"));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test429");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        net.tinyos.message.Message message6 = micazMsg2.clone((int) '4');
        micazMsg2.amTypeSet((int) 'a');
        try {
            short short10 = micazMsg2.getElement_Buffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(message6);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test430");
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
        laccan.memory.data.reduction.KeepingAll keepingAll15 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList16 = keepingAll15.get();
        int int17 = keepingAll15.length();
        java.util.List<laccan.devices.Sample> sampleList18 = keepingAll15.get();
        laccan.persistence.StorageCSV storageCSV19 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV21 = storageCSV19.local("hi!");
        laccan.persistence.StorageCSV storageCSV23 = storageCSV21.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList24 = storageCSV23.read();
        laccan.persistence.StorageCSV storageCSV26 = storageCSV23.local("memory");
        laccan.persistence.StorageCSV storageCSV27 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV29 = storageCSV27.local("hi!");
        laccan.persistence.StorageCSV storageCSV31 = storageCSV29.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList32 = storageCSV31.read();
        java.util.List<laccan.devices.Sample> sampleList33 = storageCSV31.read();
        laccan.persistence.StorageCSV storageCSV35 = storageCSV31.local("");
        laccan.persistence.StorageCSV storageCSV36 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV38 = storageCSV36.local("hi!");
        laccan.persistence.StorageCSV storageCSV40 = storageCSV38.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList41 = storageCSV40.read();
        laccan.persistence.StorageCSV storageCSV43 = storageCSV40.local("memory");
        laccan.persistence.StorageCSV storageCSV44 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV46 = storageCSV44.local("hi!");
        laccan.persistence.StorageCSV storageCSV48 = storageCSV46.local("lastReading");
        java.lang.String[] strArray54 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV48.save(strArray54);
        storageCSV40.save(strArray54);
        storageCSV31.save(strArray54);
        storageCSV26.save(strArray54);
        java.util.List<laccan.devices.Sample> sampleList59 = storageCSV26.read();
        java.util.List<java.lang.Double> doubleList60 = laccan.cloud.prediction.Regression.makeTests(sampleList59);
        regression0.init(sampleList18, doubleList60);
        java.util.List<java.lang.Double> doubleList62 = laccan.cloud.prediction.Regression.makeTests(sampleList18);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(sampleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(sampleList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(sampleList18);
        org.junit.Assert.assertNotNull(storageCSV21);
        org.junit.Assert.assertNotNull(storageCSV23);
        org.junit.Assert.assertNotNull(sampleList24);
        org.junit.Assert.assertNotNull(storageCSV26);
        org.junit.Assert.assertNotNull(storageCSV29);
        org.junit.Assert.assertNotNull(storageCSV31);
        org.junit.Assert.assertNotNull(sampleList32);
        org.junit.Assert.assertNotNull(sampleList33);
        org.junit.Assert.assertNotNull(storageCSV35);
        org.junit.Assert.assertNotNull(storageCSV38);
        org.junit.Assert.assertNotNull(storageCSV40);
        org.junit.Assert.assertNotNull(sampleList41);
        org.junit.Assert.assertNotNull(storageCSV43);
        org.junit.Assert.assertNotNull(storageCSV46);
        org.junit.Assert.assertNotNull(storageCSV48);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(sampleList59);
        org.junit.Assert.assertNotNull(doubleList60);
        org.junit.Assert.assertNotNull(doubleList62);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test431");
        byte[] byteArray0 = new byte[] {};
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(byteArray0, (int) (short) -1);
        try {
            int int3 = micazMsg2.get_Voltage();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray0);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test432");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        int int16 = micazMsg13.get_NodeID();
        try {
            micazMsg13.set_Voltage((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 256 + "'", int16 == 256);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test433");
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
        regression0.train();
        double double61 = regression0.mse();
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
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test434");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(52, 0);
        int int3 = micazMsg2.dataLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test435");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        short short5 = micazMsg1.getElement_Buffer((int) (short) 0);
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1, (long) (short) 0);
        java.lang.String[] strArray8 = sample7.toCSV();
        java.lang.String str9 = sample7.getNode();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test436");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        net.tinyos.message.Message message6 = micazMsg2.clone((int) '4');
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        micazMsg8.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg8, (int) (byte) 0);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = micazMsg16.get_Buffer();
        java.lang.Object obj18 = micazMsg16.clone();
        micazMsg16.set_NodeID(20);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray23);
        micazMsg16.dataSet(byteArray23);
        micazMsg8.dataSet(byteArray23);
        micazMsg2.dataSet(byteArray23);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray23, 20);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg31, 0);
        short[] shortArray34 = micazMsg31.get_Buffer();
        short[] shortArray35 = micazMsg31.get_Buffer();
        try {
            micazMsg29.set_Buffer(shortArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length -18 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertNotNull(shortArray35);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test437");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 16, (long) 48, (int) (short) 100);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test438");
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
        double double18 = sample9.getDateDouble();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!;-19.699999999999996;0" + "'", str17.equals("hi!;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test439");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        micazMsg1.amTypeSet(8);
        net.tinyos.message.SerialPacket serialPacket13 = micazMsg1.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNull(serialPacket13);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test440");
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
        byte[] byteArray16 = null;
        try {
            micazMsg1.dataSet(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test441");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) 1, (long) (short) 10);
        java.lang.String str4 = sample3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;1.0;10" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;1.0;10"));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test442");
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
        double double28 = sample27.getTemperature();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(message26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-19.699999999999996d) + "'", double28 == (-19.699999999999996d));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test443");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test444");
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
        java.util.List<laccan.devices.Sample> sampleList56 = storageCSV10.read();
        laccan.persistence.StorageCSV storageCSV58 = storageCSV10.local("null;0.0;512");
        laccan.persistence.StorageCSV storageCSV60 = storageCSV10.local("");
        java.util.List<laccan.devices.Sample> sampleList61 = storageCSV60.read();
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
        org.junit.Assert.assertNotNull(sampleList56);
        org.junit.Assert.assertNotNull(storageCSV58);
        org.junit.Assert.assertNotNull(storageCSV60);
        org.junit.Assert.assertNotNull(sampleList61);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test445");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        java.lang.String str9 = micazMsg6.toString();
        short[] shortArray10 = micazMsg6.get_Buffer();
        byte[] byteArray11 = micazMsg6.dataGet();
        java.lang.Object obj12 = micazMsg6.clone();
        net.tinyos.message.Message message14 = micazMsg6.clone(2);
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray17);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray17, 2);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray17);
        micazMsg21.set_NodeID((int) (byte) 10);
        byte[] byteArray24 = micazMsg21.dataGet();
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray24);
        message14.dataSet(byteArray24);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray24, 0, (int) (short) 1);
        micazMsg1.dataSet(byteArray24);
        micazMsg1.set_NodeID(0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray24);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test446");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 10);
        micazMsg1.amTypeSet(1);
        byte[] byteArray12 = micazMsg1.dataGet();
        java.lang.Object obj13 = micazMsg1.clone();
        int int14 = micazMsg1.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test447");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (byte) 10, 35L, 52);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test448");
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
            laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg13, (long) 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test449");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(32);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test450");
        byte[] byteArray0 = null;
        try {
            laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(byteArray0, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test451");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (short) 1, (long) (byte) -1, 256);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test452");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        java.lang.String[] strArray4 = sample3.toCSV();
        java.lang.String str5 = sample3.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null;-19.699999999999996;0" + "'", str5.equals("null;-19.699999999999996;0"));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test453");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        micazMsg1.set_Voltage((int) (short) 100);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1, (long) 12);
        org.junit.Assert.assertNotNull(shortArray2);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test454");
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
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj14 = micazMsg13.clone();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg13, (long) 0);
        sample16.setDate((long) 24);
        memory0.add(sample16);
        int int20 = memory0.length();
        laccan.memory.Container container21 = memory0.getMemory();
        int int22 = memory0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(container21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test455");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        double double7 = sample6.getTemperature();
        sample6.setDate(3L);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-19.699999999999996d) + "'", double7 == (-19.699999999999996d));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test456");
        try {
            laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((-139), 24);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test457");
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
        laccan.persistence.StorageCSV storageCSV24 = new laccan.persistence.StorageCSV();
        java.util.List<laccan.devices.Sample> sampleList25 = storageCSV24.read();
        laccan.persistence.StorageCSV storageCSV26 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV28 = storageCSV26.local("hi!");
        laccan.persistence.StorageCSV storageCSV29 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray30 = new java.lang.String[] {};
        storageCSV29.save(strArray30);
        storageCSV26.save(strArray30);
        laccan.persistence.StorageCSV storageCSV34 = storageCSV26.local("nodes");
        laccan.persistence.StorageCSV storageCSV36 = storageCSV26.local("init");
        laccan.persistence.StorageCSV storageCSV38 = storageCSV36.local("reduction;-19.699999999999996;0");
        laccan.persistence.StorageCSV storageCSV40 = storageCSV36.local("lastReading");
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray43 = micazMsg42.get_Buffer();
        laccan.devices.Sample sample44 = new laccan.devices.Sample(micazMsg42);
        laccan.devices.Sample sample46 = new laccan.devices.Sample(micazMsg42, (long) (short) 10);
        double double47 = sample46.getDateDouble();
        java.lang.String[] strArray48 = sample46.toCSV();
        storageCSV36.save(strArray48);
        storageCSV24.save(strArray48);
        storageCSV10.save(strArray48);
        laccan.memory.data.reduction.KeepingAll keepingAll52 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList53 = keepingAll52.get();
        int int54 = keepingAll52.length();
        java.util.List<laccan.devices.Sample> sampleList55 = keepingAll52.get();
        laccan.devices.MicazMsg micazMsg57 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray58 = micazMsg57.get_Buffer();
        java.lang.Object obj59 = micazMsg57.clone();
        laccan.devices.Sample sample60 = new laccan.devices.Sample(micazMsg57);
        laccan.devices.Type type61 = null;
        sample60.setType(type61);
        laccan.devices.Type type63 = null;
        sample60.setType(type63);
        sample60.setNode("hi!");
        keepingAll52.add(sample60);
        laccan.devices.Type type68 = sample60.getType();
        java.lang.String[] strArray69 = sample60.toCSV();
        storageCSV10.save(strArray69);
        java.util.List<laccan.devices.Sample> sampleList71 = storageCSV10.read();
        laccan.devices.MicazMsg micazMsg73 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray74 = micazMsg73.get_Buffer();
        java.lang.Object obj75 = micazMsg73.clone();
        laccan.devices.Sample sample76 = new laccan.devices.Sample(micazMsg73);
        laccan.devices.Type type77 = null;
        sample76.setType(type77);
        java.lang.String str79 = sample76.toString();
        java.lang.String str80 = sample76.toString();
        java.lang.String[] strArray81 = sample76.toCSV();
        storageCSV10.save(strArray81);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV12);
        org.junit.Assert.assertNotNull(storageCSV14);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(sampleList25);
        org.junit.Assert.assertNotNull(storageCSV28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(storageCSV34);
        org.junit.Assert.assertNotNull(storageCSV36);
        org.junit.Assert.assertNotNull(storageCSV38);
        org.junit.Assert.assertNotNull(storageCSV40);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(sampleList53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(sampleList55);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNull(type68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(sampleList71);
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "null;-19.699999999999996;0" + "'", str79.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "null;-19.699999999999996;0" + "'", str80.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray81);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test458");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        memory0.build();
        int int3 = memory0.length();
        java.lang.Class<?> wildcardClass4 = memory0.getClass();
        laccan.memory.Container container5 = memory0.getMemory();
        memory0.build();
        laccan.memory.Container container7 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(container5);
        org.junit.Assert.assertNotNull(container7);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test459");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray3, (int) (byte) -1, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray3);
        micazMsg7.set_Voltage(35);
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test460");
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
        laccan.devices.MicazMsg micazMsg44 = new laccan.devices.MicazMsg(byteArray34, (int) (short) 10);
        int int45 = micazMsg44.amType();
        net.tinyos.message.SerialPacket serialPacket46 = micazMsg44.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 172 + "'", int45 == 172);
        org.junit.Assert.assertNull(serialPacket46);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test461");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        memory0.build();
        laccan.memory.Container container4 = memory0.getMemory();
        laccan.memory.Container container5 = memory0.getMemory();
        int int6 = memory0.length();
        int int7 = memory0.length();
        memory0.build();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertNotNull(container5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test462");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(6, 5);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test463");
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
        micazMsg18.set_NodeID(2);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(message20);
        org.junit.Assert.assertNotNull(shortArray21);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test464");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        short short12 = micazMsg1.getElement_Buffer(0);
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        double double14 = sample13.getTemperature();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-19.699999999999996d) + "'", double14 == (-19.699999999999996d));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test465");
        laccan.devices.helper.utils.Assistant.predictorType = "null;-19.699999999999996;0;-19.699999999999996;0";
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test466");
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
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray15, (int) (short) 1);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray15);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test467");
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
        short[] shortArray60 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg54.set_Buffer(shortArray60);
        laccan.devices.Sample sample62 = new laccan.devices.Sample(micazMsg54);
        laccan.devices.Sample sample63 = new laccan.devices.Sample();
        laccan.devices.Type type64 = laccan.devices.Type.FULL;
        sample63.setType(type64);
        sample62.setType(type64);
        keepingAll0.add(sample62);
        int int68 = keepingAll0.length();
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
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertTrue("'" + type64 + "' != '" + laccan.devices.Type.FULL + "'", type64.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 4 + "'", int68 == 4);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test468");
        laccan.devices.MicazMsg micazMsg0 = new laccan.devices.MicazMsg();
        int int1 = micazMsg0.amType();
        try {
            micazMsg0.setElement_Buffer((int) 'a', (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 172 + "'", int1 == 172);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test469");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(0, 96);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test470");
        laccan.devices.helper.utils.Assistant.reducerType = "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;1.0;10";
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test471");
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
        double double52 = regression0.mse();
        regression0.train();
        try {
            java.util.List<java.lang.Double> doubleList54 = regression0.result();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
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
        org.junit.Assert.assertEquals((double) double52, Double.NaN, 0);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test472");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test473");
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
        java.util.List<laccan.devices.Sample> sampleList37 = keepingAll0.get();
        laccan.devices.Sample sample38 = new laccan.devices.Sample();
        laccan.devices.Type type39 = laccan.devices.Type.FULL;
        sample38.setType(type39);
        double double41 = sample38.getDateDouble();
        sample38.setDate((long) 100);
        keepingAll0.add(sample38);
        laccan.devices.Sample sample48 = new laccan.devices.Sample("null;-19.699999999999996;0", (double) 160, (long) (short) 1);
        keepingAll0.add(sample48);
        sample48.setNode(";-19.699999999999996;0");
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
        org.junit.Assert.assertNotNull(sampleList37);
        org.junit.Assert.assertTrue("'" + type39 + "' != '" + laccan.devices.Type.FULL + "'", type39.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test474");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        java.lang.String str7 = sample4.toString();
        java.lang.String str8 = sample4.getNode();
        long long9 = sample4.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null;-19.699999999999996;0" + "'", str7.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test475");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(512);
        byte[] byteArray2 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 2);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg4);
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test476");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(256, 65535);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test477");
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
        try {
            laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 32, data_length 97 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNull(serialPacket3);
        org.junit.Assert.assertNotNull(byteArray10);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test478");
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
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray26 = micazMsg25.get_Buffer();
        java.lang.Object obj27 = micazMsg25.clone();
        java.lang.String str28 = micazMsg25.toString();
        short[] shortArray29 = micazMsg25.get_Buffer();
        byte[] byteArray30 = micazMsg25.dataGet();
        java.lang.Object obj31 = micazMsg25.clone();
        laccan.devices.Sample sample32 = new laccan.devices.Sample(micazMsg25);
        int int33 = micazMsg25.dataLength();
        int int34 = micazMsg25.baseOffset();
        laccan.devices.Sample sample35 = new laccan.devices.Sample(micazMsg25);
        short[] shortArray36 = micazMsg25.get_Buffer();
        micazMsg2.set_Buffer(shortArray36);
        net.tinyos.message.Message message39 = micazMsg2.clone((int) ' ');
        int int40 = micazMsg2.baseOffset();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str28.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(message39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test479");
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
        double double60 = regression0.mse();
        try {
            java.util.List<java.lang.Double> doubleList61 = regression0.result();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
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
        org.junit.Assert.assertEquals((double) double60, Double.NaN, 0);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test480");
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
        int int19 = micazMsg18.dataLength();
        try {
            laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length -30 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-30) + "'", int19 == (-30));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test481");
        laccan.devices.helper.utils.Assistant.predictorType = "null;-19.699999999999996;35";
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test482");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        java.lang.String str7 = micazMsg1.toString();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray10, 1);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray10);
        micazMsg14.init(48);
        short[] shortArray17 = micazMsg14.get_Buffer();
        micazMsg1.set_Buffer(shortArray17);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        int int21 = micazMsg20.dataLength();
        java.lang.Object obj22 = micazMsg20.clone();
        short short24 = micazMsg20.getElement_Buffer(0);
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray27);
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray27, 2);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg(byteArray27);
        net.tinyos.message.Message message33 = micazMsg31.clone(160);
        micazMsg20.dataSet((net.tinyos.message.Message) micazMsg31, 0);
        micazMsg20.set_Voltage(3);
        micazMsg20.set_Voltage(4);
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg20, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 0 + "'", short24 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertNotNull(message33);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test483");
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
        laccan.persistence.StorageCSV storageCSV16 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray17 = new java.lang.String[] {};
        storageCSV16.save(strArray17);
        storageCSV13.save(strArray17);
        storageCSV10.save(strArray17);
        java.util.List<laccan.devices.Sample> sampleList21 = storageCSV10.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV12);
        org.junit.Assert.assertNotNull(storageCSV15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(sampleList21);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test484");
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
        memory0.build();
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
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test485");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) (byte) 100);
        micazMsg1.amTypeSet(2);
        java.lang.Object obj9 = micazMsg1.clone();
        java.lang.String str10 = micazMsg1.toString();
        java.lang.String str11 = micazMsg1.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str10.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test486");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        double double2 = regression0.mse();
        double double3 = regression0.mse();
        double double4 = regression0.mse();
        laccan.cloud.prediction.Regression regression5 = new laccan.cloud.prediction.Regression();
        double double6 = regression5.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll7 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList8 = keepingAll7.get();
        laccan.cloud.prediction.Regression regression9 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        java.lang.Object obj13 = micazMsg11.clone();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg11);
        laccan.devices.Sample sample15 = new laccan.devices.Sample();
        laccan.devices.Sample sample16 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray17 = new laccan.devices.Sample[] { sample14, sample15, sample16 };
        java.util.ArrayList<laccan.devices.Sample> sampleList18 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList18, sampleArray17);
        java.util.List<java.lang.Double> doubleList20 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList18);
        java.util.List<java.lang.Double> doubleList21 = regression9.result(doubleList20);
        regression5.init(sampleList8, doubleList20);
        laccan.cloud.prediction.Regression regression23 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray26 = micazMsg25.get_Buffer();
        java.lang.Object obj27 = micazMsg25.clone();
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg25);
        laccan.devices.Sample sample29 = new laccan.devices.Sample();
        laccan.devices.Sample sample30 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray31 = new laccan.devices.Sample[] { sample28, sample29, sample30 };
        java.util.ArrayList<laccan.devices.Sample> sampleList32 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList32, sampleArray31);
        java.util.List<java.lang.Double> doubleList34 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList32);
        java.util.List<java.lang.Double> doubleList35 = regression23.result(doubleList34);
        java.util.List<java.lang.Double> doubleList36 = regression5.result(doubleList34);
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
        java.util.List<java.lang.Double> doubleList55 = null;
        regression5.init(sampleList40, doubleList55);
        regression5.train();
        laccan.cloud.prediction.Regression regression58 = new laccan.cloud.prediction.Regression();
        double double59 = regression58.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll60 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList61 = keepingAll60.get();
        laccan.cloud.prediction.Regression regression62 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg64 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray65 = micazMsg64.get_Buffer();
        java.lang.Object obj66 = micazMsg64.clone();
        laccan.devices.Sample sample67 = new laccan.devices.Sample(micazMsg64);
        laccan.devices.Sample sample68 = new laccan.devices.Sample();
        laccan.devices.Sample sample69 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray70 = new laccan.devices.Sample[] { sample67, sample68, sample69 };
        java.util.ArrayList<laccan.devices.Sample> sampleList71 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList71, sampleArray70);
        java.util.List<java.lang.Double> doubleList73 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList71);
        java.util.List<java.lang.Double> doubleList74 = regression62.result(doubleList73);
        regression58.init(sampleList61, doubleList73);
        laccan.cloud.prediction.Regression regression76 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg78 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray79 = micazMsg78.get_Buffer();
        java.lang.Object obj80 = micazMsg78.clone();
        laccan.devices.Sample sample81 = new laccan.devices.Sample(micazMsg78);
        laccan.devices.Sample sample82 = new laccan.devices.Sample();
        laccan.devices.Sample sample83 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray84 = new laccan.devices.Sample[] { sample81, sample82, sample83 };
        java.util.ArrayList<laccan.devices.Sample> sampleList85 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList85, sampleArray84);
        java.util.List<java.lang.Double> doubleList87 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList85);
        java.util.List<java.lang.Double> doubleList88 = regression76.result(doubleList87);
        java.util.List<java.lang.Double> doubleList89 = regression58.result(doubleList87);
        java.util.List<java.lang.Double> doubleList90 = regression5.result(doubleList87);
        java.util.List<java.lang.Double> doubleList91 = regression0.result(doubleList87);
        try {
            regression0.train();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double2, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double3, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double4, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double6, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList8);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(sampleArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(doubleList20);
        org.junit.Assert.assertNotNull(doubleList21);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(sampleArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(doubleList34);
        org.junit.Assert.assertNotNull(doubleList35);
        org.junit.Assert.assertNotNull(doubleList36);
        org.junit.Assert.assertEquals((double) double38, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList40);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(sampleArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleList52);
        org.junit.Assert.assertNotNull(doubleList53);
        org.junit.Assert.assertEquals((double) double59, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList61);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(sampleArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(doubleList73);
        org.junit.Assert.assertNotNull(doubleList74);
        org.junit.Assert.assertNotNull(shortArray79);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertNotNull(sampleArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(doubleList87);
        org.junit.Assert.assertNotNull(doubleList88);
        org.junit.Assert.assertNotNull(doubleList89);
        org.junit.Assert.assertNotNull(doubleList90);
        org.junit.Assert.assertNotNull(doubleList91);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test487");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.set_NodeID((int) (byte) -1);
        int int5 = micazMsg1.amType();
        try {
            laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 96, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 172 + "'", int5 == 172);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test488");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (byte) 100, 96);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test489");
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
        double double62 = regression0.mse();
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
        org.junit.Assert.assertEquals((double) double62, Double.NaN, 0);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test490");
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
        regression0.train();
        laccan.cloud.prediction.Regression regression53 = new laccan.cloud.prediction.Regression();
        double double54 = regression53.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll55 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList56 = keepingAll55.get();
        laccan.cloud.prediction.Regression regression57 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg59 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray60 = micazMsg59.get_Buffer();
        java.lang.Object obj61 = micazMsg59.clone();
        laccan.devices.Sample sample62 = new laccan.devices.Sample(micazMsg59);
        laccan.devices.Sample sample63 = new laccan.devices.Sample();
        laccan.devices.Sample sample64 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray65 = new laccan.devices.Sample[] { sample62, sample63, sample64 };
        java.util.ArrayList<laccan.devices.Sample> sampleList66 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList66, sampleArray65);
        java.util.List<java.lang.Double> doubleList68 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList66);
        java.util.List<java.lang.Double> doubleList69 = regression57.result(doubleList68);
        regression53.init(sampleList56, doubleList68);
        regression53.train();
        java.util.List<java.lang.Double> doubleList72 = regression53.result();
        laccan.cloud.prediction.Regression regression73 = new laccan.cloud.prediction.Regression();
        double double74 = regression73.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll75 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList76 = keepingAll75.get();
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
        regression73.init(sampleList76, doubleList88);
        regression73.train();
        java.util.List<java.lang.Double> doubleList92 = regression73.result();
        java.util.List<java.lang.Double> doubleList93 = regression53.result(doubleList92);
        java.util.List<java.lang.Double> doubleList94 = regression0.result(doubleList92);
        regression0.train();
        double double96 = regression0.mse();
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
        org.junit.Assert.assertEquals((double) double54, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList56);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(sampleArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(doubleList68);
        org.junit.Assert.assertNotNull(doubleList69);
        org.junit.Assert.assertNotNull(doubleList72);
        org.junit.Assert.assertEquals((double) double74, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList76);
        org.junit.Assert.assertNotNull(shortArray80);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertNotNull(sampleArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(doubleList88);
        org.junit.Assert.assertNotNull(doubleList89);
        org.junit.Assert.assertNotNull(doubleList92);
        org.junit.Assert.assertNotNull(doubleList93);
        org.junit.Assert.assertNotNull(doubleList94);
        org.junit.Assert.assertEquals((double) double96, Double.NaN, 0);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test491");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, 2);
        micazMsg1.dataSet(byteArray7);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray7, (int) (short) 10);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray7);
        try {
            laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg15, 52, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 52, data_length 10 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test492");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test493");
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
            laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg16, 3, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 2, data_length 65535 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test494");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 10);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (short) 1);
        int int12 = micazMsg11.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test495");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) 0.0f, (long) (short) 1);
        sample3.setTemperature(32.0d);
        java.lang.String[] strArray6 = sample3.toCSV();
        sample3.setDate((long) (short) 100);
        java.lang.String str9 = sample3.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;32.0;100" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;32.0;100"));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test496");
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
        double double40 = regression0.mse();
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
        org.junit.Assert.assertEquals((double) double40, Double.NaN, 0);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test497");
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
            laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg12, (long) 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 172 + "'", int13 == 172);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
        org.junit.Assert.assertNull(serialPacket15);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test498");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) (short) 0);
        try {
            short short3 = micazMsg1.getElement_Buffer(64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test499");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        net.tinyos.message.Message message6 = micazMsg1.clone(3);
        micazMsg1.amTypeSet((int) (byte) 1);
        byte[] byteArray9 = micazMsg1.dataGet();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test500");
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
        int int19 = micazMsg10.dataLength();
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray22 = micazMsg21.get_Buffer();
        java.lang.Object obj23 = micazMsg21.clone();
        int int24 = micazMsg21.get_NodeID();
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray27);
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray27, 2);
        micazMsg21.dataSet(byteArray27);
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg(byteArray27);
        micazMsg10.dataSet(byteArray27);
        try {
            laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg(byteArray27, (int) 'a', 512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 97, data_length 512 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
    }
}

