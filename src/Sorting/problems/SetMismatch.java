package Sorting.problems;

import java.util.Arrays;
// link: https://leetcode.com/problems/set-mismatch/
public class SetMismatch {
    public static void main(String[] args) {
        int [] nums ={4,3,2,7,8,2,6,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int actualIndex =nums[i]-1;
            if(nums[i]!=nums[actualIndex]){
                int temp = nums[actualIndex];
                nums[actualIndex] = nums[i];
                nums[i]= temp;
            }else i++;
        }

        int index = 0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1) {i = nums[j];index=j+1;}
        }
        return new int[]{i,index};
    }
}
