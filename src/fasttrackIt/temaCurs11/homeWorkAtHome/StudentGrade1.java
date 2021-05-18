package fasttrackIt.temaCurs11.homeWorkAtHome;

import java.util.Objects;

public class StudentGrade1 {
    private final String name;
    private final String discipline;
    private final int grade;

    public StudentGrade1(String name, String discipline, int grade) {
        this.name = name;
        this.discipline = discipline;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentGrade1 that = (StudentGrade1) o;
        return grade == that.grade && Objects.equals(name, that.name) && Objects.equals(discipline, that.discipline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, discipline, grade);
    }

    @Override
    public String toString() {
        return "StudentGrade1{" +
                "name='" + name + '\'' +
                ", discipline='" + discipline + '\'' +
                ", grade=" + grade +
                '}';
    }

}
