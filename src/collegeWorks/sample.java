package collegeWorks;

import java.util.Arrays;
import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        int input = 0;
        int i=0;
        while (input != -1){
            input = sc.nextInt();
            arr[i] = input;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
