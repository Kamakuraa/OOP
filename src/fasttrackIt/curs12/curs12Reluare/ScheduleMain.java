package fasttrackIt.curs12.curs12Reluare;

public class ScheduleMain {
    public static void main(String[] args) {
        Schedule schedule = new Schedule(10, Month.APR);
        System.out.println(schedule);

        Month month = schedule.getMonth();
        System.out.println("The " + month.getNumber() + " month in the year" );
    }
}
