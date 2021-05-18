package fasttrackIt.curs13.exceptions.exercises.birth;

import java.time.LocalDateTime;

public class BirthYearCalculated {
    public int calculatedYear(int age)throws InvalidAge{
        if (age<0||age>200){
            throw new InvalidAge(age);
        }
        return LocalDateTime.now().getYear() - age;
    }
}
