package fasttrackIt.temaCurs9.temaCurs9Refacuta;

public class Main {
    public static void main(String[] args) {
        Cosmetics cosmetics = new Cosmetics("Loreal");
        Electronics electronics = new Electronics();
        Fridge fridge = new Fridge("LG");
       Product product = new Product() {
           @Override
           public void buy(int price, String name, int quantity) {

           }
       };

        System.out.println(cosmetics.getColor());

        System.out.println(fridge.getTemperature());
        System.out.println(fridge.getHeight());
        fridge.buy(300, " frigidere ", 1);

        product.buy(10, "TV");
        System.out.println(product.getDescription());
        System.out.println(product.getQuantity());
        System.out.println(product.getPrice(1));


    }
}
