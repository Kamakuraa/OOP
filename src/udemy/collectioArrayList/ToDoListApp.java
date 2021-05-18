package udemy.collectioArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ToDoListApp {
    public static void main(String[] args) {
        ArrayList<String> urgentList = new ArrayList<>();

        ArrayList<String> allTask = new ArrayList<>();


        urgentList.add("Repairing the car");

        urgentList.add("Paying the checks");

        allTask.add("Cleaning the bathroom");
        allTask.add("Mowinf the lawn");
        allTask.add("Going to the grocery store");
        Collections.swap(urgentList, 0, 1);
//        urgentList.clear();
        if (!urgentList.isEmpty()) {
            System.out.println("Urgent tasks:");
            for (String task : urgentList) {
                System.out.println("- " + task);
            }
        }

        allTask.addAll(urgentList);
        Collections.sort(allTask, Collections.reverseOrder());

        System.out.println("All tasks:");
        for (String task : allTask) {
            System.out.println("- " + task);
        }

        System.out.println("+++++++++++++++");

        if (allTask.contains("Cleaning the bathroom")){
            System.out.println("I havent the cleaning the bathroom");
        }
    }
}
