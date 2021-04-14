package fasttrackIt.temaCurs9.ex1.finalEx;


import java.time.LocalDate;

public class NewPerson extends Person{
    public String fullName;
    public int age;

    public NewPerson(String fullName, int age) {
        this.fullName = lastName + " " + firstName;
        this.age = age;
    }

    public NewPerson(String lastName, String firstName, LocalDate birthDay, String address, LocalDate today, int years, String fullName, int age) {
        super(lastName, firstName, birthDay, address, today, years);
        this.fullName = fullName;
        this.age = age;
    }
}
