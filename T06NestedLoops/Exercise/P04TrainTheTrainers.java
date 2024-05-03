package T06NestedLoops.Exercise;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();

        // 2. allSum computation and counting in while cycle
        double allSum = 0;
        int counter = 0;

        while (!name.equals("Finish")) {
            counter++;
            double sum = getSum(scanner, n);

            double averageGrade = sum / n;
            System.out.printf("%s - %.2f.\n", name, averageGrade);
            allSum += sum;
            name = scanner.nextLine();
        }

        // 3. Average sum computation and output printing:
        int allGrades = counter * n;
        double averageSum = allSum / allGrades;
        System.out.printf("Student's final assessment is %.2f.", averageSum);
    }
    private static double getSum(Scanner scanner, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double currentGrade = Double.parseDouble(scanner.nextLine());
            sum += currentGrade;
        }
        return sum;
    }
}
