package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class CombinationsGenerator {

    private static int combinationCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Get array elements
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Get combination size
        System.out.print("Enter the number of elements in each combination: ");
        int r = scanner.nextInt();

        // Validate input
        if (r > n || r <= 0) {
            System.out.println("Invalid combination size!");
            scanner.close();
            return;
        }

        // Generate and print combinations
        System.out.println("\nDistinct combinations:");
        int[] combination = new int[r];
        combinationCount = 0;
        generateCombinations(arr, combination, 0, 0, r);

        // Print newline if there are remaining combinations not ending at 7
        if (combinationCount % 7 != 0) {
            System.out.println();
        }

        scanner.close();
    }

    /**
     * Recursively generates all combinations
     *
     * @param arr         - input array
     * @param combination - current combination being built
     * @param start       - starting index in arr
     * @param index       - current index in combination
     * @param r           - size of combination
     */
    private static void generateCombinations(int[] arr, int[] combination,
                                             int start, int index, int r) {
        // Base case: combination is complete
        if (index == r) {
            printCombination(combination);
            return;
        }

        // Recursive case: try all elements from start to end
        for (int i = start; i <= arr.length - (r - index); i++) {
            combination[index] = arr[i];
            generateCombinations(arr, combination, i + 1, index + 1, r);
        }
    }

    /**
     * Prints a combination in the format (a, b, c, ...)
     * Prints 7 combinations per line, separated by commas
     *
     * @param combination - array representing the combination
     */
    private static void printCombination(int[] combination) {
        combinationCount++;

        System.out.print("(");
        for (int i = 0; i < combination.length; i++) {
            System.out.print(combination[i]);
            if (i < combination.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(")");

        // Print comma and space after each combination except the last on the line
        if (combinationCount % 7 != 0) {
            System.out.print(", ");
        } else {
            System.out.println();
        }
    }
}