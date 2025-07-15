package Sorting.lecFile;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr = {2,53,6,32,54,745,23,21,73};
        int [] arr2 ={1,7,5,4,6,2,3,8,9,11,14,12,10,13};
        cyclicSort(arr2);
        System.out.println(Arrays.toString(arr2));
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
