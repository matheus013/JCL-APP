package laccan.main;

import implementations.dm_kernel.user.JCL_FacadeImpl;
import interfaces.kernel.JCL_facade;
import interfaces.kernel.JCL_result;

public class TestApp {
    public static void main(String[] args) {
        test("buffer");
        test("init");
        test("nodes");

    }

    public static void test(String key) {
        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        JCL_result result;
        System.out.println(key + " test");
        System.out.println("exist: " + jcl.containsGlobalVar(key));
        result = jcl.getValue(key);
        System.out.println("null: " + (result.getCorrectResult() == null));
        System.out.println("value: " + result.getCorrectResult());
        System.out.println();
    }
}
