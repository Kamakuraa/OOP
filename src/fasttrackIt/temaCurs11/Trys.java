package fasttrackIt.temaCurs11;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Trys {
    public static void main(String[] args) throws IOException {
       try {
           Scanner file = new Scanner(new File("files/number.txt"));
           int largestNum = file.nextInt();

           while (file.hasNextInt()) {
               int number = file.nextInt();
               if (number < largestNum) {
                   largestNum = number;
               }
               System.out.println(number);
           }
           file.close();

           System.out.println(" the max number in the file is: " + largestNum);
       } catch (IOException e ){
           System.out.println(e.getMessage());
       }
    }
}
