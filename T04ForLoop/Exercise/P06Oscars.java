package T04ForLoop.Exercise;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double pointsSum = Double.parseDouble(scanner.nextLine());
        int judgesCount = Integer.parseInt(scanner.nextLine());

        // 2. Adding of the current estimation to the total points
        for (int i = 0; i < judgesCount; i++) {
            pointsSum = estimateActor(scanner, pointsSum);
            if (getNomineeCondition(actorName, pointsSum)) return;
        }

        // 3. Output printing
        double neededPoints = 1250.5 - pointsSum;
        System.out.printf("Sorry, %s you need %.1f more!", actorName, neededPoints);
    }

    private static double estimateActor(Scanner scanner, double pointsSum) {
        String currentJudgeName = scanner.nextLine();
        double currentPoints = Double.parseDouble(scanner.nextLine());
        double currentTotalPoints = (currentJudgeName.length() * currentPoints) / 2;
        pointsSum += currentTotalPoints;
        return pointsSum;
    }

    private static boolean getNomineeCondition(String actorName, double pointsSum) {
        if (pointsSum >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, pointsSum);
            return true;
        }
        return false;
    }
}
