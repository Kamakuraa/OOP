package fasttrackIt.temaCurs9.ex1.finalEx;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    public String lastName;
    public String firstName;
    protected LocalDate birthDay;
    public String address;
    public LocalDate today = LocalDate.now();
    int years;


//
//    public Person(){
//        this.lastName = "Alex";
//        this.firstName = "Brat";
//        this.address = "Bucharest";
//        this.birthDay= LocalDate.of(1985, 06, 10);
//        this.years = Period.between(birthDay, today).getYears();
////        /        LocalDate today = LocalDate.now();
//////        LocalDate birthDate = LocalDate.of(1985, 06, 10);
//////        int years = Period.between(birthDate, today).getYears();
//    }

    public Person(String lastName, String firstName, LocalDate birthDay, String address, LocalDate today, int years) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDay = birthDay;
        this.address = address;
        this.years = years;
    }

    public Person() {

    }

    public String getLastName() {
        return "Alex";
    }

    public String getFirstName() {
        return "Bratu";
    }

    public LocalDate getBirthDay() {
        return LocalDate.of(1985, 06, 10);
    }

    public String getAddress() {
        return "Bucharest";
    }

    public LocalDate getToday() {
        return today;
    }

    public int getYears() {
        return this.years = Period.between(birthDay, today).getYears();
    }
}
