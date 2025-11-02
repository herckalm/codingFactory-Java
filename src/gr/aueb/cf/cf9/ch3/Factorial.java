package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pleas give a number: ");
        int num = scanner.nextInt();
        int result = 1;

        while (num > 1) {
            result *= num;
            num -= 1;
        }
        System.out.println(result);
    }
}
