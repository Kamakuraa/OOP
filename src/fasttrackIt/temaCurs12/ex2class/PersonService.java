package fasttrackIt.temaCurs12.ex2class;


import java.util.*;

public class PersonService {
    private final List<Person> persons = new ArrayList<>();

    public PersonService(Collection<Person> persons) {
        this.persons.addAll(persons);
    }

    public List<Person> getPersons() {
        return persons;
    }

    public List<String> extractPersonNames() {
        List<String> result = new ArrayList<>();
        for (Person person : persons) {
            result.add(person.getName());
        }
        return result;
    }

    public Map<String, Integer> mapNameToAge() {
        Map<String, Integer> result = new HashMap<>();
        for (Person person : persons) {
            result.put(person.getName(), person.getAge());
        }
        return result;
    }

    public Map<Hair, List<String>> mapHairToname() {
        Map<Hair, List<String>> result = new HashMap<>();
        for (Person person : persons) {
            List<String> exList = result.get(person.getHairColor());
            if (exList == null) {
                exList = new ArrayList<>();
                result.put(person.getHairColor(), exList);
            }
            exList.add(person.getName());

        }
        return result;
    }
}
