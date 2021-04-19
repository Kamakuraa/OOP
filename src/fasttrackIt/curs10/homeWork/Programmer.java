package fasttrackIt.curs10.homeWork;

import java.time.LocalDate;

public class Programmer extends Employee{
    private long salary;
    private String language;

    public Programmer(String firstName,
                      String lastName,
                      LocalDate birthDay,
                      String address,
                      long salary,
                      String language) {
        this(firstName, lastName, birthDay, address, salary, LocalDate.now(), language);

    }
    public Programmer(String firstName,
                      String lastName,
                      LocalDate birthDay,
                      String address,
                      long salary,
                      LocalDate employmentDate,
                      String language){
        super(firstName,
                lastName,
                birthDay,
                address,
                "PROGRAMMER",
                employmentDate);
        this.salary = salary;
        this.language = language;
    }
//    new Programmer("Ana", "Mere",
//                LocalDate.of(1982, 5, 2),
//                "Orsova", 4000, "Java");

    @Override
    public long getSalary() {
        return Math.round(salary * 1.3);
    }
public void setSalary(long salary){
        this.salary = salary;
}

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}