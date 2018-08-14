package Library.app;

import Library.utils.DataReader;
import Library.data.Book;
import Library.data.Library;
import Library.data.Magazine;

public class LibraryControl {
    // public static finals to control program
    public static final int EXIT = 0;
    public static final int ADD_BOOK = 1;
    public static final int ADD_MAGAZINE = 2;
    public static final int PRINT_BOOKS = 3;
    public static final int PRINT_MAGAZINES = 4;

    private DataReader dataReader;

    // "Library"
    private Library library;

    public LibraryControl() {
        dataReader = new DataReader();
        library = new Library();
    }

    /*
     * head if to control program
     */
    public void controlLoop() {
        int option;
        printOptions();
        while ((option = dataReader.getInt()) != EXIT) {
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
                default:
                    System.out.println("Choose another option: ");
            }
            printOptions();
        }
       
    }

    private void printOptions() {
        System.out.println("Choose option: ");
        System.out.println(EXIT + " - exit");
        System.out.println(ADD_BOOK + " - add new book ");
        System.out.println(ADD_MAGAZINE + " - add new magazin ");
        System.out.println(PRINT_BOOKS + " - print available books");
        System.out.println(PRINT_MAGAZINES + " - print available magazines");
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