package fasttrackIt.temaCurs13.schedulle;

import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws InvalidActivity {
        DailyPlanner dailyPlanner = new DailyPlanner(List.of(
                new DaySchedule(DaysOfTheWeek.MONDAY, "resolve office task"),
                new DaySchedule(DaysOfTheWeek.TUESDAY, "meeting"),
                new DaySchedule(DaysOfTheWeek.THURSDAY, "resolve home work JAVA"),
                new DaySchedule(DaysOfTheWeek.WEDNESDAY, "resolve office task"),
                new DaySchedule(DaysOfTheWeek.FRIDAY, "resolve office task"),
                new DaySchedule(DaysOfTheWeek.SATURDAY, "rgo to the gym"),
                new DaySchedule(DaysOfTheWeek.SUNDAY, "resolve office task")
        ));
        System.out.println();
    }


}
