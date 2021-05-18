package udemy.collectioArrayList.LinkedList;

import java.util.LinkedList;

public class LinkMain {
    public static void main(String[] args) {

        LinkedList<String> morningRoutine = new LinkedList<>();



        if (!morningRoutine.isEmpty()) {
            System.out.println("The first element of the list: " + morningRoutine.getFirst());
        }

        if (!morningRoutine.isEmpty() && morningRoutine.peekFirst() != null) {
            System.out.println("The peak element of the list: " + morningRoutine.peekFirst());
        }
//        morningRoutine.add("brushing my teeth");
//        morningRoutine.add("Taking the dog for a walk");
//        morningRoutine.add("Doing 32 push-up");

        morningRoutine.add("brushing my teeth");
        morningRoutine.addFirst("Taking the dog for a walk");
        morningRoutine.push("Doing 32 push-up");
        System.out.println(morningRoutine);
        morningRoutine.offer("reading 1 cheapter of a book");
        morningRoutine.pop();

        System.out.println(morningRoutine+"_________");
    }
}
