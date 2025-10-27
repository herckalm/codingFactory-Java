package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Αναζήτηση");
            System.out.println("4. Ενημέρωση");
            System.out.println("5. Έξοδος");
            System.out.print("Επιλέξτε μία από τις πιο πάνω επιλογές: ");
            int choice = input.nextInt();
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
                break;
            } else {
                System.out.println("Η επιλογή σας δεν ήταν έγκυρη.");
                System.out.println("Επιλέξτε μία από τις πιο πάνω επιλογές:");
            }
        }
    }
}
