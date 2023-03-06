package patterns.creational.builder.carBuilder;

public class CarBuilder {

    private int id;
    private String model;
    private String brand;
    private String color;
    private String screenType;
    private int doorsNumber;
    private double height;
    private double width;

    public CarBuilder id(int id) {
        this.id = id;
        return this;
    }
    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }
    public CarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }
    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }
    public CarBuilder screenType(String screenType) {
        this.screenType = screenType;
        return this;
    }
    public CarBuilder doorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
        return this;
    }
    public CarBuilder height(double height) {
        this.height = height;
        return this;
    }
    public CarBuilder width(double width) {
        this.width = width;
        return this;
    }

    public Car build() {
        return new Car(id, model, brand, color, screenType, doorsNumber, height, width);
    }
}
