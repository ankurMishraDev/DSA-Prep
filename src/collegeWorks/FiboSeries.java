package collegeWorks;

import java.util.Arrays;
import java.util.Scanner;

public class FiboSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of series: ");
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }

    static int fibo(int n) {
        int count =0;
        int num =0;
        if (n < 2) {
            return n;
        }
        if(n>=count) {
           num= fibo(n - 1) + fibo(n - 2);
            series(num);
            count++;
        }
        return fibo(num);
    }
    public static void series(int num ){
        System.out.print(num);
    }

}
