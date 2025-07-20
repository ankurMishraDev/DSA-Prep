package Recursions.lecFile;

public class numberRecursionExample {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n){
        if(n==0){//    Base condition in Recursion: Condition where our recursion will stop from making new calls.

            return;
        }
        System.out.println(n);
        print(n - 1);
        System.out.println(n);
    }
}
