package fasttrackIt.curs12.schedule;

public class Schedule {
    private final Months month;
    private final int day;

    public Schedule(Months month, int day) {
        this.month = month;
        this.day = day;
    }

    public Months getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return day + " of " + month;
    }
}
