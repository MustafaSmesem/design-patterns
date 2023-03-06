import models.Guitar;
import models.GuitarSpec;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new ArrayList<>();
    }

    public Inventory(List<Guitar> guitars) {
        this.guitars = guitars;
    }

    public int getGuitarsCount() {
        return guitars.size();
    }
    public void addGuitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        return guitars.stream().filter(guitar -> guitar.getSerialNumber().equals(serialNumber)).findFirst().orElse(null);
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
        return guitars.stream().filter(guitar -> guitar.getGuitarSpec().equals(searchSpec)).collect(Collectors.toList());
    }
}
