package gr.aueb.cf.cf9.ch5;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CombinationsApp {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int[] arr= {1, 2, 3,, 4, 5, 6, 7 ,8 ,9, 10};
        int m = 0;
        int[] row = new int[m];
        int size = arr.length - m;
        int counter = 0;

        System.out.print("Please give digits of each combination ");
        System.out.println();
        m = scanner.nextInt();

        for (int i = 0; i <= size - m; ++i) {
            for (int j = i + 1; j < size - m; ++j) {

            }
        }
    }

}
