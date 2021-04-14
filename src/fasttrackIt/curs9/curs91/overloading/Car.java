package fasttrackIt.curs9.curs91.overloading;

public class Car {
    private int speed;
    private String destination;

    public Car() {
        this("garaj");
    }

    public Car(String destination) {
        this(0, destination);
    }

    public Car(int speed, String destination) {
        this.speed = speed;
        this.destination = destination;
    }

    public void drive(){
        drive("Oradea", 100);
    }

    public void drive(String destination, int speed) {
        this.destination = destination;
        this.speed = speed;
    }
}

