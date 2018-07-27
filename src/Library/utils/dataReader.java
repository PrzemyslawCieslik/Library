package Library.utils;

import Library.data.Book;

import java.util.Scanner;

public class dataReader {
    private Scanner sc;

    public dataReader(){
        sc = new Scanner(System.in);
    }

    public void close(){
        sc.close();
    }
    //Method
    public Book readAndPrint(){
        System.out.println("Title");
        String title = sc.nextLine();
        System.out.println("Author");
        String author = sc.nextLine();
        System.out.println("Publisher");
        String publisher = sc.nextLine();
        System.out.println("ISBN");
        String isbn = sc.nextLine();
        System.out.println("Release date");
        int releaseDate = sc.nextInt();
        System.out.println("Pages");
        int pages = sc.nextInt();
        close();
        return new Book(title,author,releaseDate,pages,publisher,isbn);
    }
}
