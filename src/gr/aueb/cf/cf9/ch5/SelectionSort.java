package gr.aueb.cf.cf9.ch5;

import static gr.aueb.cf.cf9.ch5.GenericPrintArray.printArray;
import static gr.aueb.cf.cf9.ch5.SwapArrayElements.swap;

public class SelectionSort {
    public static void main(String[] args) {
        //int[] arrayToSort = {55, 12, 87, 3, 91, 28, 70, 44, 16, 62, 5, 39};
        int[] arrayToSort = {3, 5, 12, 16, 28, 39, 44, 55, 62, 70, 87, 91};
        System.out.println("Input array:");
        printArray(arrayToSort, 0, arrayToSort.length - 1);
        System.out.println("Sorted array:");
        printArray(selectionSortArray(arrayToSort), 0, arrayToSort.length - 1);
    }

    public static int[] selectionSortArray(int[] arr) {
        int arrLength = arr.length;
        // used to break from the inner loop if array is already sorted
        boolean swapped = true;

        for (int i = 0; i < arrLength - 1; ++i) {
            swapped = false;
            int currentIndex = i;
            for (int j = i + 1; j < arrLength; ++j) {
                if (arr[j] < arr[currentIndex]) {
                    currentIndex = j;
                    swapped = true;
                }
                System.out.println(i);
            }
            if (!swapped) break;
            if (currentIndex != i) {
                swap(arr, i, currentIndex);
            }
        }
        return arr;
    }
}
