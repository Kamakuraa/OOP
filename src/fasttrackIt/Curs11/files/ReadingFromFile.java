package fasttrackIt.Curs11.files;

import java.io.*;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws Exception{
        readOneLine();
        reaFullFile();
        reaFullBufferFile();

    }

    private static void reaFullBufferFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("files/test.txt"));
        String line;
        while ((line=bufferedReader.readLine()) != null){
            System.out.println("reaFullBufferFile();reaFullBufferFile();reaFullBufferFile();reaFullBufferFile();");
            System.out.println(line);
        }
    }

    private static void reaFullFile() throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("files/test.txt"));
        while (fileScanner.hasNext()){
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
