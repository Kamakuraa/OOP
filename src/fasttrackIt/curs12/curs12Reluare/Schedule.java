package fasttrackIt.curs12.curs12Reluare;

import fasttrackIt.temaCurs8.Tema.Tema3.ING;

public class Schedule {
    private final Month month;
    private final int day;

    public Schedule(int day, Month month) {
        this.month = month;
        this.day = day;
    }

    public Month getMonth() {
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
