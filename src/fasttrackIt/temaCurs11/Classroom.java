package fasttrackIt.temaCurs11;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Classroom {
    private final List<StudentGrade> students;

    public Classroom(List<StudentGrade> students) {
        this.students = new ArrayList<>();
        this.students.addAll(students);
    }


    public List<StudentGrade> getStudents() {
        return students;
    }

    public List<Integer> getGradesForDiscipline(String disc) {
        List<Integer> newResult = new ArrayList<>();
        for (StudentGrade stud : students) {
            if (stud.getDiscipline().equals(disc)) {
                newResult.add(stud.getGrade());
            }
        }
        return newResult;
    }

    public int getGradesForStudent(String student) {
        for (StudentGrade stud : students) {
            if (student.equals(stud.getName())) {
                return stud.getGrade();
            }
        }
        return 0;
    }

    public Integer getMaxGrade() {
        List<Integer> newResult = new ArrayList<>();
        for (StudentGrade stud : students) {
            newResult.add(stud.getGrade());
        }
        return Collections.max(newResult);
    }

    public Integer getWorstGrade() {
        List<Integer> newResult = new ArrayList<>();
        for (StudentGrade stud : students) {
            newResult.add(stud.getGrade());
        }
        return Collections.min(newResult);
    }

    public int getAverageGrade(String discipline) {
        List<Integer> newResult = new ArrayList<>();
        int sum = 0;
        for (StudentGrade stud : students) {
            if (discipline.equals(stud.getDiscipline())) {
                newResult.add(stud.getGrade());
                sum =sum + stud.getGrade();
            }
        }
        return sum/newResult.size();
    }
}
