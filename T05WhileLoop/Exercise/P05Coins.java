package T05WhileLoop.Exercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        BigDecimal change = new BigDecimal(scanner.nextLine());

        //  2. Coins counting via while cycle
        double coinsCounter = 0;
        while (change.compareTo(BigDecimal.valueOf(0)) != 0) {
            if (change.compareTo(BigDecimal.valueOf(2)) > -1) {
                change = change.subtract(BigDecimal.valueOf(2));
            } else if (change.compareTo(BigDecimal.valueOf(1)) > -1) {
                change = change.subtract(BigDecimal.valueOf(1));
            } else if (change.compareTo(BigDecimal.valueOf(0.50)) > -1) {
                change = change.subtract(BigDecimal.valueOf(0.50));
            } else if (change.compareTo(BigDecimal.valueOf(0.20)) > -1) {
                change = change.subtract(BigDecimal.valueOf(0.20));
            } else if (change.compareTo(BigDecimal.valueOf(0.10)) > -1) {
                change = change.subtract(BigDecimal.valueOf(0.10));
            } else if (change.compareTo(BigDecimal.valueOf(0.05)) > -1) {
                change = change.subtract(BigDecimal.valueOf(0.05));
            } else if (change.compareTo(BigDecimal.valueOf(0.02)) > -1) {
                change = change.subtract(BigDecimal.valueOf(0.02));
            } else if (change.compareTo(BigDecimal.valueOf(0.01)) > -1) {
                change = change.subtract(BigDecimal.valueOf(0.01));
            }

            coinsCounter++;
        }

        // 3. Coins printing
        System.out.printf("%.0f", coinsCounter);
    }
}
