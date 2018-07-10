/* SenseC.nc
 *
 * implementation of the sensor nodes.
 * We're collecting data from pressure
 * temperature, light, humidity and node voltage
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


//SenseC.nc
#include "Micaz.h"
#include <string.h>
#include <Timer.h>

module SenseC {
    uses { //Declaring used interfaces
        interface Boot;
        interface SplitControl as Control;
        interface StdControl as CollectionControl;
        interface Send;
        interface Leds;
        interface Timer<TMilli>;
        interface Read<uint16_t> as Temperature;
        interface Read<uint16_t> as Voltage;
    }
}

implementation {
    task void sendPacket();
    task void sort();
    task void reduction();

    bool busy = FALSE;
    uint8_t clockCounter = 1;
    MicazMsg micaz_msg;
    message_t send_buff;

    event void Boot.booted() {
      micaz_msg.NodeID = TOS_NODE_ID;
        call Control.start();
    }

    event void Control.startDone(error_t err) {
        if (err == SUCCESS) {
            call Timer.startPeriodic(TIMER_PERIOD_MILLI);
            call CollectionControl.start();
            call Leds.led0On();
        } else
            call Control.start();
    }

    event void Control.stopDone(error_t err) { /* NOT IMPLEMENTED */ }

    event void Timer.fired() {
        if(clockCounter % 60){
          call Temperature.read();
        }
        if(clockCounter >= PERIODICITY_MULTIPLIER - RATE) {
            clockCounter = 1;
            call Voltage.read();
            post sendPacket();
        }
        else {
            clockCounter++;
        }
    }

    event void Voltage.readDone(error_t err, uint16_t data) {
      if(err == SUCCESS) {
        micaz_msg.Voltage = data;
        post sort();
        post reduction();
      }
      else {
        call Voltage.read();
      }
    }

    event void Temperature.readDone(error_t err, uint16_t data) {
        micaz_msg.Buffer[clockCounter - 1] = data;
    }

    event void Send.sendDone(message_t* bufPtr, error_t error) {
        if (error == SUCCESS) {
            busy = FALSE;
            call Leds.led2Off();
        }
    }

    task void sendPacket() {
        MicazMsg* packet = (MicazMsg*)(call Send.getPayload(&send_buff, sizeof(MicazMsg)));
        if(packet == NULL) { return; }
        memcpy(packet, &micaz_msg, sizeof(micaz_msg));

        if(!busy) {
            if (call Send.send(&send_buff, sizeof(MicazMsg)) == SUCCESS) {
                busy = TRUE;
                call Leds.led2On();
            }
        }
    }

    task void sort() {
        int8_t i, j;
        int16_t currentValue;
        for(j = 1; j < PERIODICITY_MULTIPLIER; j++) {
            currentValue = micaz_msg.Buffer[j];
            i = j - 1;
            while(i >= 0 && micaz_msg.Buffer[i] > currentValue) {
                micaz_msg.Buffer[i + 1] = micaz_msg.Buffer[i];
                i--;
            }
            micaz_msg.Buffer[i + 1] = currentValue;
        }
    }

    task void reduction() {
        uint8_t start = (FULL - RATE)/2;
        uint8_t end = (FULL + RATE)/2;
        uint8_t i;
        for (i = start; i < end; i++) {
            micaz_msg.Buffer[FULL + i - start] = micaz_msg.Buffer[i];
        }
    }

}
