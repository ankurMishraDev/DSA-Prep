package linear_search_algorithm_13_dsa_kunal;

import java.util.Scanner;

public class SearchinRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1113, 651, 1, 13, 2841, 34, 984651, 32165, 132, 18453, 23, 15, 312, 2465, 1};

        int target = in.nextInt();
        System.out.println(linear_search(arr, target, 1, 13));
//        to print the search the index of an element within a selected range from an array
    }
    static int linear_search(int []arr, int target, int start , int end){
        if (arr.length == 0){

            return -1;
        }
        for (int j = start; j < end ; j++) {
            int elmenet = arr[j];
            if (elmenet == target){
                return elmenet;
            }

        }
        return -2;
    }
}
