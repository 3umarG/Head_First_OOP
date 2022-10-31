package chapter1.rick_guitar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, String builder, String model, String type, String backWood, String topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
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


    public Guitar search(Guitar searchGuitar) {
        for (Guitar g : guitars) {
            Guitar guitar = g;
            // Ignore serial number since that’s unique
            // Ignore price since that’s unique

            // The Builder of your search guitar
            String builder = searchGuitar.getBuilder();
            if (
                    (builder != null)
                    && (!builder.equals(""))
                    && (!builder.equals(guitar.getBuilder())))
                continue;

            String model = searchGuitar.getModel();
            if (
                    (model != null)
                    && (!model.equals(""))
                    && (!model.equals(guitar.getModel())))
                continue;

            String type = searchGuitar.getType();
            if (
                    (type != null)
                    && (!searchGuitar.equals(""))
                    && (!type.equals(guitar.getType())))
                continue;


            String backWood = searchGuitar.getBackWood();
            if (
                    (backWood != null)
                    && (!backWood.equals(""))
                    && (!backWood.equals(guitar.getBackWood())))
                continue;


            String topWood = searchGuitar.getTopWood();
            if (
                    (topWood != null)
                    && (!topWood.equals(""))
                    && (!topWood.equals(guitar.getTopWood())))
                continue;
        }

        return null;
    }
}