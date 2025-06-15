package Recursions;

public class numberRecursionExample {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n){
        if(n==5){//    Base condition in Recursion: Condition where our recursion will stop from making new calls.
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
