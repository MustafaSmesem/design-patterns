package patterns.creational.factoryMethod.logisticEx;

public class Truck implements Transport {
    @Override
    public void deliver(String goods) {
        System.out.println("Truck Delivering " + goods + " over the roads");
    }
}
