// Interface definition
interface Animal {
    void eat();        // Abstract method
    void sleep();      // Abstract method
}

// Class implementing the interface
class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats bones");
    }

    public void sleep() {
        System.out.println("Dog sleeps");
    }
}

// Usage
public class Inteface{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();   // Output: Dog eats bones
        myDog.sleep(); // Output: Dog sleeps
    }
}   