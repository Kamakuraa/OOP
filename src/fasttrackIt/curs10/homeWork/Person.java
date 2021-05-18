package fasttrackIt.curs10.homeWork;


import java.time.LocalDate;

public interface Person {
    String getFirstName();

    String getLastName();

    LocalDate getBirthday();

    String getAddress();

    boolean getAge();
}
