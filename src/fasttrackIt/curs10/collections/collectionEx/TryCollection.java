package fasttrackIt.curs10.collections.collectionEx;

import java.util.*;

public class TryCollection {
    public static void main(String[] args) {
        tryCollection();
        tryList();
        tryHashSet();
    }

    private static void tryHashSet() {
        Set<String> materii = new HashSet<>(List.of("Matematica", "Info",
                "romana","Info", "bio", "fizica"));
        System.out.println(materii);
        for (String mater: materii){
            System.out.println(mater);
        }
    }

    private static void tryList() {
        List<Integer> grades = new ArrayList<>(List.of(10, 2, 5, 7, 8, 9, 2));
        System.out.println(grades.get(4));
        grades.add(3, 11);
        System.out.println(grades);
        grades.remove(3);
        System.out.println(grades);
        System.out.println(grades.indexOf(2));
        System.out.println(grades.lastIndexOf(2));

    }

    private static void tryCollection() {
        Collection<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Bogdan");
        names.add("Mihai");

        System.out.println(names);

        names.remove("Ana");
        System.out.println(names);

        System.out.println(names.size());

        System.out.println(names.contains("Mihai"));
        System.out.println(names.contains("Ana"));

        names.addAll(List.of("MAria", "George", "Alin"));
        System.out.println(names);

        System.out.println(names.isEmpty());
        names.clear();
        System.out.println(names);
        System.out.println(names.isEmpty());
        names.add("Ana");
        names.add("Mihai");
        names.add("Mik");

        names.equals(names.equals(List.of("Ana")));
        for (String name : names) {
            System.out.println(name);
        }
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
