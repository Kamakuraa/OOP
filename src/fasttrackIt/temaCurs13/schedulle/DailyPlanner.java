package fasttrackIt.temaCurs13.schedulle;


import java.nio.charset.StandardCharsets;
import java.util.*;

public class DailyPlanner {
    private final List<DaySchedule> objects = new ArrayList<>();

    public DailyPlanner(Collection<DaySchedule> objects) {
        this.objects.addAll(objects);
    }

    public List<DaySchedule> getObjects() {
        return objects;
    }
// nu imi dau seama cu sa fac metoda addActivity :(


//    public DaySchedule addActivity(DaysOfTheWeek days, String obj) {
//        for (DaySchedule daySchedule : objects){
//
//            }
//        }
//    }

}
