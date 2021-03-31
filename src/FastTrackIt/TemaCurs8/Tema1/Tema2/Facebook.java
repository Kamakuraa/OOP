package FastTrackIt.TemaCurs8.Tema1.Tema2;

public class Facebook implements Advertising {
    String name;
    String message;
    int age;
    boolean status;

    public Facebook(String name, String message, int age, boolean status) {

        this.name = name;
        this.message = message;
        this.age = age;
        this.status = status;
    }

    @Override
    public void send(String message) {
        System.out.println("Persoanel cu varsta  " + age +
                "si casatorite " + status + "care au numele " + name +
                "primesc mesjul " + message);

    }
}
