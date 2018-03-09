package laccan.devices;

public class Sample {
    protected String node;
    protected double temperature;
    protected long date;
    protected Type type;

    public Sample(MicazMsg micaz) {
        setNode(String.valueOf(micaz.get_nodeid()));
    }

    public Sample(MicazMsg micaz, long date) {
        setNode(String.valueOf(micaz.get_nodeid()));
        setDate(date);
    }

    public Sample() {
    }

    public Sample(String node, double temperature, long date) {
        setDate(date);
        setTemperature(temperature);
        setNode(node);
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String[] toCSV() {
        return toString().split(";");
    }

    @Override
    public String toString() {
        return node + ";" + String.valueOf(temperature) + ";" + String.valueOf(date);
    }
}
