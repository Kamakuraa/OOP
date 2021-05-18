package udemy.exceptions;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        System.out.println(dide(30, 2));
        System.out.println(dide(15, 0));
        System.out.println("the job is finished");
    }

    private static int dide(int dividend, int divisor) {
        try {
            if (divisor == 0) {
                throw new ZeroDiv("the div cant be zero - custom ex");
            }
            return dividend / divisor;
        } catch (NullPointerException e){
            System.err.println("NullPointerException is thrown ");
            return 0;
        } catch (ZeroDiv e){
            System.err.println(e.getMessage());
            e.printStackTrace();
            return 0;

        } finally {
            System.out.println("Hey, I m very good to close files and database connections");
        }
    }
}
