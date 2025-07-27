package assignment3.banktransactionsystemproject;
public final class Transaction {
    private final double transactionFee = 10.0;

    public final void performTransaction(Account account, String type, double amount) {
        System.out.println("\nProcessing " + type + " of ₹" + amount + " with fee ₹" + transactionFee);

        if (type.equalsIgnoreCase("deposit")) {
            account.deposit(amount - transactionFee);
        } else if (type.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount + transactionFee);
        } else {
            System.out.println("Invalid transaction type.");
        }

        System.out.println("Transaction complete. Updated balance: ₹" + account.getBalance());
    }
}

