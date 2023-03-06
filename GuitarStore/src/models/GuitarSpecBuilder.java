package models;

import enums.Builder;
import enums.Type;
import enums.Wood;

public class GuitarSpecBuilder {

    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numString;

    public GuitarSpecBuilder builder(Builder builder) {
        this.builder = builder;
        return this;
    }

    public GuitarSpecBuilder model(String model) {
        this.model = model;
        return this;
    }

    public GuitarSpecBuilder type(Type type) {
        this.type = type;
        return this;
    }

    public GuitarSpecBuilder backWood(Wood backWood) {
        this.backWood = backWood;
        return this;
    }

    public GuitarSpecBuilder topWood(Wood topWood) {
        this.topWood = topWood;
        return this;
    }

    public GuitarSpecBuilder numString(int numString) {
        this.numString = numString;
        return this;
    }

    public GuitarSpec build() {
        return new GuitarSpec(builder, model, type, backWood, topWood, numString);
    }

}
