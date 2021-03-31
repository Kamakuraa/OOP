package FastTrackIt.TemaCurs8.Tema1.JavaYourself;

import java.util.Scanner;

public class JavaYourself2 {
    public static void pitagora (int a, int b, int c){
        Scanner input = new Scanner(System.in);
        //get the length of the base
        System.out.print("Enter a value: ");
        a = input.nextInt();

        //get the length of the perpendicular
        System.out.print("Enter a value: ");
        b = input.nextInt();

        //find the square root of (base^2 + perpendicular^2)
        c = (int) (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))%10);

        System.out.println("The Value is: " + c);
    }
}
