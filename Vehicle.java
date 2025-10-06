// Vehicle.java
// Abstract superclass – shared structure for all vehicles

public abstract class Vehicle {
    // Shared method for all vehicles
    public void start() {
        System.out.println("Starting vehicle...");
    }

    // Abstract method – no body
    // Every subclass must write its own version
    public abstract void drive();

}