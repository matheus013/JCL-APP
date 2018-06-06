package laccan;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        int int1 = memory0.length();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray3 = micazMsg2.get_Buffer();
        java.lang.Object obj4 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2);
        long long6 = sample5.getDate();
        memory0.add(sample5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        regression0.train();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.data.reduction.KeepingAll keepingAll1 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample2 = new laccan.devices.Sample();
        keepingAll1.add(sample2);
        sample2.setDate(10L);
        memory0.add(sample2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.data.reduction.KeepingAll keepingAll2 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample3 = new laccan.devices.Sample();
        keepingAll2.add(sample3);
        sample3.setDate(10L);
        memory0.add(sample3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray4 = micazMsg3.get_Buffer();
        java.lang.Object obj5 = micazMsg3.clone();
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg3);
        sample6.setTemperature((double) 16);
        memory0.add(sample6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
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
        regression0.train();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
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
        java.util.List<java.lang.Double> doubleList15 = regression0.result();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        regression0.train();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg2.set_Buffer(shortArray8);
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg2);
        memory0.add(sample10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        int int2 = micazMsg1.dataLength();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        java.util.List<java.lang.Double> doubleList13 = regression0.result();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        double double2 = regression0.mse();
        regression0.train();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("memory;-1.0;32");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("reduction;-19.699999999999996;0");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("full_memory");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;-19.699999999999996;0");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("init");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        java.util.List<java.lang.Double> doubleList2 = regression0.result();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        java.lang.String str7 = micazMsg1.toString();
        micazMsg1.amTypeSet(16);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        net.tinyos.message.Message message9 = micazMsg1.clone(2);
        byte[] byteArray10 = micazMsg1.dataGet();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        double double2 = regression0.mse();
        java.util.List<java.lang.Double> doubleList3 = regression0.result();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("result");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray4 = micazMsg3.get_Buffer();
        java.lang.Object obj5 = micazMsg3.clone();
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg3);
        long long7 = sample6.getDate();
        laccan.devices.Type type8 = laccan.devices.Type.FULL;
        sample6.setType(type8);
        sample6.setNode("reduction");
        java.lang.Class<?> wildcardClass12 = sample6.getClass();
        memory0.add(sample6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray4 = micazMsg3.get_Buffer();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg3);
        laccan.devices.Type type6 = sample5.getType();
        memory0.add(sample5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 10);
        net.tinyos.message.Message message11 = micazMsg9.clone(0);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
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
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg4.set_Buffer(shortArray10);
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg4);
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg4);
        memory0.add(sample13);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x64]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 ");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("memory");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("nodes");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 0);
        int int8 = micazMsg1.baseOffset();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) 512);
        micazMsg2.set_Voltage(16);
        micazMsg2.init(100);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
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
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg11);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("reduction");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("lastReading");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        double double2 = regression0.mse();
        double double3 = regression0.mse();
        java.util.List<java.lang.Double> doubleList4 = regression0.result();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("hi!");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
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
        regression0.train();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        double double2 = regression0.mse();
        double double3 = regression0.mse();
        regression0.train();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        java.lang.Object obj3 = micazMsg2.clone();
        int int4 = micazMsg2.get_NodeID();
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2, (long) (byte) -1);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) (byte) 100);
        micazMsg1.amTypeSet(2);
        int int9 = micazMsg1.get_NodeID();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg13 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg11, 0);
        short[] shortArray14 = micazMsg11.get_Buffer();
        micazMsg1.set_Buffer(shortArray14);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        java.lang.Object obj13 = micazMsg12.clone();
        int int14 = micazMsg12.get_Voltage();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg12);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 4);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg4);
        int int6 = micazMsg4.dataLength();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;0.0;512");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1);
        java.lang.Object obj6 = micazMsg1.clone();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("memory;-19.699999999999996;-1;10.0;-1");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;-19.699999999999996;10");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(24);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        int int2 = memory0.length();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;-19.699999999999996;52");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.amTypeSet((int) (byte) 100);
        micazMsg1.amTypeSet(2);
        java.lang.Object obj9 = micazMsg1.clone();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x10]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(24, 0);
        laccan.devices.Sample sample4 = new laccan.devices.Sample(micazMsg2, 1L);
        micazMsg2.set_Voltage((int) (short) 1);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg2);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x18]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg(byteArray8);
        micazMsg1.dataSet(byteArray8);
        net.tinyos.message.Message message12 = micazMsg1.clone((int) (short) 10);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1);
        int int11 = micazMsg1.amType();
        java.lang.String str12 = micazMsg1.toString();
        micazMsg1.init((int) (short) 100);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [Buffer=");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        micazMsg1.setElement_Buffer(0, (short) 10);
        micazMsg1.set_Voltage(0);
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (int) (byte) 10);
        micazMsg9.set_NodeID(20);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        java.lang.String str4 = micazMsg1.toString();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("memory;-19.699999999999996;-1");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4', (int) '4');
        micazMsg2.amTypeSet((int) (byte) 100);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
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
        regression0.train();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg1);
        short[] shortArray8 = micazMsg1.get_Buffer();
        int int9 = micazMsg1.baseOffset();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 ");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;1.0;0");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        double double2 = regression0.mse();
        double double3 = regression0.mse();
        double double4 = regression0.mse();
        java.util.List<java.lang.Double> doubleList5 = regression0.result();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("hi!;-19.699999999999996;0");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        double double2 = regression0.mse();
        laccan.cloud.prediction.Regression regression3 = new laccan.cloud.prediction.Regression();
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
        java.util.List<java.lang.Double> doubleList22 = regression3.result(doubleList19);
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
        laccan.memory.data.reduction.KeepingAll keepingAll34 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample35 = new laccan.devices.Sample();
        keepingAll34.add(sample35);
        int int37 = keepingAll34.length();
        java.util.List<laccan.devices.Sample> sampleList38 = keepingAll34.get();
        java.util.List<laccan.devices.Sample> sampleList39 = keepingAll34.get();
        java.util.List<java.lang.Double> doubleList40 = laccan.cloud.prediction.Regression.makeTests(sampleList39);
        regression3.init((java.util.List<laccan.devices.Sample>) sampleList31, doubleList40);
        java.util.List<java.lang.Double> doubleList42 = regression0.result(doubleList40);
        double double43 = regression0.mse();
        java.util.List<java.lang.Double> doubleList44 = regression0.result();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("memory;-19.699999999999996;-1;32.0;32");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x64]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray4 = micazMsg3.get_Buffer();
        java.lang.Object obj5 = micazMsg3.clone();
        int int6 = micazMsg3.get_NodeID();
        micazMsg3.setElement_Buffer(1, (short) (byte) 0);
        int int10 = micazMsg3.baseOffset();
        int int11 = micazMsg3.dataLength();
        laccan.devices.Sample sample13 = new laccan.devices.Sample(micazMsg3, 0L);
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
        laccan.devices.Type type29 = sample18.getType();
        sample13.setType(type29);
        memory0.add(sample13);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg7 = new laccan.devices.MicazMsg(byteArray6);
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray6);
        java.lang.String str9 = micazMsg8.toString();
        int int10 = micazMsg8.baseOffset();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg8);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        short[] shortArray11 = micazMsg1.get_Buffer();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("memory;2.0;-1");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;10.0;100");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.set_NodeID(20);
        micazMsg1.amTypeSet(512);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0, 32);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x6401]\n  [Voltage=0x0]\n  [Buffer=0x1 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("reduction;-19.699999999999996;0;-1.0;0");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray17 = micazMsg16.get_Buffer();
        java.lang.Object obj18 = micazMsg16.clone();
        int int19 = micazMsg16.get_NodeID();
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray22 = micazMsg21.get_Buffer();
        micazMsg16.set_Buffer(shortArray22);
        micazMsg13.set_Buffer(shortArray22);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg13);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        micazMsg1.amTypeSet(0);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(52, 52);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg2);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
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
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;97.0;0");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        micazMsg1.amTypeSet(160);
        int int11 = micazMsg1.amType();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg18);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        java.lang.Object obj13 = micazMsg12.clone();
        micazMsg12.set_NodeID(0);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg12);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.devices.Sample sample4 = new laccan.devices.Sample("memory", (double) (byte) -1, (long) ' ');
        long long5 = sample4.getDate();
        memory0.add(sample4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        java.lang.Object obj8 = micazMsg1.clone();
        byte[] byteArray9 = micazMsg1.dataGet();
        int int10 = micazMsg1.get_Voltage();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x100]\n  [Buffer=;NaN;35");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;-19.699999999999996;1");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;-19.699999999999996;48");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 4);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg4);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 ");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) ' ', 1);
        java.lang.String str3 = micazMsg2.toString();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg2);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg3.set_Buffer(shortArray9);
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg3);
        short[] shortArray12 = micazMsg3.get_Buffer();
        micazMsg1.set_Buffer(shortArray12);
        laccan.devices.MicazMsg micazMsg15 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 52);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;0.0;100");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        byte[] byteArray14 = micazMsg2.dataGet();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg2);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        short[] shortArray5 = micazMsg2.get_Buffer();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(172, 24);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg2);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        micazMsg1.set_Voltage(2);
        int int11 = micazMsg1.baseOffset();
        java.lang.Object obj12 = micazMsg1.clone();
        int int13 = micazMsg1.dataLength();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        byte[] byteArray7 = micazMsg1.dataGet();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg(byteArray7);
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg(byteArray7, (int) (short) -1);
        short[] shortArray11 = micazMsg10.get_Buffer();
        int int12 = micazMsg10.amType();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        java.lang.String str9 = micazMsg1.toString();
        micazMsg1.set_NodeID(24);
        java.lang.Object obj12 = micazMsg1.clone();
        int int13 = micazMsg1.baseOffset();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        int int10 = micazMsg1.amType();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
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
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg27);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xa 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;10.0;35");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0xffff 0x0 0x0 0x0 0x0 0x0 ");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
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
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray17);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg18);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;-19.699999999999996;-1");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        short short5 = micazMsg1.getElement_Buffer((int) (short) 0);
        short[] shortArray6 = micazMsg1.get_Buffer();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 8);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        net.tinyos.message.SerialPacket serialPacket7 = micazMsg1.getSerialPacket();
        laccan.devices.MicazMsg micazMsg10 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, (-1), 0);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg3 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray9 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg3.set_Buffer(shortArray9);
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg3);
        short[] shortArray12 = micazMsg3.get_Buffer();
        micazMsg1.set_Buffer(shortArray12);
        java.lang.Class<?> wildcardClass14 = micazMsg1.getClass();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        micazMsg1.setElement_Buffer(1, (short) (byte) 0);
        micazMsg1.set_NodeID((int) 'a');
        int int10 = micazMsg1.dataLength();
        laccan.devices.Sample sample11 = new laccan.devices.Sample(micazMsg1);
        net.tinyos.message.Message message13 = micazMsg1.clone((int) (byte) 0);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x23]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;32.0;100");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        micazMsg1.amTypeSet(20);
        int int6 = micazMsg1.baseOffset();
        laccan.devices.MicazMsg micazMsg8 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 0);
        java.lang.String str9 = micazMsg8.toString();
        laccan.devices.MicazMsg micazMsg11 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg8, (int) (short) 0);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg8);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
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
        java.lang.Object obj13 = micazMsg12.clone();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg12);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
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
        net.tinyos.message.Message message12 = micazMsg1.clone((int) '4');
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;-19.694999999999997;1");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;0.0;0");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        micazMsg1.set_Voltage(20);
        micazMsg1.set_NodeID(10);
        micazMsg1.init(51);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        net.tinyos.message.SerialPacket serialPacket4 = micazMsg1.getSerialPacket();
        micazMsg1.set_NodeID((int) (byte) -1);
        java.lang.String str7 = micazMsg1.toString();
        short[] shortArray8 = micazMsg1.get_Buffer();
        int int9 = micazMsg1.amType();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("reduction;-19.699999999999996;0;1.0;0");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(100, (int) (short) 1);
        java.lang.String str3 = micazMsg2.toString();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, 100L);
        byte[] byteArray6 = micazMsg2.dataGet();
        java.lang.Class<?> wildcardClass7 = micazMsg2.getClass();
        laccan.devices.MicazMsg micazMsg9 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = micazMsg9.get_Buffer();
        java.lang.Object obj11 = micazMsg9.clone();
        int int12 = micazMsg9.get_NodeID();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 0 };
        laccan.devices.MicazMsg micazMsg16 = new laccan.devices.MicazMsg(byteArray15);
        laccan.devices.MicazMsg micazMsg18 = new laccan.devices.MicazMsg(byteArray15, 2);
        micazMsg9.dataSet(byteArray15);
        laccan.devices.MicazMsg micazMsg20 = new laccan.devices.MicazMsg(byteArray15);
        laccan.devices.MicazMsg micazMsg21 = new laccan.devices.MicazMsg(byteArray15);
        laccan.devices.MicazMsg micazMsg22 = new laccan.devices.MicazMsg(byteArray15);
        micazMsg2.dataSet(byteArray15);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("reduction;-19.699999999999996;0;100.0;0");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
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
        net.tinyos.message.Message message16 = micazMsg14.clone(160);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg14);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        java.util.List<java.lang.Double> doubleList1 = regression0.result();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;4.0;0");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        micazMsg1.set_Voltage((int) '#');
        java.lang.String str4 = micazMsg1.toString();
        int int5 = micazMsg1.baseOffset();
        micazMsg1.set_NodeID(266);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        int int9 = micazMsg1.get_NodeID();
        int int10 = micazMsg1.amType();
        byte[] byteArray11 = micazMsg1.dataGet();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        net.tinyos.message.SerialPacket serialPacket6 = micazMsg1.getSerialPacket();
        byte[] byteArray7 = micazMsg1.dataGet();
        java.lang.String str8 = micazMsg1.toString();
        int int9 = micazMsg1.amType();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        short[] shortArray5 = micazMsg1.get_Buffer();
        byte[] byteArray6 = micazMsg1.dataGet();
        java.lang.Object obj7 = micazMsg1.clone();
        java.lang.Object obj8 = micazMsg1.clone();
        byte[] byteArray9 = micazMsg1.dataGet();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
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
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg11);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n;-19.699999999999996;0");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        laccan.memory.Container container3 = memory0.getMemory();
        int int4 = memory0.length();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
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
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        java.lang.String str4 = micazMsg1.toString();
        net.tinyos.message.Message message6 = micazMsg1.clone(3);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(100, (int) (short) 1);
        java.lang.String str3 = micazMsg2.toString();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2, 100L);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg2);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg2);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1, (long) (short) 10);
        laccan.devices.Sample sample6 = new laccan.devices.Sample(micazMsg1);
        int int7 = micazMsg1.amType();
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
        micazMsg1.dataSet(byteArray50, (int) '#', (int) (byte) 10, (int) ' ');
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(24, 0);
        net.tinyos.message.Message message4 = micazMsg2.clone((int) (byte) 10);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg2);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.memory.Container container2 = memory0.getMemory();
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray10 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg4.set_Buffer(shortArray10);
        laccan.devices.Sample sample12 = new laccan.devices.Sample(micazMsg4);
        java.lang.String[] strArray13 = sample12.toCSV();
        sample12.setNode("hi!");
        java.lang.String str16 = sample12.getNode();
        memory0.add(sample12);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg(24, (int) (byte) 10);
        int int3 = micazMsg2.get_NodeID();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg2);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        laccan.devices.Sample sample3 = new laccan.devices.Sample(micazMsg1);
        int int4 = micazMsg1.dataLength();
        micazMsg1.init((int) '4');
        micazMsg1.init((int) '4');
        micazMsg1.set_Voltage(20);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        double double1 = regression0.mse();
        double double2 = regression0.mse();
        laccan.cloud.prediction.Regression regression3 = new laccan.cloud.prediction.Regression();
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
        java.util.List<java.lang.Double> doubleList22 = regression3.result(doubleList19);
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
        laccan.memory.data.reduction.KeepingAll keepingAll34 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample35 = new laccan.devices.Sample();
        keepingAll34.add(sample35);
        int int37 = keepingAll34.length();
        java.util.List<laccan.devices.Sample> sampleList38 = keepingAll34.get();
        java.util.List<laccan.devices.Sample> sampleList39 = keepingAll34.get();
        java.util.List<java.lang.Double> doubleList40 = laccan.cloud.prediction.Regression.makeTests(sampleList39);
        regression3.init((java.util.List<laccan.devices.Sample>) sampleList31, doubleList40);
        java.util.List<java.lang.Double> doubleList42 = regression0.result(doubleList40);
        double double43 = regression0.mse();
        regression0.train();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray7 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg1.set_Buffer(shortArray7);
        laccan.devices.Sample sample9 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.Sample sample10 = new laccan.devices.Sample(micazMsg1);
        int int11 = micazMsg1.dataLength();
        byte[] byteArray12 = micazMsg1.dataGet();
        net.tinyos.message.Message message14 = micazMsg1.clone(24);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) (short) 100, 0);
        micazMsg2.amTypeSet(2);
        net.tinyos.message.Message message6 = micazMsg2.clone((int) '4');
        laccan.devices.Sample sample7 = new laccan.devices.Sample(micazMsg2);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg2);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("init;-19.699999999999996;0");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray2 = micazMsg1.get_Buffer();
        java.lang.Object obj3 = micazMsg1.clone();
        int int4 = micazMsg1.get_NodeID();
        java.lang.String str5 = micazMsg1.toString();
        byte[] byteArray6 = micazMsg1.dataGet();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;97.0;100");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
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
        micazMsg1.init((int) ' ');
        short[] shortArray20 = micazMsg1.get_Buffer();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
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
        int int22 = micazMsg18.get_NodeID();
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg18);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;-19.648499999999995;0;52.0;0");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        laccan.devices.MicazMsg micazMsg1 = new laccan.devices.MicazMsg(100);
        laccan.devices.MicazMsg micazMsg4 = new laccan.devices.MicazMsg((net.tinyos.message.Message) micazMsg1, 4, (int) (byte) -1);
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg1);
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x4]\n  [Buffer=0xffff 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
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
        laccan.devices.helper.utils.Assistant.toFog((net.tinyos.message.Message) micazMsg8);
    }
}

