package fasttrackIt.temaCurs10.newExercise1;

import java.util.*;


public class Basket {
    private final List<String> fruits;

    public Basket() {
        this(new ArrayList<>());
    }

    public Basket(Collection<String> fruits) {
        this.fruits = new ArrayList<>();
        this.fruits.addAll(fruits);

    }

    public boolean find(String fruit) {
//        return fruit.contains(fruit);

        for (String myFruit : fruits) {
            if (myFruit.equals(fruit)) {
                return true;
            }
        }
        return false;
    }

    public boolean remove(String fruit) {
//        return fruits.remove(fruit);
        Iterator<String> iterator = fruits.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            String myFruit = iterator.next();
            if (myFruit.equals(fruit)) {
                iterator.remove();
                removed = true;
            }
        }
        return removed;
    }

    public int getPosition(String fruit) {
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals(fruit)) {
                return i;
            }
        }
        return -1;
//        return fruits.indexOf(fruit);
    }

//    public String position(String searchItem) {
//        int positon = fruits.indexOf(searchItem);
//        if (positon >= 0) {
//            return fruits.get(positon);
//        }
//        return null;
//    }

    public List<Integer> getPositions(String fruit) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals(fruit)) {
                result.add(i);
            }
        }
        return result;
    }

    public Collection<String> dist() {
        return new HashSet<>(fruits);
    }

    public Collection<String> disti() {
        List<String> result = new ArrayList<>(fruits);
        for (String myFruits : result) {
            if (result.contains(myFruits)) {

            } else {
                result.add(myFruits);
            }
        }
        return result;
    }


    public void add(String fruir) {
        this.fruits.add(fruir);
    }

    public void count() {
//        return fruits.size();
        int count = 0;
        Iterator<String> iterator = this.fruits.iterator();
        while (iterator.hasNext()) {
            count++;
            iterator.next();
        }

    }
}
