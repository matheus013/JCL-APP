/* SenseAppC.nc
 *
 * Components should be wired here
 *
 * @author: Geymerson Ramos
 * @email: geymerson@laccan.ufal.br
 * Last-Updated:
 *           By: Geymerson Ramos
 *     Update #: 2017
 */

/* Change Log:
 *
 */

#include "Micaz.h"
#include <Timer.h>

configuration SenseAppC {

}

implementation {
    components MainC, LedsC, SenseC as App;
    components ActiveMessageC as AM;
    components new TimerMilliC() as Timer;
    components CollectionC;
    components new CollectionSenderC(AM_MICAZMSG) as Sender;
    components new SensirionSht11C();
    components new DemoSensorC() as Voltage;
    components DelugeC;

    DelugeC.Leds -> LedsC;
    App.Control -> AM;
    App.Leds -> LedsC;
    App.Boot -> MainC;
    App.CollectionControl -> CollectionC;
    App.Send -> Sender;
    App.Timer -> Timer;
    App.Voltage -> Voltage;
    App.Temperature -> SensirionSht11C.Temperature;
}
