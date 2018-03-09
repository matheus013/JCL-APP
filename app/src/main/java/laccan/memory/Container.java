package laccan.memory;

import laccan.devices.Sample;

import java.util.List;

public abstract class Container {
    protected List<Sample> content;

    public abstract void add(Sample msg);

    public int length() {
        return content.size();
    }

    public List<Sample> get() {
        return content;
    }
}
