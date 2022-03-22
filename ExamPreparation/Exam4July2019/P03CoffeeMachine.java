package ExamPreparation.Exam4July2019;

import java.util.Scanner;

public class P03CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String type = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        if (drink.equals("Espresso")) {
            switch (type) {
                case "Without":
                    sum = 0.65 * number * 0.90;
                    if (sum >= 5) {
                        sum = 0.75 * sum;
                    }
                    break;
                case "Normal":
                    sum = number * 1.00;
                    if (number >= 5) {
                        sum = 0.75 * sum;
                    }
                    break;
                case "Extra":
                    sum = number * 1.20;
                    if (number >= 5) {
                        sum = 0.75 * sum;
                    }
                    break;
            }
        }
        if (drink.equals("Cappuccino")) {
            switch (type) {
                case "Without":
                    sum = 0.65 * (number * 1.00);
                    break;
                case "Normal":
                    sum = number * 1.20;
                    break;
                case "Extra":
                    sum = number * 1.60;
                    break;
            }
        }
        if (drink.equals("Tea")) {
            switch (type) {
                case "Without":
                    sum = 0.65 * (number * 0.50);
                    break;
                case "Normal":
                    sum = number * 0.60;
                    break;
                case "Extra":
                    sum = number * 0.70;
                    break;
            }
        }
        if (sum > 15) {
            sum = 0.8 * sum;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", number, drink, sum);
    }
}
