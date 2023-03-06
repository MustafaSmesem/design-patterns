package patterns.creational.abstractFactory.furniture.modern;

import patterns.creational.abstractFactory.furniture.interfaces.Table;

public class ModernTable implements Table {
    @Override
    public void printInfo() {
        System.out.println("Modern Table has been created successfully :).");
    }
}
