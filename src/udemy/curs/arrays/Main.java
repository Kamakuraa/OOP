package udemy.curs.arrays;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myInt = 10;
        int anotherIntValue = myInt;

        System.out.println("myInt = " + myInt);
        System.out.println("anotherInt = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myInt = " + myInt);
        System.out.println("anotherInt = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("another array = " + Arrays.toString(anotherArray));

        anotherArray = new int[]{4, 5, 6, 7, 8};
        modifyArray(myIntArray);
        System.out.println("after  myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after another array = " + Arrays.toString(anotherArray));

        modifyArray(myIntArray);
        System.out.println("after m myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after m another array = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[]{1, 2, 3, 4, 5};
    }
}
