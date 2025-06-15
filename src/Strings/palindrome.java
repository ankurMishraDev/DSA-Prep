package Strings;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string to check whether it is a palindrome or not");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println("Does the given string is palindrome or not: " + isPalindrome(str));
    }
    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2 ; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i );
            if (start != end){
                return false;
            }

        }
        return true;
    }

}
