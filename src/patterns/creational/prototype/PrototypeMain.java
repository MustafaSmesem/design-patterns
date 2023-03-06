package patterns.creational.prototype;

import patterns.creational.prototype.pattern.VehicleCache;

public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        var cache = new VehicleCache();
        var bugatti = cache.get("Bugatti Chiron");
        System.out.println(bugatti);
        var mercedesBus = cache.get("Mercedes Setra");
        System.out.println(mercedesBus);
    }
}
