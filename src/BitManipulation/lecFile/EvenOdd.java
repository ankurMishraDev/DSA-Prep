package BitManipulation.lecFile;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether is even or odd: ");
        int num = sc.nextInt();
        if((num&1)==1){
            System.out.println("Number is odd");
        }else System.out.println("Number is even");
    }
}
