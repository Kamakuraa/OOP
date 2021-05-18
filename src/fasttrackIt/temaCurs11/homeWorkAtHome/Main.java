package fasttrackIt.temaCurs11.homeWorkAtHome;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassRoom1 classRoom1 = new ClassRoom1(List.of(
                new StudentGrade1("Ana", "mate", 7),
                new StudentGrade1("Ionut", "biologie", 3),
                new StudentGrade1("Andrei", "chimie", 10),
                new StudentGrade1("Roxana", "mate", 9),
                new StudentGrade1("George", "geografie", 10),
                new StudentGrade1("Diana", "mate", 8),
                new StudentGrade1("Patrik", "geografie", 3)
        ));
        System.out.println(classRoom1.getMaxGrade2Iter("mate"));
        System.out.println(classRoom1.getMaxGrase("mate"));

    }
}
