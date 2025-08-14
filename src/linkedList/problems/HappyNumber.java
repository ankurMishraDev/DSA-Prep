package linkedList.problems;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number for checking: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println( nums(n,getNext(n)));
    }
    static boolean nums(int x, int y){
        if(x==1||y==1) return true;
        if(x==y)return false;
        return nums(getNext(x),getNext(getNext(y)));
    }
    static int getNext(int n){
        int sum =0;
        while(n!=0){
            int temp = n%10;
            sum += temp*temp;
            n= n/10;
        }
        return sum;
    }
}
