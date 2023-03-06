package patterns.creational.factoryMethod.logisticEx;

public class SeaLogisticFactory implements LogisticFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
