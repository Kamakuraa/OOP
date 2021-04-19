package udemy.curs.composition;

public class Main {
    public static void main(String[] args) {
        Dimension dimension = new Dimension(20, 20, 5);

        Case theCase = new Case("222", "Dell", "12", dimension);

        Monitor monitor = new Monitor("23 inch",
                "Acer",
                27, new Resolution(2540, 1440));

        MotherBoard motherBoard = new MotherBoard(
                "23a",
                "ASIUS",
                4,
                4,
                "v234");

        PC pc = new PC(theCase, monitor, motherBoard);

     pc.powerUp();

    }
}
