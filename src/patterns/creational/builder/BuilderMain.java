package patterns.creational.builder;

import patterns.creational.builder.carBuilder.CarBuilder;
import patterns.creational.builder.carBuilder.Director;

public class BuilderMain {
    public static void main(String[] args) {
        var carBuilder = new CarBuilder();
        var car = carBuilder
                .id(123)
                .model("sdiajfh")
                .brand("mustafa")
                .build();
        System.out.println(car.toString());


        var director = new Director();
        var builder = new CarBuilder();
        director.buildVolkswagenPolo(builder);
        var polo = builder.id(112312).color("Yellow").build();
        System.out.println(polo);
    }
}
