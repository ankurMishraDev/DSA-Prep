package Sorting.lecFile;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {2,53,6,32,54,745,23,21,73};
        int [] arr2 ={1,2,3,4,5,6,7,8,9};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else break;
            }
        }
    }
}
