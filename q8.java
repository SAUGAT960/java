package ploy_task;

// Q8. You are building a payroll system for a company. The system has a class Employee with a method calculateSalary()
// to calculate the salary of an employee. Now, you need to create a derived class Manager that inherits from Employee 
// and overrides the calculateSalary() method to include a bonus calculation based on the performance. 
// Implement the classes and demonstrate method overriding for calculating the salary of a manager.

class Employee {
    double calculateSalary() {
        return 30000; // base salary
    }
}

class Manager extends Employee {
    double calculateSalary() {
        double baseSalary = super.calculateSalary();
        double bonus = 10000; // fixed bonus for performance
        return baseSalary + bonus;
    }
}

public class q8 {
    public static void main(String[] args) {
        Employee regular = new Employee();
        Employee manager = new Manager();

        System.out.println("Employee Salary: " + regular.calculateSalary());
        System.out.println("Manager Salary: " + manager.calculateSalary());
    }
}

