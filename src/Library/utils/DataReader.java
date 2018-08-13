package Library.utils;

import Library.data.Book;
import Library.data.Magazine;

import java.util.Scanner;

public class DataReader {
    private Scanner sc;

    public DataReader() {
        sc = new Scanner(System.in);
    }

    public void close(){
        sc.close();
    }

    public int getInt() {
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }
    //Method
    public Book readAndCreateBook(){
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

    public Magazine readAndCreateMagazine(){
        System.out.println("Title: ");
        String title = sc.nextLine();
        System.out.println("Publisher: ");
        String publisher = sc.nextLine();
        System.out.println("Language: ");
        String language = sc.nextLine();
        System.out.println("Year: ");
        int year = sc.nextInt();
        System.out.println("Month: ");
        int month = sc.nextInt();
        System.out.println("Day: ");
        int day = sc.nextInt();
        close();
        return new Magazine(title, publisher, language,year, month, day);
    }
}
