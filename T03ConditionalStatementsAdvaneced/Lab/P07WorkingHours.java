package T03ConditionalStatementsAdvaneced.Lab;

import java.util.Scanner;

public class P07WorkingHours {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        // 2. Output assignment
        String output;
        if (hour >= 10 && hour <= 18 && !day.equals("Sunday")) {
            output = "open";
        } else {
            output = "closed";
        }

        // 3. Output printing
        System.out.println(output);
    }
}
