package patterns.creational.prototype.cloneable;

public class Cat extends Animal {

    public Cat() {
        this.type = "cat";
    }

    @Override
    public String speak() {
        return "Miao";
    }
}
