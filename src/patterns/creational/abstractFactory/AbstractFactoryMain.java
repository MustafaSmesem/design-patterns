package patterns.creational.abstractFactory;

import patterns.creational.abstractFactory.furniture.interfaces.FurnitureFactory;
import patterns.creational.abstractFactory.furniture.modern.ModernFurnitureFactory;
import patterns.creational.abstractFactory.furniture.victorian.VictorianFurnitureFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {

        FurnitureFactory factory = new ModernFurnitureFactory();
        createFurniture(factory);
        factory = new VictorianFurnitureFactory();
        createFurniture(factory);

    }

    private static void createFurniture(FurnitureFactory factory) {
        var modernChair = factory.createChair();
        modernChair.printInfo();

        var modernSofa = factory.createSofa();
        modernSofa.printInfo();

        var modernTable = factory.createTable();
        modernTable.printInfo();
    }
}
