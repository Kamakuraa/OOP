package FastTrackIt.Curs8.Interface;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void travel(int distance) {
        System.out.println("Walking like " + name + " dog" + distance + "meters");
    }

    @Override
    public void eat(String food) {
        System.out.println("Dog eating "  + name + food);
    }

    @Override
    public String getType() {
        return "Omnivorous";
    }
    public String bark(){
        return "Ham-ham";
    }
}
