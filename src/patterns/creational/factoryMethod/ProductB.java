package patterns.creational.factoryMethod;

public class ProductB implements Product {
    private String description;

    public ProductB() {}

    public ProductB(String description) {
        this.description = description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void printProductDescription() {
        System.out.println("Product B description:");
        System.out.println(description);
    }
}
