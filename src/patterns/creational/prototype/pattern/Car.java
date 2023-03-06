package patterns.creational.prototype.pattern;

public class Car extends Vehicle {
    protected int topSpeed;
    protected GpsSystem gpsSystem;

    public Car(Car car) throws CloneNotSupportedException {
        super(car);
        this.topSpeed = car.topSpeed;
        this.gpsSystem = (GpsSystem) car.gpsSystem.clone();
    }

    public Car() {}

    @Override
    public Vehicle clone()  throws CloneNotSupportedException {
        return new Car(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "topSpeed=" + topSpeed +
                ", gpsSystem=" + gpsSystem +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
