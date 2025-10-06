// Animal.java
// Abstract superclass for all animals

public abstract class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }

    // Abstract method
    public abstract void makeSound();
    public abstract void makeMovement();
}