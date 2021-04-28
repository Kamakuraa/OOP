package fasttrackIt.temaCurs10.exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Basket {
    private final List<String> fruits = new ArrayList<>(List.of("orange"));



    public List<String> getFruits() {
        return fruits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(fruits, basket.fruits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fruits);
    }
// finds if received fruit is in the list and returns true/false
    public boolean first(String fruit) {
        for (String myFruit : fruits) {
            if (fruit.equals(myFruit)) {
                return true;
            }
        }
        return false;
    }

//    removes the received string returns true/false if found

    public void remove(int position) {
        String theItem = fruits.get(position);
        fruits.remove(position);
    }

// returns the position on which the received fruit is in the bask

    public String position(String searchItem) {
        int positon = fruits.indexOf(searchItem);
        if (positon >= 0) {
            return fruits.get(positon);
        }
        return null;
    }

//    returns an unique collection containing all fruits once
    public void distinct() {
        HashSet<String> unique = new HashSet<>(fruits);
        System.out.println("ArrayList unique value");
        for (String num : unique)
            System.out.println(num);
    }

//    adds a fruit to the basket

    public void addFruits(String item) {
        fruits.add(item);
    }
//    count the fruits

// count the fruits without using size method (use a loop control statement + counter)
    public int customCount(int countFruits) {
        for (int i = 1; i < fruits.size(); i++) {
            System.out.println("count is " + i);
        }
        return countFruits++;
    }

}

