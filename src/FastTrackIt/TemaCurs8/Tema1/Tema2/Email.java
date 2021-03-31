package FastTrackIt.TemaCurs8.Tema1.Tema2;

public class Email implements Advertising {
    String email;
    String name;
    String message;

    public Email(String email, String name, String message) {
        this.email = email;
        this.name = name;
        this.message = message;
    }

    @Override
    public void send(String message) {
        System.out.println("trimitem " + email + " la" + name
                + " cu mesajul " + message);
    }
}
