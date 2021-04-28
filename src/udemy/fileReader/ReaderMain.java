package udemy.fileReader;

import fasttrackIt.temacurs8.Tema.Tema2.Print;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ReaderMain {
    public static void main(String[] args) {
        String fileName = "files/out.txt";
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            printWriter.println("Hello file!");
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
