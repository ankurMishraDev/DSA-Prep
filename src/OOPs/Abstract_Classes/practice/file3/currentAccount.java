package Abstract_Classes.practice.file3;

public class currentAccount extends savingsAccount{
    @Override
    void deposit() {
        System.out.println("7498$ has been credited in your Current Account");
    }

    @Override
    void withdraw() {
        System.out.println("498$ has been debited from your Current Account");
    }
}
