package laccan;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test001");
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
        memory0.build();
        memory0.build();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNull(type11);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test002");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) ' ');
        micazMsg1.set_NodeID((int) ' ');
        net.tinyos.message.SerialPacket serialPacket14 = micazMsg1.getSerialPacket();
        int int15 = micazMsg1.get_NodeID();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(serialPacket14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test003");
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
        java.lang.Class<?> wildcardClass42 = sampleList41.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test004");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        double double6 = sample5.getDateDouble();
        java.lang.String[] strArray7 = sample5.toCSV();
        java.lang.String str8 = sample5.toString();
        laccan.devices.Type type9 = sample5.getType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null;-19.699999999999996;10" + "'", str8.equals("null;-19.699999999999996;10"));
        org.junit.Assert.assertNull(type9);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test005");
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
        java.util.List<laccan.devices.Sample> sampleList16 = null;
        laccan.cloud.prediction.Regression regression17 = new laccan.cloud.prediction.Regression();
        double double18 = regression17.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll19 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList20 = keepingAll19.get();
        laccan.cloud.prediction.Regression regression21 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = micazMsg23.get_Buffer();
        java.lang.Object obj25 = micazMsg23.clone();
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg23);
        laccan.devices.Sample sample27 = new laccan.devices.Sample();
        laccan.devices.Sample sample28 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray29 = new laccan.devices.Sample[] { sample26, sample27, sample28 };
        java.util.ArrayList<laccan.devices.Sample> sampleList30 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList30, sampleArray29);
        java.util.List<java.lang.Double> doubleList32 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList30);
        java.util.List<java.lang.Double> doubleList33 = regression21.result(doubleList32);
        regression17.init(sampleList20, doubleList32);
        regression17.train();
        java.util.List<java.lang.Double> doubleList36 = regression17.result();
        regression0.init(sampleList16, doubleList36);
        laccan.memory.data.reduction.KeepingAll keepingAll38 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample39 = new laccan.devices.Sample();
        keepingAll38.add(sample39);
        int int41 = keepingAll38.length();
        int int42 = keepingAll38.length();
        java.util.List<laccan.devices.Sample> sampleList43 = keepingAll38.get();
        java.util.List<java.lang.Double> doubleList44 = null;
        regression0.init(sampleList43, doubleList44);
        laccan.memory.data.reduction.KeepingAll keepingAll46 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList47 = keepingAll46.get();
        int int48 = keepingAll46.length();
        java.util.List<laccan.devices.Sample> sampleList49 = keepingAll46.get();
        laccan.devices.MicazMsg micazMsg51 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray52 = micazMsg51.get_Buffer();
        java.lang.Object obj53 = micazMsg51.clone();
        laccan.devices.Sample sample54 = new laccan.devices.Sample(micazMsg51);
        laccan.devices.Type type55 = null;
        sample54.setType(type55);
        laccan.devices.Type type57 = null;
        sample54.setType(type57);
        sample54.setNode("hi!");
        keepingAll46.add(sample54);
        int int62 = keepingAll46.length();
        java.util.List<laccan.devices.Sample> sampleList63 = keepingAll46.get();
        java.util.List<laccan.devices.Sample> sampleList64 = keepingAll46.get();
        java.util.List<laccan.devices.Sample> sampleList65 = keepingAll46.get();
        laccan.cloud.prediction.Regression regression66 = new laccan.cloud.prediction.Regression();
        double double67 = regression66.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll68 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList69 = keepingAll68.get();
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
        regression66.init(sampleList69, doubleList81);
        double double84 = regression66.mse();
        java.util.List<java.lang.Double> doubleList85 = regression66.result();
        java.util.List<java.lang.Double> doubleList86 = regression66.result();
        regression0.init(sampleList65, doubleList86);
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double2, Double.NaN, 0);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(sampleArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertEquals((double) double18, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList20);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(sampleArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(doubleList32);
        org.junit.Assert.assertNotNull(doubleList33);
        org.junit.Assert.assertNotNull(doubleList36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(sampleList43);
        org.junit.Assert.assertNotNull(sampleList47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(sampleList49);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(sampleList63);
        org.junit.Assert.assertNotNull(sampleList64);
        org.junit.Assert.assertNotNull(sampleList65);
        org.junit.Assert.assertEquals((double) double67, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList69);
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertNotNull(sampleArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(doubleList81);
        org.junit.Assert.assertNotNull(doubleList82);
        org.junit.Assert.assertEquals((double) double84, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList85);
        org.junit.Assert.assertNotNull(doubleList86);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test006");
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
        int int23 = micazMsg20.get_NodeID();
        micazMsg20.setElement_Buffer(1, (short) (byte) 0);
        int int27 = micazMsg20.get_NodeID();
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg20);
        double double29 = sample28.getDateDouble();
        double double30 = sample28.getDateDouble();
        memory0.add(sample28);
        int int32 = memory0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(container18);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test007");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        micazMsg1.amTypeSet((int) (short) -1);
        micazMsg1.set_Voltage(256);
        org.junit.Assert.assertNotNull(shortArray2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test008");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 2);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        micazMsg6.set_NodeID((int) (byte) 10);
        byte[] byteArray9 = micazMsg6.dataGet();
        int int10 = micazMsg6.dataLength();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg6.getSerialPacket();
        micazMsg6.amTypeSet(52);
        int int14 = micazMsg6.dataLength();
        int int15 = micazMsg6.dataLength();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(48, (int) 'a');
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray26 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg20.set_Buffer(shortArray26);
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg20);
        int int29 = micazMsg20.dataLength();
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg32.amTypeSet(2);
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray37 = micazMsg36.get_Buffer();
        java.lang.Object obj38 = micazMsg36.clone();
        java.lang.String str39 = micazMsg36.toString();
        short[] shortArray40 = micazMsg36.get_Buffer();
        micazMsg32.set_Buffer(shortArray40);
        micazMsg20.set_Buffer(shortArray40);
        micazMsg18.set_Buffer(shortArray40);
        try {
            micazMsg6.set_Buffer(shortArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str39.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray40);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test009");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, (long) 0);
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg2, (long) (byte) 10);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg2, (long) (byte) -1);
        laccan.devices.Type type10 = sample9.getType();
        sample9.setDate((long) (-139));
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(type10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test010");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray3, (int) (byte) -1, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray3);
        short[] shortArray8 = micazMsg7.get_Buffer();
        int int9 = micazMsg7.baseOffset();
        short short11 = micazMsg7.getElement_Buffer(0);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        net.tinyos.message.SerialPacket serialPacket16 = micazMsg13.getSerialPacket();
        micazMsg13.set_NodeID((int) (byte) -1);
        int int19 = micazMsg13.baseOffset();
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray22 = micazMsg21.get_Buffer();
        java.lang.Object obj23 = micazMsg21.clone();
        int int24 = micazMsg21.get_NodeID();
        micazMsg21.setElement_Buffer(1, (short) (byte) 0);
        micazMsg21.amTypeSet(0);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray32 = micazMsg31.get_Buffer();
        java.lang.Object obj33 = micazMsg31.clone();
        micazMsg31.amTypeSet(20);
        laccan.devices.Sample sample36 = new laccan.devices.Sample(micazMsg31);
        java.lang.Object obj37 = micazMsg31.clone();
        net.tinyos.message.Message message39 = micazMsg31.clone((int) ' ');
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg42.amTypeSet(2);
        laccan.devices.Sample sample46 = new laccan.devices.Sample(micazMsg42, (long) 512);
        micazMsg42.set_Voltage(16);
        byte[] byteArray49 = micazMsg42.dataGet();
        short[] shortArray50 = micazMsg42.get_Buffer();
        micazMsg31.set_Buffer(shortArray50);
        micazMsg21.set_Buffer(shortArray50);
        micazMsg13.set_Buffer(shortArray50);
        micazMsg7.set_Buffer(shortArray50);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(serialPacket16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(message39);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertNotNull(shortArray50);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test011");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        int int11 = micazMsg1.dataLength();
        int int12 = micazMsg1.get_NodeID();
        short[] shortArray13 = micazMsg1.get_Buffer();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 256 + "'", int12 == 256);
        org.junit.Assert.assertNotNull(shortArray13);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test012");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        byte[] byteArray7 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray7, (int) (short) 1);
        micazMsg9.set_NodeID((int) (short) 1);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg13.set_Buffer(shortArray19);
        int int21 = micazMsg13.get_NodeID();
        int int22 = micazMsg13.amType();
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj26 = micazMsg25.clone();
        int int27 = micazMsg25.get_NodeID();
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg25, (long) (byte) -1);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray32 = micazMsg31.get_Buffer();
        java.lang.Object obj33 = micazMsg31.clone();
        java.lang.String str34 = micazMsg31.toString();
        short[] shortArray35 = micazMsg31.get_Buffer();
        micazMsg25.set_Buffer(shortArray35);
        byte[] byteArray37 = micazMsg25.dataGet();
        micazMsg13.dataSet(byteArray37);
        try {
            micazMsg9.dataSet(byteArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 172 + "'", int22 == 172);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str34.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertNotNull(byteArray37);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test013");
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
        laccan.memory.data.reduction.KeepingAll keepingAll35 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray38 = micazMsg37.get_Buffer();
        java.lang.Object obj39 = micazMsg37.clone();
        laccan.devices.Sample sample40 = new laccan.devices.Sample(micazMsg37);
        laccan.devices.Type type41 = null;
        sample40.setType(type41);
        keepingAll35.add(sample40);
        double double44 = sample40.getDateDouble();
        laccan.memory.Memory memory45 = new laccan.memory.Memory();
        laccan.memory.Container container46 = memory45.getMemory();
        laccan.memory.Container container47 = memory45.getMemory();
        memory45.build();
        memory45.build();
        int int50 = memory45.length();
        laccan.devices.MicazMsg micazMsg52 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray58 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg52.set_Buffer(shortArray58);
        laccan.devices.Sample sample60 = new laccan.devices.Sample(micazMsg52);
        laccan.devices.Sample sample61 = new laccan.devices.Sample();
        laccan.devices.Type type62 = laccan.devices.Type.FULL;
        sample61.setType(type62);
        sample60.setType(type62);
        sample60.setTemperature((double) 'a');
        java.lang.Class<?> wildcardClass67 = sample60.getClass();
        memory45.add(sample60);
        laccan.devices.Type type69 = sample60.getType();
        sample40.setType(type69);
        sample20.setType(type69);
        sample20.setTemperature((double) 5);
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
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNull(container46);
        org.junit.Assert.assertNull(container47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertTrue("'" + type62 + "' != '" + laccan.devices.Type.FULL + "'", type62.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + type69 + "' != '" + laccan.devices.Type.FULL + "'", type69.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test014");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray3, 172);
        try {
            laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray3, 16, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 16, data_length 52 and data array size 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test015");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        int int11 = micazMsg1.baseOffset();
        micazMsg1.set_Voltage(20);
        net.tinyos.message.Message message15 = micazMsg1.clone(0);
        int int16 = micazMsg1.amType();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(message15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 172 + "'", int16 == 172);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test016");
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
        sample0.setTemperature((double) 16);
        java.lang.String str20 = sample0.getNode();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + laccan.devices.Type.FULL + "'", type13.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test017");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        micazMsg1.set_Voltage((int) ' ');
        try {
            laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 35, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test018");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1);
        int int11 = micazMsg1.amType();
        java.lang.String str12 = micazMsg1.toString();
        micazMsg1.init((int) (short) 100);
        micazMsg1.set_Voltage(16);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        java.lang.Object obj20 = micazMsg18.clone();
        micazMsg18.set_NodeID(20);
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray25);
        micazMsg18.dataSet(byteArray25);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray25, 0);
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray25);
        micazMsg1.dataSet(byteArray25);
        byte[] byteArray32 = micazMsg1.dataGet();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 172 + "'", int11 == 172);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteArray32);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test019");
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
        laccan.cloud.prediction.Regression regression56 = new laccan.cloud.prediction.Regression();
        double double57 = regression56.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll58 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList59 = keepingAll58.get();
        laccan.cloud.prediction.Regression regression60 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg62 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray63 = micazMsg62.get_Buffer();
        java.lang.Object obj64 = micazMsg62.clone();
        laccan.devices.Sample sample65 = new laccan.devices.Sample(micazMsg62);
        laccan.devices.Sample sample66 = new laccan.devices.Sample();
        laccan.devices.Sample sample67 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray68 = new laccan.devices.Sample[] { sample65, sample66, sample67 };
        java.util.ArrayList<laccan.devices.Sample> sampleList69 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList69, sampleArray68);
        java.util.List<java.lang.Double> doubleList71 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList69);
        java.util.List<java.lang.Double> doubleList72 = regression60.result(doubleList71);
        regression56.init(sampleList59, doubleList71);
        laccan.cloud.prediction.Regression regression74 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg76 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray77 = micazMsg76.get_Buffer();
        java.lang.Object obj78 = micazMsg76.clone();
        laccan.devices.Sample sample79 = new laccan.devices.Sample(micazMsg76);
        laccan.devices.Sample sample80 = new laccan.devices.Sample();
        laccan.devices.Sample sample81 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray82 = new laccan.devices.Sample[] { sample79, sample80, sample81 };
        java.util.ArrayList<laccan.devices.Sample> sampleList83 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList83, sampleArray82);
        java.util.List<java.lang.Double> doubleList85 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList83);
        java.util.List<java.lang.Double> doubleList86 = regression74.result(doubleList85);
        java.util.List<java.lang.Double> doubleList87 = regression56.result(doubleList85);
        double double88 = regression56.mse();
        java.util.List<java.lang.Double> doubleList89 = regression56.result();
        java.util.List<java.lang.Double> doubleList90 = regression0.result(doubleList89);
        java.util.List<java.lang.Double> doubleList91 = regression0.result();
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
        org.junit.Assert.assertEquals((double) double57, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList59);
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(sampleArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(doubleList71);
        org.junit.Assert.assertNotNull(doubleList72);
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertNotNull(sampleArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(doubleList85);
        org.junit.Assert.assertNotNull(doubleList86);
        org.junit.Assert.assertNotNull(doubleList87);
        org.junit.Assert.assertEquals((double) double88, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList89);
        org.junit.Assert.assertNotNull(doubleList90);
        org.junit.Assert.assertNotNull(doubleList91);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test020");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.699999999999996;0", (double) 51, (long) 8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test021");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        java.util.List<laccan.devices.Sample> sampleList3 = storageCSV0.read();
        java.util.List<laccan.devices.Sample> sampleList4 = storageCSV0.read();
        laccan.persistence.StorageCSV storageCSV5 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV5.local("hi!");
        laccan.persistence.StorageCSV storageCSV8 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray9 = new java.lang.String[] {};
        storageCSV8.save(strArray9);
        storageCSV5.save(strArray9);
        laccan.persistence.StorageCSV storageCSV13 = storageCSV5.local("nodes");
        laccan.persistence.StorageCSV storageCSV15 = storageCSV5.local("init");
        laccan.persistence.StorageCSV storageCSV17 = storageCSV15.local("reduction;-19.699999999999996;0");
        laccan.persistence.StorageCSV storageCSV18 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV20 = storageCSV18.local("hi!");
        laccan.persistence.StorageCSV storageCSV22 = storageCSV20.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList23 = storageCSV22.read();
        java.util.List<laccan.devices.Sample> sampleList24 = storageCSV22.read();
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray27 = micazMsg26.get_Buffer();
        java.lang.Object obj28 = micazMsg26.clone();
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg26);
        laccan.devices.Type type30 = null;
        sample29.setType(type30);
        laccan.devices.Type type32 = null;
        sample29.setType(type32);
        sample29.setNode("hi!");
        java.lang.String[] strArray36 = sample29.toCSV();
        storageCSV22.save(strArray36);
        storageCSV15.save(strArray36);
        storageCSV0.save(strArray36);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(storageCSV15);
        org.junit.Assert.assertNotNull(storageCSV17);
        org.junit.Assert.assertNotNull(storageCSV20);
        org.junit.Assert.assertNotNull(storageCSV22);
        org.junit.Assert.assertNotNull(sampleList23);
        org.junit.Assert.assertNotNull(sampleList24);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(strArray36);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test022");
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
        java.lang.String str46 = sample33.toString();
        sample33.setDate((long) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "reduction;-19.699999999999996;0;-1.0;0" + "'", str46.equals("reduction;-19.699999999999996;0;-1.0;0"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test023");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) 'a', 12);
        net.tinyos.message.SerialPacket serialPacket3 = micazMsg2.getSerialPacket();
        org.junit.Assert.assertNull(serialPacket3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test024");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        micazMsg1.set_NodeID((int) (byte) -1);
        int int7 = micazMsg1.baseOffset();
        java.lang.Object obj8 = micazMsg1.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        micazMsg1.init(10);
        try {
            laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (80) or length (16), for data_length 10 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test025");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray6, 24);
        java.lang.String str11 = micazMsg10.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test026");
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
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray43 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg37.set_Buffer(shortArray43);
        micazMsg37.set_Voltage(2);
        laccan.devices.MicazMsg micazMsg48 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray49 = micazMsg48.get_Buffer();
        java.lang.Object obj50 = micazMsg48.clone();
        int int51 = micazMsg48.get_NodeID();
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg55 = new laccan.devices.MicazMsg(byteArray54);
        laccan.devices.MicazMsg micazMsg57 = new laccan.devices.MicazMsg(byteArray54, 2);
        micazMsg48.dataSet(byteArray54);
        int int59 = micazMsg48.baseOffset();
        byte[] byteArray60 = micazMsg48.dataGet();
        micazMsg37.dataSet(byteArray60);
        laccan.devices.MicazMsg micazMsg63 = new laccan.devices.MicazMsg(byteArray60, (int) (byte) 0);
        try {
            micazMsg35.dataSet(byteArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(byteArray60);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test027");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) 3, (long) 3);
        java.lang.String str4 = sample3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;3.0;3" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;3.0;3"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test028");
        laccan.devices.helper.utils.Assistant.predictorType = "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;10.0;100";
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test029");
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
        try {
            micazMsg18.init((-30));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
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
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test030");
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
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = micazMsg19.get_Buffer();
        micazMsg19.setElement_Buffer(0, (short) 10);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray31 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg25.set_Buffer(shortArray31);
        micazMsg19.set_Buffer(shortArray31);
        micazMsg1.set_Buffer(shortArray31);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(message13);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(shortArray31);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test031");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        memory0.build();
        laccan.memory.Container container4 = memory0.getMemory();
        int int5 = container4.length();
        int int6 = container4.length();
        java.util.List<laccan.devices.Sample> sampleList7 = container4.get();
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sampleList7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test032");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(3);
        micazMsg1.set_NodeID((int) ' ');
        try {
            short short5 = micazMsg1.getElement_Buffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test033");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test034");
        try {
            laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test035");
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
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray38 = micazMsg37.get_Buffer();
        java.lang.Object obj39 = micazMsg37.clone();
        laccan.devices.Sample sample40 = new laccan.devices.Sample(micazMsg37);
        long long41 = sample40.getDate();
        laccan.devices.Type type42 = laccan.devices.Type.FULL;
        sample40.setType(type42);
        sample40.setNode("reduction");
        java.lang.String str46 = sample40.toString();
        sample40.setNode("reduction;-19.699999999999996;0");
        sample40.setTemperature((double) '4');
        keepingAll20.add(sample40);
        java.util.List<laccan.devices.Sample> sampleList52 = keepingAll20.get();
        java.util.List<java.lang.Double> doubleList53 = laccan.cloud.prediction.Regression.makeTests(sampleList52);
        java.util.List<java.lang.Double> doubleList54 = regression0.result(doubleList53);
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
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + type42 + "' != '" + laccan.devices.Type.FULL + "'", type42.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "reduction;-19.699999999999996;0" + "'", str46.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(sampleList52);
        org.junit.Assert.assertNotNull(doubleList53);
        org.junit.Assert.assertNotNull(doubleList54);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test036");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 20, 52L, (-1));
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test037");
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
        sample17.setDate((long) 12);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(sampleList9);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(serialPacket14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test038");
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
        java.util.List<laccan.devices.Sample> sampleList13 = container12.get();
        int int14 = container12.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container12);
        org.junit.Assert.assertNotNull(sampleList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test039");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        micazMsg1.set_NodeID((int) 'a');
        int int10 = micazMsg1.dataLength();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg1);
        net.tinyos.message.Message message13 = micazMsg1.clone((int) (byte) 0);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) (short) 0, (int) '#');
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg16, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(message13);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test040");
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
        laccan.memory.data.reduction.KeepingAll keepingAll50 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample51 = new laccan.devices.Sample();
        keepingAll50.add(sample51);
        int int53 = keepingAll50.length();
        java.util.List<laccan.devices.Sample> sampleList54 = keepingAll50.get();
        java.util.List<laccan.devices.Sample> sampleList55 = keepingAll50.get();
        int int56 = keepingAll50.length();
        java.util.List<laccan.devices.Sample> sampleList57 = keepingAll50.get();
        laccan.memory.Memory memory58 = new laccan.memory.Memory();
        memory58.build();
        int int60 = memory58.length();
        laccan.memory.Container container61 = memory58.getMemory();
        java.util.List<laccan.devices.Sample> sampleList62 = container61.get();
        java.util.List<laccan.devices.Sample> sampleList63 = container61.get();
        java.util.List<java.lang.Double> doubleList64 = laccan.cloud.prediction.Regression.makeTests(sampleList63);
        regression0.init(sampleList57, doubleList64);
        laccan.memory.Memory memory66 = new laccan.memory.Memory();
        memory66.build();
        int int68 = memory66.length();
        laccan.memory.Container container69 = memory66.getMemory();
        java.util.List<laccan.devices.Sample> sampleList70 = container69.get();
        java.util.List<laccan.devices.Sample> sampleList71 = container69.get();
        java.util.List<java.lang.Double> doubleList72 = laccan.cloud.prediction.Regression.makeTests(sampleList71);
        java.util.List<java.lang.Double> doubleList73 = regression0.result(doubleList72);
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(sampleList54);
        org.junit.Assert.assertNotNull(sampleList55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(sampleList57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(container61);
        org.junit.Assert.assertNotNull(sampleList62);
        org.junit.Assert.assertNotNull(sampleList63);
        org.junit.Assert.assertNotNull(doubleList64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(container69);
        org.junit.Assert.assertNotNull(sampleList70);
        org.junit.Assert.assertNotNull(sampleList71);
        org.junit.Assert.assertNotNull(doubleList72);
        org.junit.Assert.assertNotNull(doubleList73);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test041");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg4.set_Buffer(shortArray10);
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg4);
        keepingAll0.add(sample12);
        java.util.List<laccan.devices.Sample> sampleList14 = keepingAll0.get();
        laccan.memory.Memory memory15 = new laccan.memory.Memory();
        memory15.build();
        int int17 = memory15.length();
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = micazMsg19.get_Buffer();
        java.lang.Object obj21 = micazMsg19.clone();
        laccan.devices.Sample sample22 = new laccan.devices.Sample(micazMsg19);
        long long23 = sample22.getDate();
        java.lang.Class<?> wildcardClass24 = sample22.getClass();
        java.lang.String str25 = sample22.getNode();
        sample22.setNode("full_memory");
        memory15.add(sample22);
        laccan.memory.data.reduction.KeepingAll keepingAll29 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList30 = keepingAll29.get();
        int int31 = keepingAll29.length();
        java.util.List<laccan.devices.Sample> sampleList32 = keepingAll29.get();
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray35 = micazMsg34.get_Buffer();
        java.lang.Object obj36 = micazMsg34.clone();
        laccan.devices.Sample sample37 = new laccan.devices.Sample(micazMsg34);
        laccan.devices.Type type38 = null;
        sample37.setType(type38);
        laccan.devices.Type type40 = null;
        sample37.setType(type40);
        sample37.setNode("hi!");
        keepingAll29.add(sample37);
        laccan.devices.MicazMsg micazMsg46 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray47 = micazMsg46.get_Buffer();
        java.lang.Object obj48 = micazMsg46.clone();
        laccan.devices.Sample sample49 = new laccan.devices.Sample(micazMsg46);
        laccan.devices.Type type50 = null;
        sample49.setType(type50);
        java.lang.String str52 = sample49.toString();
        java.lang.String str53 = sample49.getNode();
        keepingAll29.add(sample49);
        laccan.devices.Sample sample55 = new laccan.devices.Sample();
        laccan.devices.Type type56 = laccan.devices.Type.FULL;
        sample55.setType(type56);
        sample49.setType(type56);
        double double59 = sample49.getTemperature();
        sample49.setNode("");
        memory15.add(sample49);
        keepingAll0.add(sample49);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(sampleList14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(sampleList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(sampleList32);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "null;-19.699999999999996;0" + "'", str52.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + type56 + "' != '" + laccan.devices.Type.FULL + "'", type56.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-19.699999999999996d) + "'", double59 == (-19.699999999999996d));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test042");
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
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg(byteArray25);
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
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test043");
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
        int int14 = micazMsg1.get_NodeID();
        short[] shortArray15 = micazMsg1.get_Buffer();
        int int16 = micazMsg1.baseOffset();
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
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test044");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("memory");
        java.lang.String[] strArray8 = laccan.devices.helper.utils.Assistant.environments;
        storageCSV4.save(strArray8);
        java.util.List<laccan.devices.Sample> sampleList10 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV12 = storageCSV4.local("result");
        java.util.List<laccan.devices.Sample> sampleList13 = storageCSV4.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(sampleList10);
        org.junit.Assert.assertNotNull(storageCSV12);
        org.junit.Assert.assertNotNull(sampleList13);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test045");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        byte[] byteArray7 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        short[] shortArray9 = micazMsg8.get_Buffer();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(shortArray9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test046");
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
            laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg16, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 9, data_length 10 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test047");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg5);
        keepingAll0.add(sample7);
        int int9 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        java.lang.Object obj13 = micazMsg11.clone();
        micazMsg11.amTypeSet(20);
        int int16 = micazMsg11.baseOffset();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg11, 0);
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg18, (long) 160);
        double double21 = sample20.getTemperature();
        keepingAll0.add(sample20);
        double double23 = sample20.getTemperature();
        sample20.setTemperature((double) (short) 0);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-19.699999999999996d) + "'", double21 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-19.699999999999996d) + "'", double23 == (-19.699999999999996d));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test048");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        short short5 = micazMsg1.getElement_Buffer((int) (short) 0);
        byte[] byteArray6 = micazMsg1.dataGet();
        micazMsg1.set_NodeID((int) (byte) 100);
        micazMsg1.amTypeSet(2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test049");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        try {
            laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 51, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 51, data_length 3 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test050");
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
        laccan.persistence.StorageCSV storageCSV17 = storageCSV8.local("Message <MicazMsg> \n  [Buffer=");
        java.util.List<laccan.devices.Sample> sampleList18 = storageCSV17.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "memory;-1.0;32" + "'", str13.equals("memory;-1.0;32"));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(storageCSV17);
        org.junit.Assert.assertNotNull(sampleList18);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test051");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 5, (long) 48, (-1));
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test052");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(65, (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test053");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 2);
        try {
            int int6 = micazMsg5.get_NodeID();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (0) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test054");
        laccan.devices.helper.utils.Assistant.predictorType = "null;-1.0;0";
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test055");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(48, 2);
        micazMsg2.set_NodeID((int) ' ');
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test056");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg1);
        java.lang.String str9 = sample8.getNode();
        sample8.setTemperature(10.0d);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test057");
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
        laccan.persistence.StorageCSV storageCSV57 = storageCSV10.local("null;-19.648499999999995;32");
        laccan.persistence.StorageCSV storageCSV59 = storageCSV10.local("null;-19.648499999999995;0");
        java.util.List<laccan.devices.Sample> sampleList60 = storageCSV10.read();
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
        org.junit.Assert.assertNotNull(storageCSV57);
        org.junit.Assert.assertNotNull(storageCSV59);
        org.junit.Assert.assertNotNull(sampleList60);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test058");
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
        int int35 = micazMsg1.baseOffset();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test059");
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
        long long88 = sample87.getDate();
        laccan.devices.Type type89 = laccan.devices.Type.FULL;
        sample87.setType(type89);
        sample87.setNode("reduction");
        java.lang.Class<?> wildcardClass93 = sample87.getClass();
        java.lang.String str94 = sample87.getNode();
        keepingAll0.add(sample87);
        sample87.setTemperature(0.0d);
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
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
        org.junit.Assert.assertTrue("'" + type89 + "' != '" + laccan.devices.Type.FULL + "'", type89.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "reduction" + "'", str94.equals("reduction"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test060");
        laccan.devices.helper.utils.Assistant.predictorType = "Message <MicazMsg> \n  [NodeID=0x6401]\n  [Voltage=0x0]\n  [Buffer=0x1 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n";
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test061");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        int int8 = micazMsg1.dataLength();
        int int9 = micazMsg1.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test062");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        java.util.List<laccan.devices.Sample> sampleList1 = storageCSV0.read();
        laccan.persistence.StorageCSV storageCSV3 = storageCSV0.local("memory;-1.0;32");
        laccan.persistence.StorageCSV storageCSV5 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV7 = storageCSV0.local("nodes");
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertNotNull(storageCSV3);
        org.junit.Assert.assertNotNull(storageCSV5);
        org.junit.Assert.assertNotNull(storageCSV7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test063");
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
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test064");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        int int9 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll10 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList11 = keepingAll10.get();
        int int12 = keepingAll10.length();
        java.util.List<laccan.devices.Sample> sampleList13 = keepingAll10.get();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg15);
        laccan.devices.Type type19 = null;
        sample18.setType(type19);
        laccan.devices.Type type21 = null;
        sample18.setType(type21);
        sample18.setNode("hi!");
        keepingAll10.add(sample18);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray28 = micazMsg27.get_Buffer();
        java.lang.Object obj29 = micazMsg27.clone();
        laccan.devices.Sample sample30 = new laccan.devices.Sample(micazMsg27);
        laccan.devices.Type type31 = null;
        sample30.setType(type31);
        java.lang.String str33 = sample30.toString();
        java.lang.String str34 = sample30.getNode();
        keepingAll10.add(sample30);
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray38 = micazMsg37.get_Buffer();
        java.lang.Object obj39 = micazMsg37.clone();
        micazMsg37.amTypeSet(20);
        laccan.devices.Sample sample42 = new laccan.devices.Sample(micazMsg37);
        sample42.setDate((long) (byte) 1);
        keepingAll10.add(sample42);
        memory0.add(sample42);
        laccan.devices.Type type47 = sample42.getType();
        double double48 = sample42.getTemperature();
        laccan.devices.Type type49 = sample42.getType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(sampleList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(sampleList13);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "null;-19.699999999999996;0" + "'", str33.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNull(type47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-19.699999999999996d) + "'", double48 == (-19.699999999999996d));
        org.junit.Assert.assertNull(type49);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test065");
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
        try {
            java.util.List<java.lang.Double> doubleList59 = regression0.result();
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
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test066");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 512);
        micazMsg2.set_Voltage(16);
        int int9 = micazMsg2.dataLength();
        java.lang.String str10 = micazMsg2.toString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str10.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test067");
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
        org.junit.Assert.assertEquals((double) double32, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double33, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList34);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test068");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        int int13 = micazMsg12.baseOffset();
        java.lang.String str14 = micazMsg12.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=" + "'", str14.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer="));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test069");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.set_NodeID((int) (byte) -1);
        int int5 = micazMsg1.baseOffset();
        java.lang.String str6 = micazMsg1.toString();
        java.lang.String str7 = micazMsg1.toString();
        int int8 = micazMsg1.amType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str6.equals("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 172 + "'", int8 == 172);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test070");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) (byte) 10, (long) (byte) 1);
        java.lang.String str4 = sample3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;10.0;1" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;10.0;1"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test071");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        int int10 = micazMsg1.amType();
        net.tinyos.message.Message message12 = micazMsg1.clone((int) (byte) 100);
        java.lang.Object obj13 = micazMsg1.clone();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 172 + "'", int10 == 172);
        org.junit.Assert.assertNotNull(message12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test072");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        byte[] byteArray7 = micazMsg1.dataGet();
        micazMsg1.set_NodeID((int) (byte) 100);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test073");
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
        micazMsg2.amTypeSet(2);
        micazMsg2.amTypeSet(35);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test074");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 8);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (short) 1, 0);
        try {
            laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg13, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 101, data_length 100 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test075");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray5 = micazMsg1.dataGet();
        int int6 = micazMsg1.get_Voltage();
        java.lang.Object obj7 = micazMsg1.clone();
        short[] shortArray8 = micazMsg1.get_Buffer();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(shortArray8);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test076");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, (long) 0);
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg2, (long) (byte) 10);
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg2);
        long long9 = sample8.getDate();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test077");
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
        short[] shortArray21 = micazMsg1.get_Buffer();
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(shortArray21);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test078");
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
        laccan.devices.Type type69 = sample40.getType();
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
        org.junit.Assert.assertTrue("'" + type69 + "' != '" + laccan.devices.Type.FULL + "'", type69.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test079");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        net.tinyos.message.SerialPacket serialPacket13 = micazMsg1.getSerialPacket();
        try {
            laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (128) or length (16), for data_length 16 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNull(serialPacket13);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test080");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(65);
        int int2 = micazMsg1.amType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172 + "'", int2 == 172);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test081");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.lang.String[] strArray10 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV4.save(strArray10);
        laccan.persistence.StorageCSV storageCSV13 = storageCSV4.local("");
        laccan.persistence.StorageCSV storageCSV15 = storageCSV4.local("");
        laccan.persistence.StorageCSV storageCSV17 = storageCSV15.local("reduction");
        laccan.persistence.StorageCSV storageCSV19 = storageCSV15.local("null;-19.699999999999996;52");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(storageCSV15);
        org.junit.Assert.assertNotNull(storageCSV17);
        org.junit.Assert.assertNotNull(storageCSV19);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test082");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (-139), (int) 'a');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test083");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        int int11 = micazMsg1.dataLength();
        int int12 = micazMsg1.get_NodeID();
        micazMsg1.init(10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 256 + "'", int12 == 256);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test084");
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
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test085");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        storageCSV3.save(strArray4);
        storageCSV0.save(strArray4);
        laccan.persistence.StorageCSV storageCSV8 = storageCSV0.local("full_memory");
        java.util.List<laccan.devices.Sample> sampleList9 = storageCSV8.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(sampleList9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test086");
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
        laccan.persistence.StorageCSV storageCSV20 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV22 = storageCSV20.local("hi!");
        laccan.persistence.StorageCSV storageCSV24 = storageCSV22.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList25 = storageCSV24.read();
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray28 = micazMsg27.get_Buffer();
        java.lang.Object obj29 = micazMsg27.clone();
        laccan.devices.Sample sample30 = new laccan.devices.Sample(micazMsg27);
        laccan.devices.Sample sample31 = new laccan.devices.Sample();
        laccan.devices.Sample sample32 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray33 = new laccan.devices.Sample[] { sample30, sample31, sample32 };
        java.util.ArrayList<laccan.devices.Sample> sampleList34 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList34, sampleArray33);
        java.util.List<java.lang.Double> doubleList36 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList34);
        java.util.List<java.lang.Double> doubleList37 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList34);
        regression0.init(sampleList25, doubleList37);
        regression0.train();
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
        org.junit.Assert.assertNotNull(storageCSV22);
        org.junit.Assert.assertNotNull(storageCSV24);
        org.junit.Assert.assertNotNull(sampleList25);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(sampleArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleList36);
        org.junit.Assert.assertNotNull(doubleList37);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test087");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        int int13 = micazMsg1.get_Voltage();
        micazMsg1.set_Voltage(100);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (-1), (int) (byte) -1);
        java.lang.Object obj19 = micazMsg18.clone();
        int int20 = micazMsg18.amType();
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray23 = micazMsg22.get_Buffer();
        java.lang.Object obj24 = micazMsg22.clone();
        micazMsg22.set_NodeID(20);
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray29);
        micazMsg22.dataSet(byteArray29);
        short short33 = micazMsg22.getElement_Buffer(0);
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray36 = micazMsg35.get_Buffer();
        laccan.devices.Sample sample37 = new laccan.devices.Sample(micazMsg35);
        int int38 = micazMsg35.get_NodeID();
        byte[] byteArray39 = micazMsg35.dataGet();
        laccan.devices.MicazMsg micazMsg41 = new laccan.devices.MicazMsg(byteArray39, 100);
        micazMsg22.dataSet(byteArray39);
        try {
            micazMsg18.dataSet(byteArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 172 + "'", int20 == 172);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 0 + "'", short33 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteArray39);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test088");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 1);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        micazMsg6.init(48);
        int int9 = micazMsg6.get_NodeID();
        short[] shortArray10 = micazMsg6.get_Buffer();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        micazMsg12.setElement_Buffer(0, (short) 10);
        micazMsg12.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = micazMsg20.get_Buffer();
        java.lang.Object obj22 = micazMsg20.clone();
        int int23 = micazMsg20.get_NodeID();
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray26);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray26, 2);
        micazMsg20.dataSet(byteArray26);
        micazMsg12.dataSet(byteArray26);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg(byteArray26, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg(byteArray26);
        micazMsg6.dataSet(byteArray26);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray26);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test089");
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
        micazMsg1.set_Voltage(0);
        java.lang.Object obj37 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket38 = micazMsg1.getSerialPacket();
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
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNull(serialPacket38);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test090");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(100, (int) (short) 1);
        net.tinyos.message.Message message4 = micazMsg2.clone(96);
        net.tinyos.message.Message message6 = message4.clone(12);
        org.junit.Assert.assertNotNull(message4);
        org.junit.Assert.assertNotNull(message6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test091");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 512);
        micazMsg2.set_Voltage(16);
        byte[] byteArray9 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray9, (-1), (int) (byte) -1);
        int int13 = micazMsg12.baseOffset();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        micazMsg15.amTypeSet(20);
        int int20 = micazMsg15.baseOffset();
        byte[] byteArray21 = micazMsg15.dataGet();
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray21);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray21, (int) (short) -1);
        micazMsg24.amTypeSet((-1));
        byte[] byteArray27 = micazMsg24.dataGet();
        try {
            micazMsg12.dataSet(byteArray27, (int) '4', (int) (byte) 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray27);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test092");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        sample4.setNode("");
        sample4.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;1.0;10");
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test093");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(52, 0);
        int int3 = micazMsg2.baseOffset();
        byte[] byteArray4 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test094");
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
        net.tinyos.message.SerialPacket serialPacket35 = micazMsg1.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 256 + "'", int29 == 256);
        org.junit.Assert.assertNull(serialPacket35);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test095");
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
        java.util.List<laccan.devices.Sample> sampleList37 = keepingAll0.get();
        int int38 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList39 = keepingAll0.get();
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
        org.junit.Assert.assertNotNull(sampleList37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(sampleList39);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test096");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        byte[] byteArray8 = micazMsg1.dataGet();
        try {
            laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray8, 64, 172);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 64, data_length 172 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test097");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(1, 1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test098");
        laccan.devices.helper.utils.Assistant.predictorType = "null;10.0;0";
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test099");
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
        laccan.memory.data.reduction.KeepingAll keepingAll42 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList43 = keepingAll42.get();
        int int44 = keepingAll42.length();
        java.util.List<laccan.devices.Sample> sampleList45 = keepingAll42.get();
        laccan.devices.MicazMsg micazMsg47 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray48 = micazMsg47.get_Buffer();
        java.lang.Object obj49 = micazMsg47.clone();
        laccan.devices.Sample sample50 = new laccan.devices.Sample(micazMsg47);
        laccan.devices.Type type51 = null;
        sample50.setType(type51);
        laccan.devices.Type type53 = null;
        sample50.setType(type53);
        sample50.setNode("hi!");
        keepingAll42.add(sample50);
        laccan.devices.MicazMsg micazMsg59 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray60 = micazMsg59.get_Buffer();
        java.lang.Object obj61 = micazMsg59.clone();
        laccan.devices.Sample sample62 = new laccan.devices.Sample(micazMsg59);
        laccan.devices.Type type63 = null;
        sample62.setType(type63);
        java.lang.String str65 = sample62.toString();
        java.lang.String str66 = sample62.getNode();
        keepingAll42.add(sample62);
        java.lang.String[] strArray68 = sample62.toCSV();
        storageCSV7.save(strArray68);
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
        org.junit.Assert.assertNotNull(sampleList43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(sampleList45);
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "null;-19.699999999999996;0" + "'", str65.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(strArray68);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test100");
        laccan.devices.helper.utils.Assistant.reducerType = "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;10.0;35";
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test101");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer(6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test102");
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
        short[] shortArray21 = micazMsg1.get_Buffer();
        int int22 = micazMsg1.amType();
        try {
            short short24 = micazMsg1.getElement_Buffer((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 172 + "'", int22 == 172);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test103");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        short[] shortArray8 = micazMsg1.get_Buffer();
        java.lang.String str9 = micazMsg1.toString();
        int int10 = micazMsg1.get_Voltage();
        int int11 = micazMsg1.baseOffset();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test104");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("reduction;-19.699999999999996;0;-1.0;0", 0.0d, (long) 'a');
        long long4 = sample3.getDate();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test105");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("init");
        java.util.List<laccan.devices.Sample> sampleList8 = storageCSV4.read();
        java.lang.Class<?> wildcardClass9 = storageCSV4.getClass();
        laccan.persistence.StorageCSV storageCSV11 = storageCSV4.local("");
        laccan.persistence.StorageCSV storageCSV12 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV14 = storageCSV12.local("hi!");
        laccan.persistence.StorageCSV storageCSV16 = storageCSV14.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList17 = storageCSV16.read();
        laccan.persistence.StorageCSV storageCSV19 = storageCSV16.local("memory");
        laccan.persistence.StorageCSV storageCSV20 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV22 = storageCSV20.local("hi!");
        laccan.persistence.StorageCSV storageCSV24 = storageCSV22.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList25 = storageCSV24.read();
        java.util.List<laccan.devices.Sample> sampleList26 = storageCSV24.read();
        laccan.persistence.StorageCSV storageCSV28 = storageCSV24.local("");
        laccan.persistence.StorageCSV storageCSV29 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV31 = storageCSV29.local("hi!");
        laccan.persistence.StorageCSV storageCSV33 = storageCSV31.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList34 = storageCSV33.read();
        laccan.persistence.StorageCSV storageCSV36 = storageCSV33.local("memory");
        laccan.persistence.StorageCSV storageCSV37 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV39 = storageCSV37.local("hi!");
        laccan.persistence.StorageCSV storageCSV41 = storageCSV39.local("lastReading");
        java.lang.String[] strArray47 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV41.save(strArray47);
        storageCSV33.save(strArray47);
        storageCSV24.save(strArray47);
        storageCSV16.save(strArray47);
        laccan.persistence.StorageCSV storageCSV52 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV54 = storageCSV52.local("hi!");
        laccan.persistence.StorageCSV storageCSV56 = storageCSV54.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList57 = storageCSV56.read();
        laccan.persistence.StorageCSV storageCSV59 = storageCSV56.local("memory");
        laccan.persistence.StorageCSV storageCSV60 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV62 = storageCSV60.local("hi!");
        laccan.persistence.StorageCSV storageCSV64 = storageCSV62.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList65 = storageCSV64.read();
        java.util.List<laccan.devices.Sample> sampleList66 = storageCSV64.read();
        laccan.persistence.StorageCSV storageCSV68 = storageCSV64.local("");
        laccan.persistence.StorageCSV storageCSV69 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV71 = storageCSV69.local("hi!");
        laccan.persistence.StorageCSV storageCSV73 = storageCSV71.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList74 = storageCSV73.read();
        laccan.persistence.StorageCSV storageCSV76 = storageCSV73.local("memory");
        laccan.persistence.StorageCSV storageCSV77 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV79 = storageCSV77.local("hi!");
        laccan.persistence.StorageCSV storageCSV81 = storageCSV79.local("lastReading");
        java.lang.String[] strArray87 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV81.save(strArray87);
        storageCSV73.save(strArray87);
        storageCSV64.save(strArray87);
        storageCSV56.save(strArray87);
        storageCSV16.save(strArray87);
        storageCSV4.save(strArray87);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(sampleList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(storageCSV14);
        org.junit.Assert.assertNotNull(storageCSV16);
        org.junit.Assert.assertNotNull(sampleList17);
        org.junit.Assert.assertNotNull(storageCSV19);
        org.junit.Assert.assertNotNull(storageCSV22);
        org.junit.Assert.assertNotNull(storageCSV24);
        org.junit.Assert.assertNotNull(sampleList25);
        org.junit.Assert.assertNotNull(sampleList26);
        org.junit.Assert.assertNotNull(storageCSV28);
        org.junit.Assert.assertNotNull(storageCSV31);
        org.junit.Assert.assertNotNull(storageCSV33);
        org.junit.Assert.assertNotNull(sampleList34);
        org.junit.Assert.assertNotNull(storageCSV36);
        org.junit.Assert.assertNotNull(storageCSV39);
        org.junit.Assert.assertNotNull(storageCSV41);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(storageCSV54);
        org.junit.Assert.assertNotNull(storageCSV56);
        org.junit.Assert.assertNotNull(sampleList57);
        org.junit.Assert.assertNotNull(storageCSV59);
        org.junit.Assert.assertNotNull(storageCSV62);
        org.junit.Assert.assertNotNull(storageCSV64);
        org.junit.Assert.assertNotNull(sampleList65);
        org.junit.Assert.assertNotNull(sampleList66);
        org.junit.Assert.assertNotNull(storageCSV68);
        org.junit.Assert.assertNotNull(storageCSV71);
        org.junit.Assert.assertNotNull(storageCSV73);
        org.junit.Assert.assertNotNull(sampleList74);
        org.junit.Assert.assertNotNull(storageCSV76);
        org.junit.Assert.assertNotNull(storageCSV79);
        org.junit.Assert.assertNotNull(storageCSV81);
        org.junit.Assert.assertNotNull(strArray87);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test106");
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
        try {
            micazMsg16.init((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test107");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 16, 3);
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(serialPacket11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test108");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray3, 172);
        int int6 = micazMsg5.dataLength();
        net.tinyos.message.SerialPacket serialPacket7 = micazMsg5.getSerialPacket();
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg9.set_Buffer(shortArray15);
        laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg9);
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg9);
        int int19 = micazMsg9.dataLength();
        byte[] byteArray20 = micazMsg9.dataGet();
        net.tinyos.message.Message message22 = micazMsg9.clone(24);
        try {
            serialPacket7.dataSet((net.tinyos.message.Message) micazMsg9, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-139) + "'", int6 == (-139));
        org.junit.Assert.assertNull(serialPacket7);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(message22);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test109");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, (long) 0);
        sample5.setDate((long) 24);
        double double8 = sample5.getDateDouble();
        long long9 = sample5.getDate();
        java.lang.String str10 = sample5.getNode();
        laccan.devices.Type type11 = sample5.getType();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 24.0d + "'", double8 == 24.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 24L + "'", long9 == 24L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(type11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test110");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        java.lang.String str16 = micazMsg13.toString();
        int int17 = micazMsg13.baseOffset();
        try {
            micazMsg13.set_Voltage(20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=" + "'", str16.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer="));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test111");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 1);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        int int7 = micazMsg6.amType();
        try {
            int int8 = micazMsg6.get_Voltage();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 172 + "'", int7 == 172);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test112");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) '4', (long) 100, 65535);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test113");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        java.lang.Object obj8 = micazMsg1.clone();
        int int9 = micazMsg1.get_Voltage();
        try {
            short short11 = micazMsg1.getElement_Buffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test114");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        java.lang.String[] strArray10 = sample9.toCSV();
        sample9.setNode("hi!");
        sample9.setTemperature((double) 0);
        java.lang.String str15 = sample9.getNode();
        sample9.setDate((long) 65535);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test115");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone((int) ' ');
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg12.set_Buffer(shortArray18);
        int int20 = micazMsg12.get_NodeID();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray23);
        micazMsg12.dataSet((net.tinyos.message.Message) micazMsg24, (int) (byte) 0);
        int int27 = micazMsg12.dataLength();
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg12, (-139));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test116");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        memory0.build();
        int int3 = memory0.length();
        memory0.build();
        laccan.memory.Container container5 = memory0.getMemory();
        java.util.List<laccan.devices.Sample> sampleList6 = container5.get();
        int int7 = container5.length();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(container5);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test117");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone(2);
        byte[] byteArray10 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray10, (int) ' ', (int) (short) 0);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray10, 4, (int) (short) 1);
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
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test118");
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
        regression20.init(sampleList41, doubleList68);
        java.util.List<java.lang.Double> doubleList70 = laccan.cloud.prediction.Regression.makeTests(sampleList41);
        laccan.memory.data.reduction.KeepingAll keepingAll71 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList72 = keepingAll71.get();
        java.util.List<java.lang.Double> doubleList73 = laccan.cloud.prediction.Regression.makeTests(sampleList72);
        regression0.init(sampleList41, doubleList73);
        regression0.train();
        laccan.cloud.prediction.Regression regression76 = new laccan.cloud.prediction.Regression();
        double double77 = regression76.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll78 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList79 = keepingAll78.get();
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
        regression76.init(sampleList79, doubleList91);
        java.util.List<java.lang.Double> doubleList94 = regression0.result(doubleList91);
        java.util.List<java.lang.Double> doubleList95 = regression0.result();
        regression0.train();
        java.util.List<java.lang.Double> doubleList97 = regression0.result();
        org.junit.Assert.assertEquals((double) double2, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(sampleArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertEquals((double) double21, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList23);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(sampleArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleList35);
        org.junit.Assert.assertNotNull(doubleList36);
        org.junit.Assert.assertEquals((double) double39, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList41);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(sampleArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(doubleList53);
        org.junit.Assert.assertNotNull(doubleList54);
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(sampleArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(doubleList67);
        org.junit.Assert.assertNotNull(doubleList68);
        org.junit.Assert.assertNotNull(doubleList70);
        org.junit.Assert.assertNotNull(sampleList72);
        org.junit.Assert.assertNotNull(doubleList73);
        org.junit.Assert.assertEquals((double) double77, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList79);
        org.junit.Assert.assertNotNull(shortArray83);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertNotNull(sampleArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(doubleList91);
        org.junit.Assert.assertNotNull(doubleList92);
        org.junit.Assert.assertNotNull(doubleList94);
        org.junit.Assert.assertNotNull(doubleList95);
        org.junit.Assert.assertNotNull(doubleList97);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test119");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 4);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg4);
        sample5.setDate(100L);
        org.junit.Assert.assertNotNull(shortArray2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test120");
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
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg1, 3L);
        short[] shortArray13 = micazMsg1.get_Buffer();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(shortArray13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test121");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        short short5 = micazMsg1.getElement_Buffer((int) (short) 0);
        short[] shortArray6 = micazMsg1.get_Buffer();
        java.lang.Class<?> wildcardClass7 = micazMsg1.getClass();
        short short9 = micazMsg1.getElement_Buffer(2);
        int int10 = micazMsg1.baseOffset();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test122");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, (long) 0);
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg2, (long) (byte) 10);
        net.tinyos.message.SerialPacket serialPacket8 = micazMsg2.getSerialPacket();
        micazMsg2.set_Voltage((int) 'a');
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test123");
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
        sample33.setNode("null;97.0;0");
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
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test124");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        int int9 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll10 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList11 = keepingAll10.get();
        int int12 = keepingAll10.length();
        java.util.List<laccan.devices.Sample> sampleList13 = keepingAll10.get();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg15);
        laccan.devices.Type type19 = null;
        sample18.setType(type19);
        laccan.devices.Type type21 = null;
        sample18.setType(type21);
        sample18.setNode("hi!");
        keepingAll10.add(sample18);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray28 = micazMsg27.get_Buffer();
        java.lang.Object obj29 = micazMsg27.clone();
        laccan.devices.Sample sample30 = new laccan.devices.Sample(micazMsg27);
        laccan.devices.Type type31 = null;
        sample30.setType(type31);
        java.lang.String str33 = sample30.toString();
        java.lang.String str34 = sample30.getNode();
        keepingAll10.add(sample30);
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray38 = micazMsg37.get_Buffer();
        java.lang.Object obj39 = micazMsg37.clone();
        micazMsg37.amTypeSet(20);
        laccan.devices.Sample sample42 = new laccan.devices.Sample(micazMsg37);
        sample42.setDate((long) (byte) 1);
        keepingAll10.add(sample42);
        memory0.add(sample42);
        memory0.build();
        laccan.memory.Container container48 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(sampleList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(sampleList13);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "null;-19.699999999999996;0" + "'", str33.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(container48);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test125");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 64);
        micazMsg2.set_Voltage(48);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test126");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        micazMsg1.set_NodeID(0);
        java.lang.String str9 = micazMsg1.toString();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        java.lang.Object obj13 = micazMsg11.clone();
        micazMsg11.amTypeSet(20);
        int int16 = micazMsg11.baseOffset();
        byte[] byteArray17 = micazMsg11.dataGet();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray17);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray17, (int) (short) -1);
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray17, 1);
        try {
            micazMsg1.dataSet(byteArray17, (int) (short) 10, (-139), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test127");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.Container container3 = memory0.getMemory();
        java.util.List<laccan.devices.Sample> sampleList4 = container3.get();
        java.util.List<laccan.devices.Sample> sampleList5 = container3.get();
        java.util.List<java.lang.Double> doubleList6 = laccan.cloud.prediction.Regression.makeTests(sampleList5);
        java.util.List<java.lang.Double> doubleList7 = laccan.cloud.prediction.Regression.makeTests(sampleList5);
        java.util.List<java.lang.Double> doubleList8 = laccan.cloud.prediction.Regression.makeTests(sampleList5);
        java.util.List<java.lang.Double> doubleList9 = laccan.cloud.prediction.Regression.makeTests(sampleList5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertNotNull(doubleList9);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test128");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        byte[] byteArray7 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray7);
        int int10 = micazMsg9.amType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 172 + "'", int10 == 172);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test129");
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
        laccan.memory.data.reduction.KeepingAll keepingAll22 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList23 = keepingAll22.get();
        int int24 = keepingAll22.length();
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray32 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg26.set_Buffer(shortArray32);
        laccan.devices.Sample sample34 = new laccan.devices.Sample(micazMsg26);
        keepingAll22.add(sample34);
        java.util.List<laccan.devices.Sample> sampleList36 = keepingAll22.get();
        java.util.List<laccan.devices.Sample> sampleList37 = keepingAll22.get();
        laccan.cloud.prediction.Regression regression38 = new laccan.cloud.prediction.Regression();
        double double39 = regression38.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll40 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList41 = keepingAll40.get();
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
        laccan.devices.MicazMsg micazMsg62 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray63 = micazMsg62.get_Buffer();
        java.lang.Object obj64 = micazMsg62.clone();
        laccan.devices.Sample sample65 = new laccan.devices.Sample(micazMsg62);
        laccan.devices.Sample sample66 = new laccan.devices.Sample();
        laccan.devices.Sample sample67 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray68 = new laccan.devices.Sample[] { sample65, sample66, sample67 };
        java.util.ArrayList<laccan.devices.Sample> sampleList69 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList69, sampleArray68);
        java.util.List<java.lang.Double> doubleList71 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList69);
        java.util.List<java.lang.Double> doubleList72 = regression60.result(doubleList71);
        java.util.List<java.lang.Double> doubleList73 = regression42.result(doubleList71);
        regression38.init(sampleList41, doubleList71);
        regression38.train();
        java.util.List<java.lang.Double> doubleList76 = regression38.result();
        double double77 = regression38.mse();
        java.util.List<java.lang.Double> doubleList78 = regression38.result();
        double double79 = regression38.mse();
        regression38.train();
        java.util.List<java.lang.Double> doubleList81 = regression38.result();
        regression0.init(sampleList37, doubleList81);
        java.util.List<java.lang.Double> doubleList83 = laccan.cloud.prediction.Regression.makeTests(sampleList37);
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
        org.junit.Assert.assertNotNull(sampleList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(sampleList36);
        org.junit.Assert.assertNotNull(sampleList37);
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
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(sampleArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(doubleList71);
        org.junit.Assert.assertNotNull(doubleList72);
        org.junit.Assert.assertNotNull(doubleList73);
        org.junit.Assert.assertNotNull(doubleList76);
        org.junit.Assert.assertEquals((double) double77, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList78);
        org.junit.Assert.assertEquals((double) double79, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList81);
        org.junit.Assert.assertNotNull(doubleList83);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test130");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        memory0.build();
        laccan.memory.Container container4 = memory0.getMemory();
        int int5 = memory0.length();
        memory0.build();
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj10 = micazMsg9.clone();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg9, (long) 0);
        java.lang.String str13 = sample12.getNode();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg15);
        long long19 = sample18.getDate();
        java.lang.Class<?> wildcardClass20 = sample18.getClass();
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray23 = micazMsg22.get_Buffer();
        java.lang.Object obj24 = micazMsg22.clone();
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg22);
        long long26 = sample25.getDate();
        laccan.devices.Type type27 = laccan.devices.Type.FULL;
        sample25.setType(type27);
        sample18.setType(type27);
        sample12.setType(type27);
        sample12.setNode("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        memory0.add(sample12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + type27 + "' != '" + laccan.devices.Type.FULL + "'", type27.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test131");
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
        byte[] byteArray26 = micazMsg25.dataGet();
        try {
            laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg25, 8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 8, data_length 0 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteArray26);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test132");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) ' ');
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1, 35L);
        java.lang.Class<?> wildcardClass4 = sample3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test133");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer(51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test134");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        storageCSV3.save(strArray4);
        storageCSV0.save(strArray4);
        laccan.persistence.StorageCSV storageCSV8 = storageCSV0.local("full_memory");
        laccan.persistence.StorageCSV storageCSV10 = storageCSV8.local("null;10.0;0");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test135");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        laccan.devices.Type type7 = null;
        sample4.setType(type7);
        sample4.setNode("hi!");
        sample4.setNode("");
        laccan.devices.Type type13 = null;
        sample4.setType(type13);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test136");
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
        laccan.devices.Sample sample14 = new laccan.devices.Sample();
        double double15 = sample14.getDateDouble();
        double double16 = sample14.getDateDouble();
        sample14.setTemperature((double) 1);
        laccan.devices.Type type19 = sample14.getType();
        double double20 = sample14.getDateDouble();
        java.lang.String str21 = sample14.toString();
        memory0.add(sample14);
        java.lang.Class<?> wildcardClass23 = sample14.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(type19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "null;1.0;0" + "'", str21.equals("null;1.0;0"));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test137");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1);
        int int11 = micazMsg1.dataLength();
        java.lang.String str12 = micazMsg1.toString();
        java.lang.Class<?> wildcardClass13 = micazMsg1.getClass();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test138");
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
            laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg12);
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
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test139");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg1);
        int int9 = micazMsg1.baseOffset();
        short[] shortArray10 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg1, (long) 16);
        sample12.setTemperature((-19.648499999999995d));
        java.lang.String str15 = sample12.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null;-19.648499999999995;16" + "'", str15.equals("null;-19.648499999999995;16"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test140");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        java.util.List<laccan.devices.Sample> sampleList6 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV8 = storageCSV4.local("");
        laccan.persistence.StorageCSV storageCSV10 = storageCSV4.local("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;-19.699999999999996;0");
        laccan.persistence.StorageCSV storageCSV11 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV13 = storageCSV11.local("hi!");
        laccan.persistence.StorageCSV storageCSV15 = storageCSV13.local("lastReading");
        java.lang.String[] strArray21 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV15.save(strArray21);
        laccan.devices.Sample sample26 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=", Double.NaN, (long) '#');
        java.lang.String[] strArray27 = sample26.toCSV();
        storageCSV15.save(strArray27);
        storageCSV10.save(strArray27);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(storageCSV15);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test141");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        net.tinyos.message.Message message6 = micazMsg2.clone((int) '4');
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg8.set_Buffer(shortArray14);
        micazMsg2.set_Buffer(shortArray14);
        micazMsg2.init(48);
        micazMsg2.init(97);
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertNotNull(shortArray14);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test142");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 35, (long) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test143");
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
        java.lang.Object obj43 = micazMsg1.clone();
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
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test144");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) ' ');
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1, 35L);
        micazMsg1.setElement_Buffer(4, (short) 100);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test145");
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
        sample24.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(container17);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test146");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.dataLength();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        micazMsg4.set_Voltage((int) '#');
        micazMsg4.amTypeSet(52);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray13, 48);
        micazMsg4.dataSet(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray19);
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray19, 2);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray19);
        micazMsg23.set_NodeID((int) (byte) 10);
        byte[] byteArray26 = micazMsg23.dataGet();
        micazMsg4.dataSet(byteArray26);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray26);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray26);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg(byteArray26, (int) 'a');
        try {
            micazMsg1.dataSet(byteArray26, (int) (short) -1, (int) 'a', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray26);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test147");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (byte) 10, (long) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test148");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("init");
        laccan.persistence.StorageCSV storageCSV9 = storageCSV4.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList10 = storageCSV9.read();
        java.util.List<java.lang.Double> doubleList11 = laccan.cloud.prediction.Regression.makeTests(sampleList10);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(sampleList10);
        org.junit.Assert.assertNotNull(doubleList11);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test149");
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
        try {
            micazMsg1.setElement_Buffer((int) (short) 10, (short) 0);
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
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(byteArray14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test150");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        try {
            laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) serialPacket4, 512, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test151");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer(12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test152");
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
        sample39.setNode("Message <MicazMsg> \n  [NodeID=0x10a]\n  [Voltage=0x64]\n  [Buffer=");
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
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test153");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(52, 96);
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray5 = micazMsg4.get_Buffer();
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg4);
        int int7 = micazMsg4.get_NodeID();
        byte[] byteArray8 = micazMsg4.dataGet();
        short[] shortArray9 = micazMsg4.get_Buffer();
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray12, 16);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg4.dataSet(byteArray12);
        try {
            micazMsg2.dataSet((net.tinyos.message.Message) micazMsg4, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(byteArray12);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test154");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        micazMsg1.amTypeSet(512);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, 32);
        short short12 = micazMsg10.getElement_Buffer((int) (short) 0);
        int int13 = micazMsg10.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test155");
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
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(100, (int) (short) 1);
        try {
            micazMsg10.dataSet((net.tinyos.message.Message) micazMsg21, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test156");
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
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray23 = micazMsg22.get_Buffer();
        java.lang.Object obj24 = micazMsg22.clone();
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg22);
        laccan.devices.Type type26 = null;
        sample25.setType(type26);
        laccan.devices.Type type28 = null;
        sample25.setType(type28);
        sample25.setNode("hi!");
        java.lang.String[] strArray32 = sample25.toCSV();
        storageCSV4.save(strArray32);
        java.util.List<laccan.devices.Sample> sampleList34 = storageCSV4.read();
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray37 = micazMsg36.get_Buffer();
        java.lang.Object obj38 = micazMsg36.clone();
        java.lang.String str39 = micazMsg36.toString();
        short[] shortArray40 = micazMsg36.get_Buffer();
        byte[] byteArray41 = micazMsg36.dataGet();
        java.lang.Object obj42 = micazMsg36.clone();
        net.tinyos.message.Message message44 = micazMsg36.clone(2);
        byte[] byteArray45 = micazMsg36.dataGet();
        java.lang.Class<?> wildcardClass46 = micazMsg36.getClass();
        laccan.devices.Sample sample48 = new laccan.devices.Sample(micazMsg36, (long) (short) 100);
        java.lang.String[] strArray49 = sample48.toCSV();
        storageCSV4.save(strArray49);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(sampleList34);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str39.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(message44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(strArray49);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test157");
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
        sample87.setDate((long) 'a');
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
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test158");
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
            short[] shortArray16 = micazMsg12.get_Buffer();
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
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test159");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(4);
        int int2 = micazMsg1.get_Voltage();
        try {
            laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 4 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test160");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("", (double) 32L, (long) 96);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test161");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) 1, (long) (short) 10);
        sample3.setTemperature((double) (short) 1);
        sample3.setDate((long) 1);
        sample3.setNode("Message <MicazMsg> \n  [Buffer=");
        long long10 = sample3.getDate();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test162");
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
        micazMsg1.set_Voltage(256);
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
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test163");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        int int13 = micazMsg1.get_Voltage();
        micazMsg1.set_Voltage(100);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (-1), (int) (byte) -1);
        java.lang.Object obj19 = micazMsg18.clone();
        int int20 = micazMsg18.baseOffset();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test164");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test165");
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
        int int30 = micazMsg15.get_Voltage();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test166");
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
        laccan.memory.Memory memory14 = new laccan.memory.Memory();
        memory14.build();
        int int16 = memory14.length();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        java.lang.Object obj20 = micazMsg18.clone();
        laccan.devices.Sample sample21 = new laccan.devices.Sample(micazMsg18);
        long long22 = sample21.getDate();
        java.lang.Class<?> wildcardClass23 = sample21.getClass();
        java.lang.String str24 = sample21.getNode();
        sample21.setNode("full_memory");
        memory14.add(sample21);
        laccan.devices.Sample sample31 = new laccan.devices.Sample("null;-19.699999999999996;512", (double) (short) 1, 0L);
        memory14.add(sample31);
        memory0.add(sample31);
        int int34 = memory0.length();
        laccan.memory.Container container35 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(container35);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test167");
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
        java.util.List<laccan.devices.Sample> sampleList18 = keepingAll0.get();
        int int19 = keepingAll0.length();
        laccan.devices.Sample sample23 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) 0.0f, (long) (short) 1);
        sample23.setTemperature(32.0d);
        keepingAll0.add(sample23);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(sampleList17);
        org.junit.Assert.assertNotNull(sampleList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test168");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.699999999999996;52", (double) 1, (long) 'a');
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test169");
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
        java.lang.Class<?> wildcardClass24 = micazMsg1.getClass();
        int int25 = micazMsg1.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test170");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        memory0.build();
        laccan.memory.Container container4 = memory0.getMemory();
        int int5 = memory0.length();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = micazMsg7.get_Buffer();
        java.lang.Object obj9 = micazMsg7.clone();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg7);
        long long11 = sample10.getDate();
        laccan.devices.Type type12 = laccan.devices.Type.FULL;
        sample10.setType(type12);
        memory0.add(sample10);
        laccan.devices.Type type15 = sample10.getType();
        double double16 = sample10.getTemperature();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + laccan.devices.Type.FULL + "'", type12.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + laccan.devices.Type.FULL + "'", type15.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-19.699999999999996d) + "'", double16 == (-19.699999999999996d));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test171");
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
        try {
            short short24 = micazMsg22.getElement_Buffer((int) (short) 10);
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
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test172");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        short[] shortArray5 = micazMsg2.get_Buffer();
        short[] shortArray6 = micazMsg2.get_Buffer();
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray6);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test173");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(52, 0);
        int int3 = micazMsg2.baseOffset();
        byte[] byteArray4 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray4, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test174");
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
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        micazMsg15.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg15, (int) (byte) 0);
        java.lang.Object obj22 = micazMsg21.clone();
        byte[] byteArray23 = micazMsg21.dataGet();
        micazMsg21.set_NodeID(16);
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg21);
        memory0.add(sample26);
        laccan.memory.Container container28 = memory0.getMemory();
        memory0.build();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(container28);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test175");
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
        java.util.List<laccan.devices.Sample> sampleList93 = keepingAll0.get();
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
        org.junit.Assert.assertNotNull(sampleList93);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test176");
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
        int int13 = micazMsg12.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test177");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        int int12 = micazMsg1.get_NodeID();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test178");
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
        int int25 = micazMsg16.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 24 + "'", int18 == 24);
        org.junit.Assert.assertNull(serialPacket24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 160 + "'", int25 == 160);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test179");
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
        regression0.train();
        java.util.List<java.lang.Double> doubleList61 = regression0.result();
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
        org.junit.Assert.assertNotNull(doubleList61);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test180");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) (byte) 10);
        try {
            short[] shortArray2 = micazMsg1.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (80) or length (16), for data_length 10 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test181");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(6, (int) 'a');
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test182");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        int int8 = micazMsg1.get_NodeID();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (short) 1);
        int int11 = micazMsg1.amType();
        try {
            laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 256, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 172 + "'", int11 == 172);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test183");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray3, 172);
        int int6 = micazMsg5.dataLength();
        net.tinyos.message.SerialPacket serialPacket7 = micazMsg5.getSerialPacket();
        try {
            micazMsg5.set_Voltage(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length -139 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-139) + "'", int6 == (-139));
        org.junit.Assert.assertNull(serialPacket7);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test184");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((-1L), 35L, (-30));
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test185");
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
        int int23 = keepingAll0.length();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test186");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (byte) 1, (int) (byte) 100);
        try {
            laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 152, data_length 24 and data array size 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test187");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        laccan.devices.Type type7 = null;
        sample4.setType(type7);
        sample4.setDate(0L);
        sample4.setTemperature((double) 35);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test188");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(64);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test189");
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
        sample4.setNode("full_memory");
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj26 = micazMsg25.clone();
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg25, (long) 0);
        java.lang.String str29 = sample28.getNode();
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray32 = micazMsg31.get_Buffer();
        java.lang.Object obj33 = micazMsg31.clone();
        laccan.devices.Sample sample34 = new laccan.devices.Sample(micazMsg31);
        long long35 = sample34.getDate();
        java.lang.Class<?> wildcardClass36 = sample34.getClass();
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray39 = micazMsg38.get_Buffer();
        java.lang.Object obj40 = micazMsg38.clone();
        laccan.devices.Sample sample41 = new laccan.devices.Sample(micazMsg38);
        long long42 = sample41.getDate();
        laccan.devices.Type type43 = laccan.devices.Type.FULL;
        sample41.setType(type43);
        sample34.setType(type43);
        sample28.setType(type43);
        sample4.setType(type43);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "reduction;-19.699999999999996;0" + "'", str10.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "reduction;-19.699999999999996;0;-1.0;0" + "'", str17.equals("reduction;-19.699999999999996;0;-1.0;0"));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + type43 + "' != '" + laccan.devices.Type.FULL + "'", type43.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test190");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, 2);
        micazMsg1.dataSet(byteArray7);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray7);
        try {
            micazMsg12.set_Voltage(96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test191");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        int int5 = micazMsg1.amType();
        micazMsg1.init(160);
        int int8 = micazMsg1.baseOffset();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 172 + "'", int5 == 172);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test192");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        java.lang.String str7 = sample4.getNode();
        sample4.setDate((long) (byte) -1);
        java.lang.String str10 = sample4.getNode();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test193");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 512);
        java.lang.Object obj7 = micazMsg2.clone();
        micazMsg2.amTypeSet((int) (short) 1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg2);
        long long11 = sample10.getDate();
        java.lang.String str12 = sample10.toString();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null;-19.699999999999996;0" + "'", str12.equals("null;-19.699999999999996;0"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test194");
        int int1 = laccan.devices.MicazMsg.offset_Buffer(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test195");
        try {
            laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test196");
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
        sample11.setDate((long) (byte) 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null;-19.699999999999996;0" + "'", str12.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test197");
        laccan.devices.helper.utils.Assistant.predictorType = "memory;-1.0;32";
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test198");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg(byteArray2, 16);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2);
        net.tinyos.message.Message message7 = micazMsg5.clone(16);
        int int8 = micazMsg5.dataLength();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(message7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test199");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer((-30));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test200");
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
        laccan.persistence.StorageCSV storageCSV57 = storageCSV10.local("null;-19.648499999999995;32");
        laccan.persistence.StorageCSV storageCSV59 = storageCSV57.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x64]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 ");
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
        org.junit.Assert.assertNotNull(storageCSV57);
        org.junit.Assert.assertNotNull(storageCSV59);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test201");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        micazMsg2.set_NodeID(0);
        int int6 = micazMsg2.get_Voltage();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 51);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test202");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1, (long) 512);
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg1, 0L);
        double double12 = sample11.getTemperature();
        sample11.setNode("reduction;-19.699999999999996;0;1.0;0");
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-19.699999999999996d) + "'", double12 == (-19.699999999999996d));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test203");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.699999999999996;512", (double) (byte) 1, (long) (short) 10);
        long long4 = sample3.getDate();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test204");
        try {
            laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((-139));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test205");
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
        laccan.memory.Memory memory18 = new laccan.memory.Memory();
        memory18.build();
        int int20 = memory18.length();
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray23 = micazMsg22.get_Buffer();
        java.lang.Object obj24 = micazMsg22.clone();
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg22);
        long long26 = sample25.getDate();
        java.lang.Class<?> wildcardClass27 = sample25.getClass();
        java.lang.String str28 = sample25.getNode();
        sample25.setNode("full_memory");
        memory18.add(sample25);
        long long32 = sample25.getDate();
        memory0.add(sample25);
        memory0.build();
        int int35 = memory0.length();
        memory0.build();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test206");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        micazMsg13.amTypeSet(1);
        net.tinyos.message.SerialPacket serialPacket18 = micazMsg13.getSerialPacket();
        try {
            laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNull(serialPacket18);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test207");
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
        micazMsg1.init(35);
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
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test208");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, 2);
        micazMsg1.dataSet(byteArray7);
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray14);
        micazMsg15.init((int) '#');
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = micazMsg19.get_Buffer();
        java.lang.Object obj21 = micazMsg19.clone();
        java.lang.String str22 = micazMsg19.toString();
        short[] shortArray23 = micazMsg19.get_Buffer();
        micazMsg15.set_Buffer(shortArray23);
        micazMsg1.set_Buffer(shortArray23);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str22.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray23);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test209");
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
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray27 = micazMsg26.get_Buffer();
        java.lang.Object obj28 = micazMsg26.clone();
        micazMsg26.amTypeSet(20);
        int int31 = micazMsg26.baseOffset();
        java.lang.String str32 = micazMsg26.toString();
        micazMsg26.amTypeSet(16);
        int int35 = micazMsg26.baseOffset();
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg26, (int) (byte) 10);
        laccan.devices.MicazMsg micazMsg39 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray40 = micazMsg39.get_Buffer();
        java.lang.Object obj41 = micazMsg39.clone();
        int int42 = micazMsg39.get_NodeID();
        micazMsg39.setElement_Buffer(1, (short) (byte) 0);
        int int46 = micazMsg39.get_NodeID();
        laccan.devices.Sample sample47 = new laccan.devices.Sample(micazMsg39);
        java.lang.Class<?> wildcardClass48 = micazMsg39.getClass();
        laccan.devices.MicazMsg micazMsg50 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray51 = micazMsg50.get_Buffer();
        laccan.devices.Sample sample52 = new laccan.devices.Sample(micazMsg50);
        int int53 = micazMsg50.get_NodeID();
        byte[] byteArray54 = micazMsg50.dataGet();
        laccan.devices.MicazMsg micazMsg55 = new laccan.devices.MicazMsg(byteArray54);
        laccan.devices.MicazMsg micazMsg57 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray58 = micazMsg57.get_Buffer();
        java.lang.Object obj59 = micazMsg57.clone();
        int int60 = micazMsg57.get_NodeID();
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg64 = new laccan.devices.MicazMsg(byteArray63);
        laccan.devices.MicazMsg micazMsg66 = new laccan.devices.MicazMsg(byteArray63, 2);
        micazMsg57.dataSet(byteArray63);
        laccan.devices.MicazMsg micazMsg68 = new laccan.devices.MicazMsg(byteArray63);
        micazMsg55.dataSet(byteArray63);
        laccan.devices.MicazMsg micazMsg70 = new laccan.devices.MicazMsg(byteArray63);
        micazMsg39.dataSet(byteArray63);
        micazMsg37.dataSet(byteArray63);
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg37, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str32.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(byteArray63);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test210");
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
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = micazMsg23.get_Buffer();
        java.lang.Object obj25 = micazMsg23.clone();
        micazMsg23.amTypeSet(20);
        int int28 = micazMsg23.baseOffset();
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg23, 0);
        java.lang.String str31 = micazMsg30.toString();
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray39 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg33.set_Buffer(shortArray39);
        int int41 = micazMsg33.get_NodeID();
        int int42 = micazMsg33.amType();
        laccan.devices.MicazMsg micazMsg45 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj46 = micazMsg45.clone();
        int int47 = micazMsg45.get_NodeID();
        laccan.devices.Sample sample49 = new laccan.devices.Sample(micazMsg45, (long) (byte) -1);
        laccan.devices.MicazMsg micazMsg51 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray52 = micazMsg51.get_Buffer();
        java.lang.Object obj53 = micazMsg51.clone();
        java.lang.String str54 = micazMsg51.toString();
        short[] shortArray55 = micazMsg51.get_Buffer();
        micazMsg45.set_Buffer(shortArray55);
        byte[] byteArray57 = micazMsg45.dataGet();
        micazMsg33.dataSet(byteArray57);
        micazMsg30.dataSet(byteArray57);
        laccan.devices.MicazMsg micazMsg61 = new laccan.devices.MicazMsg(byteArray57, (int) '#');
        message21.dataSet(byteArray57);
        net.tinyos.message.SerialPacket serialPacket63 = message21.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(message21);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str31.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 172 + "'", int42 == 172);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str54.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertNull(serialPacket63);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test211");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray6);
        java.lang.String str9 = micazMsg8.toString();
        int int10 = micazMsg8.amType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 172 + "'", int10 == 172);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test212");
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
        try {
            laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray25, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 32, data_length 0 and data array size 4");
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
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test213");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests(0L, (long) 20, 4);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test214");
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
        laccan.memory.Container container24 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(container22);
        org.junit.Assert.assertNotNull(container24);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test215");
        laccan.devices.helper.utils.Assistant.predictorType = "null;0.0;512";
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test216");
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
        laccan.devices.Type type19 = sample9.getType();
        java.lang.String[] strArray20 = sample9.toCSV();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + laccan.devices.Type.FULL + "'", type16.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + laccan.devices.Type.FULL + "'", type19.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test217");
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
        java.util.List<java.lang.Double> doubleList86 = regression0.result();
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
        org.junit.Assert.assertNotNull(doubleList86);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test218");
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
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!;-19.699999999999996;0" + "'", str22.equals("hi!;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!;-19.699999999999996;0" + "'", str23.equals("hi!;-19.699999999999996;0"));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test219");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("full_memory", (double) (short) 1, (long) 172);
        laccan.devices.Type type4 = sample3.getType();
        double double5 = sample3.getTemperature();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(52, 0);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg8);
        java.lang.String str10 = sample9.getNode();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj14 = micazMsg13.clone();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg13, (long) 0);
        java.lang.String str17 = sample16.getNode();
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
        sample16.setType(type31);
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray37 = micazMsg36.get_Buffer();
        java.lang.Object obj38 = micazMsg36.clone();
        laccan.devices.Sample sample39 = new laccan.devices.Sample(micazMsg36);
        laccan.devices.Type type40 = null;
        sample39.setType(type40);
        sample39.setNode("");
        laccan.devices.Type type44 = laccan.devices.Type.REDUCE;
        sample39.setType(type44);
        sample16.setType(type44);
        sample9.setType(type44);
        sample3.setType(type44);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + laccan.devices.Type.FULL + "'", type31.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + type44 + "' != '" + laccan.devices.Type.REDUCE + "'", type44.equals(laccan.devices.Type.REDUCE));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test220");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        net.tinyos.message.Message message6 = micazMsg1.clone(3);
        int int7 = message6.amType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 172 + "'", int7 == 172);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test221");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.dataLength();
        net.tinyos.message.SerialPacket serialPacket3 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (byte) 10);
        try {
            laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 128, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNull(serialPacket3);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test222");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, (long) 0);
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg2, (long) (byte) 10);
        double double8 = sample7.getTemperature();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-19.699999999999996d) + "'", double8 == (-19.699999999999996d));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test223");
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
        double double89 = sample86.getTemperature();
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
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + (-19.699999999999996d) + "'", double89 == (-19.699999999999996d));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test224");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        keepingAll0.add(sample4);
        java.lang.String str9 = sample4.getNode();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test225");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 14, 1L, 6);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test226");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        int int11 = micazMsg1.baseOffset();
        java.lang.Object obj12 = micazMsg1.clone();
        int int13 = micazMsg1.get_NodeID();
        net.tinyos.message.Message message15 = micazMsg1.clone(100);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(message15);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test227");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(0, 256);
        int int3 = micazMsg2.amType();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg2.getSerialPacket();
        try {
            laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) serialPacket4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 172 + "'", int3 == 172);
        org.junit.Assert.assertNull(serialPacket4);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test228");
        net.tinyos.message.Message message0 = null;
        try {
            laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(message0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test229");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        int int5 = micazMsg2.dataLength();
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2);
        java.lang.String[] strArray7 = sample6.toCSV();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test230");
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
        long long19 = sample17.getDate();
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(sampleList9);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(serialPacket14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 8L + "'", long19 == 8L);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test231");
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
        micazMsg1.init(8);
        micazMsg1.set_NodeID(256);
        java.lang.String str18 = micazMsg1.toString();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = micazMsg20.get_Buffer();
        laccan.devices.Sample sample22 = new laccan.devices.Sample(micazMsg20);
        laccan.devices.Sample sample24 = new laccan.devices.Sample(micazMsg20, (long) (short) 10);
        net.tinyos.message.SerialPacket serialPacket25 = micazMsg20.getSerialPacket();
        byte[] byteArray26 = micazMsg20.dataGet();
        short[] shortArray27 = micazMsg20.get_Buffer();
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg20, 6);
        net.tinyos.message.SerialPacket serialPacket30 = micazMsg20.getSerialPacket();
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg((int) (byte) 1, 20);
        byte[] byteArray34 = micazMsg33.dataGet();
        micazMsg20.dataSet(byteArray34);
        try {
            micazMsg1.dataSet(byteArray34, 20, 51, 51);
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
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 " + "'", str18.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 "));
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNull(serialPacket25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNull(serialPacket30);
        org.junit.Assert.assertNotNull(byteArray34);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test232");
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
        micazMsg13.set_NodeID(100);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test233");
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
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray17, 256);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray17, 24);
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray17);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(byteArray17);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test234");
        laccan.devices.helper.utils.Assistant.predictorType = "Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;-19.699999999999996;0";
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test235");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        sample6.setDate((long) (byte) 1);
        laccan.devices.Type type9 = sample6.getType();
        double double10 = sample6.getTemperature();
        long long11 = sample6.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(type9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-19.699999999999996d) + "'", double10 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test236");
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
        laccan.memory.Memory memory36 = new laccan.memory.Memory();
        laccan.memory.Container container37 = memory36.getMemory();
        laccan.memory.Container container38 = memory36.getMemory();
        memory36.build();
        memory36.build();
        int int41 = memory36.length();
        laccan.devices.MicazMsg micazMsg43 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray49 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg43.set_Buffer(shortArray49);
        laccan.devices.Sample sample51 = new laccan.devices.Sample(micazMsg43);
        laccan.devices.Sample sample52 = new laccan.devices.Sample();
        laccan.devices.Type type53 = laccan.devices.Type.FULL;
        sample52.setType(type53);
        sample51.setType(type53);
        sample51.setTemperature((double) 'a');
        java.lang.Class<?> wildcardClass58 = sample51.getClass();
        memory36.add(sample51);
        laccan.devices.Type type60 = sample51.getType();
        keepingAll0.add(sample51);
        int int62 = keepingAll0.length();
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
        org.junit.Assert.assertNull(container37);
        org.junit.Assert.assertNull(container38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertTrue("'" + type53 + "' != '" + laccan.devices.Type.FULL + "'", type53.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + type60 + "' != '" + laccan.devices.Type.FULL + "'", type60.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 4 + "'", int62 == 4);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test237");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg5);
        keepingAll0.add(sample7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg10);
        laccan.devices.Type type14 = null;
        sample13.setType(type14);
        double double16 = sample13.getDateDouble();
        keepingAll0.add(sample13);
        laccan.memory.Memory memory18 = new laccan.memory.Memory();
        laccan.memory.Container container19 = memory18.getMemory();
        laccan.memory.Container container20 = memory18.getMemory();
        memory18.build();
        memory18.build();
        int int23 = memory18.length();
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray31 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg25.set_Buffer(shortArray31);
        laccan.devices.Sample sample33 = new laccan.devices.Sample(micazMsg25);
        laccan.devices.Sample sample34 = new laccan.devices.Sample();
        laccan.devices.Type type35 = laccan.devices.Type.FULL;
        sample34.setType(type35);
        sample33.setType(type35);
        sample33.setTemperature((double) 'a');
        java.lang.Class<?> wildcardClass40 = sample33.getClass();
        memory18.add(sample33);
        java.lang.String[] strArray42 = sample33.toCSV();
        long long43 = sample33.getDate();
        java.lang.String str44 = sample33.getNode();
        keepingAll0.add(sample33);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(container19);
        org.junit.Assert.assertNull(container20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertTrue("'" + type35 + "' != '" + laccan.devices.Type.FULL + "'", type35.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test238");
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
        sample10.setTemperature((double) 'a');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test239");
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
        try {
            micazMsg21.setElement_Buffer((int) 'a', (short) (byte) -1);
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
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test240");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) 'a', (long) 512);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg5.set_Buffer(shortArray11);
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg5);
        laccan.devices.Sample sample14 = new laccan.devices.Sample();
        laccan.devices.Type type15 = laccan.devices.Type.FULL;
        sample14.setType(type15);
        sample13.setType(type15);
        sample13.setTemperature((double) 'a');
        laccan.devices.Type type20 = sample13.getType();
        sample13.setDate((long) (byte) 100);
        laccan.devices.Type type23 = sample13.getType();
        sample3.setType(type23);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + laccan.devices.Type.FULL + "'", type15.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + laccan.devices.Type.FULL + "'", type20.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type23 + "' != '" + laccan.devices.Type.FULL + "'", type23.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test241");
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
        micazMsg11.amTypeSet((int) 'a');
        micazMsg11.init(64);
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
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test242");
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
        net.tinyos.message.Message message20 = micazMsg13.clone((int) 'a');
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
        org.junit.Assert.assertNotNull(message20);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test243");
        laccan.devices.MicazMsg micazMsg0 = new laccan.devices.MicazMsg();
        net.tinyos.message.Message message2 = micazMsg0.clone(52);
        org.junit.Assert.assertNotNull(message2);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test244");
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
        double double37 = regression0.mse();
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
        org.junit.Assert.assertEquals((double) double37, Double.NaN, 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test245");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(100, (int) (short) 1);
        java.lang.String str3 = micazMsg2.toString();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, 100L);
        int int6 = micazMsg2.baseOffset();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str3.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test246");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        int int13 = micazMsg1.get_Voltage();
        micazMsg1.set_Voltage(100);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (-1), (int) (byte) -1);
        java.lang.Object obj19 = micazMsg18.clone();
        java.lang.String str20 = micazMsg18.toString();
        try {
            int int21 = micazMsg18.get_NodeID();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (0) or length (16), for data_length -1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str20.equals("Message <MicazMsg> \n  [Buffer="));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test247");
        int int1 = laccan.devices.MicazMsg.offset_Buffer(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test248");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 10);
        micazMsg9.setElement_Buffer((int) (short) 0, (short) 0);
        net.tinyos.message.SerialPacket serialPacket13 = micazMsg9.getSerialPacket();
        short[] shortArray14 = micazMsg9.get_Buffer();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(serialPacket13);
        org.junit.Assert.assertNotNull(shortArray14);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test249");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray8);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray8, 160);
        java.lang.Class<?> wildcardClass14 = micazMsg13.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test250");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) ' ');
        int int12 = micazMsg1.get_NodeID();
        java.lang.String str13 = micazMsg1.toString();
        try {
            micazMsg1.setElement_Buffer((-30), (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test251");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(0, 160);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test252");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory", (double) (byte) -1, (long) ' ');
        sample3.setTemperature((double) 512);
        java.lang.Class<?> wildcardClass6 = sample3.getClass();
        java.lang.String str7 = sample3.getNode();
        laccan.devices.Sample sample11 = new laccan.devices.Sample("null;-19.699999999999996;0;-19.699999999999996;0", (double) (byte) 100, (long) (short) -1);
        laccan.memory.data.reduction.KeepingAll keepingAll12 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList13 = keepingAll12.get();
        int int14 = keepingAll12.length();
        java.util.List<laccan.devices.Sample> sampleList15 = keepingAll12.get();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg17);
        laccan.devices.Type type21 = null;
        sample20.setType(type21);
        laccan.devices.Type type23 = null;
        sample20.setType(type23);
        sample20.setNode("hi!");
        keepingAll12.add(sample20);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray30 = micazMsg29.get_Buffer();
        java.lang.Object obj31 = micazMsg29.clone();
        laccan.devices.Sample sample32 = new laccan.devices.Sample(micazMsg29);
        laccan.devices.Type type33 = null;
        sample32.setType(type33);
        java.lang.String str35 = sample32.toString();
        java.lang.String str36 = sample32.getNode();
        keepingAll12.add(sample32);
        laccan.devices.Sample sample38 = new laccan.devices.Sample();
        laccan.devices.Type type39 = laccan.devices.Type.FULL;
        sample38.setType(type39);
        sample32.setType(type39);
        double double42 = sample32.getTemperature();
        laccan.devices.MicazMsg micazMsg44 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray45 = micazMsg44.get_Buffer();
        java.lang.Object obj46 = micazMsg44.clone();
        laccan.devices.Sample sample47 = new laccan.devices.Sample(micazMsg44);
        long long48 = sample47.getDate();
        laccan.devices.Type type49 = laccan.devices.Type.FULL;
        sample47.setType(type49);
        sample32.setType(type49);
        sample11.setType(type49);
        sample3.setType(type49);
        java.lang.String str54 = sample3.getNode();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "memory" + "'", str7.equals("memory"));
        org.junit.Assert.assertNotNull(sampleList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(sampleList15);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "null;-19.699999999999996;0" + "'", str35.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + type39 + "' != '" + laccan.devices.Type.FULL + "'", type39.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-19.699999999999996d) + "'", double42 == (-19.699999999999996d));
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + type49 + "' != '" + laccan.devices.Type.FULL + "'", type49.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "memory" + "'", str54.equals("memory"));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test253");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        micazMsg1.set_NodeID(96);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test254");
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
        laccan.memory.Container container20 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(container20);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test255");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 512);
        micazMsg2.set_Voltage(16);
        byte[] byteArray9 = micazMsg2.dataGet();
        java.lang.String str10 = micazMsg2.toString();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg2, (long) 172);
        java.lang.String str13 = micazMsg2.toString();
        micazMsg2.set_NodeID(52);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str10.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test256");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (byte) 1, 4);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test257");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) (byte) 100);
        micazMsg1.amTypeSet(2);
        int int9 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) '4');
        int int12 = micazMsg1.get_Voltage();
        micazMsg1.amTypeSet((int) (byte) 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test258");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests(10L, (long) 20, 20);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test259");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV2.read();
        java.lang.Class<?> wildcardClass6 = sampleList5.getClass();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test260");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=;NaN;35", (double) (short) 1, (long) (byte) -1);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test261");
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
        short[] shortArray22 = micazMsg1.get_Buffer();
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 3);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(shortArray22);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test262");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        int int5 = micazMsg1.amType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 172 + "'", int5 == 172);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test263");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 100, (long) '#', (int) (short) 100);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test264");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        java.util.List<laccan.devices.Sample> sampleList3 = storageCSV2.read();
        java.util.List<laccan.devices.Sample> sampleList4 = storageCSV2.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(sampleList4);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test265");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        int int2 = micazMsg1.amType();
        try {
            laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 100, data_length 24 and data array size 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172 + "'", int2 == 172);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test266");
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
        try {
            java.util.List<java.lang.Double> doubleList73 = regression0.result();
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
        org.junit.Assert.assertNotNull(doubleList72);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test267");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        try {
            laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 51, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test268");
        net.tinyos.message.Message message0 = null;
        try {
            laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(message0, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test269");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        java.lang.String str7 = micazMsg1.toString();
        micazMsg1.amTypeSet(16);
        int int10 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 10);
        micazMsg1.set_NodeID(6);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test270");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(0);
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray4 = micazMsg3.get_Buffer();
        java.lang.Object obj5 = micazMsg3.clone();
        micazMsg3.amTypeSet(20);
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg3);
        java.lang.Object obj9 = micazMsg3.clone();
        net.tinyos.message.Message message11 = micazMsg3.clone((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray14, 16);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray14);
        message11.dataSet(byteArray14);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray14, 0);
        micazMsg1.dataSet(byteArray14);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = micazMsg23.get_Buffer();
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg23);
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg23, (long) (short) 10);
        net.tinyos.message.SerialPacket serialPacket28 = micazMsg23.getSerialPacket();
        byte[] byteArray29 = micazMsg23.dataGet();
        java.lang.String str30 = micazMsg23.toString();
        short[] shortArray31 = micazMsg23.get_Buffer();
        try {
            micazMsg1.set_Buffer(shortArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(message11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNull(serialPacket28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str30.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray31);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test271");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4', 0);
        micazMsg2.amTypeSet((int) '#');
        java.lang.Object obj5 = micazMsg2.clone();
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test272");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray4 = micazMsg3.get_Buffer();
        java.lang.Object obj5 = micazMsg3.clone();
        micazMsg3.set_NodeID(20);
        short[] shortArray10 = new short[] { (byte) -1, (short) 0 };
        micazMsg3.set_Buffer(shortArray10);
        micazMsg1.set_Buffer(shortArray10);
        int int13 = micazMsg1.amType();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg1);
        int int15 = micazMsg1.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 172 + "'", int13 == 172);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test273");
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
        java.lang.String str69 = sample32.getNode();
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
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "memory" + "'", str69.equals("memory"));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test274");
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
        net.tinyos.message.Message message20 = message14.clone(20);
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray23 = micazMsg22.get_Buffer();
        java.lang.Object obj24 = micazMsg22.clone();
        micazMsg22.set_NodeID(20);
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray29);
        micazMsg22.dataSet(byteArray29);
        short short33 = micazMsg22.getElement_Buffer(0);
        net.tinyos.message.Message message35 = micazMsg22.clone((int) (byte) 100);
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg(message35, 10);
        byte[] byteArray38 = micazMsg37.dataGet();
        int int39 = micazMsg37.dataLength();
        micazMsg37.set_Voltage(160);
        micazMsg37.setElement_Buffer((int) (byte) 1, (short) -1);
        net.tinyos.message.SerialPacket serialPacket45 = micazMsg37.getSerialPacket();
        message14.dataSet((net.tinyos.message.Message) micazMsg37, 51);
        java.lang.Class<?> wildcardClass48 = micazMsg37.getClass();
        laccan.devices.Sample sample49 = new laccan.devices.Sample(micazMsg37);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(message16);
        org.junit.Assert.assertNotNull(message18);
        org.junit.Assert.assertNotNull(message20);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 0 + "'", short33 == (short) 0);
        org.junit.Assert.assertNotNull(message35);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 24 + "'", int39 == 24);
        org.junit.Assert.assertNull(serialPacket45);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test275");
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
        memory0.build();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test276");
        laccan.devices.Sample sample0 = new laccan.devices.Sample();
        double double1 = sample0.getDateDouble();
        double double2 = sample0.getDateDouble();
        sample0.setTemperature((double) 1);
        laccan.devices.Type type5 = sample0.getType();
        sample0.setTemperature((double) (short) 100);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        java.lang.Object obj11 = micazMsg9.clone();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg9);
        long long13 = sample12.getDate();
        laccan.devices.Type type14 = laccan.devices.Type.FULL;
        sample12.setType(type14);
        sample12.setNode("reduction");
        java.lang.Class<?> wildcardClass18 = sample12.getClass();
        laccan.devices.Type type19 = sample12.getType();
        sample0.setType(type19);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + laccan.devices.Type.FULL + "'", type14.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + laccan.devices.Type.FULL + "'", type19.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test277");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        micazMsg1.set_NodeID((int) (byte) -1);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        java.lang.String str11 = micazMsg8.toString();
        short[] shortArray12 = micazMsg8.get_Buffer();
        byte[] byteArray13 = micazMsg8.dataGet();
        java.lang.Object obj14 = micazMsg8.clone();
        net.tinyos.message.Message message16 = micazMsg8.clone(2);
        byte[] byteArray17 = micazMsg8.dataGet();
        try {
            micazMsg1.dataSet(byteArray17, 20, 35, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
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
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test278");
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
        int int14 = micazMsg1.get_NodeID();
        short[] shortArray15 = micazMsg1.get_Buffer();
        micazMsg1.set_Voltage(0);
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
        org.junit.Assert.assertNotNull(shortArray15);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test279");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        java.lang.String str6 = sample5.getNode();
        java.lang.String str7 = sample5.getNode();
        long long8 = sample5.getDate();
        double double9 = sample5.getTemperature();
        double double10 = sample5.getTemperature();
        sample5.setNode("Message <MicazMsg> \n  [NodeID=0x10a]\n  [Voltage=0x64]\n  [Buffer=");
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-19.699999999999996d) + "'", double9 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-19.699999999999996d) + "'", double10 == (-19.699999999999996d));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test280");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        int int16 = micazMsg13.get_NodeID();
        try {
            micazMsg13.set_Voltage(51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 256 + "'", int16 == 256);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test281");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("memory");
        java.lang.String[] strArray8 = laccan.devices.helper.utils.Assistant.environments;
        storageCSV4.save(strArray8);
        java.util.List<laccan.devices.Sample> sampleList10 = storageCSV4.read();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg12.set_Buffer(shortArray18);
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg12);
        laccan.devices.Sample sample21 = new laccan.devices.Sample();
        laccan.devices.Type type22 = laccan.devices.Type.FULL;
        sample21.setType(type22);
        sample20.setType(type22);
        sample20.setTemperature((double) 'a');
        java.lang.Class<?> wildcardClass27 = sample20.getClass();
        java.lang.String[] strArray28 = sample20.toCSV();
        storageCSV4.save(strArray28);
        java.util.List<laccan.devices.Sample> sampleList30 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV32 = storageCSV4.local("result");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(sampleList10);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + laccan.devices.Type.FULL + "'", type22.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(sampleList30);
        org.junit.Assert.assertNotNull(storageCSV32);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test282");
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
        laccan.devices.MicazMsg micazMsg69 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray70 = micazMsg69.get_Buffer();
        java.lang.Object obj71 = micazMsg69.clone();
        short short73 = micazMsg69.getElement_Buffer((int) (short) 0);
        laccan.devices.Sample sample75 = new laccan.devices.Sample(micazMsg69, (long) (short) 0);
        laccan.devices.Sample sample76 = new laccan.devices.Sample(micazMsg69);
        java.lang.String str77 = sample76.getNode();
        keepingAll0.add(sample76);
        int int79 = keepingAll0.length();
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
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + short73 + "' != '" + (short) 0 + "'", short73 == (short) 0);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 5 + "'", int79 == 5);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test283");
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
        java.lang.String str46 = sample42.getNode();
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
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "memory" + "'", str46.equals("memory"));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test284");
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
        laccan.memory.data.reduction.KeepingAll keepingAll47 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList48 = keepingAll47.get();
        int int49 = keepingAll47.length();
        java.util.List<laccan.devices.Sample> sampleList50 = keepingAll47.get();
        laccan.devices.MicazMsg micazMsg52 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray53 = micazMsg52.get_Buffer();
        java.lang.Object obj54 = micazMsg52.clone();
        laccan.devices.Sample sample55 = new laccan.devices.Sample(micazMsg52);
        laccan.devices.Type type56 = null;
        sample55.setType(type56);
        laccan.devices.Type type58 = null;
        sample55.setType(type58);
        sample55.setNode("hi!");
        keepingAll47.add(sample55);
        int int63 = keepingAll47.length();
        laccan.devices.MicazMsg micazMsg65 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray66 = micazMsg65.get_Buffer();
        java.lang.Object obj67 = micazMsg65.clone();
        laccan.devices.Sample sample68 = new laccan.devices.Sample(micazMsg65);
        sample68.setTemperature((double) 2);
        keepingAll47.add(sample68);
        laccan.devices.MicazMsg micazMsg73 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray74 = micazMsg73.get_Buffer();
        java.lang.Object obj75 = micazMsg73.clone();
        laccan.devices.Sample sample76 = new laccan.devices.Sample(micazMsg73);
        laccan.devices.Type type77 = null;
        sample76.setType(type77);
        java.lang.String str79 = sample76.toString();
        sample76.setTemperature((double) (short) 10);
        java.lang.String[] strArray82 = sample76.toCSV();
        keepingAll47.add(sample76);
        java.util.List<laccan.devices.Sample> sampleList84 = keepingAll47.get();
        laccan.devices.Sample sample85 = new laccan.devices.Sample();
        laccan.devices.Type type86 = laccan.devices.Type.FULL;
        sample85.setType(type86);
        double double88 = sample85.getDateDouble();
        sample85.setDate((long) 100);
        keepingAll47.add(sample85);
        double double92 = sample85.getDateDouble();
        java.lang.String str93 = sample85.toString();
        keepingAll0.add(sample85);
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
        org.junit.Assert.assertNotNull(sampleList48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(sampleList50);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "null;-19.699999999999996;0" + "'", str79.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(sampleList84);
        org.junit.Assert.assertTrue("'" + type86 + "' != '" + laccan.devices.Type.FULL + "'", type86.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 100.0d + "'", double92 == 100.0d);
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "null;0.0;100" + "'", str93.equals("null;0.0;100"));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test285");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(48, 65535);
        net.tinyos.message.Message message4 = micazMsg2.clone(128);
        org.junit.Assert.assertNotNull(message4);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test286");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        java.util.List<java.lang.Double> doubleList2 = laccan.cloud.prediction.Regression.makeTests(sampleList1);
        java.util.List<java.lang.Double> doubleList3 = laccan.cloud.prediction.Regression.makeTests(sampleList1);
        java.util.List<java.lang.Double> doubleList4 = laccan.cloud.prediction.Regression.makeTests(sampleList1);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertNotNull(doubleList2);
        org.junit.Assert.assertNotNull(doubleList3);
        org.junit.Assert.assertNotNull(doubleList4);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test287");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        micazMsg1.set_NodeID((int) 'a');
        int int10 = micazMsg1.dataLength();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg1);
        net.tinyos.message.Message message13 = micazMsg1.clone((int) (byte) 0);
        try {
            laccan.devices.helper.utils.Assistant.toFog(message13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(message13);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test288");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        int int13 = micazMsg12.baseOffset();
        net.tinyos.message.SerialPacket serialPacket14 = micazMsg12.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(serialPacket14);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test289");
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
        laccan.memory.Memory memory20 = new laccan.memory.Memory();
        memory20.build();
        int int22 = memory20.length();
        laccan.memory.data.reduction.KeepingAll keepingAll23 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample24 = new laccan.devices.Sample();
        keepingAll23.add(sample24);
        sample24.setDate(10L);
        memory20.add(sample24);
        memory20.build();
        laccan.memory.Container container30 = memory20.getMemory();
        int int31 = container30.length();
        java.util.List<laccan.devices.Sample> sampleList32 = container30.get();
        java.util.List<java.lang.Double> doubleList33 = laccan.cloud.prediction.Regression.makeTests(sampleList32);
        laccan.persistence.StorageCSV storageCSV34 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV36 = storageCSV34.local("hi!");
        laccan.persistence.StorageCSV storageCSV38 = storageCSV36.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList39 = storageCSV38.read();
        laccan.persistence.StorageCSV storageCSV41 = storageCSV38.local("memory");
        java.lang.String[] strArray42 = laccan.devices.helper.utils.Assistant.environments;
        storageCSV38.save(strArray42);
        java.util.List<laccan.devices.Sample> sampleList44 = storageCSV38.read();
        java.util.List<java.lang.Double> doubleList45 = laccan.cloud.prediction.Regression.makeTests(sampleList44);
        regression0.init(sampleList32, doubleList45);
        java.util.List<java.lang.Double> doubleList47 = regression0.result();
        regression0.train();
        double double49 = regression0.mse();
        org.junit.Assert.assertEquals((double) double2, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(sampleArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(container30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(sampleList32);
        org.junit.Assert.assertNotNull(doubleList33);
        org.junit.Assert.assertNotNull(storageCSV36);
        org.junit.Assert.assertNotNull(storageCSV38);
        org.junit.Assert.assertNotNull(sampleList39);
        org.junit.Assert.assertNotNull(storageCSV41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(sampleList44);
        org.junit.Assert.assertNotNull(doubleList45);
        org.junit.Assert.assertNotNull(doubleList47);
        org.junit.Assert.assertEquals((double) double49, Double.NaN, 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test290");
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
        sample12.setTemperature((double) (byte) 1);
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
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test291");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        int int9 = micazMsg1.get_Voltage();
        net.tinyos.message.Message message11 = micazMsg1.clone(256);
        micazMsg1.set_Voltage(160);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(message11);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test292");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.lang.String[] strArray10 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV4.save(strArray10);
        laccan.persistence.StorageCSV storageCSV13 = storageCSV4.local("");
        laccan.persistence.StorageCSV storageCSV15 = storageCSV4.local("");
        laccan.persistence.StorageCSV storageCSV17 = storageCSV15.local("reduction");
        laccan.persistence.StorageCSV storageCSV19 = storageCSV15.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        laccan.memory.data.reduction.KeepingAll keepingAll20 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList21 = keepingAll20.get();
        int int22 = keepingAll20.length();
        java.util.List<laccan.devices.Sample> sampleList23 = keepingAll20.get();
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray26 = micazMsg25.get_Buffer();
        java.lang.Object obj27 = micazMsg25.clone();
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg25);
        laccan.devices.Type type29 = null;
        sample28.setType(type29);
        laccan.devices.Type type31 = null;
        sample28.setType(type31);
        sample28.setNode("hi!");
        keepingAll20.add(sample28);
        java.lang.String[] strArray36 = sample28.toCSV();
        storageCSV19.save(strArray36);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(storageCSV15);
        org.junit.Assert.assertNotNull(storageCSV17);
        org.junit.Assert.assertNotNull(storageCSV19);
        org.junit.Assert.assertNotNull(sampleList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(sampleList23);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(strArray36);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test293");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray3, (int) (byte) -1, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray3);
        short[] shortArray8 = micazMsg7.get_Buffer();
        int int9 = micazMsg7.baseOffset();
        short short11 = micazMsg7.getElement_Buffer(0);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        micazMsg13.amTypeSet(20);
        int int18 = micazMsg13.baseOffset();
        byte[] byteArray19 = micazMsg13.dataGet();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray19);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray19);
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray19);
        int int23 = micazMsg22.get_Voltage();
        byte[] byteArray24 = micazMsg22.dataGet();
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray24, 12);
        micazMsg7.dataSet(byteArray24);
        int int28 = micazMsg7.get_NodeID();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test294");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        java.lang.String str4 = micazMsg1.toString();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(16);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg6, (int) (byte) 0);
        int int9 = micazMsg1.amType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 172 + "'", int9 == 172);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test295");
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
        int int15 = micazMsg1.baseOffset();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test296");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;16.0;100", 24.0d, 0L);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test297");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        int int3 = keepingAll0.length();
        int int4 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj8 = micazMsg7.clone();
        int int9 = micazMsg7.get_NodeID();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg7, (long) (byte) -1);
        java.lang.String[] strArray12 = sample11.toCSV();
        keepingAll0.add(sample11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test298");
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
        micazMsg18.amTypeSet(512);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test299");
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
        laccan.devices.Sample sample32 = new laccan.devices.Sample();
        double double33 = sample32.getDateDouble();
        double double34 = sample32.getDateDouble();
        sample32.setTemperature((double) 1);
        laccan.devices.Type type37 = sample32.getType();
        double double38 = sample32.getDateDouble();
        keepingAll0.add(sample32);
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNull(type37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test300");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(256, 52);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray3, (int) (short) 100, 8);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test301");
        laccan.devices.helper.utils.Assistant.predictorType = "init;-19.699999999999996;0";
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test302");
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
        try {
            laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray8, 3, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 3, data_length 65535 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test303");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1);
        java.lang.String str8 = sample7.toString();
        sample7.setTemperature((double) 12);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null;-19.699999999999996;0" + "'", str8.equals("null;-19.699999999999996;0"));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test304");
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
        java.util.List<java.lang.Double> doubleList66 = regression0.result();
        laccan.memory.data.reduction.KeepingAll keepingAll67 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList68 = keepingAll67.get();
        java.util.List<java.lang.Double> doubleList69 = laccan.cloud.prediction.Regression.makeTests(sampleList68);
        java.util.List<java.lang.Double> doubleList70 = laccan.cloud.prediction.Regression.makeTests(sampleList68);
        java.util.List<java.lang.Double> doubleList71 = regression0.result(doubleList70);
        double double72 = regression0.mse();
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
        org.junit.Assert.assertNotNull(doubleList66);
        org.junit.Assert.assertNotNull(sampleList68);
        org.junit.Assert.assertNotNull(doubleList69);
        org.junit.Assert.assertNotNull(doubleList70);
        org.junit.Assert.assertNotNull(doubleList71);
        org.junit.Assert.assertEquals((double) double72, Double.NaN, 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test305");
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
        int int18 = micazMsg1.baseOffset();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test306");
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
        java.util.List<laccan.devices.Sample> sampleList87 = storageCSV86.read();
        laccan.persistence.StorageCSV storageCSV89 = storageCSV86.local("null;-19.699999999999996;10");
        laccan.persistence.StorageCSV storageCSV91 = storageCSV86.local("null;-1.0;0");
        java.util.List<laccan.devices.Sample> sampleList92 = storageCSV91.read();
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
        org.junit.Assert.assertNotNull(storageCSV91);
        org.junit.Assert.assertNotNull(sampleList92);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test307");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1);
        int int11 = micazMsg1.amType();
        java.lang.String str12 = micazMsg1.toString();
        micazMsg1.init((int) (short) 100);
        micazMsg1.set_Voltage(16);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        java.lang.Object obj20 = micazMsg18.clone();
        micazMsg18.set_NodeID(20);
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray25);
        micazMsg18.dataSet(byteArray25);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray25, 0);
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray25);
        micazMsg1.dataSet(byteArray25);
        try {
            micazMsg1.setElement_Buffer(52, (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 172 + "'", int11 == 172);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(byteArray25);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test308");
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
        net.tinyos.message.SerialPacket serialPacket14 = micazMsg13.getSerialPacket();
        java.lang.Object obj15 = micazMsg13.clone();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNull(serialPacket14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test309");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        sample4.setDate((long) '#');
        double double7 = sample4.getTemperature();
        double double8 = sample4.getDateDouble();
        laccan.devices.Type type9 = sample4.getType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-19.699999999999996d) + "'", double7 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertNull(type9);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test310");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample();
        laccan.devices.Type type11 = laccan.devices.Type.FULL;
        sample10.setType(type11);
        sample9.setType(type11);
        double double14 = sample9.getDateDouble();
        sample9.setTemperature((double) (byte) 100);
        sample9.setTemperature((double) 10);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test311");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample();
        laccan.devices.Type type11 = laccan.devices.Type.FULL;
        sample10.setType(type11);
        sample9.setType(type11);
        sample9.setTemperature((double) 32);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test312");
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
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray15, (int) (short) 10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test313");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        memory0.build();
        memory0.build();
        laccan.memory.Container container5 = memory0.getMemory();
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertNotNull(container5);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test314");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4', (int) '4');
        micazMsg2.init((int) ' ');
        int int5 = micazMsg2.dataLength();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg7.set_Buffer(shortArray13);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = micazMsg16.get_Buffer();
        java.lang.Object obj18 = micazMsg16.clone();
        java.lang.String str19 = micazMsg16.toString();
        short[] shortArray20 = micazMsg16.get_Buffer();
        byte[] byteArray21 = micazMsg16.dataGet();
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray21);
        micazMsg7.dataSet(byteArray21);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray21);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray21);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray21, 48, 3);
        java.lang.Class<?> wildcardClass29 = byteArray21.getClass();
        try {
            micazMsg2.dataSet(byteArray21, 256, (int) (short) 1, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str19.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test315");
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
            int int14 = serialPacket13.baseOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNull(serialPacket13);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test316");
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
        java.util.List<java.lang.Double> doubleList71 = laccan.cloud.prediction.Regression.makeTests(sampleList56);
        java.util.List<java.lang.Double> doubleList72 = regression0.result(doubleList71);
        double double73 = regression0.mse();
        try {
            java.util.List<java.lang.Double> doubleList74 = regression0.result();
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
        org.junit.Assert.assertEquals((double) double54, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList56);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(sampleArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(doubleList68);
        org.junit.Assert.assertNotNull(doubleList69);
        org.junit.Assert.assertNotNull(doubleList71);
        org.junit.Assert.assertNotNull(doubleList72);
        org.junit.Assert.assertEquals((double) double73, Double.NaN, 0);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test317");
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
        laccan.memory.Memory memory18 = new laccan.memory.Memory();
        memory18.build();
        int int20 = memory18.length();
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray23 = micazMsg22.get_Buffer();
        java.lang.Object obj24 = micazMsg22.clone();
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg22);
        long long26 = sample25.getDate();
        java.lang.Class<?> wildcardClass27 = sample25.getClass();
        java.lang.String str28 = sample25.getNode();
        sample25.setNode("full_memory");
        memory18.add(sample25);
        long long32 = sample25.getDate();
        memory0.add(sample25);
        laccan.devices.Sample sample34 = new laccan.devices.Sample();
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray42 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg36.set_Buffer(shortArray42);
        laccan.devices.Sample sample44 = new laccan.devices.Sample(micazMsg36);
        laccan.devices.Sample sample45 = new laccan.devices.Sample();
        laccan.devices.Type type46 = laccan.devices.Type.FULL;
        sample45.setType(type46);
        sample44.setType(type46);
        double double49 = sample44.getDateDouble();
        double double50 = sample44.getTemperature();
        laccan.devices.Type type51 = sample44.getType();
        sample34.setType(type51);
        sample25.setType(type51);
        java.lang.String str54 = sample25.toString();
        sample25.setNode("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x1]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertTrue("'" + type46 + "' != '" + laccan.devices.Type.FULL + "'", type46.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-19.648499999999995d) + "'", double50 == (-19.648499999999995d));
        org.junit.Assert.assertTrue("'" + type51 + "' != '" + laccan.devices.Type.FULL + "'", type51.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "full_memory;-19.699999999999996;0" + "'", str54.equals("full_memory;-19.699999999999996;0"));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test318");
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
        java.lang.Object obj22 = micazMsg21.clone();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test319");
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
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray19, 0, (int) (short) 1);
        try {
            laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
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
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test320");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory;2.0;-1", (double) 65535, (long) (short) 1);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test321");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.set_NodeID((int) (byte) -1);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1, (long) 'a');
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        micazMsg8.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg8, (int) (byte) 0);
        java.lang.Object obj15 = micazMsg14.clone();
        byte[] byteArray16 = micazMsg14.dataGet();
        micazMsg14.set_NodeID(16);
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg14);
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg14, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(byteArray16);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test322");
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
        java.lang.String str27 = sample7.getNode();
        java.lang.String[] strArray28 = sample7.toCSV();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + laccan.devices.Type.FULL + "'", type20.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + laccan.devices.Type.FULL + "'", type25.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test323");
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
        java.util.List<java.lang.Double> doubleList77 = regression0.result();
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
        org.junit.Assert.assertNotNull(doubleList77);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test324");
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
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray12, 256);
        try {
            laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length -204 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test325");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 8, (long) 35, (int) (short) 0);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test326");
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
        micazMsg1.amTypeSet(100);
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
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test327");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg(byteArray2, 16);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2, 172);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray2, (int) (short) 100);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test328");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        int int9 = micazMsg1.get_Voltage();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg1, (long) 20);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        micazMsg13.setElement_Buffer(0, (short) 10);
        micazMsg13.set_Voltage(0);
        int int20 = micazMsg13.dataLength();
        java.lang.Object obj21 = micazMsg13.clone();
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test329");
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
        micazMsg1.set_Voltage((int) '4');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
        org.junit.Assert.assertNotNull(message20);
        org.junit.Assert.assertNotNull(shortArray21);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test330");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.lang.String[] strArray10 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV4.save(strArray10);
        java.lang.String[] strArray18 = new java.lang.String[] { "reduction;-19.699999999999996;0", "hi!", "nodes", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n", "memory" };
        storageCSV4.save(strArray18);
        java.lang.String[] strArray20 = laccan.devices.helper.utils.Assistant.environments;
        storageCSV4.save(strArray20);
        laccan.persistence.StorageCSV storageCSV23 = storageCSV4.local("reduction;-19.699999999999996;0;1.0;0");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(storageCSV23);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test331");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) '#', (long) (short) 10, 128);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test332");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test333");
        laccan.devices.helper.utils.Assistant.reducerType = "memory;-19.699999999999996;3";
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test334");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        java.lang.Object obj8 = micazMsg7.clone();
        net.tinyos.message.SerialPacket serialPacket9 = micazMsg7.getSerialPacket();
        java.lang.String str10 = micazMsg7.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(serialPacket9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str10.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test335");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        micazMsg1.set_NodeID((int) 'a');
        int int10 = micazMsg1.dataLength();
        short[] shortArray11 = micazMsg1.get_Buffer();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        micazMsg13.setElement_Buffer(0, (short) 10);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray25 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg19.set_Buffer(shortArray25);
        micazMsg13.set_Buffer(shortArray25);
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray25);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test336");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("init");
        laccan.persistence.StorageCSV storageCSV9 = storageCSV4.local("lastReading");
        laccan.persistence.StorageCSV storageCSV11 = storageCSV4.local("init");
        java.util.List<laccan.devices.Sample> sampleList12 = storageCSV4.read();
        java.util.List<java.lang.Double> doubleList13 = laccan.cloud.prediction.Regression.makeTests(sampleList12);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(sampleList12);
        org.junit.Assert.assertNotNull(doubleList13);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test337");
        byte[] byteArray0 = null;
        try {
            laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray0, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test338");
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
        long long34 = sample20.getDate();
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test339");
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
        java.util.List<laccan.devices.Sample> sampleList16 = null;
        laccan.cloud.prediction.Regression regression17 = new laccan.cloud.prediction.Regression();
        double double18 = regression17.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll19 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList20 = keepingAll19.get();
        laccan.cloud.prediction.Regression regression21 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = micazMsg23.get_Buffer();
        java.lang.Object obj25 = micazMsg23.clone();
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg23);
        laccan.devices.Sample sample27 = new laccan.devices.Sample();
        laccan.devices.Sample sample28 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray29 = new laccan.devices.Sample[] { sample26, sample27, sample28 };
        java.util.ArrayList<laccan.devices.Sample> sampleList30 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList30, sampleArray29);
        java.util.List<java.lang.Double> doubleList32 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList30);
        java.util.List<java.lang.Double> doubleList33 = regression21.result(doubleList32);
        regression17.init(sampleList20, doubleList32);
        regression17.train();
        java.util.List<java.lang.Double> doubleList36 = regression17.result();
        regression0.init(sampleList16, doubleList36);
        laccan.memory.data.reduction.KeepingAll keepingAll38 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample39 = new laccan.devices.Sample();
        keepingAll38.add(sample39);
        int int41 = keepingAll38.length();
        int int42 = keepingAll38.length();
        java.util.List<laccan.devices.Sample> sampleList43 = keepingAll38.get();
        java.util.List<java.lang.Double> doubleList44 = null;
        regression0.init(sampleList43, doubleList44);
        try {
            java.util.List<java.lang.Double> doubleList46 = regression0.result();
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
        org.junit.Assert.assertEquals((double) double18, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList20);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(sampleArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(doubleList32);
        org.junit.Assert.assertNotNull(doubleList33);
        org.junit.Assert.assertNotNull(doubleList36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(sampleList43);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test340");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray8, 3);
        micazMsg14.amTypeSet((int) (short) 0);
        java.lang.String str17 = micazMsg14.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str17.equals("Message <MicazMsg> \n  [Buffer="));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test341");
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
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = micazMsg20.get_Buffer();
        java.lang.Object obj22 = micazMsg20.clone();
        int int23 = micazMsg20.get_NodeID();
        micazMsg20.setElement_Buffer(1, (short) (byte) 0);
        int int27 = micazMsg20.get_NodeID();
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg20);
        java.lang.Class<?> wildcardClass29 = micazMsg20.getClass();
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray32 = micazMsg31.get_Buffer();
        laccan.devices.Sample sample33 = new laccan.devices.Sample(micazMsg31);
        int int34 = micazMsg31.get_NodeID();
        byte[] byteArray35 = micazMsg31.dataGet();
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg(byteArray35);
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray39 = micazMsg38.get_Buffer();
        java.lang.Object obj40 = micazMsg38.clone();
        int int41 = micazMsg38.get_NodeID();
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg45 = new laccan.devices.MicazMsg(byteArray44);
        laccan.devices.MicazMsg micazMsg47 = new laccan.devices.MicazMsg(byteArray44, 2);
        micazMsg38.dataSet(byteArray44);
        laccan.devices.MicazMsg micazMsg49 = new laccan.devices.MicazMsg(byteArray44);
        micazMsg36.dataSet(byteArray44);
        laccan.devices.MicazMsg micazMsg51 = new laccan.devices.MicazMsg(byteArray44);
        micazMsg20.dataSet(byteArray44);
        laccan.devices.MicazMsg micazMsg54 = new laccan.devices.MicazMsg(byteArray44, (int) (short) 1);
        laccan.devices.MicazMsg micazMsg56 = new laccan.devices.MicazMsg(byteArray44, (int) (byte) -1);
        micazMsg2.dataSet(byteArray44);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(byteArray44);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test342");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        micazMsg1.init(10);
        int int6 = micazMsg1.baseOffset();
        try {
            laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (80) or length (16), for data_length 10 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test343");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        byte[] byteArray7 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, (int) (short) -1);
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg10, 1L);
        micazMsg10.set_Voltage(51);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test344");
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
        java.util.List<laccan.devices.Sample> sampleList49 = container48.get();
        int int50 = container48.length();
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
        org.junit.Assert.assertNotNull(sampleList49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test345");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer((-139));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test346");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        sample4.setNode("");
        java.lang.String str9 = sample4.toString();
        double double10 = sample4.getTemperature();
        laccan.devices.Type type11 = sample4.getType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ";-19.699999999999996;0" + "'", str9.equals(";-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-19.699999999999996d) + "'", double10 == (-19.699999999999996d));
        org.junit.Assert.assertNull(type11);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test347");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 20);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        java.lang.String str15 = micazMsg12.toString();
        short[] shortArray16 = micazMsg12.get_Buffer();
        byte[] byteArray17 = micazMsg12.dataGet();
        java.lang.Object obj18 = micazMsg12.clone();
        java.lang.Object obj19 = micazMsg12.clone();
        byte[] byteArray20 = micazMsg12.dataGet();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray20, 6, 0);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray20);
        try {
            micazMsg10.dataSet(byteArray20, 65, (int) (short) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str15.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(byteArray20);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test348");
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
        double double27 = sample23.getDateDouble();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(container13);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test349");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        double double3 = sample1.getDateDouble();
        double double4 = sample1.getDateDouble();
        sample1.setTemperature((double) 3);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test350");
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
        micazMsg1.set_Voltage((int) (byte) 1);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test351");
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
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg(byteArray21, (int) (short) -1, 3);
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg((int) '4');
        int int35 = micazMsg34.dataLength();
        net.tinyos.message.SerialPacket serialPacket36 = micazMsg34.getSerialPacket();
        laccan.devices.Sample sample38 = new laccan.devices.Sample(micazMsg34, (long) (byte) 10);
        micazMsg34.set_Voltage(16);
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg44 = new laccan.devices.MicazMsg(byteArray43);
        laccan.devices.MicazMsg micazMsg46 = new laccan.devices.MicazMsg(byteArray43, 2);
        laccan.devices.MicazMsg micazMsg47 = new laccan.devices.MicazMsg(byteArray43);
        micazMsg34.dataSet(byteArray43);
        try {
            micazMsg32.dataSet(byteArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertNull(serialPacket36);
        org.junit.Assert.assertNotNull(byteArray43);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test352");
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
        laccan.memory.Container container23 = memory0.getMemory();
        java.util.List<laccan.devices.Sample> sampleList24 = container23.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(container23);
        org.junit.Assert.assertNotNull(sampleList24);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test353");
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
        laccan.memory.data.reduction.KeepingAll keepingAll40 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList41 = keepingAll40.get();
        int int42 = keepingAll40.length();
        java.util.List<laccan.devices.Sample> sampleList43 = keepingAll40.get();
        laccan.devices.MicazMsg micazMsg45 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray46 = micazMsg45.get_Buffer();
        java.lang.Object obj47 = micazMsg45.clone();
        laccan.devices.Sample sample48 = new laccan.devices.Sample(micazMsg45);
        laccan.devices.Type type49 = null;
        sample48.setType(type49);
        laccan.devices.Type type51 = null;
        sample48.setType(type51);
        sample48.setNode("hi!");
        keepingAll40.add(sample48);
        int int56 = keepingAll40.length();
        java.util.List<laccan.devices.Sample> sampleList57 = keepingAll40.get();
        laccan.memory.data.reduction.KeepingAll keepingAll58 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList59 = keepingAll58.get();
        int int60 = keepingAll58.length();
        java.util.List<laccan.devices.Sample> sampleList61 = keepingAll58.get();
        java.util.List<laccan.devices.Sample> sampleList62 = keepingAll58.get();
        java.util.List<java.lang.Double> doubleList63 = laccan.cloud.prediction.Regression.makeTests(sampleList62);
        regression0.init(sampleList57, doubleList63);
        java.util.List<java.lang.Double> doubleList65 = laccan.cloud.prediction.Regression.makeTests(sampleList57);
        java.lang.Class<?> wildcardClass66 = doubleList65.getClass();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(sampleList43);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(sampleList57);
        org.junit.Assert.assertNotNull(sampleList59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(sampleList61);
        org.junit.Assert.assertNotNull(sampleList62);
        org.junit.Assert.assertNotNull(doubleList63);
        org.junit.Assert.assertNotNull(doubleList65);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test354");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        memory0.build();
        int int3 = memory0.length();
        java.lang.Class<?> wildcardClass4 = memory0.getClass();
        laccan.devices.Sample sample8 = new laccan.devices.Sample("null;-19.648499999999995;0", (double) 52, 0L);
        memory0.add(sample8);
        int int10 = memory0.length();
        laccan.memory.Memory memory11 = new laccan.memory.Memory();
        memory11.build();
        memory11.build();
        int int14 = memory11.length();
        int int15 = memory11.length();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg17);
        laccan.devices.Type type21 = null;
        sample20.setType(type21);
        laccan.devices.Type type23 = null;
        sample20.setType(type23);
        sample20.setNode("hi!");
        memory11.add(sample20);
        int int28 = memory11.length();
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray31 = micazMsg30.get_Buffer();
        java.lang.Object obj32 = micazMsg30.clone();
        java.lang.String str33 = micazMsg30.toString();
        short[] shortArray34 = micazMsg30.get_Buffer();
        byte[] byteArray35 = micazMsg30.dataGet();
        java.lang.Object obj36 = micazMsg30.clone();
        laccan.devices.Sample sample37 = new laccan.devices.Sample(micazMsg30);
        int int38 = micazMsg30.dataLength();
        int int39 = micazMsg30.baseOffset();
        laccan.devices.Sample sample40 = new laccan.devices.Sample(micazMsg30);
        double double41 = sample40.getDateDouble();
        memory11.add(sample40);
        double double43 = sample40.getDateDouble();
        memory0.add(sample40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str33.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test355");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(2, (int) (short) 10);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test356");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray6, (int) (byte) -1);
        try {
            laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray6, 512, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 512, data_length 100 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test357");
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
        java.lang.String str26 = sample25.toString();
        sample25.setNode("null;-19.699999999999996;48");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "null;-19.699999999999996;32" + "'", str26.equals("null;-19.699999999999996;32"));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test358");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.lang.String[] strArray10 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV4.save(strArray10);
        laccan.persistence.StorageCSV storageCSV13 = storageCSV4.local("");
        laccan.persistence.StorageCSV storageCSV15 = storageCSV4.local("");
        laccan.persistence.StorageCSV storageCSV17 = storageCSV15.local("reduction");
        laccan.persistence.StorageCSV storageCSV18 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV20 = storageCSV18.local("hi!");
        laccan.persistence.StorageCSV storageCSV21 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray22 = new java.lang.String[] {};
        storageCSV21.save(strArray22);
        storageCSV18.save(strArray22);
        laccan.persistence.StorageCSV storageCSV26 = storageCSV18.local("nodes");
        laccan.persistence.StorageCSV storageCSV28 = storageCSV18.local("init");
        laccan.persistence.StorageCSV storageCSV30 = storageCSV28.local("reduction;-19.699999999999996;0");
        laccan.persistence.StorageCSV storageCSV32 = storageCSV28.local("lastReading");
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray35 = micazMsg34.get_Buffer();
        laccan.devices.Sample sample36 = new laccan.devices.Sample(micazMsg34);
        laccan.devices.Sample sample38 = new laccan.devices.Sample(micazMsg34, (long) (short) 10);
        double double39 = sample38.getDateDouble();
        java.lang.String[] strArray40 = sample38.toCSV();
        storageCSV28.save(strArray40);
        storageCSV15.save(strArray40);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(storageCSV15);
        org.junit.Assert.assertNotNull(storageCSV17);
        org.junit.Assert.assertNotNull(storageCSV20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(storageCSV26);
        org.junit.Assert.assertNotNull(storageCSV28);
        org.junit.Assert.assertNotNull(storageCSV30);
        org.junit.Assert.assertNotNull(storageCSV32);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertNotNull(strArray40);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test359");
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
        laccan.memory.Memory memory18 = new laccan.memory.Memory();
        memory18.build();
        int int20 = memory18.length();
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray23 = micazMsg22.get_Buffer();
        java.lang.Object obj24 = micazMsg22.clone();
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg22);
        long long26 = sample25.getDate();
        java.lang.Class<?> wildcardClass27 = sample25.getClass();
        java.lang.String str28 = sample25.getNode();
        sample25.setNode("full_memory");
        memory18.add(sample25);
        long long32 = sample25.getDate();
        memory0.add(sample25);
        laccan.devices.Sample sample34 = new laccan.devices.Sample();
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray42 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg36.set_Buffer(shortArray42);
        laccan.devices.Sample sample44 = new laccan.devices.Sample(micazMsg36);
        laccan.devices.Sample sample45 = new laccan.devices.Sample();
        laccan.devices.Type type46 = laccan.devices.Type.FULL;
        sample45.setType(type46);
        sample44.setType(type46);
        double double49 = sample44.getDateDouble();
        double double50 = sample44.getTemperature();
        laccan.devices.Type type51 = sample44.getType();
        sample34.setType(type51);
        sample25.setType(type51);
        java.lang.String str54 = sample25.toString();
        sample25.setDate(512L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertTrue("'" + type46 + "' != '" + laccan.devices.Type.FULL + "'", type46.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-19.648499999999995d) + "'", double50 == (-19.648499999999995d));
        org.junit.Assert.assertTrue("'" + type51 + "' != '" + laccan.devices.Type.FULL + "'", type51.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "full_memory;-19.699999999999996;0" + "'", str54.equals("full_memory;-19.699999999999996;0"));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test360");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(2);
        micazMsg1.set_NodeID(512);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test361");
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
        laccan.devices.Sample sample33 = new laccan.devices.Sample(micazMsg1, 24L);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 256 + "'", int29 == 256);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test362");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        java.lang.Object obj10 = micazMsg1.clone();
        int int11 = micazMsg1.baseOffset();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test363");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (short) 10, 160);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test364");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        java.lang.String str9 = micazMsg6.toString();
        short[] shortArray10 = micazMsg6.get_Buffer();
        micazMsg2.set_Buffer(shortArray10);
        int int12 = micazMsg2.amType();
        java.lang.Object obj13 = micazMsg2.clone();
        micazMsg2.set_Voltage(0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test365");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray4 = micazMsg3.get_Buffer();
        java.lang.Object obj5 = micazMsg3.clone();
        micazMsg3.set_NodeID(20);
        short[] shortArray10 = new short[] { (byte) -1, (short) 0 };
        micazMsg3.set_Buffer(shortArray10);
        micazMsg1.set_Buffer(shortArray10);
        micazMsg1.set_Voltage(4);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (short) 10, 0);
        java.lang.String str18 = micazMsg1.toString();
        micazMsg1.init(5);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x4]\n  [Buffer=0xffff 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str18.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x4]\n  [Buffer=0xffff 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test366");
        laccan.devices.Sample sample0 = new laccan.devices.Sample();
        double double1 = sample0.getDateDouble();
        double double2 = sample0.getDateDouble();
        sample0.setTemperature((double) 1);
        java.lang.String str5 = sample0.toString();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null;1.0;0" + "'", str5.equals("null;1.0;0"));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test367");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        try {
            micazMsg1.init((-30));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test368");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.699999999999996;0;-19.699999999999996;0", (double) (byte) 10, (long) '4');
        java.lang.String str4 = sample3.getNode();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null;-19.699999999999996;0;-19.699999999999996;0" + "'", str4.equals("null;-19.699999999999996;0;-19.699999999999996;0"));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test369");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) ' ');
        micazMsg1.set_NodeID((int) ' ');
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        java.lang.String str18 = micazMsg15.toString();
        short[] shortArray19 = micazMsg15.get_Buffer();
        byte[] byteArray20 = micazMsg15.dataGet();
        java.lang.Object obj21 = micazMsg15.clone();
        net.tinyos.message.Message message23 = micazMsg15.clone(2);
        micazMsg15.set_Voltage(0);
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg15);
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg15, (-139));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str18.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(message23);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test370");
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
        java.lang.String str13 = micazMsg12.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test371");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test372");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        micazMsg1.set_NodeID(256);
        micazMsg1.set_Voltage(2);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 4);
        int int15 = micazMsg1.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test373");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        storageCSV3.save(strArray4);
        storageCSV0.save(strArray4);
        laccan.persistence.StorageCSV storageCSV8 = storageCSV0.local("nodes");
        laccan.persistence.StorageCSV storageCSV10 = storageCSV0.local("init");
        laccan.persistence.StorageCSV storageCSV12 = storageCSV0.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        java.lang.String[] strArray13 = null;
        storageCSV0.save(strArray13);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV12);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test374");
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
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray15);
        try {
            laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray15, 96, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 96, data_length 128 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test375");
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
        laccan.cloud.prediction.Regression regression41 = new laccan.cloud.prediction.Regression();
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
        java.util.List<java.lang.Double> doubleList60 = regression41.result(doubleList57);
        java.util.List<java.lang.Double> doubleList61 = regression0.result(doubleList57);
        laccan.memory.Memory memory62 = new laccan.memory.Memory();
        memory62.build();
        int int64 = memory62.length();
        laccan.memory.data.reduction.KeepingAll keepingAll65 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample66 = new laccan.devices.Sample();
        keepingAll65.add(sample66);
        sample66.setDate(10L);
        memory62.add(sample66);
        memory62.build();
        laccan.memory.Container container72 = memory62.getMemory();
        int int73 = container72.length();
        java.util.List<laccan.devices.Sample> sampleList74 = container72.get();
        java.util.List<java.lang.Double> doubleList75 = laccan.cloud.prediction.Regression.makeTests(sampleList74);
        laccan.memory.data.reduction.KeepingAll keepingAll76 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList77 = keepingAll76.get();
        int int78 = keepingAll76.length();
        java.util.List<laccan.devices.Sample> sampleList79 = keepingAll76.get();
        laccan.devices.MicazMsg micazMsg81 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray82 = micazMsg81.get_Buffer();
        java.lang.Object obj83 = micazMsg81.clone();
        laccan.devices.Sample sample84 = new laccan.devices.Sample(micazMsg81);
        long long85 = sample84.getDate();
        java.lang.Class<?> wildcardClass86 = sample84.getClass();
        keepingAll76.add(sample84);
        java.util.List<laccan.devices.Sample> sampleList88 = keepingAll76.get();
        java.util.List<java.lang.Double> doubleList89 = laccan.cloud.prediction.Regression.makeTests(sampleList88);
        regression0.init(sampleList74, doubleList89);
        regression0.train();
        java.util.List<java.lang.Double> doubleList92 = regression0.result();
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
        org.junit.Assert.assertEquals((double) double43, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList45);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(sampleArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(doubleList57);
        org.junit.Assert.assertNotNull(doubleList58);
        org.junit.Assert.assertNotNull(doubleList60);
        org.junit.Assert.assertNotNull(doubleList61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(container72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(sampleList74);
        org.junit.Assert.assertNotNull(doubleList75);
        org.junit.Assert.assertNotNull(sampleList77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(sampleList79);
        org.junit.Assert.assertNotNull(shortArray82);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(sampleList88);
        org.junit.Assert.assertNotNull(doubleList89);
        org.junit.Assert.assertNotNull(doubleList92);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test376");
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
        try {
            java.util.List<java.lang.Double> doubleList58 = regression0.result();
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
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test377");
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
        java.util.List<laccan.devices.Sample> sampleList18 = keepingAll0.get();
        int int19 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray22 = micazMsg21.get_Buffer();
        laccan.devices.Sample sample23 = new laccan.devices.Sample(micazMsg21);
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg21, (long) (short) 10);
        java.lang.String str26 = sample25.getNode();
        java.lang.String str27 = sample25.getNode();
        long long28 = sample25.getDate();
        double double29 = sample25.getTemperature();
        sample25.setNode("hi!");
        keepingAll0.add(sample25);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(sampleList17);
        org.junit.Assert.assertNotNull(sampleList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-19.699999999999996d) + "'", double29 == (-19.699999999999996d));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test378");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("memory");
        java.lang.String[] strArray8 = laccan.devices.helper.utils.Assistant.environments;
        storageCSV4.save(strArray8);
        java.util.List<laccan.devices.Sample> sampleList10 = storageCSV4.read();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg12.set_Buffer(shortArray18);
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg12);
        laccan.devices.Sample sample21 = new laccan.devices.Sample();
        laccan.devices.Type type22 = laccan.devices.Type.FULL;
        sample21.setType(type22);
        sample20.setType(type22);
        sample20.setTemperature((double) 'a');
        java.lang.Class<?> wildcardClass27 = sample20.getClass();
        java.lang.String[] strArray28 = sample20.toCSV();
        storageCSV4.save(strArray28);
        java.lang.Class<?> wildcardClass30 = storageCSV4.getClass();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(sampleList10);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + laccan.devices.Type.FULL + "'", type22.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test379");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests(24L, (long) (short) 0, 172);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test380");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg3.set_Buffer(shortArray9);
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg3);
        short[] shortArray12 = micazMsg3.get_Buffer();
        micazMsg1.set_Buffer(shortArray12);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 52);
        int int16 = micazMsg15.get_NodeID();
        short short18 = micazMsg15.getElement_Buffer((int) (byte) 1);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test381");
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
        double double54 = regression0.mse();
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
        org.junit.Assert.assertEquals((double) double54, Double.NaN, 0);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test382");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(172, 1);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test383");
        byte[] byteArray0 = null;
        try {
            laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(byteArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test384");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) 10.0f, (long) (short) 100);
        double double4 = sample3.getTemperature();
        java.lang.String str5 = sample3.toString();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;10.0;100" + "'", str5.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;10.0;100"));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test385");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(16);
        micazMsg1.set_Voltage(16);
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray6);
        micazMsg1.dataSet(byteArray6);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        micazMsg12.set_NodeID(20);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray19);
        micazMsg12.dataSet(byteArray19);
        short short23 = micazMsg12.getElement_Buffer(0);
        net.tinyos.message.Message message25 = micazMsg12.clone((int) (byte) 100);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(message25, 10);
        byte[] byteArray28 = micazMsg27.dataGet();
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray28, 3);
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg(byteArray28, (int) (byte) 10);
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg(byteArray28, 256);
        micazMsg10.dataSet(byteArray28);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertNotNull(message25);
        org.junit.Assert.assertNotNull(byteArray28);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test386");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        java.lang.Object obj10 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg1);
        net.tinyos.message.Message message14 = micazMsg1.clone(0);
        java.lang.String str15 = micazMsg1.toString();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str15.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test387");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 2);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        micazMsg6.set_NodeID((int) (byte) 10);
        byte[] byteArray9 = micazMsg6.dataGet();
        int int10 = micazMsg6.dataLength();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg6.getSerialPacket();
        java.lang.Class<?> wildcardClass12 = micazMsg6.getClass();
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg14.set_Buffer(shortArray20);
        java.lang.String str22 = micazMsg14.toString();
        java.lang.Object obj23 = micazMsg14.clone();
        net.tinyos.message.SerialPacket serialPacket24 = micazMsg14.getSerialPacket();
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg14);
        net.tinyos.message.Message message27 = micazMsg14.clone(0);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray30 = micazMsg29.get_Buffer();
        laccan.devices.Sample sample31 = new laccan.devices.Sample(micazMsg29);
        int int32 = micazMsg29.get_NodeID();
        byte[] byteArray33 = micazMsg29.dataGet();
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg(byteArray33);
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray37 = micazMsg36.get_Buffer();
        java.lang.Object obj38 = micazMsg36.clone();
        int int39 = micazMsg36.get_NodeID();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg43 = new laccan.devices.MicazMsg(byteArray42);
        laccan.devices.MicazMsg micazMsg45 = new laccan.devices.MicazMsg(byteArray42, 2);
        micazMsg36.dataSet(byteArray42);
        laccan.devices.MicazMsg micazMsg47 = new laccan.devices.MicazMsg(byteArray42);
        micazMsg34.dataSet(byteArray42);
        byte[] byteArray49 = micazMsg34.dataGet();
        micazMsg14.dataSet(byteArray49);
        try {
            micazMsg6.dataSet(byteArray49, 0, (int) ' ', (-30));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str22.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(serialPacket24);
        org.junit.Assert.assertNotNull(message27);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertNotNull(byteArray49);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test388");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 64);
        micazMsg2.amTypeSet(1);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        micazMsg6.setElement_Buffer(0, (short) 10);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg12.set_Buffer(shortArray18);
        micazMsg6.set_Buffer(shortArray18);
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray28 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg22.set_Buffer(shortArray28);
        laccan.devices.Sample sample30 = new laccan.devices.Sample(micazMsg22);
        laccan.devices.Sample sample31 = new laccan.devices.Sample(micazMsg22);
        int int32 = micazMsg22.amType();
        java.lang.String str33 = micazMsg22.toString();
        short[] shortArray34 = micazMsg22.get_Buffer();
        micazMsg6.set_Buffer(shortArray34);
        micazMsg2.set_Buffer(shortArray34);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 172 + "'", int32 == 172);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str33.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray34);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test389");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        laccan.devices.Type type6 = laccan.devices.Type.FULL;
        sample4.setType(type6);
        sample4.setNode("reduction");
        java.lang.String str10 = sample4.toString();
        long long11 = sample4.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "reduction;-19.699999999999996;0" + "'", str10.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test390");
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
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray13, 0);
        int int16 = micazMsg15.baseOffset();
        java.lang.Class<?> wildcardClass17 = micazMsg15.getClass();
        micazMsg15.amTypeSet(65);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test391");
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
        micazMsg18.init(3);
        java.lang.Object obj21 = micazMsg18.clone();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test392");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg(byteArray2, 16);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2);
        net.tinyos.message.SerialPacket serialPacket6 = micazMsg5.getSerialPacket();
        byte[] byteArray7 = micazMsg5.dataGet();
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray7, (int) '#');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNull(serialPacket6);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test393");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.699999999999996;32", (double) 512L, (long) 14);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test394");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        net.tinyos.message.Message message10 = micazMsg1.clone(65535);
        java.lang.String str11 = micazMsg1.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(message10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test395");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(14, 3);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test396");
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
            laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg1, 0L);
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
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test397");
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
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg(512);
        byte[] byteArray37 = micazMsg36.dataGet();
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg(byteArray37);
        laccan.devices.MicazMsg micazMsg40 = new laccan.devices.MicazMsg(byteArray37, (int) (byte) 1);
        micazMsg1.dataSet(byteArray37);
        micazMsg1.setElement_Buffer((int) (short) 0, (short) (byte) 1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 256 + "'", int29 == 256);
        org.junit.Assert.assertNotNull(byteArray37);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test398");
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
        laccan.memory.Memory memory20 = new laccan.memory.Memory();
        memory20.build();
        int int22 = memory20.length();
        laccan.memory.data.reduction.KeepingAll keepingAll23 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample24 = new laccan.devices.Sample();
        keepingAll23.add(sample24);
        sample24.setDate(10L);
        memory20.add(sample24);
        memory20.build();
        laccan.memory.Container container30 = memory20.getMemory();
        int int31 = container30.length();
        java.util.List<laccan.devices.Sample> sampleList32 = container30.get();
        java.util.List<java.lang.Double> doubleList33 = laccan.cloud.prediction.Regression.makeTests(sampleList32);
        laccan.persistence.StorageCSV storageCSV34 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV36 = storageCSV34.local("hi!");
        laccan.persistence.StorageCSV storageCSV38 = storageCSV36.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList39 = storageCSV38.read();
        laccan.persistence.StorageCSV storageCSV41 = storageCSV38.local("memory");
        java.lang.String[] strArray42 = laccan.devices.helper.utils.Assistant.environments;
        storageCSV38.save(strArray42);
        java.util.List<laccan.devices.Sample> sampleList44 = storageCSV38.read();
        java.util.List<java.lang.Double> doubleList45 = laccan.cloud.prediction.Regression.makeTests(sampleList44);
        regression0.init(sampleList32, doubleList45);
        java.util.List<java.lang.Double> doubleList47 = laccan.cloud.prediction.Regression.makeTests(sampleList32);
        java.util.List<java.lang.Double> doubleList48 = laccan.cloud.prediction.Regression.makeTests(sampleList32);
        org.junit.Assert.assertEquals((double) double2, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(sampleArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(container30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(sampleList32);
        org.junit.Assert.assertNotNull(doubleList33);
        org.junit.Assert.assertNotNull(storageCSV36);
        org.junit.Assert.assertNotNull(storageCSV38);
        org.junit.Assert.assertNotNull(sampleList39);
        org.junit.Assert.assertNotNull(storageCSV41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(sampleList44);
        org.junit.Assert.assertNotNull(doubleList45);
        org.junit.Assert.assertNotNull(doubleList47);
        org.junit.Assert.assertNotNull(doubleList48);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test399");
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
        double double20 = regression0.mse();
        java.lang.Double[] doubleArray23 = new java.lang.Double[] { 4.0d, (-19.699999999999996d) };
        java.util.ArrayList<java.lang.Double> doubleList24 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList24, doubleArray23);
        java.util.List<java.lang.Double> doubleList26 = regression0.result((java.util.List<java.lang.Double>) doubleList24);
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
        org.junit.Assert.assertEquals((double) double20, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleList26);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test400");
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
        java.lang.String[] strArray25 = sample15.toCSV();
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + type17 + "' != '" + laccan.devices.Type.FULL + "'", type17.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + laccan.devices.Type.FULL + "'", type24.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test401");
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
        laccan.memory.Container container18 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(container18);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test402");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        micazMsg14.set_Voltage((int) '#');
        micazMsg14.amTypeSet(52);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray23, 48);
        micazMsg14.dataSet(byteArray23);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray23);
        try {
            micazMsg12.dataSet((net.tinyos.message.Message) micazMsg27, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(byteArray23);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test403");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 512);
        int int7 = micazMsg2.get_Voltage();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test404");
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
        int int19 = micazMsg13.get_NodeID();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test405");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, (long) 0);
        sample5.setDate((long) 24);
        laccan.devices.Type type8 = sample5.getType();
        double double9 = sample5.getTemperature();
        laccan.devices.Type type10 = sample5.getType();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-19.699999999999996d) + "'", double9 == (-19.699999999999996d));
        org.junit.Assert.assertNull(type10);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test406");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        short short12 = micazMsg1.getElement_Buffer(0);
        micazMsg1.setElement_Buffer(0, (short) (byte) 1);
        byte[] byteArray16 = micazMsg1.dataGet();
        int int17 = micazMsg1.baseOffset();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test407");
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
        int int16 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList17 = keepingAll0.get();
        int int18 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = micazMsg20.get_Buffer();
        java.lang.Object obj22 = micazMsg20.clone();
        laccan.devices.Sample sample23 = new laccan.devices.Sample(micazMsg20);
        laccan.devices.Type type24 = null;
        sample23.setType(type24);
        laccan.devices.Type type26 = null;
        sample23.setType(type26);
        sample23.setNode("hi!");
        sample23.setDate((long) 1);
        long long32 = sample23.getDate();
        keepingAll0.add(sample23);
        java.lang.String str34 = sample23.getNode();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(sampleList14);
        org.junit.Assert.assertNotNull(sampleList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(sampleList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test408");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer(65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test409");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test410");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        micazMsg1.amTypeSet(0);
        short short11 = micazMsg1.getElement_Buffer((int) (short) 1);
        micazMsg1.init((int) '4');
        try {
            short short15 = micazMsg1.getElement_Buffer(96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test411");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        storageCSV3.save(strArray4);
        storageCSV0.save(strArray4);
        java.util.List<laccan.devices.Sample> sampleList7 = storageCSV0.read();
        laccan.persistence.StorageCSV storageCSV9 = storageCSV0.local("null;4.0;0");
        java.util.List<laccan.devices.Sample> sampleList10 = storageCSV0.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(sampleList7);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(sampleList10);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test412");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.699999999999996;0", 0.0d, (long) 3);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test413");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(256, 52);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 64, 65);
        int int7 = micazMsg6.baseOffset();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 116 + "'", int7 == 116);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test414");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("", (double) (short) 1, (long) (byte) 10);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test415");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(16, 512);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(32, (int) 'a');
        byte[] byteArray6 = micazMsg5.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        try {
            micazMsg2.dataSet(byteArray6, 4, 172, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test416");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        int int5 = micazMsg2.dataLength();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 4);
        try {
            laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg7, 65535, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 65539, data_length 65 and data array size 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test417");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(4, 0);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test418");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0);
        int int9 = micazMsg8.get_Voltage();
        micazMsg8.amTypeSet(256);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test419");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        int int5 = micazMsg2.dataLength();
        int int6 = micazMsg2.amType();
        micazMsg2.init(256);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(48, (int) 'a');
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg13.set_Buffer(shortArray19);
        laccan.devices.Sample sample21 = new laccan.devices.Sample(micazMsg13);
        int int22 = micazMsg13.dataLength();
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg25.amTypeSet(2);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray30 = micazMsg29.get_Buffer();
        java.lang.Object obj31 = micazMsg29.clone();
        java.lang.String str32 = micazMsg29.toString();
        short[] shortArray33 = micazMsg29.get_Buffer();
        micazMsg25.set_Buffer(shortArray33);
        micazMsg13.set_Buffer(shortArray33);
        micazMsg11.set_Buffer(shortArray33);
        micazMsg2.set_Buffer(shortArray33);
        net.tinyos.message.Message message39 = micazMsg2.clone(8);
        try {
            short short41 = micazMsg2.getElement_Buffer(256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str32.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertNotNull(message39);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test420");
        int int1 = laccan.devices.MicazMsg.offset_Buffer((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test421");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) ' ', (long) 32, 2);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test422");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        short short6 = micazMsg2.getElement_Buffer(1);
        int int7 = micazMsg2.get_Voltage();
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test423");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        int int4 = micazMsg1.baseOffset();
        java.lang.String str5 = micazMsg1.toString();
        java.lang.Object obj6 = micazMsg1.clone();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        micazMsg8.set_NodeID(20);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray15);
        micazMsg8.dataSet(byteArray15);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray15);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray15, 160);
        try {
            micazMsg1.dataSet(byteArray15, (-139), (int) 'a', 172);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str5.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test424");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg(byteArray2, 16);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2);
        java.lang.Object obj6 = micazMsg5.clone();
        try {
            laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 0, data_length 24 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test425");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        int int8 = micazMsg5.get_NodeID();
        micazMsg5.setElement_Buffer(1, (short) (byte) 0);
        int int12 = micazMsg5.get_NodeID();
        net.tinyos.message.SerialPacket serialPacket13 = micazMsg5.getSerialPacket();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg5);
        keepingAll0.add(sample14);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(serialPacket13);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test426");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) (byte) 100);
        micazMsg1.amTypeSet(2);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        long long10 = sample9.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test427");
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
        double double41 = regression0.mse();
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
        org.junit.Assert.assertEquals((double) double41, Double.NaN, 0);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test428");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (short) 100, 5);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test429");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1 };
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray5, (int) (short) -1);
        micazMsg1.dataSet(byteArray5);
        micazMsg1.setElement_Buffer(0, (short) (byte) 100);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test430");
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
        short[] shortArray22 = micazMsg1.get_Buffer();
        micazMsg1.amTypeSet(16);
        short short26 = micazMsg1.getElement_Buffer(1);
        micazMsg1.init(100);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 0 + "'", short26 == (short) 0);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test431");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer(14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test432");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        memory0.build();
        int int3 = memory0.length();
        java.lang.Class<?> wildcardClass4 = memory0.getClass();
        laccan.memory.Container container5 = memory0.getMemory();
        memory0.build();
        laccan.memory.Memory memory7 = new laccan.memory.Memory();
        memory7.build();
        memory7.build();
        int int10 = memory7.length();
        int int11 = memory7.length();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg13);
        laccan.devices.Type type17 = null;
        sample16.setType(type17);
        laccan.devices.Type type19 = null;
        sample16.setType(type19);
        sample16.setNode("hi!");
        memory7.add(sample16);
        int int24 = memory7.length();
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray27 = micazMsg26.get_Buffer();
        java.lang.Object obj28 = micazMsg26.clone();
        java.lang.String str29 = micazMsg26.toString();
        short[] shortArray30 = micazMsg26.get_Buffer();
        byte[] byteArray31 = micazMsg26.dataGet();
        java.lang.Object obj32 = micazMsg26.clone();
        laccan.devices.Sample sample33 = new laccan.devices.Sample(micazMsg26);
        int int34 = micazMsg26.dataLength();
        int int35 = micazMsg26.baseOffset();
        laccan.devices.Sample sample36 = new laccan.devices.Sample(micazMsg26);
        double double37 = sample36.getDateDouble();
        memory7.add(sample36);
        memory0.add(sample36);
        sample36.setTemperature(0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(container5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str29.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test433");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(256);
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (short) 1, 35);
        org.junit.Assert.assertNotNull(shortArray2);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test434");
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
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg20.amTypeSet(2);
        laccan.devices.Sample sample24 = new laccan.devices.Sample(micazMsg20, (long) 512);
        java.lang.String str25 = sample24.toString();
        double double26 = sample24.getTemperature();
        memory0.add(sample24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "reduction;-19.699999999999996;0" + "'", str15.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "reduction;-19.699999999999996;0" + "'", str16.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "null;-19.699999999999996;512" + "'", str25.equals("null;-19.699999999999996;512"));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-19.699999999999996d) + "'", double26 == (-19.699999999999996d));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test435");
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(sampleList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test436");
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
        micazMsg1.set_NodeID(8);
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
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test437");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray3, (int) (byte) -1, (int) (byte) -1);
        java.lang.Object obj7 = micazMsg6.clone();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test438");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(16, 512);
        try {
            short[] shortArray3 = micazMsg2.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (128) or length (16), for data_length 16 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test439");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        micazMsg1.set_Voltage((int) (short) 1);
        int int18 = micazMsg1.dataLength();
        int int19 = micazMsg1.amType();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 172 + "'", int19 == 172);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test440");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0);
        int int9 = micazMsg8.get_Voltage();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(100, (int) (short) 1);
        java.lang.String str13 = micazMsg12.toString();
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg12, 100L);
        byte[] byteArray16 = micazMsg12.dataGet();
        java.lang.Class<?> wildcardClass17 = micazMsg12.getClass();
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = micazMsg19.get_Buffer();
        java.lang.Object obj21 = micazMsg19.clone();
        int int22 = micazMsg19.get_NodeID();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray25);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray25, 2);
        micazMsg19.dataSet(byteArray25);
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray25);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg(byteArray25);
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg(byteArray25);
        micazMsg12.dataSet(byteArray25);
        try {
            micazMsg8.dataSet((net.tinyos.message.Message) micazMsg12, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test441");
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
        java.lang.Object obj40 = micazMsg39.clone();
        int int41 = micazMsg39.dataLength();
        try {
            micazMsg39.setElement_Buffer((int) (byte) 100, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
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
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 65 + "'", int41 == 65);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test442");
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
        int int16 = memory0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test443");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        short[] shortArray8 = micazMsg1.get_Buffer();
        try {
            laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 10, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 10, data_length 51 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray8);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test444");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test445");
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
        micazMsg1.set_NodeID(2);
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
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test446");
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
        micazMsg1.init(8);
        micazMsg1.set_NodeID(256);
        java.lang.String str18 = micazMsg1.toString();
        byte[] byteArray19 = micazMsg1.dataGet();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 " + "'", str18.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 "));
        org.junit.Assert.assertNotNull(byteArray19);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test447");
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
        java.lang.Class<?> wildcardClass18 = sample12.getClass();
        sample12.setNode("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        java.lang.String str21 = sample12.getNode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str21.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test448");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        micazMsg1.set_Voltage((int) (short) 1);
        java.lang.Object obj18 = micazMsg1.clone();
        micazMsg1.set_Voltage(172);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test449");
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
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray13, 0);
        int int16 = micazMsg15.baseOffset();
        java.lang.Class<?> wildcardClass17 = micazMsg15.getClass();
        micazMsg15.amTypeSet(48);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray22 = micazMsg21.get_Buffer();
        java.lang.Object obj23 = micazMsg21.clone();
        java.lang.String str24 = micazMsg21.toString();
        short[] shortArray25 = micazMsg21.get_Buffer();
        byte[] byteArray26 = micazMsg21.dataGet();
        java.lang.Object obj27 = micazMsg21.clone();
        net.tinyos.message.Message message29 = micazMsg21.clone(2);
        byte[] byteArray30 = micazMsg21.dataGet();
        java.lang.Class<?> wildcardClass31 = micazMsg21.getClass();
        laccan.devices.Sample sample33 = new laccan.devices.Sample(micazMsg21, (long) (short) 100);
        byte[] byteArray34 = micazMsg21.dataGet();
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg(byteArray34, 256);
        try {
            micazMsg15.dataSet(byteArray34, (-30), 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str24.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(message29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(byteArray34);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test450");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(52, 0);
        int int3 = micazMsg2.get_Voltage();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test451");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        micazMsg1.amTypeSet(0);
        micazMsg1.setElement_Buffer(0, (short) (byte) 100);
        try {
            laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 65535, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 65535, data_length 20 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test452");
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
        int int20 = micazMsg17.amType();
        java.lang.String str21 = micazMsg17.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 172 + "'", int20 == 172);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=" + "'", str21.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer="));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test453");
        try {
            laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((-30), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test454");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray6);
        java.lang.String str9 = micazMsg8.toString();
        net.tinyos.message.Message message11 = micazMsg8.clone((int) (short) 100);
        int int12 = message11.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(message11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test455");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("memory");
        java.lang.String[] strArray8 = laccan.devices.helper.utils.Assistant.environments;
        storageCSV4.save(strArray8);
        laccan.persistence.StorageCSV storageCSV11 = storageCSV4.local("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        laccan.persistence.StorageCSV storageCSV13 = storageCSV11.local("Message <MicazMsg> \n  [Buffer=");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(storageCSV13);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test456");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x4]\n  [Buffer=0xffff 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", 1.0d, 0L);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test457");
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
        memory0.build();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test458");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 14, (long) 16, 20);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test459");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        micazMsg1.amTypeSet(52);
        short short7 = micazMsg1.getElement_Buffer(0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        java.lang.Object obj11 = micazMsg9.clone();
        micazMsg9.amTypeSet(20);
        int int14 = micazMsg9.baseOffset();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg9, 0);
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg16, (long) 160);
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg16);
        int int20 = micazMsg16.amType();
        short[] shortArray21 = micazMsg16.get_Buffer();
        micazMsg1.set_Buffer(shortArray21);
        try {
            micazMsg1.init((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 172 + "'", int20 == 172);
        org.junit.Assert.assertNotNull(shortArray21);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test460");
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
        java.lang.String str31 = sample20.toString();
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
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "null;-19.699999999999996;0" + "'", str31.equals("null;-19.699999999999996;0"));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test461");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        java.lang.Object obj10 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        short short13 = micazMsg1.getElement_Buffer(3);
        net.tinyos.message.SerialPacket serialPacket14 = micazMsg1.getSerialPacket();
        try {
            int int15 = serialPacket14.baseOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertNull(serialPacket14);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test462");
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
        sample4.setNode("");
        java.lang.String str20 = sample4.getNode();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "reduction;-19.699999999999996;0" + "'", str10.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test463");
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
        laccan.persistence.StorageCSV storageCSV38 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV40 = storageCSV38.local("hi!");
        laccan.persistence.StorageCSV storageCSV42 = storageCSV40.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList43 = storageCSV42.read();
        laccan.cloud.prediction.Regression regression44 = new laccan.cloud.prediction.Regression();
        double double45 = regression44.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll46 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList47 = keepingAll46.get();
        laccan.cloud.prediction.Regression regression48 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg50 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray51 = micazMsg50.get_Buffer();
        java.lang.Object obj52 = micazMsg50.clone();
        laccan.devices.Sample sample53 = new laccan.devices.Sample(micazMsg50);
        laccan.devices.Sample sample54 = new laccan.devices.Sample();
        laccan.devices.Sample sample55 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray56 = new laccan.devices.Sample[] { sample53, sample54, sample55 };
        java.util.ArrayList<laccan.devices.Sample> sampleList57 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList57, sampleArray56);
        java.util.List<java.lang.Double> doubleList59 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList57);
        java.util.List<java.lang.Double> doubleList60 = regression48.result(doubleList59);
        regression44.init(sampleList47, doubleList59);
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
        java.util.List<java.lang.Double> doubleList75 = regression44.result(doubleList73);
        double double76 = regression44.mse();
        laccan.cloud.prediction.Regression regression77 = new laccan.cloud.prediction.Regression();
        double double78 = regression77.mse();
        double double79 = regression77.mse();
        java.util.List<laccan.devices.Sample> sampleList80 = null;
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
        regression77.init(sampleList80, doubleList91);
        java.util.List<java.lang.Double> doubleList93 = regression44.result(doubleList91);
        regression0.init(sampleList43, doubleList93);
        java.util.List<java.lang.Double> doubleList95 = regression0.result();
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
        org.junit.Assert.assertNotNull(storageCSV40);
        org.junit.Assert.assertNotNull(storageCSV42);
        org.junit.Assert.assertNotNull(sampleList43);
        org.junit.Assert.assertEquals((double) double45, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList47);
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(sampleArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(doubleList59);
        org.junit.Assert.assertNotNull(doubleList60);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(sampleArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(doubleList73);
        org.junit.Assert.assertNotNull(doubleList74);
        org.junit.Assert.assertNotNull(doubleList75);
        org.junit.Assert.assertEquals((double) double76, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double78, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double79, Double.NaN, 0);
        org.junit.Assert.assertNotNull(shortArray83);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertNotNull(sampleArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(doubleList91);
        org.junit.Assert.assertNotNull(doubleList93);
        org.junit.Assert.assertNotNull(doubleList95);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test464");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory", (double) 2, (-1L));
        sample3.setTemperature((-19.699999999999996d));
        java.lang.String str6 = sample3.toString();
        sample3.setDate(3L);
        java.lang.String str9 = sample3.toString();
        laccan.devices.Type type10 = sample3.getType();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "memory;-19.699999999999996;-1" + "'", str6.equals("memory;-19.699999999999996;-1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "memory;-19.699999999999996;3" + "'", str9.equals("memory;-19.699999999999996;3"));
        org.junit.Assert.assertNull(type10);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test465");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 3);
        short short7 = micazMsg1.getElement_Buffer((int) (short) 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test466");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1);
        java.lang.Object obj6 = micazMsg1.clone();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        micazMsg8.set_NodeID(20);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray15);
        micazMsg8.dataSet(byteArray15);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray15, 0);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray15, 3);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray15, 32);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray15, 0);
        try {
            micazMsg1.dataSet(byteArray15, 128, 51, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test467");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        short short12 = micazMsg1.getElement_Buffer(0);
        net.tinyos.message.Message message14 = micazMsg1.clone((int) (byte) 100);
        micazMsg1.amTypeSet((-30));
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test468");
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
        java.lang.String str26 = micazMsg1.toString();
        short short28 = micazMsg1.getElement_Buffer(3);
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
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str26.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 0 + "'", short28 == (short) 0);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test469");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x18]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n", (double) (-1), (-1L));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test470");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg5.amTypeSet(2);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg5, (long) 512);
        micazMsg5.set_Voltage(16);
        byte[] byteArray12 = micazMsg5.dataGet();
        micazMsg2.dataSet(byteArray12);
        try {
            laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray12, 256, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 256, data_length 256 and data array size 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray12);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test471");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        int int10 = micazMsg1.amType();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 172 + "'", int10 == 172);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test472");
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
        java.util.List<laccan.devices.Sample> sampleList39 = storageCSV36.read();
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
        org.junit.Assert.assertNotNull(sampleList39);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test473");
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
        try {
            laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray24, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 100, data_length 1 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test474");
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
        int int18 = micazMsg12.get_NodeID();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 172 + "'", int13 == 172);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 256 + "'", int18 == 256);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test475");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        int int10 = micazMsg1.get_NodeID();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg1);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test476");
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
        int int22 = memory0.length();
        java.lang.Class<?> wildcardClass23 = memory0.getClass();
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(100, (int) (short) 1);
        java.lang.String str27 = micazMsg26.toString();
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg26, 100L);
        memory0.add(sample29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str27.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test477");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(5, (int) (byte) 10);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test478");
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
        int int35 = micazMsg34.baseOffset();
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg34, 16);
        int int38 = micazMsg34.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 256 + "'", int29 == 256);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test479");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("reduction");
        java.util.List<laccan.devices.Sample> sampleList3 = storageCSV0.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(sampleList3);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test480");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        int int8 = micazMsg7.get_Voltage();
        micazMsg7.amTypeSet((int) 'a');
        java.lang.String str11 = micazMsg7.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test481");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        java.lang.Object obj5 = micazMsg1.clone();
        int int6 = micazMsg1.get_NodeID();
        try {
            laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 97, data_length 0 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test482");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) ' ');
        java.lang.String str12 = micazMsg1.toString();
        java.lang.Object obj13 = micazMsg1.clone();
        try {
            micazMsg1.setElement_Buffer((int) (short) 10, (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test483");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) ' ');
        micazMsg1.set_NodeID((int) ' ');
        net.tinyos.message.SerialPacket serialPacket14 = micazMsg1.getSerialPacket();
        try {
            short short16 = micazMsg1.getElement_Buffer(20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(serialPacket14);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test484");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(24, (int) (byte) 10);
        int int3 = micazMsg2.amType();
        int int4 = micazMsg2.get_NodeID();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 172 + "'", int3 == 172);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test485");
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
        net.tinyos.message.SerialPacket serialPacket19 = micazMsg10.getSerialPacket();
        int int20 = micazMsg10.get_NodeID();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNull(serialPacket19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test486");
        int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 112 + "'", int1 == 112);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test487");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 4);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg4);
        short short7 = micazMsg4.getElement_Buffer((int) (short) 1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test488");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        short short5 = micazMsg1.getElement_Buffer((int) (short) 0);
        short[] shortArray6 = micazMsg1.get_Buffer();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 8);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg11.amTypeSet(2);
        int int14 = micazMsg11.dataLength();
        int int15 = micazMsg11.amType();
        micazMsg11.init(256);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(48, (int) 'a');
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray28 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg22.set_Buffer(shortArray28);
        laccan.devices.Sample sample30 = new laccan.devices.Sample(micazMsg22);
        int int31 = micazMsg22.dataLength();
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg34.amTypeSet(2);
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray39 = micazMsg38.get_Buffer();
        java.lang.Object obj40 = micazMsg38.clone();
        java.lang.String str41 = micazMsg38.toString();
        short[] shortArray42 = micazMsg38.get_Buffer();
        micazMsg34.set_Buffer(shortArray42);
        micazMsg22.set_Buffer(shortArray42);
        micazMsg20.set_Buffer(shortArray42);
        micazMsg11.set_Buffer(shortArray42);
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg11, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str41.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray42);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test489");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        micazMsg1.amTypeSet(52);
        short short7 = micazMsg1.getElement_Buffer(0);
        micazMsg1.setElement_Buffer(4, (short) 100);
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test490");
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
        int int20 = micazMsg17.amType();
        byte[] byteArray21 = micazMsg17.dataGet();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 172 + "'", int20 == 172);
        org.junit.Assert.assertNotNull(byteArray21);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test491");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.lang.String[] strArray10 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV4.save(strArray10);
        laccan.devices.Sample sample15 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=", Double.NaN, (long) '#');
        java.lang.String[] strArray16 = sample15.toCSV();
        storageCSV4.save(strArray16);
        java.util.List<laccan.devices.Sample> sampleList18 = storageCSV4.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(sampleList18);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test492");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("memory");
        java.lang.String[] strArray8 = laccan.devices.helper.utils.Assistant.environments;
        storageCSV4.save(strArray8);
        laccan.persistence.StorageCSV storageCSV11 = storageCSV4.local("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        laccan.persistence.StorageCSV storageCSV13 = storageCSV11.local("null;-19.699999999999996;35");
        laccan.persistence.StorageCSV storageCSV15 = storageCSV13.local("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(storageCSV15);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test493");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        int int5 = micazMsg2.dataLength();
        int int6 = micazMsg2.amType();
        micazMsg2.init(256);
        short[] shortArray9 = micazMsg2.get_Buffer();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(shortArray9);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test494");
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
        micazMsg1.set_Voltage(24);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(message12);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test495");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(1, (int) (byte) 1);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg11, 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test496");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", 32.0d, (long) '#');
        laccan.devices.Type type4 = sample3.getType();
        java.lang.String str5 = sample3.toString();
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;32.0;35" + "'", str5.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;32.0;35"));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test497");
        byte[] byteArray0 = null;
        try {
            laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(byteArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test498");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 172, 97L, (int) (byte) -1);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test499");
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
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray12, 52);
        try {
            short short22 = micazMsg20.getElement_Buffer(12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray12);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test500");
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
        java.lang.String str23 = micazMsg22.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str23.equals("Message <MicazMsg> \n  [Buffer="));
    }
}

