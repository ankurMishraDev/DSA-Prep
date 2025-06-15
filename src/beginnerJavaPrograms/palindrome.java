package beginnerJavaPrograms;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = in.nextLine();
        int flag = 1;
        int length = str.length();
        for(int i = 0; i<=(length/2);i++){
            if(str.charAt(i)!= str.charAt(length-i-1)){
                System.out.println("Not a Palindrome");
                flag = 0 ;
                break;
            }
        }
        if(flag==1){
            System.out.println("Palindrome");
        }
    }
}
