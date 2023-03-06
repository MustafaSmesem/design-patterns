package patterns.creational.prototype.pattern;

import java.util.HashMap;
import java.util.Map;

public class VehicleCache {

    private final Map<String, Vehicle> cache = new HashMap<>();

    public VehicleCache() throws CloneNotSupportedException {
        var bugatti = new Car();
        bugatti.brand = "Bugatti";
        bugatti.model = "Chiron";
        bugatti.color = "blue";
        bugatti.topSpeed = 261;
        bugatti.gpsSystem = new GpsSystem(623451, "New york - 3d/12");

        cache.put("Bugatti Chiron", bugatti);

        var mercedesBus = new Bus();
        mercedesBus.brand = "Mercedes";
        mercedesBus.model = "Setra";
        mercedesBus.color = "White";
        mercedesBus.doorsNumber = 8;

        cache.put("Mercedes Setra", mercedesBus);
    }

    public Vehicle get(String key) throws CloneNotSupportedException {
        return cache.get(key).clone();
    }
}
