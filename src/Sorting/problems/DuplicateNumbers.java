package Sorting.problems;
// link: https://leetcode.com/problems/find-the-duplicate-number/
public class DuplicateNumbers {
    public static void main(String[] args) {
        int [] arr ={4,3,2,7,8,2,6,1};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int actualIndex =nums[i]-1;
            if(nums[i]!=nums[actualIndex]){
                int temp = nums[actualIndex];
                nums[actualIndex] = nums[i];
                nums[i]= temp;
            }else i++;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1) return nums[j];
        }
        return nums.length;
    }
}
