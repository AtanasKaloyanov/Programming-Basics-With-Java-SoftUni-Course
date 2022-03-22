package ExamPreparation.Exam4July2019;

import java.util.Scanner;

public class P04Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double profit = Double.parseDouble(scanner.nextLine());


        double sum = 0;
        double totalSum = 0;
        boolean isValid = false;

        String input = scanner.nextLine();

        while (!input.equals("Party!")) {
            String coctailName = input;
            int coctailNumbers = Integer.parseInt(scanner.nextLine());

            sum = coctailNumbers * coctailName.length();
            if (sum % 2 != 0) {
                sum = 0.75 * sum;
            }

            totalSum = sum + totalSum;
            if (totalSum >= profit) {
                isValid = true;
                break;
            }


            input = scanner.nextLine();
        }
        if (input.equals("Party!")) {
            double neededMoney = profit - totalSum;
            System.out.printf("We need %.2f leva more.%n", neededMoney);
            System.out.printf("Club income - %.2f leva.", totalSum);

        }
        if (totalSum >= profit) {
            System.out.println("Target acquired.");
            System.out.printf("Club income - %.2f leva.", totalSum);
        }
    }
}