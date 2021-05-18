package fasttrackIt.curs13.exceptions.exercises.birth;

public class Main {
    public static void main(String[] args) {
        BirthYearCalculated yearCalculated = new BirthYearCalculated();
        try {
            System.out.println(yearCalculated.calculatedYear(10));
        } catch (InvalidAge ex) {
            System.err.println(ex.getMessage());
        }
        try {
            System.out.println(yearCalculated.calculatedYear(-10));
            System.out.println(yearCalculated.calculatedYear(50));
        } catch (InvalidAge ex) {
            System.err.println(ex.getMessage());
        }
        try {
            System.out.println(yearCalculated.calculatedYear(30));
        }catch (InvalidAge ex){
            System.err.println(ex.getMessage());
        }

    }

}
