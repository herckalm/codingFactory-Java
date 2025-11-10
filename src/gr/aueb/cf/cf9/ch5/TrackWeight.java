package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class TrackWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentWeight = 0;
        int consecutiveFailures = 0;
        int largestLoad = 0;

        System.out.print("Enter load weights: ");

        while (consecutiveFailures < 3) {
            System.out.printf("\nCurrent total weight: %d tons\n", currentWeight);
            System.out.print("Enter next load weight: ");
            int newLoad = scanner.nextInt();

            if (currentWeight + newLoad <= 25) {
                currentWeight += newLoad;
                consecutiveFailures = 0;


            } else {
                consecutiveFailures++;
                int remainingCapacity = 25 - currentWeight;
                if (newLoad > largestLoad) {
                    largestLoad = newLoad;
                }
                System.out.println(largestLoad);
            }
        }
    }
}

