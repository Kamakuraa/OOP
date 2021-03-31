package FastTrackIt.TemaCurs8.Tema1.Tema4;

public class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void walk(int distance) {
        System.out.println(name + " walking like a cat " + distance + " m");
    }

    @Override
    public void talk(String makeNoise) {
        System.out.println(name + " talking like a cat " + makeNoise);
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " eating like a cat " + food);
    }
}
