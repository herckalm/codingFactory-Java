package gr.aueb.cf.cf9.ch5;


public class AddOneApp {

    public static int[] addOne(int[] arr) {
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }

        int[] arrOut = new int[n + 1];
        arrOut[0] = 1;
        return arrOut;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3}; // Represents 123
        System.out.print("Input 1 (123): ");
        printArray(input1);
        int[] result1 = addOne(input1);
        System.out.print("Result 1 (124): ");
        printArray(result1);
        System.out.println("---");

        // --- Test Case 2: Carry-over in the middle ---
        int[] input2 = {4, 5, 9}; // Represents 459
        System.out.print("Input 2 (459): ");
        printArray(input2);
        int[] result2 = addOne(input2);
        System.out.print("Result 2 (460): ");
        printArray(result2);
        System.out.println("---");

        // --- Test Case 3: Carry-over to the beginning (array size increases) ---
        int[] input3 = {9, 9, 9}; // Represents 999
        System.out.print("Input 3 (999): ");
        printArray(input3);
        int[] result3 = addOne(input3);
        // The resulting array is now larger (length 4)
        System.out.print("Result 3 (1000): ");
        printArray(result3);
        System.out.println("---");

        // --- Test Case 4: Single digit ---
        int[] input4 = {7}; // Represents 7
        System.out.print("Input 4 (7): ");
        printArray(input4);
        int[] result4 = addOne(input4);
        System.out.print("Result 4 (8): ");
        printArray(result4);
    }
}