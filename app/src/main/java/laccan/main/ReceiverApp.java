/**
 * Inicia receptor
 *
 * @author Matheus In&aacute;cio
 */

package laccan.main;

import laccan.devices.Micaz;
import net.anotheria.moskito.integration.cdi.monitor.Monitor;
@Monitor
public class ReceiverApp extends Exception {
    @Monitor
    public static void main(String[] args) {
//        StatsProducer producer = new DefaultStatsLogger(producer, new Log4JOutput(Logger.getLogger("MoskitoDefault")));;
        Micaz micaz = new Micaz("serial@/dev/ttyUSB1:57600");
    }
}
