package fasttrackIt.curs8;

public class Student {
    public static int INSTANCE_COUNT = 0;
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        INSTANCE_COUNT++;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }


}
