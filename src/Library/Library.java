package Library;

public class Library {
    public static void main (String[] args){
        final String appName = "Library v0.2";

        Book book1 = new Book("Thinking in Java", "Bruce Eckel", 2006, 1248,
        "Helion","9788328334427");
        Book book2 = new Book("Clean Code: A Handbook of Agile Software Craftsmanship","Robert C. Martin",
                2008, 464, "Prentice Hall","0132350882");


        System.out.println(appName);
        book1.printInfo();
        book2.printInfo();


    }
}
