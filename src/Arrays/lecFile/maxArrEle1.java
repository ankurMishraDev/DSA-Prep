package Arrays.lecFile;

public class maxArrEle1 {
    public static void main(String[] args) {
        int[] arr = {1,2,45,1,3,84,1,3,84,13};
        System.out.println(max(arr));
    }
//    imagine that array isn't empty
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> maxVal ){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
