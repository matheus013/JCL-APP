package laccan.memory;

import laccan.devices.MicazMsg;
import laccan.memory.data.reduction.AllaReduction;
import laccan.memory.data.reduction.KeepingAll;
import laccan.memory.data.reduction.RandomReduction;

import java.util.ArrayList;

public class Memory {
    private KeepingAll keepingAll;
    private Container dataContainer;
    private int capacity;

    public Memory() {
    }

    public KeepingAll fullGet() {
        return keepingAll;
    }

    public void buildRandomReduction() {
        dataContainer = new RandomReduction(capacity);
        keepingAll = new KeepingAll();
    }

    public void buildRandomReduction(int capacity) {
        dataContainer = new RandomReduction(capacity);
        keepingAll = new KeepingAll();
        this.capacity = capacity;
    }

    public void buildAllaReduction() {
        dataContainer = new AllaReduction(capacity);
        keepingAll = new KeepingAll();
    }

    public void buildAllaReduction(int capacity) {
        dataContainer = new AllaReduction(capacity);
        keepingAll = new KeepingAll();
        this.capacity = capacity;
    }

    public Container getMemory() {
        return dataContainer;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void add(MicazMsg msg) {
        fullGet().add(msg);
        getMemory().add(msg);
    }

}
