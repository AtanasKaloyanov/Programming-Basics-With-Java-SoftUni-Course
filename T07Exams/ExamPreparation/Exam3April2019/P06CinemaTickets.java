package T07Exams.ExamPreparation.Exam3April2019;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int allTicketsCounter = 0;
        int studentCounter = 0;
        int standardCounter = 0;
        int kidCounter = 0;

        while (!input.equals("Finish")) {
            String film = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());

            String command = scanner.nextLine();

            int ticketCounter = 0;

            while (!command.equals("End")) {
                String type = command;

                ticketCounter++;
                allTicketsCounter++;


                switch (type) {
                    case "student":
                        studentCounter++;
                        break;
                    case "standard":
                        standardCounter++;
                        break;
                    case "kid":
                        kidCounter++;
                        break;
                }
                if (freeSeats == ticketCounter) {
                    break;
                }

                command = scanner.nextLine();


            }
            System.out.printf("%s - %.2f%% full.%n", film, ticketCounter * 1.00 / freeSeats * 100 );
            input = scanner.nextLine();

        }

        System.out.printf("Total tickets: %d%n", allTicketsCounter);
        System.out.printf("%.2f%% student tickets.%n", studentCounter * 1.00 / allTicketsCounter * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardCounter * 1.00/ allTicketsCounter * 100);
        System.out.printf("%.2f%% kids tickets.%n", kidCounter * 1.00 / allTicketsCounter * 100);
    }
}
// String input = scanner.nextLine();
//
//        int countAllTickets = 0;
//        int studentCounter = 0;
//        int standardCounter = 0;
//        int kidCounter = 0;
//
//        while (!input.equals("Finish")) {
//            String movieName = input;
//            int freeSeats = Integer.parseInt(scanner.nextLine());
//
//            int counterTickets = 0;
//
//
//
//            String command = scanner.nextLine();
//
//
//
//            while (!command.equals("End")) {
//                String typeTicket = command;
//                 counterTickets++;
//                 countAllTickets++;
//
//
//                 switch (typeTicket) {
//                     case "student":
//                         studentCounter++;
//                     break;
//
//                     case "standard":
//                         standardCounter++;
//                     break;
//
//                     case "kid":
//                         kidCounter++;
//                     break;
//                 }
//                 if (freeSeats == counterTickets) {
//                     break;
//                 }
//                command = scanner.nextLine();
//
//
//            }
//            System.out.printf("%s - %.2f%% full.%n", movieName, counterTickets * 1.00 / freeSeats * 100 );
//            input = scanner.nextLine();
//
//        }
//        System.out.printf("Total tickets: %d%n", countAllTickets);
//        System.out.printf("%.2f%% student tickets.%n", studentCounter * 1.00 / countAllTickets * 100);
//        System.out.printf("%.2f%% standard tickets.%n", standardCounter * 1.00 / countAllTickets * 100);
//        System.out.printf("%.2f%% kids tickets.%n", kidCounter * 1.00 / countAllTickets * 100);