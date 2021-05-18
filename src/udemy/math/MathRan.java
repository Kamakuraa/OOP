package udemy.math;

public class MathRan {
    public static void main(String[] args) {
        double tempYesterday = 5.6;
        double tempToday = -Math.random() * 10;

        System.out.println("Absolute temp today: " + Math.abs(tempToday));
        System.out.println("Min " + Math.min(tempToday, tempYesterday));
        System.out.println("Max " + Math.max(tempToday, tempYesterday));
        System.out.println("Roubd " + Math.round(tempToday));
    }
}
