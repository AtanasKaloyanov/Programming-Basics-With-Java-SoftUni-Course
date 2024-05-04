package T07Exams.ExamPreparation.Exam3April2019;

import java.util.Scanner;

public class P03OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String film = scanner.nextLine();
        String type = scanner.nextLine();
        int numberTickets = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        if (film.equals("A Star Is Born")) {
            switch (type) {
                case "normal":
                    sum = numberTickets * 7.50;
                    break;
                case "luxury":
                    sum = numberTickets * 10.50;
                    break;
                case "ultra luxury":
                    sum = numberTickets * 13.50;
                    break;
            }
        }
        if (film.equals("Bohemian Rhapsody")) {
            switch (type) {
                case "normal":
                    sum = numberTickets * 7.35;
                    break;
                case "luxury":
                    sum = numberTickets * 9.45;
                    break;
                case "ultra luxury":
                    sum = numberTickets * 12.75;
                    break;
            }
        }
        if (film.equals("Green Book")) {
            switch (type) {
                case "normal":
                    sum = numberTickets * 8.15;
                    break;
                case "luxury":
                    sum = numberTickets * 10.25;
                    break;
                case "ultra luxury":
                    sum = numberTickets * 13.25;
                    break;
            }
        }
        if (film.equals("The Favourite")) {
            switch (type) {
                case "normal":
                    sum = numberTickets * 8.75;
                    break;
                case "luxury":
                    sum = numberTickets * 11.55;
                    break;
                case "ultra luxury":
                    sum = numberTickets * 13.95;
                    break;
            }
        }
        System.out.printf("%s -> %.2f lv.", film, sum);
    }
}
