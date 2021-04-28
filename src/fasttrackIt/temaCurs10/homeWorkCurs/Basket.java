package fasttrackIt.temaCurs10.homeWorkCurs;

import java.net.CookieHandler;
import java.nio.charset.StandardCharsets;
import java.sql.DataTruncation;
import java.util.*;

import static java.util.Collections.emptyList;

public class Basket {
public final List<String> fruits;

    public Basket() {
        this(new ArrayList<>());
    }

    public Basket(Collection<String> fruits){
        this.fruits = new ArrayList<>();
        this.fruits.addAll(fruits);
    }
    public boolean find(String fruit){
        for (String myFruit : fruits)
        if (fruit.equals(myFruit)){
            return true;
        }
        return false;
    }

    public boolean remove(String fruit) {
//        return fruits.remove(fruit);
        Iterator<String> iterator = fruits.iterator();
        boolean removed = false;
        while (iterator.hasNext()){
            String myFruit = iterator.next();
            if (myFruit.equals(fruit)){
                iterator.remove();
                removed = true;

            }
        }
        return removed;
    }

    public int getPosition(String fruit){
        for (int i=0; i<fruits.size(); i++){
            if (fruits.get(i).equals(fruit)){
                return i;
            }
        }
        return -1;
    }


    public List<Integer> getPsosition(String fruit){
        List<Integer> result = new ArrayList<>();
        for (int i =0;i<fruits.size();i++ ){
            if (fruits.get(i).equals(fruit)){
                result.add(i);
            }
        }
        return result;
    }

    public Collection<String> dist(){
        return new HashSet<>(fruits);
    }

    public Collection<String> dist2(){
        List<String> result = new ArrayList<>();
        for (String myFruit : fruits){
            if (!result.contains(myFruit)){
                result.add(myFruit);
            }
        }
            return result;
    }

    public void add(String fruit){
        this.fruits.add(fruit);
    }

    public int count(){
        return fruits.size();
    }



}