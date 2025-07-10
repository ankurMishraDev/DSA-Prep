package collegeWorks;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
       int[] arr = {2,2,5,7,8,43,54,93,112};
       int target =2;
        int [] index = {-1,-1};
        int start =binarySearch(arr,target,true);
        int end = binarySearch(arr,target,false);
        index[0]=start;
        index[1]=end;
        System.out.println(Arrays.toString(index));
    }
    public static int binarySearch(int[] arr, int target,boolean firstIndex){
        int index= -1;

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]<target) start = mid+1;
            if(arr[mid]==target){
                index = mid;
                if(firstIndex){
                    end = mid-1;
                }else{
                    start=mid+1;
                }
            }

        }
        return index;
    }
}
