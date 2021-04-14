package fasttrackIt.curs9.polymorphism;

public class Dacia extends Car {
    @Override
    public void drive(int speed, int gear) {
        super.drive(speed, gear);
        System.out.println("driving in Dacia "+ speed + " in gear" + gear);

    }
}
