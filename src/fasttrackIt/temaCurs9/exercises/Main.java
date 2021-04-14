package fasttrackIt.temaCurs9.exercises;

public class Main {
    public static void main(String[] args) {
        Cosmetics cosmetics = new Cosmetics("red", 1);
        Cosmetics cosmetics1 = new Cosmetics();
        Product product = new Product(190, "TV", "Best imagine", 10);

        Electronics electronics = new Electronics();
        Product electronics1 = new Electronics();
        Fridge fridge = new Fridge("Bosch");




        System.out.println("++++++++cosmietics++++++++");
        System.out.println(cosmetics.color);
        System.out.println(cosmetics.weight);
        System.out.println(cosmetics1.name);

        System.out.println("++++++++++cosmetics buy+++++++++++++");

        cosmetics.buy(33, "Avon", 1);
        System.out.println(cosmetics.price);

        System.out.println("+++++++++product+++++++++++");

        System.out.println(product.price);
        product.buy(120,"watch" );
        System.out.println(product.name);

        System.out.println("++++++++++++++electronics++++++++++");
        electronics.buy(250, "Samsung");
        System.out.println(electronics.price);
        System.out.println(electronics.name);

        System.out.println(electronics.height);

        electronics1.buy(500, "Laptop");
        System.out.println(electronics1.name);

        System.out.println("+++++++++Fridge+++++++++++");

        fridge.buy(12, "Bosch");
        System.out.println("like a " + fridge.name);

    }
}
