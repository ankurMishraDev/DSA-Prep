package Interface_Classes.practice.file2;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        savingsAccount Savings_Account = new savingsAccount(545136,1.5);
        System.out.println("Savings Account: \nInitial Deposit: $545136\n Interest rate: 1.5%");

        currentAccount Current_Account = new currentAccount(14613,136544);
        System.out.println("Current Account: \nInitial Deposit: $14613\n Interest rate: $136544");

        bank.addAccount(Savings_Account);
        bank.addAccount(Current_Account);

        System.out.println("\n Now deposit $100 to Savings Account. ");
        bank.deposit(Savings_Account,100);
        System.out.println(Savings_Account.getBalance());
        System.out.println("\n Now deposit $500 to Current Account. ");
        bank.deposit(Current_Account, 500);

        System.out.println("Withdraw %150 from Savings Account.\n");
        bank.withdrawl(Savings_Account, 150);
        System.out.println("\n Savings A/c and Current A/c.: ");


    }
}
