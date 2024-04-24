package T02ConditionalStatements.Exercise;

import java.util.Scanner;

public class P02BonusPoints {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double bonus;

        // 2. Bonus computing
        if (number <= 100) {
            bonus = 5;
        } else if (number <= 1000) {
            bonus = 0.2 * number;
        } else {
            bonus = 0.1 * number;
        }

        if (number % 2 == 0) {
            bonus += 1;
        } else if (number % 10 == 5) {
            bonus += 2;
        }

        // 3 Assigning the number because of adding of bonus
        double finalNumber = number;
        finalNumber += bonus;

        // 4. Result printing
        System.out.println(bonus);
        System.out.println(finalNumber);
    }
}
