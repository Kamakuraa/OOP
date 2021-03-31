package FastTrackIt.TemaCurs8.Tema1.Tema4;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Dog("Zorel");

        animal.eat("Peedigree");
        animal.walk(350);
        animal.talk("Ham ham");

        System.out.println("#########################");

        Animal animal1 = new Cat("Tom");

        animal1.eat("KittyKat");
        animal1.talk("miau, miau");
        animal1.walk(200);

        System.out.println("############################");

        Animal animal2 = new Mouse("Jerry");
        animal2.eat("Cheese");
        animal2.talk("chit, chit");
        animal2.walk(15);

        System.out.println("############################");

        Animal animal3 = new Duck("Donald");
        animal3.walk(22);
        animal3.eat("nuts ");
        animal3.talk("Mac, mac");

        System.out.println("############################");

        Animal animal4 = new Chiken("Asi");
        animal4.talk("piu, piu");
        animal4.walk(10);
        animal4.eat("nuts");


    }
}
