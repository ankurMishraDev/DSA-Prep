package Polymorphism;

public class Numbers {
    double sum (double a, int b){
        return a + b;
    }
    int sum(int a , int b , int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(34,54);
        obj.sum(23,65,94);
        obj.sum(23,54,65);
    }
}
