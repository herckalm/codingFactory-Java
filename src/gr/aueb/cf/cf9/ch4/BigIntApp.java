package gr.aueb.cf.cf9.ch4;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ZERO;
        BigInteger result = BigInteger.ONE;

        System.out.print("Please insert two ints: ");
        a = BigInteger.valueOf(scanner.nextInt());
        b = BigInteger.valueOf(scanner.nextInt());

        for (int i = 0; i <= b.intValue(); i++) {
            result = result.multiply(a);
        }

        System.out.printf("%d^%d = %,d", a, b, result);
    }
}
