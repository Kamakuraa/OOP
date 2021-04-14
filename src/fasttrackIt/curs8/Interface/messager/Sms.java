package fasttrackIt.curs8.Interface.messager;

public class Sms implements MessagingPlatform{
    public String name;
    public int number;

    public Sms(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Sms(String name) {
    }

    @Override
    public void send(String message) {
        System.out.println("sending message " + message + " to " + number );
    }
}
