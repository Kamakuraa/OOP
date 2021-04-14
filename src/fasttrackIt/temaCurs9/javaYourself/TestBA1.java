package fasttrackIt.temaCurs9.javaYourself;

public class TestBA1 {
    public static double avg(int[] num) {
        double sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum / num.length;
    }

    public static void main(String[] args) {
        System.out.println(avg(new int[]{2, 4, 6, 8, 10}));
    }
}
