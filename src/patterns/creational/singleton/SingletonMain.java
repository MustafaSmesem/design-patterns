package patterns.creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        var s = Singleton.getInstance();
        s.setSomeData("instance s Data");
        System.out.println(s.getSomeData());

        var y = Singleton.getInstance();
        System.out.println(y.getSomeData());
    }
}
