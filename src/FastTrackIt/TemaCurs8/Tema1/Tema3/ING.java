package FastTrackIt.TemaCurs8.Tema1.Tema3;

public class ING implements CreditForPerson{
    int depositMoney;
    boolean withdraw;

    public ING(int depositMoney, boolean withdraw) {
        if (depositMoney > 100){
            this.depositMoney = depositMoney;
            this.withdraw = withdraw;
        } else {
            System.out.println(" nu poti sa retragi bani");
        }
    }

    @Override
    public void send(String message) {
        System.out.println("daca in deposit sunt " + depositMoney + " poti sa retragi " + withdraw );
    }
}
