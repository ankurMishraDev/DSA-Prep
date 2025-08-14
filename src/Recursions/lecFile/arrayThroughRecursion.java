package Recursions.lecFile;

import java.util.ArrayList;

public class arrayThroughRecursion {
    public static void main(String[] args) {
        int []arr = {1,3,15,6,7,7};
        System.out.println("Array is sorted: "+ arrayCheck(arr,0));
        System.out.println(linearSearch(arr,0,6));
        linearSearchWithDuplicates(arr,0,7);
        System.out.println(list);
        System.out.println(searchDuplicates(arr,0,7));
        int []arr1 = {5,6,7,8,10,1,2,3,4};
        System.out.println(bsRecursion(arr1, 2,0,arr1.length-1));
    }
    static boolean arrayCheck(int[]arr,int index){
        if(index+1==arr.length) return true;
        if(arr[index]<=arr[index+1]){
           return arrayCheck(arr,++index);
        }else return false;
    }

    static int linearSearch(int [] arr, int index, int target){
        if(index==arr.length) return -1;
        if(arr[index]==target) return index;
        return linearSearch(arr,++index, target);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void linearSearchWithDuplicates(int []arr, int index, int target){
        if(index==arr.length) return;
        if(arr[index]==target) list.add(index);
        linearSearchWithDuplicates(arr, ++index, target);
    }

    static ArrayList<Integer> searchDuplicates(int[]arr, int index, int target){
        ArrayList<Integer> searchList = new ArrayList<>();
        if(index==arr.length) return searchList;
        if(arr[index]==target) searchList.add(index);
        ArrayList<Integer> previousList = searchDuplicates(arr,++index,target);
        searchList.addAll(previousList);

        return searchList;
    }

    static int bsRecursion(int []arr, int target, int s, int e){
        if(s>e) return -1;
        int m = s+(e-s)/2;
        if(arr[m]==target) return m;
        if (arr[m]>=arr[s]) {
            if (arr[s] <= target && arr[m] >= target) return bsRecursion(arr, target, s, m - 1);
            else return bsRecursion(arr, target, m+1, e);
        }else if(arr[m]<=target&&arr[e]>=target) return bsRecursion(arr, target, m+1, e);
        return bsRecursion(arr, target, s, m - 1);
    }
}
