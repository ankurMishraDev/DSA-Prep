package linear_search_algorithm_13_dsa_kunal;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2dArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[][]{
                {31, 64, 8783, 1, 66, 84},
                {65, 31, 4, 24, 876, 231},
                {41, 1, 47, 35}
        };
        while(true){
        System.out.println("Enter the element you want to search in the array");
        int target = in.nextInt();
        int [] ans = search(arr, target);
        System.out.println("The location of element in the array matrix is " + Arrays.toString(ans));

            System.out.println("If you want to end the process then type (0) otherwise to continue press (1) :");
            int n = in.nextInt();
        if (n == 0) {
            break;
        }
    }}
    static int[] search(int[][] arr  , int target){

        for (int row = 0; row < arr.length; row++){
            for (int j = 0; j < arr[row].length ; j++) {

                if ( arr[row][j] == target){
                    return new int[]{row, j};
                }

            }
        }
        return new int[]{-1, -1};
    }
}
