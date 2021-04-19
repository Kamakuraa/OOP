package udemy.curs.inheritance;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body,
               int weight, int size, int eyes,
               int legs, int tail, int teeth, String coat) {
        super(name, brain, body, weight, size);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public Dog(String name, int i3, int i2, int i1, int i, int weight, int size, String longg) {
        super(name, 1, 1, weight, size);
    }

    private void chew() {
        System.out.println("Dog chew called");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog woulk called");
        moved(3);
    }

    public void run() {
        System.out.println("dog run");
        moved(12);
    }

    @Override
    public void moved(int speed) {
        System.out.println("dog moved call");
        moveLegs(speed);
        super.moved(speed);

    }

    private void moveLegs(int speed) {
        System.out.println("dog move legs called");
    }
}
