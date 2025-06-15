package Access_Control;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Number of array element: ");
        int n = in.nextInt();
        a obj = new a(34, "hello", n);
        System.out.println("Enter array element: ");
        for (int i = 0; i < n; i++) {
            obj.arr[i] = in.nextInt();
        }

        System.out.println(obj.name);
        System.out.println(Arrays.toString(obj.arr));
    }
}
