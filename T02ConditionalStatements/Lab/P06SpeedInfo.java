package T02ConditionalStatements.Lab;

import java.util.Scanner;

public class P06SpeedInfo {
    public static void main(String[] args) {
        // 1. Reading the input
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());

        // 2. Assigning of the output. There are 5 options
        String output;
        if (number <= 10) {
            output = "slow";
        } else if (number <= 50) {
            output = "average";
        } else if (number <= 150) {
            output = "fast";
        } else if (number <= 1000) {
            output = "ultra fast";
        }  else {
            output = "extremely fast";
        }

        // 3. Printing
        System.out.println(output);
    }
}
