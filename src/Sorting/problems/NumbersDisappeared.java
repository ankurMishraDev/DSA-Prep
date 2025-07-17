package Sorting.problems;

import java.util.ArrayList;
import java.util.List;

// link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/1699451856/
public class NumbersDisappeared {
    public static void main(String[] args) {
        int [] arr ={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while(i<nums.length){
            int actualIndex =nums[i]-1;
            if(nums[i]!=nums[actualIndex]){
                int temp = nums[actualIndex];
                nums[actualIndex] = nums[i];
                nums[i]= temp;
            }else i++;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1)  list.add(j+1);
        }
        return list;
    }
}
