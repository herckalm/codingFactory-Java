package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * The program accepts an integer from the user
 * in the range 1 to 7 and returns the corresponding
 * day to the console. We assume that the week starts
 * at Monday (1 = Monday). If the user enters an integer
 * outside the range a message is given that informs
 * about the error and the user must enter another
 * integer.
 *
 * @author Iraklis Kalamas
 */

public class NumberToDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDay = 0;

        while (true) {
            System.out.print("Please insert an integer (1 to 7, or 0 to quit): ");

            numberOfDay = scanner.nextInt();

            if (numberOfDay == 0) {
                System.out.println("Exiting program.");
                break;
            }

            switch (numberOfDay) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Error: The integer must be in the range 1 to 7.");
            }
        }
        scanner.close();
    }
}
