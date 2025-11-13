package gr.aueb.cf.cf9.ch5;

/**
 * We represent a large integer as an array
 * (each array position contains a digit of the integer)
 * This program adds 1 to the integer and displays the result
 * in a new array with the same or larger length of the original.
 * For example the integer 2784 ([2, 7, 8, 4] will become, after we
 * add 1 to it 2785 ([2, 7, 8, 5]) or the integer 9999 ([9, 9, 9, 9])
 * will become 10000 ([1, 0, 0, 0, 0]), and finally the integer 699
 * ([6, 9, 9]) will become 700 ([7, 0, 0])
 */

public class AddOneApp {

    public static void main(String[] args) {
        int[] arr1 = {9, 9, 9, 9, 9};
        printArray(addOne(arr1));

        int[] arr2 = {9, 9, 9, 9, 8};
        printArray(addOne(arr2));

        int[] arr3 = {6, 9, 9, 9};
        printArray(addOne(arr3));
    }

    public static int[] addOne(int[] arr) {
        if (arr == null) return null;
        int carry = 1, sum = 0;

        for (int i = arr.length - 1; i >= 0; --i) {
            sum = arr[i] + carry;
            arr[i] = sum % 10;
            carry = sum / 10;
            if (carry == 0) {
                break;
            }
        }
        if (carry == 1) {
            int[] arrOut = new int[arr.length + 1];
            arrOut[0] = carry;
            return arrOut;
        } else {
            return arr;
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}