package Sorting.lecFile;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[]arr= {3,6,4,7,5,45,3,54,754};
        int []arr2={1,53,6,44,7,34,5};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        mergeSortInplace(arr2,0, arr2.length);
        System.out.println(Arrays.toString(arr2));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[]left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[]right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[]left,int[]right){
        int[] mix = new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length){
            if(left[i]<right[j]){
                mix[k]= left[i];
                i++;
            }else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while(j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }
    static void mergeSortInplace(int []arr, int s, int e){
        if(e-s==1){
            return;
        }
        int m = (s+e)/2;
        mergeSortInplace(arr,s,m);
        mergeSortInplace(arr,m,e);
        mergeInplace(arr,s,m,e);
    }
    static void mergeInplace(int[]arr, int s, int m, int e){
        int []mix = new int[e-s];
        int i =s, j=m, k=0;
        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]= arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int l = 0; l < mix.length; l++) {
            arr[s+l]=mix[l];
        }
    }
}
