package fasttrackIt.temaCurs13.schedulle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DaySchedule {
    private final DaysOfTheWeek days;
    private final List<String> activities = new ArrayList<>();

    public DaySchedule(DaysOfTheWeek days, String s) {
        this.days = days;
    }

    public DaysOfTheWeek getDays() {
        return days;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void addAct(String item) {
        activities.add(item);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DaySchedule that = (DaySchedule) o;
        return days == that.days && Objects.equals(activities, that.activities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(days, activities);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "days=" + days +
                ", activities=" + activities +
                '}';
    }
}
