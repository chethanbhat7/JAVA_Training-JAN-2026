class Car {
    private String color;
    private int speed;

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

   
    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
        } else {
            System.out.println("Speed must be between 0 and 200!");
        }
    }
}

public class SimpleEncapsulation {
    public static void main(String[] args) {
        Car car = new Car();


        car.setColor("Red");
        car.setSpeed(100);

        System.out.println("Color: " + car.getColor());
        System.out.println("Speed: " + car.getSpeed());

        car.setSpeed(300);
    }
}
