package fasttrackIt.curs9.curs91.polymorphism;

public class Main {
    public static void main(String[] args) {
        CompanyTransport transport = new CompanyTransport();
        transport.goToClient(new BMW());

        System.out.println("orr");
        transport.goToClient(new Dacia());


        System.out.println("____________________");

        transport.goToClient(new Oltcit());


    }
}
