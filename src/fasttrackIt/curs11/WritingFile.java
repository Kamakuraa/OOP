package fasttrackIt.Curs11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {
    public static void main(String[] args) throws Exception {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("files/outputs.txt"));
        bufferedWriter.write("This is from Java Cool");
        bufferedWriter.close();
    }
}
