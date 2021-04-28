package fasttrackIt.Curs11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws Exception {
        readOneLine();
        readFullOnline();
        readFileBuffered();

    }

    private static void readFileBuffered() throws Exception {
        BufferedReader fileReader = new BufferedReader(new FileReader("files/test.txt"));
        String line;
        while ((line = fileReader.readLine())!=null){
            System.out.println(line);
        }
    }

    private static void readFullOnline () throws Exception {
        Scanner fileScanner = new Scanner(new File("files/test.txt"));
        while (fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            System.out.println(line);
        }
    }

    private static void readOneLine() throws Exception{
        Scanner fileScanner = new Scanner(new File("files/test.txt"));
        String line = fileScanner.nextLine();
        System.out.println(line);
    }


}
