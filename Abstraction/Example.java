abstract class Shape {
    abstract double area(); // Abstract method - no implementation
    void display() { // Concrete method - has implementation
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class Example{
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.display();
        System.out.println("Area: " + circle.area()); 
    }
}   