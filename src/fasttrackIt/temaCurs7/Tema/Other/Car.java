package fasttrackIt.temaCurs7.Tema.Other;

public class Car extends Vehicle{
    private boolean power = false;
    private boolean ledScreen = true;

    public Car(boolean power, boolean ledScreen) {
        this.power = power;
        this.ledScreen = ledScreen;
    }

    public Car(String name, String color, String model, String company, String engine, boolean power, boolean ledScreen) {
        super(name, color, model, company, engine);
        this.power = power;
        this.ledScreen = ledScreen;
    }
    public String getName(){
        return "name of tour vehicle is " + super.getName();
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public void setLedScreen(boolean ledScreen) {
        this.ledScreen = ledScreen;
    }

    public boolean isPower() {
        return this.power;
    }

    public boolean getLedScreen() {
        return this.ledScreen;
    }

}
