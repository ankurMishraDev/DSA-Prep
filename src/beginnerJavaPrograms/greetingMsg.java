package beginnerJavaPrograms;

import java.util.Scanner;

public class greetingMsg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.nextLine();
        System.out.println("Congratulations to Mr/Mrs "+ name + " for this achievement");
    }
}
