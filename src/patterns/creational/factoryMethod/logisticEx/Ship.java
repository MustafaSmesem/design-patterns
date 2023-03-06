package patterns.creational.factoryMethod.logisticEx;

public class Ship implements Transport {
    @Override
    public void deliver(String goods) {
        System.out.println("Ship Delivering " + goods + " over the sea");
    }
}
