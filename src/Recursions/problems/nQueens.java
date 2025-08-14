package Recursions.problems;


import java.util.Scanner;

public class nQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of board");
        int n = sc.nextInt();
        boolean [][]arr = new boolean[n][n];
        System.out.println(queens(arr,0));
    }
    static int queens(boolean[][]arr, int r){
        if(r== arr.length){
            print(arr);
            return 1;
        }
        int count  =0;
        for (int i = 0; i < arr.length; i++) {
            if(validPosition(arr,r,i)){
                arr[r][i]=true;
                count += queens(arr,r+1);
                arr[r][i]=false;
            }
        }
        return count;
    }
    static void print(boolean [][]arr){
        System.out.print("\n");
        for(boolean[] row : arr) {
            System.out.print("[");
            for(boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println("]");
        }
    }
    static boolean validPosition(boolean[][]arr, int r, int c){
        //check a vertical case
        for (int i = 0; i < r; i++) {
            if(arr[i][c])return false;
        }
        //diagonal left case
        int maxLeft = Math.min(r,c);
        for (int i = 1; i <= maxLeft; i++) {
            if(arr[r-1][c-1]) return false;
        }
        //diagonal right case
        int maxRight = Math.min(r,arr.length-1-c);
        for (int i = 1; i <=maxRight ; i++) {
            if(arr[r-i][c+i])return false;
        }
        return true;
    }
}
