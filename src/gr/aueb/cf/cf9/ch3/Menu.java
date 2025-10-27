package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * This program presents to the user a menu of five options to choose from.
 * If a user selects an option between 1 and 4, an appropriate message is
 * displayed in the console, and the user is presented with the same options
 * again. If the user enters 5, the program exits, notifying the user of the
 * action. In any other case, a message is displayed notifying that the choice
 * was invalid, and the program continues as normal.
 */

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Αναζήτηση");
            System.out.println("4. Ενημέρωση");
            System.out.println("5. Έξοδος");
            System.out.print("Επιλέξτε μία από τις πιο πάνω επιλογές: ");
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (choice == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (choice == 3) {
                System.out.println("Επιλέξατε Αναζήτηση");
            } else if (choice == 4) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (choice == 5) {
                System.out.println("Επιλέξατε έξοδο. Το πρόγραμμα τερματίστηκε!");
            } else {
                System.out.println("Η επιλογή σας δεν ήταν έγκυρη.");
                System.out.println("Επιλέξτε μία από τις πιο πάνω επιλογές:");
            }
            System.out.println();
        } while (choice != 5);
        scanner.close();
    }
}
