package fasttrackIt.curs8.Interface.messager;

public class Email implements MessagingPlatform {
    private String address;

    public Email(String address) {
        this.address = address;
    }

    @Override
    public void send(String message) {
        System.out.println("sending email " + message + " to " + address);
    }
}
