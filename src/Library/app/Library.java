package Library.app;
import Library.data.Book;
import Library.utils.dataReader;

public class Library {
    public static void main (String[] args){
        final String appName = "Library v0.3";
        Book[] books = new Book[1000];
        dataReader dr = new dataReader();


        System.out.println(appName);
        books[0] = dr.readAndPrint();
        books[1] = dr.readAndPrint();
        dr.close();
        System.out.println("In our library we can handle "+books.length+" books");


    }
}
