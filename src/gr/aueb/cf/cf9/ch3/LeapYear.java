package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * This program checks for a year if it is a leap year.
 * A user can enter a year and the program responds to
 * the console with a message if the year is leap or not.
 *
 * @author Iraklis Kalamas
 */

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a year to check: ");

        int year = input.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) {
            System.out.printf("Year %d is a leap year", year);
        } else {
            System.out.printf("Year %d is not a leap year", year);
        }
        input.close();
    }
}
