package T02ConditionalStatements.Exercise;

import java.util.Scanner;

public class P05GodzilaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgetFilm = Double.parseDouble(scanner.nextLine());
        int numberStatists = Integer.parseInt(scanner.nextLine());
        double priceClothing = Double.parseDouble(scanner.nextLine());

        double decor = 0.1 * budgetFilm;
        if (numberStatists > 150) {
            priceClothing = 0.9 * priceClothing;
        }
        if (budgetFilm < decor + priceClothing * numberStatists) {
            double moneyNeeded = decor + priceClothing * numberStatists - budgetFilm;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyNeeded);

        } else {
            double moneyLeft = budgetFilm - decor - priceClothing * numberStatists;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
        }
    }
}