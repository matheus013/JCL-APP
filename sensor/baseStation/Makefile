COMPONENT=SenseBaseAppC
BOOTLOADER=tosboot

CFLAGS += -I$(TOSDIR)/lib/net \
          -I$(TOSDIR)/lib/net/le \
          -I$(TOSDIR)/lib/net/ctp

CFLAGS += -DDELUGE_BASESTATION
#CFLAGS += -DTOSH_DATA_LENGTH=50
PFLAGS += -DTOSH_DATA_LENGTH=50
          
include $(MAKERULES)
