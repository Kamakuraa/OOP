package FastTrackIt.TemaCurs7.Tema1.Tema1;

public class Product {
    public static String PRODUS = "TV";

    private String name;
    private int price;
    private int quantity;
    private String category;

    public Product(String name, int price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    boolean hasStock() {
        if (quantity > 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isCategory(String category) {
        if (category == category) {
            return false;
        } else {
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public static void newProduct() {
        System.out.println(PRODUS);
    }

}
