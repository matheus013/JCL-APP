package laccan;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = laccan.devices.MicazMsg.totalSizeBits_Buffer();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 160 + "'", int0 == 160);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str0 = laccan.lang.Lang.INIT_KEY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "init" + "'", str0.equals("init"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int0 = laccan.devices.MicazMsg.sizeBits_Voltage();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        laccan.devices.helper.utils.Assistant.reducerType = "";
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int int0 = laccan.devices.MicazMsg.size_NodeID();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String str0 = laccan.lang.Lang.READER_KEY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "reduction" + "'", str0.equals("reduction"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        int int0 = laccan.devices.MicazMsg.sizeBits_NodeID();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int int0 = laccan.devices.MicazMsg.totalSize_Buffer();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 20 + "'", int0 == 20);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        boolean boolean0 = laccan.devices.MicazMsg.isSigned_Buffer();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str0 = laccan.lang.Lang.MEMORY_KEY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "memory" + "'", str0.equals("memory"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        try {
            laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (128) or length (16), for data_length 16 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int int0 = laccan.devices.MicazMsg.offsetBits_NodeID();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int int0 = laccan.devices.MicazMsg.numElements_Buffer();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 1 };
        try {
            micazMsg1.dataSet(byteArray6, (int) '4', 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        int int0 = laccan.devices.MicazMsg.size_Voltage();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        micazMsg1.amTypeSet(0);
        org.junit.Assert.assertNotNull(shortArray7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        int int0 = laccan.devices.MicazMsg.elementSizeBits_Buffer();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String str0 = laccan.lang.Lang.LAST_READ_KEY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "lastReading" + "'", str0.equals("lastReading"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int int0 = laccan.devices.MicazMsg.numDimensions_Buffer();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        int int0 = laccan.devices.MicazMsg.AM_TYPE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 172 + "'", int0 == 172);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        int int0 = laccan.devices.MicazMsg.elementSize_Buffer();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        laccan.devices.helper.utils.Assistant.reducerType = "hi!";
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        boolean boolean0 = laccan.devices.MicazMsg.isArray_Buffer();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.String str0 = laccan.lang.Lang.RESULT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "result" + "'", str0.equals("result"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        laccan.devices.helper.utils.Assistant assistant0 = new laccan.devices.helper.utils.Assistant();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        boolean boolean0 = laccan.devices.MicazMsg.isArray_Voltage();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 0 };
        try {
            laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray6, 35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 35, data_length 1 and data array size 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.String str0 = laccan.devices.helper.utils.Assistant.predictorType;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        int int0 = laccan.devices.MicazMsg.offsetBits_Voltage();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        try {
            laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 32, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        laccan.devices.helper.utils.Assistant.reducerType = "memory";
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        int int0 = net.tinyos.message.Message.MAX_CONVERTED_STRING_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 512 + "'", int0 == 512);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        try {
            short short6 = micazMsg1.getElement_Buffer((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        try {
            micazMsg3.dataSet((net.tinyos.message.Message) micazMsg7, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        int int12 = micazMsg1.get_Voltage();
        try {
            short short14 = micazMsg1.getElement_Buffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.String str0 = laccan.devices.helper.utils.Assistant.reducerType;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "memory" + "'", str0.equals("memory"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        boolean boolean0 = laccan.devices.MicazMsg.isSigned_NodeID();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        laccan.devices.helper.utils.Assistant.init();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        laccan.devices.helper.utils.Assistant.predictorType = "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n";
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        boolean boolean0 = laccan.devices.MicazMsg.isSigned_Voltage();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.String str0 = laccan.lang.Lang.FULL_MEMORY_KEY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "full_memory" + "'", str0.equals("full_memory"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        try {
            micazMsg1.dataSet(byteArray12, (int) ' ', (int) 'a', 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(byteArray12);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        laccan.lang.Lang lang0 = new laccan.lang.Lang();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        int int1 = laccan.devices.MicazMsg.offsetBits_Buffer((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        int int0 = laccan.devices.MicazMsg.offset_NodeID();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 100, 0L, (int) (short) 1);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(2);
        try {
            micazMsg1.set_Voltage((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests(1L, (long) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        laccan.devices.helper.utils.Assistant.predictorType = "null;-19.699999999999996;0";
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests(100L, (long) 'a', (int) (short) 1);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        micazMsg1.set_Voltage((int) (byte) 100);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 100 };
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray15);
        try {
            micazMsg1.dataSet(byteArray15, (-1), 20, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.String str0 = laccan.lang.Lang.NODES_IDS_KEY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "nodes" + "'", str0.equals("nodes"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) '4', (long) 48, 52);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        int int0 = laccan.devices.MicazMsg.offset_Voltage();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg10.set_Buffer(shortArray16);
        micazMsg10.init(16);
        short short21 = micazMsg10.getElement_Buffer(2);
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        laccan.devices.helper.utils.Assistant.predictorType = "lastReading";
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 0 };
        try {
            laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray3, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 10, data_length 0 and data array size 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        int int1 = laccan.devices.MicazMsg.offsetBits_Buffer((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        java.lang.Object obj8 = micazMsg1.clone();
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 100 };
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray15);
        try {
            micazMsg1.dataSet(byteArray15, (int) (short) 100, 160, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        laccan.devices.helper.utils.Assistant.predictorType = "hi!";
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        laccan.devices.helper.utils.Assistant.reducerType = "null;-19.699999999999996;0";
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(2);
        try {
            laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 160, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 160, data_length 10 and data array size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        int int1 = laccan.devices.MicazMsg.offsetBits_Buffer((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) (byte) 10);
        try {
            laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg11, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 100, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) (byte) 10);
        short[] shortArray12 = micazMsg1.get_Buffer();
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = micazMsg14.get_Buffer();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg14);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 100 };
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray23);
        micazMsg14.dataSet(byteArray23);
        try {
            micazMsg1.dataSet(byteArray23, (int) 'a', 100, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(byteArray23);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        try {
            int int12 = serialPacket11.amType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNull(serialPacket11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        laccan.devices.helper.utils.Assistant.predictorType = "nodes";
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) (byte) 10);
        short[] shortArray12 = micazMsg1.get_Buffer();
        java.lang.String str13 = micazMsg1.toString();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg15);
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 100 };
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray24);
        micazMsg15.dataSet(byteArray24);
        try {
            micazMsg1.dataSet(byteArray24, 32, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(byteArray24);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        try {
            laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 32, 160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 32, data_length 160 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 0 };
        try {
            micazMsg1.dataSet(byteArray7, 100, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample();
        laccan.devices.Sample sample6 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray7 = new laccan.devices.Sample[] { sample4, sample5, sample6 };
        java.util.ArrayList<laccan.devices.Sample> sampleList8 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList8, sampleArray7);
        java.util.List<java.lang.Double> doubleList10 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList8);
        java.util.List<java.lang.Double> doubleList11 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList8);
        java.lang.Class<?> wildcardClass12 = doubleList11.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(sampleArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        int int0 = laccan.devices.MicazMsg.DEFAULT_MESSAGE_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 24 + "'", int0 == 24);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        micazMsg1.init((int) (byte) 1);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg15.set_Buffer(shortArray21);
        micazMsg15.set_Voltage(2);
        short short26 = micazMsg15.getElement_Buffer((int) (short) 0);
        short[] shortArray27 = micazMsg15.get_Buffer();
        try {
            micazMsg1.set_Buffer(shortArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 0 + "'", short26 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray27);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) 'a', 0);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) '4', (long) 0, 52);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        java.lang.String str4 = sample3.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null;-19.699999999999996;0" + "'", str4.equals("null;-19.699999999999996;0"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg7, (long) (byte) 10);
        try {
            short short11 = micazMsg7.getElement_Buffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        laccan.devices.helper.utils.Assistant.reducerType = "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n";
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        try {
            laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer(20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        boolean boolean0 = laccan.devices.MicazMsg.isArray_NodeID();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 24, (long) 160, 0);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        try {
            laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 100, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        java.lang.String str2 = micazMsg1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str2.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(52, (int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (-1), (long) (byte) -1, 35);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        short[] shortArray12 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        try {
            micazMsg1.setElement_Buffer((int) (short) 100, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.amType();
        byte[] byteArray3 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg5.set_Buffer(shortArray11);
        micazMsg5.set_Voltage(2);
        short short16 = micazMsg5.getElement_Buffer((int) (short) 0);
        int int17 = micazMsg5.get_NodeID();
        byte[] byteArray18 = micazMsg5.dataGet();
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray18);
        try {
            micazMsg1.dataSet(byteArray18, (int) ' ', 160, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172 + "'", int2 == 172);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        short short12 = micazMsg1.getElement_Buffer((int) (short) 0);
        int int13 = micazMsg1.get_NodeID();
        byte[] byteArray14 = micazMsg1.dataGet();
        try {
            laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray14, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 32, data_length 100 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        short[] shortArray4 = micazMsg2.get_Buffer();
        java.lang.Object obj5 = micazMsg2.clone();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg7.set_Buffer(shortArray13);
        micazMsg7.set_Voltage(2);
        java.lang.String str17 = micazMsg7.toString();
        int int18 = micazMsg7.get_Voltage();
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg7);
        try {
            micazMsg2.dataSet((net.tinyos.message.Message) micazMsg7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str17.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(100, 10);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        micazMsg1.init((int) (byte) 1);
        try {
            int int14 = micazMsg1.get_Voltage();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        try {
            byte[] byteArray12 = serialPacket11.dataGet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNull(serialPacket11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        short short12 = micazMsg1.getElement_Buffer((int) (short) 0);
        int int13 = micazMsg1.get_NodeID();
        try {
            net.tinyos.message.Message message15 = micazMsg1.clone((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        laccan.devices.helper.utils.Assistant.predictorType = "null;0.0;0";
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 100 };
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        try {
            short short9 = micazMsg7.getElement_Buffer(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg7, (long) (byte) 10);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg11.set_Buffer(shortArray17);
        micazMsg11.set_Voltage(2);
        java.lang.String str21 = micazMsg11.toString();
        try {
            micazMsg7.dataSet((net.tinyos.message.Message) micazMsg11, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str21.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer(16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        try {
            java.util.List<laccan.devices.Sample> sampleList5 = storageCSV2.read();
            org.junit.Assert.fail("Expected exception of type java.nio.file.InvalidPathException; message: Illegal char <<> at index 8: Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        } catch (java.nio.file.InvalidPathException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        int int3 = keepingAll0.length();
        int int4 = keepingAll0.length();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray5 = micazMsg4.get_Buffer();
        java.lang.Object obj6 = micazMsg4.clone();
        micazMsg4.amTypeSet(20);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg4);
        java.lang.String[] strArray10 = sample9.toCSV();
        sample9.setTemperature((double) 100.0f);
        java.lang.String[] strArray13 = sample9.toCSV();
        try {
            storageCSV2.save(strArray13);
//            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: O sistema não pode encontrar o caminho especificado");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n");
        try {
            java.util.List<laccan.devices.Sample> sampleList3 = storageCSV2.read();
            org.junit.Assert.fail("Expected exception of type java.nio.file.InvalidPathException; message: Illegal char <<> at index 8: Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n");
        } catch (java.nio.file.InvalidPathException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        micazMsg1.init((int) (byte) 1);
        net.tinyos.message.Message message15 = micazMsg1.clone((int) '#');
        try {
            laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(message15, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 48, data_length 24 and data array size 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(message15);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        try {
            laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        int int12 = micazMsg1.get_Voltage();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
        micazMsg1.set_NodeID((int) (short) 100);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        micazMsg18.setElement_Buffer(0, (short) 10);
        micazMsg18.set_Voltage(0);
        java.lang.Object obj25 = micazMsg18.clone();
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg18);
        int int27 = micazMsg18.baseOffset();
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg18, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(0, 35);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        laccan.devices.MicazMsg micazMsg0 = new laccan.devices.MicazMsg();
        java.lang.Object obj1 = micazMsg0.clone();
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 32, (long) 35, 512);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n");
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV5 = storageCSV3.local("");
        laccan.persistence.StorageCSV storageCSV7 = storageCSV5.local("full_memory");
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        java.lang.Object obj11 = micazMsg9.clone();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg9);
        laccan.devices.Type type13 = null;
        sample12.setType(type13);
        laccan.devices.Type type15 = null;
        sample12.setType(type15);
        java.lang.String str17 = sample12.toString();
        java.lang.String str18 = sample12.toString();
        sample12.setDate((-1L));
        java.lang.String[] strArray21 = sample12.toCSV();
        storageCSV5.save(strArray21);
        try {
            storageCSV2.save(strArray21);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: A sintaxe do nome do arquivo, do nome do diretório ou do rótulo do volume está incorreta");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null;-19.699999999999996;0" + "'", str17.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null;-19.699999999999996;0" + "'", str18.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.amType();
        byte[] byteArray3 = micazMsg1.dataGet();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        byte[] byteArray5 = null;
        try {
            micazMsg1.dataSet(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172 + "'", int2 == 172);
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        java.util.List<laccan.devices.Sample> sampleList3 = storageCSV2.read();
        laccan.persistence.StorageCSV storageCSV5 = storageCSV2.local("");
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = micazMsg7.get_Buffer();
        java.lang.Object obj9 = micazMsg7.clone();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg7);
        laccan.devices.Type type11 = null;
        sample10.setType(type11);
        laccan.devices.Type type13 = null;
        sample10.setType(type13);
        java.lang.String str15 = sample10.toString();
        java.lang.String str16 = sample10.toString();
        sample10.setDate((-1L));
        java.lang.String[] strArray19 = sample10.toCSV();
        try {
            storageCSV2.save(strArray19);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: O sistema não pode encontrar o caminho especificado");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(storageCSV5);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null;-19.699999999999996;0" + "'", str15.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null;-19.699999999999996;0" + "'", str16.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.util.List<laccan.devices.Sample> sampleList0 = null;
        try {
            java.util.List<java.lang.Double> doubleList1 = laccan.cloud.prediction.Regression.makeTests(sampleList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        short[] shortArray12 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
        micazMsg1.setElement_Buffer(0, (short) (byte) 10);
        java.lang.Object obj18 = micazMsg1.clone();
        try {
            micazMsg1.setElement_Buffer((int) (byte) 10, (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        micazMsg1.init((int) (byte) 1);
        try {
            laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        int int11 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg13);
        net.tinyos.message.Message message18 = micazMsg13.clone(512);
        int int19 = message18.dataLength();
        message18.init(0);
        net.tinyos.message.Message message23 = message18.clone((int) (short) 10);
        byte[] byteArray24 = message18.dataGet();
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray24, (-1));
        try {
            micazMsg1.dataSet(byteArray24, (int) '#', (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(message18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertNotNull(message23);
        org.junit.Assert.assertNotNull(byteArray24);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        net.tinyos.message.Message message0 = null;
        try {
            laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(message0, 160, 160);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [Buffer=", (double) 100.0f, (long) 100);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        laccan.persistence.StorageCSV storageCSV5 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV5.local("");
        laccan.persistence.StorageCSV storageCSV9 = storageCSV7.local("full_memory");
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        java.lang.Object obj13 = micazMsg11.clone();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg11);
        laccan.devices.Type type15 = null;
        sample14.setType(type15);
        laccan.devices.Type type17 = null;
        sample14.setType(type17);
        java.lang.String str19 = sample14.toString();
        java.lang.String str20 = sample14.toString();
        sample14.setDate((-1L));
        java.lang.String[] strArray23 = sample14.toCSV();
        storageCSV7.save(strArray23);
        try {
            storageCSV2.save(strArray23);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: A sintaxe do nome do arquivo, do nome do diretório ou do rótulo do volume está incorreta");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null;-19.699999999999996;0" + "'", str19.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null;-19.699999999999996;0" + "'", str20.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        laccan.devices.MicazMsg micazMsg0 = null;
        try {
            laccan.devices.Sample sample1 = new laccan.devices.Sample(micazMsg0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        short[] shortArray12 = micazMsg1.get_Buffer();
        try {
            net.tinyos.message.Message message14 = micazMsg1.clone((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        laccan.devices.helper.utils.Assistant.reducerType = "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n";
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("full_memory");
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        laccan.devices.Type type10 = null;
        sample9.setType(type10);
        laccan.devices.Type type12 = null;
        sample9.setType(type12);
        java.lang.String str14 = sample9.toString();
        java.lang.String str15 = sample9.toString();
        sample9.setDate((-1L));
        java.lang.String[] strArray18 = sample9.toCSV();
        storageCSV2.save(strArray18);
        laccan.memory.data.reduction.KeepingAll keepingAll20 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList21 = keepingAll20.get();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = micazMsg23.get_Buffer();
        java.lang.Object obj25 = micazMsg23.clone();
        laccan.devices.Sample sample26 = new laccan.devices.Sample(micazMsg23);
        laccan.devices.Type type27 = null;
        sample26.setType(type27);
        laccan.devices.Type type29 = null;
        sample26.setType(type29);
        java.lang.String str31 = sample26.toString();
        java.lang.String str32 = sample26.toString();
        keepingAll20.add(sample26);
        laccan.devices.Type type34 = laccan.devices.Type.FULL;
        sample26.setType(type34);
        java.lang.String str36 = sample26.toString();
        java.lang.String[] strArray37 = sample26.toCSV();
        storageCSV2.save(strArray37);
        try {
            java.util.List<laccan.devices.Sample> sampleList39 = storageCSV2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-19.699999999999996\"");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null;-19.699999999999996;0" + "'", str14.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null;-19.699999999999996;0" + "'", str15.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(sampleList21);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "null;-19.699999999999996;0" + "'", str31.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "null;-19.699999999999996;0" + "'", str32.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + type34 + "' != '" + laccan.devices.Type.FULL + "'", type34.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "null;-19.699999999999996;0" + "'", str36.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray37);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        int int12 = micazMsg1.get_Voltage();
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray20 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg14.set_Buffer(shortArray20);
        micazMsg14.init(16);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray31 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg25.set_Buffer(shortArray31);
        micazMsg25.set_Voltage(2);
        short short36 = micazMsg25.getElement_Buffer((int) (short) 0);
        int int37 = micazMsg25.get_NodeID();
        byte[] byteArray38 = micazMsg25.dataGet();
        micazMsg14.dataSet(byteArray38);
        laccan.devices.MicazMsg micazMsg40 = new laccan.devices.MicazMsg(byteArray38);
        try {
            micazMsg1.dataSet(byteArray38, (int) (byte) 100, (int) '4', 512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 0 + "'", short36 == (short) 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(byteArray38);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) (byte) 10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg11, 16);
        try {
            laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg11, 160, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 160, data_length 35 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) (byte) 10);
        short[] shortArray12 = micazMsg1.get_Buffer();
        try {
            short short14 = micazMsg1.getElement_Buffer((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray12);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer(160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        try {
            short short10 = micazMsg1.getElement_Buffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        try {
            laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("full_memory");
        try {
            java.util.List<laccan.devices.Sample> sampleList5 = storageCSV2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-19.699999999999996\"");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("memory", (double) 0, (long) (-1));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        int int1 = laccan.devices.MicazMsg.offset_Buffer(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        java.lang.Object obj8 = micazMsg1.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        byte[] byteArray10 = null;
        try {
            micazMsg1.dataSet(byteArray10, (int) (short) 0, (int) 'a', 172);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        java.lang.String str6 = sample4.getNode();
        double double7 = sample4.getDateDouble();
        double double8 = sample4.getTemperature();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-19.699999999999996d) + "'", double8 == (-19.699999999999996d));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        int int1 = laccan.devices.MicazMsg.offset_Buffer((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        net.tinyos.message.Message message6 = micazMsg1.clone(512);
        int int7 = message6.dataLength();
        message6.init(0);
        net.tinyos.message.Message message11 = message6.clone((int) (short) 10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg13);
        net.tinyos.message.Message message18 = micazMsg13.clone(512);
        byte[] byteArray19 = message18.dataGet();
        java.lang.Class<?> wildcardClass20 = byteArray19.getClass();
        try {
            message11.dataSet(byteArray19, (int) 'a', 20, 172);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertNotNull(message11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(message18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        laccan.devices.helper.utils.Assistant.predictorType = "init";
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        net.tinyos.message.Message message6 = micazMsg1.clone(512);
        int int7 = message6.dataLength();
        message6.init(0);
        net.tinyos.message.Message message11 = message6.clone((int) (short) 10);
        byte[] byteArray12 = message6.dataGet();
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray12, (-1));
        try {
            short[] shortArray15 = micazMsg14.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertNotNull(message11);
        org.junit.Assert.assertNotNull(byteArray12);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        laccan.devices.helper.utils.Assistant.reducerType = "null;0.0;0";
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        short[] shortArray12 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
        byte[] byteArray15 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray15, (-1));
        try {
            int int18 = micazMsg17.get_NodeID();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        micazMsg1.init(0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        try {
            micazMsg1.set_Buffer(shortArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(shortArray10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) ' ');
        try {
            laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 100, data_length 24 and data array size 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        laccan.devices.helper.utils.Assistant.predictorType = "";
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        short short12 = micazMsg1.getElement_Buffer((int) (short) 0);
        int int13 = micazMsg1.dataLength();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        micazMsg15.set_Voltage((int) '#');
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg15, (long) (short) 10);
        java.lang.Object obj20 = micazMsg15.clone();
        java.lang.Object obj21 = micazMsg15.clone();
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg15, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        short[] shortArray12 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 52, (int) (byte) -1);
        java.lang.String str18 = micazMsg17.toString();
        try {
            laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length -1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str18.equals("Message <MicazMsg> \n  [Buffer="));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        int int1 = laccan.devices.MicazMsg.offset_Buffer(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n", (-19.648499999999995d), 1L);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        laccan.devices.helper.utils.Assistant.predictorType = "reduction";
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) (byte) 10);
        short[] shortArray12 = micazMsg1.get_Buffer();
        net.tinyos.message.SerialPacket serialPacket13 = micazMsg1.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNull(serialPacket13);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        sample4.setTemperature((double) 16);
        double double7 = sample4.getDateDouble();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) (byte) 10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg11, 16);
        net.tinyos.message.Message message15 = micazMsg13.clone((int) ' ');
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg13);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray24 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg18.set_Buffer(shortArray24);
        micazMsg18.set_Voltage(2);
        short short29 = micazMsg18.getElement_Buffer((int) (short) 0);
        int int30 = micazMsg18.get_NodeID();
        byte[] byteArray31 = micazMsg18.dataGet();
        try {
            micazMsg13.dataSet(byteArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(message15);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 0 + "'", short29 == (short) 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteArray31);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        laccan.devices.helper.utils.Assistant.predictorType = "full_memory";
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        try {
            java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
            org.junit.Assert.fail("Expected exception of type java.nio.file.InvalidPathException; message: Illegal char <<> at index 8: Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        } catch (java.nio.file.InvalidPathException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        micazMsg1.init(0);
        micazMsg1.amTypeSet(35);
        try {
            micazMsg1.set_Voltage((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) '#', (int) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("Message <MicazMsg> \n  [Buffer=");
        laccan.persistence.StorageCSV storageCSV5 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV5.local("");
        laccan.persistence.StorageCSV storageCSV9 = storageCSV7.local("full_memory");
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        java.lang.Object obj13 = micazMsg11.clone();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg11);
        laccan.devices.Type type15 = null;
        sample14.setType(type15);
        laccan.devices.Type type17 = null;
        sample14.setType(type17);
        java.lang.String str19 = sample14.toString();
        java.lang.String str20 = sample14.toString();
        sample14.setDate((-1L));
        java.lang.String[] strArray23 = sample14.toCSV();
        storageCSV7.save(strArray23);
        try {
            storageCSV2.save(strArray23);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: A sintaxe do nome do arquivo, do nome do diretório ou do rótulo do volume está incorreta");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null;-19.699999999999996;0" + "'", str19.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null;-19.699999999999996;0" + "'", str20.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        long long3 = sample1.getDate();
        java.lang.String str4 = sample1.toString();
        long long5 = sample1.getDate();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null;0.0;0" + "'", str4.equals("null;0.0;0"));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        short[] shortArray12 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
        int int15 = micazMsg1.get_Voltage();
        try {
            short short17 = micazMsg1.getElement_Buffer(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        micazMsg1.init((int) (byte) 1);
        net.tinyos.message.Message message15 = micazMsg1.clone((int) '#');
        laccan.devices.helper.utils.Assistant.toFog(message15);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(message15);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer(24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        short[] shortArray4 = micazMsg1.get_Buffer();
        byte[] byteArray5 = micazMsg1.dataGet();
        int int6 = micazMsg1.amType();
        java.lang.String str7 = micazMsg1.toString();
        java.lang.Class<?> wildcardClass8 = micazMsg1.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 172 + "'", int6 == 172);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV0.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n");
        laccan.persistence.StorageCSV storageCSV5 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV5.local("");
        laccan.persistence.StorageCSV storageCSV9 = storageCSV7.local("full_memory");
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        java.lang.Object obj13 = micazMsg11.clone();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg11);
        laccan.devices.Type type15 = null;
        sample14.setType(type15);
        laccan.devices.Type type17 = null;
        sample14.setType(type17);
        java.lang.String str19 = sample14.toString();
        java.lang.String str20 = sample14.toString();
        sample14.setDate((-1L));
        java.lang.String[] strArray23 = sample14.toCSV();
        storageCSV7.save(strArray23);
        laccan.memory.data.reduction.KeepingAll keepingAll25 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList26 = keepingAll25.get();
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray29 = micazMsg28.get_Buffer();
        java.lang.Object obj30 = micazMsg28.clone();
        laccan.devices.Sample sample31 = new laccan.devices.Sample(micazMsg28);
        laccan.devices.Type type32 = null;
        sample31.setType(type32);
        laccan.devices.Type type34 = null;
        sample31.setType(type34);
        java.lang.String str36 = sample31.toString();
        java.lang.String str37 = sample31.toString();
        keepingAll25.add(sample31);
        laccan.devices.Type type39 = laccan.devices.Type.FULL;
        sample31.setType(type39);
        java.lang.String str41 = sample31.toString();
        java.lang.String[] strArray42 = sample31.toCSV();
        storageCSV7.save(strArray42);
        try {
            storageCSV4.save(strArray42);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: A sintaxe do nome do arquivo, do nome do diretório ou do rótulo do volume está incorreta");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null;-19.699999999999996;0" + "'", str19.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null;-19.699999999999996;0" + "'", str20.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(sampleList26);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "null;-19.699999999999996;0" + "'", str36.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "null;-19.699999999999996;0" + "'", str37.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + type39 + "' != '" + laccan.devices.Type.FULL + "'", type39.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "null;-19.699999999999996;0" + "'", str41.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray42);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (short) -1, (long) 512, 8);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        try {
            micazMsg1.setElement_Buffer(10, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        laccan.devices.helper.utils.Assistant.reducerType = "nodes";
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.amType();
        byte[] byteArray3 = micazMsg1.dataGet();
        try {
            laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg(byteArray3, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 10, data_length 100 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172 + "'", int2 == 172);
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        laccan.devices.helper.utils.Assistant.reducerType = "lastReading;100.0;10";
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        memory0.build();
        int int3 = memory0.length();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer(172);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg12.set_Buffer(shortArray18);
        micazMsg12.set_Voltage(2);
        short short23 = micazMsg12.getElement_Buffer((int) (short) 0);
        int int24 = micazMsg12.get_NodeID();
        byte[] byteArray25 = micazMsg12.dataGet();
        micazMsg1.dataSet(byteArray25);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray25);
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg27);
        double double29 = sample28.getTemperature();
        java.lang.String str30 = sample28.toString();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-19.648499999999995d) + "'", double29 == (-19.648499999999995d));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "null;-19.648499999999995;0" + "'", str30.equals("null;-19.648499999999995;0"));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer(2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV0.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n");
        laccan.persistence.StorageCSV storageCSV5 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV5.local("");
        laccan.persistence.StorageCSV storageCSV9 = storageCSV7.local("full_memory");
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        java.lang.Object obj13 = micazMsg11.clone();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg11);
        laccan.devices.Type type15 = null;
        sample14.setType(type15);
        laccan.devices.Type type17 = null;
        sample14.setType(type17);
        java.lang.String str19 = sample14.toString();
        java.lang.String str20 = sample14.toString();
        sample14.setDate((-1L));
        java.lang.String[] strArray23 = sample14.toCSV();
        storageCSV7.save(strArray23);
        try {
            storageCSV0.save(strArray23);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: A sintaxe do nome do arquivo, do nome do diretório ou do rótulo do volume está incorreta");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null;-19.699999999999996;0" + "'", str19.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null;-19.699999999999996;0" + "'", str20.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("reduction", (double) 100L, (long) (byte) 1);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        laccan.devices.Type type7 = null;
        sample4.setType(type7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg10);
        long long14 = sample13.getDate();
        java.lang.String str15 = sample13.getNode();
        laccan.devices.Type type16 = null;
        sample13.setType(type16);
        java.lang.String str18 = sample13.getNode();
        double double19 = sample13.getTemperature();
        laccan.devices.Sample[] sampleArray20 = new laccan.devices.Sample[] { sample4, sample13 };
        java.util.ArrayList<laccan.devices.Sample> sampleList21 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList21, sampleArray20);
        java.util.List<java.lang.Double> doubleList23 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList21);
        java.lang.Class<?> wildcardClass24 = doubleList23.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-19.699999999999996d) + "'", double19 == (-19.699999999999996d));
        org.junit.Assert.assertNotNull(sampleArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        int int1 = laccan.devices.MicazMsg.offset_Buffer((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 'a', (long) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        short[] shortArray12 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
        int int15 = micazMsg1.amType();
        try {
            micazMsg1.setElement_Buffer(20, (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 172 + "'", int15 == 172);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 2);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 52, 0);
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg1, (long) (-1));
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray23 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg17.set_Buffer(shortArray23);
        micazMsg17.set_Voltage(2);
        short short28 = micazMsg17.getElement_Buffer((int) (short) 0);
        int int29 = micazMsg17.dataLength();
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg17, 512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 0 + "'", short28 == (short) 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        short[] shortArray12 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
        try {
            micazMsg1.setElement_Buffer(16, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        micazMsg1.init(2);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        micazMsg9.setElement_Buffer(0, (short) 10);
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg9, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(shortArray10);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 2);
        micazMsg1.setElement_Buffer(1, (short) (byte) 100);
        try {
            micazMsg1.setElement_Buffer(48, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        net.tinyos.message.Message message6 = micazMsg1.clone(512);
        int int7 = message6.dataLength();
        message6.init(0);
        net.tinyos.message.Message message11 = message6.clone((int) (short) 10);
        byte[] byteArray12 = message6.dataGet();
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray12, (-1));
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray12, (int) (byte) -1);
        try {
            laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray12, 32, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 32, data_length -1 and data array size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertNotNull(message11);
        org.junit.Assert.assertNotNull(byteArray12);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        try {
            micazMsg1.setElement_Buffer(48, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        laccan.devices.helper.utils.Assistant.predictorType = "Message <MicazMsg> \n  [Buffer=";
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (byte) 1, (long) 52, 4);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        java.util.List<laccan.devices.Sample> sampleList3 = storageCSV2.read();
        laccan.persistence.StorageCSV storageCSV5 = storageCSV2.local("");
        java.lang.String[] strArray6 = laccan.devices.helper.utils.Assistant.environments;
        try {
            storageCSV2.save(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: O sistema não pode encontrar o caminho especificado");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(storageCSV5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        java.lang.String[] strArray7 = sample6.toCSV();
        sample6.setTemperature((double) 100.0f);
        java.lang.String[] strArray10 = sample6.toCSV();
        double double11 = sample6.getDateDouble();
        laccan.devices.Type type12 = sample6.getType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(type12);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
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
        java.util.List<laccan.devices.Sample> sampleList15 = null;
        laccan.cloud.prediction.Regression regression16 = new laccan.cloud.prediction.Regression();
        laccan.cloud.prediction.Regression regression17 = new laccan.cloud.prediction.Regression();
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
        java.util.List<java.lang.Double> doubleList29 = regression17.result(doubleList28);
        java.util.List<java.lang.Double> doubleList30 = regression16.result(doubleList29);
        laccan.persistence.StorageCSV storageCSV31 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV33 = storageCSV31.local("");
        java.util.List<laccan.devices.Sample> sampleList34 = storageCSV33.read();
        java.util.List<java.lang.Double> doubleList35 = laccan.cloud.prediction.Regression.makeTests(sampleList34);
        laccan.persistence.StorageCSV storageCSV36 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV38 = storageCSV36.local("");
        java.util.List<laccan.devices.Sample> sampleList39 = storageCSV38.read();
        java.util.List<java.lang.Double> doubleList40 = laccan.cloud.prediction.Regression.makeTests(sampleList39);
        regression16.init(sampleList34, doubleList40);
        laccan.cloud.prediction.Regression regression42 = new laccan.cloud.prediction.Regression();
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
        java.util.List<java.lang.Double> doubleList56 = regression42.result(doubleList55);
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
        java.util.List<laccan.devices.Sample> sampleList70 = null;
        laccan.cloud.prediction.Regression regression71 = new laccan.cloud.prediction.Regression();
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
        java.util.List<java.lang.Double> doubleList85 = regression71.result(doubleList84);
        regression57.init(sampleList70, doubleList84);
        java.util.List<java.lang.Double> doubleList87 = regression42.result(doubleList84);
        java.util.List<java.lang.Double> doubleList88 = regression16.result(doubleList84);
        regression0.init(sampleList15, doubleList88);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(sampleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(sampleArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(doubleList28);
        org.junit.Assert.assertNotNull(doubleList29);
        org.junit.Assert.assertNotNull(doubleList30);
        org.junit.Assert.assertNotNull(storageCSV33);
        org.junit.Assert.assertNotNull(sampleList34);
        org.junit.Assert.assertNotNull(doubleList35);
        org.junit.Assert.assertNotNull(storageCSV38);
        org.junit.Assert.assertNotNull(sampleList39);
        org.junit.Assert.assertNotNull(doubleList40);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(sampleArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(doubleList54);
        org.junit.Assert.assertNotNull(doubleList55);
        org.junit.Assert.assertNotNull(doubleList56);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(sampleArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(doubleList68);
        org.junit.Assert.assertNotNull(doubleList69);
        org.junit.Assert.assertNotNull(shortArray75);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertNotNull(sampleArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(doubleList83);
        org.junit.Assert.assertNotNull(doubleList84);
        org.junit.Assert.assertNotNull(doubleList85);
        org.junit.Assert.assertNotNull(doubleList87);
        org.junit.Assert.assertNotNull(doubleList88);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        micazMsg1.init(0);
        micazMsg1.amTypeSet(35);
        try {
            micazMsg1.set_Voltage((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 100 };
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        micazMsg7.amTypeSet(32);
        micazMsg7.amTypeSet((int) (byte) 1);
        int int12 = micazMsg7.get_NodeID();
        try {
            short[] shortArray13 = micazMsg7.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (48) or length (16), for data_length 6 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(160);
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1, (long) '4');
        try {
            short short5 = micazMsg1.getElement_Buffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (short) 0, 35);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("init", (double) '#', (long) 1);
        java.lang.String str4 = sample3.getNode();
        sample3.setDate((long) (byte) 0);
        long long7 = sample3.getDate();
        java.lang.String str8 = sample3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "init" + "'", str4.equals("init"));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "init;35.0;0" + "'", str8.equals("init;35.0;0"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        micazMsg1.init((int) (byte) 1);
        net.tinyos.message.Message message15 = micazMsg1.clone((int) '#');
        java.lang.Object obj16 = message15.clone();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(message15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) (byte) 10);
        micazMsg11.init((int) (byte) 0);
        try {
            laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg11, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 35, data_length 24 and data array size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 2);
        micazMsg1.setElement_Buffer(1, (short) (byte) 100);
        try {
            laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 100, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        short[] shortArray4 = micazMsg1.get_Buffer();
        int int5 = micazMsg1.get_NodeID();
        java.lang.Class<?> wildcardClass6 = micazMsg1.getClass();
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1);
        byte[] byteArray8 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg10.set_Buffer(shortArray16);
        micazMsg10.set_Voltage(2);
        short short21 = micazMsg10.getElement_Buffer((int) (short) 0);
        int int22 = micazMsg10.get_NodeID();
        byte[] byteArray23 = micazMsg10.dataGet();
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.get_NodeID();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg10);
        short[] shortArray13 = micazMsg10.get_Buffer();
        byte[] byteArray14 = micazMsg10.dataGet();
        try {
            micazMsg1.dataSet(byteArray14, (int) '#', 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(byteArray14);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg(byteArray2, 4);
        try {
            int int6 = micazMsg5.get_Voltage();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length -2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        net.tinyos.message.Message message6 = micazMsg1.clone(512);
        int int7 = message6.dataLength();
        message6.init(0);
        net.tinyos.message.Message message11 = message6.clone((int) (short) 10);
        message6.amTypeSet(20);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertNotNull(message11);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        long long3 = sample1.getDate();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5);
        long long9 = sample8.getDate();
        laccan.memory.data.reduction.KeepingAll keepingAll10 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample11 = new laccan.devices.Sample();
        keepingAll10.add(sample11);
        long long13 = sample11.getDate();
        laccan.memory.data.reduction.KeepingAll keepingAll14 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray22 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg16.set_Buffer(shortArray22);
        micazMsg16.set_Voltage(2);
        java.lang.String str26 = micazMsg16.toString();
        short[] shortArray27 = micazMsg16.get_Buffer();
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg16);
        keepingAll14.add(sample28);
        sample28.setTemperature((double) (short) 100);
        laccan.memory.data.reduction.KeepingAll keepingAll32 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray40 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg34.set_Buffer(shortArray40);
        micazMsg34.set_Voltage(2);
        java.lang.String str44 = micazMsg34.toString();
        short[] shortArray45 = micazMsg34.get_Buffer();
        laccan.devices.Sample sample46 = new laccan.devices.Sample(micazMsg34);
        keepingAll32.add(sample46);
        laccan.devices.MicazMsg micazMsg49 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray50 = micazMsg49.get_Buffer();
        java.lang.Object obj51 = micazMsg49.clone();
        laccan.devices.Sample sample52 = new laccan.devices.Sample(micazMsg49);
        laccan.devices.Type type53 = null;
        sample52.setType(type53);
        double double55 = sample52.getDateDouble();
        laccan.devices.Sample sample59 = new laccan.devices.Sample("lastReading", (double) (short) 0, (long) '4');
        laccan.devices.MicazMsg micazMsg61 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray62 = micazMsg61.get_Buffer();
        java.lang.Object obj63 = micazMsg61.clone();
        laccan.devices.Sample sample64 = new laccan.devices.Sample(micazMsg61);
        laccan.devices.Type type65 = null;
        sample64.setType(type65);
        laccan.devices.Type type67 = null;
        sample64.setType(type67);
        java.lang.String str69 = sample64.toString();
        sample64.setNode("");
        laccan.devices.MicazMsg micazMsg73 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray74 = micazMsg73.get_Buffer();
        java.lang.Object obj75 = micazMsg73.clone();
        laccan.devices.Sample sample76 = new laccan.devices.Sample(micazMsg73);
        laccan.devices.Type type77 = null;
        sample76.setType(type77);
        sample76.setNode("null;-19.699999999999996;0");
        laccan.devices.MicazMsg micazMsg82 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray83 = micazMsg82.get_Buffer();
        java.lang.Object obj84 = micazMsg82.clone();
        laccan.devices.Sample sample85 = new laccan.devices.Sample(micazMsg82);
        laccan.devices.Type type86 = null;
        sample85.setType(type86);
        sample85.setNode("null;-19.699999999999996;0");
        laccan.devices.Sample[] sampleArray90 = new laccan.devices.Sample[] { sample1, sample8, sample11, sample28, sample46, sample52, sample59, sample64, sample76, sample85 };
        java.util.ArrayList<laccan.devices.Sample> sampleList91 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList91, sampleArray90);
        java.util.List<java.lang.Double> doubleList93 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList91);
        java.util.List<java.lang.Double> doubleList94 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList91);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str26.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str44.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "null;-19.699999999999996;0" + "'", str69.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertNotNull(shortArray83);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertNotNull(sampleArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(doubleList93);
        org.junit.Assert.assertNotNull(doubleList94);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (short) 0, 2);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("Message <MicazMsg> \n  [Buffer=");
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        long long10 = sample9.getDate();
        java.lang.String str11 = sample9.getNode();
        laccan.devices.Type type12 = null;
        sample9.setType(type12);
        java.lang.String str14 = sample9.getNode();
        java.lang.String[] strArray15 = sample9.toCSV();
        try {
            storageCSV2.save(strArray15);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: A sintaxe do nome do arquivo, do nome do diretório ou do rótulo do volume está incorreta");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (byte) 10, (long) 24, 512);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        micazMsg1.init((int) (byte) 1);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        micazMsg15.amTypeSet(20);
        int int20 = micazMsg15.baseOffset();
        micazMsg15.set_Voltage((int) (byte) 100);
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg15, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(48, (int) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 100 };
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        micazMsg7.amTypeSet(32);
        micazMsg7.amTypeSet((int) (byte) 1);
        try {
            micazMsg7.setElement_Buffer(1, (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (48) or length (16), for data_length 6 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        short short12 = micazMsg1.getElement_Buffer((int) (short) 0);
        int int13 = micazMsg1.get_NodeID();
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg15.set_Buffer(shortArray21);
        micazMsg15.set_Voltage(2);
        short short26 = micazMsg15.getElement_Buffer((int) (short) 0);
        int int27 = micazMsg15.dataLength();
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg15, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 0 + "'", short26 == (short) 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) (byte) 10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg11, 16);
        net.tinyos.message.Message message15 = micazMsg13.clone((int) ' ');
        try {
            laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg13, 52, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 68, data_length 52 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(message15);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 1, 160);
        byte[] byteArray3 = micazMsg2.dataGet();
        try {
            int int4 = micazMsg2.get_NodeID();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (0) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        short[] shortArray4 = micazMsg1.get_Buffer();
        byte[] byteArray5 = micazMsg1.dataGet();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray6, 172);
        short[] shortArray13 = new short[] { (byte) 100, (byte) -1, (short) 1, (byte) 100 };
        try {
            micazMsg8.set_Buffer(shortArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length -120 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(shortArray13);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.Container container3 = memory0.getMemory();
        laccan.memory.Container container4 = memory0.getMemory();
        int int5 = container4.length();
        java.util.List<laccan.devices.Sample> sampleList6 = container4.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(sampleList6);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (byte) -1, (long) 0, (-1));
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV0.local("lastReading;100.0;10");
        java.util.List<laccan.devices.Sample> sampleList5 = storageCSV4.read();
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList5);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(172, (int) (short) 0);
        micazMsg2.init(160);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(48, (int) (short) 100);
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray5 = micazMsg4.get_Buffer();
        java.lang.Object obj6 = micazMsg4.clone();
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg4);
        net.tinyos.message.Message message9 = micazMsg4.clone(512);
        byte[] byteArray10 = message9.dataGet();
        java.lang.Class<?> wildcardClass11 = byteArray10.getClass();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray10);
        try {
            micazMsg2.dataSet(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(message9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 52, (long) 16, (int) (byte) 0);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        short[] shortArray12 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        micazMsg1.amTypeSet(32);
        java.lang.Object obj16 = micazMsg1.clone();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(0, (int) (byte) 0);
        try {
            short short4 = micazMsg2.getElement_Buffer(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("full_memory");
        laccan.memory.data.reduction.KeepingAll keepingAll5 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList6 = keepingAll5.get();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg8);
        laccan.devices.Type type12 = null;
        sample11.setType(type12);
        laccan.devices.Type type14 = null;
        sample11.setType(type14);
        java.lang.String str16 = sample11.toString();
        java.lang.String str17 = sample11.toString();
        keepingAll5.add(sample11);
        laccan.devices.Type type19 = laccan.devices.Type.FULL;
        sample11.setType(type19);
        java.lang.String str21 = sample11.toString();
        java.lang.String[] strArray22 = sample11.toCSV();
        storageCSV2.save(strArray22);
        laccan.persistence.StorageCSV storageCSV25 = storageCSV2.local("full_memory");
        try {
            java.util.List<laccan.devices.Sample> sampleList26 = storageCSV2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-19.699999999999996\"");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(sampleList6);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null;-19.699999999999996;0" + "'", str16.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null;-19.699999999999996;0" + "'", str17.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + laccan.devices.Type.FULL + "'", type19.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "null;-19.699999999999996;0" + "'", str21.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(storageCSV25);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        java.lang.String[] strArray7 = sample6.toCSV();
        sample6.setTemperature((double) 100.0f);
        sample6.setDate((long) ' ');
        sample6.setDate((long) (byte) 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        laccan.devices.helper.utils.Assistant.reducerType = "result";
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 2);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 52, 0);
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg1, (long) (-1));
        double double16 = sample15.getDateDouble();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (byte) 1, 0);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        net.tinyos.message.Message message6 = micazMsg1.clone(512);
        byte[] byteArray7 = message6.dataGet();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(message6, (int) '4', (int) (byte) 1);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg10, 4, (int) (short) 100);
        try {
            micazMsg10.setElement_Buffer(100, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.Container container3 = memory0.getMemory();
        laccan.memory.Container container4 = memory0.getMemory();
        laccan.memory.Container container5 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = micazMsg7.get_Buffer();
        java.lang.Object obj9 = micazMsg7.clone();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg7);
        laccan.devices.Type type11 = null;
        sample10.setType(type11);
        laccan.devices.Type type13 = null;
        sample10.setType(type13);
        java.lang.String str15 = sample10.toString();
        java.lang.String str16 = sample10.toString();
        sample10.setDate((-1L));
        java.lang.String[] strArray19 = sample10.toCSV();
        memory0.add(sample10);
        int int21 = memory0.length();
        memory0.build();
        laccan.devices.Sample sample23 = new laccan.devices.Sample();
        memory0.add(sample23);
        memory0.build();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertNotNull(container5);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null;-19.699999999999996;0" + "'", str15.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null;-19.699999999999996;0" + "'", str16.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(20, (int) '4');
        try {
            short[] shortArray3 = micazMsg2.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (160) or length (16), for data_length 20 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg7, (long) (byte) 10);
        double double10 = sample9.getDateDouble();
        laccan.devices.Type type11 = null;
        sample9.setType(type11);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        short[] shortArray4 = micazMsg1.get_Buffer();
        short short6 = micazMsg1.getElement_Buffer(2);
        java.lang.String str7 = micazMsg1.toString();
        try {
            micazMsg1.init((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        net.tinyos.message.Message message0 = null;
        try {
            laccan.devices.helper.utils.Assistant.toFog(message0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        short[] shortArray12 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
        byte[] byteArray15 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray15, (-1));
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray15, 48);
        try {
            laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray15, (int) 'a', 512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 97, data_length 512 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (byte) -1, (long) 100, 100);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg2.set_Buffer(shortArray8);
        micazMsg2.set_Voltage(2);
        java.lang.String str12 = micazMsg2.toString();
        short[] shortArray13 = micazMsg2.get_Buffer();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg2);
        keepingAll0.add(sample14);
        int int16 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        java.lang.Object obj20 = micazMsg18.clone();
        micazMsg18.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg18, (int) (byte) 0);
        int int25 = micazMsg18.baseOffset();
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg18, (long) 2);
        keepingAll0.add(sample27);
        sample27.setDate((long) 512);
        java.lang.String str31 = sample27.getNode();
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        net.tinyos.message.Message message9 = null;
        try {
            micazMsg1.dataSet(message9, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        laccan.devices.helper.utils.Assistant.reducerType = "full_memory";
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests(10L, (long) '#', 0);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        byte[] byteArray0 = new byte[] {};
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(byteArray0, 20);
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) -1 };
        try {
            micazMsg2.dataSet(byteArray9, 16, 35, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 2);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 52, 0);
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg1);
        micazMsg1.setElement_Buffer((int) (short) 0, (short) -1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        try {
            short short9 = micazMsg1.getElement_Buffer((-20));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        int int1 = laccan.devices.MicazMsg.numElements_Buffer((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        short short12 = micazMsg1.getElement_Buffer((int) (short) 0);
        int int13 = micazMsg1.get_NodeID();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg1);
        java.lang.Class<?> wildcardClass15 = sample14.getClass();
        sample14.setDate((long) 10);
        java.lang.String str18 = sample14.getNode();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '#', 4);
        try {
            laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 36, data_length 24 and data array size 39");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(10);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(0, (int) (byte) 0);
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg4.set_Buffer(shortArray10);
        micazMsg4.set_Voltage(2);
        short short15 = micazMsg4.getElement_Buffer((int) (short) 0);
        int int16 = micazMsg4.get_NodeID();
        byte[] byteArray17 = micazMsg4.dataGet();
        try {
            micazMsg2.dataSet(byteArray17, (int) '4', 2, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) (byte) 10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg11, 16);
        net.tinyos.message.Message message15 = micazMsg13.clone((int) ' ');
        int int16 = message15.dataLength();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(message15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 100 };
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        try {
            laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg7, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (48) or length (16), for data_length 6 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        short[] shortArray4 = micazMsg1.get_Buffer();
        byte[] byteArray5 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray5, 16, 1);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray5, (int) (byte) 10, (-1));
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 32, (long) 172, 48);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        short[] shortArray4 = micazMsg2.get_Buffer();
        java.lang.Object obj5 = micazMsg2.clone();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg7.set_Buffer(shortArray13);
        micazMsg7.set_Voltage(2);
        short short18 = micazMsg7.getElement_Buffer((int) (short) 0);
        int int19 = micazMsg7.dataLength();
        short[] shortArray20 = micazMsg7.get_Buffer();
        micazMsg2.set_Buffer(shortArray20);
        int int22 = micazMsg2.amType();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 172 + "'", int22 == 172);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        laccan.devices.Type type7 = null;
        sample4.setType(type7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = micazMsg10.get_Buffer();
        java.lang.Object obj12 = micazMsg10.clone();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg10);
        long long14 = sample13.getDate();
        java.lang.String str15 = sample13.getNode();
        laccan.devices.Type type16 = null;
        sample13.setType(type16);
        java.lang.String str18 = sample13.getNode();
        double double19 = sample13.getTemperature();
        laccan.devices.Sample[] sampleArray20 = new laccan.devices.Sample[] { sample4, sample13 };
        java.util.ArrayList<laccan.devices.Sample> sampleList21 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList21, sampleArray20);
        java.util.List<java.lang.Double> doubleList23 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList21);
        java.util.List<java.lang.Double> doubleList24 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList21);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-19.699999999999996d) + "'", double19 == (-19.699999999999996d));
        org.junit.Assert.assertNotNull(sampleArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleList23);
        org.junit.Assert.assertNotNull(doubleList24);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        net.tinyos.message.Message message0 = null;
        try {
            laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(message0, (int) (byte) -1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(160, 10);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        short[] shortArray4 = micazMsg1.get_Buffer();
        short short6 = micazMsg1.getElement_Buffer(2);
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1);
        sample7.setTemperature((double) 10L);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        java.lang.String str7 = sample6.getNode();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(0, (int) (byte) 0);
        try {
            short[] shortArray3 = micazMsg2.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("Message <MicazMsg> \n  [Buffer=");
        try {
            java.util.List<laccan.devices.Sample> sampleList5 = storageCSV2.read();
            org.junit.Assert.fail("Expected exception of type java.nio.file.InvalidPathException; message: Illegal char <<> at index 8: Message <MicazMsg> \n  [Buffer=");
        } catch (java.nio.file.InvalidPathException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("full_memory");
        laccan.persistence.StorageCSV storageCSV6 = storageCSV2.local("");
        laccan.persistence.StorageCSV storageCSV8 = storageCSV2.local("full_memory");
        laccan.persistence.StorageCSV storageCSV10 = storageCSV2.local("full_memory");
        try {
            java.util.List<laccan.devices.Sample> sampleList11 = storageCSV2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-19.699999999999996\"");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(storageCSV6);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
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
        java.util.List<java.lang.Double> doubleList14 = null;
        try {
            java.util.List<java.lang.Double> doubleList15 = regression0.result(doubleList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(sampleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals((double) double13, Double.NaN, 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        short[] shortArray12 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
        int int15 = micazMsg1.amType();
        micazMsg1.amTypeSet((int) (short) 0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 172 + "'", int15 == 172);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.Container container3 = memory0.getMemory();
        laccan.memory.Container container4 = memory0.getMemory();
        laccan.memory.data.reduction.KeepingAll keepingAll5 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample6 = new laccan.devices.Sample();
        keepingAll5.add(sample6);
        java.lang.String str8 = sample6.getNode();
        laccan.devices.Type type9 = sample6.getType();
        sample6.setTemperature((double) 0);
        memory0.add(sample6);
        memory0.build();
        int int14 = memory0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(type9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV3 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV5 = storageCSV3.local("");
        laccan.persistence.StorageCSV storageCSV7 = storageCSV5.local("full_memory");
        laccan.persistence.StorageCSV storageCSV9 = storageCSV5.local("");
        laccan.persistence.StorageCSV storageCSV11 = storageCSV5.local("full_memory");
        laccan.persistence.StorageCSV storageCSV13 = storageCSV5.local("full_memory");
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        micazMsg15.amTypeSet(20);
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg15);
        java.lang.String[] strArray21 = sample20.toCSV();
        sample20.setTemperature((double) 100.0f);
        java.lang.String[] strArray24 = sample20.toCSV();
        storageCSV5.save(strArray24);
        try {
            storageCSV2.save(strArray24);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: O sistema não pode encontrar o caminho especificado");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV5);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer((-20));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg12.set_Buffer(shortArray18);
        micazMsg12.set_Voltage(2);
        short short23 = micazMsg12.getElement_Buffer((int) (short) 0);
        int int24 = micazMsg12.get_NodeID();
        byte[] byteArray25 = micazMsg12.dataGet();
        micazMsg1.dataSet(byteArray25);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray25);
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg27);
        short[] shortArray29 = micazMsg27.get_Buffer();
        try {
            micazMsg27.setElement_Buffer(10, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(shortArray29);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        laccan.devices.Sample sample0 = new laccan.devices.Sample();
        laccan.devices.Type type1 = laccan.devices.Type.FULL;
        sample0.setType(type1);
        java.lang.String str3 = sample0.toString();
        sample0.setTemperature((double) ' ');
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + laccan.devices.Type.FULL + "'", type1.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null;0.0;0" + "'", str3.equals("null;0.0;0"));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(172, 512);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) (byte) 100, (long) (short) 1, (int) '4');
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        micazMsg1.init((int) (byte) 1);
        try {
            laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 16, (int) (short) 10);
        micazMsg2.amTypeSet((int) (byte) 1);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg9.set_Buffer(shortArray15);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg9, 0, (int) (byte) 10);
        short[] shortArray20 = micazMsg9.get_Buffer();
        micazMsg2.set_Buffer(shortArray20);
        net.tinyos.message.SerialPacket serialPacket22 = micazMsg2.getSerialPacket();
        try {
            micazMsg2.setElement_Buffer((int) (byte) 10, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNull(serialPacket22);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        laccan.devices.helper.utils.Assistant.reducerType = "Message <MicazMsg> \n  [Buffer=";
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 2);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 52, 0);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, 48);
        java.lang.Object obj17 = micazMsg1.clone();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (byte) 0, 3);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        net.tinyos.message.Message message0 = null;
        try {
            laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(message0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 48, (long) (byte) -1, (-20));
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        laccan.persistence.StorageCSV storageCSV1 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV3 = storageCSV1.local("");
        java.util.List<laccan.devices.Sample> sampleList4 = storageCSV3.read();
        laccan.cloud.prediction.Regression regression5 = new laccan.cloud.prediction.Regression();
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
        java.util.List<java.lang.Double> doubleList19 = regression5.result(doubleList18);
        double double20 = regression5.mse();
        laccan.cloud.prediction.Regression regression21 = new laccan.cloud.prediction.Regression();
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
        java.lang.Double[] doubleArray36 = new java.lang.Double[] { (-1.0d) };
        java.util.ArrayList<java.lang.Double> doubleList37 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList37, doubleArray36);
        java.util.List<java.lang.Double> doubleList39 = regression22.result((java.util.List<java.lang.Double>) doubleList37);
        java.util.List<java.lang.Double> doubleList40 = regression21.result(doubleList39);
        java.util.List<java.lang.Double> doubleList41 = regression5.result(doubleList39);
        regression0.init(sampleList4, doubleList41);
        java.util.List<java.lang.Double> doubleList43 = laccan.cloud.prediction.Regression.makeTests(sampleList4);
        org.junit.Assert.assertNotNull(storageCSV3);
        org.junit.Assert.assertNotNull(sampleList4);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(sampleArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNotNull(doubleList18);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertEquals((double) double20, Double.NaN, 0);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(sampleArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doubleList33);
        org.junit.Assert.assertNotNull(doubleList34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doubleList39);
        org.junit.Assert.assertNotNull(doubleList40);
        org.junit.Assert.assertNotNull(doubleList41);
        org.junit.Assert.assertNotNull(doubleList43);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        sample4.setDate((long) (-1));
        laccan.devices.Type type8 = sample4.getType();
        laccan.devices.Type type9 = null;
        sample4.setType(type9);
        double double11 = sample4.getDateDouble();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        java.lang.Object obj8 = micazMsg1.clone();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((int) '4');
        int int11 = micazMsg10.amType();
        byte[] byteArray12 = micazMsg10.dataGet();
        micazMsg1.dataSet(byteArray12);
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg1, 1L);
        sample15.setDate((long) 35);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 172 + "'", int11 == 172);
        org.junit.Assert.assertNotNull(byteArray12);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        laccan.memory.data.reduction.KeepingAll keepingAll2 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg4.set_Buffer(shortArray10);
        micazMsg4.set_Voltage(2);
        java.lang.String str14 = micazMsg4.toString();
        short[] shortArray15 = micazMsg4.get_Buffer();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg4);
        keepingAll2.add(sample16);
        int int18 = keepingAll2.length();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = micazMsg20.get_Buffer();
        java.lang.Object obj22 = micazMsg20.clone();
        micazMsg20.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg20, (int) (byte) 0);
        int int27 = micazMsg20.baseOffset();
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg20, (long) 2);
        keepingAll2.add(sample29);
        memory0.add(sample29);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray39 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg33.set_Buffer(shortArray39);
        micazMsg33.set_Voltage(2);
        java.lang.String str43 = micazMsg33.toString();
        short[] shortArray44 = micazMsg33.get_Buffer();
        laccan.devices.Sample sample45 = new laccan.devices.Sample(micazMsg33);
        laccan.devices.Sample sample46 = new laccan.devices.Sample();
        laccan.devices.Type type47 = laccan.devices.Type.FULL;
        sample46.setType(type47);
        sample45.setType(type47);
        long long50 = sample45.getDate();
        java.lang.String str51 = sample45.toString();
        memory0.add(sample45);
        laccan.devices.MicazMsg micazMsg55 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        laccan.devices.MicazMsg micazMsg58 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg55, 16, (int) (short) 10);
        micazMsg55.amTypeSet((int) (byte) 1);
        java.lang.String str61 = micazMsg55.toString();
        laccan.devices.Sample sample62 = new laccan.devices.Sample(micazMsg55);
        memory0.add(sample62);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str14.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str43.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertTrue("'" + type47 + "' != '" + laccan.devices.Type.FULL + "'", type47.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "null;-19.648499999999995;0" + "'", str51.equals("null;-19.648499999999995;0"));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str61.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("Message <MicazMsg> \n  [Buffer=");
        laccan.persistence.StorageCSV storageCSV5 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV5.local("");
        laccan.persistence.StorageCSV storageCSV9 = storageCSV7.local("full_memory");
        laccan.persistence.StorageCSV storageCSV11 = storageCSV9.local("reduction");
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        micazMsg13.amTypeSet(20);
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg13);
        java.lang.String[] strArray19 = sample18.toCSV();
        storageCSV9.save(strArray19);
        try {
            storageCSV4.save(strArray19);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: A sintaxe do nome do arquivo, do nome do diretório ou do rótulo do volume está incorreta");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        net.tinyos.message.Message message7 = null;
        try {
            micazMsg1.dataSet(message7, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        byte[] byteArray0 = new byte[] {};
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(byteArray0, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray0);
        try {
            laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        try {
            short short8 = micazMsg1.getElement_Buffer((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg12.set_Buffer(shortArray18);
        micazMsg12.set_Voltage(2);
        short short23 = micazMsg12.getElement_Buffer((int) (short) 0);
        int int24 = micazMsg12.get_NodeID();
        byte[] byteArray25 = micazMsg12.dataGet();
        micazMsg1.dataSet(byteArray25);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray25);
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg27);
        laccan.devices.Type type29 = sample28.getType();
        sample28.setDate((long) 10);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNull(type29);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        net.tinyos.message.SerialPacket serialPacket11 = micazMsg1.getSerialPacket();
        micazMsg1.init((int) (short) 10);
        try {
            short[] shortArray14 = micazMsg1.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (80) or length (16), for data_length 10 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNull(serialPacket11);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg2.set_Buffer(shortArray8);
        micazMsg2.set_Voltage(2);
        java.lang.String str12 = micazMsg2.toString();
        short[] shortArray13 = micazMsg2.get_Buffer();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg2);
        keepingAll0.add(sample14);
        laccan.devices.Type type16 = sample14.getType();
        double double17 = sample14.getDateDouble();
        sample14.setTemperature((double) 4);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNull(type16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        short[] shortArray4 = micazMsg2.get_Buffer();
        java.lang.Object obj5 = micazMsg2.clone();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = micazMsg7.get_Buffer();
        java.lang.Object obj9 = micazMsg7.clone();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg7);
        net.tinyos.message.Message message12 = micazMsg7.clone(512);
        byte[] byteArray13 = message12.dataGet();
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray13);
        micazMsg2.dataSet(byteArray13);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(message12);
        org.junit.Assert.assertNotNull(byteArray13);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.amType();
        byte[] byteArray3 = micazMsg1.dataGet();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        int int5 = micazMsg1.get_NodeID();
        java.lang.Object obj6 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket7 = micazMsg1.getSerialPacket();
        byte[] byteArray8 = null;
        try {
            micazMsg1.dataSet(byteArray8, (int) ' ', 24, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172 + "'", int2 == 172);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(serialPacket7);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        java.lang.Object obj6 = micazMsg1.clone();
        java.lang.Object obj7 = micazMsg1.clone();
        micazMsg1.amTypeSet((int) (byte) -1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) (byte) 100);
        java.lang.Object obj2 = micazMsg1.clone();
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) (byte) 10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg11, 16);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg16, 16, (int) (short) 10);
        micazMsg16.amTypeSet((int) (byte) 1);
        micazMsg16.set_Voltage(48);
        short[] shortArray24 = micazMsg16.get_Buffer();
        micazMsg13.set_Buffer(shortArray24);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj29 = micazMsg28.clone();
        short[] shortArray30 = micazMsg28.get_Buffer();
        java.lang.Object obj31 = micazMsg28.clone();
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray39 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg33.set_Buffer(shortArray39);
        micazMsg33.set_Voltage(2);
        short short44 = micazMsg33.getElement_Buffer((int) (short) 0);
        int int45 = micazMsg33.dataLength();
        short[] shortArray46 = micazMsg33.get_Buffer();
        micazMsg28.set_Buffer(shortArray46);
        micazMsg13.set_Buffer(shortArray46);
        short[] shortArray49 = micazMsg13.get_Buffer();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 0 + "'", short44 == (short) 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertNotNull(shortArray49);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
        laccan.persistence.StorageCSV storageCSV5 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV5.local("");
        laccan.persistence.StorageCSV storageCSV9 = storageCSV7.local("full_memory");
        laccan.persistence.StorageCSV storageCSV11 = storageCSV7.local("");
        laccan.persistence.StorageCSV storageCSV13 = storageCSV7.local("full_memory");
        laccan.persistence.StorageCSV storageCSV15 = storageCSV7.local("full_memory");
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        micazMsg17.amTypeSet(20);
        laccan.devices.Sample sample22 = new laccan.devices.Sample(micazMsg17);
        java.lang.String[] strArray23 = sample22.toCSV();
        sample22.setTemperature((double) 100.0f);
        java.lang.String[] strArray26 = sample22.toCSV();
        storageCSV7.save(strArray26);
        try {
            storageCSV4.save(strArray26);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: A sintaxe do nome do arquivo, do nome do diretório ou do rótulo do volume está incorreta");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(storageCSV15);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 2);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 52, 0);
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg1, (long) (-1));
        int int16 = micazMsg1.get_Voltage();
        short[] shortArray17 = micazMsg1.get_Buffer();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(shortArray17);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        try {
            int int1 = laccan.devices.MicazMsg.offsetBits_Buffer((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '#', 4);
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray5 = micazMsg4.get_Buffer();
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg4);
        short[] shortArray7 = micazMsg4.get_Buffer();
        byte[] byteArray8 = micazMsg4.dataGet();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray8, 16, 1);
        try {
            micazMsg2.dataSet(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.amType();
        byte[] byteArray3 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg5.set_Buffer(shortArray11);
        micazMsg5.set_Voltage(2);
        short short16 = micazMsg5.getElement_Buffer((int) (short) 0);
        int int17 = micazMsg5.get_NodeID();
        byte[] byteArray18 = micazMsg5.dataGet();
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray18);
        short[] shortArray20 = micazMsg19.get_Buffer();
        short[] shortArray21 = micazMsg19.get_Buffer();
        micazMsg1.set_Buffer(shortArray21);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
        byte[] byteArray24 = new byte[] {};
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg(byteArray24, (int) (byte) -1);
        try {
            micazMsg1.dataSet(byteArray24, 3, 8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172 + "'", int2 == 172);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(byteArray24);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("Message <MicazMsg> \n  [Buffer=");
        laccan.persistence.StorageCSV storageCSV6 = storageCSV4.local("lastReading;100.0;10");
        laccan.persistence.StorageCSV storageCSV7 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV9 = storageCSV7.local("");
        laccan.persistence.StorageCSV storageCSV11 = storageCSV9.local("full_memory");
        laccan.persistence.StorageCSV storageCSV13 = storageCSV9.local("");
        laccan.persistence.StorageCSV storageCSV15 = storageCSV9.local("full_memory");
        laccan.persistence.StorageCSV storageCSV17 = storageCSV9.local("null;-19.699999999999996;0");
        laccan.persistence.StorageCSV storageCSV18 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV20 = storageCSV18.local("");
        laccan.persistence.StorageCSV storageCSV22 = storageCSV20.local("full_memory");
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray25 = micazMsg24.get_Buffer();
        java.lang.Object obj26 = micazMsg24.clone();
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg24);
        laccan.devices.Type type28 = null;
        sample27.setType(type28);
        laccan.devices.Type type30 = null;
        sample27.setType(type30);
        java.lang.String str32 = sample27.toString();
        java.lang.String str33 = sample27.toString();
        sample27.setDate((-1L));
        java.lang.String[] strArray36 = sample27.toCSV();
        storageCSV20.save(strArray36);
        storageCSV9.save(strArray36);
        storageCSV6.save(strArray36);
        try {
            java.util.List<laccan.devices.Sample> sampleList40 = storageCSV6.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-19.699999999999996\"");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(storageCSV6);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(storageCSV13);
        org.junit.Assert.assertNotNull(storageCSV15);
        org.junit.Assert.assertNotNull(storageCSV17);
        org.junit.Assert.assertNotNull(storageCSV20);
        org.junit.Assert.assertNotNull(storageCSV22);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "null;-19.699999999999996;0" + "'", str32.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "null;-19.699999999999996;0" + "'", str33.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray36);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) (byte) 10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg11, 16);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg16, 16, (int) (short) 10);
        micazMsg16.amTypeSet((int) (byte) 1);
        micazMsg16.set_Voltage(48);
        short[] shortArray24 = micazMsg16.get_Buffer();
        micazMsg13.set_Buffer(shortArray24);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj29 = micazMsg28.clone();
        short[] shortArray30 = micazMsg28.get_Buffer();
        java.lang.Object obj31 = micazMsg28.clone();
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray39 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg33.set_Buffer(shortArray39);
        micazMsg33.set_Voltage(2);
        short short44 = micazMsg33.getElement_Buffer((int) (short) 0);
        int int45 = micazMsg33.dataLength();
        short[] shortArray46 = micazMsg33.get_Buffer();
        micazMsg28.set_Buffer(shortArray46);
        micazMsg13.set_Buffer(shortArray46);
        byte[] byteArray49 = micazMsg13.dataGet();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 0 + "'", short44 == (short) 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertNotNull(byteArray49);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg12.set_Buffer(shortArray18);
        micazMsg12.set_Voltage(2);
        short short23 = micazMsg12.getElement_Buffer((int) (short) 0);
        int int24 = micazMsg12.get_NodeID();
        byte[] byteArray25 = micazMsg12.dataGet();
        micazMsg1.dataSet(byteArray25);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray25);
        laccan.devices.Sample sample28 = new laccan.devices.Sample(micazMsg27);
        laccan.devices.Type type29 = sample28.getType();
        long long30 = sample28.getDate();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNull(type29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray2);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg5.set_Buffer(shortArray11);
        micazMsg5.set_Voltage(2);
        short short16 = micazMsg5.getElement_Buffer((int) (short) 0);
        short[] shortArray17 = micazMsg5.get_Buffer();
        try {
            micazMsg3.set_Buffer(shortArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 2 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray17);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
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
        java.lang.Double[] doubleArray15 = new java.lang.Double[] { (-1.0d) };
        java.util.ArrayList<java.lang.Double> doubleList16 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList16, doubleArray15);
        java.util.List<java.lang.Double> doubleList18 = regression1.result((java.util.List<java.lang.Double>) doubleList16);
        java.util.List<java.lang.Double> doubleList19 = regression0.result(doubleList18);
        laccan.cloud.prediction.Regression regression20 = new laccan.cloud.prediction.Regression();
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
        java.util.List<java.lang.Double> doubleList34 = regression20.result(doubleList33);
        laccan.cloud.prediction.Regression regression35 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg37 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray38 = micazMsg37.get_Buffer();
        java.lang.Object obj39 = micazMsg37.clone();
        laccan.devices.Sample sample40 = new laccan.devices.Sample(micazMsg37);
        laccan.devices.Sample sample41 = new laccan.devices.Sample();
        laccan.devices.Sample sample42 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray43 = new laccan.devices.Sample[] { sample40, sample41, sample42 };
        java.util.ArrayList<laccan.devices.Sample> sampleList44 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList44, sampleArray43);
        java.util.List<java.lang.Double> doubleList46 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList44);
        java.util.List<java.lang.Double> doubleList47 = regression35.result(doubleList46);
        java.util.List<laccan.devices.Sample> sampleList48 = null;
        laccan.cloud.prediction.Regression regression49 = new laccan.cloud.prediction.Regression();
        laccan.cloud.prediction.Regression regression50 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg52 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray53 = micazMsg52.get_Buffer();
        java.lang.Object obj54 = micazMsg52.clone();
        laccan.devices.Sample sample55 = new laccan.devices.Sample(micazMsg52);
        laccan.devices.Sample sample56 = new laccan.devices.Sample();
        laccan.devices.Sample sample57 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray58 = new laccan.devices.Sample[] { sample55, sample56, sample57 };
        java.util.ArrayList<laccan.devices.Sample> sampleList59 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList59, sampleArray58);
        java.util.List<java.lang.Double> doubleList61 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList59);
        java.util.List<java.lang.Double> doubleList62 = regression50.result(doubleList61);
        java.util.List<java.lang.Double> doubleList63 = regression49.result(doubleList62);
        regression35.init(sampleList48, doubleList62);
        java.util.List<java.lang.Double> doubleList65 = regression20.result(doubleList62);
        java.util.List<java.lang.Double> doubleList66 = regression0.result(doubleList62);
        try {
            java.util.List<java.lang.Double> doubleList67 = regression0.result();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(sampleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doubleList18);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(sampleArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(doubleList32);
        org.junit.Assert.assertNotNull(doubleList33);
        org.junit.Assert.assertNotNull(doubleList34);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(sampleArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(doubleList46);
        org.junit.Assert.assertNotNull(doubleList47);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(sampleArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(doubleList61);
        org.junit.Assert.assertNotNull(doubleList62);
        org.junit.Assert.assertNotNull(doubleList63);
        org.junit.Assert.assertNotNull(doubleList65);
        org.junit.Assert.assertNotNull(doubleList66);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg2.set_Buffer(shortArray8);
        micazMsg2.set_Voltage(2);
        java.lang.String str12 = micazMsg2.toString();
        short[] shortArray13 = micazMsg2.get_Buffer();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg2);
        keepingAll0.add(sample14);
        sample14.setTemperature((double) (short) 100);
        sample14.setNode("");
        sample14.setDate((long) (-20));
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray13);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (short) 1, 512);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("full_memory");
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        laccan.devices.Type type10 = null;
        sample9.setType(type10);
        laccan.devices.Type type12 = null;
        sample9.setType(type12);
        java.lang.String str14 = sample9.toString();
        java.lang.String str15 = sample9.toString();
        sample9.setDate((-1L));
        java.lang.String[] strArray18 = sample9.toCSV();
        storageCSV4.save(strArray18);
        laccan.persistence.StorageCSV storageCSV20 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV22 = storageCSV20.local("");
        laccan.persistence.StorageCSV storageCSV24 = storageCSV22.local("full_memory");
        laccan.memory.data.reduction.KeepingAll keepingAll25 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList26 = keepingAll25.get();
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray29 = micazMsg28.get_Buffer();
        java.lang.Object obj30 = micazMsg28.clone();
        laccan.devices.Sample sample31 = new laccan.devices.Sample(micazMsg28);
        laccan.devices.Type type32 = null;
        sample31.setType(type32);
        laccan.devices.Type type34 = null;
        sample31.setType(type34);
        java.lang.String str36 = sample31.toString();
        java.lang.String str37 = sample31.toString();
        keepingAll25.add(sample31);
        laccan.devices.Type type39 = laccan.devices.Type.FULL;
        sample31.setType(type39);
        java.lang.String str41 = sample31.toString();
        java.lang.String[] strArray42 = sample31.toCSV();
        storageCSV22.save(strArray42);
        storageCSV4.save(strArray42);
        laccan.persistence.StorageCSV storageCSV46 = storageCSV4.local("reduction");
        try {
            java.util.List<laccan.devices.Sample> sampleList47 = storageCSV4.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-19.699999999999996\"");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null;-19.699999999999996;0" + "'", str14.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null;-19.699999999999996;0" + "'", str15.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(storageCSV22);
        org.junit.Assert.assertNotNull(storageCSV24);
        org.junit.Assert.assertNotNull(sampleList26);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "null;-19.699999999999996;0" + "'", str36.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "null;-19.699999999999996;0" + "'", str37.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + type39 + "' != '" + laccan.devices.Type.FULL + "'", type39.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "null;-19.699999999999996;0" + "'", str41.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(storageCSV46);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) (byte) 10);
        micazMsg11.init((int) (byte) 0);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        java.lang.Object obj17 = micazMsg15.clone();
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg15);
        net.tinyos.message.Message message20 = micazMsg15.clone(512);
        byte[] byteArray21 = message20.dataGet();
        java.lang.Class<?> wildcardClass22 = byteArray21.getClass();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray21);
        try {
            micazMsg11.dataSet(byteArray21, (int) ' ', (-1), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(message20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 0, (long) 52, (int) (short) 1);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 16, (int) (short) 10);
        micazMsg2.amTypeSet((int) (byte) 1);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg9.set_Buffer(shortArray15);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg9, 0, (int) (byte) 10);
        short[] shortArray20 = micazMsg9.get_Buffer();
        micazMsg2.set_Buffer(shortArray20);
        micazMsg2.set_NodeID(172);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray26 = micazMsg25.get_Buffer();
        java.lang.Object obj27 = micazMsg25.clone();
        micazMsg25.amTypeSet(20);
        java.lang.Object obj30 = micazMsg25.clone();
        byte[] byteArray31 = new byte[] {};
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg(byteArray31, 20);
        micazMsg25.dataSet(byteArray31);
        try {
            micazMsg2.dataSet(byteArray31, (int) (short) 10, (int) (short) 100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(byteArray31);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        memory0.build();
        java.lang.Class<?> wildcardClass3 = memory0.getClass();
        int int4 = memory0.length();
        int int5 = memory0.length();
        memory0.build();
        org.junit.Assert.assertNull(container1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(1);
        java.lang.Object obj2 = micazMsg1.clone();
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1 };
        try {
            micazMsg1.dataSet(byteArray5, 4, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        laccan.memory.data.reduction.KeepingAll keepingAll2 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg4.set_Buffer(shortArray10);
        micazMsg4.set_Voltage(2);
        java.lang.String str14 = micazMsg4.toString();
        short[] shortArray15 = micazMsg4.get_Buffer();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg4);
        keepingAll2.add(sample16);
        int int18 = keepingAll2.length();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = micazMsg20.get_Buffer();
        java.lang.Object obj22 = micazMsg20.clone();
        micazMsg20.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg20, (int) (byte) 0);
        int int27 = micazMsg20.baseOffset();
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg20, (long) 2);
        keepingAll2.add(sample29);
        memory0.add(sample29);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray39 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg33.set_Buffer(shortArray39);
        micazMsg33.set_Voltage(2);
        java.lang.String str43 = micazMsg33.toString();
        short[] shortArray44 = micazMsg33.get_Buffer();
        laccan.devices.Sample sample45 = new laccan.devices.Sample(micazMsg33);
        laccan.devices.Sample sample46 = new laccan.devices.Sample();
        laccan.devices.Type type47 = laccan.devices.Type.FULL;
        sample46.setType(type47);
        sample45.setType(type47);
        long long50 = sample45.getDate();
        java.lang.String str51 = sample45.toString();
        memory0.add(sample45);
        java.lang.String str53 = sample45.getNode();
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str14.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str43.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertTrue("'" + type47 + "' != '" + laccan.devices.Type.FULL + "'", type47.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "null;-19.648499999999995;0" + "'", str51.equals("null;-19.648499999999995;0"));
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        laccan.devices.helper.utils.Assistant.reducerType = "Message <MicazMsg> \n  [Voltage=0x0]\n  [Buffer=0x200 0x0 0x100 0x100 0x6400 0x100 0x0 0x0 0x0 0x0 ]\n";
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        java.lang.String[] strArray7 = sample6.toCSV();
        sample6.setNode("");
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        net.tinyos.message.Message message6 = micazMsg1.clone(512);
        byte[] byteArray7 = message6.dataGet();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, 172, (int) (short) 0);
        try {
            short[] shortArray11 = micazMsg10.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        int int1 = laccan.devices.MicazMsg.offsetBits_Buffer(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 80 + "'", int1 == 80);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        byte[] byteArray0 = new byte[] {};
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(byteArray0, 20);
        int int3 = micazMsg2.dataLength();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg5);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 100 };
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg(byteArray14);
        micazMsg5.dataSet(byteArray14);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray14, 4);
        try {
            micazMsg2.dataSet(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-20) + "'", int3 == (-20));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(byteArray14);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        int int9 = micazMsg1.amType();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 1, 16);
        net.tinyos.message.Message message14 = micazMsg12.clone(16);
        byte[] byteArray16 = new byte[] { (byte) -1 };
        try {
            message14.dataSet(byteArray16, 20, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(byteArray16);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        java.lang.String[] strArray7 = sample6.toCSV();
        sample6.setTemperature((double) 100.0f);
        java.lang.String[] strArray10 = sample6.toCSV();
        double double11 = sample6.getTemperature();
        sample6.setDate((long) (short) 10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(2);
        int int2 = micazMsg1.amType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172 + "'", int2 == 172);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg2);
        int int4 = micazMsg2.dataLength();
        java.lang.Class<?> wildcardClass5 = micazMsg2.getClass();
        byte[] byteArray7 = new byte[] { (byte) 10 };
        try {
            micazMsg2.dataSet(byteArray7, 0, 48, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        laccan.devices.MicazMsg micazMsg0 = null;
        try {
            laccan.devices.Sample sample2 = new laccan.devices.Sample(micazMsg0, (long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
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
        java.util.List<laccan.devices.Sample> sampleList13 = null;
        laccan.cloud.prediction.Regression regression14 = new laccan.cloud.prediction.Regression();
        laccan.cloud.prediction.Regression regression15 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg17);
        laccan.devices.Sample sample21 = new laccan.devices.Sample();
        laccan.devices.Sample sample22 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray23 = new laccan.devices.Sample[] { sample20, sample21, sample22 };
        java.util.ArrayList<laccan.devices.Sample> sampleList24 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList24, sampleArray23);
        java.util.List<java.lang.Double> doubleList26 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList24);
        java.util.List<java.lang.Double> doubleList27 = regression15.result(doubleList26);
        java.util.List<java.lang.Double> doubleList28 = regression14.result(doubleList27);
        regression0.init(sampleList13, doubleList27);
        double double30 = regression0.mse();
        laccan.cloud.prediction.Regression regression31 = new laccan.cloud.prediction.Regression();
        laccan.cloud.prediction.Regression regression32 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray35 = micazMsg34.get_Buffer();
        java.lang.Object obj36 = micazMsg34.clone();
        laccan.devices.Sample sample37 = new laccan.devices.Sample(micazMsg34);
        laccan.devices.Sample sample38 = new laccan.devices.Sample();
        laccan.devices.Sample sample39 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray40 = new laccan.devices.Sample[] { sample37, sample38, sample39 };
        java.util.ArrayList<laccan.devices.Sample> sampleList41 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList41, sampleArray40);
        java.util.List<java.lang.Double> doubleList43 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList41);
        java.util.List<java.lang.Double> doubleList44 = regression32.result(doubleList43);
        java.lang.Double[] doubleArray46 = new java.lang.Double[] { (-1.0d) };
        java.util.ArrayList<java.lang.Double> doubleList47 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList47, doubleArray46);
        java.util.List<java.lang.Double> doubleList49 = regression32.result((java.util.List<java.lang.Double>) doubleList47);
        java.util.List<java.lang.Double> doubleList50 = regression31.result(doubleList49);
        java.util.List<java.lang.Double> doubleList51 = regression0.result(doubleList50);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(sampleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(sampleArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleList26);
        org.junit.Assert.assertNotNull(doubleList27);
        org.junit.Assert.assertNotNull(doubleList28);
        org.junit.Assert.assertEquals((double) double30, Double.NaN, 0);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(sampleArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(doubleList43);
        org.junit.Assert.assertNotNull(doubleList44);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(doubleList49);
        org.junit.Assert.assertNotNull(doubleList50);
        org.junit.Assert.assertNotNull(doubleList51);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        short[] shortArray12 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
        byte[] byteArray15 = micazMsg1.dataGet();
        try {
            laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray15, 512, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 512, data_length 0 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        java.util.List<laccan.devices.Sample> sampleList3 = storageCSV2.read();
        laccan.persistence.StorageCSV storageCSV5 = storageCSV2.local("");
        laccan.persistence.StorageCSV storageCSV6 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV8 = storageCSV6.local("");
        laccan.persistence.StorageCSV storageCSV10 = storageCSV8.local("full_memory");
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg12);
        laccan.devices.Type type16 = null;
        sample15.setType(type16);
        laccan.devices.Type type18 = null;
        sample15.setType(type18);
        java.lang.String str20 = sample15.toString();
        java.lang.String str21 = sample15.toString();
        sample15.setDate((-1L));
        java.lang.String[] strArray24 = sample15.toCSV();
        storageCSV10.save(strArray24);
        laccan.persistence.StorageCSV storageCSV26 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV28 = storageCSV26.local("");
        laccan.persistence.StorageCSV storageCSV30 = storageCSV28.local("full_memory");
        laccan.memory.data.reduction.KeepingAll keepingAll31 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList32 = keepingAll31.get();
        laccan.devices.MicazMsg micazMsg34 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray35 = micazMsg34.get_Buffer();
        java.lang.Object obj36 = micazMsg34.clone();
        laccan.devices.Sample sample37 = new laccan.devices.Sample(micazMsg34);
        laccan.devices.Type type38 = null;
        sample37.setType(type38);
        laccan.devices.Type type40 = null;
        sample37.setType(type40);
        java.lang.String str42 = sample37.toString();
        java.lang.String str43 = sample37.toString();
        keepingAll31.add(sample37);
        laccan.devices.Type type45 = laccan.devices.Type.FULL;
        sample37.setType(type45);
        java.lang.String str47 = sample37.toString();
        java.lang.String[] strArray48 = sample37.toCSV();
        storageCSV28.save(strArray48);
        storageCSV10.save(strArray48);
        try {
            storageCSV2.save(strArray48);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: O sistema não pode encontrar o caminho especificado");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(storageCSV5);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null;-19.699999999999996;0" + "'", str20.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "null;-19.699999999999996;0" + "'", str21.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(storageCSV28);
        org.junit.Assert.assertNotNull(storageCSV30);
        org.junit.Assert.assertNotNull(sampleList32);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "null;-19.699999999999996;0" + "'", str42.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "null;-19.699999999999996;0" + "'", str43.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + type45 + "' != '" + laccan.devices.Type.FULL + "'", type45.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "null;-19.699999999999996;0" + "'", str47.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray48);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        net.tinyos.message.Message message6 = micazMsg1.clone(512);
        byte[] byteArray7 = message6.dataGet();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(message6, (int) '4', (int) (byte) 1);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg10, 4, (int) (short) 100);
        try {
            micazMsg10.setElement_Buffer((int) (short) 100, (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        int int4 = micazMsg1.get_Voltage();
        micazMsg1.set_NodeID(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        short[] shortArray4 = micazMsg1.get_Buffer();
        micazMsg1.amTypeSet((int) 'a');
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = micazMsg8.get_Buffer();
        java.lang.Object obj10 = micazMsg8.clone();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg8);
        net.tinyos.message.Message message13 = micazMsg8.clone(512);
        byte[] byteArray14 = message13.dataGet();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray14, 0);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray14);
        micazMsg1.dataSet(byteArray14, (int) (short) 1, 20, (int) (byte) 10);
        try {
            short short23 = micazMsg1.getElement_Buffer((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(message13);
        org.junit.Assert.assertNotNull(byteArray14);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg12.set_Buffer(shortArray18);
        micazMsg12.set_Voltage(2);
        short short23 = micazMsg12.getElement_Buffer((int) (short) 0);
        int int24 = micazMsg12.get_NodeID();
        byte[] byteArray25 = micazMsg12.dataGet();
        micazMsg1.dataSet(byteArray25);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj30 = micazMsg29.clone();
        short[] shortArray31 = micazMsg29.get_Buffer();
        micazMsg29.set_Voltage(16);
        net.tinyos.message.Message message35 = micazMsg29.clone(2);
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg29, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(message35);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        short[] shortArray12 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
        byte[] byteArray15 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray15, (-1));
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray15, 48);
        micazMsg19.set_NodeID((int) (byte) -1);
        try {
            short[] shortArray22 = micazMsg19.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 4 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) (byte) 10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg11, 16);
        net.tinyos.message.Message message15 = micazMsg13.clone((int) ' ');
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg13);
        int int17 = micazMsg13.get_Voltage();
        int int18 = micazMsg13.baseOffset();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(message15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        int int3 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5);
        laccan.devices.Type type9 = null;
        sample8.setType(type9);
        double double11 = sample8.getDateDouble();
        keepingAll0.add(sample8);
        laccan.memory.data.reduction.KeepingAll keepingAll13 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample14 = new laccan.devices.Sample();
        keepingAll13.add(sample14);
        keepingAll0.add(sample14);
        int int17 = keepingAll0.length();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample1 = new laccan.devices.Sample();
        keepingAll0.add(sample1);
        int int3 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        laccan.devices.Sample sample8 = new laccan.devices.Sample(micazMsg5);
        laccan.devices.Type type9 = null;
        sample8.setType(type9);
        double double11 = sample8.getDateDouble();
        keepingAll0.add(sample8);
        laccan.memory.data.reduction.KeepingAll keepingAll13 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample14 = new laccan.devices.Sample();
        keepingAll13.add(sample14);
        keepingAll0.add(sample14);
        double double17 = sample14.getDateDouble();
        java.lang.String str18 = sample14.getNode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("full_memory");
        laccan.persistence.StorageCSV storageCSV6 = storageCSV2.local("");
        laccan.persistence.StorageCSV storageCSV8 = storageCSV2.local("full_memory");
        laccan.persistence.StorageCSV storageCSV10 = storageCSV2.local("null;-19.699999999999996;0");
        laccan.persistence.StorageCSV storageCSV12 = storageCSV2.local("lastReading;100.0;10");
        try {
            java.util.List<laccan.devices.Sample> sampleList13 = storageCSV12.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-19.699999999999996\"");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(storageCSV6);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV12);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 100 };
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        micazMsg7.amTypeSet(32);
        try {
            laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (48) or length (16), for data_length 6 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        short[] shortArray4 = micazMsg1.get_Buffer();
        int int5 = micazMsg1.get_NodeID();
        java.lang.Class<?> wildcardClass6 = micazMsg1.getClass();
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1);
        byte[] byteArray8 = micazMsg1.dataGet();
        int int9 = micazMsg1.get_Voltage();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        short short12 = micazMsg1.getElement_Buffer((int) (short) 0);
        int int13 = micazMsg1.get_NodeID();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg1);
        java.lang.Object obj15 = micazMsg1.clone();
        java.lang.Object obj16 = micazMsg1.clone();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
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
        laccan.persistence.StorageCSV storageCSV15 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV17 = storageCSV15.local("");
        java.util.List<laccan.devices.Sample> sampleList18 = storageCSV17.read();
        java.util.List<java.lang.Double> doubleList19 = laccan.cloud.prediction.Regression.makeTests(sampleList18);
        laccan.persistence.StorageCSV storageCSV20 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV22 = storageCSV20.local("");
        java.util.List<laccan.devices.Sample> sampleList23 = storageCSV22.read();
        java.util.List<java.lang.Double> doubleList24 = laccan.cloud.prediction.Regression.makeTests(sampleList23);
        regression0.init(sampleList18, doubleList24);
        laccan.cloud.prediction.Regression regression26 = new laccan.cloud.prediction.Regression();
        laccan.cloud.prediction.Regression regression27 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray30 = micazMsg29.get_Buffer();
        java.lang.Object obj31 = micazMsg29.clone();
        laccan.devices.Sample sample32 = new laccan.devices.Sample(micazMsg29);
        laccan.devices.Sample sample33 = new laccan.devices.Sample();
        laccan.devices.Sample sample34 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray35 = new laccan.devices.Sample[] { sample32, sample33, sample34 };
        java.util.ArrayList<laccan.devices.Sample> sampleList36 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList36, sampleArray35);
        java.util.List<java.lang.Double> doubleList38 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList36);
        java.util.List<java.lang.Double> doubleList39 = regression27.result(doubleList38);
        java.util.List<java.lang.Double> doubleList40 = regression26.result(doubleList39);
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
        java.util.List<laccan.devices.Sample> sampleList54 = null;
        laccan.cloud.prediction.Regression regression55 = new laccan.cloud.prediction.Regression();
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
        java.util.List<java.lang.Double> doubleList69 = regression55.result(doubleList68);
        regression41.init(sampleList54, doubleList68);
        java.util.List<java.lang.Double> doubleList71 = regression26.result(doubleList68);
        java.util.List<java.lang.Double> doubleList72 = regression0.result(doubleList68);
        double double73 = regression0.mse();
        regression0.train();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(sampleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(storageCSV17);
        org.junit.Assert.assertNotNull(sampleList18);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertNotNull(storageCSV22);
        org.junit.Assert.assertNotNull(sampleList23);
        org.junit.Assert.assertNotNull(doubleList24);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(sampleArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleList38);
        org.junit.Assert.assertNotNull(doubleList39);
        org.junit.Assert.assertNotNull(doubleList40);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(sampleArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleList52);
        org.junit.Assert.assertNotNull(doubleList53);
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(sampleArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(doubleList67);
        org.junit.Assert.assertNotNull(doubleList68);
        org.junit.Assert.assertNotNull(doubleList69);
        org.junit.Assert.assertNotNull(doubleList71);
        org.junit.Assert.assertNotNull(doubleList72);
        org.junit.Assert.assertEquals((double) double73, Double.NaN, 0);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        int int5 = micazMsg4.amType();
        byte[] byteArray6 = micazMsg4.dataGet();
        micazMsg1.dataSet(byteArray6);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
        try {
            micazMsg1.setElement_Buffer(100, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 172 + "'", int5 == 172);
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 16, (int) (short) 10);
        micazMsg2.amTypeSet((int) (byte) 1);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg9.set_Buffer(shortArray15);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg9, 0, (int) (byte) 10);
        short[] shortArray20 = micazMsg9.get_Buffer();
        micazMsg2.set_Buffer(shortArray20);
        net.tinyos.message.SerialPacket serialPacket22 = micazMsg2.getSerialPacket();
        try {
            laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((net.tinyos.message.Message) serialPacket22, 8, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNull(serialPacket22);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        net.tinyos.message.Message message6 = micazMsg1.clone(512);
        byte[] byteArray7 = message6.dataGet();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(message6, (int) '4', (int) (byte) 1);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg10, 4, (int) (short) 100);
        try {
            short[] shortArray14 = micazMsg10.get_Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray4 = micazMsg3.get_Buffer();
        java.lang.Object obj5 = micazMsg3.clone();
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg3);
        laccan.devices.Type type7 = null;
        sample6.setType(type7);
        laccan.devices.Type type9 = null;
        sample6.setType(type9);
        java.lang.String str11 = sample6.toString();
        java.lang.String str12 = sample6.toString();
        keepingAll0.add(sample6);
        laccan.memory.data.reduction.KeepingAll keepingAll14 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList15 = keepingAll14.get();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg17);
        laccan.devices.Type type21 = null;
        sample20.setType(type21);
        laccan.devices.Type type23 = null;
        sample20.setType(type23);
        java.lang.String str25 = sample20.toString();
        java.lang.String str26 = sample20.toString();
        keepingAll14.add(sample20);
        laccan.devices.Type type28 = laccan.devices.Type.FULL;
        sample20.setType(type28);
        java.lang.String str30 = sample20.getNode();
        sample20.setDate((long) 160);
        keepingAll0.add(sample20);
        laccan.devices.MicazMsg micazMsg35 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray36 = micazMsg35.get_Buffer();
        java.lang.Object obj37 = micazMsg35.clone();
        laccan.devices.Sample sample38 = new laccan.devices.Sample(micazMsg35);
        laccan.devices.Type type39 = null;
        sample38.setType(type39);
        laccan.devices.Type type41 = null;
        sample38.setType(type41);
        java.lang.String str43 = sample38.toString();
        sample38.setNode("");
        keepingAll0.add(sample38);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null;-19.699999999999996;0" + "'", str11.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null;-19.699999999999996;0" + "'", str12.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(sampleList15);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "null;-19.699999999999996;0" + "'", str25.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "null;-19.699999999999996;0" + "'", str26.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + type28 + "' != '" + laccan.devices.Type.FULL + "'", type28.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "null;-19.699999999999996;0" + "'", str43.equals("null;-19.699999999999996;0"));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        short short12 = micazMsg1.getElement_Buffer((int) (short) 0);
        int int13 = micazMsg1.get_NodeID();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg1);
        java.lang.Class<?> wildcardClass15 = sample14.getClass();
        sample14.setDate((long) 10);
        double double18 = sample14.getTemperature();
        double double19 = sample14.getTemperature();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-19.648499999999995d) + "'", double18 == (-19.648499999999995d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-19.648499999999995d) + "'", double19 == (-19.648499999999995d));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n", (double) (short) -156, (long) 512);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(1);
        net.tinyos.message.Message message3 = micazMsg1.clone(1);
        net.tinyos.message.Message message5 = message3.clone((int) (short) 0);
        java.lang.Object obj6 = message5.clone();
        org.junit.Assert.assertNotNull(message3);
        org.junit.Assert.assertNotNull(message5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.amType();
        byte[] byteArray3 = micazMsg1.dataGet();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        int int5 = micazMsg1.get_NodeID();
        short[] shortArray6 = null;
        try {
            micazMsg1.set_Buffer(shortArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172 + "'", int2 == 172);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        java.util.List<laccan.devices.Sample> sampleList3 = storageCSV2.read();
        laccan.persistence.StorageCSV storageCSV5 = storageCSV2.local("");
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg7.set_Buffer(shortArray13);
        micazMsg7.set_Voltage(2);
        java.lang.String str17 = micazMsg7.toString();
        short[] shortArray18 = micazMsg7.get_Buffer();
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg7);
        sample19.setNode("");
        java.lang.String[] strArray22 = sample19.toCSV();
        try {
            storageCSV5.save(strArray22);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: O sistema não pode encontrar o caminho especificado");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(storageCSV5);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str17.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        net.tinyos.message.Message message7 = micazMsg1.clone((int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = message7.getClass();
        try {
            laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(message7, 64, 80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 64, data_length 80 and data array size 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(message7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        byte[] byteArray0 = new byte[] {};
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(byteArray0, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg(byteArray0);
        try {
            short short5 = micazMsg3.getElement_Buffer(24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        net.tinyos.message.Message message6 = micazMsg1.clone(512);
        byte[] byteArray7 = message6.dataGet();
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg9, 0, 48);
        int int13 = micazMsg9.get_Voltage();
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg9, (long) (byte) -1);
        java.lang.String[] strArray16 = sample15.toCSV();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        short[] shortArray4 = micazMsg1.get_Buffer();
        short short6 = micazMsg1.getElement_Buffer(2);
        try {
            short short8 = micazMsg1.getElement_Buffer((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV2.local("full_memory");
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = micazMsg6.get_Buffer();
        java.lang.Object obj8 = micazMsg6.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg6);
        laccan.devices.Type type10 = null;
        sample9.setType(type10);
        laccan.devices.Type type12 = null;
        sample9.setType(type12);
        java.lang.String str14 = sample9.toString();
        java.lang.String str15 = sample9.toString();
        sample9.setDate((-1L));
        java.lang.String[] strArray18 = sample9.toCSV();
        storageCSV4.save(strArray18);
        try {
            java.util.List<laccan.devices.Sample> sampleList20 = storageCSV4.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-19.699999999999996\"");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null;-19.699999999999996;0" + "'", str14.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null;-19.699999999999996;0" + "'", str15.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 16, (int) (short) 10);
        try {
            laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (80) or length (16), for data_length 10 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((-20), 160);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        net.tinyos.message.Message message7 = micazMsg1.clone((int) (byte) 100);
        try {
            micazMsg1.setElement_Buffer(35, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(message7);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg7, (long) (byte) 10);
        java.lang.String str10 = micazMsg7.toString();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str10.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        java.lang.Object obj4 = micazMsg1.clone();
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        java.lang.Object obj8 = micazMsg1.clone();
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        java.lang.String str10 = sample9.getNode();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        laccan.devices.helper.utils.Assistant.reducerType = "init";
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 100, 0L, 100);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(80, (int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (byte) 10, 6);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        try {
            laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((-20), (int) (short) -156);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray4 = micazMsg3.get_Buffer();
        java.lang.Object obj5 = micazMsg3.clone();
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg3);
        laccan.devices.Type type7 = null;
        sample6.setType(type7);
        laccan.devices.Type type9 = null;
        sample6.setType(type9);
        java.lang.String str11 = sample6.toString();
        java.lang.String str12 = sample6.toString();
        keepingAll0.add(sample6);
        java.util.List<laccan.devices.Sample> sampleList14 = keepingAll0.get();
        java.util.List<java.lang.Double> doubleList15 = laccan.cloud.prediction.Regression.makeTests(sampleList14);
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null;-19.699999999999996;0" + "'", str11.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null;-19.699999999999996;0" + "'", str12.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(sampleList14);
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer(24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("lastReading", (double) (short) 0, (long) '4');
        long long4 = sample3.getDate();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 16, (int) (short) 10);
        micazMsg2.amTypeSet((int) (byte) 1);
        micazMsg2.set_Voltage(48);
        int int10 = micazMsg2.amType();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
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
        java.util.List<laccan.devices.Sample> sampleList13 = null;
        laccan.cloud.prediction.Regression regression14 = new laccan.cloud.prediction.Regression();
        laccan.cloud.prediction.Regression regression15 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg17);
        laccan.devices.Sample sample21 = new laccan.devices.Sample();
        laccan.devices.Sample sample22 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray23 = new laccan.devices.Sample[] { sample20, sample21, sample22 };
        java.util.ArrayList<laccan.devices.Sample> sampleList24 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList24, sampleArray23);
        java.util.List<java.lang.Double> doubleList26 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList24);
        java.util.List<java.lang.Double> doubleList27 = regression15.result(doubleList26);
        java.util.List<java.lang.Double> doubleList28 = regression14.result(doubleList27);
        regression0.init(sampleList13, doubleList27);
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
        java.util.List<java.lang.Double> doubleList41 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList38);
        java.util.List<java.lang.Double> doubleList42 = regression0.result(doubleList41);
        laccan.cloud.prediction.Regression regression43 = new laccan.cloud.prediction.Regression();
        laccan.cloud.prediction.Regression regression44 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg46 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray47 = micazMsg46.get_Buffer();
        java.lang.Object obj48 = micazMsg46.clone();
        laccan.devices.Sample sample49 = new laccan.devices.Sample(micazMsg46);
        laccan.devices.Sample sample50 = new laccan.devices.Sample();
        laccan.devices.Sample sample51 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray52 = new laccan.devices.Sample[] { sample49, sample50, sample51 };
        java.util.ArrayList<laccan.devices.Sample> sampleList53 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList53, sampleArray52);
        java.util.List<java.lang.Double> doubleList55 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList53);
        java.util.List<java.lang.Double> doubleList56 = regression44.result(doubleList55);
        java.util.List<java.lang.Double> doubleList57 = regression43.result(doubleList56);
        laccan.persistence.StorageCSV storageCSV58 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV60 = storageCSV58.local("");
        java.util.List<laccan.devices.Sample> sampleList61 = storageCSV60.read();
        java.util.List<java.lang.Double> doubleList62 = laccan.cloud.prediction.Regression.makeTests(sampleList61);
        laccan.persistence.StorageCSV storageCSV63 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV65 = storageCSV63.local("");
        java.util.List<laccan.devices.Sample> sampleList66 = storageCSV65.read();
        java.util.List<java.lang.Double> doubleList67 = laccan.cloud.prediction.Regression.makeTests(sampleList66);
        regression43.init(sampleList61, doubleList67);
        regression43.train();
        laccan.persistence.StorageCSV storageCSV70 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV72 = storageCSV70.local("");
        java.util.List<laccan.devices.Sample> sampleList73 = storageCSV72.read();
        java.util.List<java.lang.Double> doubleList74 = laccan.cloud.prediction.Regression.makeTests(sampleList73);
        java.util.List<java.lang.Double> doubleList75 = regression43.result(doubleList74);
        double double76 = regression43.mse();
        java.util.List<java.lang.Double> doubleList77 = regression43.result();
        java.util.List<java.lang.Double> doubleList78 = regression0.result(doubleList77);
        java.util.List<java.lang.Double> doubleList79 = regression0.result();
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(sampleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(sampleArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleList26);
        org.junit.Assert.assertNotNull(doubleList27);
        org.junit.Assert.assertNotNull(doubleList28);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(sampleArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleList40);
        org.junit.Assert.assertNotNull(doubleList41);
        org.junit.Assert.assertNotNull(doubleList42);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(sampleArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(doubleList55);
        org.junit.Assert.assertNotNull(doubleList56);
        org.junit.Assert.assertNotNull(doubleList57);
        org.junit.Assert.assertNotNull(storageCSV60);
        org.junit.Assert.assertNotNull(sampleList61);
        org.junit.Assert.assertNotNull(doubleList62);
        org.junit.Assert.assertNotNull(storageCSV65);
        org.junit.Assert.assertNotNull(sampleList66);
        org.junit.Assert.assertNotNull(doubleList67);
        org.junit.Assert.assertNotNull(storageCSV72);
        org.junit.Assert.assertNotNull(sampleList73);
        org.junit.Assert.assertNotNull(doubleList74);
        org.junit.Assert.assertNotNull(doubleList75);
        org.junit.Assert.assertEquals((double) double76, Double.NaN, 0);
        org.junit.Assert.assertNotNull(doubleList77);
        org.junit.Assert.assertNotNull(doubleList78);
        org.junit.Assert.assertNotNull(doubleList79);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        int int4 = micazMsg2.amType();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg6.set_Buffer(shortArray12);
        micazMsg6.init(16);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray23 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg17.set_Buffer(shortArray23);
        micazMsg17.set_Voltage(2);
        short short28 = micazMsg17.getElement_Buffer((int) (short) 0);
        int int29 = micazMsg17.get_NodeID();
        byte[] byteArray30 = micazMsg17.dataGet();
        micazMsg6.dataSet(byteArray30);
        laccan.devices.MicazMsg micazMsg33 = new laccan.devices.MicazMsg(byteArray30, 2);
        micazMsg2.dataSet(byteArray30, (int) '#', 24, (int) (short) 0);
        java.lang.Object obj38 = micazMsg2.clone();
        laccan.devices.MicazMsg micazMsg40 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray46 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg40.set_Buffer(shortArray46);
        micazMsg40.init(16);
        laccan.devices.MicazMsg micazMsg51 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray57 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg51.set_Buffer(shortArray57);
        micazMsg51.set_Voltage(2);
        short short62 = micazMsg51.getElement_Buffer((int) (short) 0);
        int int63 = micazMsg51.get_NodeID();
        byte[] byteArray64 = micazMsg51.dataGet();
        micazMsg40.dataSet(byteArray64);
        laccan.devices.MicazMsg micazMsg66 = new laccan.devices.MicazMsg(byteArray64);
        laccan.devices.Sample sample67 = new laccan.devices.Sample(micazMsg66);
        int int68 = micazMsg66.baseOffset();
        try {
            micazMsg2.dataSet((net.tinyos.message.Message) micazMsg66, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 172 + "'", int4 == 172);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 0 + "'", short28 == (short) 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertTrue("'" + short62 + "' != '" + (short) 0 + "'", short62 == (short) 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(512, 2);
        java.lang.String str3 = micazMsg2.toString();
        micazMsg2.set_Voltage((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str3.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("init", (double) '#', (long) 1);
        java.lang.String str4 = sample3.getNode();
        java.lang.String str5 = sample3.getNode();
        laccan.memory.data.reduction.KeepingAll keepingAll6 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample7 = new laccan.devices.Sample();
        keepingAll6.add(sample7);
        java.lang.String str9 = sample7.getNode();
        double double10 = sample7.getTemperature();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray13 = micazMsg12.get_Buffer();
        java.lang.Object obj14 = micazMsg12.clone();
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg12);
        long long16 = sample15.getDate();
        java.lang.String str17 = sample15.getNode();
        laccan.devices.Type type18 = null;
        sample15.setType(type18);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray27 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg21.set_Buffer(shortArray27);
        micazMsg21.set_Voltage(2);
        java.lang.String str31 = micazMsg21.toString();
        short[] shortArray32 = micazMsg21.get_Buffer();
        laccan.devices.Sample sample33 = new laccan.devices.Sample(micazMsg21);
        laccan.devices.Sample sample34 = new laccan.devices.Sample();
        laccan.devices.Type type35 = laccan.devices.Type.FULL;
        sample34.setType(type35);
        sample33.setType(type35);
        sample15.setType(type35);
        sample7.setType(type35);
        sample3.setType(type35);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "init" + "'", str4.equals("init"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "init" + "'", str5.equals("init"));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str31.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertTrue("'" + type35 + "' != '" + laccan.devices.Type.FULL + "'", type35.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) (short) -156, 64);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 2);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 52, 0);
        short[] shortArray14 = micazMsg1.get_Buffer();
        int int15 = micazMsg1.get_Voltage();
        int int16 = micazMsg1.get_Voltage();
        int int17 = micazMsg1.get_NodeID();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        net.tinyos.message.Message message8 = micazMsg1.clone((int) 'a');
        net.tinyos.message.SerialPacket serialPacket9 = micazMsg1.getSerialPacket();
        micazMsg1.setElement_Buffer(3, (short) -156);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(message8);
        org.junit.Assert.assertNull(serialPacket9);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.Container container3 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        micazMsg5.amTypeSet(20);
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg5);
        java.lang.String[] strArray11 = sample10.toCSV();
        sample10.setTemperature((double) 100.0f);
        java.lang.String[] strArray14 = sample10.toCSV();
        memory0.add(sample10);
        double double16 = sample10.getDateDouble();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 2);
        java.lang.String str11 = sample10.getNode();
        sample10.setTemperature((double) (short) -1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV0.local("lastReading;100.0;10");
        try {
            java.util.List<laccan.devices.Sample> sampleList5 = storageCSV0.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-19.699999999999996\"");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg2.set_Buffer(shortArray8);
        micazMsg2.set_Voltage(2);
        java.lang.String str12 = micazMsg2.toString();
        short[] shortArray13 = micazMsg2.get_Buffer();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg2);
        keepingAll0.add(sample14);
        int int16 = keepingAll0.length();
        int int17 = keepingAll0.length();
        java.util.List<laccan.devices.Sample> sampleList18 = keepingAll0.get();
        laccan.devices.Sample sample22 = new laccan.devices.Sample("null;-19.699999999999996;0", 1.0d, 1L);
        keepingAll0.add(sample22);
        int int24 = keepingAll0.length();
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(sampleList18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("Message <MicazMsg> \n  [Buffer=", (double) 0.0f, 0L);
        java.lang.String str4 = sample3.getNode();
        java.lang.String[] strArray5 = sample3.toCSV();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str4.equals("Message <MicazMsg> \n  [Buffer="));
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        sample4.setDate((long) (-1));
        sample4.setNode("result");
        java.lang.String str10 = sample4.getNode();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "result" + "'", str10.equals("result"));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        int int1 = laccan.devices.MicazMsg.numElements_Buffer(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 2);
        micazMsg1.setElement_Buffer(1, (short) (byte) 100);
        int int14 = micazMsg1.dataLength();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion((int) 'a', 172);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        int int5 = micazMsg4.amType();
        byte[] byteArray6 = micazMsg4.dataGet();
        micazMsg1.dataSet(byteArray6);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray6, (int) (short) 0, 16);
        try {
            laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray6, 512, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 512, data_length 100 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 172 + "'", int5 == 172);
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        short[] shortArray12 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 52, (int) (byte) -1);
        java.lang.String str18 = micazMsg17.toString();
        try {
            laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg17, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length -1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Message <MicazMsg> \n  [Buffer=" + "'", str18.equals("Message <MicazMsg> \n  [Buffer="));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.get_Voltage();
        micazMsg1.amTypeSet((int) ' ');
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        try {
            micazMsg1.setElement_Buffer((int) (byte) 100, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) (byte) 10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg11, 16);
        micazMsg11.set_Voltage(20);
        org.junit.Assert.assertNotNull(shortArray7);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        laccan.devices.helper.utils.Assistant.predictorType = "init;35.0;0";
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(172);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) 'a', 100);
        int int3 = micazMsg2.dataLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        short[] shortArray4 = micazMsg1.get_Buffer();
        byte[] byteArray5 = micazMsg1.dataGet();
        net.tinyos.message.Message message7 = micazMsg1.clone((int) '4');
        net.tinyos.message.Message message9 = micazMsg1.clone(35);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(message7);
        org.junit.Assert.assertNotNull(message9);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) (byte) 10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg11, 16);
        net.tinyos.message.Message message15 = micazMsg13.clone((int) ' ');
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg13);
        java.lang.String str17 = micazMsg13.toString();
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg13, (long) 6);
        java.lang.String str20 = micazMsg13.toString();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(message15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str17.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str20.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        short[] shortArray12 = micazMsg1.get_Buffer();
        net.tinyos.message.Message message14 = micazMsg1.clone(0);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = micazMsg16.get_Buffer();
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg16);
        short[] shortArray19 = micazMsg16.get_Buffer();
        byte[] byteArray20 = micazMsg16.dataGet();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray20, 16, 1);
        try {
            message14.dataSet(byteArray20, 0, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(message14);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(byteArray20);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg2.set_Buffer(shortArray8);
        micazMsg2.set_Voltage(2);
        java.lang.String str12 = micazMsg2.toString();
        short[] shortArray13 = micazMsg2.get_Buffer();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg2);
        keepingAll0.add(sample14);
        sample14.setTemperature((double) (short) 100);
        double double18 = sample14.getDateDouble();
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        int int12 = micazMsg1.get_Voltage();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray16 = micazMsg15.get_Buffer();
        laccan.devices.Sample sample17 = new laccan.devices.Sample(micazMsg15);
        short[] shortArray18 = micazMsg15.get_Buffer();
        byte[] byteArray19 = micazMsg15.dataGet();
        int int20 = micazMsg15.amType();
        java.lang.String str21 = micazMsg15.toString();
        int int22 = micazMsg15.amType();
        byte[] byteArray23 = micazMsg15.dataGet();
        try {
            micazMsg1.dataSet(byteArray23, 0, 8, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 172 + "'", int20 == 172);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str21.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 172 + "'", int22 == 172);
        org.junit.Assert.assertNotNull(byteArray23);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(0, (int) '#');
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        short[] shortArray12 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        micazMsg1.set_Voltage((-1));
        try {
            short short17 = micazMsg1.getElement_Buffer((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 100 };
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(byteArray10);
        micazMsg1.dataSet(byteArray10);
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg(byteArray10, (int) (short) 100);
        try {
            short short16 = micazMsg14.getElement_Buffer(16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(byteArray10);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests(100L, (long) 'a', (-20));
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(0);
        try {
            laccan.devices.Sample sample2 = new laccan.devices.Sample(micazMsg1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        short[] shortArray12 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        sample13.setNode("");
        java.lang.String[] strArray16 = sample13.toCSV();
        double double17 = sample13.getTemperature();
        java.lang.String[] strArray18 = sample13.toCSV();
        laccan.devices.Type type19 = laccan.devices.Type.FULL;
        sample13.setType(type19);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-19.648499999999995d) + "'", double17 == (-19.648499999999995d));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + laccan.devices.Type.FULL + "'", type19.equals(laccan.devices.Type.FULL));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (byte) -1, 172);
        int int3 = micazMsg2.dataLength();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg2.getSerialPacket();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg9.set_Buffer(shortArray15);
        micazMsg9.set_Voltage(2);
        short short20 = micazMsg9.getElement_Buffer((int) (short) 0);
        int int21 = micazMsg9.get_NodeID();
        byte[] byteArray22 = micazMsg9.dataGet();
        laccan.devices.MicazMsg micazMsg23 = new laccan.devices.MicazMsg(byteArray22);
        short[] shortArray24 = micazMsg23.get_Buffer();
        short[] shortArray25 = micazMsg23.get_Buffer();
        micazMsg7.set_Buffer(shortArray25);
        try {
            micazMsg2.set_Buffer(shortArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length -1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(serialPacket4);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(shortArray25);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        java.lang.String str6 = sample4.getNode();
        double double7 = sample4.getDateDouble();
        sample4.setNode("Message <MicazMsg> \n  [Voltage=0x0]\n  [Buffer=0x200 0x0 0x100 0x100 0x6400 0x100 0x0 0x0 0x0 0x0 ]\n");
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(6, 35);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        int int2 = memory0.length();
        laccan.memory.Container container3 = memory0.getMemory();
        laccan.memory.Container container4 = memory0.getMemory();
        laccan.memory.data.reduction.KeepingAll keepingAll5 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample6 = new laccan.devices.Sample();
        keepingAll5.add(sample6);
        java.lang.String str8 = sample6.getNode();
        sample6.setNode("full_memory");
        memory0.add(sample6);
        laccan.memory.Container container12 = memory0.getMemory();
        laccan.memory.Container container13 = memory0.getMemory();
        laccan.memory.Container container14 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = micazMsg16.get_Buffer();
        java.lang.Object obj18 = micazMsg16.clone();
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg16);
        laccan.devices.Type type20 = null;
        sample19.setType(type20);
        java.lang.String str22 = sample19.getNode();
        sample19.setNode("lastReading;100.0;10");
        sample19.setNode("Message <MicazMsg> \n  [Buffer=");
        memory0.add(sample19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(container3);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(container12);
        org.junit.Assert.assertNotNull(container13);
        org.junit.Assert.assertNotNull(container14);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        laccan.devices.helper.utils.Assistant.predictorType = "null;-19.648499999999995;0";
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        long long5 = sample4.getDate();
        sample4.setDate((long) (-1));
        sample4.setTemperature((double) 0L);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = micazMsg11.get_Buffer();
        java.lang.Object obj13 = micazMsg11.clone();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg11);
        long long15 = sample14.getDate();
        java.lang.String str16 = sample14.getNode();
        laccan.devices.Type type17 = null;
        sample14.setType(type17);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray26 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg20.set_Buffer(shortArray26);
        micazMsg20.set_Voltage(2);
        java.lang.String str30 = micazMsg20.toString();
        short[] shortArray31 = micazMsg20.get_Buffer();
        laccan.devices.Sample sample32 = new laccan.devices.Sample(micazMsg20);
        laccan.devices.Sample sample33 = new laccan.devices.Sample();
        laccan.devices.Type type34 = laccan.devices.Type.FULL;
        sample33.setType(type34);
        sample32.setType(type34);
        sample14.setType(type34);
        sample4.setType(type34);
        java.lang.Class<?> wildcardClass39 = sample4.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str30.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertTrue("'" + type34 + "' != '" + laccan.devices.Type.FULL + "'", type34.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.648499999999995;10", (double) 48, (long) 172);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        int int12 = micazMsg1.get_Voltage();
        int int13 = micazMsg1.dataLength();
        int int14 = micazMsg1.dataLength();
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = micazMsg16.get_Buffer();
        java.lang.Object obj18 = micazMsg16.clone();
        micazMsg16.amTypeSet(20);
        java.lang.Object obj21 = micazMsg16.clone();
        byte[] byteArray22 = new byte[] {};
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg(byteArray22, 20);
        micazMsg16.dataSet(byteArray22);
        laccan.devices.MicazMsg micazMsg27 = new laccan.devices.MicazMsg(byteArray22, 64);
        try {
            micazMsg1.dataSet(byteArray22, (int) ' ', 2, 160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(byteArray22);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((-1L), (-1L), 2);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        java.util.List<laccan.devices.Sample> sampleList3 = storageCSV2.read();
        laccan.persistence.StorageCSV storageCSV5 = storageCSV2.local("");
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = micazMsg7.get_Buffer();
        java.lang.Object obj9 = micazMsg7.clone();
        micazMsg7.amTypeSet(20);
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg7);
        java.lang.String[] strArray13 = sample12.toCSV();
        sample12.setTemperature((double) 100.0f);
        java.lang.String[] strArray16 = sample12.toCSV();
        try {
            storageCSV2.save(strArray16);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: O sistema não pode encontrar o caminho especificado");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(storageCSV5);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1, (long) 2);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 52, 0);
        try {
            int int14 = micazMsg13.get_Voltage();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList1 = keepingAll0.get();
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray4 = micazMsg3.get_Buffer();
        java.lang.Object obj5 = micazMsg3.clone();
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg3);
        laccan.devices.Type type7 = null;
        sample6.setType(type7);
        laccan.devices.Type type9 = null;
        sample6.setType(type9);
        java.lang.String str11 = sample6.toString();
        java.lang.String str12 = sample6.toString();
        keepingAll0.add(sample6);
        laccan.devices.Type type14 = laccan.devices.Type.FULL;
        sample6.setType(type14);
        java.lang.String str16 = sample6.getNode();
        sample6.setTemperature((double) (-1.0f));
        org.junit.Assert.assertNotNull(sampleList1);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null;-19.699999999999996;0" + "'", str11.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null;-19.699999999999996;0" + "'", str12.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + laccan.devices.Type.FULL + "'", type14.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.init(16);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg12.set_Buffer(shortArray18);
        micazMsg12.set_Voltage(2);
        short short23 = micazMsg12.getElement_Buffer((int) (short) 0);
        int int24 = micazMsg12.get_NodeID();
        byte[] byteArray25 = micazMsg12.dataGet();
        micazMsg1.dataSet(byteArray25);
        laccan.devices.MicazMsg micazMsg29 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg29, 16, (int) (short) 10);
        micazMsg29.amTypeSet((int) (byte) 1);
        laccan.devices.MicazMsg micazMsg36 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray37 = micazMsg36.get_Buffer();
        java.lang.Object obj38 = micazMsg36.clone();
        micazMsg36.amTypeSet(20);
        java.lang.Object obj41 = micazMsg36.clone();
        byte[] byteArray42 = new byte[] {};
        laccan.devices.MicazMsg micazMsg44 = new laccan.devices.MicazMsg(byteArray42, 20);
        micazMsg36.dataSet(byteArray42);
        micazMsg29.dataSet(byteArray42);
        micazMsg1.dataSet(byteArray42);
        laccan.devices.MicazMsg micazMsg49 = new laccan.devices.MicazMsg(byteArray42, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg51 = new laccan.devices.MicazMsg(byteArray42, (int) '4');
        try {
            laccan.devices.MicazMsg micazMsg54 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg51, 35, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 87, data_length 100 and data array size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(byteArray42);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
        net.tinyos.message.SerialPacket serialPacket5 = micazMsg1.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(serialPacket5);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        int int5 = micazMsg4.amType();
        byte[] byteArray6 = micazMsg4.dataGet();
        micazMsg1.dataSet(byteArray6);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray6, (int) (short) 0, 16);
        micazMsg10.set_Voltage((-1));
        try {
            micazMsg10.setElement_Buffer(16, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 172 + "'", int5 == 172);
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.amType();
        byte[] byteArray3 = micazMsg1.dataGet();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        sample4.setNode("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172 + "'", int2 == 172);
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("reduction", (-19.648499999999995d), 100L);
        sample3.setDate((long) (byte) 100);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        int int12 = micazMsg1.get_Voltage();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
        micazMsg1.set_NodeID(97);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg19);
        int int21 = micazMsg19.dataLength();
        micazMsg19.set_NodeID((int) (short) -1);
        try {
            micazMsg1.dataSet((net.tinyos.message.Message) micazMsg19, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
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
        java.util.List<laccan.devices.Sample> sampleList13 = null;
        laccan.cloud.prediction.Regression regression14 = new laccan.cloud.prediction.Regression();
        laccan.cloud.prediction.Regression regression15 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray18 = micazMsg17.get_Buffer();
        java.lang.Object obj19 = micazMsg17.clone();
        laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg17);
        laccan.devices.Sample sample21 = new laccan.devices.Sample();
        laccan.devices.Sample sample22 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray23 = new laccan.devices.Sample[] { sample20, sample21, sample22 };
        java.util.ArrayList<laccan.devices.Sample> sampleList24 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList24, sampleArray23);
        java.util.List<java.lang.Double> doubleList26 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList24);
        java.util.List<java.lang.Double> doubleList27 = regression15.result(doubleList26);
        java.util.List<java.lang.Double> doubleList28 = regression14.result(doubleList27);
        regression0.init(sampleList13, doubleList27);
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
        java.util.List<java.lang.Double> doubleList41 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList38);
        java.util.List<java.lang.Double> doubleList42 = regression0.result(doubleList41);
        try {
            regression0.train();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(sampleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(sampleArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleList26);
        org.junit.Assert.assertNotNull(doubleList27);
        org.junit.Assert.assertNotNull(doubleList28);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(sampleArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleList40);
        org.junit.Assert.assertNotNull(doubleList41);
        org.junit.Assert.assertNotNull(doubleList42);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
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
        laccan.devices.Sample sample15 = new laccan.devices.Sample();
        keepingAll14.add(sample15);
        java.util.List<laccan.devices.Sample> sampleList17 = keepingAll14.get();
        laccan.persistence.StorageCSV storageCSV18 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV20 = storageCSV18.local("");
        java.util.List<laccan.devices.Sample> sampleList21 = storageCSV20.read();
        java.util.List<java.lang.Double> doubleList22 = laccan.cloud.prediction.Regression.makeTests(sampleList21);
        regression0.init(sampleList17, doubleList22);
        java.util.List<java.lang.Double> doubleList24 = laccan.cloud.prediction.Regression.makeTests(sampleList17);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(sampleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals((double) double13, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList17);
        org.junit.Assert.assertNotNull(storageCSV20);
        org.junit.Assert.assertNotNull(sampleList21);
        org.junit.Assert.assertNotNull(doubleList22);
        org.junit.Assert.assertNotNull(doubleList24);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        int int7 = micazMsg1.amType();
        micazMsg1.init(1);
        try {
            int int10 = micazMsg1.get_NodeID();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (0) or length (16), for data_length 1 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        laccan.memory.data.reduction.KeepingAll keepingAll0 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg2.set_Buffer(shortArray8);
        micazMsg2.set_Voltage(2);
        java.lang.String str12 = micazMsg2.toString();
        short[] shortArray13 = micazMsg2.get_Buffer();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg2);
        keepingAll0.add(sample14);
        int int16 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray19 = micazMsg18.get_Buffer();
        java.lang.Object obj20 = micazMsg18.clone();
        micazMsg18.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg24 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg18, (int) (byte) 0);
        int int25 = micazMsg18.baseOffset();
        laccan.devices.Sample sample27 = new laccan.devices.Sample(micazMsg18, (long) 2);
        keepingAll0.add(sample27);
        laccan.devices.MicazMsg micazMsg30 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray31 = micazMsg30.get_Buffer();
        java.lang.Object obj32 = micazMsg30.clone();
        laccan.devices.Sample sample33 = new laccan.devices.Sample(micazMsg30);
        long long34 = sample33.getDate();
        sample33.setDate((long) (-1));
        laccan.devices.Type type37 = sample33.getType();
        keepingAll0.add(sample33);
        int int39 = keepingAll0.length();
        laccan.devices.MicazMsg micazMsg41 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray42 = micazMsg41.get_Buffer();
        java.lang.Object obj43 = micazMsg41.clone();
        laccan.devices.Sample sample44 = new laccan.devices.Sample(micazMsg41);
        long long45 = sample44.getDate();
        laccan.devices.MicazMsg micazMsg47 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray53 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg47.set_Buffer(shortArray53);
        micazMsg47.set_Voltage(2);
        java.lang.String str57 = micazMsg47.toString();
        short[] shortArray58 = micazMsg47.get_Buffer();
        laccan.devices.Sample sample59 = new laccan.devices.Sample(micazMsg47);
        laccan.devices.Sample sample60 = new laccan.devices.Sample();
        laccan.devices.Type type61 = laccan.devices.Type.FULL;
        sample60.setType(type61);
        sample59.setType(type61);
        sample44.setType(type61);
        keepingAll0.add(sample44);
        laccan.devices.MicazMsg micazMsg67 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray68 = micazMsg67.get_Buffer();
        java.lang.Object obj69 = micazMsg67.clone();
        laccan.devices.Sample sample70 = new laccan.devices.Sample(micazMsg67);
        long long71 = sample70.getDate();
        java.lang.String str72 = sample70.getNode();
        laccan.devices.Type type73 = null;
        sample70.setType(type73);
        java.lang.String str75 = sample70.getNode();
        sample70.setTemperature((double) 160);
        laccan.devices.Type type78 = sample70.getType();
        java.lang.String str79 = sample70.getNode();
        keepingAll0.add(sample70);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str12.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNull(type37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str57.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertTrue("'" + type61 + "' != '" + laccan.devices.Type.FULL + "'", type61.equals(laccan.devices.Type.FULL));
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNull(type78);
        org.junit.Assert.assertNull(str79);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        java.lang.Object obj6 = micazMsg1.clone();
        byte[] byteArray7 = new byte[] {};
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray7, 20);
        micazMsg1.dataSet(byteArray7);
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg(byteArray7, 64);
        try {
            laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg12, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length -64 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        double double7 = sample4.getDateDouble();
        laccan.devices.Type type8 = sample4.getType();
        long long9 = sample4.getDate();
        double double10 = sample4.getTemperature();
        laccan.devices.Type type11 = sample4.getType();
        laccan.devices.Type type12 = sample4.getType();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-19.699999999999996d) + "'", double10 == (-19.699999999999996d));
        org.junit.Assert.assertNull(type11);
        org.junit.Assert.assertNull(type12);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(97);
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg3.set_Buffer(shortArray9);
        micazMsg1.set_Buffer(shortArray9);
        org.junit.Assert.assertNotNull(shortArray9);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        short[] shortArray4 = micazMsg2.get_Buffer();
        int int5 = micazMsg2.baseOffset();
        try {
            short short7 = micazMsg2.getElement_Buffer(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg3.set_Buffer(shortArray9);
        micazMsg3.set_Voltage(2);
        java.lang.String str13 = micazMsg3.toString();
        short[] shortArray14 = micazMsg3.get_Buffer();
        laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg3);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg3);
        byte[] byteArray17 = micazMsg3.dataGet();
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray17);
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray17);
        try {
            micazMsg1.dataSet(byteArray17, (int) (short) 0, 512, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str13.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(byteArray17);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        short[] shortArray4 = micazMsg1.get_Buffer();
        short short6 = micazMsg1.getElement_Buffer(2);
        java.lang.String str7 = micazMsg1.toString();
        try {
            micazMsg1.init((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str7.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        laccan.persistence.StorageCSV storageCSV4 = storageCSV0.local("lastReading;100.0;10");
        laccan.persistence.StorageCSV storageCSV5 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV7 = storageCSV5.local("");
        laccan.persistence.StorageCSV storageCSV9 = storageCSV7.local("full_memory");
        laccan.persistence.StorageCSV storageCSV11 = storageCSV9.local("reduction");
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray14 = micazMsg13.get_Buffer();
        java.lang.Object obj15 = micazMsg13.clone();
        micazMsg13.amTypeSet(20);
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg13);
        java.lang.String[] strArray19 = sample18.toCSV();
        storageCSV9.save(strArray19);
        storageCSV4.save(strArray19);
        try {
            java.util.List<laccan.devices.Sample> sampleList22 = storageCSV4.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-19.699999999999996\"");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(storageCSV4);
        org.junit.Assert.assertNotNull(storageCSV7);
        org.junit.Assert.assertNotNull(storageCSV9);
        org.junit.Assert.assertNotNull(storageCSV11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4', (-20));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        byte[] byteArray0 = null;
        try {
            laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(byteArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        try {
            int int1 = laccan.devices.MicazMsg.offset_Buffer(64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 512, (long) (short) 10, (int) 'a');
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) 'a');
        net.tinyos.message.SerialPacket serialPacket2 = micazMsg1.getSerialPacket();
        org.junit.Assert.assertNull(serialPacket2);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        memory0.build();
        laccan.memory.data.reduction.KeepingAll keepingAll2 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg4.set_Buffer(shortArray10);
        micazMsg4.set_Voltage(2);
        java.lang.String str14 = micazMsg4.toString();
        short[] shortArray15 = micazMsg4.get_Buffer();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg4);
        keepingAll2.add(sample16);
        int int18 = keepingAll2.length();
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray21 = micazMsg20.get_Buffer();
        java.lang.Object obj22 = micazMsg20.clone();
        micazMsg20.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg26 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg20, (int) (byte) 0);
        int int27 = micazMsg20.baseOffset();
        laccan.devices.Sample sample29 = new laccan.devices.Sample(micazMsg20, (long) 2);
        keepingAll2.add(sample29);
        memory0.add(sample29);
        sample29.setTemperature((double) (short) 100);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str14.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.648499999999995;0", (double) (byte) 1, (long) (short) 100);
        double double4 = sample3.getDateDouble();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        short[] shortArray12 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
        byte[] byteArray15 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg17 = new laccan.devices.MicazMsg(byteArray15, (-1));
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray15, 48);
        try {
            laccan.devices.Sample sample20 = new laccan.devices.Sample(micazMsg19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 4 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(byteArray15);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.amType();
        byte[] byteArray3 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray11 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg5.set_Buffer(shortArray11);
        micazMsg5.set_Voltage(2);
        short short16 = micazMsg5.getElement_Buffer((int) (short) 0);
        int int17 = micazMsg5.get_NodeID();
        byte[] byteArray18 = micazMsg5.dataGet();
        laccan.devices.MicazMsg micazMsg19 = new laccan.devices.MicazMsg(byteArray18);
        short[] shortArray20 = micazMsg19.get_Buffer();
        short[] shortArray21 = micazMsg19.get_Buffer();
        micazMsg1.set_Buffer(shortArray21);
        try {
            short short24 = micazMsg1.getElement_Buffer(48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172 + "'", int2 == 172);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(shortArray21);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        laccan.devices.MicazMsg micazMsg0 = new laccan.devices.MicazMsg();
        net.tinyos.message.SerialPacket serialPacket1 = micazMsg0.getSerialPacket();
        org.junit.Assert.assertNull(serialPacket1);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        short[] shortArray12 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
        micazMsg1.set_NodeID(32);
        micazMsg1.init((int) (byte) 0);
        int int19 = micazMsg1.dataLength();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests((long) 16, (long) 6, 97);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        int int6 = micazMsg1.baseOffset();
        short[] shortArray7 = null;
        try {
            micazMsg1.set_Buffer(shortArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) (byte) 10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg11, 16);
        net.tinyos.message.Message message15 = micazMsg13.clone((int) ' ');
        net.tinyos.message.SerialPacket serialPacket16 = message15.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(message15);
        org.junit.Assert.assertNull(serialPacket16);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        int int9 = micazMsg1.amType();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 1, 16);
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        try {
            short short16 = micazMsg1.getElement_Buffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        double[] doubleArray2 = laccan.devices.Micaz.calculateSensirion(0, 97);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) (byte) 10);
        micazMsg11.init((int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = micazMsg11.getClass();
        try {
            laccan.devices.Sample sample15 = new laccan.devices.Sample(micazMsg11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (32) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        short[] shortArray12 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
        micazMsg1.setElement_Buffer(0, (short) (byte) 10);
        net.tinyos.message.SerialPacket serialPacket18 = micazMsg1.getSerialPacket();
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNull(serialPacket18);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        byte[] byteArray0 = new byte[] {};
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(byteArray0, 20);
        int int3 = micazMsg2.dataLength();
        int int4 = micazMsg2.amType();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-20) + "'", int3 == (-20));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 172 + "'", int4 == 172);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        laccan.devices.Sample sample3 = new laccan.devices.Sample("null;-19.648499999999995;10", Double.NaN, (long) 52);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        try {
            micazMsg1.setElement_Buffer((-1), (short) -156);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV2 = storageCSV0.local("");
        java.util.List<laccan.devices.Sample> sampleList3 = storageCSV2.read();
        laccan.persistence.StorageCSV storageCSV4 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV6 = storageCSV4.local("");
        laccan.persistence.StorageCSV storageCSV8 = storageCSV6.local("full_memory");
        laccan.persistence.StorageCSV storageCSV10 = storageCSV6.local("");
        laccan.persistence.StorageCSV storageCSV12 = storageCSV6.local("full_memory");
        laccan.persistence.StorageCSV storageCSV14 = storageCSV6.local("null;-19.699999999999996;0");
        laccan.persistence.StorageCSV storageCSV15 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV17 = storageCSV15.local("");
        laccan.persistence.StorageCSV storageCSV19 = storageCSV17.local("full_memory");
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray22 = micazMsg21.get_Buffer();
        java.lang.Object obj23 = micazMsg21.clone();
        laccan.devices.Sample sample24 = new laccan.devices.Sample(micazMsg21);
        laccan.devices.Type type25 = null;
        sample24.setType(type25);
        laccan.devices.Type type27 = null;
        sample24.setType(type27);
        java.lang.String str29 = sample24.toString();
        java.lang.String str30 = sample24.toString();
        sample24.setDate((-1L));
        java.lang.String[] strArray33 = sample24.toCSV();
        storageCSV17.save(strArray33);
        storageCSV6.save(strArray33);
        try {
            storageCSV2.save(strArray33);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: O sistema não pode encontrar o caminho especificado");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(storageCSV2);
        org.junit.Assert.assertNotNull(sampleList3);
        org.junit.Assert.assertNotNull(storageCSV6);
        org.junit.Assert.assertNotNull(storageCSV8);
        org.junit.Assert.assertNotNull(storageCSV10);
        org.junit.Assert.assertNotNull(storageCSV12);
        org.junit.Assert.assertNotNull(storageCSV14);
        org.junit.Assert.assertNotNull(storageCSV17);
        org.junit.Assert.assertNotNull(storageCSV19);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "null;-19.699999999999996;0" + "'", str29.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "null;-19.699999999999996;0" + "'", str30.equals("null;-19.699999999999996;0"));
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) (byte) 10);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg11, 16);
        net.tinyos.message.Message message15 = micazMsg13.clone((int) ' ');
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg13);
        java.lang.String str17 = micazMsg13.toString();
        laccan.devices.Sample sample19 = new laccan.devices.Sample(micazMsg13, (long) 6);
        micazMsg13.set_NodeID(32);
        try {
            short short23 = micazMsg13.getElement_Buffer(64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(message15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str17.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n"));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        java.util.List<java.lang.Long> longList3 = laccan.cloud.prediction.Regression.makeTests(0L, 10L, 52);
        org.junit.Assert.assertNotNull(longList3);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        int int4 = micazMsg1.get_Voltage();
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1, (long) 160);
        try {
            laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot create Message with base_offset 35, data_length 24 and data array size 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        try {
            int int1 = laccan.devices.MicazMsg.numElements_Buffer((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
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
        java.lang.Double[] doubleArray14 = new java.lang.Double[] { (-1.0d) };
        java.util.ArrayList<java.lang.Double> doubleList15 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList15, doubleArray14);
        java.util.List<java.lang.Double> doubleList17 = regression0.result((java.util.List<java.lang.Double>) doubleList15);
        java.lang.Double[] doubleArray24 = new java.lang.Double[] { (-1.0d), 10.0d, (-1.0d), 1.0d, 1.0d, 10.0d };
        java.util.ArrayList<java.lang.Double> doubleList25 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList25, doubleArray24);
        java.util.List<java.lang.Double> doubleList27 = regression0.result((java.util.List<java.lang.Double>) doubleList25);
        double double28 = regression0.mse();
        double double29 = regression0.mse();
        laccan.cloud.prediction.Regression regression30 = new laccan.cloud.prediction.Regression();
        laccan.devices.MicazMsg micazMsg32 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray33 = micazMsg32.get_Buffer();
        java.lang.Object obj34 = micazMsg32.clone();
        laccan.devices.Sample sample35 = new laccan.devices.Sample(micazMsg32);
        laccan.devices.Sample sample36 = new laccan.devices.Sample();
        laccan.devices.Sample sample37 = new laccan.devices.Sample();
        laccan.devices.Sample[] sampleArray38 = new laccan.devices.Sample[] { sample35, sample36, sample37 };
        java.util.ArrayList<laccan.devices.Sample> sampleList39 = new java.util.ArrayList<laccan.devices.Sample>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<laccan.devices.Sample>) sampleList39, sampleArray38);
        java.util.List<java.lang.Double> doubleList41 = laccan.cloud.prediction.Regression.makeTests((java.util.List<laccan.devices.Sample>) sampleList39);
        java.util.List<java.lang.Double> doubleList42 = regression30.result(doubleList41);
        double double43 = regression30.mse();
        laccan.memory.data.reduction.KeepingAll keepingAll44 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample45 = new laccan.devices.Sample();
        keepingAll44.add(sample45);
        java.util.List<laccan.devices.Sample> sampleList47 = keepingAll44.get();
        laccan.persistence.StorageCSV storageCSV48 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV50 = storageCSV48.local("");
        java.util.List<laccan.devices.Sample> sampleList51 = storageCSV50.read();
        java.util.List<java.lang.Double> doubleList52 = laccan.cloud.prediction.Regression.makeTests(sampleList51);
        regression30.init(sampleList47, doubleList52);
        laccan.cloud.prediction.Regression regression54 = new laccan.cloud.prediction.Regression();
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
        java.util.List<java.lang.Double> doubleList68 = regression54.result(doubleList67);
        laccan.persistence.StorageCSV storageCSV69 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV71 = storageCSV69.local("");
        java.util.List<laccan.devices.Sample> sampleList72 = storageCSV71.read();
        java.util.List<java.lang.Double> doubleList73 = laccan.cloud.prediction.Regression.makeTests(sampleList72);
        laccan.persistence.StorageCSV storageCSV74 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV76 = storageCSV74.local("");
        java.util.List<laccan.devices.Sample> sampleList77 = storageCSV76.read();
        java.util.List<java.lang.Double> doubleList78 = laccan.cloud.prediction.Regression.makeTests(sampleList77);
        regression54.init(sampleList72, doubleList78);
        regression54.train();
        laccan.persistence.StorageCSV storageCSV81 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV83 = storageCSV81.local("");
        java.util.List<laccan.devices.Sample> sampleList84 = storageCSV83.read();
        java.util.List<java.lang.Double> doubleList85 = laccan.cloud.prediction.Regression.makeTests(sampleList84);
        java.util.List<java.lang.Double> doubleList86 = regression54.result(doubleList85);
        regression0.init(sampleList47, doubleList85);
        java.util.List<java.lang.Double> doubleList88 = laccan.cloud.prediction.Regression.makeTests(sampleList47);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(sampleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(doubleList27);
        org.junit.Assert.assertEquals((double) double28, Double.NaN, 0);
        org.junit.Assert.assertEquals((double) double29, Double.NaN, 0);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(sampleArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(doubleList41);
        org.junit.Assert.assertNotNull(doubleList42);
        org.junit.Assert.assertEquals((double) double43, Double.NaN, 0);
        org.junit.Assert.assertNotNull(sampleList47);
        org.junit.Assert.assertNotNull(storageCSV50);
        org.junit.Assert.assertNotNull(sampleList51);
        org.junit.Assert.assertNotNull(doubleList52);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(sampleArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(doubleList66);
        org.junit.Assert.assertNotNull(doubleList67);
        org.junit.Assert.assertNotNull(doubleList68);
        org.junit.Assert.assertNotNull(storageCSV71);
        org.junit.Assert.assertNotNull(sampleList72);
        org.junit.Assert.assertNotNull(doubleList73);
        org.junit.Assert.assertNotNull(storageCSV76);
        org.junit.Assert.assertNotNull(sampleList77);
        org.junit.Assert.assertNotNull(doubleList78);
        org.junit.Assert.assertNotNull(storageCSV83);
        org.junit.Assert.assertNotNull(sampleList84);
        org.junit.Assert.assertNotNull(doubleList85);
        org.junit.Assert.assertNotNull(doubleList86);
        org.junit.Assert.assertNotNull(doubleList88);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(4, (int) (byte) 1);
        int int3 = micazMsg2.get_NodeID();
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray6 = micazMsg5.get_Buffer();
        java.lang.Object obj7 = micazMsg5.clone();
        micazMsg5.amTypeSet(20);
        java.lang.Object obj10 = micazMsg5.clone();
        byte[] byteArray11 = new byte[] {};
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg(byteArray11, 20);
        micazMsg5.dataSet(byteArray11);
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray11, 64);
        micazMsg2.dataSet(byteArray11);
        try {
            micazMsg2.setElement_Buffer((int) (byte) -1, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(byteArray11);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(1, 80);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        net.tinyos.message.Message message0 = null;
        try {
            laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(message0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Type type5 = null;
        sample4.setType(type5);
        sample4.setNode("null;-19.699999999999996;0");
        long long9 = sample4.getDate();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        java.lang.String str11 = micazMsg1.toString();
        short[] shortArray12 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
        int int15 = micazMsg1.amType();
        net.tinyos.message.Message message17 = micazMsg1.clone(10);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str11.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 172 + "'", int15 == 172);
        org.junit.Assert.assertNotNull(message17);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        laccan.devices.MicazMsg micazMsg5 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg2, 16, (int) (short) 10);
        int int6 = micazMsg2.baseOffset();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        short[] shortArray4 = micazMsg1.get_Buffer();
        byte[] byteArray5 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray5, 16, 1);
        byte[] byteArray9 = micazMsg8.dataGet();
        laccan.devices.MicazMsg micazMsg12 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg8, (int) (short) -1, (int) ' ');
        laccan.devices.MicazMsg micazMsg14 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray15 = micazMsg14.get_Buffer();
        laccan.devices.Sample sample16 = new laccan.devices.Sample(micazMsg14);
        short[] shortArray17 = micazMsg14.get_Buffer();
        byte[] byteArray18 = micazMsg14.dataGet();
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray18, 16, 1);
        byte[] byteArray22 = micazMsg21.dataGet();
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg21, (int) (short) -1, (int) ' ');
        try {
            micazMsg8.dataSet((net.tinyos.message.Message) micazMsg21, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray22);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.get_NodeID();
        int int9 = micazMsg1.get_Voltage();
        micazMsg1.set_NodeID(10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        int int1 = laccan.devices.MicazMsg.numElements_Buffer((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        laccan.devices.helper.utils.Assistant.reducerType = "Message <MicazMsg> \n  [NodeID=0x64]\n  [Voltage=0xffff]\n  [Buffer=0xff64 ";
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        micazMsg1.init(32);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg11.set_Buffer(shortArray17);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg11, 0, (int) (byte) 10);
        short[] shortArray22 = micazMsg11.get_Buffer();
        micazMsg1.set_Buffer(shortArray22);
        try {
            short short25 = micazMsg1.getElement_Buffer(20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray22);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, (int) (byte) 10);
        micazMsg11.init((int) (byte) 0);
        try {
            micazMsg11.set_Voltage((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(shortArray7);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        short[] shortArray4 = micazMsg2.get_Buffer();
        laccan.devices.MicazMsg micazMsg6 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray12 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg6.set_Buffer(shortArray12);
        micazMsg6.set_Voltage(2);
        java.lang.String str16 = micazMsg6.toString();
        short[] shortArray17 = micazMsg6.get_Buffer();
        laccan.devices.Sample sample18 = new laccan.devices.Sample(micazMsg6);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg6);
        byte[] byteArray20 = micazMsg6.dataGet();
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray20);
        micazMsg2.dataSet(byteArray20);
        laccan.devices.MicazMsg micazMsg25 = new laccan.devices.MicazMsg(byteArray20, 48, (int) (byte) -1);
        laccan.devices.MicazMsg micazMsg28 = new laccan.devices.MicazMsg(byteArray20, 2, (int) (byte) 0);
        try {
            micazMsg28.set_Voltage((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Message.checkBounds: bad offset (16) or length (16), for data_length 0 in class class laccan.devices.MicazMsg");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n" + "'", str16.equals("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n"));
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(byteArray20);
    }
}

