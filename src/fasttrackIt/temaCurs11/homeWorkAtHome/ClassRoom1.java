package fasttrackIt.temaCurs11.homeWorkAtHome;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom1 {
    private final List<StudentGrade1> grade1s = new ArrayList<>();

    public ClassRoom1(List<StudentGrade1> grade1s) {
        if (grade1s != null) {
            this.grade1s.addAll(grade1s);
        }
    }


    public StudentGrade1 getMaxGrase(String disc) {
        StudentGrade1 max = null;
        for (StudentGrade1 studentGrade1 : grade1s) {
            if (studentGrade1.getDiscipline().equals(disc)) {
                if (max == null || studentGrade1.getGrade() > max.getGrade()) {
                    max = studentGrade1;
                }
            }
        }
        return max;
    }

    public StudentGrade1 getMaxGrade2Iter(String discipline) {
        int maxGrade = findMAxGrade(discipline);
        return firstStudWithGrade(maxGrade, discipline);
    }

    private StudentGrade1 firstStudWithGrade(int maxGrade, String discipline) {
        for (StudentGrade1 grade1 : grade1s) {
            if (grade1.getGrade() == maxGrade && grade1.getDiscipline().equals(discipline)) {
                return grade1;
            }
        }
        return null;
    }

    private int findMAxGrade(String discipline) {
        int max = 0;
        for (int i = 1; i < grade1s.size(); i++) {
            StudentGrade1 studentGrade1 = grade1s.get(i);
            if (max < studentGrade1.getGrade() &&
                    studentGrade1.getDiscipline().equals(discipline)) {
                max = studentGrade1.getGrade();
            }
        }
        return max;
    }
}
