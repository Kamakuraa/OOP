package fasttrackIt.temaCurs9.temaCurs9Refacuta;

public abstract class Product {
    private int price;
    private String name;
    private String description;
    private int quantity;

    public int getPrice(int i) {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return "Cele mai ieftine";
    }

    public int getQuantity() {
        return quantity + 1;
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(int price, String name, String description, int quantity) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public Product() {

    }

    public  void buy(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public abstract void buy(int price, String name, int quantity);



}