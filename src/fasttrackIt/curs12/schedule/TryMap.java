package fasttrackIt.curs12.schedule;

import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TryMap {
    public static void main(String[] args) {
        Map<String, Integer> nameToAge = new HashMap<>();

        nameToAge.put("Ana", 22);
        nameToAge.put("Ion", 33);
        nameToAge.put("Maria", 44);
        nameToAge.put("Alex", 55);

        System.out.println(nameToAge);

        System.out.println(nameToAge.get("Maria"));
        nameToAge.remove("Alex");

        System.out.println(nameToAge);
        System.out.println(nameToAge.containsKey("Alex"));
        System.out.println(nameToAge.containsKey("Ion"));
        System.out.println(nameToAge.keySet());
        System.out.println(nameToAge.values());
        Set<Map.Entry<String,Integer>> entries = nameToAge.entrySet();
        System.out.println(entries);

        for (String name : nameToAge.keySet()) {
            System.out.println(name + " are varsta " + nameToAge.get(name));
        }

        for (Map.Entry<String,Integer> entry : nameToAge.entrySet()){
            System.out.println(entry.getKey() + " are varsta " + entry.getValue());
        }
    }


}
