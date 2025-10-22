package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * The program converts 3 integers into a date format.
 * For example, given the integers 7, 12, and 2025, the output should be 7/12/2025.
 * The user is prompted to enter a valid day (1-31), a valid month (1-12),
 * and a year (4 digits). The program checks if each input is within the limits shown above
 * and if all inputs are valid it prints an appropriate message in the console.
 * If any of the inputs (day or month) are invalid, the user is provided with a message
 * to correct that invalid input. If the user inputs 0 at any time, the program exits.
 *
 * @author Ηρακλής Καλαμάς
 */

public class NumberToDate {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int day, month, year;

        // Continues until the user chooses to exit (by entering 0 for day)
        while (true) {

            // day loop
            while (true) {
                System.out.print("Εισάγετε ημέρα (1 - 31) ή 0 για έξοδο: ");
                day = scanner.nextInt();
                // Check for program exit
                if (day == 0) {
                    // Exit the entire outer loop
                    break;
                }
                // Check for valid day range
                if (day < 1 || day > 31) {
                    System.out.println("Λάθος επιλογή ημέρας! Παρακαλώ επιλέξτε 1 έως 31.");
                    continue; // Repeat the day loop
                }
                // day ok continue to month loop
                break;
            }

            // Check if the outer loop needs to exit (only happens if day was 0)
            if (day == 0) {
                break;
            }

            // month loop
            while (true) {
                System.out.print("Εισάγετε μήνα (1-12): ");
                month = scanner.nextInt();
                // Check for program exit
                if (month == 0) {
                    // Exit the entire outer loop
                    break;
                }
                // Check for valid month range
                if (month < 1 || month > 12) {
                    System.out.println("Λάθος επιλογή μήνα! Παρακαλώ επιλέξτε 1 έως 12.");
                    continue; // Repeat the month loop
                }
                // month ok continue to year
                break;
            }

            // Check if the outer loop needs to exit (only happens if month was 0)
            if (month == 0) {
                break;
            }

            // year input
            System.out.print("Εισάγετε έτος (π.χ. 2025): ");
            year = scanner.nextInt();
            // Check if the outer loop needs to exit (only happens if year was 0)
            if (year == 0) {
                break;
            }

            // Εκτύπωση μετατροπής σε ημερομηνία
            System.out.printf("Επιτυχής Καταχώρηση: %d/%d/%d%n", day, month, year);
            System.out.println("------------------------------------------");
        }
        scanner.close();
    }
}