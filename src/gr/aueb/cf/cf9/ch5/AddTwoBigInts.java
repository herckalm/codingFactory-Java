package gr.aueb.cf.cf9.ch5;

/**
 * We represent two large integers as arrays
 * (each array position contains a digit of the integer)
 * This program adds the two array  and displays to
 * represent the sum of the two integers.
 */

public class AddTwoBigInts {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 0, 0};
        int[] arr2 = {1, 0};
        printArray(addTwoInts(arr1, arr2));

        int[] arr3 = {1, 0, 0, 0};
        int[] arr4 = {1, 0, 7, 8};
        printArray(addTwoInts(arr3, arr4));

        int[] arr5 = {9, 6, 5, 3};
        int[] arr6 = {2, 8, 9, 8, 4, 7};
        printArray(addTwoInts(arr5, arr6));

        int[] arr7 = {9, 6, 5, 3, 4, 6, 2, 7, 6, 4, 5, 8, 9, 2, 3, 9, 4, 6, 8, 5};
        int[] arr8 = {2, 8, 9, 8, 4, 7, 3, 6, 2, 7, 0, 4, 3, 8, 9, 2, 1, 9, 5, 3};
        printArray(addTwoInts(arr7, arr8));
    }

    /**
     * Adds two large integers represented as arrays, handling
     * arrays of potentially different sizes and dynamic result sizing.
     *
     * @param arr1 The first integer array.
     * @param arr2 The second integer array.
     * @return The array representing the sum of the two integers.
     */
    public static int[] addTwoInts(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) return new int[0];

        //Determine the larger array (to use as the base for the resulted size)
        int lenArr1 = arr1.length;
        int lenArr2 = arr2.length;
        int maxLength = Math.max(lenArr1, lenArr2);

        //Initialize needed variables
        int[] arrOut = new int[maxLength + 1];
        int carry = 0, sum = 0;

        //Create pointers for the current index in each array
        int p1 = lenArr1 - 1;
        int p2 = lenArr2 - 1;
        int pOut = maxLength;

        while (p1 >= 0 || p2 >= 0 || carry == 1) {
            //Get digit for arr1 (or 0 if p1 is less than 0)
            int digit1 = (p1 >= 0) ? arr1[p1] : 0;
            //Get digit for arr2 (or 0 if p2 is less than 0)
            int digit2 = (p2 >= 0) ? arr2[p2] : 0;

            sum = digit1 + digit2 + carry;

            //Store the calculated digit to the output array
            arrOut[pOut] = sum % 10;
            carry = sum / 10;

            p1--;
            p2--;
            pOut--;
        }

        //Check if the most significant digit (index 0) of the arrOut is 0
        if (arrOut[0] == 0) {
            int[] arrOut_0 = new int[maxLength];
            System.arraycopy(arrOut, 1, arrOut_0, 0, maxLength);
            return arrOut_0;
        } else { // if arrOut[0] is 1
            return arrOut;
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
