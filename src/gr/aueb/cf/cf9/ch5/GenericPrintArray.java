package gr.aueb.cf.cf9.ch5;

public class GenericPrintArray {
    public static void printArray(int[] arr, int low, int high) {
        if ((low < 0) || (high > arr.length - 1)) return;
        System.out.print("[");
        for (int i = low; i <= high; ++i) {
            if (i < high) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
    }
}


