package FastTrackIt.TemaCurs8.Tema1.Tema3;

import FastTrackIt.Curs8.Interface.messager.MessagingPlatform;

public class CreditPers {
    private String[] messages;
    private MessagingPlatform platform;


    public CreditPers(String[] messages){
        this.messages = messages;
        this.platform = platform;
    }


    public void sendMessages(BT platform) {
        for (String meg : messages) {
            platform.send("FST " + meg);
        }
    }

    public void sendMessages(ING ing) {
    }

    public void sendMessages(BRD brd) {
    }
}
