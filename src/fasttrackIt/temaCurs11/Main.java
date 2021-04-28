package fasttrackIt.temaCurs11;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Classroom classroom = new Classroom(List.of(
                new StudentGrade("Alex", "Mate", 7),
                new StudentGrade("Silvia", "Mate", 10),
                new StudentGrade("George", "Fizica", 9),
                new StudentGrade("Cristian", "Romana", 7),
                new StudentGrade("Ionel", "Romana", 5),
                new StudentGrade("Ana", "Informatica", 10)));


        System.out.println(classroom.getGradesForDiscipline("Mate"));
        System.out.println(classroom.getStudents());
        System.out.println(classroom.getGradesForStudent("Alex"));

        System.out.println(classroom.getMaxGrade());
        System.out.println(classroom.getWorstGrade());
        System.out.println(classroom.getAverageGrade("Romana"));
    }
}

