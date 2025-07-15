package Sorting.lecFile;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {2,53,6,32,54,745,23,21,73};
        int [] arr2 ={1,2,3,4,5,6,7,8,9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            int largeEleIdx = arr.length -i-1;
            int maxEleIdx = maxElement(arr,0,largeEleIdx);
            int temp = arr[maxEleIdx];
            arr[maxEleIdx]=arr[largeEleIdx];
            arr[largeEleIdx]=temp;
        }
    }
    static int maxElement(int[]arr, int start , int end){
        int max = arr[start];
        int index=0;
        for (int i = start; i <= end; i++) {
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}
