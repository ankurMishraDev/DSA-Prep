package Recursions.lecFile;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(6));
    }
    static int fact(int n){

        int factorial = n;
        if(n==1){
            return factorial;
        }
        factorial = n * fact(n-1);
        return factorial;
    }
}
