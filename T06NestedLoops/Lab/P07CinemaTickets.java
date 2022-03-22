package T06NestedLoops.Lab;

import java.util.Scanner;

public class P07CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Вашата задача е да напишете програма, която да изчислява процента на билетите за всеки тип от продадените билети:
        // студентски(student), стандартен(standard) и детски(kid), за всички прожекции.
        // Трябва да изчислите и колко процента от залата е запълнена за всяка една прожекция.
        //Вход
        //Входът е поредица от цели числа и текст:
        //•	На първия ред до получаване на командата "Finish" - име на филма – текст
        //•	На втори ред – свободните места в салона за всяка прожекция – цяло число [1 … 100]
        //•	За всеки филм, се чете по един ред до изчерпване на свободните места в залата или до получаване на командата "End":
        //o	Типа на закупения билет - текст ("student", "standard", "kid")
        //Изход
        //На конзолата трябва да се печатат следните редове:
        //•	След всеки филм да се отпечата, колко процента от кино залата е пълна
        //"{името на филма} - {процент запълненост на залата}% full."
        //•	При получаване на командата "Finish" да се отпечатат четири реда:
        //o	"Total tickets: {общият брой закупени билети за всички филми}"
        //o	"{процент на студентските билети}% student tickets."
        //o	"{процент на стандартните билети}% standard tickets."
        //o	"{процент на детските билети}% kids tickets."





        String input = scanner.nextLine();

        int countAllTickets = 0;
        int studentCounter = 0;
        int standardCounter = 0;
        int kidCounter = 0;

        while (!input.equals("Finish")) {
            String movieName = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());

            int counterTickets = 0;



            String command = scanner.nextLine();



            while (!command.equals("End")) {
                String typeTicket = command;
                 counterTickets++;
                 countAllTickets++;


                 switch (typeTicket) {
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
                 if (freeSeats == counterTickets) {
                     break;
                 }
                command = scanner.nextLine();


            }
            System.out.printf("%s - %.2f%% full.%n", movieName, counterTickets * 1.00 / freeSeats * 100 );
            input = scanner.nextLine();

        }
        System.out.printf("Total tickets: %d%n", countAllTickets);
        System.out.printf("%.2f%% student tickets.%n", studentCounter * 1.00 / countAllTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardCounter * 1.00 / countAllTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", kidCounter * 1.00 / countAllTickets * 100);



    }
}
