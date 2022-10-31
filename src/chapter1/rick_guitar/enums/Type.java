package chapter1.rick_guitar.enums;

public enum Type {
    ACOUSTIC, ELECTRIC;

    public String toString() {
        switch (this) {
            case ACOUSTIC -> {
                return "acoustic";
            }
            case ELECTRIC -> {
                return "electric";
            }
            default -> {
                return "";
            }
        }
    }
}
