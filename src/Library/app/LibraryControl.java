package Library.app;

import Library.utils.DataReader;
import Library.data.Book;
import Library.data.Library;
import Library.data.Magazine;

public class LibraryControl {

    // To communication with user
    private DataReader dataReader;

    //Library to keep datas
    private Library library;

    public LibraryControl() {
        dataReader = new DataReader();
        library = new Library();
    }

    /*
     * base if, to chose a option
     */
    public void controlLoop() {
        Option option;
        printOptions();
        while ((option = Option.createFromInt(dataReader.getInt())) != Option.EXIT) {
            switch (option) {
                case ADD_BOOK:
                    addBook();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
                case EXIT:
            }
            printOptions();
        }
        // close
        dataReader.close();
    }

    private void printOptions() {
        System.out.println("Choose option: ");
        for (Option o : Option.values()) {
            System.out.println(o);
        }
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printBooks() {
        library.printBooks();
    }

    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }

    private void printMagazines() {
        library.printMagazines();
    }
}

enum Option {

    EXIT(0, "Exit from app"),

    ADD_BOOK(1, "Add book to library"),

    ADD_MAGAZINE(2, "Add magazine to our Library"),

    PRINT_BOOKS(3, "Print Books"),

    PRINT_MAGAZINES(4, "Print magazines");

    private int value;
    private String description;

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