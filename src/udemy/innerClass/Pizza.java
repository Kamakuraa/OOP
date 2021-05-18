package udemy.innerClass;

import udemy.TheEnum.PizzaSize;

public class Pizza {

        private String name;
        private PizzaSize pizzaSize;
        private double price;

        public Pizza(String name, PizzaSize pizzaSize) {
            this.name = name;
            this.pizzaSize = pizzaSize;
            this.price = calculatedPrice();
        }

    public String getName() {
        return name;
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
    public PizzaSlice cutPizzaSlice(){
        return new PizzaSlice();
    }
    class PizzaSlice{
            public String calculatePizzaSliceArea(){
                switch (pizzaSize){
                    case SMALL:
                    default:
                        return "Small slice";
                    case MEDIUM:
                        return "Medium slice";
                    case LARGE:
                        return "Large slice";

                }
        }







        public PizzaSize getPizzaSize() {
            return pizzaSize;
        }

        public double getPrice() {
            return price;
        }


    }}
