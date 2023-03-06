package oop;

import oop.interfaces.ITaxCalculator;

public class Tax2019Calculator implements ITaxCalculator {
    @Override
    public float calculate() {
        return 2019f;
    }
}
