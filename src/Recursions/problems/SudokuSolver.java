package Recursions.problems;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (sudokuSolver(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }

    }
    static boolean sudokuSolver(int [][]arr){
        int n = arr.length;
        int r = -1;
        int c =-1;
        boolean isEmpty = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                if(arr[i][j]==0){
                    r=i;
                    c=j;
                    isEmpty=false;
                    break;
                }
            }
            if(!isEmpty)  break;
        }
        if(isEmpty) return true;
        //backtrack
        for (int num = 1; num <=9 ; num++) {
            if (validatePosition(arr,r,c,num)){
                arr[r][c]=num;
                if(sudokuSolver(arr)){

                    return true;}
                else arr[r][c]=0;
            }
        }
        return false;
    }
    static boolean validatePosition(int[][]arr, int r, int c, int num){
        for (int i = 0; i < arr.length; i++) {
            // check if the number is in the row
            if (arr[r][i] == num) {
                return false;
            }
        }

        // check the col
        for (int[] nums : arr) {
            // check if the number is in the col
            if (nums[c] == num) {
                return false;
            }
        }
        int sqrt = (int)Math.sqrt(arr.length);
        int start = r-r%sqrt;
        int end = c-c%sqrt;
        for (int i = start; i <start+sqrt ; i++) {
            for (int j = end; j < end+sqrt; j++) {
                if(arr[i][j]==num)return false;
            }
        }
        return true;
    }
    private static void display(int[][] board) {
        for(int[] row : board) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
