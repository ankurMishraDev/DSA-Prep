package Recursions.lecFile;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(199342));
    }
    static int sumDigits(int n){
        if(n<=0){ return 0;}
        return (n%10)+sumDigits(n/10);
    }
}
