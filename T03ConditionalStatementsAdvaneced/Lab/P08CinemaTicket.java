package T03ConditionalStatementsAdvaneced.Lab;

import java.util.Scanner;

public class P08CinemaTicket {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();

        // 2. Output assignment
        int price = 0;
        switch (day) {
            case "Monday":
            case "Tuesday":
                price = 12;
                break;
            case "Wednesday":
            case "Thursday":
                price = 14;
                break;
            case "Friday":
                price = 12;
                break;
            case "Saturday":
            case "Sunday":
                price = 16;
                break;
        }

        // 3. Output printing
        System.out.println(price);
    }
}
