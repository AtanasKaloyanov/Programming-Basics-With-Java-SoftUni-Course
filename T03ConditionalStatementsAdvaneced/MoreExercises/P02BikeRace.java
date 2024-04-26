package T03ConditionalStatementsAdvaneced.MoreExercises;

import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int juniorsNumber = Integer.parseInt(scanner.nextLine());
        int seniorsNumber = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();

        // 2. Juniors and seniors taxes assignment
        double juniorTax = 0;
        double seniorTax = 0;

        switch (trace) {
            case "trail":
                juniorTax = 5.50;
                seniorTax = 7.00;
                break;
            case "cross-country":
                juniorTax = 8.00;
                seniorTax = 9.50;
                break;
            case "downhill":
                juniorTax = 12.25;
                seniorTax = 13.75;
                break;
            case "road":
                juniorTax = 20;
                seniorTax = 21.50;
                break;
        }

        // 3. Sum computing
        double sum = juniorsNumber * juniorTax + seniorsNumber * seniorTax;
        if ( (trace.equals("cross-country")) && (juniorsNumber + seniorsNumber >= 50) ) {
            sum *= 0.75;
        }
        sum *= 0.95;

        // 4. Sum printing
        System.out.printf("%.2f", sum);
    }
}
