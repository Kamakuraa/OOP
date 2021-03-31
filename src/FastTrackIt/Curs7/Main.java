package FastTrackIt.Curs7;

import FastTrackIt.Curs7.Clock;

public class Main {
    public static void main(String[] args) {
        Clock myClock = new Clock(18,54);
        System.out.println(myClock.readTime());
        System.out.println(myClock.getHour());
        System.out.println(myClock.getHour() + 1);
        System.out.println(myClock.getMinutes());

        Clock secondClock = new Clock(10);
        System.out.println(secondClock.readTime());

        secondClock.setMinutes(99);
        secondClock.setHour(32);
        System.out.println(secondClock.readTime());
        Clock brokenClock = new Clock(99,99);
        System.out.println(brokenClock.readTime());
        brokenClock.setMinutes(-9);
        System.out.println(brokenClock.readTime());

        Clock clock = new Clock(10);
        clock.addMinutes(100);
        System.out.println(clock.readTime());
        clock.addMinutes(60);
        System.out.println(clock.readTime());
        clock.addMinutes(-60);
        System.out.println(clock.readTime());
        clock.addMinutes(55);
        System.out.println(clock.readTime());
        brokenClock.addMinutes(1234567);
        System.out.println(brokenClock.readTime());
        brokenClock.TIP = "Buzunar"; // asa nu
        System.out.println(secondClock.TIP); // asa nu
        System.out.println(Clock.TIP); // asa da


    }
}
