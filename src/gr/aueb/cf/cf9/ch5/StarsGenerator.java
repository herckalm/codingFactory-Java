package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * This program gets an input from the user (an integer number)
 * and prints to the console the character "*" in various forms
 * and number (i.e. 10 stars horizontally or 5 columns of 5 stars
 * each etc.). The program has 6 options for the user to choose.
 * The sixth option (number 6) terminates the program.
 *
 * @author Iraklis Kalamas
 */

public class StarsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selection, starsNumber;
        boolean isRunning = true;

        while (isRunning) {
            Menu();
            selection = scanner.nextInt();
            switch (selection) {
                case 1, 2, 3, 4, 5 -> {
                    System.out.print("Please enter the number of stars (n): ");
                    starsNumber = scanner.nextInt();
                    while (starsNumber < 10) {
                        System.out.print("ERROR: Number of stars should be at least 10. Enter again: ");
                        starsNumber = scanner.nextInt();
                    }
                    starsPrinting(selection, starsNumber);
                }
                case 6 -> isRunning = false;
            }
        }
    }

    /**
     * Prints the main menu of the app with 6 options
     * and asks the user to select an action.
     */
    public static void Menu() {
        System.out.println("1. Print n stars horizontally");
        System.out.println("2. Print n stars vertically");
        System.out.println("3. Print n rows with n stars");
        System.out.println("4. Print n rows with 1 to n stars");
        System.out.println("5. Print n rows with n to 1 stars");
        System.out.println("6. Exit the program");
        System.out.println("---------------------------------");
        System.out.print("Please choose an action from above: ");
    }

    /**
     * Prints stars to the console according to the users selections
     *
     * @param selectionType = type of printing
     * @param numberOfStars = number of stars to be printed
     */
    public static void starsPrinting(int selectionType, int numberOfStars) {
        switch (selectionType) {
            case 1 -> {
                printHorizontalStars(numberOfStars);
                System.out.println();
            }
            case 2 -> { // Print each star on a separate vertical line
                for (int i = 1; i <= numberOfStars; ++i) {
                    System.out.println("*");
                }
            }
            case 3 -> { // Print a square pattern
                for (int i = 1; i <= numberOfStars; ++i) {
                    printHorizontalStars(numberOfStars);
                    System.out.println();
                }
            }
            case 4 -> {
                // Print an ascending triangle pattern:
                // Row 1 has 1 star, Row 2 has 2 stars, ..., Row n has n stars
                for (int i = 1; i <= numberOfStars; ++i) {
                    printHorizontalStars(i);
                    System.out.println();
                }
            }
            case 5 -> {
                // Print a descending reverse triangle pattern:
                // Row 1 has n stars, Row 2 has n-1 stars, ..., Row n has 1 star
                for (int i = numberOfStars; i >= 1; --i) {
                    printHorizontalStars(i);
                    System.out.println();
                }
            }
        }
        System.out.println("---------------------------------");
    }

    /**
     * print a horizontal line of n stars
     *
     * @param n = number of stars to be printed
     */
    public static void printHorizontalStars(int n) {
        for (int i = 1; i <= n; ++i) {
            System.out.print("*");
        }
    }
}


