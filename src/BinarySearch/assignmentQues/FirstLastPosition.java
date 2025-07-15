package BinarySearch.assignmentQues;
//link https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstLastPosition {
    public static void main(String[] args) {
        int[] nums ={1,3,5,5,7,8,9,12,15,16};
        int target = 5;
        int [] index = {-1,-1};
        int start =binarySearch(nums,target,true);
        int end = binarySearch(nums,target,false);
        index[0]=start;
        index[1]=end;
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
