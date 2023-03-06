# Factory Method Pattern

solids: S, O

The factory method pattern is a creational design pattern that provides an interface for creating objects in a super class, but allows subclasses to alter the type of objects that will be created.

In the factory method pattern, a factory class creates objects, but the actual object that is created is determined by subclasses. This allows the factory class to create objects of different types without knowing exactly which type of object it is creating.

The factory method pattern is useful when you want to create objects of a certain type, but the type of object that is created may vary depending on the context or configuration. It allows you to encapsulate object creation logic in a separate class, making it easier to modify and maintain the code.
### - why I need factory? what the benefits?
1. if creating the object is needed some logics, and it's done dynamically.
2. have some related classes (polymorphism) and need to create it dynamically at the run time.
3. if you don't know form the begging what the classes you need, and you need to keep you code open to extension.

### the idea:
replace direct object construction using ```new``` keyword with call to the special factory method.

When we don't know beforehand the exact types and dependencies of the objects you code should work with.


![factory method pattern diagram](../../../../resources/imgs/factory%20method.png)
