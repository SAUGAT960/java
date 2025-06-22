package ploy_task;

// Q6. You are designing a calculator application. Create a class called "Calculator" 
// with the following overloaded methods:
// a) int add(int a, int b) - This method should add two integers and return the result.
// b) double add(double a, double b) - This method should add two doubles and return the result.
// c) int add(int a, int b, int c) - This method should add three integers and return the result.

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class q6 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add 2 integers: " + calc.add(5, 3));
        System.out.println("Add 2 doubles: " + calc.add(4.5, 3.2));
        System.out.println("Add 3 integers: " + calc.add(1, 2, 3));
    }
}

