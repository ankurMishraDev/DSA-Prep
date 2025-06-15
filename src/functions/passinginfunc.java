package functions;

import java.util.Arrays;
import java.util.Scanner;

public class passinginfunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int []nums = new int[6];
        for (int i=0; i<nums.length; i++){
            nums[i]= in.nextInt();
        }

        System.out.println(Arrays.toString(nums));
        change(nums);// in this step we make a reference of nums array as array name arr declare in the 'change function'
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){// as arr is assigned as a reference of nums hence any change in arr make same impact on sums as both Intro_array_12_dsa_kunal.arrays point towards the same object in heap memory
        arr[4]= 99;
    }
}
