package fasttrackIt.temaCurs11.newTema;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private final List<StudentGrade> grades = new ArrayList<>();

    public ClassRoom(List<StudentGrade> grades) {
        if (grades != null) {
            this.grades.addAll(grades);
        }

    }

    public StudentGrade getMaxGrade(String disc) {
        StudentGrade max = null;
        for (StudentGrade studentGrade : grades) {
            if (studentGrade.getDiscipline().equals(disc)) {
                if (max == null
                        || studentGrade.getGrade() > max.getGrade()) {
                    max = studentGrade;
                }
            }
        }
        return max;
    }

    public StudentGrade getMAxGrade2Iter(String discipline) {
        int maxGrade = findMaxGrade(discipline);
        return firstStudGrade(maxGrade, discipline);
    }

    private StudentGrade firstStudGrade(int maxGrade, String discipline) {
        for (StudentGrade grade : grades) {
            if (grade.getGrade() == maxGrade
                    && grade.getDiscipline().equals(discipline)) {
                return grade;
            }
        }
        return null;
    }

    private int findMaxGrade(String discipline) {
        int max = 0;
        for (int i = 1; i < grades.size(); i++) {
            StudentGrade studentGrade = grades.get(i);
            if (max < studentGrade.getGrade()
                    && studentGrade.getDiscipline()
                    .equals(discipline)) {
                max = studentGrade.getGrade();
            }
        }
        return max;
    }
}
