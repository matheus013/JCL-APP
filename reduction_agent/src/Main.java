import implementations.dm_kernel.user.JCL_FacadeImpl;
import interfaces.kernel.JCL_facade;
import interfaces.kernel.JCL_result;
import laccan.devices.MicazMsg;
import laccan.memory.Memory;

public class Main {

    public static void main(String[] args) {
        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        JCL_result temp = jcl.getValueLocking("lastReading");
        JCL_result result = jcl.getValueLocking("buffer");
        MicazMsg micazTemp = (MicazMsg) temp.getCorrectResult();
        if (micazTemp != null) {
            Memory buffer = (Memory) result.getCorrectResult();
            buffer.add(micazTemp);

            jcl.setValueUnlocking("buffer", buffer);
        } else System.out.println("Failed to access memory.");
        jcl.deleteGlobalVar("lastReading");
    }
}
