package T03ConditionalStatementsAdvaneced.Lab;

import java.util.Scanner;

public class P04PersonalTitles {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        double years = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        // 2. Output assignment
        String output;
        if (gender.equals("m")) {
            if (years >= 16) {
                output = "Mr.";
            } else {
                output = "Master";
            }
        } else {
            if (years >= 16) {
                output = "Ms.";
            } else {
                output = "Miss";
            }
        }

        // 3. Output printing
        System.out.println(output);
    }
}

