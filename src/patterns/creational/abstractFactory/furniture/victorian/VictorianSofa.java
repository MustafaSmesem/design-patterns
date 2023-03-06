package patterns.creational.abstractFactory.furniture.victorian;

import patterns.creational.abstractFactory.furniture.interfaces.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void printInfo() {
        System.out.println("Victorian Sofa has been created successfully :).");
    }
}
