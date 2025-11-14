package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get combination size
        System.out.print("Enter the number of elements in each combination: ");
        int r = scanner.nextInt();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int n = arr.length;

        // Validate input
        if (r > n || r <= 0) {
            System.out.println("Invalid combination size!");
            scanner.close();
            return;
        }

        // Generate and print combinations
        System.out.println("\nDistinct combinations:");
        int[] combination = new int[r];
        generateCombinations(arr, combination, 0, r);

        scanner.close();
    }

    /**
     * Recursively generates all combinations
     *
     * @param arr         - input array
     * @param combination - current combination being built
     * @param index       - current index in combination
     * @param r           - size of combination
     */
    private static void generateCombinations(int[] arr, int[] combination, int index, int r) {
        // Base case: combination is complete
        if (index == r) {
            printCombination(combination);
            return;
        }

        // Recursive case: try all elements from start to end
        for (int i = 0; i <= arr.length - (r - index); i++) {
            combination[index] = arr[i];
            generateCombinations(arr, combination, index + 1, r);
            i++;
        }
    }

    /**
     * Prints a combination in the format (a, b, c, ...)
     *
     * @param combination - array representing the combination
     */
    private static void printCombination(int[] combination) {
        System.out.print("(");
        for (int i = 0; i < combination.length; i++) {
            System.out.print(combination[i]);
            if (i < combination.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");
    }

}


/*
        // Get array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Get array elements
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
 */
