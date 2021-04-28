package udemy.interf;

public class Main {
    public static void main(String[] args) {
        ITelephone iTelephone = new DeskPHone(123456);
        iTelephone.powerOm();
        iTelephone.callPhone(123123);
        iTelephone.answer();

        MobilePhone timsPhone = new MobilePhone(232323);
        timsPhone.callPhone(1232323442);
        timsPhone.answer();
    }

}
