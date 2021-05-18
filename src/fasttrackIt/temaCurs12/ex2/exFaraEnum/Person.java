package fasttrackIt.temaCurs12.ex2.exFaraEnum;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    private final String hairColor;

    public Person(String name, int age, String hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHairColor() {
        return hairColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(hairColor, person.hairColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hairColor);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
