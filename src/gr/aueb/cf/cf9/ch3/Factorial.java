package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give a number: ");
        int num = scanner.nextInt();
        int result = 1;

        while (num > 1) {
            result *= num;
            num--;
        }
        System.out.println(result);
    }
}
