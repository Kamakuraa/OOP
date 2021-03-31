package FastTrackIt.TemaCurs8.Tema1.Tema2;


import FastTrackIt.Curs8.Interface.messager.MessagingPlatform;

public class AdsPage {
    private String[] messages;
    private Advertising adsMess;


    public AdsPage(String[] messages) {
        this.messages = messages;
        this.adsMess = adsMess;
    }

    public void sendAdsMessages(Advertising adsMess){
        for (String msg : messages){
            adsMess.send("Advertising message " + msg);
        }
    }
}
