package fasttrackIt.temaCurs10.exercise2;

public class Main {
    public static void main(String[] args) {
        Flowers flowers = new Flowers();

        flowers.addFlower("sunflower");
        flowers.addFlower("poppy");

        System.out.println(flowers.getBouquetOfFlowers());

        flowers.getAll();
        System.out.println(flowers.getAll());

        flowers.removeFlw(3);
        System.out.println(flowers.getBouquetOfFlowers());
    }
}
