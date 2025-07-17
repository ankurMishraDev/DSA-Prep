package Sorting.lecFile;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr = {2,53,6,32,54,745,23,21,73};
        int [] arr2 ={1,7,5,4,6,2,3,8,9,11,14,12,10,13};
        int [] arr3 = {0,1};
        int [] arr4={4,3,2,7,8,2,3,1};
        cyclicSort(arr4);
        System.out.println(Arrays.toString(arr4));
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while (i<arr.length) {
            int actualIndex = arr[i]-1;
            if(arr[actualIndex]!= arr[i]){
                int temp = arr[i];
                arr[i]=arr[actualIndex];
                arr[actualIndex]=temp;
            }else i++;
        }
    }
}
