package beginnerJavaPrograms;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        for (int i = start; i < end; i++) {
            int rem = i;
            int num = 0;
            int temp = 0;
            while (rem!=0){
                temp=rem%10;
                num=num+(temp*temp*temp);
                rem=rem/10;
            }
            if (num==i){
                System.out.println(i + " is an Armstrong number");
            }else {
                System.out.println(i + " is not an Armstrong number");
            }
        }
    }
}
