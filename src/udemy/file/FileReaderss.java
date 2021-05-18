package udemy.file;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderss {


    public static void main(String[] args) {

        String path = "files/student.txt";
        char[] firstHundredCharacters = new char[100];

        try (FileReader fileReader = new FileReader(path)){
           fileReader.read(firstHundredCharacters);
            System.out.println(firstHundredCharacters);
            System.out.println(firstHundredCharacters);
            System.out.println("read more");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
