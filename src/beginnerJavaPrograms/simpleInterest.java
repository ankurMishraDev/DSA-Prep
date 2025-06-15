package beginnerJavaPrograms;

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principle, interest and time");
        int principle = in.nextInt();
        int interest = in.nextInt();
        int time = in.nextInt();
        int simpleInterest = (principle*interest*time)/100;
        System.out.println("Simple Interest: "+ simpleInterest);
    }
}
