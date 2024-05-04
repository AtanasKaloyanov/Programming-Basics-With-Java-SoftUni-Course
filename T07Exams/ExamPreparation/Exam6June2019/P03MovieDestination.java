package T07Exams.ExamPreparation.Exam6June2019;

import java.util.Scanner;

public class P03MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Бюджет на филма – реално число в диапазона [100 000.0… 2 000 000.0]
        //2. Дестинация – текст, с възможности "Dubai", "Sofia" и "London"
        //3. Сезон – текст, с възможности "Summer" и "Winter"
        //4. Брой дни – цяло число в диапазона [1… 40]

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        if (season.equals("Winter")) {
            switch (destination) {
                case "Dubai":
                    sum = 0.7 * days * 45000;
                    break;

                case "Sofia":
                    sum = 1.25 * days * 17000;
                    break;

                case "London":
                    sum = days * 24000;
                    break;
            }
        }
        if (season.equals("Summer")) {
            switch (destination) {
                case "Dubai":
                    sum = 0.7 * days * 40000;
                    break;

                case "Sofia":
                    sum = 1.25 * days * 12500;
                    break;

                case "London":
                    sum = days * 20250;
                    break;
            }
        }

        if (budget >= sum) {
            double moneyLefted = budget - sum;
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", moneyLefted);
        }else {
            double moneyNeeded = sum - budget;
            System.out.printf("The director needs %.2f leva more!", moneyNeeded);
        }
    }
}
