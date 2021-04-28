package fasttrackIt.Curs11.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/output.txt"));
        writer.write("This is from Java!");
        writer.close();
    }
}
