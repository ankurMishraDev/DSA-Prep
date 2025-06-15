package beginnerJavaPrograms;

import java.util.Scanner;

public class ifCondition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println("Enter operator");
        String operator = in.next();
        switch (operator){
            case "+": {int sum = x+y;
                System.out.println("sum: "+sum);
                break;
            }
            case "-": {
                int diff = 0;
                if(x>y){diff = x-y;}else {diff = y-x;}
                System.out.println("diff: "+diff);
                break;
            }
            case "*": {int product = x*y;
                System.out.println("product: "+product);
                break;
            }
            case "/": {int quotient = x+y;
                System.out.println("Division: "+quotient);
                break;
            }
        }
    }
}
