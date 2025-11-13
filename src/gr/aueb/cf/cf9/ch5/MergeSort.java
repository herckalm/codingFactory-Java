package gr.aueb.cf.cf9.ch5;

import static gr.aueb.cf.cf9.ch5.GenericPrintArray.printArray;
import static gr.aueb.cf.cf9.ch5.SwapArrayElements.swap;

public class MergeSort {
    public static void main(String[] args) {
        int[] arrayToSort = {55, 12, 87, 3, 91, 28, 70, 44, 16, 62, 5, 39};
        //int[] arrayToSort = {3, 5, 12, 16, 28, 39, 44, 55, 62, 70, 87, 91};

        //printArray(arrayToSort, 0, arrayToSort.length - 1);
        //int[] leftTest = mergeSortArray(arrayToSort, 0, arrayToSort.length - 1);
        //printArray(leftTest, 0, leftTest.length - 1);
        int[] rightTest = mergeSortArray(arrayToSort, 0, arrayToSort.length - 1);
        printArray(rightTest, 0, rightTest.length - 1);

    }

    public static int[] mergeSortArray(int[] arr, int first, int last) {
        if (last - first <= 0) {
            return new int[]{arr[first]};
        }
        int middle = (first + last) / 2;

        int[] left = mergeSortArray(arr, first, middle);
        int[] right = mergeSortArray(arr, middle + 1, last);

        return right;
        //return merge(left, right);
    }

}
