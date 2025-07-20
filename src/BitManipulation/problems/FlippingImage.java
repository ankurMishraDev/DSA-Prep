package BitManipulation.problems;

import java.util.Arrays;

//link: https://leetcode.com/problems/flipping-an-image/submissions/1703003652/
public class FlippingImage {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        int [][] newArr = flipAndInvertImage(arr);
        System.out.println(Arrays.deepToString(newArr));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int [][]arr=new int[image.length][image.length];
        for(int i = 0; i<image.length;i++){
            for(int j = image.length-1,k=0;k<image.length&&j>=0;j--,k++){
                arr[i][k] =image[i][j]^1;
            }

        }
        return arr;
    }
}
