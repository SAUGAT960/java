package ploy_task;

// Q2. You are working on an e-commerce application where different payment methods are supported, 
// including credit card, PayPal, and bank transfer. Each payment method has its own validation 
// and transaction process. Implement a Java program using polymorphism to process payments using different payment methods.

abstract class Payment {
    abstract void processPayment();
}

class CreditCard extends Payment {
    void processPayment() { System.out.println("Processing credit card payment..."); }
}

class PayPal extends Payment {
    void processPayment() { System.out.println("Processing PayPal payment..."); }
}

class BankTransfer extends Payment {
    void processPayment() { System.out.println("Processing bank transfer payment..."); }
}

public class q2 {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new PayPal();
        Payment p3 = new BankTransfer();
        p1.processPayment();
        p2.processPayment();
        p3.processPayment();
    }
}
