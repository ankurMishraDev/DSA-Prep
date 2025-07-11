package BinarySearch_1D.assignmentQues;

import java.util.Scanner;

// link: https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArrayElements {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,7,7,7,8,13,15,18,24,26,27,27,36,39,41,47,49,51,52,53,55,56};
        System.out.println("Enter the element to search: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println("Position of the target element is: "+bs(arr,target));

    }
    static int bs(int[]arr,int target){
        int start =0;
        int end = 1;
        while (start<=end){
            if(target>=arr[start]&&target<=arr[end]) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > target) end = mid - 1;
                else if (arr[mid] < target) start = mid + 1;
                else {
                    return mid;
                }
            }else{
                start =end+1;
                end = end*2;
            }
        }
        return -1;
    }
}
