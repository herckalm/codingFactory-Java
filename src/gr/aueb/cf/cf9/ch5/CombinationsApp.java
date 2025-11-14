package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

import static gr.aueb.cf.cf9.ch5.BubbleSort.bubbleSortArray;

public class CombinationsApp {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] sortedArr = bubbleSortArray(arr);
        int counter = 0;

        System.out.print("Please give digits of each combination ");
        int m = scanner.nextInt();
        int[] row = new int[m];
        int size = sortedArr.length - m;

        for (int i = 0; i <= size - m; ++i) {
            for (int j = i + 1; j <= size - m + 1; ++j) {
                for (int k = j + 1; k <= size - m + 2; ++k) {
                    for (int l = k + 1; l <= size - m + 3; ++l) {
                        counter++;
                        row[0] = sortedArr[i];
                        row[1] = sortedArr[j];
                        row[2] = sortedArr[k];
                        row[3] = sortedArr[l];
                        System.out.printf("%4d. \t%d\t%d\t%d\t%d\n", counter, row[0], row[1], row[2], row[3]);
                    }
                }
            }
        }
    }
}
