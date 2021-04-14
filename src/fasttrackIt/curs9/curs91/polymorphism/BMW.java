package fasttrackIt.curs9.curs91.polymorphism;

import java.security.interfaces.RSAMultiPrimePrivateCrtKey;

public class BMW extends Car{
    @Override
    public void drive(int speed, int gear) {
        setGear(gear + 1);
        setSpeed(speed - 10);
        System.out.println("Driving cu mana peste geam " + speed + " in gear " + this.gear);
    }
}
