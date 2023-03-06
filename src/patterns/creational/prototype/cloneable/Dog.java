package patterns.creational.prototype.cloneable;

public class Dog extends Animal {

    public Dog() {
        this.type = "dog";
    }

    @Override
    public String speak() {
        return this.name + ": woof";
    }
}
