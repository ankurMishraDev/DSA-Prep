package Regex;

import java.util.Scanner;
import java.util.SimpleTimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {


        checkString();
    }
    public static void checkString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the regular expression ");
        String re = sc.nextLine();
        System.out.println("Enter the string to check ");
        String str = sc.nextLine();
            Pattern pattern = Pattern.compile(re);
            Matcher m = pattern.matcher(str);
            System.out.println(m.matches());
        System.out.println("\nDo want to exit or continue:y/n " );
        String decision = sc.nextLine();
        if(decision.equals("y")){
            checkString();
        }else {
            System.out.println("Program finished\n");
        }
    }
}
