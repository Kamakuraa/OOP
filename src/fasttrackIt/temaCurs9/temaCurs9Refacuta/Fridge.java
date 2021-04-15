package fasttrackIt.temaCurs9.temaCurs9Refacuta;

public class Fridge extends Electronics {
    private int temperature = 10;

    public int getTemperature() {
        return temperature;

    }

    public Fridge(String name, String type, int length, int width, int height, int weight, int temperaturel) {
        super(name, type, length, width, height, weight);
        this.temperature = temperaturel;
    }

    public Fridge(String name, String type, int length, int width, int height, int weight) {
        super(name, type, length, width, height, weight);
    }

    public Fridge(String name) {
        super(name);
    }

    public Fridge(int price, String name, String description, int quantity) {
        super(price, name, description, quantity);
    }

    @Override
    public void buy(int price, String name) {
        super.buy(price, name);
    }

    public void buy(int price, String name, int quantity) {
        buy(price, name);
        System.out.println("o sa cumpar" + quantity + " la pretul de " + price + name);
    }
}
