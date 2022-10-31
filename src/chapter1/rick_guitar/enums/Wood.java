package chapter1.rick_guitar.enums;

public enum Wood {
    INDIAN_ROSEWOOD,
    BRAZILIAN_ROSEWOOD,
    MAHOGANY,
    MAPLE,
    COCOBOLO,
    CEDAR,
    ADIRONDACK,
    ALDER,
    SITKA;

    @Override
    public String toString() {
        switch (this){

            case INDIAN_ROSEWOOD -> {
                return "Indian Rose Wood";
            }
            case BRAZILIAN_ROSEWOOD -> {
                return "Brazilian Rose Wood";
            }
            case MAHOGANY -> {
                return "Mahogany";
            }
            case MAPLE -> {
                return "Maple";
            }
            case COCOBOLO -> {
                return "Cocobol";
            }
            case CEDAR -> {
                return "Cedar";
            }
            case ADIRONDACK -> {
                return "Adirondack";
            }
            case ALDER -> {
                return "Alder";
            }
            case SITKA -> {
                return "Sitka";
            }
            default -> {
                return "";
            }
        }
    }
}
