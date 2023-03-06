package patterns.creational.factoryMethod;

public class ProductA implements Product {
    private String description;

    public ProductA() {}
    public ProductA(String description) {
        this.description = description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void printProductDescription() {
        System.out.println("Product A description:");
        System.out.println(description);
    }
}
