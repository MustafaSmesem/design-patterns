package patterns.creational.abstractFactory.furniture.interfaces;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    Table createTable();
}
