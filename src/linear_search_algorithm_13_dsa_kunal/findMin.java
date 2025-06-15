package linear_search_algorithm_13_dsa_kunal;

public class findMin {
    public static void main(String[] args) {
        int [] arr = {3,14651,312,2,43,-2,3543,4};
        System.out.println(min(arr));

    }
//    assume arr.length != 0
//    return the minimum value int in the array
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 7; i < arr.length; i++) {
            if ( ans > arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
}
