package BinarySearch.lecFile;

import java.util.Arrays;
import java.util.Scanner;

public class SortedMatrixSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matrix = {
                {10, 12, 16, 17, 18,24},
                {24, 25, 26, 28, 29,32},
                {31, 35, 37, 38, 39, 42},
                {231, 237, 354, 1685, 24615, 34561}
        };
        int[][]matrix2 ={
                {1},{3}
        };
        System.out.println("Enter the element you want to search in the array");
        int target = in.nextInt();
        System.out.println(Arrays.toString(search(matrix2, target)));
    }

    //    search in the row provided
    static int[] BS(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length - 1;
        if(col == 0){
            return new int[] {-1,-1};
        }
        if (row == 1) {
            return BS(matrix, 0, 0, col , target);
        }
//        run till the two rows are remaining
        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col / 2;
        while (rStart < (rEnd-1)) {
//            while this is true it will have more than two rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
//            now we have only two rows
//            check whether the target is in the col of 2 rows
            if (matrix[rStart][cMid] == target) {
                return new int[]{rStart , cMid};
            }
            if (matrix[rStart + 1][cMid] == target) {
                return new int[]{rStart + 1 , cMid};
            }
//            search in the first half
            if (target <= matrix[rStart][cMid - 1]) {
                return BS(matrix, rStart, 0, cMid - 1, target);
            }
//            search in the second half
            if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][col - 1]) {
                return BS(matrix, rStart, cMid + 1, col , target);
            }
//            search in the third half
            if (target <= matrix[rStart + 1][cMid - 1]) {
                return BS(matrix, rStart + 1, 0, cMid - 1, target);
            } else {
                return BS(matrix, rStart + 1, cMid + 1, col , target);
            }
        }
        return new int[]{-1, -1};
    }
}
