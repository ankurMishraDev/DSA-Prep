package Sorting.problems;

import java.util.ArrayList;
import java.util.List;

// link: https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class AllDuplicateNumbers {
    public static void main(String[] args) {
        int [] nums ={4,3,2,7,8,2,6,1};
        System.out.println(findDuplicates(nums));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int actualIndex =nums[i]-1;
            if(nums[i]!=nums[actualIndex]){
                int temp = nums[actualIndex];
                nums[actualIndex] = nums[i];
                nums[i]= temp;
            }else i++;
        }
        List<Integer> list = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1) list.add(nums[j]);
        }
        return list;
    }
}
