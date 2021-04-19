package udemy.curs.newEx;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Tim");

        ArrayList<IntClass> intArrayList = new ArrayList<IntClass>();
        intArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.21);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            integerArrayList.add(Integer.valueOf(i));

        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + integerArrayList.get(i).intValue());
        }
        Integer myInt = 56; // Integer.valueOf(56);

        ArrayList<Double> doubles = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            doubles.add(Double.valueOf(dbl));
        }
        for (int i = 0; i<doubles.size(); i++){
            double value = doubles.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }
    }
}
