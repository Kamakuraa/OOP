package fasttrackIt.javaFullStackIt.curs1;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    private final String address;


    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static Person me() {
        return new Person("Alex", -1, "Bucharest");
    }

    static class PersonBuilder {
        private String name;
        private int age;

        public static PersonBuilder person() {
            return new PersonBuilder();
        }

        public PersonBuilder name (String name) {
            this.name = name;
            return this;
        }
        public PersonBuilder age(int age){
            this.age=age;
            return this;
        }
        public Person build(){
            return new Person(name, age, "Bucharest");
        }
    }
}
