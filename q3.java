package ploy_task;

// Q3. You are developing a car rental system. There are different types of vehicles available for rent, 
// such as cars, motorcycles, and bicycles. Each vehicle type has different rental calculation rules. 
// Implement a Java program using polymorphism to calculate the rental cost for different vehicle types.

abstract class Vehicle {
    abstract double calculateRent(int days);
}

class Car extends Vehicle {
    double calculateRent(int days) { return days * 50; }
}

class Motorcycle extends Vehicle {
    double calculateRent(int days) { return days * 20; }
}

class Bicycle extends Vehicle {
    double calculateRent(int days) { return days * 10; }
}

public class q3 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Motorcycle();
        Vehicle v3 = new Bicycle();
        System.out.println("Car rent: " + v1.calculateRent(3));
        System.out.println("Motorcycle rent: " + v2.calculateRent(3));
        System.out.println("Bicycle rent: " + v3.calculateRent(3));
    }
}

