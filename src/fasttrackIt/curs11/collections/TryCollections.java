package fasttrackIt.curs11.collections;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class TryCollections {
//    public static void main(String[] args) {
//        tryQueue();
//        tryStack();
//        tryDeque();
//    }
//
//    private static void tryDeque() {
//        System.out.println(" tryDeque(); tryDeque(); tryDeque(); tryDeque(); tryDeque(); tryDeque();");
//        Deque<String> names = new ArrayDeque<>();
//        names.addLast("Ana");
//        names.addFirst("Luca");
//        names.add("George");
//        names.add("Maria");
//        names.add("Ion");
//
//        System.out.println(names);
//        names.removeFirst();
//        System.out.println(names);
//    }
//
//    private static void tryStack() {
//        System.out.println("tryStack()tryStack()tryStack()tryStack()tryStack()");
//        Stack<String> names = new Stack<>();
//        names.push("Ana");
//        names.push("Luca");
//        names.push("George");
//        names.push("Maria");
//        names.push("Ion");
//
//        System.out.println(names.pop());
//        System.out.println(names.pop());
//        System.out.println(names.pop());
//        while (!names.empty()){
//            System.out.println(names.pop());
//        }
//    }
//
//    private static void tryQueue() {
//        Queue<String> names = new ArrayBlockingQueue<>(10);
//        names.add("Ana");
//        names.add("Luca");
//        names.add("George");
//        names.add("Maria");
//        names.add("Ion");
//
//        System.out.println(names.poll());
//        System.out.println(names.remove());
//        System.out.println(names.remove());
//
//    }

    public static void main(String[] args) {
        tryQueue();
        tryStack();
        tryDeque();
    }

    private static void tryDeque() {
        Deque<String> names = new ArrayDeque<>();
        System.out.println("tryDequetryDequetryDequetryDequetryDequetryDeque");
        names.addFirst("ana");
        names.addLast("dan");
        names.addLast("sandu");
        names.addFirst("darius");
        System.out.println(names);
    }

    private static void tryStack() {
        Stack<String> names = new  Stack<>();
        names.add("ana");
        names.add("dan");
        names.add("sandu");
        names.add("darius");
        System.out.println("tryStacktryStacktryStacktryStacktryStacktryStack");
        System.out.println(names.pop());
        System.out.println(names.pop());
        System.out.println(names.pop());
        System.out.println(names.push("Cora"));
    }

    private static void tryQueue() {
        Queue<String> names = new ArrayBlockingQueue<>(10);
        names.add("ana");
        names.add("dan");
        names.add("sandu");
        names.add("darius");


        String fromQueue = names.remove();
        System.out.println(fromQueue);
        System.out.println(names);
        System.out.println(names.remove());
        System.out.println(names.remove());
        System.out.println(names.remove());


    }
}
