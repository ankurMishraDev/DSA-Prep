package Interface_Classes.practice.file2;

public class currentAccount implements Account{
    private double balance;
    private double overDraftLimit;

    public currentAccount(double initialDeposit, double overDraftLimit) {
        this.balance = initialDeposit;
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdrawl(double amount) {
        if (balance + overDraftLimit >= amount){
            balance -= amount;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
    public void setOverDraftLimit(double overDraftLimit){
        this.overDraftLimit = overDraftLimit;
    }
}
