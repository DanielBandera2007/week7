// Main.java
public class AnimalMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal snake = new Snake();
        Animal sheep = new Sheep();

        dog.eat();       // Inherited from Animal
        dog.makeSound();// Dog’s version
        dog.makeMovement();

        cat.eat();
        cat.makeSound();
        cat.makeMovement();

        sheep.eat();
        sheep.makeSound();
        sheep.makeMovement();
        snake.eat();
        snake.makeSound();
        snake.makeMovement();

    }
}