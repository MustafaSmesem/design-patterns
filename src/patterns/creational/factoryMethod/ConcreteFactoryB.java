package patterns.creational.factoryMethod;

public class ConcreteFactoryB implements Factory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
