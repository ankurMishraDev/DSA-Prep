package Recursions.problems;

import java.util.Scanner;

public class nKnights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of board");
        int n = sc.nextInt();
        boolean [][]arr = new boolean[n][n];
        knights(arr,0,0,n);
    }
    static void knights(boolean[][]arr, int r, int c, int target){
        if(target==0){
            print(arr);
            return ;
        }

        if(r==arr.length-1&&c== arr.length){
            return;
        }
        if(c==arr.length){
            knights(arr,r+1,0,target);
            return;
        }
        if(validPosition(arr,r,c)){
            arr[r][c]=true;
            knights(arr,r,c+1,target-1);
            arr[r][c]=false;
        }
        knights(arr,r,c+1,target);

    }
    static boolean validPosition(boolean[][]arr,int r, int c){
        if(insideBound(arr,r-2,c-1)){
            if(arr[r-2][c-1]){
                return false;
            }
        }
        if(insideBound(arr,r-2,c+1)){
            if(arr[r-2][c+1]){
                return false;
            }
        }
        if(insideBound(arr,r-1,c-2)){
            if(arr[r-1][c-2]){
                return false;
            }
        }
        if(insideBound(arr,r-1,c+2)){
            if(arr[r-1][c+2]){
                return false;
            }
        }
        return true;
    }
    static boolean insideBound(boolean[][]arr,int r, int c){
        return r >= 0 && r < arr.length && c >= 0 && c < arr.length;
    }
    static void print(boolean [][]arr){
        System.out.print("\n");
        for(boolean[] row : arr) {
            System.out.print("[");
            for(boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println("]");
        }
    }
}
