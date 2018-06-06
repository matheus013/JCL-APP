package laccan.main;

import implementations.dm_kernel.user.JCL_FacadeImpl;
import interfaces.kernel.JCL_facade;
import interfaces.kernel.JCL_result;
import laccan.lang.Lang;
import laccan.memory.Memory;

public class TestApp {
    public static void main(String[] args) throws InterruptedException {
//        Assistant.init();
//        test(Lang.MEMORY_KEY);
//        test(Lang.INIT_KEY);
//        test(Lang.NODES_IDS_KEY);
        while (true) {
            test_size(Lang.MEMORY_KEY);
            test_size(Lang.FULL_MEMORY_KEY);
            Thread.sleep(1000);
        }
    }

    public static void test(String key) {
        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        JCL_result result;
        System.out.println("test key: " + key);
        System.out.println("exist: " + jcl.containsGlobalVar(key));
        result = jcl.getValue(key);
        System.out.println("is null: " + (result.getCorrectResult() == null));
        System.out.println("value: " + result.getCorrectResult());
        System.out.println();
    }

    public static void test_size(String key) {
        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        JCL_result result = jcl.getValue(key);
        Memory memory = (Memory) result.getCorrectResult();
        System.out.println("to " + key + ": " + String.valueOf(memory.length()));

    }
}
