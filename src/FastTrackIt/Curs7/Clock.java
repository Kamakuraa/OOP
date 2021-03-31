package FastTrackIt.Curs7;

public class Clock {
    // class fields
    public static String TIP = "MANA";
    //state
    private int hour;
    private int minutes;
    //behaviour

    public Clock() {
        this(0, 0);
    }

    public Clock(int hour) {
        this(hour, 0);
    }

    public Clock(int hour, int minutes) {
        setHour(hour);
        setMinutes(minutes);
    }

    String readTime() {
        return printClock(hour) + ":" + printClock(minutes);
    }

    private String printClock(int number) {

//        operator ternar
//        <conditie> ? <DA> : <Nu>
        return number < 10 ? "0" + number : "" + number;
//        if (number <10) {
//            return "0" + number;
//        } else {
//            return "" + number;
//        }
    }

    public void addMinutes(int minutes) {
        if (minutes > 0) {
            int newMinutes = this.minutes + minutes;
            setHour(this.hour + newMinutes / 60);
            this.minutes = newMinutes % 60;
        }
    }

    int getHour() {
        return hour;
    }

    int getMinutes() {
        return minutes;
    }

    void setHour(int hour) {
        if (hour < 0) {
            this.hour = 0;
        } else if (hour > 12) {
            this.hour = 23;
        } else {
            this.hour = hour;
        }
    }

    void setMinutes(int minutes) {
        if (minutes < 0) {
            this.minutes = 0;
        } else if (minutes >= 60) {
            this.minutes = 59;
        } else {
            this.minutes = minutes;
        }
    }
    public static void presemt() {
        System.out.println(TIP);
    }
}
