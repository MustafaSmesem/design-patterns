package patterns.creational.factoryMethod.logisticEx;

public class RoadLogisticFactory implements LogisticFactory {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
