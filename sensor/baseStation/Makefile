COMPONENT=SenseBaseAppC
BOOTLOADER=tosboot

CFLAGS += -I$(TOSDIR)/lib/net \
          -I$(TOSDIR)/lib/net/le \
          -I$(TOSDIR)/lib/net/ctp

CFLAGS += -DDELUGE_BASESTATION
PFLAGS += -DTOSH_DATA_LENGTH=80
          
include $(MAKERULES)
