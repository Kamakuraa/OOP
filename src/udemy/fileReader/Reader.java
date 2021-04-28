package udemy.fileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static void readLines(File f) throws IOException {
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line;
        int numberOfLines = 0;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
            numberOfLines++;
        }
        System.out.println("number of lines in this file " + numberOfLines);
        br.close();
        fr.close();

    }

    public static void main(String[] args) {
        File f = new File("files/grades.txt");

        try {
            readLines(f);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
