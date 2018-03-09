package laccan.main;

import implementations.dm_kernel.user.JCL_FacadeImpl;
import interfaces.kernel.JCL_facade;
import interfaces.kernel.JCL_result;
import laccan.devices.helper.utils.Assistant;
import laccan.lang.Lang;

public class TestApp {
    public static void main(String[] args) {
        Assistant.init();
        test(Lang.MEMORY_KEY);
        test(Lang.INIT_KEY);
        test(Lang.NODES_IDS_KEY);

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
}
