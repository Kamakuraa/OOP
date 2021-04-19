package fasttrackIt.temaCurs10.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private final List<String> name = new ArrayList<>(List.of(
            "John",
            "Jimmy",
            "Mark",
            "Mike"));

    private final List<Integer> age = new ArrayList<>(List.of(22, 55, 34, 12));

    private final List<String> position = new ArrayList<>(List.of(
            "manager",
            "welders",
            "carpenters",
            "plummers"));

    public List<String> getName() {
        return name;
    }

    public List<Integer> getAge() {
        return age;
    }

    public List<String> getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && age.equals(person.age) && position.equals(person.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, position);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                ", position=" + position +
                '}';
    }

    public boolean getManager() {
        return position.contains("manger");
    }

    public void getPerson() {

    }

    public boolean getPersonOlder(int ages) {
        for (int myAge : age) {
            if (myAge >= ages) {
                return true;
            }
        }
        return false;
    }

    public List<String> getPerson(String filterName) {
        for (String myName : name) {
            if (myName.equals(filterName)) {
                return name;
            }
        }
        return null;
    }

    public void employ(String newHire) {
        name.add(newHire);

    }
}
