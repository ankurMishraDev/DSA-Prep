package beginnerJavaPrograms;

import java.util.Scanner;

public class currencyConvert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter money amount in INR");
        int amt = in.nextInt();
        double dollar = amt/83.50;

        System.out.println("Currently you have "+ dollar+ "$");
    }
}
