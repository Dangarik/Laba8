public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 2020, 352, "95");
        Boat boat1 = new Boat("Fisher", 2020, 52, "Unknown");

        car1.changeSpeed(150);

        getTransportType(car1);
        System.out.println(car1);
        getTransportType(boat1);
        System.out.println(boat1);

        System.out.println("Car equals Boat: " + car1.equals(boat1));

        car1.changeSpeed(20, true); 
        System.out.println("Updated speed of Car: " + car1.getSpeed());
    }

    public static void getTransportType(Transport transport) {
        System.out.print("Transport Type: " + transport.getTransportType());
    }
}
