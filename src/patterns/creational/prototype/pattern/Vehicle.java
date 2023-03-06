package patterns.creational.prototype.pattern;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String color;

    public Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
    }

    public Vehicle() {

    }

    public abstract Vehicle clone() throws CloneNotSupportedException;
}
