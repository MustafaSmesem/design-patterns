package patterns.creational.abstractFactory.furniture.modern;

import patterns.creational.abstractFactory.furniture.interfaces.Chair;

public class ModernChair implements Chair {
    @Override
    public void printInfo() {
        System.out.println("Modern Chair has been created successfully :).");
    }
}
