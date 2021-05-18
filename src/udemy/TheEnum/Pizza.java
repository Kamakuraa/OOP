package udemy.TheEnum;

public class Pizza {
    private String name;
    private PizzaSize pizzaSize;
    private double price;

    public Pizza(String name, PizzaSize pizzaSize) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.price = calculatedPrice();
    }

    private double calculatedPrice() {
        switch (pizzaSize){
            case SMALL:
            default:
                return 5.00;
            case MEDIUM:
                return 7.99;
            case LARGE:
                return 10.99;

        }
    }

    public String getName() {
        return name;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public double getPrice() {
        return price;
    }
}
