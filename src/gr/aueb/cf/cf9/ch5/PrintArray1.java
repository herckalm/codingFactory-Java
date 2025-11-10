package gr.aueb.cf.cf9.ch5;

public class PrintArray1 {
    public static void main(String[] args) {
        int[] ages = {20, 25, 30, 33, 45, 19, 90, 55};
        printArray(ages, 0, ages.length - 1);
        printArray(ages, 2, ages.length - 3);
    }

    public static void printArray(int[] arr, int low, int high) {
        if ((low < 0) || (high > arr.length - 1)) return;
        for (int i = low; i <= high; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
