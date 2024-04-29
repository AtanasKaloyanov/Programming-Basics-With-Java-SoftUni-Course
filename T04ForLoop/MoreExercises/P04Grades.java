package T04ForLoop.MoreExercises;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int firstCounter = 0;
        int secondCounter = 0;
        int thirdCounter = 0;
        int fourthCounter = 0;
        int allStudentsCounter = 0;

        double allGradesSum = 0;

        // 2. Counters and sum of the grade finding
        for (int i = 0; i < n; i++) {
            double currentStudentGrade = Double.parseDouble(scanner.nextLine());
            if (currentStudentGrade >= 5.00) {
                firstCounter++;
            } else if (currentStudentGrade >= 4.00) {
                secondCounter++;
            } else if (currentStudentGrade >= 3.00) {
                thirdCounter++;
            } else {
                fourthCounter++;
            }

            allStudentsCounter++;
            allGradesSum += currentStudentGrade;
        }

        // 3. Percentage computation
        double firstPercentage = (firstCounter * 1.00 / allStudentsCounter) * 100;
        double secondPercentage = (secondCounter * 1.00 / allStudentsCounter) * 100;
        double thirdPercentage = (thirdCounter * 1.00 / allStudentsCounter) * 100;
        double fourthPercentage = (fourthCounter * 1.00 / allStudentsCounter) * 100;
        double averageGrades = allGradesSum / allStudentsCounter;

        // 4. Output printing
        System.out.printf("Top students: %.2f%%\n", firstPercentage);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", secondPercentage);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", thirdPercentage);
        System.out.printf("Fail: %.2f%%\n", fourthPercentage);
        System.out.printf("Average: %.2f", averageGrades);
    }
}
