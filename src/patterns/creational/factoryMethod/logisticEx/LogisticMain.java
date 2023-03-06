package patterns.creational.factoryMethod.logisticEx;

public class LogisticMain {
    public static void main(String[] args) {
        var rLogistic = new RoadLogisticFactory();
        var rTransport = rLogistic.createTransport();
        rTransport.deliver("potatoes");
        var sLogistic = new SeaLogisticFactory();
        var vehicle = sLogistic.createTransport();
        vehicle.deliver("potatoes");
    }
}
