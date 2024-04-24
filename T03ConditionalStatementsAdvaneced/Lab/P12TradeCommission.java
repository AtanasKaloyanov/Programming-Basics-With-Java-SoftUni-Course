package T03ConditionalStatementsAdvaneced.Lab;

import java.util.Scanner;

public class P12TradeCommission {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        // 2. Commission assignment
        double commission = 0;
        switch (town) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    commission = 5;
                } else if (sales > 500 && sales <= 1000) {
                    commission = 7;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = 8;
                } else if (sales > 10000) {
                    commission = 12;
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    commission = 4.5;
                } else if (sales > 500 && sales <= 1000) {
                    commission = 7.5;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = 10;
                } else if (sales > 10000) {
                    commission = 13;
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    commission = 5.5;
                } else if (sales > 500 && sales <= 1000) {
                    commission = 8;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = 12;
                } else if (sales > 10000) {
                    commission = 14.5;
                }
                break;
        }

        // 3. Output computing and printing - 2 cases:
        if (commission == 0) {
            System.out.println("error");
        } else {
            double commisionAsPercentage = commission / 100;
            double output = commisionAsPercentage * sales;
            System.out.printf("%.2f", output);
        }
    }
}