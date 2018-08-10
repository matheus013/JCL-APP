/* Micaz.h
 *
 * This header defines the packets
 * in which the nodes will send
 * data through the wirless network,
 * any app constants should be declared
 * here as well.
 *
 * @author: Geymerson Ramos
 * @email: geymerson@laccan.ufal.br
 * Last-Updated:
 *           By: Geymerson Ramos
 *     Update date: August 9, 2018
 */

/* Change Log:
 *
 */

#ifndef MICAZ_H
#define MICAZ_H

//PERIODICITY_MULTIPLIER = 10 previously
enum {
    TIMER_PERIOD_MILLI = 1024,
    PERIODICITY_MULTIPLIER = 8,
	  FULL = 8,
    AM_MICAZMSG = 0xac,
    RATE = 2
};

typedef nx_struct micazMsg {
  nx_uint16_t NodeID;
  nx_uint16_t Voltage;
  /* nx_int16_t Buffer[15]; */
  nx_int16_t Buffer[10];
} MicazMsg;

#endif
