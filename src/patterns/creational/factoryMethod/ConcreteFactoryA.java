package patterns.creational.factoryMethod;

public class ConcreteFactoryA implements Factory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
