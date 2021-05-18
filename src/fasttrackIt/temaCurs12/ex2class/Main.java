package fasttrackIt.temaCurs12.ex2class;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService(List.of(
                new Person("Alex", 35, Hair.BLACK),
                new Person("George", 23, Hair.BROWN),
                new Person("Oana", 22, Hair.RED),
                new Person("Vasile", 22, Hair.BLONDE)
        ));

        System.out.println(personService.extractPersonNames());
        System.out.println(personService.mapNameToAge());
        System.out.println(personService.mapHairToname());
    }
}
