package fasttrackIt.temaCurs12.ex1class;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("Ioana", 7);
        studentMap.put("Mihai", 6);
        studentMap.put("Darius", 8);
        studentMap.put("Alex", 6);

        printStudent(studentMap);
        String student = findStudent(studentMap);
        System.out.println(student);
    }

    private static String findStudent(Map<String, Integer> studentMap) {
        int max = 0;
        String nameMax = "";
        for (String name : studentMap.keySet()) {
            int note = studentMap.get(name);
            if (note > max) {
                max = note;
                nameMax = name;
            }
        }
        return nameMax;
    }

    private static void printStudent(Map<String, Integer> studentMap) {
        for (String name : studentMap.keySet()) {
            System.out.println(name + " : " + studentMap.get(name));
        }
    }
}
