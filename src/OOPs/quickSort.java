package OOPs;

import java.util.Arrays;
import java.util.Scanner;

public class quickSort {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the elements of array");
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt(), e = in.nextInt(),f = in.nextInt();
            int[] arr = {a,b, c ,d,e,f};
//        sort(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        }

        static void sort(int[] nums, int low, int hi) {
            if (low >= hi) {
                return;
            }

            
            int s = low;
            int e = hi;
            int m = s + (e - s) / 2;
            int pivot = nums[m];

            while (s <= e) {

                // also a reason why if its already sorted it will not swap
                while (nums[s] < pivot) {
                    s++;
                }
                while (nums[e] > pivot) {
                    e--;
                }

                if (s <= e) {
                    int temp = nums[s];
                    nums[s] = nums[e];
                    nums[e] = temp;
                    s++;
                    e--;
                }
            }

            // now my pivot is at correct index, please sort two halves now
            sort(nums, low, e);
            sort(nums, s, hi);
        }
    }

