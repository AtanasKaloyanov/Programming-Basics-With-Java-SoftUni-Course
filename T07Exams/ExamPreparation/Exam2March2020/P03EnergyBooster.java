package T07Exams.ExamPreparation.Exam2March2020;

import java.util.Scanner;

public class P03EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String typeSet = scanner.nextLine();
        int numberSets = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        if (typeSet.equals("small")) {
            switch (fruit) {
                case "Watermelon":
                    sum = numberSets * 2 * 56;
                    break;
                case "Mango":
                    sum = numberSets * 2 * 36.66;
                    break;
                case "Pineapple":
                    sum = numberSets * 2 * 42.10;
                    break;
                case "Raspberry":
                    sum = numberSets * 2 * 20;
                    break;


            }
        }
        if (typeSet.equals("big")) {
            switch (fruit) {
                case "Watermelon":
                    sum = numberSets * 5 * 28.70;
                    break;
                case "Mango":
                    sum = numberSets * 5 * 19.60;
                    break;
                case "Pineapple":
                    sum = numberSets * 5 * 24.80;
                    break;
                case "Raspberry":
                    sum = numberSets * 5 * 15.20;
                    break;
            }
        }

        if (sum >= 400 && sum <= 1000) {
            sum = 0.85 * sum;
        } if (sum > 1000) {
            sum = 0.50 * sum;
        }
        System.out.printf("%.2f lv.", sum);
    }
}
