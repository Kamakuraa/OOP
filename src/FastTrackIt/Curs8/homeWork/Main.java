package FastTrackIt.Curs8.homeWork;

public class Main {
    public static void main(String[] args) {
        Bottle bottle = new Bottle(500, 500);
        System.out.println(bottle.getAvailableLiquid());
        System.out.println(bottle.getEmpty());
        System.out.println(bottle.open());
        System.out.println(bottle.close());
        System.out.println(bottle.close());
        bottle.open();
        System.out.println(bottle.drink(200));
        System.out.println(bottle.drink(300));
        System.out.println(bottle.getAvailableLiquid());
    }
}
