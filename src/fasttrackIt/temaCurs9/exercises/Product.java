package fasttrackIt.temaCurs9.exercises;

public class Product {
    int price;
    public String name;
    private String description;
    protected int quantity;


    public Product(String name) {
        this.name = name;
    }

    public Product() {
        this(0, "TV", "Best imagine", 10);
    }

    public Product(int price, String name, String description, int quantity) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = 10;
    }

    public void buy(int price, String name) {
        this.price = price;
        this.name = name;
    }

//    public Parent(String name) {
//        this.publicString = name;
//    }
//    public void publicMethod() {
//        System.out.println("Parent public method " + privateString);
//    }
//
//    protected void protectedMethod() {
//        System.out.println("Parent public mrthod");
//    }
//
//    void defaultMethod() {
//        System.out.println("Parent default method");
//    }
//
//    private void privateMethod() {
//        System.out.println("Parent private method");
//    }


}
