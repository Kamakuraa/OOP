package udemy.file;

import java.io.File;
import java.io.IOException;

public class fileHandling {
    public static void main(String[] args) {
        File famousSam = new File("files/famousQuotes.txt");


        try {
            if (famousSam.createNewFile()) {
                System.out.println("The file is created.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        File famPerson = new File("files/famousPerson.txt");
        if (famousSam.renameTo(famPerson)) {
            System.out.println("the filemis renamed.");
        }
        if (famPerson.delete()){
            System.out.println("the file is deleted");
        }

    }
}
