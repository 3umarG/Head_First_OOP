package chapter1.rick_guitar;

import chapter1.rick_guitar.enums.Builder;
import chapter1.rick_guitar.enums.Type;
import chapter1.rick_guitar.enums.Wood;

import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {

        // Set up Rick’s guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);


        // When Eren try to Find or Search on such a Guitar
        // He must know only these prop.
        // So I Encapsulate all common prop. to Special Class.
        GuitarSpecial whatErinLikes = new GuitarSpecial(
                Builder.FENDER,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER);

        List<Guitar> matchingGuitars = inventory.search(whatErinLikes);

        if (!matchingGuitars.isEmpty()) {
            for (Guitar guitar : matchingGuitars) {
                GuitarSpecial guitarSpecial = guitar.getGuitarSpecial();
                System.out.println(
                        "Erin, you might like this " + guitarSpecial.getBuilder()
                        + " " + guitarSpecial.getModel()
                        + " " + guitarSpecial.getType() + " guitar:\n   "
                        + guitarSpecial.getBackWood() + "back and sides,\n   "
                        + guitarSpecial.getTopWood() + "top.\nYou can have it for only $" +
                        +guitar.getPrice() + "! \n------------------------\n");
            }

        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        // Add guitars to the inventory...

        inventory.addGuitar(
                "V95693",
                1499.95,
                Builder.FENDER,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER);

        inventory.addGuitar("V658",
                1500.0,
                Builder.FENDER ,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER);


        inventory.addGuitar("V658",
                1500.0,
                Builder.COLLINGS ,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER);

        inventory.addGuitar("V658",
                1500.0,
                Builder.FENDER ,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.BRAZILIAN_ROSEWOOD,
                Wood.ALDER);


    }
}
