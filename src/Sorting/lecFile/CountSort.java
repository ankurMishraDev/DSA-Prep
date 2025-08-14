package Sorting.lecFile;

import java.util.ArrayList;
import java.util.Arrays;

public class CountSort {
    public static void countSort(int[] arr){
        int max = arr[0],idx = 0;
        for(int nums:arr){
            if(nums>max) max = nums;
        }
        int[] count = new int[max+1];
        for(int num: arr){
            count[num]++;
        }
        for (int i = 0; i <= max; i++) {
            while(count[i]>0){
                arr[idx]=i;
                idx++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,5,3,4,2,6};
        countSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
