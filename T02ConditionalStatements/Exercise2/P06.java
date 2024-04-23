package T02ConditionalStatements.Exercise2;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        // 1. Input Reading
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double secondsForAMeter = Double.parseDouble(scanner.nextLine());

        // 2. Delay computation
        double delaysNumber = Math.floor(meters / 15);
        double delaySeconds = delaysNumber * 12.5;

        // 3. Time computation with the delay
        double seconds = meters * secondsForAMeter;
        double secondsWithDelay = seconds + delaySeconds;

        // 4. Result printing
        if (secondsWithDelay < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", secondsWithDelay);
        } else {
            double neededSeconds = secondsWithDelay - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", neededSeconds);
        }
    }
}
