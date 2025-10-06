// Main.java
// Driver program

public class VehicleMain {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle(); // ❌ cannot instantiate abstract class

        Vehicle car = new Car();
        Vehicle boat = new Boat();
        Vehicle airplane = new Airplane();

        car.start();
        car.drive();



        boat.start();
        boat.drive();

        airplane.start();
        airplane.drive();
    }
}