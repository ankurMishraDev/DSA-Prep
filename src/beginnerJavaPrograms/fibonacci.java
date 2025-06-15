package beginnerJavaPrograms;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0, b=1,temp =2, count = in.nextInt();
        int fibo = 0;
        while(temp<= count){
            fibo = a+b;
            a = b;
            b = fibo;
            temp++;
        }
        System.out.println("Fibonacci is: "+ fibo);
    }
}
