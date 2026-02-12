package BankAccou;

public class BankMain {
    public static void main(String[] args) {
        BankAccount.setAccountNumber("KG123456");
        BankAccount.setBalance(1000);

        BankAccount.deposit(500);
        BankAccount.withdraw(300);

        System.out.println("Account Number: " + BankAccount.getAccountNumber());
        System.out.println("Balance: " + BankAccount.getBalance());
    }
}
