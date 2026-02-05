import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Car {
    String brand, model, color;
    int price, seats, doors;
    double mileage;
    String engine, fuel;

    public Car(String brand, String model, String color, int price, int seats, int doors, double mileage, double engine, String fuel) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.seats = seats;
        this.doors = doors;
        this.mileage = mileage;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + " Model: " + model + " Price: " + price;
    }
}

// Comparator for ascending name
class NameAscending implements Comparator<Car> {
    public int compare(Car c1, Car c2) {
        return c1.brand.compareToIgnoreCase(c2.brand);
    }
}

// Comparator for descending name
class NameDescending implements Comparator<Car> {
    public int compare(Car c1, Car c2) {
        return c2.brand.compareToIgnoreCase(c1.brand);
    }
}

// Comparator for ascending price
class PriceAscending implements Comparator<Car> {
    public int compare(Car c1, Car c2) {
        return Integer.compare(c1.price, c2.price);
    }
}

// Comparator for descending price
class PriceDescending implements Comparator<Car> {
    public int compare(Car c1, Car c2) {
        return Integer.compare(c2.price, c1.price);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car arr[] = {
            new Car("Honda","Civic","Black",499,4,5,100000,5.0,"V6"),
            new Car("Suzuki","Ciaz","Black",519,4,5,150000,1.0,"V1"),
            new Car("Tata","Nano","Yellow",99,4,5,10000,0.0,"V0")
        };

        System.out.println("1.Names Ascending\n2.Names Descending\n3 Price Ascending\n4 Price Descending");
        int option = sc.nextInt();

        switch(option) {
            case 1:
                Arrays.sort(arr, new NameAscending());
                break;
            case 2:
                Arrays.sort(arr, new NameDescending());
                break;
            case 3:
                Arrays.sort(arr, new PriceAscending());
                break;
            case 4:
                Arrays.sort(arr, new PriceDescending());
                break;
            default:
                System.out.println("Invalid Option");
        }

        for (Car car : arr) {
            System.out.println(car);
        }
    }
}