import java.util.UUID;

public class BankAccount {
    private double balance;
    private final String accountNumber;
    public BankAccount(double balance) {
        this.balance = balance;
        this.accountNumber = UUID.randomUUID().toString();
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance += balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void withdraw(double value) {
        if(balance >= value) {
            balance -= value;
        }
        else throw new CustomException("400", "Insufficient Balance");
    }
}
