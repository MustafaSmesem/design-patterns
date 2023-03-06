package oop;

import oop.interfaces.ITaxCalculator;

public class Tax2020Calculator implements ITaxCalculator {
    @Override
    public float calculate() {
        return 2020f;
    }
}
