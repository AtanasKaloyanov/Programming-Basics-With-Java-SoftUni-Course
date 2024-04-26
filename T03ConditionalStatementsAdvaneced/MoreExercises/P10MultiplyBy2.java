package T03ConditionalStatementsAdvaneced.MoreExercises;

import java.util.Scanner;

public class P10MultiplyBy2 {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        double currentNumber = Double.parseDouble(scanner.nextLine());

        // 2. Printing in while loop to condition
        while (currentNumber >= 0) {
            currentNumber *= 2;
            System.out.printf("Result: %.2f\n", currentNumber);
            currentNumber = Double.parseDouble(scanner.nextLine());
        }

        // 3. Final message printing
        System.out.println("Negative number!");
    }
}
