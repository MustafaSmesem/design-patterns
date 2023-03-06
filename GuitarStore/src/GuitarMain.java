import enums.Builder;
import enums.Type;
import enums.Wood;
import models.GuitarSpec;
import models.GuitarSpecBuilder;

public class GuitarMain {


    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        var guitarBuilder = new GuitarSpecBuilder();
        var guitarSpec = guitarBuilder
                .builder(Builder.FENDER)
                .backWood(Wood.BRAZILIAN_ROSEWOOD)
                .type(Type.ACOUSTIC)
                .build();
        var results = inventory.search(guitarSpec);
        results.forEach(System.out::println);
    }

    private static void initializeInventory(Inventory inventory) {
        System.out.println("Initializing Inventory..");
        inventory.addGuitar("123456", 350.99, new GuitarSpec(Builder.FENDER, "model-1", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, 6));
        inventory.addGuitar("432154", 220.99, new GuitarSpec(Builder.RYAN, "model-1", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER, 6));
        inventory.addGuitar("987564", 330.85, new GuitarSpec(Builder.FENDER, "model-0", Type.ELECTRIC, Wood.BRAZILIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD, 12));

        System.out.printf("Inventory Initialized with [%s] guitars%n", inventory.getGuitarsCount());
    }
}
