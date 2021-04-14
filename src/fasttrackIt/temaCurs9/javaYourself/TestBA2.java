package fasttrackIt.temaCurs9.javaYourself;

public class TestBA2 {
    public static int countNegatives(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countNegatives(new int[]{10, 14, -21, -4, 0, 2, -3}));
        System.out.println("_______________________");
        System.out.println(countNegatives(new int[]{-1, 7, -3, 6}));
        System.out.println("_______________________");
        System.out.println(countNegatives(new int[]{1, 2}));
        System.out.println("_______________________");
        System.out.println(countNegatives(new int[]{}));
        System.out.println("_______________________");
    }
}
