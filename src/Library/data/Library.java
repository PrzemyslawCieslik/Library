package Library.data;

public class Library {
    public final int maxBooks = 1000;
    private Book[] books;
    private int booksNumber;


    public Library() {
        books = new Book[maxBooks];
    }

    public int getBooksNumber() {
        return booksNumber;
    }

    public Book[] getBooks() {
        return books;
    }

    public void addBook(Book book) {
        if (booksNumber > maxBooks) {
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("Our library is full, Sorry you can't add more books");
        }
    }

    public void printBooks() {
        if (booksNumber == 0) {
            System.out.println("Our library hasn't books yet");
        }
        for (int i = 0; i < booksNumber; i++) {
            books[i].printInfo();
        }


    }
}
