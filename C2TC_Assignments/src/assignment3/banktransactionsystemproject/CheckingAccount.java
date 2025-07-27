package assignment3.banktransactionsystemproject;
public class CheckingAccount extends Account {

    public CheckingAccount(String holder, double balance) {
        super(holder, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount + 50 <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds or minimum balance requirement not met.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

