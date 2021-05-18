package udemy.staticNested;

import udemy.TheEnum.PizzaSize;

public class PizzaBuilderApp {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder("Pizzacake", PizzaSize.LARGE)
                .withExtraTomatoSauce(true)
                .withSalad(true)
                .build();
        System.out.println("name: " + pizza.getName());
        System.out.println("size: " + pizza.getPizzaSize().getPizzaSizeText());
        System.out.println("Extra tomato " + pizza.isExtraTomatoSauce());
        System.out.println("salad " + pizza.isSalad());
    }
}
