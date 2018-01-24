/**
 * @author <Geymerson Ramos>
 * @email: <geymerson@laccan.ufal.com>
 * Universidade Federal de Alagoas - UFAL
 * Laboratório de Computação Científica e Análise Numérica - LACCAN
 * <p>
 * last update at August 19, 2017
 **/

package laccan.gatewayApp;

import laccan.devices.Micaz;

public class App {
    public static void main(String[] args) {
        Micaz micaz = new Micaz("serial@/dev/ttyUSB1:57600");
    }
}
