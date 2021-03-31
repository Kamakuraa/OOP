package FastTrackIt.Curs8.Interface;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog("Azorel");
        animal.eat(" carne ");
        animal = new Cat();
        animal.eat("carne");
        plimba(new Dog("Bobyta"));
        plimba(new Cat());

    }

    private static void plimba(Animal pet) {
        pet.travel(100);
    }
}
