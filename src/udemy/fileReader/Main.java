package udemy.fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String text = readString("files/test.txt");
        System.out.println(text);
    }

    private static String readString(String file) {
        String text = "";
        try {
            Scanner scanner = new Scanner(new File(file));
            while (scanner.hasNextLine()) {
                text = text + scanner.nextLine() + " ";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return text;
    }


}
