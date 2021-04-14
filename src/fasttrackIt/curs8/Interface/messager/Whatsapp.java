package fasttrackIt.curs8.Interface.messager;

public class Whatsapp implements MessagingPlatform{
    public String name;
    public int number;

    public Whatsapp(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void send(String message) {
        System.out.println("sending whatsapp message " + message + " to " + number );
    }
}
