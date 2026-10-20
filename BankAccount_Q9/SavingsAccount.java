package BankAccount_Q9;

public class SavingsAccount extends BankAccount{

    SavingsAccount(double balance) {
        super(balance);
    }


    void withdraw(double amount) {
        if (getBalance() - amount >= 100) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + getBalance());
        } else {
            System.out.println("Withdrawal denied.");
            System.out.println("Balance cannot fall below 100.");
        }
    }
}
