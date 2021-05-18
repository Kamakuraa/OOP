package udemy.collectioArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class WebShopApp {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Apple", 399.99, "the best"));
        products.add(new Product("Samsung", 299.99, "the second"));

//        System.out.println(products);

        products.add(0, new Product("Huawei", 210,"The third"));
        products.remove(0);

        products.set(0, new Product("LG", 3.99, "is ok"));
        products.remove(new Product("Apple", 399.99, "the best"));
        for (Product product : products){
            System.out.println(product);

            System.out.println(products.size() + " products can be");
        }
    }
}
