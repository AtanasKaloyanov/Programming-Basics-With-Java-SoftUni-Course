package T03ConditionalStatementsAdvaneced.Lab;

import java.util.Scanner;

public class P01DayOfWeek {
    public static void main(String[] args) {
        // 1. Input
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        // 2. Output assigning
        String output;
        switch (number) {
            case 1:
                output = "Monday";
                break;
            case 2:
                output = "Tuesday";
                break;
            case 3:
                output = "Wednesday";
                break;
            case 4:
                output = "Thursday";
                break;
            case 5:
                output = "Friday";
                break;
            case 6:
                output = "Saturday";
                break;
            case 7:
                output = "Sunday";
                break;
            default:
                output = "Error";
        }

        // 3. Output printing
        System.out.println(output);
    }
}
