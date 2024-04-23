package T02ConditionalStatements.Lab;

import java.util.Scanner;

public class P05Number100to200 {
    public static void main(String[] args) {
        // 1. Reading the input
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        // 2. Assigning of  the output - 3 conditions
        String output;
        if (number < 100) {
            output = "Less than 100";
        } else if (number <= 200) {
            output = "Between 100 and 200";
        } else {
            output = "Greater than 200";
        }

        // 3. printing the output
        System.out.println(output);
    }
}
