package BinarySearch.assignmentQues;

// link: https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakIndexMountain {
    public static void main(String[] args) {
        int [] arr = {0,10,5,2};
        System.out.println(bs(arr));
    }
    public static int bs(int []arr){
        int index = 0;
        int start = 0;
        int end = arr.length-1;
        int mid = start +(end-start)/2;
        do{
            if(arr[mid] >arr[mid+1] && arr[mid] >arr[mid-1]){
                return mid;
            }
            if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1]){
                end = mid;
            }
            if(arr[mid]<arr[mid+1] && arr[mid]>arr[mid-1]){
                start =mid;
            }
            mid = start +(end-start)/2;
        }while (mid <= mid+1);
        return index;
    }
}

// static int bs(int[] arr ){
//        int start=0;
//        int end= arr.length-1;
//        int max = 0;
//        int mid = start +( end-start )/2;
//
//
//        while(arr[mid-1]<arr[mid]){
//
//            if(arr[mid-1]<arr[mid]){
//                start=mid;
//            }
//            else{
//                end=mid;
//            }
//             mid = start +( end-start )/2;
//             if(mid==start){
//                if(arr[mid]>arr[end]){
//                    max = mid;
//                    break;
//                }
//                else{
//                    max = end;
//                    break;
//                }
//             }
//             max=mid-1;
//        }
//
//         while(arr[mid-1]>arr[mid]){
//            end=mid;
//
//             mid = start +( end-start )/2;
//             if(mid==end){
//                if(arr[mid]>arr[end]){
//                    max = mid;
//                    break;
//                }
//                else{
//                    max = end;
//                    break;
//                }
//             }
//             max=mid-1;
//        }
//        return max;
//    }
