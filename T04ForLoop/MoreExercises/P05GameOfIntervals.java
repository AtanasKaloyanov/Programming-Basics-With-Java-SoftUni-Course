package T04ForLoop.MoreExercises;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        int firstCounter = 0;
        int secondCounter = 0;
        int thirdCounter = 0;
        int fourthCounter = 0;
        int fifthCounter = 0;
        int sixthCounter = 0;
        int allCouter = 0;

        // 2. Sum and seven counters computation
        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber < 0 || currentNumber > 50) {
                sixthCounter++;
                allCouter++;
                sum /= 2;
                continue;
            }

            double bonus = 0;
            if (currentNumber <= 9) {
                firstCounter++;
                bonus = 0.2 * currentNumber;
                sum += bonus;
            } else if (currentNumber <= 19) {
                secondCounter++;
                bonus = 0.3 * currentNumber;
                sum += bonus;
            } else if (currentNumber <= 29) {
                thirdCounter++;
                bonus = 0.4 * currentNumber;
                sum += bonus;
            } else if (currentNumber <= 39) {
                fourthCounter++;
                sum += 50;
            } else {
                fifthCounter++;
                sum += 100;
            }

            allCouter++;
        }

        // 3. Percentages computation
        double firstPercentage = (firstCounter * 1.00 / allCouter) * 100;
        double secondPercentage = (secondCounter * 1.00 / allCouter) * 100;
        double thirdPercentage = (thirdCounter * 1.00 / allCouter) * 100;
        double fourthPercentage = (fourthCounter * 1.00 / allCouter) * 100;
        double fifthPercentage = (fifthCounter * 1.00 / allCouter) * 100;
        double sixthPercentage = (sixthCounter * 1.00 / allCouter) * 100;

        // 4. Output printing
        System.out.printf("%.2f\n", sum);
        System.out.printf("From 0 to 9: %.2f%%\n", firstPercentage);
        System.out.printf("From 10 to 19: %.2f%%\n", secondPercentage);
        System.out.printf("From 20 to 29: %.2f%%\n", thirdPercentage);
        System.out.printf("From 30 to 39: %.2f%%\n", fourthPercentage);
        System.out.printf("From 40 to 50: %.2f%%\n", fifthPercentage);
        System.out.printf("Invalid numbers: %.2f%%", sixthPercentage);
    }
}
