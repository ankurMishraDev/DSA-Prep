import java.util.Scanner;

public class problem {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), n = scanner.nextInt(), count = 0;
        if(a == 0 || a >= b || b == 0 || n<= 0){
            System.out.println("Inputs are incorrect");
        }
        for(int i = a-1; i<= b; i++){
            if (i % n == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}

