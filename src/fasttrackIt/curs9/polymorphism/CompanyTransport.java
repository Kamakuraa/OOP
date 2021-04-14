package fasttrackIt.curs9.polymorphism;

public class CompanyTransport {
    private Car companyCar;
    private int clientCount = 0;

    public void goToCar() {
        System.out.println("Starting my client");

        companyCar.drive(50, 3);

        System.out.println("Arrived at my client meeting");

        clientCount++;

        System.out.println("Client done");
    }
}
