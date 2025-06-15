package Arrays.lecFile;

import java.util.Arrays;
import java.util.Scanner;

public class multidimenarray {
    public static void main(String[] args) {
        /*
        123
        456
        789
         */
        Scanner in = new Scanner(System.in);
//        int arr[][] = new int[][];
//   int[][] arr = {
//           {1,2,3},//0th index
//           {4,5},//1st index
//           {6,7,8,9}// 2nd index
//   };

        int[][] arr = new int[3][3];
        System.out.println(arr.length);//no. of rows
//   input
        for (int rows = 0; rows < arr.length; rows++){
//            for each col in every row
for ( int col = 0; col < arr[rows].length; col++){
    arr[rows][col] = in.nextInt();
}}
//output
//            for (int rows = 0; rows < arr.length; rows++){
////            for each col in every row
//                for ( int col = 0; col< arr[rows].length; col++){
//                    System.out.println(arr[rows][col] + " ");
//                }
//                System.out.println();
//
//
//        }
//        for (int rows = 0; rows < arr.length; rows++){
//            System.out.println(Arrays.toString(arr[rows]));
//        }

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }





        }

}
