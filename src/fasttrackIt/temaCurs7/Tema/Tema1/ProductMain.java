package fasttrackIt.temaCurs7.Tema.Tema1;

import java.util.Objects;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product("Laptop ASUS", 120, 12, "IT&C");
        System.out.println(product.getPrice());
        System.out.println(product.getCategory());
        System.out.println(product.getQuantity());

        Product product1 = new Product("Samsung", 654, 0, "TV");
        System.out.println(product1.hasStock());

        Product product2 = new Product("Sony", 450, 2, "TV");
        System.out.println(Objects.equals(product2, product1.isCategory("TV")));

        System.out.println(product.PRODUS);

    }
}
