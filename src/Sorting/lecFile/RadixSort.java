package Sorting.lecFile;

import java.util.Arrays;

public class RadixSort {
    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        //count sort for every digit place
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    public static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }
        System.out.println("Count array for " + exp + Arrays.toString(count));

//        Step C — Cumulative Sum
//        What this does
//        Initially, count[d] = how many elements have digit d in the current place (exp).
//                After this loop, count[d] = how many elements have digit ≤ d.
//                This means count[d] tells you the last position index + 1 for numbers with digit d in the sorted output array.
//                Example for exp = 1 (units place):
//        Say count array after Step B is:
//        count = [1, 0, 3, 0, 2, 1, 0, 0, 0, 0]
//        Interpretation:
//        1 number has digit 0
//        0 numbers have digit 1
//        3 numbers have digit 2
//        After Step C:
//        count = [1, 1, 4, 4, 6, 7, 7, 7, 7, 7]
//        Now:
//        count[0] = 1 → digit 0 goes up to index 0 in output
//        count[2] = 4 → digit 2 goes up to index 3 in output
//        count[5] = 7 → digit 5 goes up to index 6 in output
//        (0-based indexing, so we’ll subtract 1 later when placing)
        for (int i = 1; i < 10; i++) {
            count[i] = count[i] + count[i - 1];
        }
        System.out.println("Updated count array " + Arrays.toString(count));

        /*
        Step D — Placing Elements into Output (Stable Sort)
Why it goes from right to left (n - 1 → 0)
Stability: If two numbers have the same digit in the current place, the one that appeared earlier in arr must remain earlier in output.
Going backward ensures that the earlier element in the original array is placed later in output for the same digit — which preserves order.

How it works:
For each element arr[i]:
Find the current digit:
int digit = (arr[i] / exp) % 10;

Find its final output position:
count[digit] tells us “how many elements have digit ≤ this digit” — meaning the next available slot is at count[digit] - 1.

Place the number:
output[count[digit] - 1] = arr[i];

Decrement count for this digit, so the next occurrence of the same digit goes into the previous slot.

Mini Example for exp = 1:
Before Step D:
arr     = [23, 64, 893, 2395, 98, 2, 53]
count   = [1, 1, 4, 4, 6, 7, 7, 7, 7, 7]
output  = [_, _, _, _, _, _, _]

Processing right to left:
i=6 → arr[6]=53 → digit=3 → count[3]=4
place at index 3 (4-1) → output=[_, _, _, 53, _, _, _]
decrement count[3] → 3

I=5 → arr[5]=2 → digit=2 → count[2]=4
place at index 3 (4-1) → output=[_, _, _, 2, _, _, _]
decrement count[2] → 3

I=4 → arr[4]=98 → digit=8 → count[8]=7
place at index 6 (7-1) → output=[_, _, _, 2, _, _, 98]
decrement count[8] → 6
…and so on until i=0.
        */
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        System.out.println("Output Array " + Arrays.toString(output));
        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {23, 64, 893, 2395, 98, 2, 53};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
