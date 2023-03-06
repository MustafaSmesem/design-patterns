package patterns.creational.abstractFactory.furniture.victorian;

import patterns.creational.abstractFactory.furniture.interfaces.Table;

public class VictorianTable implements Table {
    @Override
    public void printInfo() {
        System.out.println("Victorian Table has been created successfully :).");
    }
}
