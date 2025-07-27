package assignment3.banktransactionsystemproject;
public class BankingTransactionSystem {
    public static void main(String[] args) {
        // Create accounts
        SavingsAccount sa = new SavingsAccount("Kavya", 5000);
        CheckingAccount ca = new CheckingAccount("Arjun", 3000);

        // Perform transactions
        Transaction txn = new Transaction();
        txn.performTransaction(sa, "deposit", 2000);
        txn.performTransaction(ca, "withdraw", 1000);

        // Display final info
        sa.displayAccountInfo();
        ca.displayAccountInfo();

        // Show total accounts created
        System.out.println("\nTotal Bank Accounts: " + Bank.getTotalAccounts());
    }
}

