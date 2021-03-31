package FastTrackIt.TemaCurs8.Tema1.Tema2;

public class Print implements Advertising{
    String message;

    public Print(String message) {
        this.message = message;
    }

    @Override
    public void send(String message) {
        System.out.println("Aici trebuie sa fie " + message + " fi creativ");
    }
}
