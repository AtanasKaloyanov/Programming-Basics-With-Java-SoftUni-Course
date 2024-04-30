package T05WhileLoop.Exercise;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. 4 variables initialising via while cycle
        String currentName = "";
        int badGradesN = 0;
        double gradesSum = 0;
        int allGradesCounter = 0;
        String currentLine = scanner.nextLine();

        while (!currentLine.equals("Enough")) {
            currentName = currentLine;
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade <= 4.00) {
                badGradesN++;
                if (badGradesN == n) {
                    System.out.printf("You need a break, %d poor grades.", badGradesN);
                    return;
                }
            }
            gradesSum += grade;
            allGradesCounter++;
            currentLine = scanner.nextLine();
        }

        // 3. Output printing
        double averageScore = gradesSum / allGradesCounter;
        System.out.printf("Average score: %.2f\n", averageScore);
        System.out.printf("Number of problems: %d\n", allGradesCounter);
        System.out.printf("Last problem: %s", currentName);
    }
}
