package laccan.memory.data.reduction;

import laccan.devices.Sample;
import laccan.memory.Container;

import java.util.ArrayList;

public class KeepingAll extends Container {
    public KeepingAll() {
        this.content = new ArrayList<Sample>();
    }


    @Override
    public void add(Sample msg) {

    }
}
