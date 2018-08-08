package Library.app;

import Library.data.Book;
import Library.data.Library;
import Library.utils.DataReader;

public class LibraryControl {

    public static final  int EXIT = 0;
    public static final  int ADD_BOOK = 1;
    public static final  int PRINT_BOOKS = 2;

    private DataReader dataReader;

    private Library library;

    public LibraryControl() {
        dataReader = new DataReader();
        library = new Library();
    }

    public void controlLoop() {
        int option;
        printOptions();
        while ((option = dataReader.getInt()) != EXIT) {
            switch (option) {
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                default:
                    System.out.println("Choose another option");
            }
            printOptions();
        }

        dataReader.close();
    }


    private void printOptions() {
        System.out.println("Choose an option: ");
        System.out.println(EXIT+" - exit");
        System.out.println(ADD_BOOK+" - add Book");
        System.out.println(PRINT_BOOKS+" - show all Books");
    }

    private void addBook() {
        Book book = dataReader.readAndPrint();
        library.addBook(book);
    }

    private void printBooks() {
        library.printBooks();
    }
}
