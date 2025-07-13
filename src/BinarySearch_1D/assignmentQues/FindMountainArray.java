package BinarySearch_1D.assignmentQues;

import javax.swing.*;
// link: https://leetcode.com/problems/find-in-mountain-array/description/
public class FindMountainArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,20};
        int [] arr2={3,4,5,6,1,2};
        int target = 2;
        System.out.println(bs(arr2,target));
    }
    public static int bs(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int peak = 0;
        while(start<end){
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end =mid;
            }else{ start=mid+1;}
        }
        peak = start;
        start= 0;
        end = peak;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]>target){
                end =mid-1;
            }else if(arr[mid]==target){ return mid;}
            else{
                start=mid+1;
            }
        }
        start= peak;
        end = arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]>target){
                start=mid+1;
            }else if(arr[mid]==target){ return mid;}
            else{
                end =mid-1;
            }
        }
        return -1;
    }
}
