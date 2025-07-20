package Recursions.lecFile;

public class ReverseNumber {
    public static void main(String[] args) {
        reverse(23483);
        System.out.println(sum);
    }
    //using extra variable
    static int sum =0;
    static void reverse(int n){
        if(n==0){
            return ;
        }
        sum = sum*10 + (n%10);
          reverse(n/10);

    }
}