package Library.app;

public class LibraryApp {

<<<<<<< HEAD
    public static final String APP_NAME = "Biblioteka v0.8";
=======
    public static final String APP_NAME = "Biblioteka v0.7";
    
>>>>>>> e39f2e13c977468cd5fc83e3609ec6b50c5806cb
    public static void main(String[] args) {

        System.out.println(APP_NAME);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}
