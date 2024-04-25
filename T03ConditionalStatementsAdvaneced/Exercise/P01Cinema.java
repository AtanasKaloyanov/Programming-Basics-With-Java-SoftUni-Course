package T03ConditionalStatementsAdvaneced.Exercise;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String typeProjection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        // 2. ticket price assignment
        int allSeats = rows * columns;

        double ticketPrice = 0;
        switch (typeProjection) {
            case "Premiere":
                ticketPrice = 12.00;
                break;
            case "Normal":
                ticketPrice = 7.50;
                break;
            case "Discount":
                ticketPrice = 5.00;
                break;
        }

        // 3. Computing and printing of the incomes
        double incomes = allSeats * ticketPrice;
        System.out.printf("%.2f leva", incomes);
    }
}
