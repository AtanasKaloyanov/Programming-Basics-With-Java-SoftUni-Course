package T03ConditionalStatementsAdvaneced.Exercise;
import java.util.Scanner;

public class P06OperationBetweenNumbers {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        // 2. Output printing - 5 cases:
        String evenOrOdd = "";
        String output = "";
        switch (operator) {
            case "+":
                int result = n1 + n2;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                output = String.format("%d %s %d = %d - %s", n1, operator, n2, result, evenOrOdd);
                break;

            case "-":
                int result2 = n1 - n2;
                if (result2 % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                output = String.format("%d %s %d = %d - %s", n1, operator, n2, result2, evenOrOdd);
                break;
            case "*":
                int result3 = n1 * n2;
                if (result3 % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                output = String.format("%d %s %d = %d - %s", n1, operator, n2, result3, evenOrOdd);
                break;
            case "/":
                if (n2 == 0) {
                    output = String.format("Cannot divide %d by zero", n1);
                } else {
                    double result4 = n1 * 1.00 / n2;
                    output = String.format("%d / %d = %.2f", n1, n2, result4);
                }
                break;
            case "%":
                if (n2 == 0) {
                    output = String.format("Cannot divide %d by zero", n1);
                } else {
                    int result5 = n1  % n2;
                    output = String.format("%d %% %d = %d", n1, n2, result5);
                }
                break;
        }

        // 3. Output printing
        System.out.println(output);
    }
}
