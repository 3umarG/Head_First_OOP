package chapter1.rick_guitar;

public class FindGuitarTester {
    public static void main(String[] args) {    // Set up Rick’s guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        Guitar whatErinLikes = new Guitar(
                "",
                0,
                "fender",
                "Stratocastor",
                "electric",
                "Alder",
                "Alder");
        Guitar guitar = inventory.search(whatErinLikes);
        if (guitar != null) {
            System.out.println(
                    "Erin, you might like this " + guitar.getBuilder()
                    + " " + guitar.getModel()
                    + " " + guitar.getType() + "guitar:\n   "
                    + guitar.getBackWood() + "back and sides,\n   "
                    + guitar.getTopWood() + "top.\nYou can have it for only $" +
                    +guitar.getPrice() + "!");
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        // Add guitars to the inventory...

        inventory.addGuitar(
                "V95693",
                1499.95,
                "Fender",
                "Stratocastor",
                "electric",
                "Alder",
                "Alder");


    }
}
