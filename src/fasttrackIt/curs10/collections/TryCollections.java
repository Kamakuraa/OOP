package fasttrackIt.curs10.collections;

import java.util.*;

public class TryCollections {
//    public static void main(String[] args) {
//        tryCollection();
//        tryArrayList();
//        tryHashSet();
//    }
//
//    private static void tryHashSet() {
//        Set<String> ceva = new HashSet<>(List.of("mate", "inf", "inf"));
//        System.out.println(ceva);
//
//        for (String mat : ceva){
//            System.out.println("ceva");
//        }
//    }
//
//    private static void tryArrayList() {
//        List<Integer> grades = new ArrayList<>(List.of(10, 2, 3, 4, 5, 6));
//
//        System.out.println(grades.get(4));
//        grades.add(4, 11);
//        System.out.println(grades);
//        grades.remove(3);
//        System.out.println(grades);
//
//        System.out.println(grades.indexOf(4));
//        System.out.println(grades.lastIndexOf(6));
//
//        List<Integer> sub = grades.subList(3, 4);
//        System.out.println(sub);
//    }
//
//    private static void tryCollection() {
//        Collection<String> names = new ArrayList<>();
//        names.add("Ana");
//        names.add("MERE");
//        System.out.println(names);
//
//        names.remove("Ana");
//        System.out.println(names);
//        System.out.println(names.size());
//
//        System.out.println(names.contains("MERE"));
//        System.out.println(names.size());
//
//        System.out.println(names.equals(List.of("MERE")));
//        for (String name : names) {
//            System.out.println(name);
//        }
//        names.add("Ionel");
//        Iterator<String> iterator = names.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//    }


    public static void main(String[] args) {
        tryCollection();
        tryArrayList();
        tryHashSet();

    }

    private static void tryHashSet() {
        Set<String> materii = new HashSet<>(List.of("Matematica", "Info",
                "romana", "bio", "fizica"));

        System.out.println("++++++++++++++++++");
        System.out.println(materii);
        materii.stream().sorted();
        System.out.println(materii);


    }

    private static void tryArrayList() {
        List<Integer> grades = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,0));
        // aceeasi functionalitate cu collection

        System.out.println(grades.get(4));
        grades.add(3, 11);
        System.out.println(grades);
        grades.remove(3);
        System.out.println(grades);

        grades.sort(Comparator.comparingInt(o -> o));
        System.out.println(grades);

        System.out.println(grades.indexOf(5));

        List<Integer> list = grades.subList(1, 8);
        System.out.println(list);

//        LinkedList<String> linkedList = new LinkedList<>("Ana", "mere");

    }

    private static void tryCollection() {
        Collection<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Bogdan");
        names.add("Ana");

        System.out.println(names);

        System.out.println(names.size());

        names.remove("Ana");
        System.out.println(names.contains("Bogdan"));
        System.out.println(names.contains("Ana"));
        System.out.println(names.size());
        names.addAll(List.of("Maria", "george", "DAN"));

        System.out.println(names);
        System.out.println(names.isEmpty());


        names.clear();
        System.out.println(names);

        System.out.println(names.isEmpty());

        names.add("Ana");
        names.add("ion");
        System.out.println(names);
        System.out.println(names.equals(List.of("Ana")));

        for (String name : names){
            System.out.println(name);
        }
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }


}
