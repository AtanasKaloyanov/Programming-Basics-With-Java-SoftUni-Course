package T07Exams.ExamPreparation.Exam2March2020;

import java.util.Scanner;

public class P05SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double allVolume = 0;
        int inputCounter = 0;
        int counter = 0;


        while (!input.equals("End")) {
            double volume = Double.parseDouble(input);
            inputCounter++;
            if (inputCounter % 3 == 0) {
                volume = 1.1 * volume;
            }

            allVolume = volume + allVolume;

            if (allVolume > capacity) {
                break;
            }
counter++;
            input = scanner.nextLine();
        }
if (input.equals("End")) {
    System.out.println("Congratulations! All suitcases are loaded!");
}
if (allVolume > capacity) {
    System.out.println("No more space!");
}
        System.out.printf("Statistic: %d suitcases loaded.", counter );

    }
}
