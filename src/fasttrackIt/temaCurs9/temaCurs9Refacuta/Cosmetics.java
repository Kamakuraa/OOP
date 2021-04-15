package fasttrackIt.temaCurs9.temaCurs9Refacuta;

public class Cosmetics extends Product{
    private String color;
    private int weight;

    public String getColor() {
        return "red";
    }

    public int getWeight() {
        return 1;
    }

    public Cosmetics(String name, String color, int weight) {
        super(name);
        this.color = color;
        this.weight = weight;
    }

    public Cosmetics(int price, String name, String description, int quantity, String color, int weight) {
        super(price, name, description, quantity);
        this.color = color;
        this.weight = weight;
    }

    public Cosmetics(String name) {
        super(name);
    }

    public Cosmetics(int price, String name, String description, int quantity) {
        super(price, name, description, quantity);
    }

    @Override
    public void buy(int price, String name) {
        buy(100, "L'oreal");
        System.out.println("o sa cumpar de " + price);
    }

    public void buy(int price, String name, int quantity) {
        buy(price, name);
        System.out.println("o sa cumpar " + quantity + " de " + price);
    }

}
