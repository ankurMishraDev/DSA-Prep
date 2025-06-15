package Arrays.lecFile;

public class maxArrEle2 {
    public static void main(String[] args) {
        int[] arr = {5,1,3,42,84,61,4213,5132,13,42,154,5,12,1};
        System.out.println(maxRange(arr, 9, 13));
    }
    static int maxRange(int[] arr, int start , int end){
        int maxvalue = start;
        for (int i = start; i <= end ; i++) {
            if ( arr[i]>maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }
}
