package Interface_Classes.practice.file2;

public class savingsAccount implements Account {
    private double balance;
    private double interestRate;

    public savingsAccount(double initialDeposit, double interestRate) {
        this.balance = initialDeposit;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdrawl(double amount) {
        balance -= amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
    public  void applyInterest(){
        balance += balance * interestRate/100;
    }
}
