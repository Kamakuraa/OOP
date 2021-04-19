package udemy.curs.composition;

public class Car extends Vehicle{
    private int doors;
    private int engineCap;

    public Car(String name, int doors, int engineCap) {
        super(name);
        this.doors = doors;
        this.engineCap = engineCap;
    }
}
