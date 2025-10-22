package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Το πρόγραμμα μετατρέπει θερμοκρασία από βαθμούς Celsius
 * σε Fahrenheit και αντίστροφα.Εκτυπώνει το αποτέλεσμα της
 * μετατροπής δίνοντας κατάλληλο μήνυμα στον χρήστη.
 * Ο χρήστης επιλέγει πρώτα τον επιθυμητό τρόπο μετατροπής:
 * 1. Celsius σε Fahrenheit ή
 * 2. Fahrenheit σε Celsius
 * και κατόπιν του ζητείται η επιθυμητή θερμοκρασία που
 * θέλει να μετατρέψει. Ο χρήστης έχει τη δυνατότητα να
 * τερματίσει το πρόγραμμα πληκτρολογώντας 3 και κατόπιν Enter.
 *
 * @author Ηρακλής Καλαμάς
 */

public class TempConversion {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int choice, tempForConversion, convertedTemp;

        while (true) {
            // Εισαγωγή δεδομένων - Επιλογή τύπου μετατροπής
            System.out.println("Εισάγετε 1 για μετατροπή Celsius σε Fahrenheit");
            System.out.println("Εισάγετε 2 για μετατροπή Fahrenheit σε Celsius");
            System.out.print("Εισάγετε 3 για να τερματίσετε το πρόγραμμα: ");
            choice = scanner.nextInt();

            // Έλεγχος εξόδου
            if (choice == 3) {
                break;
            }

            // Έλεγχος έγκυρης επιλογής
            if (choice != 1 && choice != 2) {
                System.out.println("-------------------------------------------------------");
                System.out.println("Λάθος επιλογή! Παρακαλώ επιλέξτε 1, 2, ή 3.");
                System.out.println("-------------------------------------------------------");
                continue;
            }

            // Εισαγωγή δεδομένων - Θερμοκρασία
            System.out.print("Θερμοκρασία (παρακαλώ εισάγετε σε μορφή ακέραιου): ");
            tempForConversion = scanner.nextInt();

            // Επεξεργασία δεδομένων και εκτύπωση αποτελεσμάτων
            if (choice == 1) {
                convertedTemp = (tempForConversion * 9 / 5) + 32;

                System.out.println("-------------------------------------------------------");
                System.out.printf("%d βαθμοί Celsius είναι %d βαθμοί Fahrenheit%n",
                        tempForConversion, convertedTemp);
                System.out.println("-------------------------------------------------------");

            } else {

                convertedTemp = 5 * (tempForConversion - 32) / 9;

                System.out.println("-------------------------------------------------------");
                System.out.printf("%d βαθμοί Fahrenheit είναι %d βαθμοί Celsius%n",
                        tempForConversion, convertedTemp);
                System.out.println("-------------------------------------------------------");
            }
        }
    }
}