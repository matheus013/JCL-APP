package laccan;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        int int1 = memory0.length();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray3 = micazMsg2.get_Buffer();
        java.lang.Object obj4 = micazMsg2.clone();
        laccan.devices.Sample sample5 = new laccan.devices.Sample(micazMsg2);
        long long6 = sample5.getDate();
        memory0.add(sample5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        regression0.train();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.data.reduction.KeepingAll keepingAll1 = new laccan.memory.data.reduction.KeepingAll();
        laccan.devices.Sample sample2 = new laccan.devices.Sample();
        keepingAll1.add(sample2);
        memory0.add(sample2);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("init");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        laccan.persistence.StorageCSV storageCSV0 = new laccan.persistence.StorageCSV();
        java.util.List<laccan.devices.Sample> sampleList1 = storageCSV0.read();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        int int2 = memory0.length();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        regression0.train();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
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
        java.util.List<java.lang.Double> doubleList30 = regression0.result();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [Buffer=");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("full_memory");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
        double double14 = regression0.mse();
        java.util.List<java.lang.Double> doubleList15 = regression0.result();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
        double double15 = regression0.mse();
        double double16 = regression0.mse();
        regression0.train();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;-19.699999999999996;0");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
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
        double double15 = regression0.mse();
        java.util.List<java.lang.Double> doubleList16 = regression0.result();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
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
        double double15 = regression0.mse();
        double double16 = regression0.mse();
        java.util.List<java.lang.Double> doubleList17 = regression0.result();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("memory");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
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
        regression0.train();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
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
        java.util.List<java.lang.Double> doubleList29 = regression0.result();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.devices.MicazMsg micazMsg2 = new laccan.devices.MicazMsg((int) '4');
        short[] shortArray8 = new short[] { (short) 0, (byte) 1, (byte) 1, (short) 100, (short) 1 };
        micazMsg2.set_Buffer(shortArray8);
        micazMsg2.set_Voltage(2);
        java.lang.String str12 = micazMsg2.toString();
        short[] shortArray13 = micazMsg2.get_Buffer();
        laccan.devices.Sample sample14 = new laccan.devices.Sample(micazMsg2);
        laccan.devices.Sample sample15 = new laccan.devices.Sample();
        laccan.devices.Type type16 = laccan.devices.Type.FULL;
        sample15.setType(type16);
        sample14.setType(type16);
        long long19 = sample14.getDate();
        java.lang.String str20 = sample14.getNode();
        memory0.add(sample14);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        java.util.List<java.lang.Double> doubleList1 = regression0.result();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("hi!");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
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
        java.util.List<java.lang.Double> doubleList28 = regression0.result();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("reduction");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
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
        double double15 = regression0.mse();
        regression0.train();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
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
        double double14 = regression0.mse();
        double double15 = regression0.mse();
        java.util.List<java.lang.Double> doubleList16 = regression0.result();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
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
        laccan.persistence.StorageCSV storageCSV13 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV15 = storageCSV13.local("");
        java.util.List<laccan.devices.Sample> sampleList16 = storageCSV15.read();
        java.util.List<java.lang.Double> doubleList17 = laccan.cloud.prediction.Regression.makeTests(sampleList16);
        java.util.List<java.lang.Double> doubleList18 = regression0.result(doubleList17);
        regression0.train();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
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
        java.util.List<java.lang.Double> doubleList18 = regression0.result();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x18]\n  [Voltage=0x2]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
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
        double double14 = regression0.mse();
        regression0.train();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
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
        laccan.persistence.StorageCSV storageCSV13 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV15 = storageCSV13.local("");
        java.util.List<laccan.devices.Sample> sampleList16 = storageCSV15.read();
        java.util.List<java.lang.Double> doubleList17 = laccan.cloud.prediction.Regression.makeTests(sampleList16);
        java.util.List<java.lang.Double> doubleList18 = regression0.result(doubleList17);
        java.util.List<java.lang.Double> doubleList19 = regression0.result();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x64]\n  [Voltage=0xffff]\n  [Buffer=0xff64 ");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("lastReading;100.0;10");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("nodes");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
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
        double double18 = regression0.mse();
        regression0.train();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [Voltage=0x0]\n  [Buffer=0x200 0x0 0x100 0x100 0x6400 0x100 0x0 0x0 0x0 0x0 ]\n");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;100.0;0");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x30]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;0.0;0");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
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
        laccan.persistence.StorageCSV storageCSV28 = new laccan.persistence.StorageCSV();
        laccan.persistence.StorageCSV storageCSV30 = storageCSV28.local("");
        java.util.List<laccan.devices.Sample> sampleList31 = storageCSV30.read();
        java.util.List<java.lang.Double> doubleList32 = laccan.cloud.prediction.Regression.makeTests(sampleList31);
        java.util.List<java.lang.Double> doubleList33 = regression0.result(doubleList32);
        regression0.train();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;-19.699999999999996;16");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;-19.648499999999995;10");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("result");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x100]\n  [Voltage=0x0]\n  [Buffer=0x0 0x1 0x1 0x64 0x1 0x0 0x0 0x0 0x0 0x0 ]\n");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;0.0;-1");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
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
        regression0.train();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x0]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 ");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("init;35.0;0");
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("full_memory;0.0;0");
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
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
        regression0.train();
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("lastReading");
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [Buffer=;0.0;0");
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;-19.648499999999995;3");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
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
        java.util.List<java.lang.Double> doubleList14 = regression0.result();
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0xffff]\n  [Voltage=0x0]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("Message <MicazMsg> \n  [NodeID=0x200]\n  [Voltage=0x64]\n  [Buffer=0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 0x0 ]\n");
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        laccan.memory.Memory memory0 = new laccan.memory.Memory();
        laccan.memory.Container container1 = memory0.getMemory();
        laccan.devices.Sample sample5 = new laccan.devices.Sample("Message <MicazMsg> \n  [Voltage=0x0]\n  [Buffer=0x200 0x0 0x100 0x100 0x6400 0x100 0x0 0x0 0x0 0x0 ]\n", (double) 12, (long) (short) -156);
        memory0.add(sample5);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        laccan.cloud.prediction.Regression regression0 = new laccan.cloud.prediction.Regression();
        laccan.memory.data.reduction.KeepingAll keepingAll1 = new laccan.memory.data.reduction.KeepingAll();
        java.util.List<laccan.devices.Sample> sampleList2 = keepingAll1.get();
        java.util.List<java.lang.Double> doubleList3 = laccan.cloud.prediction.Regression.makeTests(sampleList2);
        java.util.List<java.lang.Double> doubleList4 = laccan.cloud.prediction.Regression.makeTests(sampleList2);
        java.util.List<java.lang.Double> doubleList5 = regression0.result(doubleList4);
        regression0.train();
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("null;0.0;172");
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
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
        double double30 = regression0.mse();
        java.util.List<java.lang.Double> doubleList31 = regression0.result();
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        laccan.devices.Micaz micaz1 = new laccan.devices.Micaz("hi!;0.0;-1");
    }
}

