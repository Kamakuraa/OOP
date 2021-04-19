package udemy.curs.bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Mike", 100);
        bank.addCustomer("Adelaide", "Ion", 222);
        bank.addCustomer("Adelaide", "john", 333);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "BOB",155);

        bank.addCustomerTransaction("Adelaide", "Mike", 100);
        bank.addCustomerTransaction("Adelaide", "Vas", 234);
        bank.addCustomerTransaction("Adelaide", "Chris", 89);

        bank.listCustomer("Adelaide", false);




    }
}
