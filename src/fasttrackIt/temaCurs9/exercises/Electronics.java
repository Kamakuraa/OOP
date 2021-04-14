package fasttrackIt.temaCurs9.exercises;

public class Electronics extends Product{
    public String type;
    public int length, width, height, weight;

    public Electronics() {
        this("TV");
    }

    public Electronics(String name) {
        super(name);
    }

    public Electronics(int price, String name, String description, int quantity, String type, int length, int width, int height, int weight) {
        super(price, name, description, quantity);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }



}
