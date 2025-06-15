package Interface_Classes.practice.file2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class Bank {
    private List accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }
    //method to add an account to the list of accounts
    public void addAccount(Account account){
        accounts.add(account);
    }

    public void removeAccount(Account account){
        accounts.remove(account);
    }

    public void deposit(Account account, double amount){
        account.deposit(amount);
    }

    public void withdrawl(Account account, double amount){
        account.withdrawl(amount);
    }
    public void printAccountBalance(){
        Account account = (Account) accounts;
            System.out.println(new StringBuilder().append("Account balance: ").append(account.getBalance()).toString());
    }



}
