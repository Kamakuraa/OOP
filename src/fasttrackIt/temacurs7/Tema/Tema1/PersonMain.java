package fasttrackIt.temacurs7.Tema.Tema1;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Oana", 20, false);
        System.out.println(person.getAge());
        System.out.println(person.isMarried());
        System.out.println(person.getName());

        Person person1 = new Person("Cristina", 15, false);
        System.out.println(person1.getAge());
        System.out.println(person1.isMarried());
        System.out.println(person1.getName());

        Person person2 = new Person("Elena", 44, true);
        System.out.println(person2.getAge());
        System.out.println(person2.isMarried());
        System.out.println(person2.getName());
    }
}
