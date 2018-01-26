/**
 * @author <Matheus Inácio>
 * @email: <matheus.inacio@laccan.cloud.com>
 * Universidade Federal de Alagoas - UFAL
 * Laboratório de Computação Científica e Análise Numérica - LACCAN
 * <p>
 * last update at January 15, 2017
 **/

package laccan.main;

import laccan.devices.Micaz;
import laccan.utils.Assistant;

public class ReceiverApp {
    public static void main(String[] args) {
        Assistant.init();
        // implementar metodo para detecção de crossbow
        Micaz micaz = new Micaz("serial@/dev/ttyUSB1:57600");
    }
}
