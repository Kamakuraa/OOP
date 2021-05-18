package fasttrackIt.curs12.curs12Reluare;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TryMap {
    public static void main(String[] args) {
        Map<String, Integer> nameToAge = new HashMap<>();

        nameToAge.put("Ana", 22);
        nameToAge.put("Marian", 23);
        nameToAge.put("Cristi", 55);
        nameToAge.put("Vasii", 44);
        nameToAge.put("Geo", 43);

        System.out.println(nameToAge);

        System.out.println(nameToAge.get("Marian"));
        nameToAge.remove("Geo");

        System.out.println(nameToAge);

        System.out.println(nameToAge.containsKey("Marian"));
        System.out.println(nameToAge.containsKey("Geo"));

        System.out.println(nameToAge.keySet());
        System.out.println(nameToAge.values());
        Set<Map.Entry<String, Integer>> entries = nameToAge.entrySet();
        System.out.println(entries);

        for (String name : nameToAge.keySet()){
            System.out.println(name + " are varstya " + nameToAge.get(name));

        }

        for (Map.Entry<String, Integer> entry : nameToAge.entrySet()){
            System.out.println(entry.getKey()+ " are varsta " + entry.getValue());
        }

    }
}
