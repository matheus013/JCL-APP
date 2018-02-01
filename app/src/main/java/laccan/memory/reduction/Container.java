package laccan.memory.reduction;

import laccan.devices.MicazMsg;

import java.util.ArrayList;

public abstract class Container {
    protected ArrayList<MicazMsg> content;

    public abstract void add(MicazMsg msg);

    public int length() {
        return content.size();
    }

    public ArrayList<MicazMsg> get() {
        return (ArrayList<MicazMsg>) content.clone();
    }
}
