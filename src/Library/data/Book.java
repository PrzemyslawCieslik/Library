package Library.data;


import java.util.Objects;

public class Book extends Publication {
    private static final long serialVersionUID = -7907331751072277846L;
    private String author;
    private int pages;
    private String isbn;

    //getters and setters


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    //constructor
    public Book(String title, String author, int year, int pages, String publisher, String isbn){
        super(year,title,publisher);
        this.setAuthor(author);
        this.setPages(pages);
        this.setIsbn(isbn);
    }
    
    public Book (Book book){
        this(book.getTitle(), book.getAuthor(), book.getYear(), book.getPages(), book.getPublisher(), book.getIsbn());
    }
    //method
    @Override
    public String toString(){
        StringBuilder print = new StringBuilder(32);
        print.append(getTitle());
        print.append(";");
        print.append(getAuthor());
        print.append(";");
        print.append(getYear());
        print.append(";");
        print.append(getPages());
        print.append(";");
        print.append(getPublisher());
        print.append(";");
        print.append(getIsbn());
        return print.toString();
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return getPages() == book.getPages() &&
                Objects.equals(getAuthor(), book.getAuthor()) &&
                Objects.equals(getIsbn(), book.getIsbn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAuthor(), getPages(), getIsbn());
    }
}

