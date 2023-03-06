package patterns.creational.abstractFactory.furniture.victorian;

import patterns.creational.abstractFactory.furniture.interfaces.Chair;
import patterns.creational.abstractFactory.furniture.interfaces.FurnitureFactory;
import patterns.creational.abstractFactory.furniture.interfaces.Sofa;
import patterns.creational.abstractFactory.furniture.interfaces.Table;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
