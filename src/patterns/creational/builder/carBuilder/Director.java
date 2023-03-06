package patterns.creational.builder.carBuilder;

public class Director {

    public void buildMercedes(CarBuilder builder) {
        builder
                .brand("Mercedes")
                .screenType("flat")
                .height(115);
    }

    public void buildVolkswagenPolo(CarBuilder builder) {
        builder
                .brand("Volkswagen")
                .model("Polo")
                .screenType("curve")
                .doorsNumber(5)
                .height(130)
                .width(273);
    }

}
