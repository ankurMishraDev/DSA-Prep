package Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class lambdaFunctions {
    public static void main(String[] args) {
ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }
//        arr.forEach((item) -> System.out.println(item * 2));
        Consumer<Integer> fact = (item) -> System.out.println(item * 3);
        arr.forEach(fact);
        operation Sum = (a,b) -> a + b;
        operation product = (a,b) -> a * b;
        operation divide = (a,b) -> a / b;
        operation diff = (a,b) -> a - b;
        lambdaFunctions myCalculator =   new lambdaFunctions();
        System.out.println(myCalculator.operate(34,65,product));
        System.out.println(myCalculator.operate(34,65,Sum));
        System.out.println(myCalculator.operate(34,65,diff));
        System.out.println(myCalculator.operate(34,65,divide));
    }
private int operate(int a, int b, operation op){
        return  op.operation(a,b);
}
}
interface  operation {
    int operation(int a , int b);
}
