package patterns.creational.prototype.pattern;

public class GpsSystem implements Cloneable {
    private int macId;
    private String manufacture;

    public GpsSystem(int macId, String manufacture) {
        this.macId = macId;
        this.manufacture = manufacture;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "GpsSystem{" +
                "macId=" + macId +
                ", manufacture='" + manufacture + '\'' +
                '}';
    }
}
