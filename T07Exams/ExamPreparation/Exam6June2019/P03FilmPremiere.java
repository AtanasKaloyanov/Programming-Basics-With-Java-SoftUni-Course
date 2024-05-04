package T07Exams.ExamPreparation.Exam6June2019;

import java.util.Scanner;

public class P03FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String film = scanner.nextLine();
        String type = scanner.nextLine();
        int numberTickets = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        if (type.equals("Drink")) {
            switch (film) {
                case "John Wick": {
                    sum = numberTickets * 12;
                }
                break;
                case "Star Wars": {
                    sum = numberTickets * 18;
                    if (numberTickets >= 4) {
                        sum = 0.7 * (numberTickets * 18);
                    }
                }
                break;
                case "Jumanji": {
                    sum = numberTickets * 9;
                    if (numberTickets == 2) {
                        sum = 0.85 * (numberTickets * 9);
                    }
                }
                break;
            }
        }
        if (type.equals("Popcorn")) {
            switch (film) {
                case "John Wick": {
                    sum = numberTickets * 15;
                }
                break;
                case "Star Wars": {
                    sum = numberTickets * 25;
                    if (numberTickets >= 4) {
                        sum = 0.7 * (numberTickets * 25);
                    }
                }
                break;
                case "Jumanji": {
                    sum = numberTickets * 11;
                    if (numberTickets == 2) {
                        sum = 0.85 * (numberTickets * 11);
                    }
                }
            }
        }
        if (type.equals("Menu")) {
            switch (film) {
                case "John Wick": {
                    sum = numberTickets * 19;
                }
                break;
                case "Star Wars": {
                    sum = numberTickets * 30;
                    if (numberTickets >= 4) {
                        sum = 0.7 * (numberTickets * 30);
                    }
                }
                break;
                case "Jumanji": {
                    sum = numberTickets * 14;
                    if (numberTickets == 2) {
                        sum = 0.85 * (numberTickets * 14);
                    }
                }
                break;
            }
        }

        System.out.printf("Your bill is %.2f leva.", sum);

    }
}
