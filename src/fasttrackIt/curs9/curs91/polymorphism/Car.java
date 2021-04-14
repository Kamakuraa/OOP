package fasttrackIt.curs9.curs91.polymorphism;

public abstract class Car {
    protected int speed;
    protected int gear;

    public Car() {
        this.gear = 0;
        this.speed = 0;
    }
    public abstract void drive(int speed, int gear);

//    public void drive(int speed, int gear) {
//        setSpeed(speed);
//        setGear(gear);
//        System.out.println("Driving with speed " + speed + " in gear " + gear);
//    }

    protected void setGear(int speed) {
        this.speed = speed;
    }

    protected void setSpeed(int gear) {
        this.gear = gear;
    }
}
