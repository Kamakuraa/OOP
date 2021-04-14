package fasttrackIt.temacurs7.Tema.Other;

public class VehicleMain {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
//        System.out.println(vehicle.getColor());
//        System.out.println(vehicle.count);
//
//        Vehicle vehicle1 = new Vehicle("Civic", "black", "2012", "honda", "1200");
//        System.out.println(vehicle1.getColor());
//        vehicle1.setColor("redBlue");
//        System.out.println(vehicle.getColor());
//        System.out.println(vehicle.count);
//        System.out.println(vehicle1.getSpeed());
//        vehicle1.getVehicle();

        Car car = new Car("Civic", "black",
                "2012", "honda",
                "1200", true, false);

        System.out.println(car.getLedScreen());
        System.out.println(car.getName());




    }

}
