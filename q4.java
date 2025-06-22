package ploy_task;

// Q4. You are working on a restaurant ordering system. There are different types of menu items, 
// such as appetizers, main courses, and beverages. Each menu item has its own preparation and serving methods. 
// Implement a Java program using polymorphism to handle the ordering and preparation of different types of menu items.

abstract class MenuItem {
    abstract void prepare();
}

class Appetizer extends MenuItem {
    void prepare() { System.out.println("Preparing appetizer..."); }
}

class MainCourse extends MenuItem {
    void prepare() { System.out.println("Cooking main course..."); }
}

class Beverage extends MenuItem {
    void prepare() { System.out.println("Serving beverage..."); }
}

public class q4 {
    public static void main(String[] args) {
        MenuItem m1 = new Appetizer();
        MenuItem m2 = new MainCourse();
        MenuItem m3 = new Beverage();
        m1.prepare();
        m2.prepare();
        m3.prepare();
    }
}

