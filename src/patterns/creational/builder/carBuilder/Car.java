package patterns.creational.builder.carBuilder;

public class Car {
    private final int id;
    private final String model;
    private final String brand;
    private final String color;
    private final String screenType;
    private final int doorsNumber;
    private final double height;
    private final double width;

    Car(int id, String model, String brand, String color, String screenType, int doorsNumber, double height, double width) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.screenType = screenType;
        this.doorsNumber = doorsNumber;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Car[").append(id).append("]:\n");
        if (model != null) string.append("  Model= ").append(model).append('\n');
        if (brand != null) string.append("  Brand= ").append(brand).append('\n');
        if (color != null) string.append("  Color= ").append(color).append('\n');
        if (screenType != null) string.append("  Screen Type= ").append(screenType).append('\n');
        if (doorsNumber != 0) string.append("  Doors Number= ").append(doorsNumber).append('\n');
        if (height != 0) string.append("  height= ").append(height).append('\n');
        if (width != 0) string.append("  width= ").append(width).append('\n');
        string.append("------------------------------------");

        return string.toString();
    }
}
