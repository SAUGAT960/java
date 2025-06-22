package ploy_task;


// Q7. You are building a geometry application. Create a class called "Geometry" with the following overloaded methods:
// a) double calculateArea(double radius) - This method should calculate and return the area of a circle with the given radius.
// b) double calculateArea(double length, double width) - This method should calculate and return the area of a rectangle.
// c) double calculateArea(double base, double height, boolean type) - This method should calculate and return the area of a triangle.

class Geometry {
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    double calculateArea(double length, double width) {
        return length * width;
    }

    double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}

public class q7 {
    public static void main(String[] args) {
        Geometry geometry = new Geometry();

        System.out.println("Area of Circle: " + geometry.calculateArea(5.0));
        System.out.println("Area of Rectangle: " + geometry.calculateArea(4.0, 6.0));
        System.out.println("Area of Triangle: " + geometry.calculateArea(3.0, 4.0, true));
    }
}

