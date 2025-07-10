package BinarySearch_1D.lecFile;

import java.util.Arrays;
import java.util.Scanner;

public class RowColMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][]arr = {
                {10,12,16,17,18},
                {24,25,26,28,29},
                {31,35,37,38,39},
                {231,237,354,1685,24615}
        };
        System.out.println("Enter the element you want to search in the array");
        int target = in.nextInt();
        System.out.println(Arrays.toString(search(arr,target)));
    }


    static int[]search(int[][] arr , int target){
    int row = 0;
    int c =  arr.length -1;
    while (row <= arr.length){
        if ( arr[row][c] == target) {
            return new int[]{row, c};
        }
        if ( arr[row][c] <  target){
            row++;
        }else {
            c--;
        }
    }
        return new int[]{-1,-1};
    }



    }


