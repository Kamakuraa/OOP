package fasttrackIt.curs9.curs91.polymorphism;

public class CompanyTransport {

    private int clientCount = 0;


    public void goToClient(Car companyCar) {
        System.out.println("Starting my client meeting");

        companyCar.drive(60, 4);
        System.out.println("Arrived at my client meeting");

        clientCount++;
        System.out.println("Client done" + clientCount);
    }
}
