package laccan.regression;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test001");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        short short5 = micazMsg1.getElement_Buffer((int) (short) 0);
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(172);
        byte[] byteArray9 = micazMsg8.dataGet();
        try {
            micazMsg1.dataSet(byteArray9, (int) (short) 1, 8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test002");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(20, 2);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test003");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        int int9 = micazMsg1.dataLength();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg1, 0L);
        java.lang.String str12 = sample11.toString();
        laccan.devices.Type type13 = sample11.getType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null;-19.699999999999996;0" + "'", str12.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(type13);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test004");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 0, 3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test005");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(52, 0);
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg2);
        java.lang.String str4 = sample3.getNode();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj8 = micazMsg7.clone();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg7, (long) 0);
        java.lang.String str11 = sample10.getNode();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg13);
        long long17 = sample16.getDate();
        java.lang.Class<?> wildcardClass18 = sample16.getClass();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = micazMsg20.get_Buffer();
        java.lang.Object obj22 = micazMsg20.clone();
        laccan.devices.Sample sample23 = new laccan.devices.Sample(micazMsg20);
        long long24 = sample23.getDate();
        laccan.devices.Type type25 = laccan.devices.Type.FULL;
        sample23.setType(type25);
        sample16.setType(type25);
        sample10.setType(type25);
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray31 = micazMsg30.get_Buffer();
        java.lang.Object obj32 = micazMsg30.clone();
        laccan.devices.Sample sample33 = new laccan.devices.Sample(micazMsg30);
        laccan.devices.Type type34 = null;
        sample33.setType(type34);
        sample33.setNode("");
        laccan.devices.Type type38 = laccan.devices.Type.REDUCE;
        sample33.setType(type38);
        sample10.setType(type38);
        sample3.setType(type38);
        double double42 = sample3.getDateDouble();
        java.lang.String str43 = sample3.toString();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + laccan.devices.Type.FULL + "'", type25.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + type38 + "' != '" + laccan.devices.Type.REDUCE + "'", type38.equals(laccan.devices.Type.REDUCE));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "null;-19.699999999999996;0" + "'", str43.equals("null;-19.699999999999996;0"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test006");
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
        java.lang.Class<?> wildcardClass21 = memory0.getClass();
        java.lang.Class<?> wildcardClass22 = memory0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test007");
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
        storageCSV4.save(strArray35);
        laccan.persistence.StorageCSV storageCSV40 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV42 = storageCSV40.local("hi!");
        laccan.persistence.StorageCSV storageCSV44 = storageCSV42.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList45 = storageCSV44.read();
        laccan.persistence.StorageCSV storageCSV47 = storageCSV44.local("memory");
        laccan.persistence.StorageCSV storageCSV48 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV50 = storageCSV48.local("hi!");
        laccan.persistence.StorageCSV storageCSV52 = storageCSV50.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList53 = storageCSV52.read();
        java.util.List<laccan.devices.Sample> sampleList54 = storageCSV52.read();
        laccan.persistence.StorageCSV storageCSV56 = storageCSV52.local("");
        laccan.persistence.StorageCSV storageCSV57 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV59 = storageCSV57.local("hi!");
        laccan.persistence.StorageCSV storageCSV61 = storageCSV59.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList62 = storageCSV61.read();
        laccan.persistence.StorageCSV storageCSV64 = storageCSV61.local("memory");
        laccan.persistence.StorageCSV storageCSV65 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV67 = storageCSV65.local("hi!");
        laccan.persistence.StorageCSV storageCSV69 = storageCSV67.local("lastReading");
        java.lang.String[] strArray75 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV69.save(strArray75);
        storageCSV61.save(strArray75);
        storageCSV52.save(strArray75);
        storageCSV44.save(strArray75);
        storageCSV4.save(strArray75);
        java.util.List<laccan.devices.Sample> sampleList81 = storageCSV4.read();
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
        org.junit.Assert.assertNotNull(storageCSV47);
        org.junit.Assert.assertNotNull(storageCSV50);
        org.junit.Assert.assertNotNull(storageCSV52);
        org.junit.Assert.assertNotNull(sampleList53);
        org.junit.Assert.assertNotNull(sampleList54);
        org.junit.Assert.assertNotNull(storageCSV56);
        org.junit.Assert.assertNotNull(storageCSV59);
        org.junit.Assert.assertNotNull(storageCSV61);
        org.junit.Assert.assertNotNull(sampleList62);
        org.junit.Assert.assertNotNull(storageCSV64);
        org.junit.Assert.assertNotNull(storageCSV67);
        org.junit.Assert.assertNotNull(storageCSV69);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(sampleList81);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test008");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 10);
        micazMsg9.setElement_Buffer((int) (short) 0, (short) 0);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg9, 0);
        micazMsg9.set_Voltage((int) (short) 100);
        org.junit.Assert.assertNotNull(shortArray2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test009");
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
        try {
            int int24 = micazMsg23.get_Voltage();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x64]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 " + "'", str20.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x64]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 "));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test010");
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
        java.util.List<java.lang.Double> doubleList41 = regression0.result();
        java.util.List<java.lang.Double> doubleList42 = regression0.result();
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
        org.junit.Assert.assertNotNull(doubleList41);
        org.junit.Assert.assertNotNull(doubleList42);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test011");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        int int5 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) '#', (int) (short) 1);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg10.set_Buffer(shortArray16);
        int int18 = micazMsg10.get_NodeID();
        int int19 = micazMsg10.amType();
        micazMsg10.set_NodeID(0);
        java.lang.Object obj22 = micazMsg10.clone();
        net.tinyos.message.SerialPacket serialPacket23 = micazMsg10.getSerialPacket();
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) serialPacket23, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 172 + "'", int19 == 172);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(serialPacket23);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test012");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 1);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        micazMsg6.init(48);
        int int9 = micazMsg6.get_NodeID();
        java.lang.Object obj10 = micazMsg6.clone();
        int int11 = micazMsg6.baseOffset();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test013");
        int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 128 + "'", int1 == 128);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test014");
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
        java.util.List<laccan.devices.Sample> sampleList18 = keepingAll0.get();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(sampleList18);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test015");
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
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg12, (-30));
        try {
            laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (128) or length (16), for data_length 17 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test016");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) -1, 24);
        java.lang.String str3 = micazMsg2.toString();
        try {
            laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, 52L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length -1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str3.equals("Message <MicazMsg> \n  [Buffer="));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test017");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(24, 0);
        net.tinyos.message.SerialPacket serialPacket3 = micazMsg2.getSerialPacket();
        net.tinyos.message.Message message5 = micazMsg2.clone((int) (byte) 1);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = micazMsg7.get_Buffer();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg7);
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg7, (long) (short) 10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        micazMsg13.set_NodeID(20);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray20);
        micazMsg13.dataSet(byteArray20);
        short short24 = micazMsg13.getElement_Buffer(0);
        net.tinyos.message.Message message26 = micazMsg13.clone((int) (byte) 100);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(message26, 10);
        byte[] byteArray29 = micazMsg28.dataGet();
        micazMsg7.dataSet(byteArray29);
        try {
            message5.dataSet(byteArray29, 100, 5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(serialPacket3);
        org.junit.Assert.assertNotNull(message5);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 0 + "'", short24 == (short) 0);
        org.junit.Assert.assertNotNull(message26);
        org.junit.Assert.assertNotNull(byteArray29);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test018");
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
        byte[] byteArray17 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray17);
        byte[] byteArray19 = micazMsg18.dataGet();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray19);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test019");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer(96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test020");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test021");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, (long) 0);
        sample5.setDate((long) 24);
        sample5.setDate((long) (byte) 0);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test022");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        byte[] byteArray7 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, (int) (short) -1);
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg10, 1L);
        laccan.devices.Type type13 = sample12.getType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNull(type13);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test023");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", 0.0d, 100L);
        laccan.devices.Type type4 = sample3.getType();
        org.junit.Assert.assertNull(type4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test024");
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
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg13);
        long long17 = sample16.getDate();
        laccan.devices.Type type18 = laccan.devices.Type.FULL;
        sample16.setType(type18);
        sample16.setNode("reduction");
        laccan.devices.Type type22 = sample16.getType();
        sample4.setType(type22);
        java.lang.String str24 = sample4.toString();
        laccan.devices.Type type25 = sample4.getType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + laccan.devices.Type.FULL + "'", type18.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + laccan.devices.Type.FULL + "'", type22.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "reduction;-19.699999999999996;0" + "'", str24.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + laccan.devices.Type.FULL + "'", type25.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test025");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        net.tinyos.message.SerialPacket serialPacket13 = micazMsg1.getSerialPacket();
        int int14 = micazMsg1.get_NodeID();
        try {
            short[] shortArray15 = micazMsg1.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (128) or length (16), for data_length 16 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNull(serialPacket13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test026");
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
        double double17 = sample15.getTemperature();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-19.699999999999996d) + "'", double17 == (-19.699999999999996d));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test027");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(24, 0);
        net.tinyos.message.SerialPacket serialPacket3 = micazMsg2.getSerialPacket();
        net.tinyos.message.Message message5 = micazMsg2.clone((int) (byte) 1);
        int int6 = message5.baseOffset();
        org.junit.Assert.assertNull(serialPacket3);
        org.junit.Assert.assertNotNull(message5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test028");
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
        double double41 = regression0.mse();
        regression0.train();
        laccan.cloud.prediction.Regression regression43 = new laccan.cloud.prediction.Regression();
        double double44 = regression43.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll45 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList46 = keepingAll45.get();
        laccan.cloud.prediction.Regression regression47 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg49 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray50 = micazMsg49.get_Buffer();
        java.lang.Object obj51 = micazMsg49.clone();
        laccan.devices.Sample sample52 = new laccan.devices.Sample(micazMsg49);
        laccan.devices.Sample sample53 = new laccan.devices.Sample();
        laccan.devices.Sample sample54 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray55 = new laccan.devices.Sample[] { sample52, sample53, sample54 };
        java.util.ArrayList<laccan.devices.Sample> sampleList56 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList56, sampleArray55);
        java.util.List<java.lang.Double> doubleList58 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList56);
        java.util.List<java.lang.Double> doubleList59 = regression47.result(doubleList58);
        regression43.init(sampleList46, doubleList58);
        laccan.cloud.prediction.Regression regression61 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg63 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray64 = micazMsg63.get_Buffer();
        java.lang.Object obj65 = micazMsg63.clone();
        laccan.devices.Sample sample66 = new laccan.devices.Sample(micazMsg63);
        laccan.devices.Sample sample67 = new laccan.devices.Sample();
        laccan.devices.Sample sample68 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray69 = new laccan.devices.Sample[] { sample66, sample67, sample68 };
        java.util.ArrayList<laccan.devices.Sample> sampleList70 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList70, sampleArray69);
        java.util.List<java.lang.Double> doubleList72 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList70);
        java.util.List<java.lang.Double> doubleList73 = regression61.result(doubleList72);
        java.util.List<java.lang.Double> doubleList74 = regression43.result(doubleList72);
        double double75 = regression43.mse();
        laccan.cloud.prediction.Regression regression76 = new laccan.cloud.prediction.Regression();
        double double77 = regression76.mse();
        double double78 = regression76.mse();
        java.util.List<laccan.devices.Sample> sampleList79 = null;
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
        regression76.init(sampleList79, doubleList90);
        java.util.List<java.lang.Double> doubleList92 = regression43.result(doubleList90);
        java.util.List<java.lang.Double> doubleList93 = regression0.result(doubleList92);
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
        org.junit.Assert.assertEquals((double) double41, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double44, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList46);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(sampleArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(doubleList58);
        org.junit.Assert.assertNotNull(doubleList59);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNotNull(sampleArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(doubleList72);
        org.junit.Assert.assertNotNull(doubleList73);
        org.junit.Assert.assertNotNull(doubleList74);
        org.junit.Assert.assertEquals((double) double75, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double77, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double78, Double.NaN, 0);
        org.junit.Assert.assertNotNull(shortArray82);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertNotNull(sampleArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(doubleList90);
        org.junit.Assert.assertNotNull(doubleList92);
        org.junit.Assert.assertNotNull(doubleList93);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test029");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(48, 0);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test030");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        memory0.build();
        int int4 = memory0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test031");
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
        java.util.List<java.lang.Double> doubleList21 = regression0.result();
        regression0.train();
        java.util.List<java.lang.Double> doubleList23 = regression0.result();
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
        org.junit.Assert.assertNotNull(doubleList21);
        org.junit.Assert.assertNotNull(doubleList23);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test032");
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
        laccan.devices.MicazMsg micazMsg68 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray74 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg68.set_Buffer(shortArray74);
        laccan.devices.Sample sample76 = new laccan.devices.Sample(micazMsg68);
        java.lang.String[] strArray77 = sample76.toCSV();
        java.lang.String str78 = sample76.getNode();
        sample76.setDate((long) 32);
        keepingAll0.add(sample76);
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
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNull(str78);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test033");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 1);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray2, 64);
        try {
            laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg8, (long) (-139));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length -62 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test034");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer(128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test035");
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
        laccan.persistence.StorageCSV storageCSV72 = storageCSV10.local("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
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
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test036");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("init");
        laccan.persistence.StorageCSV storageCSV9 = storageCSV4.local("lastReading");
        laccan.persistence.StorageCSV storageCSV11 = storageCSV9.local("init");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(storageCSV11);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test037");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 512);
        micazMsg2.set_Voltage(16);
        micazMsg2.init(100);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = micazMsg14.get_Buffer();
        java.lang.Object obj16 = micazMsg14.clone();
        micazMsg14.set_NodeID(20);
        short[] shortArray21 = new short[] { (byte) -1, (short) 0 };
        micazMsg14.set_Buffer(shortArray21);
        micazMsg12.set_Buffer(shortArray21);
        micazMsg2.set_Buffer(shortArray21);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(shortArray21);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test038");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        java.lang.String[] strArray10 = sample9.toCSV();
        java.lang.String str11 = sample9.getNode();
        sample9.setDate((long) 32);
        java.lang.String str14 = sample9.toString();
        sample9.setDate((long) (-139));
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null;-19.648499999999995;32" + "'", str14.equals("null;-19.648499999999995;32"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test039");
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
        java.lang.Class<?> wildcardClass28 = micazMsg12.getClass();
        try {
            laccan.devices.Sample sample30 = new laccan.devices.Sample(micazMsg12, (long) (byte) 0);
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test040");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(96, 65);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test041");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        java.lang.String str7 = sample4.getNode();
        laccan.memory.data.reduction.KeepingAll keepingAll8 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList9 = keepingAll8.get();
        int int10 = keepingAll8.length();
        java.util.List<laccan.devices.Sample> sampleList11 = keepingAll8.get();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg13);
        laccan.devices.Type type17 = null;
        sample16.setType(type17);
        laccan.devices.Type type19 = null;
        sample16.setType(type19);
        sample16.setNode("hi!");
        keepingAll8.add(sample16);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray26 = micazMsg25.get_Buffer();
        java.lang.Object obj27 = micazMsg25.clone();
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg25);
        laccan.devices.Type type29 = null;
        sample28.setType(type29);
        java.lang.String str31 = sample28.toString();
        java.lang.String str32 = sample28.getNode();
        keepingAll8.add(sample28);
        laccan.devices.Sample sample34 = new laccan.devices.Sample();
        laccan.devices.Type type35 = laccan.devices.Type.FULL;
        sample34.setType(type35);
        sample28.setType(type35);
        double double38 = sample28.getTemperature();
        laccan.devices.MicazMsg micazMsg40 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray41 = micazMsg40.get_Buffer();
        java.lang.Object obj42 = micazMsg40.clone();
        laccan.devices.Sample sample43 = new laccan.devices.Sample(micazMsg40);
        long long44 = sample43.getDate();
        laccan.devices.Type type45 = laccan.devices.Type.FULL;
        sample43.setType(type45);
        sample28.setType(type45);
        java.lang.String str48 = sample28.getNode();
        laccan.memory.data.reduction.KeepingAll keepingAll49 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList50 = keepingAll49.get();
        int int51 = keepingAll49.length();
        laccan.memory.data.reduction.KeepingAll keepingAll52 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample53 = new laccan.devices.Sample();
        keepingAll52.add(sample53);
        sample53.setDate(10L);
        keepingAll49.add(sample53);
        laccan.memory.data.reduction.KeepingAll keepingAll58 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList59 = keepingAll58.get();
        int int60 = keepingAll58.length();
        java.util.List<laccan.devices.Sample> sampleList61 = keepingAll58.get();
        laccan.devices.MicazMsg micazMsg63 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray64 = micazMsg63.get_Buffer();
        java.lang.Object obj65 = micazMsg63.clone();
        laccan.devices.Sample sample66 = new laccan.devices.Sample(micazMsg63);
        laccan.devices.Type type67 = null;
        sample66.setType(type67);
        laccan.devices.Type type69 = null;
        sample66.setType(type69);
        sample66.setNode("hi!");
        keepingAll58.add(sample66);
        laccan.devices.MicazMsg micazMsg75 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray76 = micazMsg75.get_Buffer();
        java.lang.Object obj77 = micazMsg75.clone();
        laccan.devices.Sample sample78 = new laccan.devices.Sample(micazMsg75);
        laccan.devices.Type type79 = null;
        sample78.setType(type79);
        java.lang.String str81 = sample78.toString();
        java.lang.String str82 = sample78.getNode();
        keepingAll58.add(sample78);
        laccan.devices.Sample sample84 = new laccan.devices.Sample();
        laccan.devices.Type type85 = laccan.devices.Type.FULL;
        sample84.setType(type85);
        sample78.setType(type85);
        sample53.setType(type85);
        sample28.setType(type85);
        sample4.setType(type85);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(sampleList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(sampleList11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "null;-19.699999999999996;0" + "'", str31.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + type35 + "' != '" + laccan.devices.Type.FULL + "'", type35.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-19.699999999999996d) + "'", double38 == (-19.699999999999996d));
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + type45 + "' != '" + laccan.devices.Type.FULL + "'", type45.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(sampleList50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(sampleList59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(sampleList61);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNotNull(shortArray76);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "null;-19.699999999999996;0" + "'", str81.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertTrue("'" + type85 + "' != '" + laccan.devices.Type.FULL + "'", type85.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test042");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 10, (int) (short) -1);
        micazMsg2.init(2);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        micazMsg6.amTypeSet(20);
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg6);
        java.lang.Object obj12 = micazMsg6.clone();
        net.tinyos.message.Message message14 = micazMsg6.clone((int) ' ');
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg17.amTypeSet(2);
        laccan.devices.Sample sample21 = new laccan.devices.Sample(micazMsg17, (long) 512);
        micazMsg17.set_Voltage(16);
        byte[] byteArray24 = micazMsg17.dataGet();
        short[] shortArray25 = micazMsg17.get_Buffer();
        micazMsg6.set_Buffer(shortArray25);
        short[] shortArray27 = micazMsg6.get_Buffer();
        try {
            micazMsg2.set_Buffer(shortArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray27);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test043");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        memory0.build();
        laccan.memory.Container container4 = memory0.getMemory();
        int int5 = container4.length();
        java.util.List<laccan.devices.Sample> sampleList6 = container4.get();
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(sampleList6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test044");
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
        try {
            short short17 = micazMsg1.getElement_Buffer(12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test045");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) 10, (long) 32);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test046");
        laccan.devices.helper.utils.Assistant.predictorType = "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 ";
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test047");
        net.tinyos.message.Message message0 = null;
        try {
            laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(message0, 24, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test048");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg(byteArray2, 16);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2, 172);
        byte[] byteArray7 = micazMsg6.dataGet();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test049");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory;-19.699999999999996;-1;10.0;-1", 0.0d, (long) 512);
        sample3.setDate((long) 160);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test050");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(12, (int) 'a');
        try {
            laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg2, (long) 512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (96) or length (16), for data_length 12 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test051");
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
        java.lang.String str21 = sample15.toString();
        sample15.setNode("reduction;-19.699999999999996;0");
        sample15.setTemperature((double) '4');
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray28 = micazMsg27.get_Buffer();
        java.lang.Object obj29 = micazMsg27.clone();
        laccan.devices.Sample sample30 = new laccan.devices.Sample(micazMsg27);
        long long31 = sample30.getDate();
        laccan.devices.Type type32 = laccan.devices.Type.FULL;
        sample30.setType(type32);
        sample30.setNode("reduction");
        java.lang.Class<?> wildcardClass36 = sample30.getClass();
        laccan.devices.Type type37 = sample30.getType();
        sample15.setType(type37);
        sample3.setType(type37);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + type17 + "' != '" + laccan.devices.Type.FULL + "'", type17.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "reduction;-19.699999999999996;0" + "'", str21.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + type32 + "' != '" + laccan.devices.Type.FULL + "'", type32.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + type37 + "' != '" + laccan.devices.Type.FULL + "'", type37.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test052");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (short) 10, (long) 64, 65);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test053");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(32, 65);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test054");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(24, 0);
        net.tinyos.message.SerialPacket serialPacket3 = micazMsg2.getSerialPacket();
        try {
            int int4 = serialPacket3.dataLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(serialPacket3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test055");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.dataLength();
        java.lang.Object obj3 = micazMsg1.clone();
        short short5 = micazMsg1.getElement_Buffer(0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray8, 2);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8);
        net.tinyos.message.Message message14 = micazMsg12.clone(160);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg12, 0);
        laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(message14);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test056");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        net.tinyos.message.Message message6 = micazMsg2.clone((int) '4');
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg2);
        micazMsg2.set_NodeID((-30));
        org.junit.Assert.assertNotNull(message6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test057");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList4 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList5 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList6 = keepingAll0.get();
        int int7 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList8 = keepingAll0.get();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(sampleList8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test058");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(100, (int) (short) 1);
        net.tinyos.message.Message message4 = micazMsg2.clone(96);
        int int5 = micazMsg2.amType();
        org.junit.Assert.assertNotNull(message4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 172 + "'", int5 == 172);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test059");
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
        try {
            int int15 = micazMsg14.get_Voltage();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test060");
        laccan.devices.helper.utils.Assistant.reducerType = "null;1.0;0";
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test061");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 24);
        short[] shortArray3 = micazMsg2.get_Buffer();
        micazMsg2.init(8);
        org.junit.Assert.assertNotNull(shortArray3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test062");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer((-30));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test063");
        laccan.devices.helper.utils.Assistant.predictorType = "Message <MicazMsg> \n  [NodeID=0x18]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n";
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test064");
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
        laccan.devices.Type type17 = sample8.getType();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(type16);
        org.junit.Assert.assertNull(type17);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test065");
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
        int int21 = memory0.length();
        int int22 = memory0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test066");
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
        try {
            micazMsg8.setElement_Buffer((-1), (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test067");
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
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg1);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test068");
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
        try {
            laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 128, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(shortArray20);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test069");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        int int11 = micazMsg1.dataLength();
        short[] shortArray12 = micazMsg1.get_Buffer();
        net.tinyos.message.Message message14 = micazMsg1.clone((int) (short) 100);
        micazMsg1.amTypeSet(172);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(message14);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test070");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray3 = micazMsg2.get_Buffer();
        java.lang.Object obj4 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2);
        laccan.devices.Type type6 = null;
        sample5.setType(type6);
        keepingAll0.add(sample5);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg10.set_Buffer(shortArray16);
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg10);
        laccan.devices.Sample sample19 = new laccan.devices.Sample();
        laccan.devices.Type type20 = laccan.devices.Type.FULL;
        sample19.setType(type20);
        sample18.setType(type20);
        double double23 = sample18.getDateDouble();
        java.lang.String str24 = sample18.toString();
        long long25 = sample18.getDate();
        keepingAll0.add(sample18);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + laccan.devices.Type.FULL + "'", type20.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "null;-19.648499999999995;0" + "'", str24.equals("null;-19.648499999999995;0"));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test071");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) (byte) 100);
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray9);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray9, 2);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray9);
        net.tinyos.message.Message message15 = micazMsg13.clone(160);
        try {
            micazMsg1.dataSet(message15, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(message15);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test072");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1);
        short[] shortArray8 = micazMsg1.get_Buffer();
        int int9 = micazMsg1.baseOffset();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg1, (long) 3);
        sample11.setDate((long) (-139));
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test073");
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
        int int12 = memory0.length();
        laccan.memory.Container container13 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        int int18 = micazMsg15.get_NodeID();
        micazMsg15.setElement_Buffer(1, (short) (byte) 0);
        laccan.devices.Sample sample23 = new laccan.devices.Sample(micazMsg15, (long) 512);
        sample23.setDate((long) (byte) 100);
        memory0.add(sample23);
        sample23.setNode("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(container13);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test074");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 512);
        java.lang.String str7 = sample6.toString();
        java.lang.String str8 = sample6.getNode();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null;-19.699999999999996;512" + "'", str7.equals("null;-19.699999999999996;512"));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test075");
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
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(message14, 20);
        try {
            short short20 = micazMsg18.getElement_Buffer((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test076");
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
        double double17 = sample14.getTemperature();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "memory" + "'", str15.equals("memory"));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test077");
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
        micazMsg15.init((int) (short) 100);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg15, (-1));
        micazMsg33.set_Voltage(0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test078");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        java.lang.Object obj10 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg1);
        int int13 = micazMsg1.get_Voltage();
        micazMsg1.set_Voltage((int) (byte) 0);
        micazMsg1.amTypeSet(1);
        java.lang.String str18 = micazMsg1.toString();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str18.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test079");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        int int15 = micazMsg12.get_NodeID();
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray18);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray18, 2);
        micazMsg12.dataSet(byteArray18);
        int int23 = micazMsg12.baseOffset();
        byte[] byteArray24 = micazMsg12.dataGet();
        micazMsg1.dataSet(byteArray24);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray24, (int) (byte) 0);
        int int28 = micazMsg27.get_NodeID();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 256 + "'", int28 == 256);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test080");
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
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg1);
        micazMsg1.init(172);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test081");
        laccan.devices.helper.utils.Assistant.predictorType = "hi!;-19.699999999999996;0";
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test082");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, (long) 0);
        sample5.setDate((long) 24);
        double double8 = sample5.getDateDouble();
        long long9 = sample5.getDate();
        long long10 = sample5.getDate();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 24.0d + "'", double8 == 24.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 24L + "'", long9 == 24L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 24L + "'", long10 == 24L);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test083");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("memory");
        laccan.persistence.StorageCSV storageCSV9 = storageCSV7.local("null;-19.699999999999996;0");
        java.util.List<laccan.devices.Sample> sampleList10 = storageCSV7.read();
        java.util.List<java.lang.Double> doubleList11 = laccan.cloud.prediction.Regression.makeTests(sampleList10);
        java.util.List<java.lang.Double> doubleList12 = laccan.cloud.prediction.Regression.makeTests(sampleList10);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(sampleList10);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(doubleList12);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test084");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (byte) 10, 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test085");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        micazMsg3.set_NodeID((int) (byte) 0);
        micazMsg3.init(6);
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test086");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test087");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(2, (int) ' ');
        int int3 = micazMsg2.amType();
        int int4 = micazMsg2.baseOffset();
        int int5 = micazMsg2.amType();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 172 + "'", int3 == 172);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 172 + "'", int5 == 172);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test088");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (-19.699999999999996d), 0L);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test089");
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
        laccan.memory.data.reduction.KeepingAll keepingAll18 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList19 = keepingAll18.get();
        int int20 = keepingAll18.length();
        int int21 = keepingAll18.length();
        java.util.List<laccan.devices.Sample> sampleList22 = keepingAll18.get();
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray30 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg24.set_Buffer(shortArray30);
        laccan.devices.Sample sample32 = new laccan.devices.Sample(micazMsg24);
        java.lang.String[] strArray33 = sample32.toCSV();
        java.lang.String str34 = sample32.getNode();
        keepingAll18.add(sample32);
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray38 = micazMsg37.get_Buffer();
        java.lang.Object obj39 = micazMsg37.clone();
        laccan.devices.Sample sample40 = new laccan.devices.Sample(micazMsg37);
        long long41 = sample40.getDate();
        java.lang.Class<?> wildcardClass42 = sample40.getClass();
        laccan.devices.MicazMsg micazMsg44 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray45 = micazMsg44.get_Buffer();
        java.lang.Object obj46 = micazMsg44.clone();
        laccan.devices.Sample sample47 = new laccan.devices.Sample(micazMsg44);
        long long48 = sample47.getDate();
        laccan.devices.Type type49 = laccan.devices.Type.FULL;
        sample47.setType(type49);
        sample40.setType(type49);
        laccan.devices.MicazMsg micazMsg53 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray59 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg53.set_Buffer(shortArray59);
        laccan.devices.Sample sample61 = new laccan.devices.Sample(micazMsg53);
        laccan.devices.Sample sample62 = new laccan.devices.Sample();
        laccan.devices.Type type63 = laccan.devices.Type.FULL;
        sample62.setType(type63);
        sample61.setType(type63);
        sample40.setType(type63);
        keepingAll18.add(sample40);
        memory0.add(sample40);
        int int69 = memory0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(sampleList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(sampleList22);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + type49 + "' != '" + laccan.devices.Type.FULL + "'", type49.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertTrue("'" + type63 + "' != '" + laccan.devices.Type.FULL + "'", type63.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test090");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer(12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test091");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray8);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray8, 160);
        java.lang.String str14 = micazMsg13.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str14.equals("Message <MicazMsg> \n  [Buffer="));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test092");
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
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, (int) (short) 0);
        net.tinyos.message.SerialPacket serialPacket19 = micazMsg18.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNull(serialPacket19);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test093");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone(2);
        byte[] byteArray10 = micazMsg1.dataGet();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg1, (long) 128);
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
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test094");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        byte[] byteArray7 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, (int) (short) -1);
        micazMsg10.amTypeSet((-1));
        short[] shortArray13 = micazMsg10.get_Buffer();
        short[] shortArray14 = micazMsg10.get_Buffer();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(shortArray14);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test095");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (byte) -1, (long) (short) 10, 1);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test096");
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
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray14, (int) (short) 0, (int) (short) -1);
        try {
            micazMsg23.set_Voltage((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length -1 in class class laccan.devices.MicazMsg");
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
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test097");
        laccan.devices.helper.utils.Assistant.predictorType = "lastReading";
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test098");
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
        java.lang.String[] strArray20 = sample13.toCSV();
        long long21 = sample13.getDate();
        double double22 = sample13.getTemperature();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-19.648499999999995d) + "'", double22 == (-19.648499999999995d));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test099");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.dataLength();
        java.lang.Object obj3 = micazMsg1.clone();
        short short5 = micazMsg1.getElement_Buffer(0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray8, 2);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8);
        net.tinyos.message.Message message14 = micazMsg12.clone(160);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg12, 0);
        int int17 = micazMsg12.dataLength();
        try {
            laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg12, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 96, data_length 24 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test100");
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
        java.lang.String str31 = sample4.toString();
        double double32 = sample4.getTemperature();
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
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "null;-19.699999999999996;0" + "'", str31.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-19.699999999999996d) + "'", double32 == (-19.699999999999996d));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test101");
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
            serialPacket15.amTypeSet(4);
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
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test102");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        micazMsg1.set_NodeID((int) (byte) -1);
        int int7 = micazMsg1.baseOffset();
        java.lang.Object obj8 = micazMsg1.clone();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(512);
        byte[] byteArray11 = micazMsg10.dataGet();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray11);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray11, (int) (byte) 1);
        micazMsg1.dataSet(byteArray11);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(byteArray11);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test103");
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
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray15);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray15);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test104");
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
        java.lang.Double[] doubleArray59 = new java.lang.Double[] { (-1.0d), (-19.699999999999996d), 2.0d, 16.0d, 1.0d, 1.0d, 1.0d, 100.0d };
        java.util.ArrayList<java.lang.Double> doubleList60 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList60, doubleArray59);
        java.util.List<java.lang.Double> doubleList62 = regression0.result((java.util.List<java.lang.Double>) doubleList60);
        java.lang.Class<?> wildcardClass63 = doubleList62.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(doubleList62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test105");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.set_NodeID((int) (byte) -1);
        int int5 = micazMsg1.amType();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 5);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg7, 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 172 + "'", int5 == 172);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test106");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.699999999999996;52", 52.0d, (long) 2);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test107");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 20, (long) 20, 48);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test108");
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
        java.util.List<laccan.devices.Sample> sampleList52 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList53 = keepingAll0.get();
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
        org.junit.Assert.assertNotNull(sampleList52);
        org.junit.Assert.assertNotNull(sampleList53);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test109");
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
        sample4.setTemperature((double) 4);
        java.lang.Class<?> wildcardClass13 = sample4.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null;-19.699999999999996;0" + "'", str9.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null;-19.699999999999996;0" + "'", str10.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test110");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("reduction", (double) 172, 0L);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test111");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        int int4 = micazMsg2.get_NodeID();
        micazMsg2.init((int) 'a');
        micazMsg2.amTypeSet(6);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test112");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray6, 32, 10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray6, 32, (int) (short) 0);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray6, (int) (byte) 0, 16);
        try {
            laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray6, 100, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 100, data_length 20 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test113");
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
        java.lang.String str38 = micazMsg8.toString();
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
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str38.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test114");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        micazMsg1.set_NodeID((int) (byte) -1);
        short[] shortArray7 = micazMsg1.get_Buffer();
        int int8 = micazMsg1.amType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 172 + "'", int8 == 172);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test115");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        int int4 = micazMsg2.get_NodeID();
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) (byte) -1);
        micazMsg2.setElement_Buffer((int) (short) 0, (short) (byte) 100);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        java.lang.Object obj13 = micazMsg11.clone();
        java.lang.String str14 = micazMsg11.toString();
        short[] shortArray15 = micazMsg11.get_Buffer();
        byte[] byteArray16 = micazMsg11.dataGet();
        java.lang.Object obj17 = micazMsg11.clone();
        net.tinyos.message.Message message19 = micazMsg11.clone(2);
        byte[] byteArray20 = micazMsg11.dataGet();
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray20);
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray20);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray20);
        net.tinyos.message.SerialPacket serialPacket24 = micazMsg23.getSerialPacket();
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray27 = micazMsg26.get_Buffer();
        java.lang.Object obj28 = micazMsg26.clone();
        int int29 = micazMsg26.get_NodeID();
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray32 = micazMsg31.get_Buffer();
        micazMsg26.set_Buffer(shortArray32);
        micazMsg23.set_Buffer(shortArray32);
        micazMsg2.set_Buffer(shortArray32);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str14.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(message19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNull(serialPacket24);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(shortArray32);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test116");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.set_NodeID((int) (byte) -1);
        net.tinyos.message.Message message6 = micazMsg1.clone(0);
        try {
            net.tinyos.message.Message message8 = message6.clone((-30));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(message6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test117");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        java.lang.String[] strArray4 = sample3.toCSV();
        java.lang.String[] strArray5 = sample3.toCSV();
        java.lang.String[] strArray6 = sample3.toCSV();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test118");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(24, (int) (byte) 10);
        int int3 = micazMsg2.amType();
        net.tinyos.message.Message message5 = micazMsg2.clone(6);
        micazMsg2.set_NodeID((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 172 + "'", int3 == 172);
        org.junit.Assert.assertNotNull(message5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test119");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        java.lang.Object obj10 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg1);
        java.lang.Object obj13 = micazMsg1.clone();
        int int14 = micazMsg1.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test120");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        double double7 = sample6.getTemperature();
        java.lang.String str8 = sample6.toString();
        java.lang.String str9 = sample6.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-19.699999999999996d) + "'", double7 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null;-19.699999999999996;0" + "'", str8.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null;-19.699999999999996;0" + "'", str9.equals("null;-19.699999999999996;0"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test121");
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
        int int22 = micazMsg18.baseOffset();
        net.tinyos.message.Message message24 = micazMsg18.clone((int) 'a');
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(message20);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(message24);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test122");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.get_NodeID();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test123");
        laccan.devices.helper.utils.Assistant.reducerType = "null;0.0;0";
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test124");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        java.util.List<laccan.devices.Sample> sampleList1 = storageCSV0.read();
        laccan.persistence.StorageCSV storageCSV3 = storageCSV0.local("memory;-1.0;32");
        laccan.persistence.StorageCSV storageCSV5 = storageCSV0.local("");
        java.lang.String[] strArray9 = new java.lang.String[] { "null;-19.648499999999995;0", "lastReading", "reduction" };
        storageCSV5.save(strArray9);
        java.util.List<laccan.devices.Sample> sampleList11 = storageCSV5.read();
        laccan.persistence.StorageCSV storageCSV13 = storageCSV5.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertNotNull(storageCSV3);
        org.junit.Assert.assertNotNull(storageCSV5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(sampleList11);
        org.junit.Assert.assertNotNull(storageCSV13);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test125");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        int int8 = micazMsg7.dataLength();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) ' ', 1);
        try {
            micazMsg7.dataSet((net.tinyos.message.Message) micazMsg11, 172);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test126");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.699999999999996;512", (double) (byte) 1, (long) (short) 10);
        sample3.setDate((long) 65);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test127");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(12, (int) 'a');
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray5 = micazMsg4.get_Buffer();
        java.lang.Object obj6 = micazMsg4.clone();
        micazMsg4.set_NodeID(20);
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray11);
        micazMsg4.dataSet(byteArray11);
        short short15 = micazMsg4.getElement_Buffer(0);
        net.tinyos.message.Message message17 = micazMsg4.clone((int) (byte) 100);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(message17, 10);
        byte[] byteArray20 = micazMsg19.dataGet();
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray20, 3);
        try {
            micazMsg2.dataSet(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
        org.junit.Assert.assertNotNull(message17);
        org.junit.Assert.assertNotNull(byteArray20);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test128");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        java.lang.String str4 = micazMsg1.toString();
        micazMsg1.amTypeSet((int) ' ');
        micazMsg1.set_NodeID(96);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test129");
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
        java.lang.String[] strArray33 = sample26.toCSV();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertTrue("'" + type28 + "' != '" + laccan.devices.Type.FULL + "'", type28.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "null;-19.648499999999995;0" + "'", str31.equals("null;-19.648499999999995;0"));
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test130");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        int int13 = micazMsg1.get_Voltage();
        int int14 = micazMsg1.dataLength();
        int int15 = micazMsg1.amType();
        int int16 = micazMsg1.get_NodeID();
        java.lang.String str17 = micazMsg1.toString();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 172 + "'", int15 == 172);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 " + "'", str17.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 "));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test131");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        int int11 = micazMsg1.baseOffset();
        java.lang.Object obj12 = micazMsg1.clone();
        try {
            laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) '#', 65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 35, data_length 65 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test132");
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
        byte[] byteArray16 = null;
        try {
            micazMsg1.dataSet(byteArray16, (-1), 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(shortArray15);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test133");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) 'a', 100);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test134");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        java.lang.Object obj10 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg13, 0);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg15, (int) (short) 0);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(256);
        short[] shortArray20 = micazMsg19.get_Buffer();
        micazMsg15.set_Buffer(shortArray20);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertNotNull(shortArray20);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test135");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) ' ');
        java.lang.String str12 = micazMsg1.toString();
        java.lang.Object obj13 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket14 = micazMsg1.getSerialPacket();
        net.tinyos.message.Message message16 = micazMsg1.clone((int) (byte) 10);
        short[] shortArray17 = micazMsg1.get_Buffer();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(serialPacket14);
        org.junit.Assert.assertNotNull(message16);
        org.junit.Assert.assertNotNull(shortArray17);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test136");
        laccan.devices.helper.utils.Assistant.reducerType = "reduction;-19.699999999999996;0;-1.0;0";
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test137");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        net.tinyos.message.SerialPacket serialPacket6 = micazMsg1.getSerialPacket();
        byte[] byteArray7 = micazMsg1.dataGet();
        try {
            micazMsg1.setElement_Buffer((int) ' ', (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(serialPacket6);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test138");
        laccan.devices.MicazMsg micazMsg0 = new laccan.devices.MicazMsg();
        laccan.devices.Sample sample1 = new laccan.devices.Sample(micazMsg0);
        sample1.setTemperature(0.0d);
        java.lang.String[] strArray4 = sample1.toCSV();
        java.lang.String str5 = sample1.getNode();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test139");
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
        storageCSV4.save(strArray35);
        java.util.List<laccan.devices.Sample> sampleList40 = storageCSV4.read();
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg((int) '4');
        int int43 = micazMsg42.dataLength();
        net.tinyos.message.SerialPacket serialPacket44 = micazMsg42.getSerialPacket();
        laccan.devices.Sample sample46 = new laccan.devices.Sample(micazMsg42, (long) (byte) 10);
        laccan.devices.MicazMsg micazMsg49 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj50 = micazMsg49.clone();
        laccan.devices.Sample sample52 = new laccan.devices.Sample(micazMsg49, (long) 0);
        java.lang.String str53 = sample52.getNode();
        laccan.devices.MicazMsg micazMsg55 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray56 = micazMsg55.get_Buffer();
        java.lang.Object obj57 = micazMsg55.clone();
        laccan.devices.Sample sample58 = new laccan.devices.Sample(micazMsg55);
        long long59 = sample58.getDate();
        java.lang.Class<?> wildcardClass60 = sample58.getClass();
        laccan.devices.MicazMsg micazMsg62 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray63 = micazMsg62.get_Buffer();
        java.lang.Object obj64 = micazMsg62.clone();
        laccan.devices.Sample sample65 = new laccan.devices.Sample(micazMsg62);
        long long66 = sample65.getDate();
        laccan.devices.Type type67 = laccan.devices.Type.FULL;
        sample65.setType(type67);
        sample58.setType(type67);
        sample52.setType(type67);
        sample46.setType(type67);
        java.lang.String[] strArray72 = sample46.toCSV();
        storageCSV4.save(strArray72);
        laccan.persistence.StorageCSV storageCSV75 = storageCSV4.local("Message <MicazMsg> \n  [NodeID=0x64]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
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
        org.junit.Assert.assertNotNull(sampleList40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
        org.junit.Assert.assertNull(serialPacket44);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + type67 + "' != '" + laccan.devices.Type.FULL + "'", type67.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(storageCSV75);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test140");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        micazMsg1.amTypeSet(52);
        short short7 = micazMsg1.getElement_Buffer(0);
        micazMsg1.setElement_Buffer(4, (short) 100);
        int int11 = micazMsg1.get_Voltage();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        micazMsg13.set_NodeID(20);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray20);
        micazMsg13.dataSet(byteArray20);
        int int23 = micazMsg13.dataLength();
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test141");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (short) 100, 64);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test142");
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
        micazMsg14.set_Voltage((int) (short) -1);
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
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test143");
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
        sample20.setDate((long) (byte) 10);
        double double33 = sample20.getTemperature();
        java.lang.String str34 = sample20.toString();
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-19.699999999999996d) + "'", double33 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "null;-19.699999999999996;10" + "'", str34.equals("null;-19.699999999999996;10"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test144");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.set_NodeID((int) (byte) -1);
        net.tinyos.message.SerialPacket serialPacket5 = micazMsg1.getSerialPacket();
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
        laccan.devices.Sample sample40 = new laccan.devices.Sample(micazMsg38);
        int int41 = micazMsg38.get_NodeID();
        byte[] byteArray42 = micazMsg38.dataGet();
        laccan.devices.MicazMsg micazMsg43 = new laccan.devices.MicazMsg(byteArray42);
        micazMsg36.dataSet(byteArray42, 8, (int) (byte) 0, 0);
        try {
            serialPacket5.dataSet(byteArray42, 0, (int) (byte) -1, (-139));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(serialPacket5);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test145");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        int int8 = micazMsg1.dataLength();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        micazMsg10.amTypeSet(20);
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg10);
        java.lang.Object obj16 = micazMsg10.clone();
        net.tinyos.message.Message message18 = micazMsg10.clone((int) ' ');
        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray21, 16);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray21);
        message18.dataSet(byteArray21);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray21, 0);
        try {
            micazMsg1.dataSet(byteArray21, 32, (-1), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(message18);
        org.junit.Assert.assertNotNull(byteArray21);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test146");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        net.tinyos.message.Message message5 = micazMsg3.clone(10);
        int int6 = micazMsg3.dataLength();
        java.lang.Object obj7 = micazMsg3.clone();
        micazMsg3.amTypeSet(24);
        net.tinyos.message.SerialPacket serialPacket10 = micazMsg3.getSerialPacket();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        micazMsg12.set_NodeID(20);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray19);
        micazMsg12.dataSet(byteArray19);
        short short23 = micazMsg12.getElement_Buffer(0);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray26 = micazMsg25.get_Buffer();
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg25);
        int int28 = micazMsg25.get_NodeID();
        byte[] byteArray29 = micazMsg25.dataGet();
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg(byteArray29, 100);
        micazMsg12.dataSet(byteArray29);
        try {
            micazMsg3.dataSet(byteArray29, (int) '4', 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(message5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(serialPacket10);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test147");
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
        java.util.List<laccan.devices.Sample> sampleList40 = storageCSV7.read();
        java.util.List<laccan.devices.Sample> sampleList41 = storageCSV7.read();
        java.util.List<java.lang.Double> doubleList42 = laccan.cloud.prediction.Regression.makeTests(sampleList41);
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
        org.junit.Assert.assertNotNull(sampleList40);
        org.junit.Assert.assertNotNull(sampleList41);
        org.junit.Assert.assertNotNull(doubleList42);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test148");
        laccan.devices.helper.utils.Assistant.predictorType = "Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=;NaN;35";
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test149");
        laccan.devices.helper.utils.Assistant.reducerType = "null;-19.699999999999996;10";
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test150");
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
        micazMsg1.init((int) (short) 10);
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
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test151");
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
        sample20.setTemperature((double) 0.0f);
        sample20.setTemperature((double) (-139));
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
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test152");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        memory0.build();
        int int4 = memory0.length();
        laccan.memory.Container container5 = memory0.getMemory();
        java.util.List<laccan.devices.Sample> sampleList6 = container5.get();
        java.util.List<laccan.devices.Sample> sampleList7 = container5.get();
        int int8 = container5.length();
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(container5);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(sampleList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test153");
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
        sample15.setTemperature((double) '4');
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test154");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        micazMsg1.amTypeSet(512);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, 32);
        short short12 = micazMsg10.getElement_Buffer((int) (short) 0);
        try {
            laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg10, 172, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 172, data_length 0 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test155");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        double double7 = sample4.getDateDouble();
        sample4.setDate((long) 512);
        java.lang.String[] strArray10 = sample4.toCSV();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test156");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(20);
        micazMsg1.set_Voltage(256);
        micazMsg1.init((int) 'a');
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test157");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        micazMsg1.set_NodeID((int) (byte) -1);
        java.lang.String str7 = micazMsg1.toString();
        short[] shortArray8 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        java.lang.Object obj13 = micazMsg11.clone();
        int int14 = micazMsg11.get_NodeID();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray17);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray17, 2);
        micazMsg11.dataSet(byteArray17);
        int int22 = micazMsg11.baseOffset();
        micazMsg11.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg11, (int) (short) 10);
        byte[] byteArray27 = micazMsg11.dataGet();
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray27);
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray27, (int) 'a');
        try {
            micazMsg1.dataSet(byteArray27, 5, 512, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test158");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, (long) 0);
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg2, (long) (byte) 10);
        net.tinyos.message.SerialPacket serialPacket8 = micazMsg2.getSerialPacket();
        int int9 = micazMsg2.get_Voltage();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test159");
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
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        micazMsg17.set_NodeID(20);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray24);
        micazMsg17.dataSet(byteArray24);
        int int27 = micazMsg17.dataLength();
        java.lang.Object obj28 = micazMsg17.clone();
        short[] shortArray29 = micazMsg17.get_Buffer();
        try {
            micazMsg14.set_Buffer(shortArray29);
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
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(shortArray29);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test160");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1);
        double double8 = sample7.getDateDouble();
        sample7.setDate((long) (short) 0);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg12);
        laccan.devices.Type type16 = null;
        sample15.setType(type16);
        java.lang.String str18 = sample15.toString();
        sample15.setTemperature((double) (short) 10);
        laccan.devices.Type type21 = sample15.getType();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = micazMsg23.get_Buffer();
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg23);
        int int26 = micazMsg23.dataLength();
        micazMsg23.init((int) '4');
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg23);
        double double30 = sample29.getDateDouble();
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray38 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg32.set_Buffer(shortArray38);
        laccan.devices.Sample sample40 = new laccan.devices.Sample(micazMsg32);
        laccan.devices.Sample sample41 = new laccan.devices.Sample();
        laccan.devices.Type type42 = laccan.devices.Type.FULL;
        sample41.setType(type42);
        sample40.setType(type42);
        sample40.setTemperature((double) 'a');
        laccan.devices.Type type47 = sample40.getType();
        sample29.setType(type47);
        sample15.setType(type47);
        sample7.setType(type47);
        sample7.setTemperature((double) 65535);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null;-19.699999999999996;0" + "'", str18.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(type21);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertTrue("'" + type42 + "' != '" + laccan.devices.Type.FULL + "'", type42.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type47 + "' != '" + laccan.devices.Type.FULL + "'", type47.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test161");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        int int2 = micazMsg1.amType();
        micazMsg1.set_NodeID((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172 + "'", int2 == 172);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test162");
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
        java.lang.Class<?> wildcardClass87 = storageCSV10.getClass();
        java.util.List<laccan.devices.Sample> sampleList88 = storageCSV10.read();
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
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNotNull(sampleList88);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test163");
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
        micazMsg1.set_NodeID(3);
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
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test164");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        int int10 = micazMsg1.amType();
        net.tinyos.message.Message message12 = micazMsg1.clone((int) (byte) 100);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = micazMsg14.get_Buffer();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg14);
        int int17 = micazMsg14.get_NodeID();
        byte[] byteArray18 = micazMsg14.dataGet();
        try {
            message12.dataSet(byteArray18, (-30), (int) (byte) -1, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 172 + "'", int10 == 172);
        org.junit.Assert.assertNotNull(message12);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test165");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("init");
        java.util.List<laccan.devices.Sample> sampleList8 = storageCSV4.read();
        java.lang.Class<?> wildcardClass9 = storageCSV4.getClass();
        laccan.persistence.StorageCSV storageCSV11 = storageCSV4.local("");
        java.util.List<laccan.devices.Sample> sampleList12 = storageCSV11.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(sampleList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(sampleList12);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test166");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray6, 24);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg10, 1);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = micazMsg14.get_Buffer();
        java.lang.Object obj16 = micazMsg14.clone();
        java.lang.String str17 = micazMsg14.toString();
        short[] shortArray18 = micazMsg14.get_Buffer();
        byte[] byteArray19 = micazMsg14.dataGet();
        java.lang.Object obj20 = micazMsg14.clone();
        net.tinyos.message.Message message22 = micazMsg14.clone(2);
        byte[] byteArray23 = micazMsg14.dataGet();
        java.lang.Class<?> wildcardClass24 = micazMsg14.getClass();
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg14, (long) (short) 100);
        micazMsg14.init(8);
        try {
            micazMsg12.dataSet((net.tinyos.message.Message) micazMsg14, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str17.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(message22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test167");
        net.tinyos.message.Message message0 = null;
        try {
            laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(message0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test168");
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
        try {
            int int14 = micazMsg13.get_Voltage();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length -48 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test169");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test170");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        int int3 = keepingAll0.length();
        int int4 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList5 = keepingAll0.get();
        laccan.memory.data.reduction.KeepingAll keepingAll6 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList7 = keepingAll6.get();
        int int8 = keepingAll6.length();
        java.util.List<laccan.devices.Sample> sampleList9 = keepingAll6.get();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        java.lang.Object obj13 = micazMsg11.clone();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg11);
        laccan.devices.Type type15 = null;
        sample14.setType(type15);
        laccan.devices.Type type17 = null;
        sample14.setType(type17);
        sample14.setNode("hi!");
        keepingAll6.add(sample14);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = micazMsg23.get_Buffer();
        java.lang.Object obj25 = micazMsg23.clone();
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg23);
        laccan.devices.Type type27 = null;
        sample26.setType(type27);
        java.lang.String str29 = sample26.toString();
        java.lang.String str30 = sample26.getNode();
        keepingAll6.add(sample26);
        java.util.List<laccan.devices.Sample> sampleList32 = keepingAll6.get();
        laccan.devices.Sample sample33 = new laccan.devices.Sample();
        double double34 = sample33.getDateDouble();
        double double35 = sample33.getDateDouble();
        sample33.setTemperature((double) 1);
        double double38 = sample33.getDateDouble();
        laccan.devices.MicazMsg micazMsg40 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray46 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg40.set_Buffer(shortArray46);
        laccan.devices.Sample sample48 = new laccan.devices.Sample(micazMsg40);
        laccan.devices.Sample sample49 = new laccan.devices.Sample();
        laccan.devices.Type type50 = laccan.devices.Type.FULL;
        sample49.setType(type50);
        sample48.setType(type50);
        double double53 = sample48.getDateDouble();
        double double54 = sample48.getTemperature();
        laccan.devices.Type type55 = sample48.getType();
        sample33.setType(type55);
        keepingAll6.add(sample33);
        keepingAll0.add(sample33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(sampleList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(sampleList9);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "null;-19.699999999999996;0" + "'", str29.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(sampleList32);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertTrue("'" + type50 + "' != '" + laccan.devices.Type.FULL + "'", type50.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-19.648499999999995d) + "'", double54 == (-19.648499999999995d));
        org.junit.Assert.assertTrue("'" + type55 + "' != '" + laccan.devices.Type.FULL + "'", type55.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test171");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        micazMsg1.set_NodeID(0);
        try {
            short short9 = micazMsg1.getElement_Buffer((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test172");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1);
        java.lang.String str6 = sample5.toString();
        double double7 = sample5.getTemperature();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null;-19.699999999999996;0" + "'", str6.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-19.699999999999996d) + "'", double7 == (-19.699999999999996d));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test173");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray3, (int) (byte) -1, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray3);
        try {
            laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray3, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 52, data_length -1 and data array size 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test174");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory;-19.699999999999996;-1;10.0;-1", 32.0d, 10L);
        sample3.setDate((long) 512);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test175");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 20);
        java.lang.Object obj11 = micazMsg1.clone();
        int int12 = micazMsg1.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test176");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("memory");
        java.lang.String[] strArray8 = laccan.devices.helper.utils.Assistant.environments;
        storageCSV4.save(strArray8);
        laccan.persistence.StorageCSV storageCSV10 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray11 = new java.lang.String[] {};
        storageCSV10.save(strArray11);
        storageCSV4.save(strArray11);
        laccan.persistence.StorageCSV storageCSV15 = storageCSV4.local("null;97.0;100");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(storageCSV15);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test177");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.get_NodeID();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        try {
            laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 52, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test178");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        laccan.devices.Type type6 = laccan.devices.Type.FULL;
        sample4.setType(type6);
        sample4.setNode("reduction");
        java.lang.String str10 = sample4.toString();
        java.lang.String str11 = sample4.toString();
        long long12 = sample4.getDate();
        java.lang.String str13 = sample4.getNode();
        double double14 = sample4.getTemperature();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "reduction;-19.699999999999996;0" + "'", str10.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "reduction;-19.699999999999996;0" + "'", str11.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "reduction" + "'", str13.equals("reduction"));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-19.699999999999996d) + "'", double14 == (-19.699999999999996d));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test179");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        micazMsg1.amTypeSet(52);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray10, 48);
        micazMsg1.dataSet(byteArray10);
        try {
            laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray10, 97, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 97, data_length -1 and data array size 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test180");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray4 = micazMsg3.get_Buffer();
        java.lang.Object obj5 = micazMsg3.clone();
        micazMsg3.set_NodeID(20);
        short[] shortArray10 = new short[] { (byte) -1, (short) 0 };
        micazMsg3.set_Buffer(shortArray10);
        micazMsg1.set_Buffer(shortArray10);
        int int13 = micazMsg1.amType();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) '4');
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 172 + "'", int13 == 172);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test181");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        java.lang.String str6 = sample5.getNode();
        java.lang.String str7 = sample5.getNode();
        long long8 = sample5.getDate();
        double double9 = sample5.getTemperature();
        sample5.setNode("hi!");
        sample5.setDate(24L);
        sample5.setTemperature((double) (byte) 1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-19.699999999999996d) + "'", double9 == (-19.699999999999996d));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test182");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 ", (double) 100L, (long) 6);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test183");
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
        regression0.train();
        regression0.train();
        double double53 = regression0.mse();
        java.util.List<java.lang.Double> doubleList54 = regression0.result();
        double double55 = regression0.mse();
        double double56 = regression0.mse();
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
        org.junit.Assert.assertEquals((double) double53, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList54);
        org.junit.Assert.assertEquals((double) double55, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double56, Double.NaN, 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test184");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=", Double.NaN, (long) '#');
        java.lang.String[] strArray4 = sample3.toCSV();
        sample3.setTemperature((double) 0);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test185");
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
        laccan.devices.MicazMsg micazMsg86 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray87 = micazMsg86.get_Buffer();
        micazMsg86.set_NodeID((int) (byte) -1);
        laccan.devices.Sample sample91 = new laccan.devices.Sample(micazMsg86, (long) 'a');
        keepingAll0.add(sample91);
        laccan.devices.Type type93 = sample91.getType();
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
        org.junit.Assert.assertNotNull(shortArray87);
        org.junit.Assert.assertNull(type93);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test186");
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
        try {
            micazMsg1.setElement_Buffer((-139), (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test187");
        byte[] byteArray0 = null;
        try {
            laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(byteArray0, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test188");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        sample4.setDate((long) '#');
        sample4.setTemperature((double) 32L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test189");
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
        int int28 = memory0.length();
        int int29 = memory0.length();
        int int30 = memory0.length();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test190");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        java.lang.String str16 = micazMsg13.toString();
        java.lang.Class<?> wildcardClass17 = micazMsg13.getClass();
        java.lang.Object obj18 = micazMsg13.clone();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=" + "'", str16.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer="));
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test191");
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
        java.lang.String str14 = sample4.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null;-19.699999999999996;0" + "'", str7.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null;10.0;0" + "'", str14.equals("null;10.0;0"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test192");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test193");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(51, 256);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test194");
        laccan.devices.Sample sample0 = new laccan.devices.Sample();
        double double1 = sample0.getDateDouble();
        double double2 = sample0.getDateDouble();
        sample0.setTemperature((double) 1);
        laccan.devices.Type type5 = sample0.getType();
        double double6 = sample0.getDateDouble();
        java.lang.String str7 = sample0.toString();
        long long8 = sample0.getDate();
        java.lang.String str9 = sample0.getNode();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null;1.0;0" + "'", str7.equals("null;1.0;0"));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test195");
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
        int int25 = micazMsg7.baseOffset();
        int int26 = micazMsg7.baseOffset();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test196");
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
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj17 = micazMsg16.clone();
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg16, (long) 0);
        java.lang.String str20 = sample19.getNode();
        long long21 = sample19.getDate();
        memory0.add(sample19);
        laccan.memory.Container container23 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(container23);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test197");
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
        int int21 = memory0.length();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = micazMsg23.get_Buffer();
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg23);
        int int26 = micazMsg23.dataLength();
        micazMsg23.init((int) '4');
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg23);
        double double30 = sample29.getDateDouble();
        memory0.add(sample29);
        laccan.memory.Container container32 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(container32);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test198");
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
        int int16 = micazMsg2.dataLength();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        java.lang.Object obj20 = micazMsg18.clone();
        java.lang.String str21 = micazMsg18.toString();
        short[] shortArray22 = micazMsg18.get_Buffer();
        byte[] byteArray23 = micazMsg18.dataGet();
        java.lang.Object obj24 = micazMsg18.clone();
        net.tinyos.message.Message message26 = micazMsg18.clone(2);
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray29);
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg(byteArray29, 2);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg(byteArray29);
        micazMsg33.set_NodeID((int) (byte) 10);
        byte[] byteArray36 = micazMsg33.dataGet();
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg(byteArray36);
        message26.dataSet(byteArray36);
        laccan.devices.MicazMsg micazMsg41 = new laccan.devices.MicazMsg(byteArray36, 0, (int) (short) 1);
        micazMsg2.dataSet(byteArray36);
        net.tinyos.message.SerialPacket serialPacket43 = micazMsg2.getSerialPacket();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str21.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(message26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertNull(serialPacket43);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test199");
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
        try {
            laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg13, (long) 65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test200");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray8, 3);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray8, 32);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray8, 0);
        int int19 = micazMsg18.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test201");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        java.util.List<laccan.devices.Sample> sampleList1 = storageCSV0.read();
        laccan.persistence.StorageCSV storageCSV3 = storageCSV0.local("memory;-1.0;32");
        laccan.persistence.StorageCSV storageCSV5 = storageCSV0.local("");
        laccan.devices.Sample sample9 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) 0.0f, (long) (short) 1);
        sample9.setTemperature(32.0d);
        java.lang.String[] strArray12 = sample9.toCSV();
        storageCSV5.save(strArray12);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertNotNull(storageCSV3);
        org.junit.Assert.assertNotNull(storageCSV5);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test202");
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
        java.lang.String str27 = micazMsg26.toString();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x10a]\n  [Voltage=0x64]\n  [Buffer=" + "'", str27.equals("Message <MicazMsg> \n  [NodeID=0x10a]\n  [Voltage=0x64]\n  [Buffer="));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test203");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("", Double.NaN, (long) (byte) -1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test204");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        micazMsg1.amTypeSet(160);
        int int11 = micazMsg1.amType();
        net.tinyos.message.Message message13 = micazMsg1.clone((int) '4');
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg15.set_Buffer(shortArray21);
        micazMsg15.init(16);
        short short26 = micazMsg15.getElement_Buffer(2);
        int int27 = micazMsg15.get_Voltage();
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray30 = micazMsg29.get_Buffer();
        java.lang.Object obj31 = micazMsg29.clone();
        micazMsg29.set_NodeID(20);
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg(byteArray36);
        micazMsg29.dataSet(byteArray36);
        laccan.devices.MicazMsg micazMsg40 = new laccan.devices.MicazMsg(byteArray36, 0);
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg(byteArray36, 10);
        micazMsg15.dataSet(byteArray36);
        laccan.devices.MicazMsg micazMsg44 = new laccan.devices.MicazMsg(byteArray36);
        laccan.devices.MicazMsg micazMsg46 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray47 = micazMsg46.get_Buffer();
        laccan.devices.Sample sample48 = new laccan.devices.Sample(micazMsg46);
        int int49 = micazMsg46.get_NodeID();
        byte[] byteArray50 = micazMsg46.dataGet();
        laccan.devices.MicazMsg micazMsg51 = new laccan.devices.MicazMsg(byteArray50);
        micazMsg44.dataSet(byteArray50, 8, (int) (byte) 0, 0);
        message13.dataSet((net.tinyos.message.Message) micazMsg44, 12);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 160 + "'", int11 == 160);
        org.junit.Assert.assertNotNull(message13);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 0 + "'", short26 == (short) 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(byteArray50);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test205");
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
        int int22 = micazMsg1.get_Voltage();
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
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test206");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("memory");
        java.lang.String[] strArray8 = laccan.devices.helper.utils.Assistant.environments;
        storageCSV4.save(strArray8);
        laccan.persistence.StorageCSV storageCSV11 = storageCSV4.local("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        laccan.persistence.StorageCSV storageCSV13 = storageCSV11.local("null;-19.699999999999996;35");
        laccan.persistence.StorageCSV storageCSV15 = storageCSV13.local("memory;-19.699999999999996;-1;10.0;-1");
        java.util.List<laccan.devices.Sample> sampleList16 = storageCSV15.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(storageCSV15);
        org.junit.Assert.assertNotNull(sampleList16);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test207");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        java.lang.String[] strArray4 = sample3.toCSV();
        java.lang.String[] strArray5 = sample3.toCSV();
        java.lang.String str6 = sample3.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null;-19.699999999999996;0" + "'", str6.equals("null;-19.699999999999996;0"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test208");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, (long) 0);
        sample5.setTemperature(16.0d);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test209");
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
        int int17 = memory0.length();
        int int18 = memory0.length();
        memory0.build();
        memory0.build();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test210");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        short short5 = micazMsg1.getElement_Buffer((int) (short) 0);
        short[] shortArray6 = micazMsg1.get_Buffer();
        java.lang.Class<?> wildcardClass7 = micazMsg1.getClass();
        short short9 = micazMsg1.getElement_Buffer(2);
        byte[] byteArray10 = micazMsg1.dataGet();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray10);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test211");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test212");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        int int4 = micazMsg2.get_NodeID();
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) (byte) -1);
        double double7 = sample6.getTemperature();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-19.699999999999996d) + "'", double7 == (-19.699999999999996d));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test213");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(12, (int) 'a');
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(100, (int) (short) 1);
        java.lang.String str6 = micazMsg5.toString();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5, 100L);
        byte[] byteArray9 = micazMsg5.dataGet();
        java.lang.Class<?> wildcardClass10 = micazMsg5.getClass();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        int int15 = micazMsg12.get_NodeID();
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray18);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray18, 2);
        micazMsg12.dataSet(byteArray18);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray18);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray18);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray18);
        micazMsg5.dataSet(byteArray18);
        try {
            micazMsg2.dataSet(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str6.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test214");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0);
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg8, (long) 160);
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg8);
        try {
            short short13 = micazMsg8.getElement_Buffer(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test215");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 20, (long) 10, (int) (short) 0);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test216");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.699999999999996;512", (double) (byte) 1, (long) (short) 10);
        sample3.setDate((long) 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test217");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) ' ', 0);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test218");
        try {
            laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(97, (-139));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test219");
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
        double double63 = sample20.getDateDouble();
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
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test220");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test221");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 10);
        net.tinyos.message.Message message11 = micazMsg9.clone(0);
        int int12 = micazMsg9.amType();
        int int13 = micazMsg9.dataLength();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        int int18 = micazMsg15.get_NodeID();
        micazMsg15.setElement_Buffer(1, (short) (byte) 0);
        int int22 = micazMsg15.get_NodeID();
        laccan.devices.Sample sample23 = new laccan.devices.Sample(micazMsg15);
        java.lang.Class<?> wildcardClass24 = micazMsg15.getClass();
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray27 = micazMsg26.get_Buffer();
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg26);
        int int29 = micazMsg26.get_NodeID();
        byte[] byteArray30 = micazMsg26.dataGet();
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg(byteArray30);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray34 = micazMsg33.get_Buffer();
        java.lang.Object obj35 = micazMsg33.clone();
        int int36 = micazMsg33.get_NodeID();
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg40 = new laccan.devices.MicazMsg(byteArray39);
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg(byteArray39, 2);
        micazMsg33.dataSet(byteArray39);
        laccan.devices.MicazMsg micazMsg44 = new laccan.devices.MicazMsg(byteArray39);
        micazMsg31.dataSet(byteArray39);
        laccan.devices.MicazMsg micazMsg46 = new laccan.devices.MicazMsg(byteArray39);
        micazMsg15.dataSet(byteArray39);
        laccan.devices.MicazMsg micazMsg49 = new laccan.devices.MicazMsg(byteArray39, (int) (short) 1);
        laccan.devices.MicazMsg micazMsg50 = new laccan.devices.MicazMsg(byteArray39);
        micazMsg9.dataSet(byteArray39);
        try {
            laccan.devices.MicazMsg micazMsg54 = new laccan.devices.MicazMsg(byteArray39, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 32, data_length 52 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(message11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 172 + "'", int12 == 172);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 24 + "'", int13 == 24);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(byteArray39);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test222");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests(100L, 0L, 6);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test223");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) '4', 3);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test224");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(12, 16);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test225");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.get_NodeID();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        java.lang.Class<?> wildcardClass10 = micazMsg1.getClass();
        net.tinyos.message.Message message12 = micazMsg1.clone((int) (short) 10);
        micazMsg1.set_NodeID(65535);
        java.lang.String str15 = micazMsg1.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(message12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str15.equals("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test226");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) '#', (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test227");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0);
        short[] shortArray4 = micazMsg1.get_Buffer();
        short[] shortArray5 = micazMsg1.get_Buffer();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (short) 100, 0);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray5);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test228");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 2);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        micazMsg6.set_NodeID((int) (byte) 10);
        byte[] byteArray9 = micazMsg6.dataGet();
        int int10 = micazMsg6.dataLength();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg6.getSerialPacket();
        java.lang.Class<?> wildcardClass12 = micazMsg6.getClass();
        try {
            short short14 = micazMsg6.getElement_Buffer(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test229");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg(byteArray2, 16);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        int int7 = micazMsg6.amType();
        try {
            laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 52, data_length 24 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 172 + "'", int7 == 172);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test230");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        micazMsg1.amTypeSet(52);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray10, 48);
        micazMsg1.dataSet(byteArray10);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray10, (int) '#');
        try {
            int int16 = micazMsg15.get_Voltage();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length -31 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray10);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test231");
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
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg12);
        long long16 = sample15.getDate();
        java.lang.Class<?> wildcardClass17 = sample15.getClass();
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = micazMsg19.get_Buffer();
        java.lang.Object obj21 = micazMsg19.clone();
        laccan.devices.Sample sample22 = new laccan.devices.Sample(micazMsg19);
        long long23 = sample22.getDate();
        laccan.devices.Type type24 = laccan.devices.Type.FULL;
        sample22.setType(type24);
        sample15.setType(type24);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray34 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg28.set_Buffer(shortArray34);
        laccan.devices.Sample sample36 = new laccan.devices.Sample(micazMsg28);
        laccan.devices.Sample sample37 = new laccan.devices.Sample();
        laccan.devices.Type type38 = laccan.devices.Type.FULL;
        sample37.setType(type38);
        sample36.setType(type38);
        sample15.setType(type38);
        sample10.setType(type38);
        java.lang.String str43 = sample10.getNode();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + laccan.devices.Type.FULL + "'", type24.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertTrue("'" + type38 + "' != '" + laccan.devices.Type.FULL + "'", type38.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test232");
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
        short[] shortArray12 = micazMsg1.get_Buffer();
        int int13 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(100);
        short[] shortArray16 = micazMsg15.get_Buffer();
        micazMsg1.set_Buffer(shortArray16);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg20.amTypeSet(2);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray25 = micazMsg24.get_Buffer();
        java.lang.Object obj26 = micazMsg24.clone();
        java.lang.String str27 = micazMsg24.toString();
        short[] shortArray28 = micazMsg24.get_Buffer();
        micazMsg20.set_Buffer(shortArray28);
        micazMsg1.set_Buffer(shortArray28);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str27.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray28);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test233");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        java.lang.String str4 = micazMsg1.toString();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(16);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg6, (int) (byte) 0);
        java.lang.String str9 = micazMsg6.toString();
        int int10 = micazMsg6.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 " + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 "));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test234");
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
        sample20.setNode("memory;-19.699999999999996;-1;10.0;-1");
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
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test235");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1, (long) 512);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        java.lang.Object obj13 = micazMsg11.clone();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg11);
        long long15 = sample14.getDate();
        laccan.devices.Type type16 = laccan.devices.Type.FULL;
        sample14.setType(type16);
        sample14.setNode("reduction");
        java.lang.Class<?> wildcardClass20 = sample14.getClass();
        laccan.devices.Type type21 = sample14.getType();
        sample9.setType(type21);
        laccan.devices.Type type23 = sample9.getType();
        long long24 = sample9.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + laccan.devices.Type.FULL + "'", type16.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + laccan.devices.Type.FULL + "'", type21.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type23 + "' != '" + laccan.devices.Type.FULL + "'", type23.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 512L + "'", long24 == 512L);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test236");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        sample4.setDate((long) '#');
        java.lang.String[] strArray7 = sample4.toCSV();
        sample4.setDate((long) (-1));
        java.lang.String str10 = sample4.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null;-19.699999999999996;-1" + "'", str10.equals("null;-19.699999999999996;-1"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test237");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        net.tinyos.message.Message message5 = micazMsg3.clone(10);
        java.lang.Object obj6 = micazMsg3.clone();
        try {
            laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(message5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test238");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        micazMsg1.set_NodeID((int) ' ');
        net.tinyos.message.Message message8 = micazMsg1.clone((int) 'a');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(message8);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test239");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("full_memory", (double) (short) 1, (long) 172);
        laccan.devices.Type type4 = sample3.getType();
        sample3.setNode("null;0.0;512");
        double double7 = sample3.getTemperature();
        sample3.setDate((long) (byte) 1);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test240");
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
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj17 = micazMsg16.clone();
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg16, (long) 0);
        java.lang.String str20 = sample19.getNode();
        long long21 = sample19.getDate();
        memory0.add(sample19);
        memory0.build();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test241");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        byte[] byteArray7 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, (int) (short) -1);
        micazMsg10.amTypeSet((-1));
        byte[] byteArray13 = micazMsg10.dataGet();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        java.lang.String str18 = micazMsg15.toString();
        short[] shortArray19 = micazMsg15.get_Buffer();
        byte[] byteArray20 = micazMsg15.dataGet();
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray20);
        try {
            micazMsg10.dataSet(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str18.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(byteArray20);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test242");
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
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray25, 20);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray37 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg31.set_Buffer(shortArray37);
        java.lang.String str39 = micazMsg31.toString();
        java.lang.Object obj40 = micazMsg31.clone();
        net.tinyos.message.SerialPacket serialPacket41 = micazMsg31.getSerialPacket();
        laccan.devices.Sample sample42 = new laccan.devices.Sample(micazMsg31);
        net.tinyos.message.Message message44 = micazMsg31.clone(0);
        laccan.devices.MicazMsg micazMsg46 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray47 = micazMsg46.get_Buffer();
        laccan.devices.Sample sample48 = new laccan.devices.Sample(micazMsg46);
        int int49 = micazMsg46.get_NodeID();
        byte[] byteArray50 = micazMsg46.dataGet();
        laccan.devices.MicazMsg micazMsg51 = new laccan.devices.MicazMsg(byteArray50);
        laccan.devices.MicazMsg micazMsg53 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray54 = micazMsg53.get_Buffer();
        java.lang.Object obj55 = micazMsg53.clone();
        int int56 = micazMsg53.get_NodeID();
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg60 = new laccan.devices.MicazMsg(byteArray59);
        laccan.devices.MicazMsg micazMsg62 = new laccan.devices.MicazMsg(byteArray59, 2);
        micazMsg53.dataSet(byteArray59);
        laccan.devices.MicazMsg micazMsg64 = new laccan.devices.MicazMsg(byteArray59);
        micazMsg51.dataSet(byteArray59);
        byte[] byteArray66 = micazMsg51.dataGet();
        micazMsg31.dataSet(byteArray66);
        try {
            micazMsg29.dataSet(byteArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str39.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNull(serialPacket41);
        org.junit.Assert.assertNotNull(message44);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertNotNull(byteArray66);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test243");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        int int15 = micazMsg12.get_NodeID();
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray18);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray18, 2);
        micazMsg12.dataSet(byteArray18);
        int int23 = micazMsg12.baseOffset();
        byte[] byteArray24 = micazMsg12.dataGet();
        micazMsg1.dataSet(byteArray24);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray24, (int) (byte) 0);
        int int28 = micazMsg27.baseOffset();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test244");
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
        laccan.memory.Container container43 = memory0.getMemory();
        laccan.memory.Container container44 = memory0.getMemory();
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
        org.junit.Assert.assertNotNull(container43);
        org.junit.Assert.assertNotNull(container44);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test245");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        laccan.devices.Type type6 = sample5.getType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(type6);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test246");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        micazMsg1.set_Voltage(6);
        org.junit.Assert.assertNotNull(shortArray2);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test247");
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
        micazMsg2.set_NodeID(4);
        micazMsg2.set_Voltage(6);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test248");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList4 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList5 = keepingAll0.get();
        laccan.memory.data.reduction.KeepingAll keepingAll6 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList7 = keepingAll6.get();
        int int8 = keepingAll6.length();
        java.util.List<laccan.devices.Sample> sampleList9 = keepingAll6.get();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        java.lang.Object obj13 = micazMsg11.clone();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg11);
        laccan.devices.Type type15 = null;
        sample14.setType(type15);
        laccan.devices.Type type17 = null;
        sample14.setType(type17);
        sample14.setNode("hi!");
        keepingAll6.add(sample14);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = micazMsg23.get_Buffer();
        java.lang.Object obj25 = micazMsg23.clone();
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg23);
        laccan.devices.Type type27 = null;
        sample26.setType(type27);
        java.lang.String str29 = sample26.toString();
        java.lang.String str30 = sample26.getNode();
        keepingAll6.add(sample26);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray34 = micazMsg33.get_Buffer();
        laccan.devices.Sample sample35 = new laccan.devices.Sample(micazMsg33);
        int int36 = micazMsg33.dataLength();
        micazMsg33.init((int) '4');
        laccan.devices.Sample sample39 = new laccan.devices.Sample(micazMsg33);
        double double40 = sample39.getDateDouble();
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray48 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg42.set_Buffer(shortArray48);
        laccan.devices.Sample sample50 = new laccan.devices.Sample(micazMsg42);
        laccan.devices.Sample sample51 = new laccan.devices.Sample();
        laccan.devices.Type type52 = laccan.devices.Type.FULL;
        sample51.setType(type52);
        sample50.setType(type52);
        sample50.setTemperature((double) 'a');
        laccan.devices.Type type57 = sample50.getType();
        sample39.setType(type57);
        laccan.devices.MicazMsg micazMsg60 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray61 = micazMsg60.get_Buffer();
        laccan.devices.Sample sample62 = new laccan.devices.Sample(micazMsg60);
        int int63 = micazMsg60.dataLength();
        micazMsg60.init((int) '4');
        laccan.devices.Sample sample66 = new laccan.devices.Sample(micazMsg60);
        double double67 = sample66.getDateDouble();
        laccan.devices.MicazMsg micazMsg69 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray75 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg69.set_Buffer(shortArray75);
        laccan.devices.Sample sample77 = new laccan.devices.Sample(micazMsg69);
        laccan.devices.Sample sample78 = new laccan.devices.Sample();
        laccan.devices.Type type79 = laccan.devices.Type.FULL;
        sample78.setType(type79);
        sample77.setType(type79);
        sample77.setTemperature((double) 'a');
        laccan.devices.Type type84 = sample77.getType();
        sample66.setType(type84);
        sample39.setType(type84);
        double double87 = sample39.getDateDouble();
        keepingAll6.add(sample39);
        keepingAll0.add(sample39);
        java.util.List<laccan.devices.Sample> sampleList90 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg92 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray93 = micazMsg92.get_Buffer();
        laccan.devices.Sample sample94 = new laccan.devices.Sample(micazMsg92);
        laccan.devices.Sample sample96 = new laccan.devices.Sample(micazMsg92, (long) (short) 10);
        double double97 = sample96.getDateDouble();
        laccan.devices.Type type98 = sample96.getType();
        keepingAll0.add(sample96);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(sampleList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(sampleList9);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "null;-19.699999999999996;0" + "'", str29.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertTrue("'" + type52 + "' != '" + laccan.devices.Type.FULL + "'", type52.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type57 + "' != '" + laccan.devices.Type.FULL + "'", type57.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 52 + "'", int63 == 52);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray75);
        org.junit.Assert.assertTrue("'" + type79 + "' != '" + laccan.devices.Type.FULL + "'", type79.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type84 + "' != '" + laccan.devices.Type.FULL + "'", type84.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        org.junit.Assert.assertNotNull(sampleList90);
        org.junit.Assert.assertNotNull(shortArray93);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 10.0d + "'", double97 == 10.0d);
        org.junit.Assert.assertNull(type98);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test249");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        int int9 = micazMsg1.dataLength();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg1, 0L);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg13);
        long long17 = sample16.getDate();
        laccan.devices.Type type18 = laccan.devices.Type.FULL;
        sample16.setType(type18);
        sample16.setNode("reduction");
        java.lang.String str22 = sample16.toString();
        sample16.setNode("reduction;-19.699999999999996;0");
        sample16.setTemperature((double) (-1L));
        laccan.devices.Type type27 = sample16.getType();
        sample11.setType(type27);
        double double29 = sample11.getDateDouble();
        java.lang.String str30 = sample11.getNode();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + laccan.devices.Type.FULL + "'", type18.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "reduction;-19.699999999999996;0" + "'", str22.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + type27 + "' != '" + laccan.devices.Type.FULL + "'", type27.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test250");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer(65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test251");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 64, 3L, (int) 'a');
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test252");
        int int1 = laccan.devices.MicazMsg.offset_Buffer((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test253");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        int int9 = micazMsg1.get_Voltage();
        micazMsg1.amTypeSet((int) '#');
        micazMsg1.set_Voltage(10);
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg1, 32L);
        double double16 = sample15.getTemperature();
        java.lang.String str17 = sample15.getNode();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-19.699999999999996d) + "'", double16 == (-19.699999999999996d));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test254");
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
        java.lang.String str11 = sample4.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null;-19.699999999999996;0" + "'", str9.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null;-19.699999999999996;0" + "'", str10.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null;-19.699999999999996;0" + "'", str11.equals("null;-19.699999999999996;0"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test255");
        laccan.devices.helper.utils.Assistant.predictorType = "memory;-19.699999999999996;-1;32.0;32";
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test256");
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
        try {
            micazMsg1.init((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
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
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test257");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 100, (long) '#', 512);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test258");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        micazMsg1.set_Voltage(172);
        net.tinyos.message.Message message9 = micazMsg1.clone((int) (byte) 10);
        java.lang.Object obj10 = micazMsg1.clone();
        try {
            micazMsg1.setElement_Buffer(97, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test259");
        laccan.devices.MicazMsg micazMsg0 = new laccan.devices.MicazMsg();
        net.tinyos.message.SerialPacket serialPacket1 = micazMsg0.getSerialPacket();
        java.lang.String str2 = micazMsg0.toString();
        org.junit.Assert.assertNull(serialPacket1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str2.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test260");
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
        try {
            short short20 = micazMsg1.getElement_Buffer(51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test261");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        net.tinyos.message.SerialPacket serialPacket13 = micazMsg1.getSerialPacket();
        try {
            laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg1, (long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (128) or length (16), for data_length 16 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNull(serialPacket13);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test262");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests(3L, (long) 128, (int) (short) 0);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test263");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((-139), 97);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test264");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        java.lang.Object obj10 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg13, 0);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg15, (int) (short) 0);
        micazMsg15.set_Voltage(52);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(serialPacket11);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test265");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        int int3 = micazMsg1.get_NodeID();
        java.lang.Object obj4 = micazMsg1.clone();
        int int5 = micazMsg1.get_NodeID();
        micazMsg1.set_NodeID(65);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test266");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        memory0.build();
        laccan.memory.Container container4 = memory0.getMemory();
        laccan.memory.Container container5 = memory0.getMemory();
        int int6 = memory0.length();
        laccan.memory.Container container7 = memory0.getMemory();
        laccan.devices.Sample sample8 = null;
        memory0.add(sample8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertNotNull(container5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(container7);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test267");
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
        int int37 = memory0.length();
        int int38 = memory0.length();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test268");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(20, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test269");
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
        micazMsg15.init((int) (short) 100);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg15, (-1));
        laccan.devices.Sample sample34 = new laccan.devices.Sample(micazMsg15);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test270");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(0, 65535);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test271");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 10, 10);
        net.tinyos.message.Message message4 = micazMsg2.clone((int) (byte) 10);
        micazMsg2.amTypeSet(16);
        java.lang.Class<?> wildcardClass7 = micazMsg2.getClass();
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        java.lang.Object obj11 = micazMsg9.clone();
        int int12 = micazMsg9.get_NodeID();
        micazMsg9.setElement_Buffer(1, (short) (byte) 0);
        int int16 = micazMsg9.baseOffset();
        int int17 = micazMsg9.get_Voltage();
        micazMsg9.amTypeSet((int) '#');
        micazMsg9.set_Voltage(10);
        micazMsg9.set_NodeID((int) (byte) 0);
        int int24 = micazMsg9.get_Voltage();
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray32 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg26.set_Buffer(shortArray32);
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray36 = micazMsg35.get_Buffer();
        java.lang.Object obj37 = micazMsg35.clone();
        java.lang.String str38 = micazMsg35.toString();
        short[] shortArray39 = micazMsg35.get_Buffer();
        byte[] byteArray40 = micazMsg35.dataGet();
        laccan.devices.MicazMsg micazMsg41 = new laccan.devices.MicazMsg(byteArray40);
        micazMsg26.dataSet(byteArray40);
        laccan.devices.MicazMsg micazMsg43 = new laccan.devices.MicazMsg(byteArray40);
        laccan.devices.MicazMsg micazMsg44 = new laccan.devices.MicazMsg(byteArray40);
        laccan.devices.MicazMsg micazMsg47 = new laccan.devices.MicazMsg(byteArray40, 48, 3);
        micazMsg9.dataSet(byteArray40);
        try {
            micazMsg2.dataSet(byteArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(message4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str38.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertNotNull(byteArray40);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test272");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 512);
        java.lang.String str7 = sample6.toString();
        sample6.setTemperature((double) 0.0f);
        java.lang.String str10 = sample6.toString();
        laccan.devices.Type type11 = sample6.getType();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null;-19.699999999999996;512" + "'", str7.equals("null;-19.699999999999996;512"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null;0.0;512" + "'", str10.equals("null;0.0;512"));
        org.junit.Assert.assertNull(type11);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test273");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        double double6 = sample5.getDateDouble();
        java.lang.String[] strArray7 = sample5.toCSV();
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg9);
        int int12 = micazMsg9.dataLength();
        micazMsg9.init((int) '4');
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg9);
        double double16 = sample15.getDateDouble();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg18.set_Buffer(shortArray24);
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg18);
        laccan.devices.Sample sample27 = new laccan.devices.Sample();
        laccan.devices.Type type28 = laccan.devices.Type.FULL;
        sample27.setType(type28);
        sample26.setType(type28);
        sample26.setTemperature((double) 'a');
        laccan.devices.Type type33 = sample26.getType();
        sample15.setType(type33);
        laccan.devices.Type type35 = sample15.getType();
        sample5.setType(type35);
        sample5.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x64]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 ");
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertTrue("'" + type28 + "' != '" + laccan.devices.Type.FULL + "'", type28.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type33 + "' != '" + laccan.devices.Type.FULL + "'", type33.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type35 + "' != '" + laccan.devices.Type.FULL + "'", type35.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test274");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(5, (int) (short) 10);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test275");
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
        java.lang.String[] strArray16 = null;
        storageCSV12.save(strArray16);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV12);
        org.junit.Assert.assertNotNull(storageCSV14);
        org.junit.Assert.assertNotNull(sampleList15);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test276");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray3 = micazMsg2.get_Buffer();
        java.lang.Object obj4 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2);
        laccan.devices.Type type6 = null;
        sample5.setType(type6);
        keepingAll0.add(sample5);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg10);
        int int13 = micazMsg10.get_NodeID();
        micazMsg10.amTypeSet((int) (byte) 100);
        micazMsg10.amTypeSet(2);
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg10);
        byte[] byteArray19 = micazMsg10.dataGet();
        short[] shortArray20 = micazMsg10.get_Buffer();
        java.lang.String str21 = micazMsg10.toString();
        laccan.devices.Sample sample22 = new laccan.devices.Sample(micazMsg10);
        sample22.setTemperature(0.0d);
        keepingAll0.add(sample22);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str21.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test277");
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
        java.util.List<java.lang.Double> doubleList60 = regression0.result();
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
        org.junit.Assert.assertNotNull(doubleList60);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test278");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        java.lang.Object obj10 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg1);
        java.lang.Class<?> wildcardClass13 = micazMsg1.getClass();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test279");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample();
        laccan.devices.Type type11 = laccan.devices.Type.FULL;
        sample10.setType(type11);
        sample9.setType(type11);
        sample9.setTemperature((double) 'a');
        java.lang.Class<?> wildcardClass16 = sample9.getClass();
        double double17 = sample9.getTemperature();
        long long18 = sample9.getDate();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test280");
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
        short short15 = micazMsg13.getElement_Buffer((int) (short) 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test281");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(16, 100);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test282");
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
        net.tinyos.message.Message message27 = micazMsg1.clone((int) (short) 1);
        net.tinyos.message.Message message29 = message27.clone((int) (byte) 100);
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
        org.junit.Assert.assertNotNull(message27);
        org.junit.Assert.assertNotNull(message29);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test283");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test284");
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
        double double29 = sample18.getDateDouble();
        java.lang.String[] strArray30 = sample18.toCSV();
        java.lang.String str31 = sample18.toString();
        keepingAll0.add(sample18);
        int int33 = keepingAll0.length();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(sampleList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + laccan.devices.Type.FULL + "'", type20.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "reduction;-19.699999999999996;0" + "'", str24.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "reduction;-19.699999999999996;0;-1.0;0" + "'", str31.equals("reduction;-19.699999999999996;0;-1.0;0"));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test285");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer(5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test286");
        laccan.devices.helper.utils.Assistant.reducerType = "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 ";
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test287");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        net.tinyos.message.Message message5 = micazMsg3.clone(10);
        int int6 = micazMsg3.dataLength();
        try {
            micazMsg3.setElement_Buffer((int) (byte) 1, (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (48) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(message5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test288");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((-139), 51);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test289");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        int int8 = micazMsg7.get_Voltage();
        net.tinyos.message.Message message10 = micazMsg7.clone(52);
        try {
            short short12 = micazMsg7.getElement_Buffer((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(message10);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test290");
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
        micazMsg11.setElement_Buffer(4, (short) (byte) 0);
        int int18 = micazMsg11.get_NodeID();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test291");
        laccan.devices.helper.utils.Assistant.predictorType = "null;-19.699999999999996;-1";
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test292");
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
        int int11 = memory0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test293");
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
        int int16 = micazMsg2.dataLength();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        java.lang.Object obj20 = micazMsg18.clone();
        java.lang.String str21 = micazMsg18.toString();
        short[] shortArray22 = micazMsg18.get_Buffer();
        byte[] byteArray23 = micazMsg18.dataGet();
        java.lang.Object obj24 = micazMsg18.clone();
        net.tinyos.message.Message message26 = micazMsg18.clone(2);
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray29);
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg(byteArray29, 2);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg(byteArray29);
        micazMsg33.set_NodeID((int) (byte) 10);
        byte[] byteArray36 = micazMsg33.dataGet();
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg(byteArray36);
        message26.dataSet(byteArray36);
        laccan.devices.MicazMsg micazMsg41 = new laccan.devices.MicazMsg(byteArray36, 0, (int) (short) 1);
        micazMsg2.dataSet(byteArray36);
        try {
            laccan.devices.MicazMsg micazMsg45 = new laccan.devices.MicazMsg(byteArray36, 16, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 16, data_length 128 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str21.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(message26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray36);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test294");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(1, 3);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test295");
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
        int int17 = micazMsg12.baseOffset();
        try {
            int int18 = micazMsg12.get_Voltage();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 172 + "'", int13 == 172);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test296");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 512);
        java.lang.Object obj7 = micazMsg2.clone();
        micazMsg2.amTypeSet((int) (short) 1);
        micazMsg2.set_Voltage(256);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        java.lang.String str16 = micazMsg13.toString();
        short[] shortArray17 = micazMsg13.get_Buffer();
        byte[] byteArray18 = micazMsg13.dataGet();
        java.lang.Object obj19 = micazMsg13.clone();
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg13);
        int int21 = micazMsg13.dataLength();
        int int22 = micazMsg13.baseOffset();
        laccan.devices.Sample sample23 = new laccan.devices.Sample(micazMsg13);
        short[] shortArray24 = micazMsg13.get_Buffer();
        int int25 = micazMsg13.baseOffset();
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(100);
        short[] shortArray28 = micazMsg27.get_Buffer();
        micazMsg13.set_Buffer(shortArray28);
        java.lang.String str30 = micazMsg13.toString();
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray33 = micazMsg32.get_Buffer();
        java.lang.Object obj34 = micazMsg32.clone();
        int int35 = micazMsg32.get_NodeID();
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray38 = micazMsg37.get_Buffer();
        micazMsg32.set_Buffer(shortArray38);
        laccan.devices.MicazMsg micazMsg41 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray42 = micazMsg41.get_Buffer();
        java.lang.Object obj43 = micazMsg41.clone();
        int int44 = micazMsg41.get_NodeID();
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg48 = new laccan.devices.MicazMsg(byteArray47);
        laccan.devices.MicazMsg micazMsg50 = new laccan.devices.MicazMsg(byteArray47, 2);
        micazMsg41.dataSet(byteArray47);
        int int52 = micazMsg41.baseOffset();
        micazMsg41.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg56 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg41, (int) (short) 10);
        byte[] byteArray57 = micazMsg41.dataGet();
        laccan.devices.MicazMsg micazMsg58 = new laccan.devices.MicazMsg(byteArray57);
        laccan.devices.MicazMsg micazMsg60 = new laccan.devices.MicazMsg(byteArray57, (int) 'a');
        micazMsg32.dataSet(byteArray57, (int) (short) 0, 12, 20);
        micazMsg13.dataSet(byteArray57, (int) (byte) 0, 0, 20);
        micazMsg2.dataSet(byteArray57);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str16.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str30.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(byteArray57);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test297");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        byte[] byteArray7 = micazMsg1.dataGet();
        java.lang.String str8 = micazMsg1.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str8.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test298");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg10);
        int int13 = micazMsg10.get_NodeID();
        micazMsg10.amTypeSet((int) (byte) 100);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg10, (int) (short) 0);
        byte[] byteArray18 = micazMsg10.dataGet();
        micazMsg10.set_NodeID(256);
        micazMsg10.init((int) (short) 1);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test299");
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
        double double70 = sample32.getDateDouble();
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
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 48.0d + "'", double70 == 48.0d);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test300");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        int int6 = micazMsg1.baseOffset();
        micazMsg1.amTypeSet(10);
        int int9 = micazMsg1.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test301");
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
        java.util.List<java.lang.Double> doubleList63 = regression0.result();
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
        org.junit.Assert.assertNotNull(doubleList63);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test302");
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
        java.lang.String str28 = sample27.toString();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(message26);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "null;-19.699999999999996;0" + "'", str28.equals("null;-19.699999999999996;0"));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test303");
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
        double double82 = regression0.mse();
        java.util.List<java.lang.Double> doubleList83 = null;
        try {
            java.util.List<java.lang.Double> doubleList84 = regression0.result(doubleList83);
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
        org.junit.Assert.assertEquals((double) double82, Double.NaN, 0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test304");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) -1, 24);
        net.tinyos.message.Message message4 = micazMsg2.clone(2);
        java.lang.Class<?> wildcardClass5 = micazMsg2.getClass();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg();
        net.tinyos.message.SerialPacket serialPacket7 = micazMsg6.getSerialPacket();
        net.tinyos.message.SerialPacket serialPacket8 = micazMsg6.getSerialPacket();
        try {
            micazMsg2.dataSet((net.tinyos.message.Message) micazMsg6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(message4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(serialPacket7);
        org.junit.Assert.assertNull(serialPacket8);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test305");
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
        laccan.memory.Container container11 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container11);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test306");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        sample1.setTemperature((double) 0L);
        sample1.setDate(512L);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test307");
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
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray29 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg23.set_Buffer(shortArray29);
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray33 = micazMsg32.get_Buffer();
        java.lang.Object obj34 = micazMsg32.clone();
        java.lang.String str35 = micazMsg32.toString();
        short[] shortArray36 = micazMsg32.get_Buffer();
        byte[] byteArray37 = micazMsg32.dataGet();
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg(byteArray37);
        micazMsg23.dataSet(byteArray37);
        laccan.devices.MicazMsg micazMsg40 = new laccan.devices.MicazMsg(byteArray37);
        net.tinyos.message.Message message42 = micazMsg40.clone((int) (short) 0);
        micazMsg40.set_NodeID((int) '4');
        byte[] byteArray47 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg49 = new laccan.devices.MicazMsg(byteArray47, 16);
        laccan.devices.MicazMsg micazMsg50 = new laccan.devices.MicazMsg(byteArray47);
        micazMsg40.dataSet(byteArray47);
        micazMsg1.dataSet(byteArray47);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str35.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertNotNull(message42);
        org.junit.Assert.assertNotNull(byteArray47);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test308");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0);
        short[] shortArray4 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) (byte) 1);
        int int8 = micazMsg1.get_Voltage();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg10.set_Buffer(shortArray16);
        int int18 = micazMsg10.get_NodeID();
        micazMsg10.amTypeSet((int) ' ');
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg10, (int) (short) 1);
        net.tinyos.message.SerialPacket serialPacket23 = micazMsg1.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(serialPacket23);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test309");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (byte) -1, 6);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test310");
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
        try {
            int int17 = micazMsg16.get_NodeID();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (0) or length (16), for data_length -204 in class class laccan.devices.MicazMsg");
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
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(byteArray14);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test311");
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
        java.util.List<java.lang.Double> doubleList61 = null;
        try {
            java.util.List<java.lang.Double> doubleList62 = regression0.result(doubleList61);
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
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test312");
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
        regression0.train();
        laccan.memory.data.reduction.KeepingAll keepingAll20 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList21 = keepingAll20.get();
        int int22 = keepingAll20.length();
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray30 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg24.set_Buffer(shortArray30);
        laccan.devices.Sample sample32 = new laccan.devices.Sample(micazMsg24);
        keepingAll20.add(sample32);
        java.util.List<laccan.devices.Sample> sampleList34 = keepingAll20.get();
        java.util.List<laccan.devices.Sample> sampleList35 = keepingAll20.get();
        java.util.List<java.lang.Double> doubleList36 = laccan.cloud.prediction.Regression.makeTests(sampleList35);
        java.util.List<java.lang.Double> doubleList37 = laccan.cloud.prediction.Regression.makeTests(sampleList35);
        laccan.cloud.prediction.Regression regression38 = new laccan.cloud.prediction.Regression();
        double double39 = regression38.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll40 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList41 = keepingAll40.get();
        laccan.cloud.prediction.Regression regression42 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg44 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray45 = micazMsg44.get_Buffer();
        java.lang.Object obj46 = micazMsg44.clone();
        laccan.devices.Sample sample47 = new laccan.devices.Sample(micazMsg44);
        laccan.devices.Sample sample48 = new laccan.devices.Sample();
        laccan.devices.Sample sample49 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray50 = new laccan.devices.Sample[] { sample47, sample48, sample49 };
        java.util.ArrayList<laccan.devices.Sample> sampleList51 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList51, sampleArray50);
        java.util.List<java.lang.Double> doubleList53 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList51);
        java.util.List<java.lang.Double> doubleList54 = regression42.result(doubleList53);
        regression38.init(sampleList41, doubleList53);
        double double56 = regression38.mse();
        java.util.List<java.lang.Double> doubleList57 = regression38.result();
        laccan.cloud.prediction.Regression regression58 = new laccan.cloud.prediction.Regression();
        double double59 = regression58.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll60 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList61 = keepingAll60.get();
        laccan.cloud.prediction.Regression regression62 = new laccan.cloud.prediction.Regression();
        double double63 = regression62.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll64 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList65 = keepingAll64.get();
        laccan.cloud.prediction.Regression regression66 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg68 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray69 = micazMsg68.get_Buffer();
        java.lang.Object obj70 = micazMsg68.clone();
        laccan.devices.Sample sample71 = new laccan.devices.Sample(micazMsg68);
        laccan.devices.Sample sample72 = new laccan.devices.Sample();
        laccan.devices.Sample sample73 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray74 = new laccan.devices.Sample[] { sample71, sample72, sample73 };
        java.util.ArrayList<laccan.devices.Sample> sampleList75 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList75, sampleArray74);
        java.util.List<java.lang.Double> doubleList77 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList75);
        java.util.List<java.lang.Double> doubleList78 = regression66.result(doubleList77);
        regression62.init(sampleList65, doubleList77);
        laccan.cloud.prediction.Regression regression80 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg82 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray83 = micazMsg82.get_Buffer();
        java.lang.Object obj84 = micazMsg82.clone();
        laccan.devices.Sample sample85 = new laccan.devices.Sample(micazMsg82);
        laccan.devices.Sample sample86 = new laccan.devices.Sample();
        laccan.devices.Sample sample87 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray88 = new laccan.devices.Sample[] { sample85, sample86, sample87 };
        java.util.ArrayList<laccan.devices.Sample> sampleList89 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList89, sampleArray88);
        java.util.List<java.lang.Double> doubleList91 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList89);
        java.util.List<java.lang.Double> doubleList92 = regression80.result(doubleList91);
        java.util.List<java.lang.Double> doubleList93 = regression62.result(doubleList91);
        regression58.init(sampleList61, doubleList91);
        java.util.List<java.lang.Double> doubleList95 = regression38.result(doubleList91);
        regression0.init(sampleList35, doubleList91);
        double double97 = regression0.mse();
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(sampleArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals((double) double18, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(sampleList34);
        org.junit.Assert.assertNotNull(sampleList35);
        org.junit.Assert.assertNotNull(doubleList36);
        org.junit.Assert.assertNotNull(doubleList37);
        org.junit.Assert.assertEquals((double) double39, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList41);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(sampleArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(doubleList53);
        org.junit.Assert.assertNotNull(doubleList54);
        org.junit.Assert.assertEquals((double) double56, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList57);
        org.junit.Assert.assertEquals((double) double59, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList61);
        org.junit.Assert.assertEquals((double) double63, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList65);
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertNotNull(sampleArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(doubleList77);
        org.junit.Assert.assertNotNull(doubleList78);
        org.junit.Assert.assertNotNull(shortArray83);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertNotNull(sampleArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(doubleList91);
        org.junit.Assert.assertNotNull(doubleList92);
        org.junit.Assert.assertNotNull(doubleList93);
        org.junit.Assert.assertNotNull(doubleList95);
        org.junit.Assert.assertEquals((double) double97, Double.NaN, 0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test313");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(0);
        int int2 = micazMsg1.amType();
        try {
            laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172 + "'", int2 == 172);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test314");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        memory0.build();
        laccan.memory.Container container4 = memory0.getMemory();
        laccan.memory.Container container5 = memory0.getMemory();
        int int6 = memory0.length();
        laccan.memory.Container container7 = memory0.getMemory();
        laccan.memory.data.reduction.KeepingAll keepingAll8 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample9 = new laccan.devices.Sample();
        keepingAll8.add(sample9);
        java.util.List<laccan.devices.Sample> sampleList11 = keepingAll8.get();
        laccan.memory.Memory memory12 = new laccan.memory.Memory();
        memory12.build();
        int int14 = memory12.length();
        laccan.memory.Container container15 = memory12.getMemory();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray23 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg17.set_Buffer(shortArray23);
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg17);
        java.lang.String[] strArray26 = sample25.toCSV();
        sample25.setNode("hi!");
        memory12.add(sample25);
        keepingAll8.add(sample25);
        double double31 = sample25.getTemperature();
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray34 = micazMsg33.get_Buffer();
        java.lang.Object obj35 = micazMsg33.clone();
        laccan.devices.Sample sample36 = new laccan.devices.Sample(micazMsg33);
        sample36.setTemperature((double) 16);
        double double39 = sample36.getTemperature();
        laccan.devices.Sample sample40 = new laccan.devices.Sample();
        double double41 = sample40.getDateDouble();
        double double42 = sample40.getDateDouble();
        sample40.setTemperature((double) 1);
        double double45 = sample40.getDateDouble();
        laccan.devices.MicazMsg micazMsg47 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray53 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg47.set_Buffer(shortArray53);
        laccan.devices.Sample sample55 = new laccan.devices.Sample(micazMsg47);
        laccan.devices.Sample sample56 = new laccan.devices.Sample();
        laccan.devices.Type type57 = laccan.devices.Type.FULL;
        sample56.setType(type57);
        sample55.setType(type57);
        double double60 = sample55.getDateDouble();
        double double61 = sample55.getTemperature();
        laccan.devices.Type type62 = sample55.getType();
        sample40.setType(type62);
        sample36.setType(type62);
        sample25.setType(type62);
        memory0.add(sample25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertNotNull(container5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(container7);
        org.junit.Assert.assertNotNull(sampleList11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(container15);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-19.648499999999995d) + "'", double31 == (-19.648499999999995d));
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 16.0d + "'", double39 == 16.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertTrue("'" + type57 + "' != '" + laccan.devices.Type.FULL + "'", type57.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-19.648499999999995d) + "'", double61 == (-19.648499999999995d));
        org.junit.Assert.assertTrue("'" + type62 + "' != '" + laccan.devices.Type.FULL + "'", type62.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test315");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, (long) 0);
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg2, (long) (byte) 10);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        java.lang.Object obj11 = micazMsg9.clone();
        micazMsg9.amTypeSet(20);
        int int14 = micazMsg9.baseOffset();
        byte[] byteArray15 = micazMsg9.dataGet();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray15);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray15);
        try {
            micazMsg2.dataSet(byteArray15, (int) (short) 100, 2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test316");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(2, (int) ' ');
        try {
            laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 128, data_length 24 and data array size 34");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test317");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        micazMsg1.amTypeSet(160);
        java.lang.Object obj11 = micazMsg1.clone();
        micazMsg1.init(0);
        try {
            micazMsg1.set_NodeID(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (0) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test318");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray4 = micazMsg3.get_Buffer();
        java.lang.Object obj5 = micazMsg3.clone();
        int int6 = micazMsg3.get_NodeID();
        micazMsg3.setElement_Buffer(1, (short) (byte) 0);
        int int10 = micazMsg3.get_NodeID();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg3);
        double double12 = sample11.getDateDouble();
        keepingAll0.add(sample11);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg15);
        int int18 = micazMsg15.dataLength();
        micazMsg15.init((int) '4');
        laccan.devices.Sample sample21 = new laccan.devices.Sample(micazMsg15);
        double double22 = sample21.getDateDouble();
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray30 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg24.set_Buffer(shortArray30);
        laccan.devices.Sample sample32 = new laccan.devices.Sample(micazMsg24);
        laccan.devices.Sample sample33 = new laccan.devices.Sample();
        laccan.devices.Type type34 = laccan.devices.Type.FULL;
        sample33.setType(type34);
        sample32.setType(type34);
        sample32.setTemperature((double) 'a');
        laccan.devices.Type type39 = sample32.getType();
        sample21.setType(type39);
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray43 = micazMsg42.get_Buffer();
        laccan.devices.Sample sample44 = new laccan.devices.Sample(micazMsg42);
        int int45 = micazMsg42.dataLength();
        micazMsg42.init((int) '4');
        laccan.devices.Sample sample48 = new laccan.devices.Sample(micazMsg42);
        double double49 = sample48.getDateDouble();
        laccan.devices.MicazMsg micazMsg51 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray57 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg51.set_Buffer(shortArray57);
        laccan.devices.Sample sample59 = new laccan.devices.Sample(micazMsg51);
        laccan.devices.Sample sample60 = new laccan.devices.Sample();
        laccan.devices.Type type61 = laccan.devices.Type.FULL;
        sample60.setType(type61);
        sample59.setType(type61);
        sample59.setTemperature((double) 'a');
        laccan.devices.Type type66 = sample59.getType();
        sample48.setType(type66);
        sample21.setType(type66);
        keepingAll0.add(sample21);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertTrue("'" + type34 + "' != '" + laccan.devices.Type.FULL + "'", type34.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type39 + "' != '" + laccan.devices.Type.FULL + "'", type39.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertTrue("'" + type61 + "' != '" + laccan.devices.Type.FULL + "'", type61.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type66 + "' != '" + laccan.devices.Type.FULL + "'", type66.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test319");
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
        laccan.memory.data.reduction.KeepingAll keepingAll13 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList14 = keepingAll13.get();
        java.util.List<java.lang.Double> doubleList15 = laccan.cloud.prediction.Regression.makeTests(sampleList14);
        java.util.List<java.lang.Double> doubleList16 = regression0.result(doubleList15);
        laccan.memory.Memory memory17 = new laccan.memory.Memory();
        laccan.memory.Container container18 = memory17.getMemory();
        laccan.memory.Container container19 = memory17.getMemory();
        memory17.build();
        int int21 = memory17.length();
        laccan.memory.Container container22 = memory17.getMemory();
        int int23 = memory17.length();
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray26 = micazMsg25.get_Buffer();
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg25);
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg25, (long) (short) 10);
        java.lang.String str30 = sample29.getNode();
        long long31 = sample29.getDate();
        memory17.add(sample29);
        laccan.memory.Container container33 = memory17.getMemory();
        java.util.List<laccan.devices.Sample> sampleList34 = container33.get();
        java.util.List<java.lang.Double> doubleList35 = laccan.cloud.prediction.Regression.makeTests(sampleList34);
        java.util.List<java.lang.Double> doubleList36 = regression0.result(doubleList35);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(sampleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(sampleList14);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNull(container18);
        org.junit.Assert.assertNull(container19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(container22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(container33);
        org.junit.Assert.assertNotNull(sampleList34);
        org.junit.Assert.assertNotNull(doubleList35);
        org.junit.Assert.assertNotNull(doubleList36);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test320");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        memory0.build();
        memory0.build();
        memory0.build();
        laccan.memory.Container container6 = memory0.getMemory();
        laccan.devices.Sample sample10 = new laccan.devices.Sample("memory;-19.699999999999996;-1;32.0;32", (double) (short) -1, 52L);
        memory0.add(sample10);
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertNotNull(container6);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test321");
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
        try {
            micazMsg1.setElement_Buffer(256, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x64]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 " + "'", str20.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x64]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 "));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test322");
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
        java.lang.String str22 = sample13.getNode();
        java.lang.String str23 = sample13.toString();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(sampleList8);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!;-19.699999999999996;0" + "'", str23.equals("hi!;-19.699999999999996;0"));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test323");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0);
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg8, (long) 160);
        java.lang.Object obj11 = micazMsg8.clone();
        try {
            short short13 = micazMsg8.getElement_Buffer(20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test324");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg14.set_Buffer(shortArray20);
        int int22 = micazMsg14.get_NodeID();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray25);
        micazMsg14.dataSet((net.tinyos.message.Message) micazMsg26, (int) (byte) 0);
        int int29 = micazMsg26.get_NodeID();
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg26, (int) (byte) 1);
        try {
            micazMsg26.setElement_Buffer(20, (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 256 + "'", int29 == 256);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test325");
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
        laccan.memory.data.reduction.KeepingAll keepingAll26 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray29 = micazMsg28.get_Buffer();
        java.lang.Object obj30 = micazMsg28.clone();
        laccan.devices.Sample sample31 = new laccan.devices.Sample(micazMsg28);
        laccan.devices.Type type32 = null;
        sample31.setType(type32);
        keepingAll26.add(sample31);
        keepingAll0.add(sample31);
        laccan.devices.Sample sample36 = null;
        keepingAll0.add(sample36);
        int int38 = keepingAll0.length();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "null;-19.699999999999996;0" + "'", str23.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test326");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg14.set_Buffer(shortArray20);
        int int22 = micazMsg14.get_NodeID();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray25);
        micazMsg14.dataSet((net.tinyos.message.Message) micazMsg26, (int) (byte) 0);
        int int29 = micazMsg26.get_NodeID();
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg26, (int) (byte) 1);
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 10, (int) ' ');
        net.tinyos.message.Message message36 = micazMsg1.clone(65);
        try {
            micazMsg1.setElement_Buffer((int) (byte) -1, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 256 + "'", int29 == 256);
        org.junit.Assert.assertNotNull(message36);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test327");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        micazMsg1.set_Voltage((int) (byte) -1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test328");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory;-19.699999999999996;-1;32.0;32", (double) 0, (long) 35);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test329");
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
        laccan.persistence.StorageCSV storageCSV38 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV40 = storageCSV38.local("hi!");
        laccan.persistence.StorageCSV storageCSV41 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray42 = new java.lang.String[] {};
        storageCSV41.save(strArray42);
        storageCSV38.save(strArray42);
        laccan.persistence.StorageCSV storageCSV46 = storageCSV38.local("nodes");
        laccan.persistence.StorageCSV storageCSV48 = storageCSV38.local("init");
        laccan.persistence.StorageCSV storageCSV50 = storageCSV48.local("reduction;-19.699999999999996;0");
        laccan.persistence.StorageCSV storageCSV52 = storageCSV48.local("lastReading");
        laccan.persistence.StorageCSV storageCSV53 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV55 = storageCSV53.local("hi!");
        laccan.persistence.StorageCSV storageCSV57 = storageCSV55.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList58 = storageCSV57.read();
        laccan.persistence.StorageCSV storageCSV60 = storageCSV57.local("memory");
        laccan.persistence.StorageCSV storageCSV61 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV63 = storageCSV61.local("hi!");
        laccan.persistence.StorageCSV storageCSV65 = storageCSV63.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList66 = storageCSV65.read();
        java.util.List<laccan.devices.Sample> sampleList67 = storageCSV65.read();
        laccan.persistence.StorageCSV storageCSV69 = storageCSV65.local("");
        laccan.persistence.StorageCSV storageCSV70 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV72 = storageCSV70.local("hi!");
        laccan.persistence.StorageCSV storageCSV74 = storageCSV72.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList75 = storageCSV74.read();
        laccan.persistence.StorageCSV storageCSV77 = storageCSV74.local("memory");
        laccan.persistence.StorageCSV storageCSV78 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV80 = storageCSV78.local("hi!");
        laccan.persistence.StorageCSV storageCSV82 = storageCSV80.local("lastReading");
        java.lang.String[] strArray88 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV82.save(strArray88);
        storageCSV74.save(strArray88);
        storageCSV65.save(strArray88);
        storageCSV60.save(strArray88);
        storageCSV48.save(strArray88);
        storageCSV37.save(strArray88);
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
        org.junit.Assert.assertNotNull(storageCSV40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(storageCSV46);
        org.junit.Assert.assertNotNull(storageCSV48);
        org.junit.Assert.assertNotNull(storageCSV50);
        org.junit.Assert.assertNotNull(storageCSV52);
        org.junit.Assert.assertNotNull(storageCSV55);
        org.junit.Assert.assertNotNull(storageCSV57);
        org.junit.Assert.assertNotNull(sampleList58);
        org.junit.Assert.assertNotNull(storageCSV60);
        org.junit.Assert.assertNotNull(storageCSV63);
        org.junit.Assert.assertNotNull(storageCSV65);
        org.junit.Assert.assertNotNull(sampleList66);
        org.junit.Assert.assertNotNull(sampleList67);
        org.junit.Assert.assertNotNull(storageCSV69);
        org.junit.Assert.assertNotNull(storageCSV72);
        org.junit.Assert.assertNotNull(storageCSV74);
        org.junit.Assert.assertNotNull(sampleList75);
        org.junit.Assert.assertNotNull(storageCSV77);
        org.junit.Assert.assertNotNull(storageCSV80);
        org.junit.Assert.assertNotNull(storageCSV82);
        org.junit.Assert.assertNotNull(strArray88);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test330");
        try {
            laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test331");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        byte[] byteArray7 = micazMsg1.dataGet();
        int int8 = micazMsg1.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test332");
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
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray15);
        try {
            int int24 = micazMsg23.get_Voltage();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test333");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        net.tinyos.message.SerialPacket serialPacket6 = micazMsg1.getSerialPacket();
        byte[] byteArray7 = micazMsg1.dataGet();
        short[] shortArray8 = micazMsg1.get_Buffer();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 6);
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        try {
            micazMsg1.setElement_Buffer(51, (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(serialPacket6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNull(serialPacket11);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test334");
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
        laccan.devices.MicazMsg micazMsg44 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray50 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg44.set_Buffer(shortArray50);
        laccan.devices.MicazMsg micazMsg53 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray54 = micazMsg53.get_Buffer();
        laccan.devices.Sample sample55 = new laccan.devices.Sample(micazMsg53);
        int int56 = micazMsg53.get_NodeID();
        micazMsg53.amTypeSet((int) (byte) 100);
        micazMsg44.dataSet((net.tinyos.message.Message) micazMsg53, (int) (short) 0);
        int int61 = micazMsg44.dataLength();
        laccan.devices.MicazMsg micazMsg63 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray64 = micazMsg63.get_Buffer();
        micazMsg63.setElement_Buffer(0, (short) 10);
        micazMsg63.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg71 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray72 = micazMsg71.get_Buffer();
        java.lang.Object obj73 = micazMsg71.clone();
        int int74 = micazMsg71.get_NodeID();
        byte[] byteArray77 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg78 = new laccan.devices.MicazMsg(byteArray77);
        laccan.devices.MicazMsg micazMsg80 = new laccan.devices.MicazMsg(byteArray77, 2);
        micazMsg71.dataSet(byteArray77);
        micazMsg63.dataSet(byteArray77);
        micazMsg44.dataSet(byteArray77);
        laccan.devices.MicazMsg micazMsg85 = new laccan.devices.MicazMsg(byteArray77, (int) (short) 1);
        try {
            micazMsg42.dataSet((net.tinyos.message.Message) micazMsg85, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 52 + "'", int61 == 52);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(byteArray77);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test335");
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
        laccan.persistence.StorageCSV storageCSV41 = storageCSV7.local("null;-19.699999999999996;0");
        laccan.persistence.StorageCSV storageCSV42 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV44 = storageCSV42.local("hi!");
        laccan.persistence.StorageCSV storageCSV45 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray46 = new java.lang.String[] {};
        storageCSV45.save(strArray46);
        storageCSV42.save(strArray46);
        laccan.persistence.StorageCSV storageCSV50 = storageCSV42.local("nodes");
        laccan.persistence.StorageCSV storageCSV52 = storageCSV42.local("init");
        java.util.List<laccan.devices.Sample> sampleList53 = storageCSV42.read();
        laccan.memory.data.reduction.KeepingAll keepingAll54 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample55 = new laccan.devices.Sample();
        keepingAll54.add(sample55);
        sample55.setTemperature((double) 0L);
        java.lang.String[] strArray59 = sample55.toCSV();
        storageCSV42.save(strArray59);
        storageCSV41.save(strArray59);
        java.util.List<laccan.devices.Sample> sampleList62 = storageCSV41.read();
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
        org.junit.Assert.assertNotNull(storageCSV41);
        org.junit.Assert.assertNotNull(storageCSV44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(storageCSV50);
        org.junit.Assert.assertNotNull(storageCSV52);
        org.junit.Assert.assertNotNull(sampleList53);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(sampleList62);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test336");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(100, (int) (short) 1);
        net.tinyos.message.Message message4 = micazMsg2.clone(96);
        try {
            short short6 = micazMsg2.getElement_Buffer(20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(message4);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test337");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(32, 160);
        micazMsg2.set_NodeID(0);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test338");
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
        laccan.memory.data.reduction.KeepingAll keepingAll18 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList19 = keepingAll18.get();
        int int20 = keepingAll18.length();
        int int21 = keepingAll18.length();
        java.util.List<laccan.devices.Sample> sampleList22 = keepingAll18.get();
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray30 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg24.set_Buffer(shortArray30);
        laccan.devices.Sample sample32 = new laccan.devices.Sample(micazMsg24);
        java.lang.String[] strArray33 = sample32.toCSV();
        java.lang.String str34 = sample32.getNode();
        keepingAll18.add(sample32);
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray38 = micazMsg37.get_Buffer();
        java.lang.Object obj39 = micazMsg37.clone();
        laccan.devices.Sample sample40 = new laccan.devices.Sample(micazMsg37);
        long long41 = sample40.getDate();
        java.lang.Class<?> wildcardClass42 = sample40.getClass();
        laccan.devices.MicazMsg micazMsg44 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray45 = micazMsg44.get_Buffer();
        java.lang.Object obj46 = micazMsg44.clone();
        laccan.devices.Sample sample47 = new laccan.devices.Sample(micazMsg44);
        long long48 = sample47.getDate();
        laccan.devices.Type type49 = laccan.devices.Type.FULL;
        sample47.setType(type49);
        sample40.setType(type49);
        laccan.devices.MicazMsg micazMsg53 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray59 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg53.set_Buffer(shortArray59);
        laccan.devices.Sample sample61 = new laccan.devices.Sample(micazMsg53);
        laccan.devices.Sample sample62 = new laccan.devices.Sample();
        laccan.devices.Type type63 = laccan.devices.Type.FULL;
        sample62.setType(type63);
        sample61.setType(type63);
        sample40.setType(type63);
        keepingAll18.add(sample40);
        memory0.add(sample40);
        double double69 = sample40.getTemperature();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(sampleList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(sampleList22);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + type49 + "' != '" + laccan.devices.Type.FULL + "'", type49.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertTrue("'" + type63 + "' != '" + laccan.devices.Type.FULL + "'", type63.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-19.699999999999996d) + "'", double69 == (-19.699999999999996d));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test339");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray6, 32, 10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray6, 32, (int) (short) 0);
        try {
            laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg13, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test340");
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
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray22 = micazMsg21.get_Buffer();
        java.lang.Object obj23 = micazMsg21.clone();
        java.lang.String str24 = micazMsg21.toString();
        short[] shortArray25 = micazMsg21.get_Buffer();
        byte[] byteArray26 = micazMsg21.dataGet();
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray26);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray26);
        java.lang.String str29 = micazMsg28.toString();
        net.tinyos.message.SerialPacket serialPacket30 = micazMsg28.getSerialPacket();
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray38 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg32.set_Buffer(shortArray38);
        micazMsg32.set_Voltage(2);
        short[] shortArray42 = micazMsg32.get_Buffer();
        micazMsg28.set_Buffer(shortArray42);
        micazMsg19.set_Buffer(shortArray42);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str24.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str29.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNull(serialPacket30);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(shortArray42);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test341");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        net.tinyos.message.SerialPacket serialPacket6 = micazMsg1.getSerialPacket();
        short short8 = micazMsg1.getElement_Buffer((int) (byte) 0);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        byte[] byteArray10 = micazMsg1.dataGet();
        net.tinyos.message.Message message12 = micazMsg1.clone(0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(serialPacket6);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(message12);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test342");
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
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = micazMsg19.get_Buffer();
        java.lang.Object obj21 = micazMsg19.clone();
        laccan.devices.Sample sample22 = new laccan.devices.Sample(micazMsg19);
        laccan.devices.Sample sample23 = new laccan.devices.Sample();
        laccan.devices.Sample sample24 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray25 = new laccan.devices.Sample[] { sample22, sample23, sample24 };
        java.util.ArrayList<laccan.devices.Sample> sampleList26 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList26, sampleArray25);
        java.util.List<java.lang.Double> doubleList28 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList26);
        java.util.List<java.lang.Double> doubleList29 = regression0.result(doubleList28);
        java.lang.Class<?> wildcardClass30 = doubleList29.getClass();
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(sampleArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(sampleArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(doubleList28);
        org.junit.Assert.assertNotNull(doubleList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test343");
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
        laccan.memory.Container container48 = memory0.getMemory();
        int int49 = memory0.length();
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
        org.junit.Assert.assertNotNull(container48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test344");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray8);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray8, 160);
        try {
            int int14 = micazMsg13.get_Voltage();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length -158 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test345");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(1, (int) (byte) 10);
        try {
            micazMsg2.set_Voltage(24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test346");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (byte) 10, (long) 0, 52);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test347");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 24, (long) (-1), 35);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test348");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("full_memory", (double) 12, (long) '#');
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test349");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) (byte) 1);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test350");
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
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray31 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg25.set_Buffer(shortArray31);
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray35 = micazMsg34.get_Buffer();
        java.lang.Object obj36 = micazMsg34.clone();
        java.lang.String str37 = micazMsg34.toString();
        short[] shortArray38 = micazMsg34.get_Buffer();
        byte[] byteArray39 = micazMsg34.dataGet();
        laccan.devices.MicazMsg micazMsg40 = new laccan.devices.MicazMsg(byteArray39);
        micazMsg25.dataSet(byteArray39);
        try {
            micazMsg21.dataSet(byteArray39, (int) '4', (-30), 4);
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
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str37.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(byteArray39);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test351");
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
        int int18 = micazMsg1.baseOffset();
        byte[] byteArray19 = micazMsg1.dataGet();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test352");
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
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, (int) (short) 0);
        byte[] byteArray19 = micazMsg2.dataGet();
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(byteArray19);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test353");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory;-1.0;32", (double) 65535, 512L);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test354");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (byte) 1, (int) (byte) 100);
        try {
            short short4 = micazMsg2.getElement_Buffer(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test355");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        net.tinyos.message.SerialPacket serialPacket6 = micazMsg1.getSerialPacket();
        byte[] byteArray7 = micazMsg1.dataGet();
        short[] shortArray8 = micazMsg1.get_Buffer();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 6);
        short[] shortArray11 = micazMsg1.get_Buffer();
        try {
            laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 256, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(serialPacket6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray11);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test356");
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
        message17.amTypeSet(6);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(message17);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test357");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) ' ');
        micazMsg1.set_NodeID((int) ' ');
        int int14 = micazMsg1.get_NodeID();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test358");
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
        laccan.devices.Sample sample20 = new laccan.devices.Sample("null;-19.699999999999996;10", 0.0d, 10L);
        keepingAll0.add(sample20);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray29 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg23.set_Buffer(shortArray29);
        laccan.devices.Sample sample31 = new laccan.devices.Sample(micazMsg23);
        java.lang.String[] strArray32 = sample31.toCSV();
        keepingAll0.add(sample31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(strArray32);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test359");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 100, (long) 'a', 52);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test360");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(1);
        try {
            micazMsg1.setElement_Buffer(6, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (128) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test361");
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
        int int38 = keepingAll0.length();
        int int39 = keepingAll0.length();
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test362");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, 2);
        micazMsg1.dataSet(byteArray7);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray7, (int) (short) 10);
        net.tinyos.message.SerialPacket serialPacket14 = micazMsg13.getSerialPacket();
        try {
            serialPacket14.init(12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNull(serialPacket14);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test363");
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
        java.util.List<java.lang.Double> doubleList74 = null;
        try {
            java.util.List<java.lang.Double> doubleList75 = regression0.result(doubleList74);
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
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test364");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        net.tinyos.message.Message message6 = micazMsg1.clone((int) (short) 0);
        net.tinyos.message.Message message8 = message6.clone((int) (short) 10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertNotNull(message8);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test365");
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
        java.util.List<java.lang.Double> doubleList87 = laccan.cloud.prediction.Regression.makeTests(sampleList67);
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
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test366");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("memory");
        laccan.persistence.StorageCSV storageCSV8 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV10 = storageCSV8.local("hi!");
        laccan.persistence.StorageCSV storageCSV12 = storageCSV10.local("lastReading");
        java.lang.String[] strArray18 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV12.save(strArray18);
        storageCSV4.save(strArray18);
        laccan.persistence.StorageCSV storageCSV21 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV23 = storageCSV21.local("hi!");
        laccan.persistence.StorageCSV storageCSV25 = storageCSV23.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList26 = storageCSV25.read();
        laccan.persistence.StorageCSV storageCSV28 = storageCSV25.local("memory");
        laccan.persistence.StorageCSV storageCSV29 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV31 = storageCSV29.local("hi!");
        laccan.persistence.StorageCSV storageCSV33 = storageCSV31.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList34 = storageCSV33.read();
        java.util.List<laccan.devices.Sample> sampleList35 = storageCSV33.read();
        laccan.persistence.StorageCSV storageCSV37 = storageCSV33.local("");
        laccan.persistence.StorageCSV storageCSV38 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV40 = storageCSV38.local("hi!");
        laccan.persistence.StorageCSV storageCSV42 = storageCSV40.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList43 = storageCSV42.read();
        laccan.persistence.StorageCSV storageCSV45 = storageCSV42.local("memory");
        laccan.persistence.StorageCSV storageCSV46 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV48 = storageCSV46.local("hi!");
        laccan.persistence.StorageCSV storageCSV50 = storageCSV48.local("lastReading");
        java.lang.String[] strArray56 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV50.save(strArray56);
        storageCSV42.save(strArray56);
        storageCSV33.save(strArray56);
        storageCSV28.save(strArray56);
        storageCSV4.save(strArray56);
        laccan.persistence.StorageCSV storageCSV62 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV64 = storageCSV62.local("hi!");
        laccan.persistence.StorageCSV storageCSV65 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray66 = new java.lang.String[] {};
        storageCSV65.save(strArray66);
        storageCSV62.save(strArray66);
        laccan.persistence.StorageCSV storageCSV70 = storageCSV62.local("nodes");
        laccan.persistence.StorageCSV storageCSV72 = storageCSV62.local("init");
        java.util.List<laccan.devices.Sample> sampleList73 = storageCSV62.read();
        laccan.memory.data.reduction.KeepingAll keepingAll74 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample75 = new laccan.devices.Sample();
        keepingAll74.add(sample75);
        sample75.setTemperature((double) 0L);
        java.lang.String[] strArray79 = sample75.toCSV();
        storageCSV62.save(strArray79);
        storageCSV4.save(strArray79);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(storageCSV23);
        org.junit.Assert.assertNotNull(storageCSV25);
        org.junit.Assert.assertNotNull(sampleList26);
        org.junit.Assert.assertNotNull(storageCSV28);
        org.junit.Assert.assertNotNull(storageCSV31);
        org.junit.Assert.assertNotNull(storageCSV33);
        org.junit.Assert.assertNotNull(sampleList34);
        org.junit.Assert.assertNotNull(sampleList35);
        org.junit.Assert.assertNotNull(storageCSV37);
        org.junit.Assert.assertNotNull(storageCSV40);
        org.junit.Assert.assertNotNull(storageCSV42);
        org.junit.Assert.assertNotNull(sampleList43);
        org.junit.Assert.assertNotNull(storageCSV45);
        org.junit.Assert.assertNotNull(storageCSV48);
        org.junit.Assert.assertNotNull(storageCSV50);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(storageCSV64);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(storageCSV70);
        org.junit.Assert.assertNotNull(storageCSV72);
        org.junit.Assert.assertNotNull(sampleList73);
        org.junit.Assert.assertNotNull(strArray79);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test367");
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
        int int23 = micazMsg22.dataLength();
        try {
            laccan.devices.Sample sample24 = new laccan.devices.Sample(micazMsg22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test368");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, (long) 0);
        sample5.setDate((long) 24);
        double double8 = sample5.getDateDouble();
        long long9 = sample5.getDate();
        java.lang.String str10 = sample5.getNode();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg12);
        int int15 = micazMsg12.dataLength();
        micazMsg12.init((int) '4');
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg12);
        double double19 = sample18.getDateDouble();
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray27 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg21.set_Buffer(shortArray27);
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg21);
        laccan.devices.Sample sample30 = new laccan.devices.Sample();
        laccan.devices.Type type31 = laccan.devices.Type.FULL;
        sample30.setType(type31);
        sample29.setType(type31);
        sample29.setTemperature((double) 'a');
        laccan.devices.Type type36 = sample29.getType();
        sample18.setType(type36);
        laccan.devices.Type type38 = sample18.getType();
        sample5.setType(type38);
        double double40 = sample5.getDateDouble();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 24.0d + "'", double8 == 24.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 24L + "'", long9 == 24L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + laccan.devices.Type.FULL + "'", type31.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type36 + "' != '" + laccan.devices.Type.FULL + "'", type36.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type38 + "' != '" + laccan.devices.Type.FULL + "'", type38.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 24.0d + "'", double40 == 24.0d);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test369");
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
        laccan.memory.Container container23 = memory0.getMemory();
        int int24 = container23.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(container22);
        org.junit.Assert.assertNotNull(container23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test370");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        java.lang.String str7 = sample4.toString();
        sample4.setTemperature((double) (short) 10);
        java.lang.String str10 = sample4.getNode();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null;-19.699999999999996;0" + "'", str7.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test371");
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
        micazMsg8.set_Voltage(0);
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
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test372");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        java.lang.String str6 = sample5.getNode();
        java.lang.String str7 = sample5.getNode();
        long long8 = sample5.getDate();
        double double9 = sample5.getTemperature();
        sample5.setNode("hi!");
        double double12 = sample5.getTemperature();
        double double13 = sample5.getTemperature();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-19.699999999999996d) + "'", double9 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-19.699999999999996d) + "'", double12 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-19.699999999999996d) + "'", double13 == (-19.699999999999996d));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test373");
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
        int int50 = keepingAll0.length();
        int int51 = keepingAll0.length();
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test374");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.get_NodeID();
        net.tinyos.message.SerialPacket serialPacket9 = micazMsg1.getSerialPacket();
        try {
            net.tinyos.message.Message message11 = serialPacket9.clone((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(serialPacket9);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test375");
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
        laccan.memory.Container container14 = memory0.getMemory();
        java.lang.Class<?> wildcardClass15 = memory0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container12);
        org.junit.Assert.assertNotNull(container14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test376");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg(byteArray2, 16);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2);
        net.tinyos.message.SerialPacket serialPacket6 = micazMsg5.getSerialPacket();
        try {
            net.tinyos.message.Message message8 = serialPacket6.clone(52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNull(serialPacket6);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test377");
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
        storageCSV4.save(strArray35);
        java.util.List<laccan.devices.Sample> sampleList40 = storageCSV4.read();
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg((int) '4');
        int int43 = micazMsg42.dataLength();
        net.tinyos.message.SerialPacket serialPacket44 = micazMsg42.getSerialPacket();
        laccan.devices.Sample sample46 = new laccan.devices.Sample(micazMsg42, (long) (byte) 10);
        laccan.devices.MicazMsg micazMsg49 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj50 = micazMsg49.clone();
        laccan.devices.Sample sample52 = new laccan.devices.Sample(micazMsg49, (long) 0);
        java.lang.String str53 = sample52.getNode();
        laccan.devices.MicazMsg micazMsg55 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray56 = micazMsg55.get_Buffer();
        java.lang.Object obj57 = micazMsg55.clone();
        laccan.devices.Sample sample58 = new laccan.devices.Sample(micazMsg55);
        long long59 = sample58.getDate();
        java.lang.Class<?> wildcardClass60 = sample58.getClass();
        laccan.devices.MicazMsg micazMsg62 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray63 = micazMsg62.get_Buffer();
        java.lang.Object obj64 = micazMsg62.clone();
        laccan.devices.Sample sample65 = new laccan.devices.Sample(micazMsg62);
        long long66 = sample65.getDate();
        laccan.devices.Type type67 = laccan.devices.Type.FULL;
        sample65.setType(type67);
        sample58.setType(type67);
        sample52.setType(type67);
        sample46.setType(type67);
        java.lang.String[] strArray72 = sample46.toCSV();
        storageCSV4.save(strArray72);
        java.util.List<laccan.devices.Sample> sampleList74 = storageCSV4.read();
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
        org.junit.Assert.assertNotNull(sampleList40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
        org.junit.Assert.assertNull(serialPacket44);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + type67 + "' != '" + laccan.devices.Type.FULL + "'", type67.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(sampleList74);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test378");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        memory0.build();
        int int3 = memory0.length();
        memory0.build();
        laccan.memory.Container container5 = memory0.getMemory();
        java.util.List<laccan.devices.Sample> sampleList6 = container5.get();
        java.util.List<laccan.devices.Sample> sampleList7 = container5.get();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(container5);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(sampleList7);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test379");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (byte) 1, 20);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg(byteArray3);
        micazMsg4.init(5);
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test380");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(35);
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1, (long) 8);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test381");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        keepingAll0.add(sample4);
        laccan.devices.Sample sample12 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=", Double.NaN, (long) '#');
        java.lang.String[] strArray13 = sample12.toCSV();
        keepingAll0.add(sample12);
        laccan.devices.Sample sample18 = new laccan.devices.Sample("memory", (double) (byte) -1, (long) ' ');
        java.lang.String str19 = sample18.getNode();
        sample18.setDate((long) 172);
        keepingAll0.add(sample18);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray30 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg24.set_Buffer(shortArray30);
        laccan.devices.Sample sample32 = new laccan.devices.Sample(micazMsg24);
        laccan.devices.Sample sample33 = new laccan.devices.Sample();
        laccan.devices.Type type34 = laccan.devices.Type.FULL;
        sample33.setType(type34);
        sample32.setType(type34);
        sample32.setTemperature((double) 'a');
        double double39 = sample32.getDateDouble();
        keepingAll0.add(sample32);
        int int41 = keepingAll0.length();
        int int42 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList43 = keepingAll0.get();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "memory" + "'", str19.equals("memory"));
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertTrue("'" + type34 + "' != '" + laccan.devices.Type.FULL + "'", type34.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertNotNull(sampleList43);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test382");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList4 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList5 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList6 = keepingAll0.get();
        int int7 = keepingAll0.length();
        laccan.memory.Memory memory8 = new laccan.memory.Memory();
        memory8.build();
        int int10 = memory8.length();
        laccan.memory.data.reduction.KeepingAll keepingAll11 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample12 = new laccan.devices.Sample();
        keepingAll11.add(sample12);
        sample12.setDate(10L);
        memory8.add(sample12);
        int int17 = memory8.length();
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
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray36 = micazMsg35.get_Buffer();
        java.lang.Object obj37 = micazMsg35.clone();
        laccan.devices.Sample sample38 = new laccan.devices.Sample(micazMsg35);
        laccan.devices.Type type39 = null;
        sample38.setType(type39);
        java.lang.String str41 = sample38.toString();
        java.lang.String str42 = sample38.getNode();
        keepingAll18.add(sample38);
        laccan.devices.MicazMsg micazMsg45 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray46 = micazMsg45.get_Buffer();
        java.lang.Object obj47 = micazMsg45.clone();
        micazMsg45.amTypeSet(20);
        laccan.devices.Sample sample50 = new laccan.devices.Sample(micazMsg45);
        sample50.setDate((long) (byte) 1);
        keepingAll18.add(sample50);
        memory8.add(sample50);
        keepingAll0.add(sample50);
        int int56 = keepingAll0.length();
        int int57 = keepingAll0.length();
        laccan.devices.Sample sample58 = new laccan.devices.Sample();
        double double59 = sample58.getDateDouble();
        keepingAll0.add(sample58);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(sampleList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(sampleList21);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "null;-19.699999999999996;0" + "'", str41.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test383");
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
        java.util.List<laccan.devices.Sample> sampleList13 = container11.get();
        java.util.List<laccan.devices.Sample> sampleList14 = container11.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertNotNull(sampleList12);
        org.junit.Assert.assertNotNull(sampleList13);
        org.junit.Assert.assertNotNull(sampleList14);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test384");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        java.lang.String str6 = sample5.getNode();
        java.lang.String str7 = sample5.getNode();
        long long8 = sample5.getDate();
        double double9 = sample5.getTemperature();
        sample5.setTemperature((double) 10L);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-19.699999999999996d) + "'", double9 == (-19.699999999999996d));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test385");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg7.set_Buffer(shortArray13);
        micazMsg1.set_Buffer(shortArray13);
        int int16 = micazMsg1.get_Voltage();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        java.lang.Object obj20 = micazMsg18.clone();
        short short22 = micazMsg18.getElement_Buffer((int) (short) 0);
        byte[] byteArray23 = micazMsg18.dataGet();
        byte[] byteArray24 = micazMsg18.dataGet();
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg18, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteArray24);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test386");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        short short5 = micazMsg1.getElement_Buffer((int) (short) 0);
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1, (long) (short) 0);
        java.lang.Object obj8 = micazMsg1.clone();
        int int9 = micazMsg1.baseOffset();
        int int10 = micazMsg1.get_Voltage();
        int int11 = micazMsg1.get_Voltage();
        net.tinyos.message.Message message13 = micazMsg1.clone(160);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(message13);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test387");
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
        try {
            java.util.List<java.lang.Double> doubleList60 = regression0.result();
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
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test388");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        int int5 = micazMsg1.amType();
        java.lang.Class<?> wildcardClass6 = micazMsg1.getClass();
        micazMsg1.amTypeSet((int) (byte) 10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 172 + "'", int5 == 172);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test389");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
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
        java.lang.String[] strArray21 = sample13.toCSV();
        storageCSV2.save(strArray21);
        laccan.persistence.StorageCSV storageCSV24 = storageCSV2.local("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=;NaN;35");
        laccan.persistence.StorageCSV storageCSV26 = storageCSV2.local("reduction;-19.699999999999996;0;1.0;0");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(sampleList8);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(storageCSV24);
        org.junit.Assert.assertNotNull(storageCSV26);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test390");
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
        micazMsg21.init(32);
        int int24 = micazMsg21.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test391");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test392");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        net.tinyos.message.SerialPacket serialPacket6 = micazMsg1.getSerialPacket();
        byte[] byteArray7 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray7, (int) '#');
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray7, 10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(serialPacket6);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test393");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.648499999999995;0", (double) 52, 0L);
        java.lang.String str4 = sample3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null;-19.648499999999995;0;52.0;0" + "'", str4.equals("null;-19.648499999999995;0;52.0;0"));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test394");
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
        byte[] byteArray18 = micazMsg1.dataGet();
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg1, (long) 32);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNull(serialPacket15);
        org.junit.Assert.assertNotNull(message17);
        org.junit.Assert.assertNotNull(byteArray18);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test395");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;10.0;35", 0.0d, (long) 35);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test396");
        laccan.devices.MicazMsg micazMsg0 = new laccan.devices.MicazMsg();
        int int1 = micazMsg0.amType();
        int int2 = micazMsg0.baseOffset();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg5.amTypeSet(2);
        net.tinyos.message.Message message9 = micazMsg5.clone((int) '4');
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg5);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        int int15 = micazMsg12.get_NodeID();
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray18);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray18, 2);
        micazMsg12.dataSet(byteArray18);
        int int23 = micazMsg12.baseOffset();
        micazMsg12.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg12, (int) (short) 10);
        byte[] byteArray28 = micazMsg12.dataGet();
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray28);
        micazMsg5.dataSet(byteArray28);
        try {
            micazMsg0.dataSet(byteArray28, 256, (-30), 160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 172 + "'", int1 == 172);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test397");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(51, (int) (byte) 10);
        int int3 = micazMsg2.amType();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 172 + "'", int3 == 172);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test398");
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
        short[] shortArray23 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg17.set_Buffer(shortArray23);
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg17);
        java.lang.String[] strArray26 = sample25.toCSV();
        sample25.setNode("hi!");
        sample25.setTemperature((double) 0);
        long long31 = sample25.getDate();
        keepingAll0.add(sample25);
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray40 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg34.set_Buffer(shortArray40);
        laccan.devices.Sample sample42 = new laccan.devices.Sample(micazMsg34);
        laccan.devices.Sample sample43 = new laccan.devices.Sample();
        laccan.devices.Type type44 = laccan.devices.Type.FULL;
        sample43.setType(type44);
        sample42.setType(type44);
        sample25.setType(type44);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(sampleList14);
        org.junit.Assert.assertNotNull(sampleList15);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertTrue("'" + type44 + "' != '" + laccan.devices.Type.FULL + "'", type44.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test399");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        java.lang.Object obj10 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg1);
        net.tinyos.message.Message message14 = micazMsg1.clone(0);
        int int15 = message14.dataLength();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        micazMsg17.set_Voltage((int) '#');
        micazMsg17.amTypeSet(52);
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray26, 48);
        micazMsg17.dataSet(byteArray26);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg(byteArray26, (int) '#');
        try {
            message14.dataSet(byteArray26, 65535, (int) (byte) 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray26);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test400");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        int int4 = micazMsg2.get_NodeID();
        int int5 = micazMsg2.dataLength();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test401");
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
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (-1));
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
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test402");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        java.lang.String str16 = micazMsg13.toString();
        micazMsg13.init(20);
        micazMsg13.set_Voltage(51);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=" + "'", str16.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer="));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test403");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        storageCSV3.save(strArray4);
        storageCSV0.save(strArray4);
        laccan.persistence.StorageCSV storageCSV8 = storageCSV0.local("full_memory");
        java.lang.Class<?> wildcardClass9 = storageCSV8.getClass();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test404");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(10, (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test405");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("result", (double) 128, (long) 48);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test406");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        sample4.setTemperature((double) 16);
        sample4.setNode("reduction");
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg10);
        laccan.devices.Type type14 = null;
        sample13.setType(type14);
        sample13.setNode("");
        laccan.devices.Type type18 = laccan.devices.Type.REDUCE;
        sample13.setType(type18);
        sample4.setType(type18);
        sample4.setTemperature((double) 32);
        double double23 = sample4.getDateDouble();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + laccan.devices.Type.REDUCE + "'", type18.equals(laccan.devices.Type.REDUCE));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test407");
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
        int int14 = micazMsg1.baseOffset();
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test408");
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
        double double53 = regression0.mse();
        laccan.cloud.prediction.Regression regression54 = new laccan.cloud.prediction.Regression();
        double double55 = regression54.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll56 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList57 = keepingAll56.get();
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
        regression54.init(sampleList57, doubleList87);
        regression54.train();
        java.util.List<java.lang.Double> doubleList92 = regression54.result();
        double double93 = regression54.mse();
        java.util.List<java.lang.Double> doubleList94 = regression54.result();
        java.util.List<java.lang.Double> doubleList95 = regression54.result();
        java.util.List<java.lang.Double> doubleList96 = regression54.result();
        java.util.List<java.lang.Double> doubleList97 = regression54.result();
        java.util.List<java.lang.Double> doubleList98 = regression0.result(doubleList97);
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
        org.junit.Assert.assertEquals((double) double53, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double55, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList57);
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
        org.junit.Assert.assertNotNull(doubleList92);
        org.junit.Assert.assertEquals((double) double93, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList94);
        org.junit.Assert.assertNotNull(doubleList95);
        org.junit.Assert.assertNotNull(doubleList96);
        org.junit.Assert.assertNotNull(doubleList97);
        org.junit.Assert.assertNotNull(doubleList98);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test409");
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
        java.util.List<java.lang.Double> doubleList39 = laccan.cloud.prediction.Regression.makeTests(sampleList38);
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
        org.junit.Assert.assertNotNull(doubleList39);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test410");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, (long) 0);
        double double6 = sample5.getTemperature();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-19.699999999999996d) + "'", double6 == (-19.699999999999996d));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test411");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1);
        double double8 = sample7.getDateDouble();
        sample7.setDate((long) (short) 0);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg12);
        laccan.devices.Type type16 = null;
        sample15.setType(type16);
        java.lang.String str18 = sample15.toString();
        sample15.setTemperature((double) (short) 10);
        laccan.devices.Type type21 = sample15.getType();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = micazMsg23.get_Buffer();
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg23);
        int int26 = micazMsg23.dataLength();
        micazMsg23.init((int) '4');
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg23);
        double double30 = sample29.getDateDouble();
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray38 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg32.set_Buffer(shortArray38);
        laccan.devices.Sample sample40 = new laccan.devices.Sample(micazMsg32);
        laccan.devices.Sample sample41 = new laccan.devices.Sample();
        laccan.devices.Type type42 = laccan.devices.Type.FULL;
        sample41.setType(type42);
        sample40.setType(type42);
        sample40.setTemperature((double) 'a');
        laccan.devices.Type type47 = sample40.getType();
        sample29.setType(type47);
        sample15.setType(type47);
        sample7.setType(type47);
        laccan.devices.Type type51 = sample7.getType();
        sample7.setNode("");
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null;-19.699999999999996;0" + "'", str18.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(type21);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertTrue("'" + type42 + "' != '" + laccan.devices.Type.FULL + "'", type42.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type47 + "' != '" + laccan.devices.Type.FULL + "'", type47.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type51 + "' != '" + laccan.devices.Type.FULL + "'", type51.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test412");
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
        regression0.train();
        laccan.devices.MicazMsg micazMsg53 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray54 = micazMsg53.get_Buffer();
        java.lang.Object obj55 = micazMsg53.clone();
        laccan.devices.Sample sample56 = new laccan.devices.Sample(micazMsg53);
        laccan.devices.Sample sample57 = new laccan.devices.Sample();
        laccan.devices.Sample sample58 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray59 = new laccan.devices.Sample[] { sample56, sample57, sample58 };
        java.util.ArrayList<laccan.devices.Sample> sampleList60 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList60, sampleArray59);
        java.util.List<java.lang.Double> doubleList62 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList60);
        java.util.List<java.lang.Double> doubleList63 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList60);
        java.util.List<java.lang.Double> doubleList64 = regression0.result(doubleList63);
        java.util.List<java.lang.Double> doubleList65 = regression0.result();
        regression0.train();
        double double67 = regression0.mse();
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
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(sampleArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(doubleList62);
        org.junit.Assert.assertNotNull(doubleList63);
        org.junit.Assert.assertNotNull(doubleList64);
        org.junit.Assert.assertNotNull(doubleList65);
        org.junit.Assert.assertEquals((double) double67, Double.NaN, 0);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test413");
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
        int int16 = micazMsg2.dataLength();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        java.lang.Object obj20 = micazMsg18.clone();
        java.lang.String str21 = micazMsg18.toString();
        short[] shortArray22 = micazMsg18.get_Buffer();
        byte[] byteArray23 = micazMsg18.dataGet();
        java.lang.Object obj24 = micazMsg18.clone();
        net.tinyos.message.Message message26 = micazMsg18.clone(2);
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray29);
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg(byteArray29, 2);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg(byteArray29);
        micazMsg33.set_NodeID((int) (byte) 10);
        byte[] byteArray36 = micazMsg33.dataGet();
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg(byteArray36);
        message26.dataSet(byteArray36);
        laccan.devices.MicazMsg micazMsg41 = new laccan.devices.MicazMsg(byteArray36, 0, (int) (short) 1);
        micazMsg2.dataSet(byteArray36);
        net.tinyos.message.Message message44 = micazMsg2.clone(100);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str21.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(message26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertNotNull(message44);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test414");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        int int16 = micazMsg13.dataLength();
        int int17 = micazMsg13.amType();
        try {
            laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 172 + "'", int17 == 172);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test415");
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
        java.util.List<java.lang.Double> doubleList88 = regression0.result();
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
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test416");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        java.lang.String str16 = micazMsg13.toString();
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(100, (int) (short) 1);
        java.lang.String str20 = micazMsg19.toString();
        laccan.devices.Sample sample22 = new laccan.devices.Sample(micazMsg19, 100L);
        byte[] byteArray23 = micazMsg19.dataGet();
        micazMsg13.dataSet(byteArray23);
        java.lang.Class<?> wildcardClass25 = byteArray23.getClass();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=" + "'", str16.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer="));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str20.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test417");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(12, (int) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test418");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(52, (int) (short) -1);
        int int3 = micazMsg2.dataLength();
        short[] shortArray4 = null;
        try {
            micazMsg2.set_Buffer(shortArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test419");
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
        laccan.devices.Type type14 = laccan.devices.Type.FULL;
        sample4.setType(type14);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null;-19.699999999999996;0" + "'", str9.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null;-19.699999999999996;0" + "'", str10.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null;-1.0;0" + "'", str13.equals("null;-1.0;0"));
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + laccan.devices.Type.FULL + "'", type14.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test420");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray8);
        try {
            laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray8, (int) ' ', 65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 32, data_length 65 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test421");
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
        laccan.persistence.StorageCSV storageCSV38 = storageCSV10.local("reduction");
        java.lang.Class<?> wildcardClass39 = storageCSV10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test422");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        int int4 = micazMsg2.get_NodeID();
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) (byte) -1);
        java.lang.String[] strArray7 = sample6.toCSV();
        double double8 = sample6.getTemperature();
        long long9 = sample6.getDate();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-19.699999999999996d) + "'", double8 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test423");
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
        int int18 = micazMsg17.dataLength();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test424");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 97, (long) (byte) 10, 35);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test425");
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
            laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg6, (int) (byte) 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 1, data_length 52 and data array size 52");
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
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test426");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        java.lang.Object obj10 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg1);
        net.tinyos.message.Message message14 = micazMsg1.clone(0);
        int int15 = message14.dataLength();
        int int16 = message14.dataLength();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test427");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (byte) 0, (-139));
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test428");
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
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray25);
        java.lang.String str28 = micazMsg27.toString();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x10a]\n  [Voltage=0x64]\n  [Buffer=" + "'", str28.equals("Message <MicazMsg> \n  [NodeID=0x10a]\n  [Voltage=0x64]\n  [Buffer="));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test429");
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
        double double12 = sample11.getTemperature();
        double double13 = sample11.getTemperature();
        keepingAll0.add(sample11);
        java.util.List<laccan.devices.Sample> sampleList15 = keepingAll0.get();
        java.util.List<java.lang.Double> doubleList16 = laccan.cloud.prediction.Regression.makeTests(sampleList15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-19.699999999999996d) + "'", double12 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-19.699999999999996d) + "'", double13 == (-19.699999999999996d));
        org.junit.Assert.assertNotNull(sampleList15);
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test430");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        int int13 = micazMsg1.get_Voltage();
        micazMsg1.set_Voltage(100);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (-1), (int) (byte) -1);
        java.lang.Object obj19 = micazMsg18.clone();
        net.tinyos.message.Message message21 = micazMsg18.clone(32);
        java.lang.String str22 = micazMsg18.toString();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(message21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str22.equals("Message <MicazMsg> \n  [Buffer="));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test431");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        java.lang.Object obj10 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        short short13 = micazMsg1.getElement_Buffer(3);
        net.tinyos.message.SerialPacket serialPacket14 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg1, (long) 52);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertNull(serialPacket14);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test432");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        memory0.build();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        int int8 = micazMsg5.get_NodeID();
        micazMsg5.setElement_Buffer(1, (short) (byte) 0);
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg5, (long) 512);
        memory0.add(sample13);
        long long15 = sample13.getDate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 512L + "'", long15 == 512L);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test433");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(0, 256);
        try {
            laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg2, (long) 48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test434");
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
        micazMsg7.setElement_Buffer(6, (short) 100);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 172 + "'", int10 == 172);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test435");
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
        micazMsg1.set_Voltage(24);
        micazMsg1.set_Voltage(48);
        micazMsg1.amTypeSet(512);
        int int25 = micazMsg1.dataLength();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test436");
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
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray20);
        net.tinyos.message.Message message24 = micazMsg22.clone(35);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(message24);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test437");
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
        java.util.List<java.lang.Double> doubleList90 = regression59.result(doubleList88);
        double double91 = regression59.mse();
        java.util.List<java.lang.Double> doubleList92 = regression59.result();
        java.util.List<java.lang.Double> doubleList93 = regression59.result();
        java.util.List<java.lang.Double> doubleList94 = regression0.result(doubleList93);
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
        org.junit.Assert.assertNotNull(doubleList90);
        org.junit.Assert.assertEquals((double) double91, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList92);
        org.junit.Assert.assertNotNull(doubleList93);
        org.junit.Assert.assertNotNull(doubleList94);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test438");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(20);
        micazMsg1.set_Voltage(256);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        micazMsg5.setElement_Buffer(0, (short) 10);
        micazMsg5.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg5, (int) (byte) 10);
        net.tinyos.message.Message message15 = micazMsg13.clone(0);
        int int16 = micazMsg13.amType();
        int int17 = micazMsg13.dataLength();
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = micazMsg19.get_Buffer();
        java.lang.Object obj21 = micazMsg19.clone();
        int int22 = micazMsg19.get_NodeID();
        micazMsg19.setElement_Buffer(1, (short) (byte) 0);
        int int26 = micazMsg19.get_NodeID();
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg19);
        java.lang.Class<?> wildcardClass28 = micazMsg19.getClass();
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray31 = micazMsg30.get_Buffer();
        laccan.devices.Sample sample32 = new laccan.devices.Sample(micazMsg30);
        int int33 = micazMsg30.get_NodeID();
        byte[] byteArray34 = micazMsg30.dataGet();
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg(byteArray34);
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray38 = micazMsg37.get_Buffer();
        java.lang.Object obj39 = micazMsg37.clone();
        int int40 = micazMsg37.get_NodeID();
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg44 = new laccan.devices.MicazMsg(byteArray43);
        laccan.devices.MicazMsg micazMsg46 = new laccan.devices.MicazMsg(byteArray43, 2);
        micazMsg37.dataSet(byteArray43);
        laccan.devices.MicazMsg micazMsg48 = new laccan.devices.MicazMsg(byteArray43);
        micazMsg35.dataSet(byteArray43);
        laccan.devices.MicazMsg micazMsg50 = new laccan.devices.MicazMsg(byteArray43);
        micazMsg19.dataSet(byteArray43);
        laccan.devices.MicazMsg micazMsg53 = new laccan.devices.MicazMsg(byteArray43, (int) (short) 1);
        laccan.devices.MicazMsg micazMsg54 = new laccan.devices.MicazMsg(byteArray43);
        micazMsg13.dataSet(byteArray43);
        try {
            micazMsg1.dataSet(byteArray43, 35, (-30), 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(message15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 172 + "'", int16 == 172);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 24 + "'", int17 == 24);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(byteArray43);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test439");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (short) 0, (long) (short) -1, (int) (short) 10);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test440");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        micazMsg1.set_NodeID((int) (byte) -1);
        short[] shortArray7 = micazMsg1.get_Buffer();
        net.tinyos.message.SerialPacket serialPacket8 = micazMsg1.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNull(serialPacket8);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test441");
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
        try {
            short[] shortArray31 = micazMsg30.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
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
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test442");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        micazMsg1.set_NodeID((int) 'a');
        int int10 = micazMsg1.dataLength();
        net.tinyos.message.Message message12 = micazMsg1.clone(52);
        net.tinyos.message.SerialPacket serialPacket13 = message12.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(message12);
        org.junit.Assert.assertNull(serialPacket13);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test443");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 128, (long) 12, (int) (byte) -1);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test444");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg1);
        int int9 = micazMsg1.baseOffset();
        int int10 = micazMsg1.get_NodeID();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        java.lang.String str15 = micazMsg12.toString();
        short[] shortArray16 = micazMsg12.get_Buffer();
        byte[] byteArray17 = micazMsg12.dataGet();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray17);
        int int19 = micazMsg18.get_Voltage();
        micazMsg18.amTypeSet((int) 'a');
        java.lang.Object obj22 = micazMsg18.clone();
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg18, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str15.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test445");
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
        try {
            laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg24, (long) 172);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 4 in class class laccan.devices.MicazMsg");
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
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test446");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        java.lang.String str6 = sample5.getNode();
        java.lang.String str7 = sample5.getNode();
        long long8 = sample5.getDate();
        double double9 = sample5.getTemperature();
        sample5.setNode("hi!");
        double double12 = sample5.getTemperature();
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        int int15 = micazMsg14.dataLength();
        net.tinyos.message.SerialPacket serialPacket16 = micazMsg14.getSerialPacket();
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg14, (long) (byte) 10);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj22 = micazMsg21.clone();
        laccan.devices.Sample sample24 = new laccan.devices.Sample(micazMsg21, (long) 0);
        java.lang.String str25 = sample24.getNode();
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray28 = micazMsg27.get_Buffer();
        java.lang.Object obj29 = micazMsg27.clone();
        laccan.devices.Sample sample30 = new laccan.devices.Sample(micazMsg27);
        long long31 = sample30.getDate();
        java.lang.Class<?> wildcardClass32 = sample30.getClass();
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray35 = micazMsg34.get_Buffer();
        java.lang.Object obj36 = micazMsg34.clone();
        laccan.devices.Sample sample37 = new laccan.devices.Sample(micazMsg34);
        long long38 = sample37.getDate();
        laccan.devices.Type type39 = laccan.devices.Type.FULL;
        sample37.setType(type39);
        sample30.setType(type39);
        sample24.setType(type39);
        sample18.setType(type39);
        sample5.setType(type39);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-19.699999999999996d) + "'", double9 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-19.699999999999996d) + "'", double12 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNull(serialPacket16);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + type39 + "' != '" + laccan.devices.Type.FULL + "'", type39.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test447");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        java.lang.String[] strArray10 = sample9.toCSV();
        sample9.setNode("hi!");
        java.lang.String str13 = sample9.getNode();
        sample9.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test448");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(512);
        byte[] byteArray2 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 2);
        java.lang.Object obj5 = micazMsg4.clone();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test449");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        micazMsg1.set_Voltage(20);
        micazMsg1.set_NodeID(10);
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg1, (long) 48);
        java.lang.String str15 = sample14.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null;-19.699999999999996;48" + "'", str15.equals("null;-19.699999999999996;48"));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test450");
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
        int int17 = message14.baseOffset();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(message16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test451");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.dataLength();
        net.tinyos.message.SerialPacket serialPacket3 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (byte) 10);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1);
        sample7.setNode("null;4.0;0");
        laccan.devices.Type type10 = sample7.getType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNull(serialPacket3);
        org.junit.Assert.assertNull(type10);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test452");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.699999999999996;1", (double) '#', (long) 48);
        sample3.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;10.0;100");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test453");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        storageCSV3.save(strArray4);
        storageCSV0.save(strArray4);
        java.lang.Class<?> wildcardClass7 = storageCSV0.getClass();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test454");
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
        java.lang.Class<?> wildcardClass42 = sampleList41.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test455");
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
        double double53 = regression0.mse();
        laccan.devices.MicazMsg micazMsg55 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray56 = micazMsg55.get_Buffer();
        java.lang.Object obj57 = micazMsg55.clone();
        laccan.devices.Sample sample58 = new laccan.devices.Sample(micazMsg55);
        laccan.devices.Sample sample59 = new laccan.devices.Sample();
        laccan.devices.Sample sample60 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray61 = new laccan.devices.Sample[] { sample58, sample59, sample60 };
        java.util.ArrayList<laccan.devices.Sample> sampleList62 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList62, sampleArray61);
        java.util.List<java.lang.Double> doubleList64 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList62);
        java.util.List<java.lang.Double> doubleList65 = regression0.result(doubleList64);
        java.util.List<java.lang.Double> doubleList66 = regression0.result();
        java.util.List<java.lang.Double> doubleList67 = regression0.result();
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
        org.junit.Assert.assertEquals((double) double53, Double.NaN, 0);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(sampleArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(doubleList64);
        org.junit.Assert.assertNotNull(doubleList65);
        org.junit.Assert.assertNotNull(doubleList66);
        org.junit.Assert.assertNotNull(doubleList67);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test456");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (byte) 100, 35);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test457");
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
        java.util.List<laccan.devices.Sample> sampleList83 = keepingAll0.get();
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
        org.junit.Assert.assertNotNull(sampleList83);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test458");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray5 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray5, 100);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray5);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray5, (-139));
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test459");
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
        regression20.train();
        java.util.List<java.lang.Double> doubleList39 = regression20.result();
        java.util.List<java.lang.Double> doubleList40 = regression0.result(doubleList39);
        laccan.memory.data.reduction.KeepingAll keepingAll41 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample42 = new laccan.devices.Sample();
        keepingAll41.add(sample42);
        java.util.List<laccan.devices.Sample> sampleList44 = keepingAll41.get();
        laccan.cloud.prediction.Regression regression45 = new laccan.cloud.prediction.Regression();
        double double46 = regression45.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll47 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList48 = keepingAll47.get();
        laccan.cloud.prediction.Regression regression49 = new laccan.cloud.prediction.Regression();
        double double50 = regression49.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll51 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList52 = keepingAll51.get();
        laccan.cloud.prediction.Regression regression53 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg55 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray56 = micazMsg55.get_Buffer();
        java.lang.Object obj57 = micazMsg55.clone();
        laccan.devices.Sample sample58 = new laccan.devices.Sample(micazMsg55);
        laccan.devices.Sample sample59 = new laccan.devices.Sample();
        laccan.devices.Sample sample60 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray61 = new laccan.devices.Sample[] { sample58, sample59, sample60 };
        java.util.ArrayList<laccan.devices.Sample> sampleList62 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList62, sampleArray61);
        java.util.List<java.lang.Double> doubleList64 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList62);
        java.util.List<java.lang.Double> doubleList65 = regression53.result(doubleList64);
        regression49.init(sampleList52, doubleList64);
        laccan.cloud.prediction.Regression regression67 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg69 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray70 = micazMsg69.get_Buffer();
        java.lang.Object obj71 = micazMsg69.clone();
        laccan.devices.Sample sample72 = new laccan.devices.Sample(micazMsg69);
        laccan.devices.Sample sample73 = new laccan.devices.Sample();
        laccan.devices.Sample sample74 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray75 = new laccan.devices.Sample[] { sample72, sample73, sample74 };
        java.util.ArrayList<laccan.devices.Sample> sampleList76 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList76, sampleArray75);
        java.util.List<java.lang.Double> doubleList78 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList76);
        java.util.List<java.lang.Double> doubleList79 = regression67.result(doubleList78);
        java.util.List<java.lang.Double> doubleList80 = regression49.result(doubleList78);
        regression45.init(sampleList48, doubleList78);
        regression45.train();
        java.util.List<java.lang.Double> doubleList83 = regression45.result();
        regression0.init(sampleList44, doubleList83);
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
        org.junit.Assert.assertEquals((double) double21, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList23);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(sampleArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleList35);
        org.junit.Assert.assertNotNull(doubleList36);
        org.junit.Assert.assertNotNull(doubleList39);
        org.junit.Assert.assertNotNull(doubleList40);
        org.junit.Assert.assertNotNull(sampleList44);
        org.junit.Assert.assertEquals((double) double46, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList48);
        org.junit.Assert.assertEquals((double) double50, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList52);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(sampleArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(doubleList64);
        org.junit.Assert.assertNotNull(doubleList65);
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(sampleArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(doubleList78);
        org.junit.Assert.assertNotNull(doubleList79);
        org.junit.Assert.assertNotNull(doubleList80);
        org.junit.Assert.assertNotNull(doubleList83);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test460");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        byte[] byteArray7 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        micazMsg9.set_NodeID((int) (byte) -1);
        int int13 = micazMsg9.baseOffset();
        java.lang.String str14 = micazMsg9.toString();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = micazMsg16.get_Buffer();
        java.lang.Object obj18 = micazMsg16.clone();
        micazMsg16.amTypeSet(20);
        int int21 = micazMsg16.baseOffset();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg16, 0);
        java.lang.String str24 = micazMsg23.toString();
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray32 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg26.set_Buffer(shortArray32);
        int int34 = micazMsg26.get_NodeID();
        int int35 = micazMsg26.amType();
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj39 = micazMsg38.clone();
        int int40 = micazMsg38.get_NodeID();
        laccan.devices.Sample sample42 = new laccan.devices.Sample(micazMsg38, (long) (byte) -1);
        laccan.devices.MicazMsg micazMsg44 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray45 = micazMsg44.get_Buffer();
        java.lang.Object obj46 = micazMsg44.clone();
        java.lang.String str47 = micazMsg44.toString();
        short[] shortArray48 = micazMsg44.get_Buffer();
        micazMsg38.set_Buffer(shortArray48);
        byte[] byteArray50 = micazMsg38.dataGet();
        micazMsg26.dataSet(byteArray50);
        micazMsg23.dataSet(byteArray50);
        micazMsg9.dataSet(byteArray50, (int) (byte) 10, 6, (int) (short) 0);
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg9, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str14.equals("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str24.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 172 + "'", int35 == 172);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str47.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertNotNull(byteArray50);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test461");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory;-19.699999999999996;-1;32.0;32", (double) (short) -1, 52L);
        laccan.devices.Type type4 = sample3.getType();
        org.junit.Assert.assertNull(type4);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test462");
        net.tinyos.message.Message message0 = null;
        try {
            laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(message0, 16, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test463");
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
        java.util.List<laccan.devices.Sample> sampleList13 = container10.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(sampleList12);
        org.junit.Assert.assertNotNull(sampleList13);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test464");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        int int4 = micazMsg1.baseOffset();
        java.lang.Class<?> wildcardClass5 = micazMsg1.getClass();
        byte[] byteArray6 = null;
        try {
            micazMsg1.dataSet(byteArray6, 64, 65, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test465");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        int int8 = micazMsg7.get_Voltage();
        micazMsg7.amTypeSet((int) 'a');
        micazMsg7.amTypeSet(16);
        int int13 = micazMsg7.get_NodeID();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg7);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test466");
        laccan.devices.helper.utils.Assistant.predictorType = "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;32.0;100";
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test467");
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
        sample20.setDate((long) ' ');
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
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test468");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(100, (int) (short) 1);
        java.lang.String str3 = micazMsg2.toString();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, 100L);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = micazMsg7.get_Buffer();
        java.lang.Object obj9 = micazMsg7.clone();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg7);
        long long11 = sample10.getDate();
        laccan.devices.Type type12 = laccan.devices.Type.FULL;
        sample10.setType(type12);
        sample10.setNode("reduction");
        java.lang.Class<?> wildcardClass16 = sample10.getClass();
        laccan.devices.Type type17 = sample10.getType();
        sample5.setType(type17);
        sample5.setNode("result");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str3.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + laccan.devices.Type.FULL + "'", type12.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + type17 + "' != '" + laccan.devices.Type.FULL + "'", type17.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test469");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 2);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        net.tinyos.message.Message message8 = micazMsg6.clone(160);
        java.lang.String str9 = micazMsg6.toString();
        try {
            laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg6, (long) 512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(message8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer="));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test470");
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
        try {
            laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray10, 64, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 64, data_length 5 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 256 + "'", int4 == 256);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test471");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        java.util.List<laccan.devices.Sample> sampleList1 = storageCSV0.read();
        java.util.List<laccan.devices.Sample> sampleList2 = storageCSV0.read();
        laccan.persistence.StorageCSV storageCSV4 = storageCSV0.local("reduction;-19.699999999999996;0");
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertNotNull(sampleList2);
        org.junit.Assert.assertNotNull(storageCSV4);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test472");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.dataLength();
        java.lang.Object obj3 = micazMsg1.clone();
        short short5 = micazMsg1.getElement_Buffer(0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray8, 2);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8);
        net.tinyos.message.Message message14 = micazMsg12.clone(160);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg12, 0);
        int int17 = micazMsg1.baseOffset();
        short short19 = micazMsg1.getElement_Buffer(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test473");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        micazMsg13.amTypeSet(1);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = micazMsg19.get_Buffer();
        java.lang.Object obj21 = micazMsg19.clone();
        int int22 = micazMsg19.get_NodeID();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray25);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray25, 2);
        micazMsg19.dataSet(byteArray25);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg(byteArray25, (int) (short) 10);
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg(byteArray25);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg(byteArray25);
        micazMsg13.dataSet(byteArray25);
        try {
            micazMsg13.setElement_Buffer((int) (short) 10, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test474");
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
        sample20.setNode("");
        sample20.setDate((long) 52);
        laccan.memory.Memory memory35 = new laccan.memory.Memory();
        memory35.build();
        int int37 = memory35.length();
        laccan.memory.Container container38 = memory35.getMemory();
        laccan.devices.MicazMsg micazMsg40 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray46 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg40.set_Buffer(shortArray46);
        laccan.devices.Sample sample48 = new laccan.devices.Sample(micazMsg40);
        java.lang.String[] strArray49 = sample48.toCSV();
        sample48.setNode("hi!");
        memory35.add(sample48);
        double double53 = sample48.getDateDouble();
        laccan.devices.MicazMsg micazMsg55 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray56 = micazMsg55.get_Buffer();
        java.lang.Object obj57 = micazMsg55.clone();
        laccan.devices.Sample sample58 = new laccan.devices.Sample(micazMsg55);
        laccan.devices.Type type59 = null;
        sample58.setType(type59);
        laccan.devices.Type type61 = null;
        sample58.setType(type61);
        laccan.devices.Type type63 = sample58.getType();
        double double64 = sample58.getTemperature();
        laccan.devices.Sample sample65 = new laccan.devices.Sample();
        double double66 = sample65.getDateDouble();
        laccan.devices.MicazMsg micazMsg68 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray74 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg68.set_Buffer(shortArray74);
        laccan.devices.Sample sample76 = new laccan.devices.Sample(micazMsg68);
        laccan.devices.Sample sample77 = new laccan.devices.Sample();
        laccan.devices.Type type78 = laccan.devices.Type.FULL;
        sample77.setType(type78);
        sample76.setType(type78);
        sample65.setType(type78);
        sample58.setType(type78);
        sample48.setType(type78);
        sample20.setType(type78);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(container38);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNull(type63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-19.699999999999996d) + "'", double64 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertTrue("'" + type78 + "' != '" + laccan.devices.Type.FULL + "'", type78.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test475");
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
        int int30 = micazMsg1.dataLength();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test476");
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
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg13);
        long long17 = sample16.getDate();
        laccan.devices.Type type18 = laccan.devices.Type.FULL;
        sample16.setType(type18);
        sample16.setNode("reduction");
        double double22 = sample16.getTemperature();
        keepingAll0.add(sample16);
        sample16.setNode("null;-19.699999999999996;1");
        java.lang.String str26 = sample16.toString();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + laccan.devices.Type.FULL + "'", type18.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-19.699999999999996d) + "'", double22 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "null;-19.699999999999996;1;-19.699999999999996;0" + "'", str26.equals("null;-19.699999999999996;1;-19.699999999999996;0"));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test477");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 1);
        java.lang.String str6 = micazMsg5.toString();
        try {
            micazMsg5.setElement_Buffer(24, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str6.equals("Message <MicazMsg> \n  [Buffer="));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test478");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        int int3 = micazMsg1.get_NodeID();
        java.lang.Object obj4 = micazMsg1.clone();
        micazMsg1.init((int) (short) 10);
        net.tinyos.message.SerialPacket serialPacket7 = micazMsg1.getSerialPacket();
        int int8 = micazMsg1.get_NodeID();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(serialPacket7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test479");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (short) 1, (long) (-30), (int) ' ');
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test480");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(100, (int) (short) 1);
        java.lang.String str3 = micazMsg2.toString();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, 100L);
        byte[] byteArray6 = micazMsg2.dataGet();
        try {
            micazMsg2.setElement_Buffer((-139), (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str3.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test481");
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
        int int30 = micazMsg1.get_Voltage();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test482");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        java.lang.Class<?> wildcardClass13 = micazMsg1.getClass();
        net.tinyos.message.Message message14 = null;
        try {
            micazMsg1.dataSet(message14, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test483");
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
        double double12 = sample4.getDateDouble();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "reduction;-19.699999999999996;0" + "'", str10.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "reduction" + "'", str11.equals("reduction"));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test484");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.699999999999996;10", 0.0d, 10L);
        long long4 = sample3.getDate();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test485");
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
            short short25 = micazMsg21.getElement_Buffer(24);
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
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test486");
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
        int int17 = memory0.length();
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = micazMsg19.get_Buffer();
        java.lang.Object obj21 = micazMsg19.clone();
        java.lang.String str22 = micazMsg19.toString();
        short[] shortArray23 = micazMsg19.get_Buffer();
        byte[] byteArray24 = micazMsg19.dataGet();
        java.lang.Object obj25 = micazMsg19.clone();
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg19);
        int int27 = micazMsg19.dataLength();
        int int28 = micazMsg19.baseOffset();
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg19);
        double double30 = sample29.getDateDouble();
        memory0.add(sample29);
        laccan.memory.Container container32 = memory0.getMemory();
        laccan.memory.Memory memory33 = new laccan.memory.Memory();
        memory33.build();
        int int35 = memory33.length();
        laccan.memory.data.reduction.KeepingAll keepingAll36 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample37 = new laccan.devices.Sample();
        keepingAll36.add(sample37);
        sample37.setDate(10L);
        memory33.add(sample37);
        memory33.build();
        laccan.memory.Container container43 = memory33.getMemory();
        laccan.devices.Sample sample47 = new laccan.devices.Sample("memory", (double) (byte) -1, (long) ' ');
        java.lang.String str48 = sample47.getNode();
        memory33.add(sample47);
        memory0.add(sample47);
        laccan.memory.Container container51 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str22.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(container32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(container43);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "memory" + "'", str48.equals("memory"));
        org.junit.Assert.assertNotNull(container51);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test487");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        short[] shortArray6 = micazMsg1.get_Buffer();
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray9, 16);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray9);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray9);
        try {
            micazMsg1.dataSet(byteArray9, 3, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test488");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        java.lang.String str16 = micazMsg13.toString();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        java.lang.Object obj20 = micazMsg18.clone();
        java.lang.String str21 = micazMsg18.toString();
        short[] shortArray22 = micazMsg18.get_Buffer();
        byte[] byteArray23 = micazMsg18.dataGet();
        micazMsg13.dataSet(byteArray23);
        try {
            laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray23, 24, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 24, data_length 64 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=" + "'", str16.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer="));
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str21.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(byteArray23);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test489");
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
        sample11.setTemperature((double) 10.0f);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test490");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory;-19.699999999999996;-1;32.0;32", (double) 10L, 0L);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test491");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.set_Voltage((int) (byte) 1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test492");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        short short6 = micazMsg2.getElement_Buffer(1);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        micazMsg8.amTypeSet(20);
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg8);
        java.lang.Object obj14 = micazMsg8.clone();
        net.tinyos.message.Message message16 = micazMsg8.clone((int) ' ');
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray19, 16);
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray19);
        message16.dataSet(byteArray19);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray19, (int) ' ');
        micazMsg2.dataSet(byteArray19);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(message16);
        org.junit.Assert.assertNotNull(byteArray19);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test493");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        keepingAll0.add(sample4);
        laccan.devices.Sample sample12 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=", Double.NaN, (long) '#');
        java.lang.String[] strArray13 = sample12.toCSV();
        keepingAll0.add(sample12);
        laccan.devices.Sample sample18 = new laccan.devices.Sample("memory", (double) (byte) -1, (long) ' ');
        java.lang.String str19 = sample18.getNode();
        sample18.setDate((long) 172);
        keepingAll0.add(sample18);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray30 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg24.set_Buffer(shortArray30);
        laccan.devices.Sample sample32 = new laccan.devices.Sample(micazMsg24);
        laccan.devices.Sample sample33 = new laccan.devices.Sample();
        laccan.devices.Type type34 = laccan.devices.Type.FULL;
        sample33.setType(type34);
        sample32.setType(type34);
        sample32.setTemperature((double) 'a');
        double double39 = sample32.getDateDouble();
        keepingAll0.add(sample32);
        int int41 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg43 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray44 = micazMsg43.get_Buffer();
        laccan.devices.Sample sample45 = new laccan.devices.Sample(micazMsg43);
        laccan.devices.Sample sample47 = new laccan.devices.Sample(micazMsg43, (long) (short) 10);
        java.lang.String str48 = sample47.getNode();
        java.lang.String str49 = sample47.getNode();
        long long50 = sample47.getDate();
        double double51 = sample47.getTemperature();
        double double52 = sample47.getTemperature();
        keepingAll0.add(sample47);
        double double54 = sample47.getTemperature();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "memory" + "'", str19.equals("memory"));
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertTrue("'" + type34 + "' != '" + laccan.devices.Type.FULL + "'", type34.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 10L + "'", long50 == 10L);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-19.699999999999996d) + "'", double51 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-19.699999999999996d) + "'", double52 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-19.699999999999996d) + "'", double54 == (-19.699999999999996d));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test494");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        memory0.build();
        int int3 = memory0.length();
        memory0.build();
        laccan.memory.Container container5 = memory0.getMemory();
        laccan.memory.Container container6 = memory0.getMemory();
        int int7 = container6.length();
        int int8 = container6.length();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(container5);
        org.junit.Assert.assertNotNull(container6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test495");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, 2);
        micazMsg1.dataSet(byteArray7);
        java.lang.String str12 = micazMsg1.toString();
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = micazMsg14.get_Buffer();
        java.lang.Object obj16 = micazMsg14.clone();
        micazMsg14.amTypeSet(20);
        int int19 = micazMsg14.baseOffset();
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray22 = micazMsg21.get_Buffer();
        java.lang.Object obj23 = micazMsg21.clone();
        micazMsg21.set_NodeID(20);
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray28);
        micazMsg21.dataSet(byteArray28);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg(byteArray28);
        micazMsg14.dataSet(byteArray28);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg(byteArray28);
        micazMsg1.dataSet(byteArray28);
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg(byteArray28, 48);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(byteArray28);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test496");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        int int13 = micazMsg12.baseOffset();
        try {
            laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg12, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 256, data_length 24 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test497");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        int int13 = micazMsg1.get_Voltage();
        micazMsg1.set_Voltage(100);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (-1), (int) (byte) -1);
        int int19 = micazMsg1.get_Voltage();
        try {
            short short21 = micazMsg1.getElement_Buffer((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test498");
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
            micazMsg17.set_Voltage(65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
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
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test499");
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
        message26.amTypeSet((int) 'a');
        int int29 = message26.baseOffset();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test500");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        int int11 = micazMsg1.dataLength();
        int int12 = micazMsg1.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }
}

