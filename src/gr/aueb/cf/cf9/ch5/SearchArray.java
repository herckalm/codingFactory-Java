package gr.aueb.cf.cf9.ch5;

/**
 * Checks if an element exists in the given array
 * and returns the index position of the element.
 * If the element does not exist or if the
 * array is null the program returns -1.
 */

public class SearchArray {
    public static void main(String[] args) {
        int[] grades = {12, 84, 26, 19, 28, 39, 48, 66, 93, 57, 7, 75};
        int position = 0;
        int value = 26;

        position = getElementPosition(grades, value);
        System.out.println(position);
        System.out.printf("The position of the value %d is at index %d", value, grades[position]);
    }

    public static int getElementPosition(int[] arr, int value) {
        if (arr == null) return -1;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
