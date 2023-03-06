package patterns.creational.prototype.pattern;

public class Bus extends Vehicle {
    protected int doorsNumber;

    public Bus(Bus bus) {
        super(bus);
        this.doorsNumber = bus.doorsNumber;
    }

    public Bus() {}

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "doorsNumber=" + doorsNumber +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
