package models;

import enums.Builder;
import enums.Type;
import enums.Wood;

import java.util.Objects;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    private int numString;

    public GuitarSpec() {
    }

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numString) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numString = numString;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }

    public int getNumString() {
        return numString;
    }

    public void setNumString(int numString) {
        this.numString = numString;
    }

    @Override
    public String toString() {
        return "GuitarSpec{" +
                "builder=" + builder +
                ", model='" + model + '\'' +
                ", type=" + type +
                ", String number=" + numString +
                ", backWood=" + backWood +
                ", topWood=" + topWood +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuitarSpec that = (GuitarSpec) o;

        return (that.getBuilder() == null || that.getBuilder() == builder) &&
                (that.getModel() == null || that.getModel().equals("") || that.getModel().equalsIgnoreCase(model.toLowerCase())) &&
                (that.getType() == null || that.getType() == type) &&
                (that.getBackWood() == null || that.getBackWood() == backWood) &&
                (that.getTopWood() == null || that.getTopWood() == topWood) &&
                (that.getNumString() <= 0 || that.getNumString() == numString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(builder, model, type, backWood, topWood, numString);
    }
}
