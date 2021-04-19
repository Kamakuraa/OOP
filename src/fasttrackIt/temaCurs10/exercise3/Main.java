package fasttrackIt.temaCurs10.exercise3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);
        System.out.println(person.getPersonOlder(25));


        System.out.println(person.getPerson("Mark"));

        person.employ("Alex");

        System.out.println(person.getName());
        System.out.println(person.getAge());

        System.out.println(person.getPosition());


    }
}
