package patterns.creational.factoryMethod;

public class FactoryMain {
    public static void main(String[] args) {
        System.out.println("Factory Method");
        var factoryA = new ConcreteFactoryA();
        var productA = factoryA.createProduct();
        productA.setDescription("High Quality product");
        productA.printProductDescription();

        var factoryB = new ConcreteFactoryB();
        var productB = factoryB.createProduct();
        productB.setDescription("low Quality product");
        productB.printProductDescription();
    }
}
