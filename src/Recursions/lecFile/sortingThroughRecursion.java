package Recursions.lecFile;

import java.util.Arrays;

public class sortingThroughRecursion {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 3, 1};
        bubbleSort(arr, arr.length);
        System.out.println("Bubble sort: " + Arrays.toString(arr));
        int[] arr2 = {4, 5, 2, 3, 1};
        selectionSort(arr2, arr2.length - 1);
        System.out.println("Selection sort: " + Arrays.toString(arr2));
    }

    static void bubbleSort(int[] arr, int lastIndex) {
        int startIndex = 1;
        if (startIndex >= lastIndex) return;
        while (startIndex != lastIndex) {
            if (arr[startIndex] < arr[startIndex - 1]) {
                int temp = arr[startIndex];
                arr[startIndex] = arr[startIndex - 1];
                arr[startIndex - 1] = temp;
            }
            startIndex++;
        }
        bubbleSort(arr, --lastIndex);
    }

    static void selectionSort(int[] arr, int lastIndex) {
        int startIndex = 0;
        if (startIndex >= lastIndex) return;
        int maxItemIndex = maxItem(arr, startIndex, lastIndex);
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxItemIndex];
        arr[maxItemIndex] = temp;
        selectionSort(arr, --lastIndex);

    }

    static int maxItem(int[] arr, int s, int e) {
        int max = arr[0];
        while (s != e) {
            if (max < arr[s]) return s;
            s++;
        }
        return 0;
    }
}
