package fasttrackIt.curs13.exceptions;

public class UnchecedExceptions {
    public static void main(String[] args) {
        printNames();

        anotherMethod();
        System.out.println("STOP");
    }

    private static void anotherMethod() {
        try {
            printNames();
        } catch (NullPointerException e) {
            System.out.println("NPE happened" + e.getMessage());
        } catch (MyUnCheckedException mine) {
            System.err.println("this is my exception");
        }
    }

    private static void printNames() {
        if (System.currentTimeMillis() % 2 == 0) {
            String s = null;
            int l = s.length();
        } else if (System.currentTimeMillis() % 3 == 0) {
                throw new ArrayIndexOutOfBoundsException(" this is a custom AIOBE");
            } else {
                throw new MyUnCheckedException("this is mine");
            }

        }
}
