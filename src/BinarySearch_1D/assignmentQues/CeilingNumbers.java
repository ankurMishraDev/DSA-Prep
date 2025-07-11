package BinarySearch_1D.assignmentQues;
//link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
//find the ceiling of a given number
//ceiling = smallest element in array > or == target
public class CeilingNumbers {
    public static void main(String[] args) {
        char[] nums ={'x','y','y'};
        char target = 'z';
        char index = binarySearch(nums,target);
    }
    public static char binarySearch(char[] arr, char target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else  start = mid+1;
        }
        return arr[start % arr.length];
    }
}
