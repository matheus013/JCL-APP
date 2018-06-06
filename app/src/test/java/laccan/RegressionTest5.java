package laccan;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test001");
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
        int int20 = container19.length();
        int int21 = container19.length();
        int int22 = container19.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(container18);
        org.junit.Assert.assertNotNull(container19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test002");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        short short12 = micazMsg1.getElement_Buffer(0);
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        try {
            laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 160, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test003");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        java.lang.String[] strArray10 = sample9.toCSV();
        java.lang.String str11 = sample9.getNode();
        java.lang.String str12 = sample9.getNode();
        sample9.setNode("memory;-1.0;32");
        long long15 = sample9.getDate();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test004");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample();
        laccan.devices.Type type11 = laccan.devices.Type.FULL;
        sample10.setType(type11);
        sample9.setType(type11);
        java.lang.String str14 = sample9.toString();
        java.lang.String[] strArray15 = sample9.toCSV();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null;-19.648499999999995;0" + "'", str14.equals("null;-19.648499999999995;0"));
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test005");
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
        try {
            laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg27, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 52, data_length 24 and data array size 52");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test006");
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
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test007");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 1);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        byte[] byteArray7 = micazMsg6.dataGet();
        micazMsg6.amTypeSet(10);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test008");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        int int8 = micazMsg1.dataLength();
        micazMsg1.amTypeSet(32);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 10);
        int int13 = micazMsg12.get_NodeID();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test009");
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
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray15, 48, 3);
        try {
            laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg22, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 64, data_length 24 and data array size 52");
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test010");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray3, (int) (byte) -1, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray3);
        short[] shortArray8 = micazMsg7.get_Buffer();
        short[] shortArray9 = micazMsg7.get_Buffer();
        micazMsg7.amTypeSet(0);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        int int16 = micazMsg13.get_NodeID();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        micazMsg13.set_Buffer(shortArray19);
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray23 = micazMsg22.get_Buffer();
        java.lang.Object obj24 = micazMsg22.clone();
        int int25 = micazMsg22.get_NodeID();
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray28);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg(byteArray28, 2);
        micazMsg22.dataSet(byteArray28);
        int int33 = micazMsg22.baseOffset();
        micazMsg22.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg22, (int) (short) 10);
        byte[] byteArray38 = micazMsg22.dataGet();
        laccan.devices.MicazMsg micazMsg39 = new laccan.devices.MicazMsg(byteArray38);
        laccan.devices.MicazMsg micazMsg41 = new laccan.devices.MicazMsg(byteArray38, (int) 'a');
        micazMsg13.dataSet(byteArray38, (int) (short) 0, 12, 20);
        micazMsg7.dataSet(byteArray38, 8, 2, 5);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray38);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test011");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(160, 97);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test012");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        sample4.setDate((long) '#');
        java.lang.String[] strArray7 = sample4.toCSV();
        sample4.setDate((long) (-1));
        laccan.devices.Type type10 = sample4.getType();
        java.lang.String[] strArray11 = sample4.toCSV();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test013");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        byte[] byteArray7 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, (int) (short) -1);
        short[] shortArray11 = micazMsg10.get_Buffer();
        int int12 = micazMsg10.get_Voltage();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test014");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;1.0;10", 16.0d, (long) 48);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test015");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(100, (int) (short) 1);
        java.lang.String str3 = micazMsg2.toString();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, 100L);
        byte[] byteArray6 = micazMsg2.dataGet();
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg2);
        micazMsg2.set_NodeID(65);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str3.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test016");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n", 24.0d, 10L);
        sample3.setTemperature(24.0d);
        sample3.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;32.0;35");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test017");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 10);
        micazMsg9.set_NodeID(20);
        net.tinyos.message.Message message13 = micazMsg9.clone((int) (byte) 10);
        int int14 = micazMsg9.baseOffset();
        java.lang.Object obj15 = micazMsg9.clone();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(message13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test018");
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
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray27 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg21.set_Buffer(shortArray27);
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg21);
        java.lang.String[] strArray30 = sample29.toCSV();
        sample29.setNode("hi!");
        double double33 = sample29.getDateDouble();
        memory0.add(sample29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test019");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 1);
        java.lang.String str6 = micazMsg5.toString();
        java.lang.String str7 = micazMsg5.toString();
        java.lang.String str8 = micazMsg5.toString();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str6.equals("Message <MicazMsg> \n  [Buffer="));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str7.equals("Message <MicazMsg> \n  [Buffer="));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str8.equals("Message <MicazMsg> \n  [Buffer="));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test020");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray3, (int) (byte) -1, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray3);
        short[] shortArray8 = micazMsg7.get_Buffer();
        int int9 = micazMsg7.baseOffset();
        try {
            micazMsg7.init((-139));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test021");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList4 = keepingAll0.get();
        int int5 = keepingAll0.length();
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test022");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        micazMsg3.init((int) '#');
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = micazMsg7.get_Buffer();
        java.lang.Object obj9 = micazMsg7.clone();
        java.lang.String str10 = micazMsg7.toString();
        short[] shortArray11 = micazMsg7.get_Buffer();
        micazMsg3.set_Buffer(shortArray11);
        int int13 = micazMsg3.get_NodeID();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str10.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test023");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        micazMsg1.amTypeSet(52);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray10, 48);
        micazMsg1.dataSet(byteArray10);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray10);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray10);
        java.lang.Object obj16 = micazMsg15.clone();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test024");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(172);
        laccan.devices.Sample sample2 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 65);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test025");
        laccan.devices.helper.utils.Assistant.predictorType = "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;1.0;10";
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test026");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(51, 96);
        short short4 = micazMsg2.getElement_Buffer(2);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test027");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 2);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        micazMsg6.set_NodeID((int) (byte) 10);
        byte[] byteArray9 = micazMsg6.dataGet();
        int int10 = micazMsg6.dataLength();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg6.getSerialPacket();
        micazMsg6.amTypeSet(52);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg15);
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg15, (long) (short) 10);
        net.tinyos.message.SerialPacket serialPacket20 = micazMsg15.getSerialPacket();
        byte[] byteArray21 = micazMsg15.dataGet();
        short[] shortArray22 = micazMsg15.get_Buffer();
        try {
            micazMsg6.set_Buffer(shortArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNull(serialPacket20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(shortArray22);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test028");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(1, 20);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test029");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone((int) ' ');
        int int10 = micazMsg1.amType();
        int int11 = micazMsg1.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test030");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((-30), 97);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test031");
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
            laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg13, 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length -8 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNull(serialPacket14);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test032");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1);
        int int11 = micazMsg1.dataLength();
        byte[] byteArray12 = micazMsg1.dataGet();
        micazMsg1.set_NodeID((int) (short) 1);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(byteArray12);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test033");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        int int3 = micazMsg1.get_NodeID();
        java.lang.Object obj4 = micazMsg1.clone();
        micazMsg1.init((int) (short) 10);
        java.lang.String str7 = micazMsg1.toString();
        int int8 = micazMsg1.baseOffset();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 " + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 "));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test034");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        java.lang.Object obj5 = micazMsg1.clone();
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1, (long) 8);
        double double8 = sample7.getTemperature();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-19.699999999999996d) + "'", double8 == (-19.699999999999996d));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test035");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(16, 32);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test036");
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
        java.lang.String str15 = sample7.getNode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "full_memory" + "'", str15.equals("full_memory"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test037");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) 35L, (long) 10);
        sample3.setTemperature((double) 1L);
        double double6 = sample3.getTemperature();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test038");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        int int8 = micazMsg1.get_NodeID();
        net.tinyos.message.SerialPacket serialPacket9 = micazMsg1.getSerialPacket();
        micazMsg1.setElement_Buffer(3, (short) 100);
        int int13 = micazMsg1.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(serialPacket9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test039");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        byte[] byteArray7 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray7, (int) (short) 1);
        micazMsg9.set_NodeID((int) (short) 1);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        micazMsg13.set_NodeID(20);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray20);
        micazMsg13.dataSet(byteArray20);
        micazMsg13.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray32 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg26.set_Buffer(shortArray32);
        int int34 = micazMsg26.get_NodeID();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg(byteArray37);
        micazMsg26.dataSet((net.tinyos.message.Message) micazMsg38, (int) (byte) 0);
        int int41 = micazMsg38.get_NodeID();
        micazMsg13.dataSet((net.tinyos.message.Message) micazMsg38, (int) (byte) 1);
        laccan.devices.MicazMsg micazMsg46 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg13, 10, (int) ' ');
        laccan.devices.MicazMsg micazMsg48 = new laccan.devices.MicazMsg(512);
        byte[] byteArray49 = micazMsg48.dataGet();
        laccan.devices.MicazMsg micazMsg50 = new laccan.devices.MicazMsg(byteArray49);
        laccan.devices.MicazMsg micazMsg52 = new laccan.devices.MicazMsg(byteArray49, (int) (byte) 1);
        micazMsg13.dataSet(byteArray49);
        try {
            micazMsg9.dataSet(byteArray49, (int) (short) -1, 32, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 256 + "'", int41 == 256);
        org.junit.Assert.assertNotNull(byteArray49);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test040");
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
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray20);
        int int24 = micazMsg23.dataLength();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test041");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 512, (long) 51, 0);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test042");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests(100L, (long) 6, 16);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test043");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        micazMsg1.set_NodeID((int) (byte) -1);
        java.lang.String str7 = micazMsg1.toString();
        short[] shortArray8 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg1, (long) 97);
        long long12 = sample11.getDate();
        sample11.setNode("memory");
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test044");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(0, 8);
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray5 = micazMsg4.get_Buffer();
        java.lang.Object obj6 = micazMsg4.clone();
        micazMsg4.amTypeSet(20);
        int int9 = micazMsg4.baseOffset();
        byte[] byteArray10 = micazMsg4.dataGet();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray10);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray10);
        int int14 = micazMsg13.get_Voltage();
        byte[] byteArray15 = micazMsg13.dataGet();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray15, 256);
        try {
            micazMsg2.dataSet(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test045");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((-1), 97);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test046");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        double double7 = sample6.getTemperature();
        double double8 = sample6.getTemperature();
        sample6.setDate((long) '4');
        sample6.setDate((long) (byte) 1);
        laccan.memory.data.reduction.KeepingAll keepingAll13 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList14 = keepingAll13.get();
        int int15 = keepingAll13.length();
        java.util.List<laccan.devices.Sample> sampleList16 = keepingAll13.get();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        java.lang.Object obj20 = micazMsg18.clone();
        laccan.devices.Sample sample21 = new laccan.devices.Sample(micazMsg18);
        laccan.devices.Type type22 = null;
        sample21.setType(type22);
        laccan.devices.Type type24 = null;
        sample21.setType(type24);
        sample21.setNode("hi!");
        keepingAll13.add(sample21);
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray31 = micazMsg30.get_Buffer();
        java.lang.Object obj32 = micazMsg30.clone();
        laccan.devices.Sample sample33 = new laccan.devices.Sample(micazMsg30);
        laccan.devices.Type type34 = null;
        sample33.setType(type34);
        java.lang.String str36 = sample33.toString();
        java.lang.String str37 = sample33.getNode();
        keepingAll13.add(sample33);
        laccan.devices.Sample sample39 = new laccan.devices.Sample();
        laccan.devices.Type type40 = laccan.devices.Type.FULL;
        sample39.setType(type40);
        sample33.setType(type40);
        double double43 = sample33.getTemperature();
        laccan.devices.MicazMsg micazMsg45 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray46 = micazMsg45.get_Buffer();
        java.lang.Object obj47 = micazMsg45.clone();
        laccan.devices.Sample sample48 = new laccan.devices.Sample(micazMsg45);
        long long49 = sample48.getDate();
        laccan.devices.Type type50 = laccan.devices.Type.FULL;
        sample48.setType(type50);
        sample33.setType(type50);
        java.lang.String str53 = sample33.getNode();
        laccan.memory.data.reduction.KeepingAll keepingAll54 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList55 = keepingAll54.get();
        int int56 = keepingAll54.length();
        laccan.memory.data.reduction.KeepingAll keepingAll57 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample58 = new laccan.devices.Sample();
        keepingAll57.add(sample58);
        sample58.setDate(10L);
        keepingAll54.add(sample58);
        laccan.memory.data.reduction.KeepingAll keepingAll63 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList64 = keepingAll63.get();
        int int65 = keepingAll63.length();
        java.util.List<laccan.devices.Sample> sampleList66 = keepingAll63.get();
        laccan.devices.MicazMsg micazMsg68 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray69 = micazMsg68.get_Buffer();
        java.lang.Object obj70 = micazMsg68.clone();
        laccan.devices.Sample sample71 = new laccan.devices.Sample(micazMsg68);
        laccan.devices.Type type72 = null;
        sample71.setType(type72);
        laccan.devices.Type type74 = null;
        sample71.setType(type74);
        sample71.setNode("hi!");
        keepingAll63.add(sample71);
        laccan.devices.MicazMsg micazMsg80 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray81 = micazMsg80.get_Buffer();
        java.lang.Object obj82 = micazMsg80.clone();
        laccan.devices.Sample sample83 = new laccan.devices.Sample(micazMsg80);
        laccan.devices.Type type84 = null;
        sample83.setType(type84);
        java.lang.String str86 = sample83.toString();
        java.lang.String str87 = sample83.getNode();
        keepingAll63.add(sample83);
        laccan.devices.Sample sample89 = new laccan.devices.Sample();
        laccan.devices.Type type90 = laccan.devices.Type.FULL;
        sample89.setType(type90);
        sample83.setType(type90);
        sample58.setType(type90);
        sample33.setType(type90);
        sample6.setType(type90);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-19.699999999999996d) + "'", double7 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-19.699999999999996d) + "'", double8 == (-19.699999999999996d));
        org.junit.Assert.assertNotNull(sampleList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(sampleList16);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "null;-19.699999999999996;0" + "'", str36.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + type40 + "' != '" + laccan.devices.Type.FULL + "'", type40.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-19.699999999999996d) + "'", double43 == (-19.699999999999996d));
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + type50 + "' != '" + laccan.devices.Type.FULL + "'", type50.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(sampleList55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(sampleList64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(sampleList66);
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertNotNull(shortArray81);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "null;-19.699999999999996;0" + "'", str86.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertTrue("'" + type90 + "' != '" + laccan.devices.Type.FULL + "'", type90.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test047");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1);
        short[] shortArray8 = micazMsg1.get_Buffer();
        int int9 = micazMsg1.baseOffset();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg1, (long) 3);
        laccan.devices.Type type12 = sample11.getType();
        long long13 = sample11.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test048");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray5 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray5, 100);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray5);
        micazMsg8.set_NodeID(52);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test049");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        micazMsg1.set_NodeID(24);
        java.lang.Object obj12 = micazMsg1.clone();
        java.lang.String str13 = micazMsg1.toString();
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg1, (long) 65535);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x18]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x18]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test050");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        double double6 = sample5.getDateDouble();
        laccan.devices.Type type7 = sample5.getType();
        long long8 = sample5.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test051");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 10);
        micazMsg1.amTypeSet(1);
        net.tinyos.message.Message message13 = micazMsg1.clone((int) (byte) 10);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        micazMsg15.set_Voltage((int) '#');
        micazMsg15.amTypeSet(52);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray24, 48);
        micazMsg15.dataSet(byteArray24);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray24);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray24);
        try {
            message13.dataSet(byteArray24, 100, 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(message13);
        org.junit.Assert.assertNotNull(byteArray24);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test052");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) (byte) 100);
        micazMsg1.amTypeSet(2);
        int int9 = micazMsg1.get_NodeID();
        short[] shortArray10 = micazMsg1.get_Buffer();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        net.tinyos.message.SerialPacket serialPacket16 = micazMsg13.getSerialPacket();
        micazMsg13.set_NodeID((int) (byte) -1);
        java.lang.String str19 = micazMsg13.toString();
        micazMsg13.init((int) (short) 100);
        try {
            serialPacket11.dataSet((net.tinyos.message.Message) micazMsg13, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(serialPacket16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str19.equals("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test053");
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
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test054");
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
        int int14 = micazMsg11.get_NodeID();
        micazMsg11.setElement_Buffer(1, (short) (byte) 0);
        int int18 = micazMsg11.baseOffset();
        int int19 = micazMsg11.get_Voltage();
        laccan.devices.Sample sample21 = new laccan.devices.Sample(micazMsg11, (long) 20);
        net.tinyos.message.SerialPacket serialPacket22 = micazMsg11.getSerialPacket();
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg11, 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(serialPacket22);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test055");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 64);
        micazMsg2.amTypeSet(1);
        java.lang.Object obj5 = micazMsg2.clone();
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test056");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(52, 0);
        net.tinyos.message.SerialPacket serialPacket3 = micazMsg2.getSerialPacket();
        int int4 = micazMsg2.get_NodeID();
        org.junit.Assert.assertNull(serialPacket3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test057");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 97, 0L, (int) (byte) 0);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test058");
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
        laccan.devices.MicazMsg micazMsg39 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray40 = micazMsg39.get_Buffer();
        java.lang.Object obj41 = micazMsg39.clone();
        net.tinyos.message.SerialPacket serialPacket42 = micazMsg39.getSerialPacket();
        micazMsg39.set_NodeID((int) (byte) -1);
        java.lang.String str45 = micazMsg39.toString();
        short[] shortArray46 = micazMsg39.get_Buffer();
        laccan.devices.Sample sample47 = new laccan.devices.Sample(micazMsg39);
        memory0.add(sample47);
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
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNull(serialPacket42);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str45.equals("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray46);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test059");
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
        micazMsg1.set_NodeID(6);
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
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test060");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        java.util.List<laccan.devices.Sample> sampleList6 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV8 = storageCSV4.local("");
        laccan.persistence.StorageCSV storageCSV9 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV11 = storageCSV9.local("hi!");
        java.lang.String[] strArray13 = new java.lang.String[] { "result" };
        storageCSV9.save(strArray13);
        laccan.persistence.StorageCSV storageCSV16 = storageCSV9.local("nodes");
        laccan.persistence.StorageCSV storageCSV17 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV19 = storageCSV17.local("hi!");
        laccan.persistence.StorageCSV storageCSV20 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray21 = new java.lang.String[] {};
        storageCSV20.save(strArray21);
        storageCSV17.save(strArray21);
        laccan.persistence.StorageCSV storageCSV25 = storageCSV17.local("nodes");
        laccan.persistence.StorageCSV storageCSV27 = storageCSV17.local("init");
        java.util.List<laccan.devices.Sample> sampleList28 = storageCSV17.read();
        laccan.devices.Sample sample32 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=", Double.NaN, (long) '#');
        java.lang.String[] strArray33 = sample32.toCSV();
        storageCSV17.save(strArray33);
        storageCSV16.save(strArray33);
        storageCSV8.save(strArray33);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(storageCSV16);
        org.junit.Assert.assertNotNull(storageCSV19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(storageCSV25);
        org.junit.Assert.assertNotNull(storageCSV27);
        org.junit.Assert.assertNotNull(sampleList28);
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test061");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory;-19.699999999999996;-1", (double) 32, (long) 32);
        java.lang.String str4 = sample3.getNode();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "memory;-19.699999999999996;-1" + "'", str4.equals("memory;-19.699999999999996;-1"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test062");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone((int) ' ');
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1);
        java.lang.String str11 = sample10.toString();
        long long12 = sample10.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null;-19.699999999999996;0" + "'", str11.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test063");
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
        java.util.List<laccan.devices.Sample> sampleList62 = storageCSV4.read();
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
        org.junit.Assert.assertNotNull(sampleList62);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test064");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(51, (int) (byte) -1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test065");
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
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray23 = micazMsg22.get_Buffer();
        java.lang.Object obj24 = micazMsg22.clone();
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg22);
        laccan.devices.Sample sample26 = new laccan.devices.Sample();
        laccan.devices.Sample sample27 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray28 = new laccan.devices.Sample[] { sample25, sample26, sample27 };
        java.util.ArrayList<laccan.devices.Sample> sampleList29 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList29, sampleArray28);
        java.util.List<java.lang.Double> doubleList31 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList29);
        java.util.List<java.lang.Double> doubleList32 = regression20.result(doubleList31);
        regression16.init(sampleList19, doubleList31);
        laccan.cloud.prediction.Regression regression34 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray37 = micazMsg36.get_Buffer();
        java.lang.Object obj38 = micazMsg36.clone();
        laccan.devices.Sample sample39 = new laccan.devices.Sample(micazMsg36);
        laccan.devices.Sample sample40 = new laccan.devices.Sample();
        laccan.devices.Sample sample41 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray42 = new laccan.devices.Sample[] { sample39, sample40, sample41 };
        java.util.ArrayList<laccan.devices.Sample> sampleList43 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList43, sampleArray42);
        java.util.List<java.lang.Double> doubleList45 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList43);
        java.util.List<java.lang.Double> doubleList46 = regression34.result(doubleList45);
        java.util.List<java.lang.Double> doubleList47 = regression16.result(doubleList45);
        double double48 = regression16.mse();
        laccan.cloud.prediction.Regression regression49 = new laccan.cloud.prediction.Regression();
        double double50 = regression49.mse();
        double double51 = regression49.mse();
        java.util.List<laccan.devices.Sample> sampleList52 = null;
        laccan.devices.MicazMsg micazMsg54 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray55 = micazMsg54.get_Buffer();
        java.lang.Object obj56 = micazMsg54.clone();
        laccan.devices.Sample sample57 = new laccan.devices.Sample(micazMsg54);
        laccan.devices.Sample sample58 = new laccan.devices.Sample();
        laccan.devices.Sample sample59 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray60 = new laccan.devices.Sample[] { sample57, sample58, sample59 };
        java.util.ArrayList<laccan.devices.Sample> sampleList61 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList61, sampleArray60);
        java.util.List<java.lang.Double> doubleList63 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList61);
        regression49.init(sampleList52, doubleList63);
        java.util.List<java.lang.Double> doubleList65 = regression16.result(doubleList63);
        java.util.List<java.lang.Double> doubleList66 = regression0.result(doubleList65);
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
        laccan.memory.data.reduction.KeepingAll keepingAll80 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList81 = keepingAll80.get();
        java.util.List<java.lang.Double> doubleList82 = laccan.cloud.prediction.Regression.makeTests(sampleList81);
        java.util.List<java.lang.Double> doubleList83 = regression67.result(doubleList82);
        java.util.List<java.lang.Double> doubleList84 = regression0.result(doubleList82);
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
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(sampleArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(doubleList31);
        org.junit.Assert.assertNotNull(doubleList32);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(sampleArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(doubleList45);
        org.junit.Assert.assertNotNull(doubleList46);
        org.junit.Assert.assertNotNull(doubleList47);
        org.junit.Assert.assertEquals((double) double48, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double50, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double51, Double.NaN, 0);
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(sampleArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(doubleList63);
        org.junit.Assert.assertNotNull(doubleList65);
        org.junit.Assert.assertNotNull(doubleList66);
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(sampleArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(doubleList78);
        org.junit.Assert.assertNotNull(doubleList79);
        org.junit.Assert.assertNotNull(sampleList81);
        org.junit.Assert.assertNotNull(doubleList82);
        org.junit.Assert.assertNotNull(doubleList83);
        org.junit.Assert.assertNotNull(doubleList84);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test066");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        sample4.setTemperature((double) 16);
        double double7 = sample4.getTemperature();
        sample4.setDate((long) (short) 100);
        java.lang.String str10 = sample4.toString();
        java.lang.String str11 = sample4.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 16.0d + "'", double7 == 16.0d);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null;16.0;100" + "'", str10.equals("null;16.0;100"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null;16.0;100" + "'", str11.equals("null;16.0;100"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test067");
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
        micazMsg29.amTypeSet(0);
        try {
            short[] shortArray32 = micazMsg29.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length -18 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(byteArray23);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test068");
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
        short[] shortArray35 = micazMsg34.get_Buffer();
        java.lang.Object obj36 = micazMsg34.clone();
        laccan.devices.Sample sample37 = new laccan.devices.Sample(micazMsg34);
        laccan.devices.Type type38 = null;
        sample37.setType(type38);
        laccan.devices.Type type40 = null;
        sample37.setType(type40);
        sample37.setNode("hi!");
        java.lang.String[] strArray44 = sample37.toCSV();
        sample37.setTemperature((double) 2);
        keepingAll0.add(sample37);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(sampleList14);
        org.junit.Assert.assertNotNull(sampleList15);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(strArray44);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test069");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        net.tinyos.message.Message message14 = micazMsg1.clone(24);
        int int15 = micazMsg1.baseOffset();
        java.lang.Object obj16 = micazMsg1.clone();
        micazMsg1.setElement_Buffer(0, (short) (byte) -1);
        java.lang.String str20 = micazMsg1.toString();
        int int21 = micazMsg1.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xffff 0x0 0x0 0x0 0x0 0x0 " + "'", str20.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xffff 0x0 0x0 0x0 0x0 0x0 "));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test070");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        java.util.List<laccan.devices.Sample> sampleList6 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV8 = storageCSV4.local("");
        laccan.persistence.StorageCSV storageCSV9 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV11 = storageCSV9.local("hi!");
        laccan.persistence.StorageCSV storageCSV13 = storageCSV11.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList14 = storageCSV13.read();
        laccan.persistence.StorageCSV storageCSV16 = storageCSV13.local("memory");
        laccan.persistence.StorageCSV storageCSV17 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV19 = storageCSV17.local("hi!");
        laccan.persistence.StorageCSV storageCSV21 = storageCSV19.local("lastReading");
        java.lang.String[] strArray27 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV21.save(strArray27);
        storageCSV13.save(strArray27);
        storageCSV4.save(strArray27);
        laccan.persistence.StorageCSV storageCSV32 = storageCSV4.local("null;-19.699999999999996;1");
        java.util.List<laccan.devices.Sample> sampleList33 = storageCSV4.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(sampleList14);
        org.junit.Assert.assertNotNull(storageCSV16);
        org.junit.Assert.assertNotNull(storageCSV19);
        org.junit.Assert.assertNotNull(storageCSV21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(storageCSV32);
        org.junit.Assert.assertNotNull(sampleList33);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test071");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("full_memory", (double) (short) 1, (long) 172);
        laccan.devices.Type type4 = sample3.getType();
        double double5 = sample3.getTemperature();
        java.lang.String str6 = sample3.toString();
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "full_memory;1.0;172" + "'", str6.equals("full_memory;1.0;172"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test072");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        int int8 = micazMsg1.get_NodeID();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (short) 1);
        int int11 = micazMsg1.amType();
        int int12 = micazMsg1.get_Voltage();
        short[] shortArray13 = micazMsg1.get_Buffer();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 172 + "'", int11 == 172);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(shortArray13);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test073");
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
        memory0.build();
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray39 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg33.set_Buffer(shortArray39);
        laccan.devices.Sample sample41 = new laccan.devices.Sample(micazMsg33);
        java.lang.String[] strArray42 = sample41.toCSV();
        java.lang.String str43 = sample41.getNode();
        sample41.setDate((long) 32);
        java.lang.String str46 = sample41.toString();
        memory0.add(sample41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(container17);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "null;-19.699999999999996;0" + "'", str28.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "null;-19.648499999999995;32" + "'", str46.equals("null;-19.648499999999995;32"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test074");
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
        long long27 = sample7.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + laccan.devices.Type.FULL + "'", type20.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + laccan.devices.Type.FULL + "'", type25.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test075");
        laccan.devices.helper.utils.Assistant.predictorType = "null;0.0;0";
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test076");
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
        laccan.memory.data.reduction.KeepingAll keepingAll20 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray23 = micazMsg22.get_Buffer();
        java.lang.Object obj24 = micazMsg22.clone();
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg22);
        laccan.devices.Type type26 = null;
        sample25.setType(type26);
        keepingAll20.add(sample25);
        java.lang.String str29 = sample25.getNode();
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
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test077");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray3 = micazMsg2.get_Buffer();
        java.lang.Object obj4 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2);
        laccan.devices.Type type6 = null;
        sample5.setType(type6);
        keepingAll0.add(sample5);
        sample5.setDate((long) (byte) 100);
        laccan.devices.Type type11 = sample5.getType();
        java.lang.String str12 = sample5.toString();
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(type11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null;-19.699999999999996;100" + "'", str12.equals("null;-19.699999999999996;100"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test078");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        sample4.setTemperature((double) 16);
        double double7 = sample4.getDateDouble();
        java.lang.String str8 = sample4.getNode();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test079");
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
        java.util.List<laccan.devices.Sample> sampleList57 = storageCSV10.read();
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
        org.junit.Assert.assertNotNull(sampleList57);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test080");
        laccan.devices.helper.utils.Assistant.reducerType = "Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=;NaN;35";
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test081");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 4, (long) (byte) 1, 256);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test082");
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
        double double17 = sample15.getDateDouble();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-19.699999999999996d) + "'", double16 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test083");
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
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray36 = micazMsg35.get_Buffer();
        java.lang.Object obj37 = micazMsg35.clone();
        laccan.devices.Sample sample38 = new laccan.devices.Sample(micazMsg35);
        laccan.devices.Type type39 = null;
        sample38.setType(type39);
        laccan.devices.Type type41 = null;
        sample38.setType(type41);
        java.lang.String str43 = sample38.toString();
        java.lang.String[] strArray44 = sample38.toCSV();
        java.lang.Class<?> wildcardClass45 = sample38.getClass();
        memory0.add(sample38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "null;-19.699999999999996;0" + "'", str43.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test084");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(24, 4);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test085");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        java.lang.String str4 = micazMsg1.toString();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(16);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg6, (int) (byte) 0);
        try {
            short[] shortArray9 = micazMsg6.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (128) or length (16), for data_length 16 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test086");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(2, (int) ' ');
        int int3 = micazMsg2.amType();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        micazMsg5.setElement_Buffer(0, (short) 10);
        int int10 = micazMsg5.get_Voltage();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        java.lang.String str15 = micazMsg12.toString();
        short[] shortArray16 = micazMsg12.get_Buffer();
        byte[] byteArray17 = micazMsg12.dataGet();
        java.lang.Object obj18 = micazMsg12.clone();
        net.tinyos.message.Message message20 = micazMsg12.clone(2);
        byte[] byteArray21 = micazMsg12.dataGet();
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray21);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray21);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray21);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray21);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray21, 52);
        micazMsg5.dataSet(byteArray21);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray21);
        try {
            micazMsg2.dataSet(byteArray21, 96, 52, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 172 + "'", int3 == 172);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str15.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(message20);
        org.junit.Assert.assertNotNull(byteArray21);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test087");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        java.lang.Object obj8 = micazMsg7.clone();
        net.tinyos.message.SerialPacket serialPacket9 = micazMsg7.getSerialPacket();
        micazMsg7.set_NodeID(16);
        try {
            laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg7, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 97, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(serialPacket9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test088");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(16, 8);
        micazMsg2.amTypeSet(96);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test089");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        int int16 = micazMsg13.dataLength();
        int int17 = micazMsg13.amType();
        byte[] byteArray18 = micazMsg13.dataGet();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 172 + "'", int17 == 172);
        org.junit.Assert.assertNotNull(byteArray18);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test090");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(5, (short) 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test091");
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
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray20);
        byte[] byteArray24 = micazMsg23.dataGet();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteArray24);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test092");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) -1, 24);
        net.tinyos.message.Message message4 = micazMsg2.clone(2);
        byte[] byteArray5 = message4.dataGet();
        try {
            laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(message4, 20, 112);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 20, data_length 112 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(message4);
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test093");
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
        java.lang.Object obj34 = micazMsg32.clone();
        int int35 = micazMsg32.get_NodeID();
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg39 = new laccan.devices.MicazMsg(byteArray38);
        laccan.devices.MicazMsg micazMsg41 = new laccan.devices.MicazMsg(byteArray38, 2);
        micazMsg32.dataSet(byteArray38);
        int int43 = micazMsg32.baseOffset();
        byte[] byteArray44 = micazMsg32.dataGet();
        micazMsg30.dataSet(byteArray44);
        try {
            laccan.devices.MicazMsg micazMsg48 = new laccan.devices.MicazMsg(byteArray44, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 100, data_length -1 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(byteArray44);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test094");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 512);
        java.lang.Object obj7 = micazMsg2.clone();
        micazMsg2.amTypeSet((int) (short) 1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg2);
        long long11 = sample10.getDate();
        double double12 = sample10.getTemperature();
        sample10.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-19.699999999999996d) + "'", double12 == (-19.699999999999996d));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test095");
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
        laccan.memory.Memory memory30 = new laccan.memory.Memory();
        memory30.build();
        int int32 = memory30.length();
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray35 = micazMsg34.get_Buffer();
        java.lang.Object obj36 = micazMsg34.clone();
        laccan.devices.Sample sample37 = new laccan.devices.Sample(micazMsg34);
        long long38 = sample37.getDate();
        java.lang.Class<?> wildcardClass39 = sample37.getClass();
        java.lang.String str40 = sample37.getNode();
        sample37.setNode("full_memory");
        memory30.add(sample37);
        laccan.memory.data.reduction.KeepingAll keepingAll44 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList45 = keepingAll44.get();
        int int46 = keepingAll44.length();
        java.util.List<laccan.devices.Sample> sampleList47 = keepingAll44.get();
        laccan.devices.MicazMsg micazMsg49 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray50 = micazMsg49.get_Buffer();
        java.lang.Object obj51 = micazMsg49.clone();
        laccan.devices.Sample sample52 = new laccan.devices.Sample(micazMsg49);
        laccan.devices.Type type53 = null;
        sample52.setType(type53);
        laccan.devices.Type type55 = null;
        sample52.setType(type55);
        sample52.setNode("hi!");
        keepingAll44.add(sample52);
        laccan.devices.MicazMsg micazMsg61 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray62 = micazMsg61.get_Buffer();
        java.lang.Object obj63 = micazMsg61.clone();
        laccan.devices.Sample sample64 = new laccan.devices.Sample(micazMsg61);
        laccan.devices.Type type65 = null;
        sample64.setType(type65);
        java.lang.String str67 = sample64.toString();
        java.lang.String str68 = sample64.getNode();
        keepingAll44.add(sample64);
        laccan.devices.Sample sample70 = new laccan.devices.Sample();
        laccan.devices.Type type71 = laccan.devices.Type.FULL;
        sample70.setType(type71);
        sample64.setType(type71);
        double double74 = sample64.getTemperature();
        sample64.setNode("");
        memory30.add(sample64);
        laccan.devices.Type type78 = sample64.getType();
        memory0.add(sample64);
        sample64.setTemperature((double) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(sampleList45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(sampleList47);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "null;-19.699999999999996;0" + "'", str67.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + type71 + "' != '" + laccan.devices.Type.FULL + "'", type71.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-19.699999999999996d) + "'", double74 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + type78 + "' != '" + laccan.devices.Type.FULL + "'", type78.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test096");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        int int11 = micazMsg1.dataLength();
        int int12 = micazMsg1.get_NodeID();
        java.lang.String str13 = micazMsg1.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 256 + "'", int12 == 256);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test097");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        java.lang.String str4 = micazMsg1.toString();
        micazMsg1.amTypeSet((int) ' ');
        try {
            micazMsg1.setElement_Buffer(512, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test098");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        int int13 = micazMsg12.amType();
        try {
            int int14 = micazMsg12.get_Voltage();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 172 + "'", int13 == 172);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test099");
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
        sample4.setTemperature((double) (-30));
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "reduction;-19.699999999999996;0" + "'", str10.equals("reduction;-19.699999999999996;0"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test100");
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
        int int16 = container10.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(sampleList13);
        org.junit.Assert.assertNotNull(sampleList14);
        org.junit.Assert.assertNotNull(sampleList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test101");
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
        int int53 = keepingAll0.length();
        laccan.memory.Memory memory54 = new laccan.memory.Memory();
        memory54.build();
        int int56 = memory54.length();
        laccan.memory.data.reduction.KeepingAll keepingAll57 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample58 = new laccan.devices.Sample();
        keepingAll57.add(sample58);
        sample58.setDate(10L);
        memory54.add(sample58);
        laccan.memory.data.reduction.KeepingAll keepingAll63 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg65 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray66 = micazMsg65.get_Buffer();
        java.lang.Object obj67 = micazMsg65.clone();
        laccan.devices.Sample sample68 = new laccan.devices.Sample(micazMsg65);
        laccan.devices.Type type69 = null;
        sample68.setType(type69);
        keepingAll63.add(sample68);
        sample68.setDate((long) (byte) 100);
        memory54.add(sample68);
        long long75 = sample68.getDate();
        keepingAll0.add(sample68);
        int int77 = keepingAll0.length();
        int int78 = keepingAll0.length();
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 100L + "'", long75 == 100L);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 3 + "'", int77 == 3);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 3 + "'", int78 == 3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test102");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        java.lang.Object obj10 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg1);
        int int13 = micazMsg1.get_Voltage();
        micazMsg1.amTypeSet((-1));
        int int16 = micazMsg1.get_Voltage();
        micazMsg1.set_NodeID(12);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test103");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        java.lang.String str9 = micazMsg6.toString();
        short[] shortArray10 = micazMsg6.get_Buffer();
        micazMsg2.set_Buffer(shortArray10);
        int int12 = micazMsg2.amType();
        int int13 = micazMsg2.dataLength();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test104");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(112, 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test105");
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
        laccan.memory.data.reduction.KeepingAll keepingAll39 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList40 = keepingAll39.get();
        int int41 = keepingAll39.length();
        java.util.List<laccan.devices.Sample> sampleList42 = keepingAll39.get();
        laccan.devices.MicazMsg micazMsg44 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray45 = micazMsg44.get_Buffer();
        laccan.devices.Sample sample46 = new laccan.devices.Sample(micazMsg44);
        keepingAll39.add(sample46);
        java.util.List<laccan.devices.Sample> sampleList48 = keepingAll39.get();
        laccan.persistence.StorageCSV storageCSV49 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV51 = storageCSV49.local("hi!");
        laccan.persistence.StorageCSV storageCSV53 = storageCSV51.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList54 = storageCSV53.read();
        laccan.persistence.StorageCSV storageCSV56 = storageCSV53.local("init");
        java.util.List<laccan.devices.Sample> sampleList57 = storageCSV53.read();
        java.util.List<java.lang.Double> doubleList58 = laccan.cloud.prediction.Regression.makeTests(sampleList57);
        java.util.List<java.lang.Double> doubleList59 = laccan.cloud.prediction.Regression.makeTests(sampleList57);
        regression0.init(sampleList48, doubleList59);
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
        org.junit.Assert.assertNotNull(sampleList40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(sampleList42);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertNotNull(sampleList48);
        org.junit.Assert.assertNotNull(storageCSV51);
        org.junit.Assert.assertNotNull(storageCSV53);
        org.junit.Assert.assertNotNull(sampleList54);
        org.junit.Assert.assertNotNull(storageCSV56);
        org.junit.Assert.assertNotNull(sampleList57);
        org.junit.Assert.assertNotNull(doubleList58);
        org.junit.Assert.assertNotNull(doubleList59);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test106");
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
        java.lang.String[] strArray35 = sample20.toCSV();
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
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test107");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        byte[] byteArray7 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        micazMsg12.set_NodeID(20);
        short[] shortArray19 = new short[] { (byte) -1, (short) 0 };
        micazMsg12.set_Buffer(shortArray19);
        micazMsg10.set_Buffer(shortArray19);
        micazMsg8.set_Buffer(shortArray19);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(shortArray19);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test108");
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
        int int46 = memory0.length();
        laccan.memory.Container container47 = memory0.getMemory();
        int int48 = container47.length();
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertNotNull(container47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test109");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray6);
        java.lang.String str9 = micazMsg8.toString();
        net.tinyos.message.SerialPacket serialPacket10 = micazMsg8.getSerialPacket();
        byte[] byteArray11 = micazMsg8.dataGet();
        java.lang.String str12 = micazMsg8.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNull(serialPacket10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test110");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) ' ');
        java.lang.String str12 = micazMsg1.toString();
        java.lang.Object obj13 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket14 = micazMsg1.getSerialPacket();
        net.tinyos.message.Message message16 = micazMsg1.clone((int) (byte) 10);
        try {
            short short18 = micazMsg1.getElement_Buffer(64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(serialPacket14);
        org.junit.Assert.assertNotNull(message16);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test111");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray5 = micazMsg1.dataGet();
        int int6 = micazMsg1.get_Voltage();
        java.lang.Object obj7 = micazMsg1.clone();
        int int8 = micazMsg1.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test112");
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
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray23 = micazMsg22.get_Buffer();
        micazMsg22.setElement_Buffer(0, (short) 10);
        int int27 = micazMsg22.baseOffset();
        micazMsg22.amTypeSet(10);
        laccan.devices.Sample sample31 = new laccan.devices.Sample(micazMsg22, (long) 1);
        try {
            micazMsg14.dataSet((net.tinyos.message.Message) micazMsg22, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
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
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test113");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(2, 16);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test114");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(172);
        laccan.devices.Sample sample2 = new laccan.devices.Sample(micazMsg1);
        java.lang.String str3 = sample2.getNode();
        java.lang.String[] strArray4 = sample2.toCSV();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test115");
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
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg13, (int) (byte) 10);
        net.tinyos.message.Message message23 = micazMsg21.clone(0);
        short[] shortArray24 = micazMsg21.get_Buffer();
        micazMsg1.set_Buffer(shortArray24);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(message23);
        org.junit.Assert.assertNotNull(shortArray24);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test116");
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
        sample38.setTemperature((double) 100);
        java.lang.String str47 = sample38.getNode();
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
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test117");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        java.util.List<laccan.devices.Sample> sampleList6 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV9 = storageCSV7.local("hi!");
        laccan.persistence.StorageCSV storageCSV11 = storageCSV9.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList12 = storageCSV11.read();
        laccan.persistence.StorageCSV storageCSV14 = storageCSV11.local("init");
        laccan.persistence.StorageCSV storageCSV16 = storageCSV11.local("lastReading");
        laccan.memory.Memory memory17 = new laccan.memory.Memory();
        memory17.build();
        int int19 = memory17.length();
        laccan.memory.Container container20 = memory17.getMemory();
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray28 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg22.set_Buffer(shortArray28);
        laccan.devices.Sample sample30 = new laccan.devices.Sample(micazMsg22);
        java.lang.String[] strArray31 = sample30.toCSV();
        sample30.setNode("hi!");
        memory17.add(sample30);
        java.lang.String[] strArray35 = sample30.toCSV();
        storageCSV11.save(strArray35);
        storageCSV4.save(strArray35);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(sampleList12);
        org.junit.Assert.assertNotNull(storageCSV14);
        org.junit.Assert.assertNotNull(storageCSV16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(container20);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test118");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        laccan.memory.Memory memory4 = new laccan.memory.Memory();
        memory4.build();
        int int6 = memory4.length();
        laccan.memory.Container container7 = memory4.getMemory();
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg9.set_Buffer(shortArray15);
        laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg9);
        java.lang.String[] strArray18 = sample17.toCSV();
        sample17.setNode("hi!");
        memory4.add(sample17);
        keepingAll0.add(sample17);
        java.lang.String str23 = sample17.getNode();
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(container7);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test119");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        sample4.setNode("null;-19.699999999999996;0");
        sample4.setDate(0L);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test120");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("init");
        laccan.persistence.StorageCSV storageCSV9 = storageCSV4.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList10 = storageCSV4.read();
        java.util.List<laccan.devices.Sample> sampleList11 = storageCSV4.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(sampleList10);
        org.junit.Assert.assertNotNull(sampleList11);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test121");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.set_NodeID((int) (byte) -1);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1, (long) 'a');
        java.lang.String str7 = sample6.getNode();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test122");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        micazMsg1.amTypeSet(0);
        micazMsg1.set_NodeID((int) (byte) -1);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 16);
        java.lang.Object obj14 = micazMsg13.clone();
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg13);
        try {
            micazMsg13.setElement_Buffer((int) '#', (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test123");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory", (double) 2, (-1L));
        java.lang.String[] strArray4 = sample3.toCSV();
        sample3.setTemperature((double) 256);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test124");
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
        laccan.memory.Container container22 = memory0.getMemory();
        java.util.List<laccan.devices.Sample> sampleList23 = container22.get();
        int int24 = container22.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(container21);
        org.junit.Assert.assertNotNull(container22);
        org.junit.Assert.assertNotNull(sampleList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test125");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(1, (int) (byte) 1);
        net.tinyos.message.Message message4 = micazMsg2.clone(10);
        try {
            laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(message4);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test126");
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
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray43 = micazMsg42.get_Buffer();
        java.lang.Object obj44 = micazMsg42.clone();
        laccan.devices.Sample sample45 = new laccan.devices.Sample(micazMsg42);
        laccan.devices.Type type46 = null;
        sample45.setType(type46);
        laccan.devices.Type type48 = null;
        sample45.setType(type48);
        sample45.setNode("hi!");
        sample45.setDate((long) 1);
        laccan.devices.MicazMsg micazMsg55 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray56 = micazMsg55.get_Buffer();
        java.lang.Object obj57 = micazMsg55.clone();
        laccan.devices.Sample sample58 = new laccan.devices.Sample(micazMsg55);
        laccan.devices.Type type59 = null;
        sample58.setType(type59);
        laccan.devices.Type type61 = null;
        sample58.setType(type61);
        java.lang.String str63 = sample58.toString();
        laccan.devices.MicazMsg micazMsg66 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj67 = micazMsg66.clone();
        laccan.devices.Sample sample69 = new laccan.devices.Sample(micazMsg66, (long) 0);
        java.lang.String str70 = sample69.getNode();
        laccan.devices.MicazMsg micazMsg72 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray73 = micazMsg72.get_Buffer();
        java.lang.Object obj74 = micazMsg72.clone();
        laccan.devices.Sample sample75 = new laccan.devices.Sample(micazMsg72);
        long long76 = sample75.getDate();
        java.lang.Class<?> wildcardClass77 = sample75.getClass();
        laccan.devices.MicazMsg micazMsg79 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray80 = micazMsg79.get_Buffer();
        java.lang.Object obj81 = micazMsg79.clone();
        laccan.devices.Sample sample82 = new laccan.devices.Sample(micazMsg79);
        long long83 = sample82.getDate();
        laccan.devices.Type type84 = laccan.devices.Type.FULL;
        sample82.setType(type84);
        sample75.setType(type84);
        sample69.setType(type84);
        sample58.setType(type84);
        sample45.setType(type84);
        keepingAll0.add(sample45);
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
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "null;-19.699999999999996;0" + "'", str63.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(shortArray80);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertTrue("'" + type84 + "' != '" + laccan.devices.Type.FULL + "'", type84.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(sampleList91);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test127");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 52, (long) (short) 1, 172);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test128");
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
            micazMsg18.set_NodeID((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (0) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
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
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test129");
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
        sample42.setTemperature(48.0d);
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
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test130");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        byte[] byteArray7 = micazMsg1.dataGet();
        micazMsg1.init((int) (byte) 0);
        try {
            int int10 = micazMsg1.get_NodeID();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (0) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test131");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) (byte) 100);
        micazMsg1.amTypeSet(2);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        byte[] byteArray10 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        int int16 = micazMsg13.get_NodeID();
        micazMsg13.setElement_Buffer(1, (short) (byte) 0);
        int int20 = micazMsg13.get_NodeID();
        laccan.devices.Sample sample21 = new laccan.devices.Sample(micazMsg13);
        java.lang.Class<?> wildcardClass22 = micazMsg13.getClass();
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray25 = micazMsg24.get_Buffer();
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg24);
        int int27 = micazMsg24.get_NodeID();
        byte[] byteArray28 = micazMsg24.dataGet();
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray28);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray32 = micazMsg31.get_Buffer();
        java.lang.Object obj33 = micazMsg31.clone();
        int int34 = micazMsg31.get_NodeID();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg(byteArray37);
        laccan.devices.MicazMsg micazMsg40 = new laccan.devices.MicazMsg(byteArray37, 2);
        micazMsg31.dataSet(byteArray37);
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg(byteArray37);
        micazMsg29.dataSet(byteArray37);
        laccan.devices.MicazMsg micazMsg44 = new laccan.devices.MicazMsg(byteArray37);
        micazMsg13.dataSet(byteArray37);
        micazMsg11.dataSet(byteArray37);
        laccan.devices.MicazMsg micazMsg47 = new laccan.devices.MicazMsg(byteArray37);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteArray37);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test132");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone((int) ' ');
        int int10 = micazMsg1.amType();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        micazMsg12.amTypeSet(20);
        short[] shortArray17 = micazMsg12.get_Buffer();
        micazMsg1.set_Buffer(shortArray17);
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray21);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray21, 1);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray21);
        micazMsg25.init(48);
        short[] shortArray28 = micazMsg25.get_Buffer();
        micazMsg1.set_Buffer(shortArray28);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(shortArray28);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test133");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("init");
        java.util.List<laccan.devices.Sample> sampleList8 = storageCSV4.read();
        java.lang.Class<?> wildcardClass9 = storageCSV4.getClass();
        laccan.persistence.StorageCSV storageCSV11 = storageCSV4.local("");
        laccan.persistence.StorageCSV storageCSV13 = storageCSV11.local("Message <MicazMsg> \n  [NodeID=0x6401]\n  [Voltage=0x0]\n  [Buffer=0x1 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n");
        laccan.persistence.StorageCSV storageCSV14 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV16 = storageCSV14.local("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "result" };
        storageCSV14.save(strArray18);
        laccan.persistence.StorageCSV storageCSV21 = storageCSV14.local("nodes");
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
        laccan.devices.Type type38 = sample30.getType();
        java.lang.String[] strArray39 = sample30.toCSV();
        storageCSV21.save(strArray39);
        storageCSV13.save(strArray39);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(sampleList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(storageCSV16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(storageCSV21);
        org.junit.Assert.assertNotNull(sampleList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(sampleList25);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(type38);
        org.junit.Assert.assertNotNull(strArray39);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test134");
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
        laccan.memory.Container container20 = memory0.getMemory();
        int int21 = memory0.length();
        memory0.build();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(container20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test135");
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
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray23 = micazMsg22.get_Buffer();
        java.lang.Object obj24 = micazMsg22.clone();
        laccan.devices.Sample sample25 = new laccan.devices.Sample(micazMsg22);
        laccan.devices.Sample sample26 = new laccan.devices.Sample();
        laccan.devices.Sample sample27 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray28 = new laccan.devices.Sample[] { sample25, sample26, sample27 };
        java.util.ArrayList<laccan.devices.Sample> sampleList29 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList29, sampleArray28);
        java.util.List<java.lang.Double> doubleList31 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList29);
        java.util.List<java.lang.Double> doubleList32 = regression20.result(doubleList31);
        regression16.init(sampleList19, doubleList31);
        laccan.cloud.prediction.Regression regression34 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray37 = micazMsg36.get_Buffer();
        java.lang.Object obj38 = micazMsg36.clone();
        laccan.devices.Sample sample39 = new laccan.devices.Sample(micazMsg36);
        laccan.devices.Sample sample40 = new laccan.devices.Sample();
        laccan.devices.Sample sample41 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray42 = new laccan.devices.Sample[] { sample39, sample40, sample41 };
        java.util.ArrayList<laccan.devices.Sample> sampleList43 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList43, sampleArray42);
        java.util.List<java.lang.Double> doubleList45 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList43);
        java.util.List<java.lang.Double> doubleList46 = regression34.result(doubleList45);
        java.util.List<java.lang.Double> doubleList47 = regression16.result(doubleList45);
        double double48 = regression16.mse();
        laccan.cloud.prediction.Regression regression49 = new laccan.cloud.prediction.Regression();
        double double50 = regression49.mse();
        double double51 = regression49.mse();
        java.util.List<laccan.devices.Sample> sampleList52 = null;
        laccan.devices.MicazMsg micazMsg54 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray55 = micazMsg54.get_Buffer();
        java.lang.Object obj56 = micazMsg54.clone();
        laccan.devices.Sample sample57 = new laccan.devices.Sample(micazMsg54);
        laccan.devices.Sample sample58 = new laccan.devices.Sample();
        laccan.devices.Sample sample59 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray60 = new laccan.devices.Sample[] { sample57, sample58, sample59 };
        java.util.ArrayList<laccan.devices.Sample> sampleList61 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList61, sampleArray60);
        java.util.List<java.lang.Double> doubleList63 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList61);
        regression49.init(sampleList52, doubleList63);
        java.util.List<java.lang.Double> doubleList65 = regression16.result(doubleList63);
        java.util.List<java.lang.Double> doubleList66 = regression0.result(doubleList65);
        double double67 = regression0.mse();
        double double68 = regression0.mse();
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double2, Double.NaN, 0);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(sampleArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertEquals((double) double17, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList19);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(sampleArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(doubleList31);
        org.junit.Assert.assertNotNull(doubleList32);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(sampleArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(doubleList45);
        org.junit.Assert.assertNotNull(doubleList46);
        org.junit.Assert.assertNotNull(doubleList47);
        org.junit.Assert.assertEquals((double) double48, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double50, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double51, Double.NaN, 0);
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(sampleArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(doubleList63);
        org.junit.Assert.assertNotNull(doubleList65);
        org.junit.Assert.assertNotNull(doubleList66);
        org.junit.Assert.assertEquals((double) double67, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double68, Double.NaN, 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test136");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(0, 8);
        byte[] byteArray3 = micazMsg2.dataGet();
        try {
            laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test137");
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
        long long15 = sample9.getDate();
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test138");
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
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray19, 0);
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
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test139");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(14, 24);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test140");
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
        try {
            laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray20, (int) (short) 10, 160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 10, data_length 160 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray20);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test141");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        int int5 = micazMsg2.dataLength();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 4);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg9, 0);
        short[] shortArray12 = micazMsg9.get_Buffer();
        micazMsg2.set_Buffer(shortArray12);
        int int14 = micazMsg2.get_Voltage();
        int int15 = micazMsg2.dataLength();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test142");
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
        memory0.build();
        memory0.build();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test143");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 6, 35L, (int) (byte) 0);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test144");
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
        byte[] byteArray14 = micazMsg12.dataGet();
        try {
            laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg12, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 51, data_length 24 and data array size 52");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test145");
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
        laccan.persistence.StorageCSV storageCSV88 = storageCSV86.local("null;97.0;100");
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
        org.junit.Assert.assertNotNull(storageCSV88);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test146");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        memory0.build();
        laccan.memory.Container container4 = memory0.getMemory();
        memory0.build();
        int int6 = memory0.length();
        memory0.build();
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test147");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 2);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray2, (int) '#');
        try {
            laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length -33 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test148");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", 3.0d, (long) 4);
        sample3.setTemperature(0.0d);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test149");
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
        java.lang.String[] strArray15 = laccan.devices.helper.utils.Assistant.environments;
        storageCSV11.save(strArray15);
        laccan.persistence.StorageCSV storageCSV18 = storageCSV11.local("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        laccan.persistence.StorageCSV storageCSV20 = storageCSV18.local("null;-19.699999999999996;35");
        laccan.persistence.StorageCSV storageCSV21 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV23 = storageCSV21.local("hi!");
        laccan.persistence.StorageCSV storageCSV24 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray25 = new java.lang.String[] {};
        storageCSV24.save(strArray25);
        storageCSV21.save(strArray25);
        laccan.persistence.StorageCSV storageCSV29 = storageCSV21.local("nodes");
        laccan.persistence.StorageCSV storageCSV31 = storageCSV21.local("init");
        laccan.persistence.StorageCSV storageCSV33 = storageCSV31.local("reduction;-19.699999999999996;0");
        laccan.persistence.StorageCSV storageCSV35 = storageCSV33.local("full_memory");
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
        sample40.setTemperature((double) (-1L));
        double double51 = sample40.getDateDouble();
        java.lang.String[] strArray52 = sample40.toCSV();
        storageCSV35.save(strArray52);
        storageCSV18.save(strArray52);
        storageCSV0.save(strArray52);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(sampleList12);
        org.junit.Assert.assertNotNull(storageCSV14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(storageCSV18);
        org.junit.Assert.assertNotNull(storageCSV20);
        org.junit.Assert.assertNotNull(storageCSV23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(storageCSV29);
        org.junit.Assert.assertNotNull(storageCSV31);
        org.junit.Assert.assertNotNull(storageCSV33);
        org.junit.Assert.assertNotNull(storageCSV35);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + type42 + "' != '" + laccan.devices.Type.FULL + "'", type42.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "reduction;-19.699999999999996;0" + "'", str46.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(strArray52);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test150");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 65535, (long) 35, 5);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test151");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        micazMsg1.set_NodeID((int) (byte) -1);
        java.lang.String str7 = micazMsg1.toString();
        int int8 = micazMsg1.get_NodeID();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        micazMsg10.setElement_Buffer(0, (short) 10);
        micazMsg10.set_Voltage(0);
        int int17 = micazMsg10.get_NodeID();
        byte[] byteArray18 = micazMsg10.dataGet();
        try {
            micazMsg1.dataSet(byteArray18, 0, 256, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 65535 + "'", int8 == 65535);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test152");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        java.util.List<laccan.devices.Sample> sampleList1 = storageCSV0.read();
        laccan.persistence.StorageCSV storageCSV3 = storageCSV0.local("memory;-1.0;32");
        laccan.persistence.StorageCSV storageCSV5 = storageCSV0.local("");
        java.lang.String[] strArray9 = new java.lang.String[] { "null;-19.648499999999995;0", "lastReading", "reduction" };
        storageCSV5.save(strArray9);
        java.util.List<laccan.devices.Sample> sampleList11 = storageCSV5.read();
        java.util.List<laccan.devices.Sample> sampleList12 = storageCSV5.read();
        java.util.List<java.lang.Double> doubleList13 = laccan.cloud.prediction.Regression.makeTests(sampleList12);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertNotNull(storageCSV3);
        org.junit.Assert.assertNotNull(storageCSV5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(sampleList11);
        org.junit.Assert.assertNotNull(sampleList12);
        org.junit.Assert.assertNotNull(doubleList13);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test153");
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
            short short20 = micazMsg18.getElement_Buffer(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (48) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
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
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test154");
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
        java.lang.String str18 = micazMsg1.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(message13);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str18.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test155");
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
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg1, (long) 172);
        short short21 = micazMsg1.getElement_Buffer(5);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = micazMsg23.get_Buffer();
        java.lang.Object obj25 = micazMsg23.clone();
        java.lang.String str26 = micazMsg23.toString();
        short[] shortArray27 = micazMsg23.get_Buffer();
        byte[] byteArray28 = micazMsg23.dataGet();
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray28, 100);
        micazMsg1.dataSet(byteArray28);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNull(serialPacket15);
        org.junit.Assert.assertNotNull(message17);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str26.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(byteArray28);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test156");
        laccan.devices.helper.utils.Assistant.reducerType = "full_memory;1.0;172";
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test157");
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
        laccan.memory.Container container49 = memory0.getMemory();
        java.util.List<laccan.devices.Sample> sampleList50 = container49.get();
        int int51 = container49.length();
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
        org.junit.Assert.assertNotNull(container49);
        org.junit.Assert.assertNotNull(sampleList50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test158");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        sample4.setTemperature((double) 16);
        double double7 = sample4.getTemperature();
        laccan.devices.Sample sample8 = new laccan.devices.Sample();
        double double9 = sample8.getDateDouble();
        double double10 = sample8.getDateDouble();
        sample8.setTemperature((double) 1);
        double double13 = sample8.getDateDouble();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg15.set_Buffer(shortArray21);
        laccan.devices.Sample sample23 = new laccan.devices.Sample(micazMsg15);
        laccan.devices.Sample sample24 = new laccan.devices.Sample();
        laccan.devices.Type type25 = laccan.devices.Type.FULL;
        sample24.setType(type25);
        sample23.setType(type25);
        double double28 = sample23.getDateDouble();
        double double29 = sample23.getTemperature();
        laccan.devices.Type type30 = sample23.getType();
        sample8.setType(type30);
        sample4.setType(type30);
        sample4.setNode("hi!");
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 16.0d + "'", double7 == 16.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + laccan.devices.Type.FULL + "'", type25.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-19.648499999999995d) + "'", double29 == (-19.648499999999995d));
        org.junit.Assert.assertTrue("'" + type30 + "' != '" + laccan.devices.Type.FULL + "'", type30.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test159");
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
        memory0.build();
        int int33 = memory0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test160");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = micazMsg7.get_Buffer();
        java.lang.Object obj9 = micazMsg7.clone();
        micazMsg7.set_NodeID(20);
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray14);
        micazMsg7.dataSet(byteArray14);
        short short18 = micazMsg7.getElement_Buffer(0);
        net.tinyos.message.Message message20 = micazMsg7.clone((int) (byte) 100);
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(message20, 10);
        byte[] byteArray23 = micazMsg22.dataGet();
        micazMsg1.dataSet(byteArray23);
        micazMsg1.amTypeSet(172);
        int int27 = micazMsg1.amType();
        int int28 = micazMsg1.baseOffset();
        int int29 = micazMsg1.dataLength();
        micazMsg1.amTypeSet(112);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
        org.junit.Assert.assertNotNull(message20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 172 + "'", int27 == 172);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test161");
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
        try {
            laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg(byteArray27, 8, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 8, data_length 20 and data array size 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str18.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(byteArray27);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test162");
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
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = micazMsg20.get_Buffer();
        java.lang.Object obj22 = micazMsg20.clone();
        micazMsg20.set_NodeID(20);
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray27);
        micazMsg20.dataSet(byteArray27);
        short short31 = micazMsg20.getElement_Buffer(0);
        net.tinyos.message.Message message33 = micazMsg20.clone((int) (byte) 100);
        net.tinyos.message.SerialPacket serialPacket34 = micazMsg20.getSerialPacket();
        java.lang.String str35 = micazMsg20.toString();
        net.tinyos.message.Message message37 = micazMsg20.clone(6);
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg20, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str16.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 0 + "'", short31 == (short) 0);
        org.junit.Assert.assertNotNull(message33);
        org.junit.Assert.assertNull(serialPacket34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str35.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(message37);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test163");
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
        java.lang.String[] strArray15 = sample12.toCSV();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test164");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        java.lang.String str7 = micazMsg1.toString();
        micazMsg1.amTypeSet(16);
        net.tinyos.message.Message message11 = micazMsg1.clone(65);
        int int12 = micazMsg1.amType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(message11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test165");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (-139), (long) 51, 96);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test166");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.Container container3 = memory0.getMemory();
        java.util.List<laccan.devices.Sample> sampleList4 = container3.get();
        int int5 = container3.length();
        java.util.List<laccan.devices.Sample> sampleList6 = container3.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(sampleList6);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test167");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        net.tinyos.message.Message message9 = micazMsg7.clone(52);
        micazMsg7.set_Voltage((int) '4');
        java.lang.Class<?> wildcardClass12 = micazMsg7.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test168");
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
        java.lang.String[] strArray38 = sample34.toCSV();
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
        org.junit.Assert.assertNotNull(strArray38);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test169");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 1);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        micazMsg6.init(48);
        short[] shortArray9 = micazMsg6.get_Buffer();
        net.tinyos.message.SerialPacket serialPacket10 = micazMsg6.getSerialPacket();
        java.lang.Object obj11 = micazMsg6.clone();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNull(serialPacket10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test170");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        int int3 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList4 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList5 = keepingAll0.get();
        laccan.devices.Sample sample6 = null;
        keepingAll0.add(sample6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(sampleList5);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test171");
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
        long long13 = sample4.getDate();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg15);
        long long19 = sample18.getDate();
        laccan.devices.Type type20 = laccan.devices.Type.FULL;
        sample18.setType(type20);
        sample18.setNode("reduction");
        java.lang.Class<?> wildcardClass24 = sample18.getClass();
        laccan.devices.Type type25 = sample18.getType();
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray28 = micazMsg27.get_Buffer();
        java.lang.Object obj29 = micazMsg27.clone();
        laccan.devices.Sample sample30 = new laccan.devices.Sample(micazMsg27);
        long long31 = sample30.getDate();
        laccan.devices.Type type32 = laccan.devices.Type.FULL;
        sample30.setType(type32);
        sample30.setNode("reduction");
        laccan.devices.Type type36 = sample30.getType();
        sample18.setType(type36);
        sample4.setType(type36);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null;-19.699999999999996;0" + "'", str9.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null;-19.699999999999996;0" + "'", str10.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + laccan.devices.Type.FULL + "'", type20.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + laccan.devices.Type.FULL + "'", type25.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + type32 + "' != '" + laccan.devices.Type.FULL + "'", type32.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type36 + "' != '" + laccan.devices.Type.FULL + "'", type36.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test172");
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
        laccan.memory.Memory memory61 = new laccan.memory.Memory();
        laccan.memory.Container container62 = memory61.getMemory();
        laccan.memory.Container container63 = memory61.getMemory();
        memory61.build();
        int int65 = memory61.length();
        laccan.memory.Container container66 = memory61.getMemory();
        java.util.List<laccan.devices.Sample> sampleList67 = container66.get();
        laccan.memory.data.reduction.KeepingAll keepingAll68 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList69 = keepingAll68.get();
        int int70 = keepingAll68.length();
        java.util.List<laccan.devices.Sample> sampleList71 = keepingAll68.get();
        java.util.List<laccan.devices.Sample> sampleList72 = keepingAll68.get();
        java.util.List<java.lang.Double> doubleList73 = laccan.cloud.prediction.Regression.makeTests(sampleList72);
        regression0.init(sampleList67, doubleList73);
        regression0.train();
        laccan.memory.data.reduction.KeepingAll keepingAll76 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample77 = new laccan.devices.Sample();
        keepingAll76.add(sample77);
        int int79 = keepingAll76.length();
        int int80 = keepingAll76.length();
        java.util.List<laccan.devices.Sample> sampleList81 = keepingAll76.get();
        laccan.cloud.prediction.Regression regression82 = new laccan.cloud.prediction.Regression();
        double double83 = regression82.mse();
        double double84 = regression82.mse();
        java.util.List<laccan.devices.Sample> sampleList85 = null;
        laccan.devices.MicazMsg micazMsg87 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray88 = micazMsg87.get_Buffer();
        java.lang.Object obj89 = micazMsg87.clone();
        laccan.devices.Sample sample90 = new laccan.devices.Sample(micazMsg87);
        laccan.devices.Sample sample91 = new laccan.devices.Sample();
        laccan.devices.Sample sample92 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray93 = new laccan.devices.Sample[] { sample90, sample91, sample92 };
        java.util.ArrayList<laccan.devices.Sample> sampleList94 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList94, sampleArray93);
        java.util.List<java.lang.Double> doubleList96 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList94);
        regression82.init(sampleList85, doubleList96);
        java.util.List<java.lang.Double> doubleList98 = regression82.result();
        regression0.init(sampleList81, doubleList98);
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
        org.junit.Assert.assertNull(container62);
        org.junit.Assert.assertNull(container63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(container66);
        org.junit.Assert.assertNotNull(sampleList67);
        org.junit.Assert.assertNotNull(sampleList69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(sampleList71);
        org.junit.Assert.assertNotNull(sampleList72);
        org.junit.Assert.assertNotNull(doubleList73);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(sampleList81);
        org.junit.Assert.assertEquals((double) double83, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double84, Double.NaN, 0);
        org.junit.Assert.assertNotNull(shortArray88);
        org.junit.Assert.assertNotNull(obj89);
        org.junit.Assert.assertNotNull(sampleArray93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(doubleList96);
        org.junit.Assert.assertNotNull(doubleList98);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test173");
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
        laccan.devices.Sample sample18 = new laccan.devices.Sample("full_memory", (double) (short) 1, (long) 172);
        laccan.devices.Type type19 = sample18.getType();
        sample18.setNode("null;0.0;512");
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
        laccan.devices.MicazMsg micazMsg39 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray40 = micazMsg39.get_Buffer();
        java.lang.Object obj41 = micazMsg39.clone();
        laccan.devices.Sample sample42 = new laccan.devices.Sample(micazMsg39);
        laccan.devices.Type type43 = null;
        sample42.setType(type43);
        java.lang.String str45 = sample42.toString();
        java.lang.String str46 = sample42.getNode();
        keepingAll22.add(sample42);
        laccan.devices.Sample sample48 = new laccan.devices.Sample();
        laccan.devices.Type type49 = laccan.devices.Type.FULL;
        sample48.setType(type49);
        sample42.setType(type49);
        double double52 = sample42.getTemperature();
        sample42.setDate((long) (byte) 10);
        java.lang.String[] strArray55 = sample42.toCSV();
        laccan.devices.Type type56 = sample42.getType();
        sample18.setType(type56);
        sample4.setType(type56);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(type19);
        org.junit.Assert.assertNotNull(sampleList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(sampleList25);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "null;-19.699999999999996;0" + "'", str45.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + type49 + "' != '" + laccan.devices.Type.FULL + "'", type49.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-19.699999999999996d) + "'", double52 == (-19.699999999999996d));
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + type56 + "' != '" + laccan.devices.Type.FULL + "'", type56.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test174");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) ' ');
        int int12 = micazMsg1.get_NodeID();
        micazMsg1.set_NodeID(100);
        int int15 = micazMsg1.baseOffset();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test175");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        short short5 = micazMsg1.getElement_Buffer((int) (short) 0);
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1, (long) (short) 0);
        java.lang.Object obj8 = micazMsg1.clone();
        int int9 = micazMsg1.baseOffset();
        int int10 = micazMsg1.get_Voltage();
        int int11 = micazMsg1.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test176");
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
        net.tinyos.message.Message message25 = micazMsg21.clone(0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(message25);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test177");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer(65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test178");
        laccan.devices.helper.utils.Assistant.reducerType = "Message <MicazMsg> \n  [NodeID=0x10a]\n  [Voltage=0x64]\n  [Buffer=";
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test179");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        short short5 = micazMsg1.getElement_Buffer((int) (short) 0);
        byte[] byteArray6 = micazMsg1.dataGet();
        byte[] byteArray7 = micazMsg1.dataGet();
        micazMsg1.amTypeSet(64);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test180");
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
        micazMsg1.set_Voltage(512);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test181");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        int int8 = micazMsg1.get_NodeID();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (short) 1);
        int int11 = micazMsg10.get_NodeID();
        java.lang.String str12 = micazMsg10.toString();
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = micazMsg14.get_Buffer();
        java.lang.Object obj16 = micazMsg14.clone();
        micazMsg14.amTypeSet(20);
        int int19 = micazMsg14.baseOffset();
        byte[] byteArray20 = micazMsg14.dataGet();
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray20);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray20, (int) (short) -1);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray20, 1);
        micazMsg10.dataSet(byteArray20);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa00 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa00 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test182");
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
        java.util.List<laccan.devices.Sample> sampleList14 = storageCSV13.read();
        laccan.persistence.StorageCSV storageCSV16 = storageCSV13.local("null;-19.699999999999996;100");
        laccan.persistence.StorageCSV storageCSV18 = storageCSV16.local("Message <MicazMsg> \n  [Buffer=");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(sampleList9);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(sampleList14);
        org.junit.Assert.assertNotNull(storageCSV16);
        org.junit.Assert.assertNotNull(storageCSV18);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test183");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        java.util.List<laccan.devices.Sample> sampleList6 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV8 = storageCSV4.local("");
        laccan.persistence.StorageCSV storageCSV10 = storageCSV8.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg12);
        long long16 = sample15.getDate();
        laccan.devices.Type type17 = laccan.devices.Type.FULL;
        sample15.setType(type17);
        sample15.setNode("reduction");
        java.lang.String[] strArray21 = sample15.toCSV();
        storageCSV8.save(strArray21);
        laccan.memory.data.reduction.KeepingAll keepingAll23 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList24 = keepingAll23.get();
        int int25 = keepingAll23.length();
        int int26 = keepingAll23.length();
        java.util.List<laccan.devices.Sample> sampleList27 = keepingAll23.get();
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray35 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg29.set_Buffer(shortArray35);
        laccan.devices.Sample sample37 = new laccan.devices.Sample(micazMsg29);
        java.lang.String[] strArray38 = sample37.toCSV();
        java.lang.String str39 = sample37.getNode();
        keepingAll23.add(sample37);
        java.lang.String[] strArray41 = sample37.toCSV();
        storageCSV8.save(strArray41);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + type17 + "' != '" + laccan.devices.Type.FULL + "'", type17.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(sampleList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(sampleList27);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(strArray41);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test184");
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
        int int17 = keepingAll0.length();
        int int18 = keepingAll0.length();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test185");
        laccan.devices.helper.utils.Assistant.reducerType = "memory";
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test186");
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
        laccan.devices.Sample sample56 = new laccan.devices.Sample("full_memory", (double) (short) 1, (long) 172);
        laccan.devices.Type type57 = sample56.getType();
        sample56.setDate((long) (short) 0);
        keepingAll0.add(sample56);
        java.util.List<laccan.devices.Sample> sampleList61 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList62 = keepingAll0.get();
        laccan.memory.data.reduction.KeepingAll keepingAll63 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg65 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray66 = micazMsg65.get_Buffer();
        java.lang.Object obj67 = micazMsg65.clone();
        laccan.devices.Sample sample68 = new laccan.devices.Sample(micazMsg65);
        laccan.devices.Type type69 = null;
        sample68.setType(type69);
        keepingAll63.add(sample68);
        double double72 = sample68.getDateDouble();
        laccan.memory.Memory memory73 = new laccan.memory.Memory();
        laccan.memory.Container container74 = memory73.getMemory();
        laccan.memory.Container container75 = memory73.getMemory();
        memory73.build();
        memory73.build();
        int int78 = memory73.length();
        laccan.devices.MicazMsg micazMsg80 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray86 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg80.set_Buffer(shortArray86);
        laccan.devices.Sample sample88 = new laccan.devices.Sample(micazMsg80);
        laccan.devices.Sample sample89 = new laccan.devices.Sample();
        laccan.devices.Type type90 = laccan.devices.Type.FULL;
        sample89.setType(type90);
        sample88.setType(type90);
        sample88.setTemperature((double) 'a');
        java.lang.Class<?> wildcardClass95 = sample88.getClass();
        memory73.add(sample88);
        laccan.devices.Type type97 = sample88.getType();
        sample68.setType(type97);
        keepingAll0.add(sample68);
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
        org.junit.Assert.assertNull(type57);
        org.junit.Assert.assertNotNull(sampleList61);
        org.junit.Assert.assertNotNull(sampleList62);
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertNull(container74);
        org.junit.Assert.assertNull(container75);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(shortArray86);
        org.junit.Assert.assertTrue("'" + type90 + "' != '" + laccan.devices.Type.FULL + "'", type90.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass95);
        org.junit.Assert.assertTrue("'" + type97 + "' != '" + laccan.devices.Type.FULL + "'", type97.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test187");
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
        java.lang.String[] strArray66 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV60.save(strArray66);
        laccan.persistence.StorageCSV storageCSV69 = storageCSV60.local("");
        laccan.persistence.StorageCSV storageCSV70 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV72 = storageCSV70.local("hi!");
        laccan.persistence.StorageCSV storageCSV74 = storageCSV72.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList75 = storageCSV74.read();
        java.util.List<laccan.devices.Sample> sampleList76 = storageCSV74.read();
        laccan.persistence.StorageCSV storageCSV78 = storageCSV74.local("");
        laccan.persistence.StorageCSV storageCSV80 = storageCSV78.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        laccan.devices.MicazMsg micazMsg82 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray83 = micazMsg82.get_Buffer();
        laccan.devices.Sample sample84 = new laccan.devices.Sample(micazMsg82);
        laccan.devices.Sample sample86 = new laccan.devices.Sample(micazMsg82, (long) (short) 10);
        double double87 = sample86.getDateDouble();
        java.lang.String[] strArray88 = sample86.toCSV();
        storageCSV78.save(strArray88);
        storageCSV60.save(strArray88);
        storageCSV10.save(strArray88);
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
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(storageCSV69);
        org.junit.Assert.assertNotNull(storageCSV72);
        org.junit.Assert.assertNotNull(storageCSV74);
        org.junit.Assert.assertNotNull(sampleList75);
        org.junit.Assert.assertNotNull(sampleList76);
        org.junit.Assert.assertNotNull(storageCSV78);
        org.junit.Assert.assertNotNull(storageCSV80);
        org.junit.Assert.assertNotNull(shortArray83);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 10.0d + "'", double87 == 10.0d);
        org.junit.Assert.assertNotNull(strArray88);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test188");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test189");
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
        micazMsg24.amTypeSet(14);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(serialPacket26);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test190");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory;-19.699999999999996;-1;10.0;-1", 0.0d, (long) 512);
        sample3.setTemperature((double) 65535);
        double double6 = sample3.getTemperature();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 65535.0d + "'", double6 == 65535.0d);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test191");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.699999999999996;1", (double) 6, (long) 35);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test192");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 100);
        micazMsg1.set_NodeID((int) 'a');
        int int13 = micazMsg1.get_NodeID();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test193");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(256, 96);
        try {
            micazMsg2.setElement_Buffer((int) ' ', (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test194");
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
        laccan.memory.data.reduction.KeepingAll keepingAll27 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList28 = keepingAll27.get();
        int int29 = keepingAll27.length();
        java.util.List<laccan.devices.Sample> sampleList30 = keepingAll27.get();
        java.util.List<laccan.devices.Sample> sampleList31 = keepingAll27.get();
        laccan.memory.data.reduction.KeepingAll keepingAll32 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList33 = keepingAll32.get();
        int int34 = keepingAll32.length();
        java.util.List<laccan.devices.Sample> sampleList35 = keepingAll32.get();
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray38 = micazMsg37.get_Buffer();
        java.lang.Object obj39 = micazMsg37.clone();
        laccan.devices.Sample sample40 = new laccan.devices.Sample(micazMsg37);
        laccan.devices.Type type41 = null;
        sample40.setType(type41);
        laccan.devices.Type type43 = null;
        sample40.setType(type43);
        sample40.setNode("hi!");
        keepingAll32.add(sample40);
        keepingAll27.add(sample40);
        keepingAll0.add(sample40);
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
        org.junit.Assert.assertNotNull(sampleList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(sampleList30);
        org.junit.Assert.assertNotNull(sampleList31);
        org.junit.Assert.assertNotNull(sampleList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(sampleList35);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(obj39);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test195");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 100);
        long long11 = sample10.getDate();
        double double12 = sample10.getDateDouble();
        java.lang.String str13 = sample10.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null;-19.699999999999996;100" + "'", str13.equals("null;-19.699999999999996;100"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test196");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg(byteArray2, 16);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test197");
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
        double double14 = sample9.getDateDouble();
        java.lang.String str15 = sample9.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null;-19.699999999999996;0" + "'", str12.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null;-19.699999999999996;0" + "'", str15.equals("null;-19.699999999999996;0"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test198");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.699999999999996;0;-19.699999999999996;0", (double) (byte) 10, (long) '4');
        sample3.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;3.0;3");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test199");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, (long) 0);
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg2, (long) (byte) 10);
        sample7.setDate(1L);
        double double10 = sample7.getDateDouble();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test200");
        int int1 = laccan.devices.MicazMsg.offset_Buffer((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test201");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) (byte) 100);
        micazMsg1.amTypeSet(2);
        java.lang.Object obj9 = micazMsg1.clone();
        int int10 = micazMsg1.get_Voltage();
        micazMsg1.amTypeSet((-139));
        micazMsg1.amTypeSet(16);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test202");
        laccan.devices.Sample sample0 = new laccan.devices.Sample();
        double double1 = sample0.getDateDouble();
        java.lang.String str2 = sample0.getNode();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test203");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList4 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList5 = keepingAll0.get();
        java.util.List<laccan.devices.Sample> sampleList6 = keepingAll0.get();
        int int7 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        java.lang.Object obj11 = micazMsg9.clone();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg9);
        laccan.devices.Type type13 = null;
        sample12.setType(type13);
        laccan.devices.Type type15 = null;
        sample12.setType(type15);
        sample12.setNode("hi!");
        keepingAll0.add(sample12);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test204");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(6, 14);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test205");
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
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray26 = micazMsg25.get_Buffer();
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg25);
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg25, (long) (short) 10);
        double double30 = sample29.getDateDouble();
        laccan.devices.Type type31 = sample29.getType();
        memory0.add(sample29);
        java.lang.String str33 = sample29.getNode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNull(type31);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test206");
        laccan.devices.helper.utils.Assistant.reducerType = "null;97.0;100";
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test207");
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
        laccan.memory.Memory memory36 = new laccan.memory.Memory();
        laccan.memory.Container container37 = memory36.getMemory();
        laccan.memory.Container container38 = memory36.getMemory();
        memory36.build();
        laccan.memory.Container container40 = memory36.getMemory();
        memory36.build();
        int int42 = memory36.length();
        laccan.memory.data.reduction.KeepingAll keepingAll43 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList44 = keepingAll43.get();
        int int45 = keepingAll43.length();
        int int46 = keepingAll43.length();
        java.util.List<laccan.devices.Sample> sampleList47 = keepingAll43.get();
        laccan.devices.MicazMsg micazMsg49 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray55 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg49.set_Buffer(shortArray55);
        laccan.devices.Sample sample57 = new laccan.devices.Sample(micazMsg49);
        java.lang.String[] strArray58 = sample57.toCSV();
        java.lang.String str59 = sample57.getNode();
        keepingAll43.add(sample57);
        java.lang.String[] strArray61 = sample57.toCSV();
        memory36.add(sample57);
        keepingAll0.add(sample57);
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
        org.junit.Assert.assertNull(container37);
        org.junit.Assert.assertNull(container38);
        org.junit.Assert.assertNotNull(container40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(sampleList44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(sampleList47);
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(strArray61);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test208");
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
        laccan.devices.MicazMsg micazMsg39 = new laccan.devices.MicazMsg(byteArray36, (int) (byte) -1);
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
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test209");
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
        java.util.List<laccan.devices.Sample> sampleList29 = container28.get();
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
        org.junit.Assert.assertNotNull(sampleList29);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test210");
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
        java.lang.String str12 = sample4.getNode();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "reduction;-19.699999999999996;0" + "'", str10.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "reduction" + "'", str11.equals("reduction"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "reduction" + "'", str12.equals("reduction"));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test211");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        micazMsg6.amTypeSet(20);
        int int11 = micazMsg6.baseOffset();
        byte[] byteArray12 = micazMsg6.dataGet();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray12);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray12);
        int int16 = micazMsg15.get_Voltage();
        byte[] byteArray17 = micazMsg15.dataGet();
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray17, 12);
        try {
            micazMsg1.dataSet(byteArray17, (int) (byte) 1, 48, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test212");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 10, (int) (short) -1);
        try {
            int int3 = micazMsg2.get_NodeID();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test213");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        java.lang.String str13 = micazMsg12.toString();
        try {
            laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer="));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test214");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray8, 0);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray8, 10);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray8);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test215");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4', 0);
        int int3 = micazMsg2.get_Voltage();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test216");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        int int2 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList3 = keepingAll0.get();
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
        keepingAll0.add(sample13);
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = micazMsg23.get_Buffer();
        micazMsg23.set_NodeID((int) (byte) -1);
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg23, (long) 'a');
        keepingAll0.add(sample28);
        laccan.memory.data.reduction.KeepingAll keepingAll30 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList31 = keepingAll30.get();
        int int32 = keepingAll30.length();
        java.util.List<laccan.devices.Sample> sampleList33 = keepingAll30.get();
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray36 = micazMsg35.get_Buffer();
        java.lang.Object obj37 = micazMsg35.clone();
        laccan.devices.Sample sample38 = new laccan.devices.Sample(micazMsg35);
        laccan.devices.Type type39 = null;
        sample38.setType(type39);
        laccan.devices.Type type41 = null;
        sample38.setType(type41);
        sample38.setNode("hi!");
        keepingAll30.add(sample38);
        laccan.devices.MicazMsg micazMsg47 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray48 = micazMsg47.get_Buffer();
        java.lang.Object obj49 = micazMsg47.clone();
        laccan.devices.Sample sample50 = new laccan.devices.Sample(micazMsg47);
        laccan.devices.Type type51 = null;
        sample50.setType(type51);
        java.lang.String str53 = sample50.toString();
        java.lang.String str54 = sample50.getNode();
        keepingAll30.add(sample50);
        laccan.devices.Sample sample56 = new laccan.devices.Sample();
        laccan.devices.Type type57 = laccan.devices.Type.FULL;
        sample56.setType(type57);
        sample50.setType(type57);
        double double60 = sample50.getTemperature();
        sample50.setNode("");
        keepingAll0.add(sample50);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + laccan.devices.Type.FULL + "'", type15.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + laccan.devices.Type.FULL + "'", type20.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(sampleList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(sampleList33);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "null;-19.699999999999996;0" + "'", str53.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + type57 + "' != '" + laccan.devices.Type.FULL + "'", type57.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-19.699999999999996d) + "'", double60 == (-19.699999999999996d));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test217");
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
        sample20.setDate((long) 48);
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
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test218");
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
        try {
            laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 15, data_length 24 and data array size 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test219");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        double double7 = sample6.getTemperature();
        double double8 = sample6.getTemperature();
        sample6.setDate((long) '4');
        double double11 = sample6.getTemperature();
        laccan.devices.Type type12 = sample6.getType();
        double double13 = sample6.getTemperature();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-19.699999999999996d) + "'", double7 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-19.699999999999996d) + "'", double8 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-19.699999999999996d) + "'", double11 == (-19.699999999999996d));
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-19.699999999999996d) + "'", double13 == (-19.699999999999996d));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test220");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        short short5 = micazMsg1.getElement_Buffer((int) (short) 0);
        short[] shortArray6 = micazMsg1.get_Buffer();
        java.lang.Class<?> wildcardClass7 = micazMsg1.getClass();
        short short9 = micazMsg1.getElement_Buffer(2);
        micazMsg1.amTypeSet((int) (byte) 10);
        try {
            laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 65, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test221");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;10.0;35", (double) 32L, (long) 172);
        sample3.setNode("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        sample3.setTemperature((double) 512);
        double double8 = sample3.getDateDouble();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 172.0d + "'", double8 == 172.0d);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test222");
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
        try {
            micazMsg1.setElement_Buffer(48, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test223");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("full_memory", (double) (short) 1, (long) 172);
        laccan.devices.Type type4 = sample3.getType();
        sample3.setNode("null;0.0;512");
        double double7 = sample3.getTemperature();
        double double8 = sample3.getTemperature();
        double double9 = sample3.getTemperature();
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test224");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        int int9 = micazMsg1.get_Voltage();
        micazMsg1.amTypeSet((int) '#');
        micazMsg1.set_Voltage(10);
        try {
            laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 65535, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test225");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        java.lang.String str4 = micazMsg1.toString();
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1, (long) (byte) 100);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test226");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) ' ');
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1, 35L);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5);
        laccan.devices.Type type9 = null;
        sample8.setType(type9);
        laccan.devices.Type type11 = null;
        sample8.setType(type11);
        sample8.setNode("hi!");
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray22 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg16.set_Buffer(shortArray22);
        laccan.devices.Sample sample24 = new laccan.devices.Sample(micazMsg16);
        laccan.devices.Sample sample25 = new laccan.devices.Sample();
        laccan.devices.Type type26 = laccan.devices.Type.FULL;
        sample25.setType(type26);
        sample24.setType(type26);
        sample8.setType(type26);
        sample3.setType(type26);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertTrue("'" + type26 + "' != '" + laccan.devices.Type.FULL + "'", type26.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test227");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        net.tinyos.message.Message message14 = micazMsg1.clone(24);
        micazMsg1.amTypeSet(0);
        int int17 = micazMsg1.dataLength();
        try {
            laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (128) or length (16), for data_length 16 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test228");
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
        int int22 = micazMsg18.baseOffset();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(message21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test229");
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
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 4, 5);
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
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test230");
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
        laccan.devices.Sample sample98 = new laccan.devices.Sample("memory;-19.699999999999996;-1;32.0;32", (double) (short) -1, 52L);
        keepingAll0.add(sample98);
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
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test231");
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
        laccan.memory.data.reduction.KeepingAll keepingAll34 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList35 = keepingAll34.get();
        int int36 = keepingAll34.length();
        java.util.List<laccan.devices.Sample> sampleList37 = keepingAll34.get();
        laccan.devices.MicazMsg micazMsg39 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray40 = micazMsg39.get_Buffer();
        java.lang.Object obj41 = micazMsg39.clone();
        laccan.devices.Sample sample42 = new laccan.devices.Sample(micazMsg39);
        laccan.devices.Type type43 = null;
        sample42.setType(type43);
        laccan.devices.Type type45 = null;
        sample42.setType(type45);
        sample42.setNode("hi!");
        keepingAll34.add(sample42);
        laccan.devices.MicazMsg micazMsg51 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray52 = micazMsg51.get_Buffer();
        java.lang.Object obj53 = micazMsg51.clone();
        laccan.devices.Sample sample54 = new laccan.devices.Sample(micazMsg51);
        laccan.devices.Type type55 = null;
        sample54.setType(type55);
        java.lang.String str57 = sample54.toString();
        java.lang.String str58 = sample54.getNode();
        keepingAll34.add(sample54);
        laccan.devices.Sample sample60 = new laccan.devices.Sample();
        laccan.devices.Type type61 = laccan.devices.Type.FULL;
        sample60.setType(type61);
        sample54.setType(type61);
        java.lang.String str64 = sample54.toString();
        java.lang.String str65 = sample54.getNode();
        sample54.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        memory0.add(sample54);
        sample54.setTemperature((-1.0d));
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
        org.junit.Assert.assertNotNull(sampleList35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(sampleList37);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "null;-19.699999999999996;0" + "'", str57.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + type61 + "' != '" + laccan.devices.Type.FULL + "'", type61.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "null;-19.699999999999996;0" + "'", str64.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str65);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test232");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        micazMsg1.amTypeSet(0);
        java.lang.Class<?> wildcardClass10 = micazMsg1.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test233");
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
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg(byteArray25, 32);
        laccan.devices.MicazMsg micazMsg39 = new laccan.devices.MicazMsg(byteArray25, (int) (byte) 10);
        laccan.devices.MicazMsg micazMsg40 = new laccan.devices.MicazMsg(byteArray25);
        try {
            laccan.devices.MicazMsg micazMsg43 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg40, 172, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 172, data_length 6 and data array size 2");
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
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test234");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        micazMsg1.set_Voltage(20);
        micazMsg1.setElement_Buffer((int) (byte) 1, (short) (byte) 100);
        micazMsg1.setElement_Buffer(0, (short) -1);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(32, 160);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray22 = micazMsg21.get_Buffer();
        java.lang.Object obj23 = micazMsg21.clone();
        micazMsg21.set_NodeID(20);
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg(byteArray28);
        micazMsg21.dataSet(byteArray28);
        int int31 = micazMsg21.dataLength();
        java.lang.Object obj32 = micazMsg21.clone();
        short[] shortArray33 = micazMsg21.get_Buffer();
        micazMsg19.set_Buffer(shortArray33);
        micazMsg1.set_Buffer(shortArray33);
        laccan.devices.Sample sample36 = new laccan.devices.Sample(micazMsg1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(shortArray33);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test235");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(52, 0);
        micazMsg2.setElement_Buffer(3, (short) (byte) 100);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test236");
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
        micazMsg1.set_Voltage(3);
        net.tinyos.message.Message message20 = micazMsg1.clone(0);
        java.lang.Object obj21 = message20.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(message20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test237");
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
        micazMsg1.amTypeSet(160);
        micazMsg1.set_Voltage(0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test238");
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
        laccan.persistence.StorageCSV storageCSV25 = storageCSV10.local("nodes");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV12);
        org.junit.Assert.assertNotNull(storageCSV14);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(storageCSV25);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test239");
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
        micazMsg1.set_NodeID((int) ' ');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str18.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(byteArray27);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test240");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        java.lang.Object obj10 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        short short13 = micazMsg1.getElement_Buffer(3);
        net.tinyos.message.Message message15 = micazMsg1.clone(24);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertNotNull(message15);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test241");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) (short) 100);
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        micazMsg3.set_Voltage((int) '#');
        java.lang.String str6 = micazMsg3.toString();
        micazMsg3.amTypeSet((int) ' ');
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        int int13 = micazMsg10.get_NodeID();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray16);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray16, 2);
        micazMsg10.dataSet(byteArray16);
        int int21 = micazMsg10.baseOffset();
        byte[] byteArray22 = micazMsg10.dataGet();
        micazMsg3.dataSet(byteArray22);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray22);
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg24, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str6.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test242");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("memory");
        java.lang.String[] strArray8 = laccan.devices.helper.utils.Assistant.environments;
        storageCSV4.save(strArray8);
        java.util.List<laccan.devices.Sample> sampleList10 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV12 = storageCSV4.local("result");
        java.util.List<laccan.devices.Sample> sampleList13 = storageCSV12.read();
        laccan.devices.Sample sample17 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) 0.0f, (long) (short) 1);
        java.lang.String[] strArray18 = sample17.toCSV();
        storageCSV12.save(strArray18);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(sampleList10);
        org.junit.Assert.assertNotNull(storageCSV12);
        org.junit.Assert.assertNotNull(sampleList13);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test243");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 100);
        java.lang.String str11 = sample10.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null;-19.699999999999996;100" + "'", str11.equals("null;-19.699999999999996;100"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test244");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        int int13 = micazMsg1.get_Voltage();
        micazMsg1.init(52);
        net.tinyos.message.Message message17 = micazMsg1.clone(128);
        try {
            short short19 = micazMsg1.getElement_Buffer((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(message17);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test245");
        net.tinyos.message.Message message0 = null;
        try {
            laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(message0, (int) (short) 1, 160);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test246");
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
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray17, (int) (short) 1);
        micazMsg26.set_NodeID(100);
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
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test247");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(5, (-30));
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test248");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1);
        laccan.memory.data.reduction.KeepingAll keepingAll11 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList12 = keepingAll11.get();
        int int13 = keepingAll11.length();
        java.util.List<laccan.devices.Sample> sampleList14 = keepingAll11.get();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = micazMsg16.get_Buffer();
        java.lang.Object obj18 = micazMsg16.clone();
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg16);
        laccan.devices.Type type20 = null;
        sample19.setType(type20);
        laccan.devices.Type type22 = null;
        sample19.setType(type22);
        sample19.setNode("hi!");
        keepingAll11.add(sample19);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray29 = micazMsg28.get_Buffer();
        java.lang.Object obj30 = micazMsg28.clone();
        laccan.devices.Sample sample31 = new laccan.devices.Sample(micazMsg28);
        laccan.devices.Type type32 = null;
        sample31.setType(type32);
        java.lang.String str34 = sample31.toString();
        java.lang.String str35 = sample31.getNode();
        keepingAll11.add(sample31);
        laccan.devices.Sample sample37 = new laccan.devices.Sample();
        laccan.devices.Type type38 = laccan.devices.Type.FULL;
        sample37.setType(type38);
        sample31.setType(type38);
        double double41 = sample31.getTemperature();
        sample31.setNode("");
        sample31.setDate((long) 52);
        laccan.memory.data.reduction.KeepingAll keepingAll46 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg48 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray49 = micazMsg48.get_Buffer();
        java.lang.Object obj50 = micazMsg48.clone();
        laccan.devices.Sample sample51 = new laccan.devices.Sample(micazMsg48);
        laccan.devices.Type type52 = null;
        sample51.setType(type52);
        keepingAll46.add(sample51);
        double double55 = sample51.getDateDouble();
        laccan.memory.Memory memory56 = new laccan.memory.Memory();
        laccan.memory.Container container57 = memory56.getMemory();
        laccan.memory.Container container58 = memory56.getMemory();
        memory56.build();
        memory56.build();
        int int61 = memory56.length();
        laccan.devices.MicazMsg micazMsg63 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray69 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg63.set_Buffer(shortArray69);
        laccan.devices.Sample sample71 = new laccan.devices.Sample(micazMsg63);
        laccan.devices.Sample sample72 = new laccan.devices.Sample();
        laccan.devices.Type type73 = laccan.devices.Type.FULL;
        sample72.setType(type73);
        sample71.setType(type73);
        sample71.setTemperature((double) 'a');
        java.lang.Class<?> wildcardClass78 = sample71.getClass();
        memory56.add(sample71);
        laccan.devices.Type type80 = sample71.getType();
        sample51.setType(type80);
        sample31.setType(type80);
        sample10.setType(type80);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(sampleList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(sampleList14);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "null;-19.699999999999996;0" + "'", str34.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + type38 + "' != '" + laccan.devices.Type.FULL + "'", type38.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-19.699999999999996d) + "'", double41 == (-19.699999999999996d));
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNull(container57);
        org.junit.Assert.assertNull(container58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertTrue("'" + type73 + "' != '" + laccan.devices.Type.FULL + "'", type73.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertTrue("'" + type80 + "' != '" + laccan.devices.Type.FULL + "'", type80.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test249");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) (short) 1);
        try {
            micazMsg1.set_NodeID(96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (0) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test250");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory", (double) (byte) -1, (long) ' ');
        java.lang.String str4 = sample3.toString();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg6);
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg6, (long) (short) 10);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg12.set_Buffer(shortArray18);
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg12);
        laccan.devices.Sample sample21 = new laccan.devices.Sample();
        laccan.devices.Type type22 = laccan.devices.Type.FULL;
        sample21.setType(type22);
        sample20.setType(type22);
        sample10.setType(type22);
        sample3.setType(type22);
        long long27 = sample3.getDate();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "memory;-1.0;32" + "'", str4.equals("memory;-1.0;32"));
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + laccan.devices.Type.FULL + "'", type22.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test251");
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
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg(byteArray29);
        micazMsg11.dataSet(byteArray29);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 0 + "'", short24 == (short) 0);
        org.junit.Assert.assertNotNull(message26);
        org.junit.Assert.assertNotNull(byteArray29);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test252");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        byte[] byteArray7 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, (int) (short) -1);
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg10, 1L);
        long long13 = sample12.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test253");
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
        double double95 = regression0.mse();
        double double96 = regression0.mse();
        java.util.List<java.lang.Double> doubleList97 = regression0.result();
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
        org.junit.Assert.assertEquals((double) double95, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double96, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList97);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test254");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        java.lang.String str15 = micazMsg12.toString();
        short[] shortArray16 = micazMsg12.get_Buffer();
        byte[] byteArray17 = micazMsg12.dataGet();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray17);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray17, 32, 10);
        micazMsg1.dataSet(byteArray17);
        try {
            laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray17, (int) (short) 10, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 10, data_length 64 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str15.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(byteArray17);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test255");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        java.lang.Object obj10 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        short short13 = micazMsg1.getElement_Buffer(3);
        micazMsg1.set_Voltage(2);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test256");
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
        java.util.List<laccan.devices.Sample> sampleList17 = keepingAll0.get();
        int int18 = keepingAll0.length();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(sampleList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test257");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        micazMsg1.set_NodeID(256);
        micazMsg1.set_Voltage(2);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 4);
        int int15 = micazMsg14.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test258");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(10, 6);
        java.lang.String str3 = micazMsg2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 " + "'", str3.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 "));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test259");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        storageCSV3.save(strArray4);
        storageCSV0.save(strArray4);
        java.util.List<laccan.devices.Sample> sampleList7 = storageCSV0.read();
        java.util.List<java.lang.Double> doubleList8 = laccan.cloud.prediction.Regression.makeTests(sampleList7);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(sampleList7);
        org.junit.Assert.assertNotNull(doubleList8);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test260");
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
        laccan.devices.Sample sample27 = new laccan.devices.Sample();
        laccan.devices.Type type28 = laccan.devices.Type.FULL;
        sample27.setType(type28);
        java.lang.Class<?> wildcardClass30 = type28.getClass();
        sample25.setType(type28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + type28 + "' != '" + laccan.devices.Type.FULL + "'", type28.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test261");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        micazMsg1.set_NodeID((int) (byte) -1);
        java.lang.String str7 = micazMsg1.toString();
        short[] shortArray8 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        micazMsg1.set_NodeID(512);
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray8);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test262");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 512, (long) 32, 4);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test263");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (short) 0, 48);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test264");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray6, (int) (short) 100);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray6, (int) (byte) 1);
        int int12 = micazMsg11.dataLength();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg11, 1L);
        try {
            micazMsg11.setElement_Buffer(52, (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test265");
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
        byte[] byteArray14 = micazMsg12.dataGet();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray14, 24);
        try {
            laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray14, (int) (short) -1, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset -1, data_length 128 and data array size 52");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test266");
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
            micazMsg39.setElement_Buffer((int) (short) 10, (short) 100);
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
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test267");
        laccan.devices.helper.utils.Assistant.predictorType = "null;4.0;0";
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test268");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 1);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        micazMsg6.init(48);
        short[] shortArray9 = micazMsg6.get_Buffer();
        int int10 = micazMsg6.get_NodeID();
        int int11 = micazMsg6.get_Voltage();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test269");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 512);
        micazMsg2.set_Voltage(16);
        byte[] byteArray9 = micazMsg2.dataGet();
        java.lang.String str10 = micazMsg2.toString();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg2, (long) 172);
        java.lang.String[] strArray13 = sample12.toCSV();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str10.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test270");
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
        java.util.List<laccan.devices.Sample> sampleList32 = keepingAll0.get();
        int int33 = keepingAll0.length();
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
        org.junit.Assert.assertNotNull(sampleList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test271");
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
        java.util.List<java.lang.Double> doubleList46 = regression0.result();
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
        org.junit.Assert.assertNotNull(doubleList46);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test272");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        java.lang.String str9 = micazMsg1.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test273");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(16);
        micazMsg1.set_Voltage(16);
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray6);
        micazMsg1.dataSet(byteArray6);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray6);
        try {
            micazMsg10.set_Voltage(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test274");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(100, (int) (short) 1);
        java.lang.String str3 = micazMsg2.toString();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, 100L);
        byte[] byteArray6 = micazMsg2.dataGet();
        net.tinyos.message.Message message7 = null;
        try {
            micazMsg2.dataSet(message7, 112);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str3.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test275");
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
        java.lang.String str22 = sample13.getNode();
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        int int25 = micazMsg24.dataLength();
        net.tinyos.message.SerialPacket serialPacket26 = micazMsg24.getSerialPacket();
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg24, (long) (byte) 10);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj32 = micazMsg31.clone();
        laccan.devices.Sample sample34 = new laccan.devices.Sample(micazMsg31, (long) 0);
        java.lang.String str35 = sample34.getNode();
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
        sample34.setType(type49);
        sample28.setType(type49);
        sample13.setType(type49);
        sample13.setTemperature((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "reduction;-19.699999999999996;0" + "'", str22.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNull(serialPacket26);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + type49 + "' != '" + laccan.devices.Type.FULL + "'", type49.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test276");
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
        java.lang.String str20 = sample9.toString();
        java.lang.String[] strArray21 = sample9.toCSV();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + laccan.devices.Type.FULL + "'", type16.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + laccan.devices.Type.FULL + "'", type19.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null;97.0;100" + "'", str20.equals("null;97.0;100"));
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test277");
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
        java.lang.String[] strArray37 = sample30.toCSV();
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
        org.junit.Assert.assertNotNull(strArray37);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test278");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        int int3 = micazMsg1.get_NodeID();
        java.lang.Object obj4 = micazMsg1.clone();
        int int5 = micazMsg1.get_Voltage();
        int int6 = micazMsg1.get_Voltage();
        micazMsg1.amTypeSet(0);
        try {
            short short10 = micazMsg1.getElement_Buffer(128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test279");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.Container container3 = memory0.getMemory();
        memory0.build();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test280");
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
        int int16 = micazMsg1.get_Voltage();
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
        laccan.devices.MicazMsg micazMsg59 = new laccan.devices.MicazMsg(byteArray51, (int) (short) 1);
        laccan.devices.MicazMsg micazMsg61 = new laccan.devices.MicazMsg(byteArray51, 4);
        micazMsg1.dataSet(byteArray51);
        micazMsg1.init(10);
        try {
            short short66 = micazMsg1.getElement_Buffer(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
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
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test281");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 2);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        micazMsg6.set_NodeID((int) (byte) 10);
        byte[] byteArray9 = micazMsg6.dataGet();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray9);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray9, (int) (short) 10);
        try {
            laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray9, 160, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 160, data_length 35 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test282");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        memory0.build();
        memory0.build();
        memory0.build();
        laccan.memory.Container container6 = memory0.getMemory();
        int int7 = container6.length();
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertNotNull(container6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test283");
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
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray36 = micazMsg35.get_Buffer();
        micazMsg35.setElement_Buffer(0, (short) 10);
        micazMsg35.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg43 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray44 = micazMsg43.get_Buffer();
        java.lang.Object obj45 = micazMsg43.clone();
        int int46 = micazMsg43.get_NodeID();
        byte[] byteArray49 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg50 = new laccan.devices.MicazMsg(byteArray49);
        laccan.devices.MicazMsg micazMsg52 = new laccan.devices.MicazMsg(byteArray49, 2);
        micazMsg43.dataSet(byteArray49);
        micazMsg35.dataSet(byteArray49);
        laccan.devices.MicazMsg micazMsg56 = new laccan.devices.MicazMsg(byteArray49, 172);
        byte[] byteArray57 = micazMsg56.dataGet();
        try {
            micazMsg33.dataSet(byteArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertNotNull(byteArray57);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test284");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray3, (int) (byte) -1, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray3);
        short[] shortArray8 = micazMsg7.get_Buffer();
        int int9 = micazMsg7.baseOffset();
        short short11 = micazMsg7.getElement_Buffer(0);
        try {
            short short13 = micazMsg7.getElement_Buffer(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test285");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("memory");
        java.lang.String[] strArray8 = null;
        storageCSV4.save(strArray8);
        java.util.List<laccan.devices.Sample> sampleList10 = storageCSV4.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(sampleList10);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test286");
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
        java.lang.String str22 = sample13.getNode();
        sample13.setNode("null;-19.699999999999996;48");
        java.lang.String[] strArray25 = sample13.toCSV();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "reduction;-19.699999999999996;0" + "'", str22.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test287");
        laccan.devices.helper.utils.Assistant.reducerType = "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x4]\n  [Buffer=0xffff 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n";
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test288");
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
        net.tinyos.message.Message message21 = null;
        try {
            message14.dataSet(message21, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(message16);
        org.junit.Assert.assertNotNull(message18);
        org.junit.Assert.assertNotNull(message20);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test289");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("null;0.0;100");
        org.junit.Assert.assertNotNull(storageCSV2);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test290");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 10);
        micazMsg1.amTypeSet(1);
        byte[] byteArray12 = micazMsg1.dataGet();
        micazMsg1.set_NodeID((int) (short) 10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(byteArray12);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test291");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) 3, (long) 3);
        long long4 = sample3.getDate();
        laccan.devices.Type type5 = sample3.getType();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test292");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test293");
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
        long long33 = sample20.getDate();
        double double34 = sample20.getTemperature();
        double double35 = sample20.getTemperature();
        laccan.devices.Sample sample39 = new laccan.devices.Sample("full_memory", (double) (short) 1, (long) 172);
        laccan.devices.Type type40 = sample39.getType();
        sample39.setNode("null;0.0;512");
        laccan.memory.data.reduction.KeepingAll keepingAll43 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList44 = keepingAll43.get();
        int int45 = keepingAll43.length();
        java.util.List<laccan.devices.Sample> sampleList46 = keepingAll43.get();
        laccan.devices.MicazMsg micazMsg48 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray49 = micazMsg48.get_Buffer();
        java.lang.Object obj50 = micazMsg48.clone();
        laccan.devices.Sample sample51 = new laccan.devices.Sample(micazMsg48);
        laccan.devices.Type type52 = null;
        sample51.setType(type52);
        laccan.devices.Type type54 = null;
        sample51.setType(type54);
        sample51.setNode("hi!");
        keepingAll43.add(sample51);
        laccan.devices.MicazMsg micazMsg60 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray61 = micazMsg60.get_Buffer();
        java.lang.Object obj62 = micazMsg60.clone();
        laccan.devices.Sample sample63 = new laccan.devices.Sample(micazMsg60);
        laccan.devices.Type type64 = null;
        sample63.setType(type64);
        java.lang.String str66 = sample63.toString();
        java.lang.String str67 = sample63.getNode();
        keepingAll43.add(sample63);
        laccan.devices.Sample sample69 = new laccan.devices.Sample();
        laccan.devices.Type type70 = laccan.devices.Type.FULL;
        sample69.setType(type70);
        sample63.setType(type70);
        double double73 = sample63.getTemperature();
        sample63.setDate((long) (byte) 10);
        java.lang.String[] strArray76 = sample63.toCSV();
        laccan.devices.Type type77 = sample63.getType();
        sample39.setType(type77);
        sample20.setType(type77);
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-19.699999999999996d) + "'", double34 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-19.699999999999996d) + "'", double35 == (-19.699999999999996d));
        org.junit.Assert.assertNull(type40);
        org.junit.Assert.assertNotNull(sampleList44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(sampleList46);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "null;-19.699999999999996;0" + "'", str66.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + type70 + "' != '" + laccan.devices.Type.FULL + "'", type70.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-19.699999999999996d) + "'", double73 == (-19.699999999999996d));
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + type77 + "' != '" + laccan.devices.Type.FULL + "'", type77.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test294");
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
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg13);
        laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg13, (long) (short) 10);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray25 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg19.set_Buffer(shortArray25);
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg19);
        laccan.devices.Sample sample28 = new laccan.devices.Sample();
        laccan.devices.Type type29 = laccan.devices.Type.FULL;
        sample28.setType(type29);
        sample27.setType(type29);
        sample17.setType(type29);
        sample4.setType(type29);
        java.lang.String str34 = sample4.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + laccan.devices.Type.FULL + "'", type29.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "reduction;-19.699999999999996;0" + "'", str34.equals("reduction;-19.699999999999996;0"));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test295");
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
        regression0.train();
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
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test296");
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
        sample87.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        java.lang.String[] strArray93 = sample87.toCSV();
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
        org.junit.Assert.assertNotNull(strArray93);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test297");
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
        laccan.memory.Container container20 = memory0.getMemory();
        laccan.devices.Sample sample24 = new laccan.devices.Sample("full_memory", (double) (short) 1, (long) 172);
        laccan.devices.Type type25 = sample24.getType();
        sample24.setNode("null;0.0;512");
        double double28 = sample24.getTemperature();
        memory0.add(sample24);
        java.lang.String str30 = sample24.getNode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(container20);
        org.junit.Assert.assertNull(type25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "null;0.0;512" + "'", str30.equals("null;0.0;512"));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test298");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 2);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        micazMsg6.set_NodeID((int) (byte) 10);
        byte[] byteArray9 = micazMsg6.dataGet();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray9);
        int int11 = micazMsg10.get_NodeID();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test299");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (short) -1, 0);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test300");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 512);
        java.lang.Object obj7 = micazMsg2.clone();
        micazMsg2.amTypeSet((int) (short) 1);
        micazMsg2.set_Voltage(256);
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg2, 35L);
        double double14 = sample13.getDateDouble();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test301");
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
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg(byteArray27);
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

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test302");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        net.tinyos.message.SerialPacket serialPacket8 = micazMsg1.getSerialPacket();
        net.tinyos.message.Message message10 = micazMsg1.clone(100);
        short short12 = micazMsg1.getElement_Buffer(0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(serialPacket8);
        org.junit.Assert.assertNotNull(message10);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test303");
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
        regression0.train();
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
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test304");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        java.lang.Object obj5 = micazMsg1.clone();
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1, (long) 8);
        long long8 = sample7.getDate();
        double double9 = sample7.getTemperature();
        java.lang.String str10 = sample7.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 8L + "'", long8 == 8L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-19.699999999999996d) + "'", double9 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null;-19.699999999999996;8" + "'", str10.equals("null;-19.699999999999996;8"));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test305");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        java.util.List<laccan.devices.Sample> sampleList6 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV8 = storageCSV4.local("");
        laccan.persistence.StorageCSV storageCSV9 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV11 = storageCSV9.local("hi!");
        laccan.persistence.StorageCSV storageCSV13 = storageCSV11.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList14 = storageCSV13.read();
        laccan.persistence.StorageCSV storageCSV16 = storageCSV13.local("memory");
        laccan.persistence.StorageCSV storageCSV17 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV19 = storageCSV17.local("hi!");
        laccan.persistence.StorageCSV storageCSV21 = storageCSV19.local("lastReading");
        java.lang.String[] strArray27 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV21.save(strArray27);
        storageCSV13.save(strArray27);
        storageCSV4.save(strArray27);
        laccan.persistence.StorageCSV storageCSV32 = storageCSV4.local("null;-19.699999999999996;1");
        java.lang.String[] strArray33 = null;
        storageCSV32.save(strArray33);
        laccan.persistence.StorageCSV storageCSV36 = storageCSV32.local("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(sampleList14);
        org.junit.Assert.assertNotNull(storageCSV16);
        org.junit.Assert.assertNotNull(storageCSV19);
        org.junit.Assert.assertNotNull(storageCSV21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(storageCSV32);
        org.junit.Assert.assertNotNull(storageCSV36);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test306");
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
        java.util.List<java.lang.Double> doubleList50 = regression0.result();
        double double51 = regression0.mse();
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
        org.junit.Assert.assertNotNull(doubleList50);
        org.junit.Assert.assertEquals((double) double51, Double.NaN, 0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test307");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        micazMsg1.set_Voltage(1);
        java.lang.Class<?> wildcardClass8 = micazMsg1.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test308");
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
        laccan.devices.Sample sample32 = new laccan.devices.Sample("full_memory", (double) (short) 1, (long) 172);
        laccan.devices.Type type33 = sample32.getType();
        sample32.setNode("null;0.0;512");
        laccan.memory.data.reduction.KeepingAll keepingAll36 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList37 = keepingAll36.get();
        int int38 = keepingAll36.length();
        java.util.List<laccan.devices.Sample> sampleList39 = keepingAll36.get();
        laccan.devices.MicazMsg micazMsg41 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray42 = micazMsg41.get_Buffer();
        java.lang.Object obj43 = micazMsg41.clone();
        laccan.devices.Sample sample44 = new laccan.devices.Sample(micazMsg41);
        laccan.devices.Type type45 = null;
        sample44.setType(type45);
        laccan.devices.Type type47 = null;
        sample44.setType(type47);
        sample44.setNode("hi!");
        keepingAll36.add(sample44);
        laccan.devices.MicazMsg micazMsg53 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray54 = micazMsg53.get_Buffer();
        java.lang.Object obj55 = micazMsg53.clone();
        laccan.devices.Sample sample56 = new laccan.devices.Sample(micazMsg53);
        laccan.devices.Type type57 = null;
        sample56.setType(type57);
        java.lang.String str59 = sample56.toString();
        java.lang.String str60 = sample56.getNode();
        keepingAll36.add(sample56);
        laccan.devices.Sample sample62 = new laccan.devices.Sample();
        laccan.devices.Type type63 = laccan.devices.Type.FULL;
        sample62.setType(type63);
        sample56.setType(type63);
        double double66 = sample56.getTemperature();
        sample56.setDate((long) (byte) 10);
        java.lang.String[] strArray69 = sample56.toCSV();
        laccan.devices.Type type70 = sample56.getType();
        sample32.setType(type70);
        keepingAll0.add(sample32);
        laccan.devices.MicazMsg micazMsg74 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray75 = micazMsg74.get_Buffer();
        java.lang.Object obj76 = micazMsg74.clone();
        laccan.devices.Sample sample77 = new laccan.devices.Sample(micazMsg74);
        laccan.devices.Type type78 = null;
        sample77.setType(type78);
        sample77.setNode("null;-19.699999999999996;0");
        keepingAll0.add(sample77);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + laccan.devices.Type.FULL + "'", type21.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type26 + "' != '" + laccan.devices.Type.FULL + "'", type26.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNull(type33);
        org.junit.Assert.assertNotNull(sampleList37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(sampleList39);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "null;-19.699999999999996;0" + "'", str59.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + type63 + "' != '" + laccan.devices.Type.FULL + "'", type63.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-19.699999999999996d) + "'", double66 == (-19.699999999999996d));
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + type70 + "' != '" + laccan.devices.Type.FULL + "'", type70.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray75);
        org.junit.Assert.assertNotNull(obj76);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test309");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        int int13 = micazMsg1.dataLength();
        java.lang.Object obj14 = micazMsg1.clone();
        try {
            short[] shortArray15 = micazMsg1.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (128) or length (16), for data_length 16 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test310");
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
        sample25.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 ");
        sample25.setTemperature((double) 1L);
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
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test311");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        laccan.devices.Type type6 = laccan.devices.Type.FULL;
        sample4.setType(type6);
        sample4.setNode("reduction");
        java.lang.String[] strArray10 = sample4.toCSV();
        java.lang.String str11 = sample4.toString();
        java.lang.String[] strArray12 = sample4.toCSV();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "reduction;-19.699999999999996;0" + "'", str11.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test312");
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
        short[] shortArray28 = micazMsg1.get_Buffer();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x1]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str25.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x1]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray28);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test313");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        int int9 = micazMsg1.get_Voltage();
        net.tinyos.message.SerialPacket serialPacket10 = micazMsg1.getSerialPacket();
        micazMsg1.amTypeSet((int) (short) -1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(serialPacket10);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test314");
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
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray13, 35);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray13);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test315");
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
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray25 = micazMsg24.get_Buffer();
        micazMsg24.setElement_Buffer(0, (short) 10);
        micazMsg24.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg24, (int) (byte) 10);
        micazMsg32.setElement_Buffer((int) (short) 0, (short) 0);
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg32, 0);
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg37, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(shortArray25);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test316");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) (byte) 100);
        net.tinyos.message.Message message8 = micazMsg1.clone((int) '#');
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        micazMsg10.amTypeSet(20);
        int int15 = micazMsg10.baseOffset();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg10, 0);
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg17, (long) 160);
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg17);
        int int21 = micazMsg17.dataLength();
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg17, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(message8);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 24 + "'", int21 == 24);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test317");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;97.0;100", (double) '#', (long) (-139));
        long long4 = sample3.getDate();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-139L) + "'", long4 == (-139L));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test318");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        net.tinyos.message.SerialPacket serialPacket7 = micazMsg1.getSerialPacket();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (-1), 0);
        int int11 = micazMsg1.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(serialPacket7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test319");
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
        laccan.memory.Container container56 = memory0.getMemory();
        laccan.memory.Container container57 = memory0.getMemory();
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
        org.junit.Assert.assertNotNull(container56);
        org.junit.Assert.assertNotNull(container57);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test320");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(116);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test321");
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
        laccan.persistence.StorageCSV storageCSV31 = storageCSV4.local("memory;-19.699999999999996;-1");
        laccan.persistence.StorageCSV storageCSV33 = storageCSV4.local("");
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
        org.junit.Assert.assertNotNull(storageCSV31);
        org.junit.Assert.assertNotNull(storageCSV33);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test322");
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
        double double42 = regression0.mse();
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
        org.junit.Assert.assertEquals((double) double42, Double.NaN, 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test323");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory", (double) 2, (-1L));
        java.lang.String[] strArray4 = sample3.toCSV();
        laccan.devices.Type type5 = laccan.devices.Type.FULL;
        sample3.setType(type5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + laccan.devices.Type.FULL + "'", type5.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test324");
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
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray32 = micazMsg31.get_Buffer();
        java.lang.Object obj33 = micazMsg31.clone();
        micazMsg31.amTypeSet(20);
        laccan.devices.Sample sample36 = new laccan.devices.Sample(micazMsg31);
        double double37 = sample36.getTemperature();
        double double38 = sample36.getTemperature();
        keepingAll0.add(sample36);
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
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-19.699999999999996d) + "'", double37 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-19.699999999999996d) + "'", double38 == (-19.699999999999996d));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test325");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        int int5 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) '#');
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg8, (long) 6);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test326");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.dataLength();
        net.tinyos.message.SerialPacket serialPacket3 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (byte) 10);
        try {
            laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 160, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNull(serialPacket3);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test327");
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
        int int53 = micazMsg1.get_Voltage();
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test328");
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
        java.lang.String str18 = sample9.toString();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null;-19.648499999999995;0" + "'", str14.equals("null;-19.648499999999995;0"));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-19.648499999999995d) + "'", double17 == (-19.648499999999995d));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;-19.648499999999995;0" + "'", str18.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;-19.648499999999995;0"));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test329");
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
        sample9.setTemperature(16.0d);
        sample9.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;10.0;35");
        sample9.setDate((long) 51);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + laccan.devices.Type.FULL + "'", type16.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test330");
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
        laccan.memory.Container container22 = memory0.getMemory();
        memory0.build();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(container21);
        org.junit.Assert.assertNotNull(container22);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test331");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        java.lang.Object obj5 = micazMsg1.clone();
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1, (long) 8);
        try {
            short short9 = micazMsg1.getElement_Buffer((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test332");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray6, 32, 10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray6, 32, (int) (short) 0);
        int int14 = micazMsg13.amType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 172 + "'", int14 == 172);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test333");
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
        sample5.setDate((long) 3);
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
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test334");
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
        int int16 = container15.length();
        int int17 = container15.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null;-19.699999999999996;0" + "'", str12.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(container15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test335");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1);
        micazMsg1.amTypeSet((int) (byte) 1);
        net.tinyos.message.Message message14 = micazMsg1.clone(96);
        java.lang.Object obj15 = message14.clone();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test336");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray3, (int) (byte) -1, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray3);
        short[] shortArray8 = micazMsg7.get_Buffer();
        int int9 = micazMsg7.baseOffset();
        short short11 = micazMsg7.getElement_Buffer(0);
        try {
            laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg7, 512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 512, data_length 24 and data array size 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test337");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (short) 1, (long) (byte) -1, (-139));
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test338");
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
        laccan.memory.Container container13 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container12);
        org.junit.Assert.assertNotNull(container13);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test339");
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
        double double75 = regression0.mse();
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
        org.junit.Assert.assertEquals((double) double75, Double.NaN, 0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test340");
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
        java.lang.Object obj41 = micazMsg39.clone();
        laccan.devices.Sample sample42 = new laccan.devices.Sample(micazMsg39);
        long long43 = sample42.getDate();
        laccan.devices.Type type44 = laccan.devices.Type.FULL;
        sample42.setType(type44);
        sample42.setNode("reduction");
        java.lang.Class<?> wildcardClass48 = sample42.getClass();
        laccan.devices.Type type49 = sample42.getType();
        laccan.devices.MicazMsg micazMsg51 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray52 = micazMsg51.get_Buffer();
        laccan.devices.Sample sample53 = new laccan.devices.Sample(micazMsg51);
        laccan.devices.Sample sample55 = new laccan.devices.Sample(micazMsg51, (long) (short) 10);
        laccan.devices.MicazMsg micazMsg57 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray63 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg57.set_Buffer(shortArray63);
        laccan.devices.Sample sample65 = new laccan.devices.Sample(micazMsg57);
        laccan.devices.Sample sample66 = new laccan.devices.Sample();
        laccan.devices.Type type67 = laccan.devices.Type.FULL;
        sample66.setType(type67);
        sample65.setType(type67);
        sample55.setType(type67);
        sample42.setType(type67);
        sample42.setDate((long) (short) 100);
        keepingAll0.add(sample42);
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
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + type44 + "' != '" + laccan.devices.Type.FULL + "'", type44.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + type49 + "' != '" + laccan.devices.Type.FULL + "'", type49.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertTrue("'" + type67 + "' != '" + laccan.devices.Type.FULL + "'", type67.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test341");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        java.lang.String str7 = micazMsg1.toString();
        micazMsg1.amTypeSet(16);
        net.tinyos.message.Message message11 = micazMsg1.clone(65);
        message11.amTypeSet(96);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(message11);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test342");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        int int6 = micazMsg1.baseOffset();
        micazMsg1.amTypeSet(10);
        int int9 = micazMsg1.amType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test343");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        net.tinyos.message.Message message5 = micazMsg3.clone(10);
        int int6 = micazMsg3.dataLength();
        java.lang.Object obj7 = micazMsg3.clone();
        java.lang.Object obj8 = micazMsg3.clone();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(message5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test344");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        java.lang.String str4 = micazMsg1.toString();
        micazMsg1.amTypeSet((int) ' ');
        java.lang.Object obj7 = micazMsg1.clone();
        try {
            short short9 = micazMsg1.getElement_Buffer(16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test345");
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
        laccan.devices.Type type12 = sample8.getType();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(type12);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test346");
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
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray43 = micazMsg42.get_Buffer();
        java.lang.Object obj44 = micazMsg42.clone();
        laccan.devices.Sample sample45 = new laccan.devices.Sample(micazMsg42);
        laccan.devices.Type type46 = null;
        sample45.setType(type46);
        laccan.devices.Type type48 = null;
        sample45.setType(type48);
        sample45.setNode("hi!");
        sample45.setDate((long) 1);
        laccan.devices.MicazMsg micazMsg55 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray56 = micazMsg55.get_Buffer();
        java.lang.Object obj57 = micazMsg55.clone();
        laccan.devices.Sample sample58 = new laccan.devices.Sample(micazMsg55);
        laccan.devices.Type type59 = null;
        sample58.setType(type59);
        laccan.devices.Type type61 = null;
        sample58.setType(type61);
        java.lang.String str63 = sample58.toString();
        laccan.devices.MicazMsg micazMsg66 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj67 = micazMsg66.clone();
        laccan.devices.Sample sample69 = new laccan.devices.Sample(micazMsg66, (long) 0);
        java.lang.String str70 = sample69.getNode();
        laccan.devices.MicazMsg micazMsg72 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray73 = micazMsg72.get_Buffer();
        java.lang.Object obj74 = micazMsg72.clone();
        laccan.devices.Sample sample75 = new laccan.devices.Sample(micazMsg72);
        long long76 = sample75.getDate();
        java.lang.Class<?> wildcardClass77 = sample75.getClass();
        laccan.devices.MicazMsg micazMsg79 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray80 = micazMsg79.get_Buffer();
        java.lang.Object obj81 = micazMsg79.clone();
        laccan.devices.Sample sample82 = new laccan.devices.Sample(micazMsg79);
        long long83 = sample82.getDate();
        laccan.devices.Type type84 = laccan.devices.Type.FULL;
        sample82.setType(type84);
        sample75.setType(type84);
        sample69.setType(type84);
        sample58.setType(type84);
        sample45.setType(type84);
        keepingAll0.add(sample45);
        laccan.devices.MicazMsg micazMsg93 = new laccan.devices.MicazMsg(52, 0);
        laccan.devices.Sample sample94 = new laccan.devices.Sample(micazMsg93);
        long long95 = sample94.getDate();
        keepingAll0.add(sample94);
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
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "null;-19.699999999999996;0" + "'", str63.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(shortArray80);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertTrue("'" + type84 + "' != '" + laccan.devices.Type.FULL + "'", type84.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 0L + "'", long95 == 0L);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test347");
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
        double double19 = sample17.getDateDouble();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test348");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("nodes", 48.0d, (long) (short) -1);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test349");
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
        sample9.setNode("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=;NaN;35");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-19.648499999999995d) + "'", double15 == (-19.648499999999995d));
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + laccan.devices.Type.FULL + "'", type16.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test350");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(52, 96);
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg2);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test351");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone((int) ' ');
        net.tinyos.message.Message message11 = micazMsg1.clone((int) (byte) 100);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(message11);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test352");
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
        int int37 = keepingAll0.length();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test353");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        byte[] byteArray5 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray5, 0, (int) (byte) 1);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray5, 96);
        int int11 = micazMsg10.baseOffset();
        java.lang.String str12 = micazMsg10.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 96 + "'", int11 == 96);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str12.equals("Message <MicazMsg> \n  [Buffer="));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test354");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 100);
        micazMsg1.set_Voltage((int) (short) 10);
        try {
            short short14 = micazMsg1.getElement_Buffer(116);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test355");
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
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg(byteArray25, (int) 'a');
        net.tinyos.message.SerialPacket serialPacket39 = micazMsg38.getSerialPacket();
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
        org.junit.Assert.assertNull(serialPacket39);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test356");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 1 };
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg(byteArray2, 16);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2, 172);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray2, (int) (short) 100);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray2, (int) '#');
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test357");
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
        regression0.train();
        laccan.cloud.prediction.Regression regression21 = new laccan.cloud.prediction.Regression();
        double double22 = regression21.mse();
        double double23 = regression21.mse();
        java.util.List<laccan.devices.Sample> sampleList24 = null;
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
        regression21.init(sampleList24, doubleList35);
        laccan.cloud.prediction.Regression regression37 = new laccan.cloud.prediction.Regression();
        double double38 = regression37.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll39 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList40 = keepingAll39.get();
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
        laccan.devices.MicazMsg micazMsg61 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray62 = micazMsg61.get_Buffer();
        java.lang.Object obj63 = micazMsg61.clone();
        laccan.devices.Sample sample64 = new laccan.devices.Sample(micazMsg61);
        laccan.devices.Sample sample65 = new laccan.devices.Sample();
        laccan.devices.Sample sample66 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray67 = new laccan.devices.Sample[] { sample64, sample65, sample66 };
        java.util.ArrayList<laccan.devices.Sample> sampleList68 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList68, sampleArray67);
        java.util.List<java.lang.Double> doubleList70 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList68);
        java.util.List<java.lang.Double> doubleList71 = regression59.result(doubleList70);
        java.util.List<java.lang.Double> doubleList72 = regression41.result(doubleList70);
        regression37.init(sampleList40, doubleList70);
        regression37.train();
        java.util.List<java.lang.Double> doubleList75 = regression37.result();
        double double76 = regression37.mse();
        java.util.List<java.lang.Double> doubleList77 = regression37.result();
        java.util.List<java.lang.Double> doubleList78 = regression37.result();
        java.util.List<java.lang.Double> doubleList79 = regression21.result(doubleList78);
        java.util.List<java.lang.Double> doubleList80 = regression0.result(doubleList79);
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
        org.junit.Assert.assertEquals((double) double22, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double23, Double.NaN, 0);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(sampleArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleList35);
        org.junit.Assert.assertEquals((double) double38, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList40);
        org.junit.Assert.assertEquals((double) double42, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList44);
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(sampleArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(doubleList56);
        org.junit.Assert.assertNotNull(doubleList57);
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertNotNull(sampleArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(doubleList70);
        org.junit.Assert.assertNotNull(doubleList71);
        org.junit.Assert.assertNotNull(doubleList72);
        org.junit.Assert.assertNotNull(doubleList75);
        org.junit.Assert.assertEquals((double) double76, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList77);
        org.junit.Assert.assertNotNull(doubleList78);
        org.junit.Assert.assertNotNull(doubleList79);
        org.junit.Assert.assertNotNull(doubleList80);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test358");
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
        java.lang.String str18 = sample9.getNode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "reduction;-19.699999999999996;0" + "'", str15.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "reduction;-19.699999999999996;0" + "'", str16.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "reduction" + "'", str18.equals("reduction"));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test359");
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
        int int38 = micazMsg2.baseOffset();
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test360");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        micazMsg1.amTypeSet(52);
        short short7 = micazMsg1.getElement_Buffer(0);
        micazMsg1.setElement_Buffer(4, (short) 100);
        micazMsg1.set_Voltage((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test361");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory;-19.699999999999996;-1", (double) 24, 32L);
        java.lang.String str4 = sample3.getNode();
        sample3.setDate(10L);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "memory;-19.699999999999996;-1" + "'", str4.equals("memory;-19.699999999999996;-1"));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test362");
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
        sample20.setTemperature((double) (-1L));
        laccan.devices.Type type31 = sample20.getType();
        sample4.setType(type31);
        java.lang.Class<?> wildcardClass33 = type31.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "reduction;-19.699999999999996;0" + "'", str10.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + laccan.devices.Type.FULL + "'", type15.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + laccan.devices.Type.FULL + "'", type22.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "reduction;-19.699999999999996;0" + "'", str26.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + laccan.devices.Type.FULL + "'", type31.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test363");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(2, (int) ' ');
        try {
            laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 20, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 52, data_length 128 and data array size 34");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test364");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        micazMsg13.amTypeSet(1);
        micazMsg13.init(48);
        java.lang.Object obj20 = micazMsg13.clone();
        short short22 = micazMsg13.getElement_Buffer((int) (short) 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test365");
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
        net.tinyos.message.Message message31 = micazMsg15.clone(160);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(message31);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test366");
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
        java.lang.Object obj19 = message14.clone();
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
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test367");
        laccan.devices.Sample sample0 = new laccan.devices.Sample();
        laccan.devices.Type type1 = laccan.devices.Type.FULL;
        sample0.setType(type1);
        double double3 = sample0.getDateDouble();
        sample0.setDate((long) 100);
        long long6 = sample0.getDate();
        double double7 = sample0.getTemperature();
        double double8 = sample0.getDateDouble();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + laccan.devices.Type.FULL + "'", type1.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test368");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory;-19.699999999999996;-1", (double) 10.0f, (long) (-1));
        laccan.memory.data.reduction.KeepingAll keepingAll4 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList5 = keepingAll4.get();
        int int6 = keepingAll4.length();
        java.util.List<laccan.devices.Sample> sampleList7 = keepingAll4.get();
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        java.lang.Object obj11 = micazMsg9.clone();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg9);
        laccan.devices.Type type13 = null;
        sample12.setType(type13);
        laccan.devices.Type type15 = null;
        sample12.setType(type15);
        sample12.setNode("hi!");
        keepingAll4.add(sample12);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray22 = micazMsg21.get_Buffer();
        java.lang.Object obj23 = micazMsg21.clone();
        laccan.devices.Sample sample24 = new laccan.devices.Sample(micazMsg21);
        laccan.devices.Type type25 = null;
        sample24.setType(type25);
        java.lang.String str27 = sample24.toString();
        java.lang.String str28 = sample24.getNode();
        keepingAll4.add(sample24);
        laccan.devices.Sample sample30 = new laccan.devices.Sample();
        laccan.devices.Type type31 = laccan.devices.Type.FULL;
        sample30.setType(type31);
        sample24.setType(type31);
        sample3.setType(type31);
        java.lang.String str35 = sample3.getNode();
        laccan.devices.Type type36 = sample3.getType();
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sampleList7);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "null;-19.699999999999996;0" + "'", str27.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + laccan.devices.Type.FULL + "'", type31.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "memory;-19.699999999999996;-1" + "'", str35.equals("memory;-19.699999999999996;-1"));
        org.junit.Assert.assertTrue("'" + type36 + "' != '" + laccan.devices.Type.FULL + "'", type36.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test369");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(100, (int) (short) -1);
        micazMsg2.set_Voltage(65535);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 24);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test370");
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
        sample4.setTemperature((double) 24);
        java.lang.String str14 = sample4.getNode();
        sample4.setDate((long) 4);
        double double17 = sample4.getTemperature();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null;-19.699999999999996;0" + "'", str7.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 24.0d + "'", double17 == 24.0d);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test371");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(65, (int) (byte) 0);
        try {
            micazMsg2.setElement_Buffer((-30), (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test372");
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
        int int32 = micazMsg1.amType();
        micazMsg1.set_Voltage(116);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 172 + "'", int11 == 172);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 172 + "'", int32 == 172);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test373");
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
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray21);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray21, 35);
        try {
            micazMsg1.dataSet(byteArray21, (int) ' ', 512, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(byteArray21);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test374");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        java.lang.String str16 = micazMsg13.toString();
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(172, 1);
        short[] shortArray20 = micazMsg19.get_Buffer();
        try {
            micazMsg13.set_Buffer(shortArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=" + "'", str16.equals("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer="));
        org.junit.Assert.assertNotNull(shortArray20);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test375");
        laccan.devices.MicazMsg micazMsg0 = new laccan.devices.MicazMsg();
        net.tinyos.message.SerialPacket serialPacket1 = micazMsg0.getSerialPacket();
        net.tinyos.message.SerialPacket serialPacket2 = micazMsg0.getSerialPacket();
        byte[] byteArray3 = new byte[] {};
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray3, (int) (short) -1);
        try {
            serialPacket2.dataSet(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(serialPacket1);
        org.junit.Assert.assertNull(serialPacket2);
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test376");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(52);
        short[] shortArray10 = micazMsg9.get_Buffer();
        micazMsg1.set_Buffer(shortArray10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray10);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test377");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        int int5 = micazMsg1.baseOffset();
        try {
            laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 160, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test378");
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
        short[] shortArray40 = micazMsg2.get_Buffer();
        short[] shortArray41 = null;
        try {
            micazMsg2.set_Buffer(shortArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
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
        org.junit.Assert.assertNotNull(shortArray40);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test379");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        sample6.setDate((long) (byte) 1);
        laccan.devices.Type type9 = sample6.getType();
        double double10 = sample6.getTemperature();
        sample6.setDate(1L);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(type9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-19.699999999999996d) + "'", double10 == (-19.699999999999996d));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test380");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(96, 32);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test381");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        java.lang.Object obj10 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg1);
        net.tinyos.message.Message message14 = micazMsg1.clone(0);
        int int15 = micazMsg1.amType();
        try {
            micazMsg1.setElement_Buffer((int) 'a', (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(serialPacket11);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 172 + "'", int15 == 172);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test382");
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
        laccan.memory.Memory memory53 = new laccan.memory.Memory();
        memory53.build();
        int int55 = memory53.length();
        laccan.memory.Container container56 = memory53.getMemory();
        laccan.devices.MicazMsg micazMsg58 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray64 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg58.set_Buffer(shortArray64);
        laccan.devices.Sample sample66 = new laccan.devices.Sample(micazMsg58);
        java.lang.String[] strArray67 = sample66.toCSV();
        sample66.setNode("hi!");
        memory53.add(sample66);
        laccan.memory.Memory memory71 = new laccan.memory.Memory();
        memory71.build();
        int int73 = memory71.length();
        laccan.devices.MicazMsg micazMsg75 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray76 = micazMsg75.get_Buffer();
        java.lang.Object obj77 = micazMsg75.clone();
        laccan.devices.Sample sample78 = new laccan.devices.Sample(micazMsg75);
        long long79 = sample78.getDate();
        java.lang.Class<?> wildcardClass80 = sample78.getClass();
        java.lang.String str81 = sample78.getNode();
        sample78.setNode("full_memory");
        memory71.add(sample78);
        long long85 = sample78.getDate();
        memory53.add(sample78);
        sample78.setDate(100L);
        keepingAll0.add(sample78);
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(container56);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(shortArray76);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test383");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (byte) 100, 1);
        try {
            micazMsg2.setElement_Buffer((int) 'a', (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test384");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray3, (int) (byte) -1, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray3);
        short[] shortArray8 = micazMsg7.get_Buffer();
        micazMsg7.set_NodeID(32);
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
        short[] shortArray23 = micazMsg12.get_Buffer();
        int int24 = micazMsg12.baseOffset();
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(100);
        short[] shortArray27 = micazMsg26.get_Buffer();
        micazMsg12.set_Buffer(shortArray27);
        micazMsg7.set_Buffer(shortArray27);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str15.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(shortArray27);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test385");
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
        int int15 = micazMsg11.dataLength();
        short[] shortArray16 = micazMsg11.get_Buffer();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg18.set_Buffer(shortArray24);
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg18);
        short[] shortArray27 = micazMsg18.get_Buffer();
        net.tinyos.message.Message message29 = micazMsg18.clone((int) (byte) 0);
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray32 = micazMsg31.get_Buffer();
        laccan.devices.Sample sample33 = new laccan.devices.Sample(micazMsg31);
        int int34 = micazMsg31.dataLength();
        micazMsg31.init((int) '4');
        micazMsg31.init((int) '4');
        micazMsg31.amTypeSet(160);
        byte[] byteArray41 = micazMsg31.dataGet();
        micazMsg18.dataSet(byteArray41);
        micazMsg11.dataSet(byteArray41);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(message29);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertNotNull(byteArray41);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test386");
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
        memory0.build();
        memory0.build();
        memory0.build();
        laccan.memory.Memory memory27 = new laccan.memory.Memory();
        memory27.build();
        int int29 = memory27.length();
        laccan.memory.data.reduction.KeepingAll keepingAll30 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample31 = new laccan.devices.Sample();
        keepingAll30.add(sample31);
        sample31.setDate(10L);
        memory27.add(sample31);
        int int36 = memory27.length();
        memory27.build();
        laccan.memory.data.reduction.KeepingAll keepingAll38 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample39 = new laccan.devices.Sample();
        keepingAll38.add(sample39);
        sample39.setTemperature((double) 0L);
        java.lang.String[] strArray43 = sample39.toCSV();
        memory27.add(sample39);
        laccan.devices.Sample sample45 = new laccan.devices.Sample();
        double double46 = sample45.getDateDouble();
        laccan.devices.MicazMsg micazMsg48 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray54 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg48.set_Buffer(shortArray54);
        laccan.devices.Sample sample56 = new laccan.devices.Sample(micazMsg48);
        laccan.devices.Sample sample57 = new laccan.devices.Sample();
        laccan.devices.Type type58 = laccan.devices.Type.FULL;
        sample57.setType(type58);
        sample56.setType(type58);
        sample45.setType(type58);
        sample39.setType(type58);
        java.lang.String[] strArray63 = sample39.toCSV();
        memory0.add(sample39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(container22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertTrue("'" + type58 + "' != '" + laccan.devices.Type.FULL + "'", type58.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(strArray63);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test387");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        memory0.build();
        laccan.memory.Container container4 = memory0.getMemory();
        int int5 = memory0.length();
        memory0.build();
        int int7 = memory0.length();
        laccan.memory.Container container8 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(container8);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test388");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        net.tinyos.message.Message message10 = micazMsg1.clone(65535);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        micazMsg12.amTypeSet(20);
        int int17 = micazMsg12.baseOffset();
        byte[] byteArray18 = micazMsg12.dataGet();
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray18);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray18);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray18);
        try {
            message10.dataSet(byteArray18, (int) (byte) 1, (-139), 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(message10);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test389");
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
        java.lang.String[] strArray25 = new java.lang.String[] {};
        storageCSV24.save(strArray25);
        storageCSV10.save(strArray25);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV12);
        org.junit.Assert.assertNotNull(storageCSV14);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test390");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 2);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        java.lang.Object obj7 = micazMsg6.clone();
        try {
            int int8 = micazMsg6.get_Voltage();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test391");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        laccan.devices.Type type7 = null;
        sample4.setType(type7);
        sample4.setNode("hi!");
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg12.set_Buffer(shortArray18);
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg12);
        laccan.devices.Sample sample21 = new laccan.devices.Sample();
        laccan.devices.Type type22 = laccan.devices.Type.FULL;
        sample21.setType(type22);
        sample20.setType(type22);
        sample4.setType(type22);
        java.lang.String[] strArray26 = sample4.toCSV();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + laccan.devices.Type.FULL + "'", type22.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test392");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        short short5 = micazMsg1.getElement_Buffer((int) (short) 0);
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray6, 24, (int) (byte) -1);
        try {
            int int10 = micazMsg9.get_Voltage();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length -1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test393");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        int int3 = micazMsg1.get_NodeID();
        java.lang.Object obj4 = micazMsg1.clone();
        micazMsg1.init((int) (short) 10);
        net.tinyos.message.Message message8 = micazMsg1.clone(14);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(message8);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test394");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.dataLength();
        net.tinyos.message.SerialPacket serialPacket3 = micazMsg1.getSerialPacket();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (byte) 10);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = micazMsg7.get_Buffer();
        java.lang.Object obj9 = micazMsg7.clone();
        micazMsg7.amTypeSet(20);
        int int12 = micazMsg7.baseOffset();
        byte[] byteArray13 = micazMsg7.dataGet();
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray13);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray13);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray13);
        int int17 = micazMsg16.get_Voltage();
        short[] shortArray18 = micazMsg16.get_Buffer();
        micazMsg1.set_Buffer(shortArray18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNull(serialPacket3);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(shortArray18);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test395");
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
        byte[] byteArray14 = micazMsg12.dataGet();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray14, 24);
        int int17 = micazMsg16.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test396");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) 35L, (long) 10);
        sample3.setTemperature((double) 1L);
        double double6 = sample3.getDateDouble();
        double double7 = sample3.getDateDouble();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test397");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        int int8 = micazMsg1.get_NodeID();
        net.tinyos.message.SerialPacket serialPacket9 = micazMsg1.getSerialPacket();
        short[] shortArray10 = micazMsg1.get_Buffer();
        try {
            short short12 = micazMsg1.getElement_Buffer(24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(serialPacket9);
        org.junit.Assert.assertNotNull(shortArray10);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test398");
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
        memory0.build();
        laccan.memory.Container container19 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(container19);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test399");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        int int11 = micazMsg1.dataLength();
        int int12 = micazMsg1.get_NodeID();
        int int13 = micazMsg1.get_Voltage();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg15);
        int int18 = micazMsg15.get_NodeID();
        byte[] byteArray19 = micazMsg15.dataGet();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray19);
        micazMsg1.dataSet(byteArray19);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 256 + "'", int12 == 256);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test400");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.Container container3 = memory0.getMemory();
        java.util.List<laccan.devices.Sample> sampleList4 = container3.get();
        java.util.List<laccan.devices.Sample> sampleList5 = container3.get();
        java.util.List<laccan.devices.Sample> sampleList6 = container3.get();
        int int7 = container3.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test401");
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
        int int32 = memory0.length();
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray35 = micazMsg34.get_Buffer();
        laccan.devices.Sample sample36 = new laccan.devices.Sample(micazMsg34);
        int int37 = micazMsg34.dataLength();
        micazMsg34.init((int) '4');
        laccan.devices.Sample sample40 = new laccan.devices.Sample(micazMsg34);
        double double41 = sample40.getDateDouble();
        sample40.setDate((long) (short) 0);
        memory0.add(sample40);
        laccan.memory.Container container45 = memory0.getMemory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(container45);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test402");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        java.util.List<laccan.devices.Sample> sampleList6 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV8 = storageCSV4.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x64]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 ");
        laccan.persistence.StorageCSV storageCSV10 = storageCSV4.local("reduction;-19.699999999999996;0;-1.0;0");
        laccan.memory.Memory memory11 = new laccan.memory.Memory();
        memory11.build();
        int int13 = memory11.length();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg15);
        long long19 = sample18.getDate();
        java.lang.Class<?> wildcardClass20 = sample18.getClass();
        java.lang.String str21 = sample18.getNode();
        sample18.setNode("full_memory");
        memory11.add(sample18);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj28 = micazMsg27.clone();
        laccan.devices.Sample sample30 = new laccan.devices.Sample(micazMsg27, (long) 0);
        java.lang.String str31 = sample30.getNode();
        long long32 = sample30.getDate();
        memory11.add(sample30);
        laccan.memory.data.reduction.KeepingAll keepingAll34 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList35 = keepingAll34.get();
        int int36 = keepingAll34.length();
        java.util.List<laccan.devices.Sample> sampleList37 = keepingAll34.get();
        laccan.devices.MicazMsg micazMsg39 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray40 = micazMsg39.get_Buffer();
        java.lang.Object obj41 = micazMsg39.clone();
        laccan.devices.Sample sample42 = new laccan.devices.Sample(micazMsg39);
        laccan.devices.Type type43 = null;
        sample42.setType(type43);
        laccan.devices.Type type45 = null;
        sample42.setType(type45);
        sample42.setNode("hi!");
        keepingAll34.add(sample42);
        laccan.devices.MicazMsg micazMsg51 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray52 = micazMsg51.get_Buffer();
        java.lang.Object obj53 = micazMsg51.clone();
        laccan.devices.Sample sample54 = new laccan.devices.Sample(micazMsg51);
        laccan.devices.Type type55 = null;
        sample54.setType(type55);
        java.lang.String str57 = sample54.toString();
        java.lang.String str58 = sample54.getNode();
        keepingAll34.add(sample54);
        laccan.devices.Sample sample60 = new laccan.devices.Sample();
        laccan.devices.Type type61 = laccan.devices.Type.FULL;
        sample60.setType(type61);
        sample54.setType(type61);
        java.lang.String str64 = sample54.toString();
        java.lang.String str65 = sample54.getNode();
        sample54.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        memory11.add(sample54);
        java.lang.String[] strArray69 = sample54.toCSV();
        storageCSV4.save(strArray69);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(sampleList35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(sampleList37);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "null;-19.699999999999996;0" + "'", str57.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + type61 + "' != '" + laccan.devices.Type.FULL + "'", type61.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "null;-19.699999999999996;0" + "'", str64.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(strArray69);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test403");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        byte[] byteArray3 = micazMsg2.dataGet();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray3, (int) (byte) -1, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray3);
        short[] shortArray8 = micazMsg7.get_Buffer();
        int int9 = micazMsg7.baseOffset();
        java.lang.Object obj10 = micazMsg7.clone();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test404");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test405");
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
        double double12 = sample8.getTemperature();
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-19.699999999999996d) + "'", double12 == (-19.699999999999996d));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test406");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        micazMsg1.init(1);
        try {
            short[] shortArray10 = micazMsg1.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test407");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        java.util.List<laccan.devices.Sample> sampleList6 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV8 = storageCSV4.local("");
        laccan.persistence.StorageCSV storageCSV10 = storageCSV8.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg12);
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg12, (long) (short) 10);
        double double17 = sample16.getDateDouble();
        java.lang.String[] strArray18 = sample16.toCSV();
        storageCSV8.save(strArray18);
        java.util.List<laccan.devices.Sample> sampleList20 = storageCSV8.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(sampleList20);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test408");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        int int9 = micazMsg1.get_Voltage();
        micazMsg1.amTypeSet((int) '#');
        micazMsg1.set_Voltage(10);
        micazMsg1.set_NodeID((int) (byte) 0);
        try {
            laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 116);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 116, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test409");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        memory0.build();
        laccan.memory.Container container4 = memory0.getMemory();
        memory0.build();
        int int6 = memory0.length();
        laccan.memory.Memory memory7 = new laccan.memory.Memory();
        memory7.build();
        int int9 = memory7.length();
        laccan.memory.data.reduction.KeepingAll keepingAll10 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample11 = new laccan.devices.Sample();
        keepingAll10.add(sample11);
        sample11.setDate(10L);
        memory7.add(sample11);
        int int16 = memory7.length();
        laccan.memory.Container container17 = memory7.getMemory();
        laccan.memory.Memory memory18 = new laccan.memory.Memory();
        memory18.build();
        int int20 = memory18.length();
        laccan.memory.data.reduction.KeepingAll keepingAll21 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample22 = new laccan.devices.Sample();
        keepingAll21.add(sample22);
        sample22.setDate(10L);
        memory18.add(sample22);
        memory7.add(sample22);
        memory7.build();
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
        java.lang.String[] strArray45 = sample37.toCSV();
        sample37.setNode("");
        memory7.add(sample37);
        memory0.add(sample37);
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(container17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(sampleList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(sampleList32);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(strArray45);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test410");
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
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test411");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.data.reduction.KeepingAll keepingAll3 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample4 = new laccan.devices.Sample();
        keepingAll3.add(sample4);
        sample4.setDate(10L);
        memory0.add(sample4);
        java.lang.String str9 = sample4.getNode();
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
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = micazMsg23.get_Buffer();
        java.lang.Object obj25 = micazMsg23.clone();
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg23);
        long long27 = sample26.getDate();
        laccan.devices.Type type28 = laccan.devices.Type.FULL;
        sample26.setType(type28);
        sample26.setNode("reduction");
        laccan.devices.Type type32 = sample26.getType();
        sample14.setType(type32);
        sample4.setType(type32);
        java.lang.String str35 = sample4.getNode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + laccan.devices.Type.FULL + "'", type16.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + laccan.devices.Type.FULL + "'", type21.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + type28 + "' != '" + laccan.devices.Type.FULL + "'", type28.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + type32 + "' != '" + laccan.devices.Type.FULL + "'", type32.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test412");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(2, 1);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test413");
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
        java.util.List<java.lang.Double> doubleList31 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList28);
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
        double double50 = regression32.mse();
        regression32.train();
        double double52 = regression32.mse();
        java.lang.Double[] doubleArray55 = new java.lang.Double[] { 4.0d, (-19.699999999999996d) };
        java.util.ArrayList<java.lang.Double> doubleList56 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList56, doubleArray55);
        java.util.List<java.lang.Double> doubleList58 = regression32.result((java.util.List<java.lang.Double>) doubleList56);
        regression0.init((java.util.List<laccan.devices.Sample>) sampleList28, doubleList58);
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
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(sampleArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
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
        org.junit.Assert.assertEquals((double) double50, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double52, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(doubleList58);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test414");
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
        memory0.build();
        laccan.memory.Memory memory29 = new laccan.memory.Memory();
        memory29.build();
        int int31 = memory29.length();
        memory29.build();
        laccan.memory.Container container33 = memory29.getMemory();
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray36 = micazMsg35.get_Buffer();
        java.lang.Object obj37 = micazMsg35.clone();
        laccan.devices.Sample sample38 = new laccan.devices.Sample(micazMsg35);
        long long39 = sample38.getDate();
        java.lang.Class<?> wildcardClass40 = sample38.getClass();
        java.lang.String str41 = sample38.toString();
        memory29.add(sample38);
        double double43 = sample38.getDateDouble();
        memory0.add(sample38);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(container33);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "null;-19.699999999999996;0" + "'", str41.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test415");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.699999999999996;0;-19.699999999999996;0", (double) (byte) 10, (long) '4');
        long long4 = sample3.getDate();
        sample3.setDate((long) 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test416");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        micazMsg2.set_NodeID(0);
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg2, (long) 24);
        try {
            short short9 = micazMsg2.getElement_Buffer((-139));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test417");
        laccan.devices.helper.utils.Assistant.reducerType = "Message <MicazMsg> \n  [NodeID=0x18]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n";
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test418");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        int int3 = micazMsg1.get_NodeID();
        short short5 = micazMsg1.getElement_Buffer((int) (short) 0);
        byte[] byteArray6 = micazMsg1.dataGet();
        try {
            laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray6, 52, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 52, data_length 1 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test419");
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
        micazMsg1.set_Voltage(8);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 172 + "'", int11 == 172);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(byteArray25);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test420");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests(8L, (-139L), 100);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test421");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        int int13 = micazMsg1.amType();
        net.tinyos.message.SerialPacket serialPacket14 = micazMsg1.getSerialPacket();
        try {
            int int15 = serialPacket14.baseOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 172 + "'", int13 == 172);
        org.junit.Assert.assertNull(serialPacket14);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test422");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("", (-19.648499999999995d), (long) (byte) 100);
        long long4 = sample3.getDate();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test423");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x18]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n", 0.0d, (long) 52);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test424");
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
        try {
            laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray17, (int) ' ', 64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 32, data_length 64 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test425");
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
        java.util.List<java.lang.Double> doubleList14 = laccan.cloud.prediction.Regression.makeTests(sampleList13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertNotNull(sampleList12);
        org.junit.Assert.assertNotNull(sampleList13);
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test426");
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
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj25 = micazMsg24.clone();
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg24, (long) 0);
        java.lang.String str28 = sample27.getNode();
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray31 = micazMsg30.get_Buffer();
        java.lang.Object obj32 = micazMsg30.clone();
        laccan.devices.Sample sample33 = new laccan.devices.Sample(micazMsg30);
        long long34 = sample33.getDate();
        java.lang.Class<?> wildcardClass35 = sample33.getClass();
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray38 = micazMsg37.get_Buffer();
        java.lang.Object obj39 = micazMsg37.clone();
        laccan.devices.Sample sample40 = new laccan.devices.Sample(micazMsg37);
        long long41 = sample40.getDate();
        laccan.devices.Type type42 = laccan.devices.Type.FULL;
        sample40.setType(type42);
        sample33.setType(type42);
        sample27.setType(type42);
        sample27.setNode("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        java.lang.String str48 = sample27.toString();
        sample27.setNode("full_memory");
        memory0.add(sample27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + type42 + "' != '" + laccan.devices.Type.FULL + "'", type42.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;-19.699999999999996;0" + "'", str48.equals("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;-19.699999999999996;0"));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test427");
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
        laccan.persistence.StorageCSV storageCSV17 = storageCSV8.local("null;-19.648499999999995;0;52.0;0");
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
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test428");
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
        laccan.devices.MicazMsg micazMsg42 = new laccan.devices.MicazMsg(byteArray36);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test429");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV4.local("memory");
        java.lang.String[] strArray8 = laccan.devices.helper.utils.Assistant.environments;
        storageCSV4.save(strArray8);
        java.util.List<laccan.devices.Sample> sampleList10 = storageCSV4.read();
        laccan.persistence.StorageCSV storageCSV12 = storageCSV4.local("null;-19.699999999999996;35");
        java.util.List<laccan.devices.Sample> sampleList13 = storageCSV12.read();
        java.util.List<laccan.devices.Sample> sampleList14 = storageCSV12.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(sampleList10);
        org.junit.Assert.assertNotNull(storageCSV12);
        org.junit.Assert.assertNotNull(sampleList13);
        org.junit.Assert.assertNotNull(sampleList14);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test430");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        micazMsg1.amTypeSet(160);
        byte[] byteArray11 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray11, (-30));
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray11);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(byteArray11);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test431");
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
        double double40 = regression0.mse();
        java.util.List<java.lang.Double> doubleList41 = regression0.result();
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
        org.junit.Assert.assertEquals((double) double40, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList41);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test432");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        int int10 = micazMsg1.amType();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        micazMsg12.set_NodeID(20);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray19);
        micazMsg12.dataSet(byteArray19);
        short short23 = micazMsg12.getElement_Buffer(0);
        net.tinyos.message.Message message25 = micazMsg12.clone((int) (byte) 100);
        short[] shortArray26 = micazMsg12.get_Buffer();
        micazMsg1.set_Buffer(shortArray26);
        net.tinyos.message.Message message29 = micazMsg1.clone((int) (byte) 1);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 172 + "'", int10 == 172);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertNotNull(message25);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(message29);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test433");
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
        java.lang.String str18 = sample4.toString();
        laccan.devices.Sample sample22 = new laccan.devices.Sample("null;-19.699999999999996;0", (double) 160, (long) (short) 1);
        java.lang.String[] strArray23 = sample22.toCSV();
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray26 = micazMsg25.get_Buffer();
        java.lang.Object obj27 = micazMsg25.clone();
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg25);
        long long29 = sample28.getDate();
        laccan.devices.Type type30 = laccan.devices.Type.FULL;
        sample28.setType(type30);
        sample28.setNode("reduction");
        java.lang.String str34 = sample28.toString();
        sample28.setNode("reduction;-19.699999999999996;0");
        sample28.setTemperature((double) (-1L));
        laccan.devices.Type type39 = sample28.getType();
        sample22.setType(type39);
        sample4.setType(type39);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "reduction;-19.699999999999996;0" + "'", str10.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "reduction;-19.699999999999996;0;1.0;0" + "'", str18.equals("reduction;-19.699999999999996;0;1.0;0"));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + type30 + "' != '" + laccan.devices.Type.FULL + "'", type30.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "reduction;-19.699999999999996;0" + "'", str34.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + type39 + "' != '" + laccan.devices.Type.FULL + "'", type39.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test434");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 116, 97L, 32);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test435");
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
        double double15 = sample7.getDateDouble();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test436");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(8, 256);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test437");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 1);
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray2);
        int int7 = micazMsg6.amType();
        net.tinyos.message.SerialPacket serialPacket8 = micazMsg6.getSerialPacket();
        int int9 = micazMsg6.baseOffset();
        try {
            micazMsg6.setElement_Buffer((int) (short) 0, (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 172 + "'", int7 == 172);
        org.junit.Assert.assertNull(serialPacket8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test438");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        micazMsg7.init(0);
        int int10 = micazMsg7.dataLength();
        byte[] byteArray11 = micazMsg7.dataGet();
        net.tinyos.message.SerialPacket serialPacket12 = micazMsg7.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNull(serialPacket12);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test439");
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
        int int20 = memory18.length();
        laccan.memory.data.reduction.KeepingAll keepingAll21 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample22 = new laccan.devices.Sample();
        keepingAll21.add(sample22);
        sample22.setDate(10L);
        memory18.add(sample22);
        int int27 = memory18.length();
        laccan.memory.data.reduction.KeepingAll keepingAll28 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList29 = keepingAll28.get();
        int int30 = keepingAll28.length();
        java.util.List<laccan.devices.Sample> sampleList31 = keepingAll28.get();
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray34 = micazMsg33.get_Buffer();
        java.lang.Object obj35 = micazMsg33.clone();
        laccan.devices.Sample sample36 = new laccan.devices.Sample(micazMsg33);
        laccan.devices.Type type37 = null;
        sample36.setType(type37);
        laccan.devices.Type type39 = null;
        sample36.setType(type39);
        sample36.setNode("hi!");
        keepingAll28.add(sample36);
        laccan.devices.MicazMsg micazMsg45 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray46 = micazMsg45.get_Buffer();
        java.lang.Object obj47 = micazMsg45.clone();
        laccan.devices.Sample sample48 = new laccan.devices.Sample(micazMsg45);
        laccan.devices.Type type49 = null;
        sample48.setType(type49);
        java.lang.String str51 = sample48.toString();
        java.lang.String str52 = sample48.getNode();
        keepingAll28.add(sample48);
        java.util.List<laccan.devices.Sample> sampleList54 = keepingAll28.get();
        laccan.devices.Sample sample55 = new laccan.devices.Sample();
        double double56 = sample55.getDateDouble();
        double double57 = sample55.getDateDouble();
        sample55.setTemperature((double) 1);
        double double60 = sample55.getDateDouble();
        laccan.devices.MicazMsg micazMsg62 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray68 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg62.set_Buffer(shortArray68);
        laccan.devices.Sample sample70 = new laccan.devices.Sample(micazMsg62);
        laccan.devices.Sample sample71 = new laccan.devices.Sample();
        laccan.devices.Type type72 = laccan.devices.Type.FULL;
        sample71.setType(type72);
        sample70.setType(type72);
        double double75 = sample70.getDateDouble();
        double double76 = sample70.getTemperature();
        laccan.devices.Type type77 = sample70.getType();
        sample55.setType(type77);
        keepingAll28.add(sample55);
        int int80 = keepingAll28.length();
        laccan.devices.MicazMsg micazMsg82 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray88 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg82.set_Buffer(shortArray88);
        laccan.devices.Sample sample90 = new laccan.devices.Sample(micazMsg82);
        laccan.devices.Sample sample91 = new laccan.devices.Sample();
        laccan.devices.Type type92 = laccan.devices.Type.FULL;
        sample91.setType(type92);
        sample90.setType(type92);
        keepingAll28.add(sample90);
        memory18.add(sample90);
        memory0.add(sample90);
        int int98 = memory0.length();
        memory0.build();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + laccan.devices.Type.FULL + "'", type11.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "reduction;-19.699999999999996;0" + "'", str15.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "reduction;-19.699999999999996;0" + "'", str16.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(sampleList29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(sampleList31);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "null;-19.699999999999996;0" + "'", str51.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(sampleList54);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertTrue("'" + type72 + "' != '" + laccan.devices.Type.FULL + "'", type72.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-19.648499999999995d) + "'", double76 == (-19.648499999999995d));
        org.junit.Assert.assertTrue("'" + type77 + "' != '" + laccan.devices.Type.FULL + "'", type77.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 3 + "'", int80 == 3);
        org.junit.Assert.assertNotNull(shortArray88);
        org.junit.Assert.assertTrue("'" + type92 + "' != '" + laccan.devices.Type.FULL + "'", type92.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 2 + "'", int98 == 2);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test440");
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
        net.tinyos.message.SerialPacket serialPacket16 = micazMsg1.getSerialPacket();
        short[] shortArray17 = micazMsg1.get_Buffer();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(serialPacket16);
        org.junit.Assert.assertNotNull(shortArray17);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test441");
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
        double double95 = regression0.mse();
        java.util.List<java.lang.Double> doubleList96 = regression0.result();
        regression0.train();
        double double98 = regression0.mse();
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
        org.junit.Assert.assertEquals((double) double95, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList96);
        org.junit.Assert.assertEquals((double) double98, Double.NaN, 0);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test442");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Class<?> wildcardClass3 = micazMsg1.getClass();
        short[] shortArray4 = micazMsg1.get_Buffer();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(shortArray4);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test443");
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
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = micazMsg23.get_Buffer();
        java.lang.Object obj25 = micazMsg23.clone();
        micazMsg23.amTypeSet(20);
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg23);
        double double29 = sample28.getTemperature();
        java.lang.String str30 = sample28.toString();
        java.lang.String[] strArray31 = sample28.toCSV();
        long long32 = sample28.getDate();
        java.lang.String str33 = sample28.toString();
        memory0.add(sample28);
        int int35 = memory0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-19.699999999999996d) + "'", double29 == (-19.699999999999996d));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "null;-19.699999999999996;0" + "'", str30.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "null;-19.699999999999996;0" + "'", str33.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test444");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray6);
        java.lang.String str9 = micazMsg8.toString();
        net.tinyos.message.SerialPacket serialPacket10 = micazMsg8.getSerialPacket();
        int int11 = micazMsg8.get_Voltage();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg13.set_Buffer(shortArray19);
        int int21 = micazMsg13.get_NodeID();
        java.lang.Object obj22 = micazMsg13.clone();
        micazMsg13.init(256);
        try {
            micazMsg8.dataSet((net.tinyos.message.Message) micazMsg13, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNull(serialPacket10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test445");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("lastReading");
        java.lang.String[] strArray10 = new java.lang.String[] { "result", "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", "reduction", "result", "hi!" };
        storageCSV4.save(strArray10);
        laccan.persistence.StorageCSV storageCSV13 = storageCSV4.local("");
        laccan.persistence.StorageCSV storageCSV15 = storageCSV4.local("");
        laccan.persistence.StorageCSV storageCSV17 = storageCSV15.local("reduction");
        laccan.persistence.StorageCSV storageCSV19 = storageCSV15.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        laccan.persistence.StorageCSV storageCSV21 = storageCSV19.local("lastReading;-19.699999999999996;0");
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(storageCSV15);
        org.junit.Assert.assertNotNull(storageCSV17);
        org.junit.Assert.assertNotNull(storageCSV19);
        org.junit.Assert.assertNotNull(storageCSV21);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test446");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory;2.0;-1", 0.0d, (long) 64);
        laccan.devices.Sample sample7 = new laccan.devices.Sample("memory", (double) 2, (-1L));
        double double8 = sample7.getDateDouble();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg10);
        long long14 = sample13.getDate();
        java.lang.Class<?> wildcardClass15 = sample13.getClass();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg17);
        long long21 = sample20.getDate();
        laccan.devices.Type type22 = laccan.devices.Type.FULL;
        sample20.setType(type22);
        sample13.setType(type22);
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray32 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg26.set_Buffer(shortArray32);
        laccan.devices.Sample sample34 = new laccan.devices.Sample(micazMsg26);
        laccan.devices.Sample sample35 = new laccan.devices.Sample();
        laccan.devices.Type type36 = laccan.devices.Type.FULL;
        sample35.setType(type36);
        sample34.setType(type36);
        sample13.setType(type36);
        sample7.setType(type36);
        sample3.setType(type36);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + laccan.devices.Type.FULL + "'", type22.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertTrue("'" + type36 + "' != '" + laccan.devices.Type.FULL + "'", type36.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test447");
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
        long long23 = sample4.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "reduction;-19.699999999999996;0" + "'", str10.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "reduction;-19.699999999999996;0;-1.0;0" + "'", str17.equals("reduction;-19.699999999999996;0;-1.0;0"));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test448");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray12);
        micazMsg1.dataSet((net.tinyos.message.Message) micazMsg13, (int) (byte) 0);
        micazMsg1.set_Voltage((int) (short) 1);
        java.lang.Object obj18 = micazMsg1.clone();
        micazMsg1.amTypeSet(32);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test449");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(256, 96);
        int int3 = micazMsg2.dataLength();
        java.lang.Object obj4 = micazMsg2.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 256 + "'", int3 == 256);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test450");
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
        sample9.setType(type47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!;-19.699999999999996;0" + "'", str17.equals("hi!;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(sampleList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(sampleList21);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(type34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertTrue("'" + type47 + "' != '" + laccan.devices.Type.FULL + "'", type47.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test451");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg7.set_Buffer(shortArray13);
        micazMsg1.set_Buffer(shortArray13);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(100, (int) (short) 1);
        java.lang.String str19 = micazMsg18.toString();
        laccan.devices.Sample sample21 = new laccan.devices.Sample(micazMsg18, 100L);
        byte[] byteArray22 = micazMsg18.dataGet();
        micazMsg1.dataSet(byteArray22);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str19.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(byteArray22);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test452");
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
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = micazMsg16.get_Buffer();
        java.lang.Object obj18 = micazMsg16.clone();
        java.lang.String str19 = micazMsg16.toString();
        short[] shortArray20 = micazMsg16.get_Buffer();
        byte[] byteArray21 = micazMsg16.dataGet();
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray21);
        try {
            micazMsg14.dataSet(byteArray21, 100, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str19.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(byteArray21);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test453");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(0, 256);
        java.lang.String str3 = micazMsg2.toString();
        try {
            laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 356, data_length 24 and data array size 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str3.equals("Message <MicazMsg> \n  [Buffer="));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test454");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray6);
        java.lang.String str9 = micazMsg8.toString();
        net.tinyos.message.SerialPacket serialPacket10 = micazMsg8.getSerialPacket();
        java.lang.String str11 = micazMsg8.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str9.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNull(serialPacket10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test455");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        micazMsg1.set_NodeID((int) (byte) -1);
        short[] shortArray7 = micazMsg1.get_Buffer();
        micazMsg1.set_Voltage(3);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertNotNull(shortArray7);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test456");
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
        java.util.List<laccan.devices.Sample> sampleList16 = storageCSV8.read();
        java.util.List<laccan.devices.Sample> sampleList17 = storageCSV8.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "memory;-1.0;32" + "'", str13.equals("memory;-1.0;32"));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(sampleList16);
        org.junit.Assert.assertNotNull(sampleList17);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test457");
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
        java.lang.String str21 = sample15.getNode();
        double double22 = sample15.getDateDouble();
        sample15.setNode("full_memory");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test458");
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
        java.lang.Object obj30 = micazMsg29.clone();
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test459");
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
        laccan.persistence.StorageCSV storageCSV21 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV23 = storageCSV21.local("hi!");
        laccan.persistence.StorageCSV storageCSV25 = storageCSV23.local("lastReading");
        java.util.List<laccan.devices.Sample> sampleList26 = storageCSV25.read();
        laccan.persistence.StorageCSV storageCSV28 = storageCSV25.local("init");
        laccan.persistence.StorageCSV storageCSV30 = storageCSV25.local("lastReading");
        laccan.memory.Memory memory31 = new laccan.memory.Memory();
        memory31.build();
        int int33 = memory31.length();
        laccan.memory.Container container34 = memory31.getMemory();
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray42 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg36.set_Buffer(shortArray42);
        laccan.devices.Sample sample44 = new laccan.devices.Sample(micazMsg36);
        java.lang.String[] strArray45 = sample44.toCSV();
        sample44.setNode("hi!");
        memory31.add(sample44);
        java.lang.String[] strArray49 = sample44.toCSV();
        storageCSV25.save(strArray49);
        storageCSV10.save(strArray49);
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV12);
        org.junit.Assert.assertNotNull(storageCSV15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(storageCSV23);
        org.junit.Assert.assertNotNull(storageCSV25);
        org.junit.Assert.assertNotNull(sampleList26);
        org.junit.Assert.assertNotNull(storageCSV28);
        org.junit.Assert.assertNotNull(storageCSV30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(container34);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray49);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test460");
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
        laccan.devices.MicazMsg micazMsg31 = new laccan.devices.MicazMsg(100, (int) (short) 1);
        java.lang.String str32 = micazMsg31.toString();
        laccan.devices.Sample sample34 = new laccan.devices.Sample(micazMsg31, 100L);
        byte[] byteArray35 = micazMsg31.dataGet();
        java.lang.Class<?> wildcardClass36 = micazMsg31.getClass();
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray39 = micazMsg38.get_Buffer();
        java.lang.Object obj40 = micazMsg38.clone();
        int int41 = micazMsg38.get_NodeID();
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg45 = new laccan.devices.MicazMsg(byteArray44);
        laccan.devices.MicazMsg micazMsg47 = new laccan.devices.MicazMsg(byteArray44, 2);
        micazMsg38.dataSet(byteArray44);
        laccan.devices.MicazMsg micazMsg49 = new laccan.devices.MicazMsg(byteArray44);
        laccan.devices.MicazMsg micazMsg50 = new laccan.devices.MicazMsg(byteArray44);
        laccan.devices.MicazMsg micazMsg51 = new laccan.devices.MicazMsg(byteArray44);
        micazMsg31.dataSet(byteArray44);
        try {
            micazMsg28.dataSet(byteArray44, 0, (int) (byte) 0, 172);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str32.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(byteArray44);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test461");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        sample4.setNode("null;-19.699999999999996;0");
        sample4.setTemperature((double) 4);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test462");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        int int10 = micazMsg1.amType();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj14 = micazMsg13.clone();
        int int15 = micazMsg13.get_NodeID();
        laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg13, (long) (byte) -1);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = micazMsg19.get_Buffer();
        java.lang.Object obj21 = micazMsg19.clone();
        java.lang.String str22 = micazMsg19.toString();
        short[] shortArray23 = micazMsg19.get_Buffer();
        micazMsg13.set_Buffer(shortArray23);
        byte[] byteArray25 = micazMsg13.dataGet();
        micazMsg1.dataSet(byteArray25);
        micazMsg1.set_Voltage((-139));
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 172 + "'", int10 == 172);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str22.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(byteArray25);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test463");
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
        micazMsg1.amTypeSet(32);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNull(serialPacket15);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test464");
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
        try {
            laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(message14, 512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 512, data_length 24 and data array size 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(message16);
        org.junit.Assert.assertNotNull(message18);
        org.junit.Assert.assertNotNull(message20);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test465");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(8);
        int int2 = micazMsg1.amType();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg(1);
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg4, 512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172 + "'", int2 == 172);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test466");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(97, 20);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test467");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 512);
        java.lang.Object obj7 = micazMsg2.clone();
        micazMsg2.amTypeSet((int) (short) 1);
        micazMsg2.set_Voltage(256);
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg2, 35L);
        java.lang.String str14 = sample13.getNode();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test468");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        java.lang.String str4 = micazMsg1.toString();
        net.tinyos.message.SerialPacket serialPacket5 = micazMsg1.getSerialPacket();
        net.tinyos.message.Message message7 = micazMsg1.clone((int) '#');
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1, (long) (-30));
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNull(serialPacket5);
        org.junit.Assert.assertNotNull(message7);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test469");
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
        java.util.List<laccan.devices.Sample> sampleList28 = container27.get();
        int int29 = container27.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(container18);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(container27);
        org.junit.Assert.assertNotNull(sampleList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test470");
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
        laccan.memory.Container container20 = memory0.getMemory();
        int int21 = memory0.length();
        int int22 = memory0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(container20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test471");
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
        laccan.devices.Type type20 = sample4.getType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + laccan.devices.Type.FULL + "'", type6.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "reduction;-19.699999999999996;0" + "'", str10.equals("reduction;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + laccan.devices.Type.FULL + "'", type20.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test472");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) 'a', 3);
        int int3 = micazMsg2.get_Voltage();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test473");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        java.lang.Object obj5 = micazMsg1.clone();
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1, (long) 8);
        java.lang.String str8 = micazMsg1.toString();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str8.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test474");
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
        java.util.List<java.lang.Double> doubleList51 = regression0.result();
        regression0.train();
        laccan.memory.data.reduction.KeepingAll keepingAll53 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList54 = keepingAll53.get();
        int int55 = keepingAll53.length();
        java.util.List<laccan.devices.Sample> sampleList56 = keepingAll53.get();
        java.util.List<laccan.devices.Sample> sampleList57 = keepingAll53.get();
        java.util.List<java.lang.Double> doubleList58 = laccan.cloud.prediction.Regression.makeTests(sampleList57);
        java.util.List<java.lang.Double> doubleList59 = regression0.result(doubleList58);
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
        org.junit.Assert.assertEquals((double) double34, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double35, Double.NaN, 0);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(sampleArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(doubleList47);
        org.junit.Assert.assertNotNull(doubleList49);
        org.junit.Assert.assertEquals((double) double50, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList51);
        org.junit.Assert.assertNotNull(sampleList54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(sampleList56);
        org.junit.Assert.assertNotNull(sampleList57);
        org.junit.Assert.assertNotNull(doubleList58);
        org.junit.Assert.assertNotNull(doubleList59);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test475");
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
        int int24 = micazMsg23.baseOffset();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test476");
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
        double double13 = sample12.getTemperature();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str4.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-19.699999999999996d) + "'", double13 == (-19.699999999999996d));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test477");
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
        java.lang.String[] strArray24 = sample15.toCSV();
        java.lang.String str25 = sample15.getNode();
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNull(container2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + type17 + "' != '" + laccan.devices.Type.FULL + "'", type17.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test478");
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
        try {
            laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray10, (int) (byte) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset -1, data_length 97 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test479");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        java.lang.String str6 = sample4.getNode();
        long long7 = sample4.getDate();
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
        laccan.devices.Type type24 = sample16.getType();
        java.lang.String[] strArray25 = sample16.toCSV();
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray33 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg27.set_Buffer(shortArray33);
        laccan.devices.Sample sample35 = new laccan.devices.Sample(micazMsg27);
        laccan.devices.Sample sample36 = new laccan.devices.Sample();
        laccan.devices.Type type37 = laccan.devices.Type.FULL;
        sample36.setType(type37);
        sample35.setType(type37);
        sample16.setType(type37);
        sample4.setType(type37);
        long long42 = sample4.getDate();
        sample4.setTemperature((double) 2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(sampleList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(sampleList11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(type24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertTrue("'" + type37 + "' != '" + laccan.devices.Type.FULL + "'", type37.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test480");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        net.tinyos.message.Message message4 = micazMsg2.clone(10);
        micazMsg2.amTypeSet((int) (byte) 0);
        org.junit.Assert.assertNotNull(message4);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test481");
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
        laccan.memory.data.reduction.KeepingAll keepingAll33 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList34 = keepingAll33.get();
        int int35 = keepingAll33.length();
        java.util.List<laccan.devices.Sample> sampleList36 = keepingAll33.get();
        laccan.devices.MicazMsg micazMsg38 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray39 = micazMsg38.get_Buffer();
        laccan.devices.Sample sample40 = new laccan.devices.Sample(micazMsg38);
        keepingAll33.add(sample40);
        laccan.devices.MicazMsg micazMsg43 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray44 = micazMsg43.get_Buffer();
        java.lang.Object obj45 = micazMsg43.clone();
        laccan.devices.Sample sample46 = new laccan.devices.Sample(micazMsg43);
        laccan.devices.Type type47 = null;
        sample46.setType(type47);
        laccan.devices.Type type49 = null;
        sample46.setType(type49);
        sample46.setNode("hi!");
        laccan.devices.MicazMsg micazMsg54 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray60 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg54.set_Buffer(shortArray60);
        laccan.devices.Sample sample62 = new laccan.devices.Sample(micazMsg54);
        laccan.devices.Sample sample63 = new laccan.devices.Sample();
        laccan.devices.Type type64 = laccan.devices.Type.FULL;
        sample63.setType(type64);
        sample62.setType(type64);
        sample46.setType(type64);
        sample40.setType(type64);
        sample18.setType(type64);
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
        org.junit.Assert.assertNotNull(sampleList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(sampleList36);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertTrue("'" + type64 + "' != '" + laccan.devices.Type.FULL + "'", type64.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test482");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        sample4.setTemperature((double) 16);
        sample4.setNode("reduction");
        sample4.setTemperature((double) 65);
        java.lang.String[] strArray11 = sample4.toCSV();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test483");
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
        int int19 = micazMsg13.dataLength();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test484");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory", (double) (byte) -1, (long) ' ');
        java.lang.String str4 = sample3.getNode();
        double double5 = sample3.getTemperature();
        long long6 = sample3.getDate();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "memory" + "'", str4.equals("memory"));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test485");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(128, 24);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test486");
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
        laccan.devices.MicazMsg micazMsg46 = new laccan.devices.MicazMsg(byteArray34, 64);
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
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test487");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = micazMsg2.getClass();
        try {
            laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test488");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        micazMsg1.set_NodeID(24);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test489");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("nodes", (double) 100, 100L);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test490");
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
        laccan.cloud.prediction.Regression regression20 = new laccan.cloud.prediction.Regression();
        double double21 = regression20.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll22 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList23 = keepingAll22.get();
        laccan.cloud.prediction.Regression regression24 = new laccan.cloud.prediction.Regression();
        double double25 = regression24.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll26 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList27 = keepingAll26.get();
        laccan.cloud.prediction.Regression regression28 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray31 = micazMsg30.get_Buffer();
        java.lang.Object obj32 = micazMsg30.clone();
        laccan.devices.Sample sample33 = new laccan.devices.Sample(micazMsg30);
        laccan.devices.Sample sample34 = new laccan.devices.Sample();
        laccan.devices.Sample sample35 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray36 = new laccan.devices.Sample[] { sample33, sample34, sample35 };
        java.util.ArrayList<laccan.devices.Sample> sampleList37 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList37, sampleArray36);
        java.util.List<java.lang.Double> doubleList39 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList37);
        java.util.List<java.lang.Double> doubleList40 = regression28.result(doubleList39);
        regression24.init(sampleList27, doubleList39);
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
        java.util.List<java.lang.Double> doubleList55 = regression24.result(doubleList53);
        regression20.init(sampleList23, doubleList53);
        java.util.List<java.lang.Double> doubleList57 = regression0.result(doubleList53);
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
        org.junit.Assert.assertEquals((double) double21, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList23);
        org.junit.Assert.assertEquals((double) double25, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList27);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(sampleArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doubleList39);
        org.junit.Assert.assertNotNull(doubleList40);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(sampleArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(doubleList53);
        org.junit.Assert.assertNotNull(doubleList54);
        org.junit.Assert.assertNotNull(doubleList55);
        org.junit.Assert.assertNotNull(doubleList57);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test491");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        short short12 = micazMsg1.getElement_Buffer(2);
        int int13 = micazMsg1.get_Voltage();
        int int14 = micazMsg1.dataLength();
        int int15 = micazMsg1.amType();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj19 = micazMsg18.clone();
        int int20 = micazMsg18.get_NodeID();
        laccan.devices.Sample sample22 = new laccan.devices.Sample(micazMsg18, (long) (byte) -1);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray25 = micazMsg24.get_Buffer();
        java.lang.Object obj26 = micazMsg24.clone();
        java.lang.String str27 = micazMsg24.toString();
        short[] shortArray28 = micazMsg24.get_Buffer();
        micazMsg18.set_Buffer(shortArray28);
        micazMsg18.set_Voltage(0);
        short[] shortArray32 = micazMsg18.get_Buffer();
        try {
            micazMsg1.set_Buffer(shortArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (128) or length (16), for data_length 16 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 172 + "'", int15 == 172);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str27.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(shortArray32);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test492");
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
        micazMsg8.set_NodeID((int) (short) -1);
        int int53 = micazMsg8.baseOffset();
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test493");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(16);
        int int2 = micazMsg1.get_NodeID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test494");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(51, 96);
        try {
            micazMsg2.setElement_Buffer((int) (byte) 100, (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test495");
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
        laccan.memory.Memory memory42 = new laccan.memory.Memory();
        memory42.build();
        int int44 = memory42.length();
        laccan.memory.data.reduction.KeepingAll keepingAll45 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample46 = new laccan.devices.Sample();
        keepingAll45.add(sample46);
        sample46.setDate(10L);
        memory42.add(sample46);
        int int51 = memory42.length();
        laccan.memory.Container container52 = memory42.getMemory();
        int int53 = container52.length();
        int int54 = container52.length();
        int int55 = container52.length();
        java.util.List<laccan.devices.Sample> sampleList56 = container52.get();
        laccan.memory.Memory memory57 = new laccan.memory.Memory();
        memory57.build();
        int int59 = memory57.length();
        laccan.memory.data.reduction.KeepingAll keepingAll60 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample61 = new laccan.devices.Sample();
        keepingAll60.add(sample61);
        sample61.setDate(10L);
        memory57.add(sample61);
        memory57.build();
        laccan.memory.Container container67 = memory57.getMemory();
        int int68 = container67.length();
        java.util.List<laccan.devices.Sample> sampleList69 = container67.get();
        java.util.List<java.lang.Double> doubleList70 = laccan.cloud.prediction.Regression.makeTests(sampleList69);
        regression0.init(sampleList56, doubleList70);
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(container52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(sampleList56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(container67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(sampleList69);
        org.junit.Assert.assertNotNull(doubleList70);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test496");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(0, 16);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test497");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test498");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) 'a', 3);
        micazMsg2.amTypeSet((int) (byte) 0);
        try {
            micazMsg2.setElement_Buffer(112, (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test499");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 10, 10);
        net.tinyos.message.Message message4 = micazMsg2.clone((int) (byte) 10);
        micazMsg2.amTypeSet(16);
        java.lang.Class<?> wildcardClass7 = micazMsg2.getClass();
        try {
            laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (80) or length (16), for data_length 10 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(message4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test500");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("hi!");
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        storageCSV3.save(strArray4);
        storageCSV0.save(strArray4);
        laccan.persistence.StorageCSV storageCSV8 = storageCSV0.local("nodes");
        laccan.persistence.StorageCSV storageCSV9 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV11 = storageCSV9.local("hi!");
        laccan.persistence.StorageCSV storageCSV12 = new laccan.persistence.StorageCSV();
        java.lang.String[] strArray13 = new java.lang.String[] {};
        storageCSV12.save(strArray13);
        storageCSV9.save(strArray13);
        storageCSV0.save(strArray13);
        java.util.List<laccan.devices.Sample> sampleList17 = storageCSV0.read();
        java.util.List<laccan.devices.Sample> sampleList18 = storageCSV0.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(sampleList17);
        org.junit.Assert.assertNotNull(sampleList18);
    }
}

