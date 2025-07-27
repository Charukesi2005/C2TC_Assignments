package assignment3.banktransactionsystemproject;
public class Bank {
    private static int totalAccounts = 0;

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void incrementAccounts() {
        totalAccounts++;
    }
}
