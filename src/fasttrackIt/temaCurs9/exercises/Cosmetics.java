package fasttrackIt.temaCurs9.exercises;


public class Cosmetics extends Product {
    public String color;
    public int weight;

    public void buy(int price, String name, int quantity) {
        buy(price, name);
        System.out.println("o sa cumpar " + quantity + " de " + price);
    }

    public Cosmetics() {
        super("ruj");
    }

    public Cosmetics(String color, int weight) {
        this.color = "red";
        this.weight = weight;
    }


}
