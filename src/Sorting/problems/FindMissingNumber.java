package Sorting.problems;
// link: https://leetcode.com/problems/missing-number/
public class FindMissingNumber {
    public static void main(String[] args) {
        int []arr = {3,0,1};
        int []arr1= {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr1));
    }
    public static int missingNumber(int[] nums) {
        int i = 0;

        while(i<nums.length){
            int actualIndex =nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[actualIndex]){
                int temp = nums[actualIndex];
                nums[actualIndex] = nums[i];
                nums[i]= temp;
            }else i++;
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j) return j;
        }
        return nums.length;
    }
}

