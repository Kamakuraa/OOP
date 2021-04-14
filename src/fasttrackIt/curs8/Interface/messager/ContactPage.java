package fasttrackIt.curs8.Interface.messager;

public class ContactPage {
    private String[] messages;
    private MessagingPlatform platform;


    public ContactPage(String[] messages){
        this.messages = messages;
        this.platform = platform;
    }


    public void sendMessages(MessagingPlatform platform){
        for (String meg : messages){
            platform.send("FST " + meg);
        }
    }
}
