package fasttrackIt.temaCurs9.javaYourself;

public class TestTR10 {
    public static int marginsAverage(int[] num) {
        if (num.length == 0) {
            return -1;

        }
        return (num[0] + num[num.length - 1]) / 2;
    }

    public static void main(String[] arg) {
        System.out.println(marginsAverage(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        System.out.println(marginsAverage(new int[]{}));
    }
}
