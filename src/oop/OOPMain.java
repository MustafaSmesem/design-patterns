package oop;

import oop.enums.Tax;
import oop.interfaces.ITaxCalculator;

public class OOPMain {

    public static void main(String[] args) {

        var taxCalculator = getTaxCalculator(Tax.TAX_2020);
        System.out.println(taxCalculator.calculate());


        // Creational dp

    }

    private static ITaxCalculator getTaxCalculator(Tax tax) {
        return switch (tax) {
            case TAX_2019 -> new Tax2019Calculator();
            case TAX_2020, TAX_2021 -> new Tax2020Calculator();
        };
    }
}
