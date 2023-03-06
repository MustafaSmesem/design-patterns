package patterns.creational.abstractFactory.furniture.modern;

import patterns.creational.abstractFactory.furniture.interfaces.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void printInfo() {
        System.out.println("Modern Sofa has been created successfully :).");
    }
}
