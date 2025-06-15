package Abstract_Classes.practice.file3;

public class savingsAccount extends bankAccount{
    @Override
    void deposit() {
        System.out.println("3498$ has been deposited in your Savings Account");
    }

    @Override
    void withdraw() {
        System.out.println("348$ has been withdrawal from your Savings Account");
    }
}
