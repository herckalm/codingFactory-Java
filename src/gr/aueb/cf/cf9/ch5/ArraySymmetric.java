package gr.aueb.cf.cf9.ch5;

public class ArraySymmetric {
    public static void main(String[] args) {
        int[] myArray = {1, 4, 3, 2, 1};
        checkArray(myArray);
    }
    public static void checkArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int oppositeIndex = arr.length - 1 - i;
            if (arr[i] != arr[oppositeIndex]) {
                System.out.println("Array is not symmetric");
                return;
            }
        }
        System.out.println("Array is symmetric");
    }
}
