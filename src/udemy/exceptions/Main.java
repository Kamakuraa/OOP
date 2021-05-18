package udemy.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        createFile("files/output.txt");
    }

    public static void createFile(String filename) {
//        PrintWriter outputFile = null;
        try (PrintWriter outputFile = new PrintWriter(new FileWriter(filename))) {
            outputFile.println("Hello");

        } catch (IOException e) {
            System.err.println("caught an IOEception:" + e.getMessage());
        }
        System.out.println("this line comes after we tried to create a file.");

    }
}
