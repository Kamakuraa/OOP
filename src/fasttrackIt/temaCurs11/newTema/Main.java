package fasttrackIt.temaCurs11.newTema;

import java.util.List;

public class Main {
    public static void main(String[] args) {
ClassRoom classRoom = new ClassRoom(List.of(
        new StudentGrade("Ana", "mate", 7),
        new StudentGrade("Ionut", "biologie", 3),
        new StudentGrade("Andrei", "chimie", 10),
        new StudentGrade("Roxana", "mate", 9),
        new StudentGrade("George", "geografie", 10),
        new StudentGrade("Diana", "mate", 8),
        new StudentGrade("Patrik", "geografie", 3)
));
        System.out.println(classRoom.getMAxGrade2Iter("mate"));
        System.out.println(classRoom.getMaxGrade("geografie"));
    }
}
