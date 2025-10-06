// Cat.java
public class Snake extends Animal {
    @Override
    public void makeSound() {
        System.out.println("ssssssssss!");
    }
    public void makeMovement(){
        System.out.println("I slither!");
    }
    @Override
    public void eat(){
        System.out.println("The snake eats mice");
    }
}