package fasttrackIt.curs10.homeWork;

import java.time.LocalDate;

public class dataBase extends Employee {
    private final String dbTechnology;
    private long salary;


    public dataBase(String firstName, String lastName,
                    LocalDate birthDay, String address, String position,
                    LocalDate dateOfEmployment, long salary, String dbTechnology) {
        super(firstName, lastName, birthDay, address, position, dateOfEmployment);
        this.salary = salary;
        this.dbTechnology = dbTechnology;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public long getSalary() {
        return Math.round(salary * 1.3);
    }

    public String getDbTechnology() {
        return dbTechnology;
    }
}
