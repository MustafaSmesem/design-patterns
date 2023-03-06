package patterns.creational.abstractFactory.furniture.modern;

import patterns.creational.abstractFactory.furniture.interfaces.Chair;
import patterns.creational.abstractFactory.furniture.interfaces.FurnitureFactory;
import patterns.creational.abstractFactory.furniture.interfaces.Sofa;
import patterns.creational.abstractFactory.furniture.interfaces.Table;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
