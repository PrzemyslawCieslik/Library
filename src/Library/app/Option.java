package Library.app;

public enum Option {

    EXIT(0, "Exit from app"),

    ADD_BOOK(1, "Add book to library"),

    ADD_MAGAZINE(2, "Add magazine to our Library"),

    PRINT_BOOKS(3, "Print Books"),

    PRINT_MAGAZINES(4, "Print magazines");

    private int value;
    private String description;

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    Option(int value, String desc) {
        this.value = value;
        this.description = desc;
    }

    @Override
    public String toString() {
        return value + " " + description;
    }

    public static Option createFromInt(int option) {
        return Option.values()[option];
    }
}

