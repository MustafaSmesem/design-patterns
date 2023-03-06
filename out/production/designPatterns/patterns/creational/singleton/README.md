# Singleton Pattern

Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.


```java
public class Singleton {
    private static Singleton instance;
    private String someData;
    
    private Singleton(String someData) {
        this.someData = someData;
    }
    
    public static Singleton getInstance(String someData) {
        if (instance == null) {
            instance = new Singleton(someData);
        }
        return instance;
    }
}
```

```java
public class Singleton {
    private static volatile Singleton instance;
    private String someData;
    private Singleton(String someData) {
        this.someData = someData;
    }

    public static Singleton getInstance(String someData) {
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton(someData);
                }
            }
        }
        return result;
    }
}
```
