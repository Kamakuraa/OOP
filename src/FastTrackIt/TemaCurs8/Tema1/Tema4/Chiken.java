package FastTrackIt.TemaCurs8.Tema1.Tema4;

public class Chiken implements Animal{
    private String name;

    public Chiken(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void walk(int distance) {
        System.out.println(name + " walking like a Chicken " + distance + " m");
    }

    @Override
    public void talk(String makeNoise) {
        System.out.println(name + " talking like a Chicken " + makeNoise);
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " eating like a Chicken " + food);
    }

}
