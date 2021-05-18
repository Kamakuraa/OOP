package fasttrackIt.curs12.schedule;

public class ScheduleMain {
    public static void main(String[] args) {
        Schedule schedule = new Schedule(Months.DEC, 10);

        System.out.println(schedule);


        Months month = schedule.getMonth();
        System.out.println("The " + month.getNumber() + " mon in the year");
    }
}
