package BinarySearch.assignmentQues;
//link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class SearchInRotatedWithDuplicate {
    public static void main(String[] args) {
        int [] nums = {1,0,1,1,1};
        int [] nums1 = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1};
        int target = 2;
        System.out.println( bs(nums1, target));

    }
    public static boolean bs(int[] nums, int target){
        int start = 0, end = nums.length - 1;
        int rotatedIndex = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target==nums[mid]) return true;
            if(nums[start]==nums[mid]&&nums[mid]==nums[end]){
                start++;
                end--;
                continue;
            }
            if(nums[mid]<nums[mid-1]) {
                rotatedIndex = mid;
                break;
            }
            else if(nums[mid]<nums[start]) end = mid-1;
            else if(nums[mid]>=nums[mid+1]) {rotatedIndex = mid+1;break;}

        }
        end = rotatedIndex-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(nums[mid]>target){
                end =mid-1;
            }else if(nums[mid]==target){ return true;}
            else{
                start=mid+1;
            }
        }
        start = rotatedIndex;
        end = nums.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(nums[mid]>target){
                end =mid-1;
            }else if(nums[mid]==target){ return true;}
            else{
                start=mid+1;
            }
        }
        return false;
    }
}
