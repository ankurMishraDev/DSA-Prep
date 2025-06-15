package Polymorphism;

import java.util.Scanner;

public class objectPrint {
    int num;

    public objectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "objectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
    objectPrint obj = new objectPrint(n);
        System.out.println(obj);

    }
}
