package Abstract_Classes.practice.file3;

public class customer extends currentAccount{
    public static void main(String[] args) {
        //savings account
        savingsAccount cus1 = new savingsAccount();
        cus1.deposit();
        cus1.withdraw();
        System.out.println(" ");
        //current account
        currentAccount cus2 = new currentAccount();
        cus2.deposit();
        cus2.withdraw();
    }
}
