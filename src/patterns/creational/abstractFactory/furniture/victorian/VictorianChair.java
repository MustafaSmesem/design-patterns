package patterns.creational.abstractFactory.furniture.victorian;

import patterns.creational.abstractFactory.furniture.interfaces.Chair;

public class VictorianChair implements Chair {
    @Override
    public void printInfo() {
        System.out.println("Victorian Chair has been created successfully :).");
    }
}
