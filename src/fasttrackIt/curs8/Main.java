package fasttrackIt.curs8;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ana", 10);
        Student student1 = new Student("Ana", 10);
        Student student2 = new Student("Ana", 10);
        Student student3 = new Student("Ana", 10);
        Student student4 = new Student("Ana", 10);
        Student student5 = new Student("Ana", 10);

        System.out.println(student.INSTANCE_COUNT);
    }
}
