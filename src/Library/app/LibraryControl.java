package Library.app;

import Library.data.Book;
import Library.data.Library;
import Library.utils.DataReader;

public class LibraryControl {

    public final int exit = 0;
    public final int addBook = 1;
    public final int printBooks = 2;

    private DataReader dataReader;

    private Library library;

    public LibraryControl() {
        dataReader = new DataReader();
        library = new Library();
    }

    public void controlLoop() {
        int option;
        printOptions();
        while ((option = dataReader.getInt()) != exit) {
            switch (option) {
                case addBook:
                    addBook();
                    break;
                case printBooks:
                    printBooks();
                    break;
                default:
                    System.out.println("This option doesn't exist. Try again");
            }
            printOptions();
        }
        dataReader.close();
    }

    private void printOptions() {
        System.out.println("Choose an option: ");
        System.out.println("0 - exit");
        System.out.println("1 - add Book");
        System.out.println("2 - show all Books");
    }

    private void addBook() {
        Book book = dataReader.readAndPrint();
        library.addBook(book);
    }

    private void printBooks() {
        library.printBooks();
    }
}
