package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class CharScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar = ' ';

        System.out.print("Char input: ");
        inputChar = scanner.nextLine().charAt(0);
        System.out.printf("Input char: %c", inputChar);
    }
}
