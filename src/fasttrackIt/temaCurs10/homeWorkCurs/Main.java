package fasttrackIt.temaCurs10.homeWorkCurs;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket(List.of(
                "mar",
                "para",
                "strujguri",
                "banana"
        ));

        System.out.println(basket.find("banana"));
        System.out.println(basket.find("portocal"));
        System.out.println(basket.getPosition("mar"));
        System.out.println(basket.count());


    }
}
