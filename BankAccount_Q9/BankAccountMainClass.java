package BankAccount_Q9;

public class BankAccountMainClass {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500);

        account.deposit(200);
        account.withdraw(550);
        account.withdraw(100);

        System.out.println("Final Balance: " + account.getBalance());
    }
}
