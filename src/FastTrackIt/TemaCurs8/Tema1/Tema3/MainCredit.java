package FastTrackIt.TemaCurs8.Tema1.Tema3;

import FastTrackIt.Curs8.Interface.messager.MessagingPlatform;

public class MainCredit {
    public static void main(String[] args) {
        String[] messages = {
                "Cumpara o casa moua"
        };
        CreditPers creditPers = new CreditPers(messages);
        creditPers.sendMessages(new BT(120, true));
        creditPers.sendMessages(new BRD(10, false));
        creditPers.sendMessages(new ING(50, false));

    }
}
