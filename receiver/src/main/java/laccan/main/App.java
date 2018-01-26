/**
 * @author <Matheus Inácio>
 * @email: <matheus.inacio@laccan.ufal.com>
 * Universidade Federal de Alagoas - UFAL
 * Laboratório de Computação Científica e Análise Numérica - LACCAN
 * <p>
 * last update at January 15, 2017
 **/

package laccan.main;

import laccan.devices.Micaz;
import laccan.receiver.Server;

public class App {
    public static void main(String[] args) {
        Server.init();
        // implementar metodo para detecção de crossbow
        Micaz micaz = new Micaz("serial@/dev/ttyUSB1:57600");
    }
}
