package fasttrackIt.temaCurs10.newExercise1;

import java.util.List;

public class BasketMain {
    public static void main(String[] args) {
        Basket basket = new Basket(List.of(
                "mar",
                "para",
                "struguri",
                "banana",
                "mar"
        ));

        System.out.println(basket.find("struguri"));
        System.out.println(basket.find("portocala"));


        System.out.println(basket.remove("banana"));
        System.out.println(basket.remove("portocala"));

        System.out.println(basket.getPosition("mar"));



    }
}
