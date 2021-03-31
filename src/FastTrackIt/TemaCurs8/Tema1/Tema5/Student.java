package FastTrackIt.TemaCurs8.Tema1.Tema5;

import javax.print.attribute.standard.MediaSize;
import java.net.PortUnreachableException;

//4)Create an object that represents a Student with name and grade.
// Add getters for them. No setters, the object is immutable.
// Create two static fields that will remember the sum of the grades and the other is the number of students.
// Also create a static method that uses these static fields to calculate the average grade for all students
public class Student {
    public static int SUM_GRADES = 0;
    public static int SUM_STUDENT = 0;
    private final String name;
    private final int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        SUM_STUDENT++;
        SUM_GRADES += grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade / SUM_STUDENT;
    }
}
