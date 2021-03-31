package FastTrackIt.TemaCurs8.Tema1.Tema4;

public class Duck implements Animal{
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void walk(int distance) {
        System.out.println(name + " walking like a duck " + distance + " m");
    }

    @Override
    public void talk(String makeNoise) {
        System.out.println(name + " talking like a duck " + makeNoise);
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " eating like a duck " + food);
    }

}
