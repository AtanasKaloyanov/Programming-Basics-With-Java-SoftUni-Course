package T07Exams.ExamPreparation.Exam5May2019;

import java.util.Scanner;

public class P03MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        String type = scanner.nextLine();
        String internet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());

        double tax = 0;
        double sum = 0;

        if (year.equals("one")) {
            switch (type) {
                case "Small":
                    tax = 9.98;
                    break;

                case "Middle":
                    tax = 18.99;
                    break;

                case "Large":
                    tax = 25.98;
                    break;

                case "ExtraLarge":
                    tax = 35.99;
                    break;
            }
        }
        if (year.equals("two")) {
            switch (type) {
                case "Small":
                    tax = 8.58;
                    break;

                case "Middle":
                    tax = 17.09;
                    break;

                case "Large":
                    tax = 23.59;
                    break;

                case "ExtraLarge":
                    tax = 31.79;
                    break;
            }
        }
if (internet.equals("no")) {
    sum = tax * months;
} else {
    if (tax <= 10) {
        sum = (tax + 5.50) * months;
    } else if (tax <= 30) {
        sum = (tax + 4.35) * months;
    } else if (tax > 30) {
        sum = (tax + 3.85) * months;
    }
}
if (year.equals("two")) {
    sum = 0.9625 * sum;
}

        System.out.printf("%.2f lv.", sum);
    }
}
