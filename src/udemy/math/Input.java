package udemy.math;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Welcome to world of worlords");
        System.out.println("Here you can create your character");

        System.out.println("Name: ");

        String name = user.nextLine();

        System.out.println("Race (human or orc): ");
        while (!user.hasNext("human" ) && !user.hasNext("orc")) {
            System.err.println("Invalid input, you need to type in human or orc.");
            user.nextLine();

        }
        String race = user.nextLine();

        System.out.println("Difficulty (0 - easy, 1 - medium, 2 - hard ): ");
        while (!user.hasNextByte(3)) {
            System.err.println("Invalid input, you need to type in 0 or1 or 2.");

            user.nextLine();
        }
        byte difficulty = user.nextByte();

        System.out.println("Nightmare mode is on  (true or false): ");
        while (!user.hasNextBoolean()) {
            System.err.println("Invalid input, you need to type true or false.");

            user.nextLine();
        }
        boolean isNightmare = user.nextBoolean();

        System.out.println("----------------------");
        System.out.println("You character is created");



        System.out.println("Name: \t\t%s\n"+name);
        System.out.println("Race: \t\t%s\n"+race);
        System.out.println("Difficulty: \t%d\n"+difficulty);
        System.out.println("Nightmare mode is on: \t%b\n"+isNightmare);
    }

}
