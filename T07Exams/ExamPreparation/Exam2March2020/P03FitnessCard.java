package T07Exams.ExamPreparation.Exam2March2020;

import java.util.Scanner;

public class P03FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double price = 0;


        if (gender.equals("m")) {

            switch (sport) {
                case "Gym":
                    price = 42;
                    break;
                case "Boxing":
                    price = 41;
                    break;
                case "Yoga":
                    price = 45;
                    break;
                case "Zumba":
                    price = 34;
                    break;
                case "Dances":
                    price = 51;
                    break;
                case "Pilates":
                    price = 39;
                    break;
            }
        }

        if (gender.equals("f")) {

            switch (sport) {
                case "Gym":
                    price = 35;
                    break;
                case "Boxing":
                    price = 37;
                    break;
                case "Yoga":
                    price = 42;
                    break;
                case "Zumba":
                    price = 31;
                    break;
                case "Dances":
                    price = 53;
                    break;
                case "Pilates":
                    price = 37;
                    break;
            }
        }

        if (age <= 19) {
            price = 0.8 * price;
        }

        if (sum >= price) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
double neededMoney = price - sum;
            System.out.printf("You don't have enough money! You need $%.2f more.", neededMoney);
        }

    }
}
