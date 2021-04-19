package udemy.curs.arrays;

import java.util.Scanner;

public class Main1 {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        while (!quit) {
            System.out.println("enter you choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            printInst();
            switch (choice) {
                case 0:
                    printInst();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                case 5:
                    search();
                    break;
                case 6:
                    quit = true;
                    break;


            }
        }
    }

    private static void printInst() {
        System.out.println("\nPress ");
        System.out.println("\n0 - to print choice options. ");
        System.out.println("\n1 - to print the list. ");
        System.out.println("\n2 - to add  ");
        System.out.println("\n3 - to modify  ");
        System.out.println("\n4 - to remove  ");
        System.out.println("\n5 - to search  ");
        System.out.println("\n6 - to quit  ");

    }
    public static void addItem(){
        System.out.print("press enter the grocery item ");
        groceryList.addGroceryItem(scanner.next());
    }
    public static void modifyItem(){
        System.out.print("Enter item number");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String  newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1, newItem);
    }
    public static void removeItem(){
        System.out.println("Enter the number: ");
        int itemNo = scanner.nextInt();
       scanner.nextLine();
       groceryList.removeGroceryItem(itemNo - 1);

    }
    public static void search(){
        System.out.println("Item to search for: ");
        String search = scanner.nextLine();
        if (groceryList.findItem(search) != null) {
            System.out.println("Found  " + search + " in our grocery list");
        } else {
            System.out.println(search + " is not in the shopping");
        }
    }
}
