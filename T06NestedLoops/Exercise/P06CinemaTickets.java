package T06NestedLoops.Exercise;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Tickets counting via while cycle
        int studentsTicketCounter = 0;
        int standartsTicketCounter = 0;
        int kidsTicketCounter = 0;

        while (!input.equals("Finish")) {
            int freePlaces = Integer.parseInt(scanner.nextLine());
            String placeType = scanner.nextLine();

            int placesCounter = 0;
            while (!placeType.equals("End")) {
                switch (placeType) {
                    case "student":
                        studentsTicketCounter++;
                        break;
                    case "standard":
                        standartsTicketCounter++;
                        break;
                    case "kid":
                        kidsTicketCounter++;
                        break;
                }

                placesCounter++;
                if (placesCounter == freePlaces) {
                    break;
                }
                placeType = scanner.nextLine();
            }

            double percentage = (placesCounter * 1.0 / freePlaces) * 100;
            System.out.printf("%s - %.2f%% full.\n", input, percentage);
            input = scanner.nextLine();
        }

        // 3. All tickets and 3 percentages computation
        int allTickets = studentsTicketCounter + standartsTicketCounter + kidsTicketCounter;
        double studentsPercentage = (studentsTicketCounter * 1.00) / allTickets * 100;
        double stardartsPercentage = (standartsTicketCounter * 1.00) / allTickets * 100;
        double kidsPercentage = (kidsTicketCounter * 1.00) / allTickets * 100;

        // 4. Output printing
        System.out.printf("Total tickets: %d\n", allTickets);
        System.out.printf("%.2f%% student tickets.\n", studentsPercentage);
        System.out.printf("%.2f%% standard tickets.\n", stardartsPercentage);
        System.out.printf("%.2f%% kids tickets.", kidsPercentage);
    }
}
