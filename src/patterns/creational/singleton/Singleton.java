package patterns.creational.singleton;

public class Singleton {
    private static volatile Singleton instance;
    private String someData;
    private Singleton() {}
    public void setSomeData(String someData) {
        this.someData = someData;
    }
    public String getSomeData() {
        return this.someData;
    }

    public static Singleton getInstance() {
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton();
                }
            }
        }
        return result;
    }
}





