package BankAccou;
class BankAccount {

    private static String accountNumber;
    private static double balance;

    public static String getAccountNumber() {
        return accountNumber;
    }

    public static void setAccountNumber(String accountNumber) {
        BankAccount.accountNumber = accountNumber;
    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        BankAccount.balance = balance;
    }

    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public static void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
