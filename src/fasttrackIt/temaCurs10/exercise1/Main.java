package fasttrackIt.temaCurs10.exercise1;


public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.addFruits("orange");
        basket.addFruits("apple");
        basket.addFruits("banana");

        System.out.println(basket.getFruits());

        basket.remove(2);
        System.out.println(basket.getFruits());

        basket.position("banana");
        System.out.println("----------------");
        System.out.println(basket.getFruits());

        basket.addFruits("kiwi");
        System.out.println(basket.getFruits());

        basket.distinct();

        System.out.println(basket.customCount(4));
        System.out.println(basket.getFruits());

        String kiwi = basket.position("kiwi");
        System.out.println(kiwi);

        basket.distinct();

        boolean orange = basket.first("orange");
        System.out.println(orange);


    }
}
