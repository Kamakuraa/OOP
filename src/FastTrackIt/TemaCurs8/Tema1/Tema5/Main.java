package FastTrackIt.TemaCurs8.Tema1.Tema5;

//4)Create an object that represents a Student with name and grade.
// Add getters for them. No setters, the object is immutable.
// Create two static fields that will remember the sum of the grades and the other is the number of students.
// Also create a static method that uses these static fields to calculate the average grade for all students
public class Main {
    public static void main(String[] args) {

        Student student = new Student("Joe", 8);
        Student student1 = new Student("Doe", 8);


        System.out.println((student.getGrade() + student1.getGrade()));
        System.out.println(student.SUM_STUDENT);
        System.out.println(student.SUM_GRADES);

    }

}
