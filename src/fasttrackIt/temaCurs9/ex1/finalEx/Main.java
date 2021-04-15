package fasttrackIt.temaCurs9.ex1.finalEx;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.lastName);
        System.out.println(person.firstName);
        System.out.println(person.address);
        System.out.println(person.birthDay);


        Employee employee = new Employee(LocalDate.of(2000, 10, 23),
                "Team Leader") {
            @Override
            public void getSalary(LocalDate dateOfEmployment, String position) {

            }
        };


        System.out.println(employee.dateOfEmployment);
        System.out.println(employee.position);

        DatabaseAdmin databaseAdmin = new DatabaseAdmin("DataBase");

        System.out.println(databaseAdmin.dbTech);
        System.out.println();

        Programmer programmer = new Programmer("JAVA");

        System.out.println(programmer.language);



        programmer.getSalary(LocalDate.of(2001, 11, 23), "Junior");

        System.out.println();

        NewPerson newPerson = new NewPerson("John Doe", 99 );
        System.out.println(newPerson.years);
        System.out.println(newPerson.fullName);

        programmer.getSalary(LocalDate.of(2001, 11, 23), "Manager");
        programmer.getAddress();
        programmer.getBirthDay();
        programmer.getAddress();







    }
}
