package Library.app;
import Library.data.Book;

public class Library {
    public static void main (String[] args){
        final String appName = "Library v0.3";
        Book[] books = new Book[1000];
        books[0] = new Book("Thinking in Java", "Bruce Eckel", 2006, 1248,
        "Helion","9788328334427");
        books[1] = new Book("Clean Code: A Handbook of Agile Software Craftsmanship","Robert C. Martin",
                2008, 464, "Prentice Hall","0132350882");


        System.out.println(appName);
        books[0].printInfo();
        books[1].printInfo();
        System.out.println("In our library we can handle "+books.length+" books");


    }
}
