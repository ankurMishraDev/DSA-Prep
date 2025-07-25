package Sorting.problems;

import java.util.Arrays;
// link: https://leetcode.com/problems/first-missing-positive/
public class MissingPositiveNumber {
    public static void main(String[] args) {
        int [] arr ={4,3,2,7,8,2,3,1};
        int [] arr2={3,4,-1,1};
        int [] arr3={7,8,9,11,12};
        int []arr4 = {1};
        System.out.println(firstMissingPositive(arr4));
    }
    public static int firstMissingPositive(int[] nums) {
        int i = 0;

        while(i<nums.length){
            int actualIndex =nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[actualIndex]){
                int temp = nums[actualIndex];
                nums[actualIndex] = nums[i];
                nums[i]= temp;
            }else i++;
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1) return j+1;
        }
        return nums.length+1;
    }
}
