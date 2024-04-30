package T05WhileLoop.Exercise;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allSteps = 0;

        // 1. Reading multiple inputs until 2 condition - 1. a command or 2. 10000 steps
        while (allSteps < 10000) {
            // 1.1. Current line reading
            String currentLine = scanner.nextLine();

            // 1.2. Command receiving
            if (currentLine.equals("Going home")) {
                int lastSteps = Integer.parseInt(scanner.nextLine());
                allSteps += lastSteps;
                break;
            }

            // 1.3. Steps adding
            int currentSteps = Integer.parseInt(currentLine);
            allSteps += currentSteps;
        }

        // 2. Output printing - 2 cases:
        if (allSteps >= 10000) {
            int additionalSteps = allSteps - 10000;
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", additionalSteps);
        } else {
            int neededSteps = 10000 - allSteps;
            System.out.printf("%d more steps to reach goal.", neededSteps);
        }
    }
}
