package fasttrackIt.curs13.exceptions.exercises.birth;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BirthYearApp {
    public void run() {
        int age = -1;
        Scanner scanner = new Scanner(System.in);
        BirthYearCalculated birthYearCalculated = new BirthYearCalculated();
        do {
            System.out.print("Introduceti varsta");

            try {
                int i = scanner.nextInt();
                age = i;
                System.out.println("Anul nasterii este "
                        + birthYearCalculated.calculatedYear(age));
            } catch (InvalidAge ex) {

            } catch (InputMismatchException ime) {

            }
            System.out.println("Varsta nu este corecta. Va rugam mai incercati");
            scanner = new Scanner(System.in);
        } while (age != -1);
    }

    public static void main(String[] args) {
        new BirthYearApp().run();
    }
}
