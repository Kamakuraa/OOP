package fasttrackIt.curs8.Interface.messager;

public class Mail implements MessagingPlatform{
    public String address;
    public String name;

    public Mail(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public Mail(String bucharest) {
    }

    @Override
    public void send(String message) {
        System.out.println("sending " + message + " to " + name + " at address" + address);
    }
}
