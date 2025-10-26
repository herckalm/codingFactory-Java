package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        boolean result;
        if ((num % 2) == 0) {
            result = num > 10;
        } else {
            result = false;
        }
        System.out.println(result);
    }
}
