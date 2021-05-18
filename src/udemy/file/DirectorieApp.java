package udemy.file;

import java.io.File;

public class DirectorieApp {
    public static void main(String[] args) {
        File businessBooksDir = new File("filess");

        if (businessBooksDir.mkdirs()) {
            System.out.println("The new directory is created.");
        } else {
            System.out.println("Cant create the directory.");
        }
        businessBooksDir.deleteOnExit();


    }
}
