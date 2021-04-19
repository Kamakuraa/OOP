package fasttrackIt.temaCurs9.temaCurs9Refacuta;

public class Electronics extends Product{
    private String type;
    private int length, width, height, weight;

    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public Electronics(String name, String type, int length, int width, int height, int weight) {
        super(name);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public Electronics(String name) {
        super(name);
    }

    public Electronics(int price, String name, String description, int quantity) {
        super(price, name, description, quantity);
    }

    public Electronics() {
        super();
    }

    @Override
    public void buy(int price, String name, int quantity) {
        buy(1000, "Samsung", 1);
    }
}