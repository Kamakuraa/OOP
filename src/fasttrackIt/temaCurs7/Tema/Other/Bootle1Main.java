package fasttrackIt.temaCurs7.Tema.Other;

public class Bootle1Main {
    public static void main(String[] args) {
        Bottle1 bottle1 = new Bottle1(300, 250, false);
        System.out.println(bottle1.hasMoreLiquid());
        bottle1.availableLiquid(250);
        System.out.println(bottle1.getTotalCapacity());
        bottle1.setAvailableLiquid(100);


        bottle1.emptyCapacity(0);
        System.out.println(bottle1.getAvailableLiquid());

        bottle1.isOpen();
        bottle1.isClos(true);
        System.out.println(bottle1.isOpen());
    }
}
