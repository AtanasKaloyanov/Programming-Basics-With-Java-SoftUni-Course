package T02ConditionalStatements.Exercise;

import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int freeTime = Integer.parseInt(scanner.nextLine());

        // 2. Computing of the lunchTime, the restTime and the sum of the episodeDuration, lunchTime
        // and restTime
        double lunchTime = freeTime / 8.0;
        double restTime = freeTime / 4.0;
        double sumTime = lunchTime + restTime + episodeDuration;

        // 3. Output printing
        if (sumTime <= freeTime) {
            double leftTime = Math.ceil(freeTime - sumTime);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", movieName, leftTime);
        } else {
            double neededTime = Math.ceil(sumTime - freeTime);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", movieName, neededTime);
        }
    }
}
