package fasttrackIt.curs9.overloading;

public class Dacia extends Car{
    public void drive(String destination, int speed, int kwh){
        drive(destination, speed);
        System.out.println("kwh cons " + kwh);
    }
}
