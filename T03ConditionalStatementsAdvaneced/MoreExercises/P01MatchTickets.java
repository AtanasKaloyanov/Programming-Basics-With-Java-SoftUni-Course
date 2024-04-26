package T03ConditionalStatementsAdvaneced.MoreExercises;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        // 2. Ticket's price assignment
        double price = category.equals("VIP") ? 499.99 : 249.99;

        // 3. Transport subtraction
        double transport;
        if (people <= 4) {
            transport = budget * 0.75;
        } else if (people <= 9) {
            transport = budget * 0.60;
        } else if (people <= 24) {
            transport = budget * 0.50;
        } else if (people <= 49) {
           transport =  budget * 0.40;
        } else {
            transport = budget * 0.25;
        }

        // 4. All costs computing
        double allCosts = price * people + transport;

        // 5. Output printing - 2 cases:
        if (budget >= allCosts) {
            double leftMoney = budget - allCosts;
            System.out.printf("Yes! You have %.2f leva left.", leftMoney);
        } else {
            double neededMoney = allCosts - budget;
            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
        }
    }
}
