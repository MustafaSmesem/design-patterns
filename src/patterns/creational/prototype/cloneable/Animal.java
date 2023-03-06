package patterns.creational.prototype.cloneable;

abstract public class Animal implements Cloneable {
    protected String type;
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {
        this.type = null;
    }

    public abstract String speak();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
