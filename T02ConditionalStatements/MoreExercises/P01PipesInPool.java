package T02ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int poolVolume = Integer.parseInt(scanner.nextLine());
        int firstPipeDebitForHour = Integer.parseInt(scanner.nextLine());
        int secondPipeDebitForHour = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        // 2. Computing of the sum of the debits
        double firstPipeDebit = firstPipeDebitForHour * hours;
        double secondPipeDebit = secondPipeDebitForHour * hours;
        double sumDebit = (firstPipeDebitForHour + secondPipeDebitForHour) * hours;

        // 3. Printing. There are 2 cases:
           // 3.1. The debit isn't overfilled (100% or less full):
        if (sumDebit <= poolVolume) {
            double percentage = (sumDebit / poolVolume) * 100;
            double firstPipePercentage = (firstPipeDebit / sumDebit) * 100;
            double secondPipePercentage = (secondPipeDebit / sumDebit) * 100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percentage, firstPipePercentage, secondPipePercentage);
            // 3.2. The pool is overfilled
        } else {
            double waterOutsideThePool = sumDebit - poolVolume;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, waterOutsideThePool);
        }
    }
}
