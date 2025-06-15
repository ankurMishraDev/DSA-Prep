package beginnerJavaPrograms;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        int num = in.nextInt();
        if(num == 0 ){
            System.out.println("Enter a number other than 0(zero)");
        }else if(num%2!=0){
            System.out.println("Given number is Odd");
        }else{
            System.out.println("Given number is Even");
        }
    }
}
