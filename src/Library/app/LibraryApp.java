package Library.app;

public class LibraryApp {


    public static final String APP_NAME = "Biblioteka v0.8";


    public static void main(String[] args) {

        System.out.println(APP_NAME);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}
