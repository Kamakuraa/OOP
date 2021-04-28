package udemy.abstractClasses;

public class Parrot extends Bird{
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("fly from branch to branch");
    }
}
