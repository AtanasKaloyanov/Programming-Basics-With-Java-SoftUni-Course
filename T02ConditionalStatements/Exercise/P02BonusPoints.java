package T02ConditionalStatements.Exercise;

import java.util.Scanner;

public class P02BonusPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = Integer.parseInt(scanner.nextLine());
        double bonus = 0.00;
        double bonus2 = 0.00;
        double bonus3 = 0.00;

        if (points <= 100) {
            bonus = 5;

        } else if (points <= 1000) {
            bonus = 0.2 * points;
        } else if (points > 1000) {
            bonus = 0.1 * points;
        }
        if (points % 2 == 0) {
            bonus2 = 1;
        }
        if (points % 10 == 5) {
            bonus3 = 2;
        }
        System.out.println(bonus + bonus2 + bonus3);
        System.out.println(points + bonus + bonus2 + bonus3);
    }
}
