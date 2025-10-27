package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class EuroConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int EURO_TO_USD_CONVERSION = 95;
        int amountInEuros = 0;
        int convertedAmount = 0;
        int amountInUsd = 0;
        int amountInCents = 0;

        System.out.print("Please provide an amount in Euros for conversion: ");

        amountInEuros = scanner.nextInt();
        convertedAmount = amountInEuros * EURO_TO_USD_CONVERSION;
        amountInUsd = convertedAmount / 100;
        amountInCents = convertedAmount % 100;

        if (amountInEuros <= 0) {
            System.out.println("Please provide an amount greater than 0");
        } else if (amountInEuros == 1) {
            System.out.printf("%d Euro is equal to %d cents.", amountInEuros, amountInCents);
        } else {
            System.out.printf("%d Euros is equal to %d US dollars and %d cents.", amountInEuros, amountInUsd, amountInCents);
        }
    }
}
