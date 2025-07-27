package assignment3.banktransactionsystemproject;
public class SavingsAccount extends Account {

    public SavingsAccount(String holder, double balance) {
        super(holder, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance in savings account.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

