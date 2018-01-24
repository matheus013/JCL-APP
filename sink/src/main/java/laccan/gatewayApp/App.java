/**
 * @author <Geymerson Ramos>
 * @email: <geymerson@laccan.ufal.com>
 * Universidade Federal de Alagoas - UFAL
 * Laboratório de Computação Científica e Análise Numérica - LACCAN
 * <p>
 * last update at August 19, 2017
 **/

package laccan.gatewayApp;

import implementations.dm_kernel.user.JCL_FacadeImpl;
import interfaces.kernel.JCL_facade;
import laccan.devices.Micaz;

public class App {
    public static void main(String[] args) {
        Server.init();
        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        Micaz micaz = new Micaz("serial@/dev/ttyUSB1:57600");
        jcl.executeAll("reduction");
    }
}
