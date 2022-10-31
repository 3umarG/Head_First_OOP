package chapter1.rick_guitar;

import chapter1.rick_guitar.enums.Builder;
import chapter1.rick_guitar.enums.Type;
import chapter1.rick_guitar.enums.Wood;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private final List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber,
                          double price,
                          Builder builder,
                          String model,
                          Type type,
                          Wood backWood,
                          Wood topWood) {
        GuitarSpecial guitarSpecial = new GuitarSpecial(builder, model, type, backWood, topWood);
        Guitar guitar = new Guitar(serialNumber, price, guitarSpecial);
        guitars.add(guitar);
    }

    // Get the Guitar Object by Serial Number of Guitar
    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }


    public List<Guitar> search(GuitarSpecial guitarSpecial) {
        List<Guitar> matchingGuitars = new LinkedList<>();
        for (Guitar guitar : guitars) {

            // TODO : Delegation is giving another object the responsibility of handling a particular task.
            // TODO : I give the responsibility of handling the Matching method to GuitarSpecial because it specializes on doing it.
            if (guitar.getGuitarSpecial().isMatch(guitarSpecial)) {
                matchingGuitars.add(guitar);
            }
        }

        return matchingGuitars;
    }
}