package ploy_task;

// Q9. You are developing a banking application that includes different types of accounts. 
// Each account has a method named calculateInterest to calculate the interest based on the account type. 
// Implement the calculateInterest method in the base class Account and override it in the derived classes 
// SavingsAccount and FixedDepositAccount to calculate interest based on their specific rules. 
// Write the code to demonstrate method overriding for calculating interest.

class Account {
    double calculateInterest() {
        return 0.0;
    }
}

class SavingsAccount extends Account {
    double calculateInterest() {
        return 1000 * 0.04; // 4% interest
    }
}

class FixedDepositAccount extends Account {
    double calculateInterest() {
        return 1000 * 0.08; // 8% interest
    }
}

public class q9 {
    public static void main(String[] args) {
        Account savings = new SavingsAccount();
        Account fixed = new FixedDepositAccount();

        System.out.println("Savings Account Interest: " + savings.calculateInterest());
        System.out.println("Fixed Deposit Interest: " + fixed.calculateInterest());
    }
}

