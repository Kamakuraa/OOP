package udemy.udemyEx;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPagePrint;
    private boolean duplex;

    public Printer(int tonerLevel, int numberOfPagePrint, boolean duplex) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagePrint = numberOfPagePrint;
        this.duplex = duplex;
    }

    public int fillUp(int tonerAmount){
        if (tonerLevel > 0 && tonerAmount < 100){
            if (this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else {
            return -1;
        }
    }



    public int printingPage(int pages){
       int pagesToPrint = pages;
       if (this.duplex) {
           pagesToPrint /=2;
           System.out.println("Printing in duplex mode");
       }
       this.numberOfPagePrint += pagesToPrint;
       return pagesToPrint;
    }


    public int getNumberOfPagePrint() {
        return numberOfPagePrint;
    }


}
