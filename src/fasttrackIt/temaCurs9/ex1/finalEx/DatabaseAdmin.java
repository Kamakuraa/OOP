package fasttrackIt.temaCurs9.ex1.finalEx;

import java.time.LocalDate;

public class DatabaseAdmin extends Employee{
    public String dbTech;

    public DatabaseAdmin(String dbTech) {
        this.dbTech = dbTech;
    }

    @Override
    public void getSalary(LocalDate dateOfEmployment, String position) {

    }
}
