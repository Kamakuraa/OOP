package fasttrackIt.temaCurs9.ex1.finalEx;

import java.time.LocalDate;
import java.util.Date;

public abstract class Employee extends Person{
    public LocalDate dateOfEmployment;
    public String position;



    public Employee(LocalDate dateOfEmployment, String position) {
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
    }

    public Employee(String lastName, String firstName, LocalDate birthDay, String address, LocalDate today, int years, LocalDate dateOfEmployment, String position) {
        super(lastName, firstName, birthDay, address, today, years);
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
    }

    protected Employee() {
    }

    public abstract void getSalary(LocalDate dateOfEmployment, String position);
}
