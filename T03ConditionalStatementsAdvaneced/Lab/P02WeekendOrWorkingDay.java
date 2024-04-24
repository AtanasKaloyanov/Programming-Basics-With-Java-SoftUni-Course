package T03ConditionalStatementsAdvaneced.Lab;

import java.util.Scanner;

public class P02WeekendOrWorkingDay {
    public static void main(String[] args) {
       // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = scanner.nextLine();

        // 2. Output assignment
        String output;
        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                output = "Working day";
                break;
            case "Saturday":
            case "Sunday":
                output = "Weekend";
                break;
            default:
                output = "Error";
                break;
        }

        // 3. Output printing
        System.out.println(output);
    }
}
