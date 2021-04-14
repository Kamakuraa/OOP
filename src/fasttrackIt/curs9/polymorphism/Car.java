package fasttrackIt.curs9.polymorphism;

public class Car {
    private int speed;
    private int gear;

    public Car() {
        this.speed = 0;
        this.gear = 0;
    }

    public void drive(int speed, int gear) {
        setSpeed(speed);
        setGear(gear);
        System.out.println("driving with speed " + speed + " in gear " + gear);

    }

    protected void setGear(int gear) {
        this.speed = speed;
    }

    protected void setSpeed(int speed) {
        this.gear = gear;
    }
}
