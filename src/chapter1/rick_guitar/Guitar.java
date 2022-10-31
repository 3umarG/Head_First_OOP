package chapter1.rick_guitar;

import chapter1.rick_guitar.enums.Builder;
import chapter1.rick_guitar.enums.Type;
import chapter1.rick_guitar.enums.Wood;

public class Guitar {
    // UNIQUE : user doesn't need to add them when he wants to search

    private final String serialNumber;
    private final double price;

    private final GuitarSpecial guitarSpecial;

    public Guitar(
            String serialNumber,
            double price,
            GuitarSpecial guitarSpecial) {

        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpecial = guitarSpecial;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public GuitarSpecial getGuitarSpecial() {
        return guitarSpecial;
    }
}