package udemy.curs.inheritance;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int weight, int size, int gills, int eyes, int fins) {

        super(name, 1, 1, weight, size);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest(){

    }

    private void moveMuscle(){

    }
    private void moveBackFin(){

    }
    private void swim(int speed){
        moveMuscle();
        moveBackFin();
        super.moved(speed);
    }
}
