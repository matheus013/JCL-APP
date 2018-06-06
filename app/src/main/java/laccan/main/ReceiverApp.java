/**
 * Inicia receptor
 *
 * @author Matheus In&aacute;cio
 */

package laccan.main;

import laccan.devices.Micaz;

public class ReceiverApp extends Exception {
    public static void main(String[] args) {
        Micaz micaz = new Micaz("serial@/dev/ttyUSB1:57600");
    }
}
