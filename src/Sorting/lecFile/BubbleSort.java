package Sorting.lecFile;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {2,53,6,32,54,745,23,21,73};
        int [] arr2 ={1,2,3,4,5,6,7,8,9};
        bubble(arr2);
        System.out.println(Arrays.toString(arr2));
    }
        static void bubble(int[] arr){
        boolean alreadySwapped;
            for (int i = 0; i < arr.length-1; i++) {
                alreadySwapped = false;
                for (int j = 1; j < arr.length-i ; j++) {
                    if (arr[j]<arr[j-1]){
                        int temp = arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                        alreadySwapped=true;
                    }
                }
                if(!alreadySwapped){break;}
            }
        }
}
