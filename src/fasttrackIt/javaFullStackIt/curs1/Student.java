package fasttrackIt.javaFullStackIt.curs1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private final String name;
    private final int age;
    private final List<Integer> grades;



    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    public Student(String name, int age, List<Integer> grades) {
        this.name = name;
        this.age = age;
        this.grades = new ArrayList<>(grades);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, grades);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grades=" + grades +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}
