package fasttrackIt.temaCurs9.ex1.finalEx;

import java.time.LocalDate;

public class Programmer extends Employee {
    public String language;


    public Programmer(String language) {
        this.language = language;
    }

    public Programmer(LocalDate dateOfEmployment, String position, String language) {
        super(dateOfEmployment, position);
        this.language = language;
    }

    public Programmer(String lastName, String firstName, LocalDate birthDay, String address, LocalDate today, int years, LocalDate dateOfEmployment, String position, String language) {
        super(lastName, firstName, birthDay, address, today, years, dateOfEmployment, position);
        this.language = language;
    }

    @Override
    public void getSalary(LocalDate dateOfEmployment, String position) {
        System.out.println("Salariu confidential");
    }
}
