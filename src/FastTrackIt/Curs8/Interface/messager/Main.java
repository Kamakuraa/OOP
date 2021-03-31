package FastTrackIt.Curs8.Interface.messager;

public class Main {
    public static void main(String[] args) {
        String[] messages = {
                "Salutare tuturor",
                "lunea viitoare este curs"
        };


        ContactPage contactPage = new ContactPage(messages);
        contactPage.sendMessages(new Sms("0756-5545"));
        contactPage.sendMessages(new Mail("Bucharest"));
        contactPage.sendMessages(new Email("test@yahoo.com"));
        contactPage.sendMessages(new Sms("0756-5545"));
    }
}
