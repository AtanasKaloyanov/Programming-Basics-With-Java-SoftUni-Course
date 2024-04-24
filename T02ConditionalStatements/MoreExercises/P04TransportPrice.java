package T02ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();


        // 2. Sum computing
        double sum = 0;
        if (km >= 100) {
            sum = km * 0.06;
        } else if (km >= 20) {
            sum = km * 0.09;
        } else {
            if (dayOrNight.equals("day")) {
                sum = 0.70 + km * 0.79;
            } else if (dayOrNight.equals("night")) {
               sum = 0.70 + km * 0.90;
            }
        }

        // 3. Output printing
        System.out.printf("%.2f", sum);
    }
}
