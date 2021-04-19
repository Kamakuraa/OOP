package udemy.udemyEx;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, 1, true);

        System.out.println(printer.getNumberOfPagePrint());
        int page = printer.printingPage(5);
        System.out.println(page + printer.getNumberOfPagePrint());
    }
}
