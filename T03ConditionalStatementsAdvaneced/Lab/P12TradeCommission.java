package T03ConditionalStatementsAdvaneced.Lab;

import java.util.Scanner;

public class P12TradeCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Фирма дава следните комисионни на търговците си според града, в който работят и обема на продажбите s:
//                 Град	0 ≤ s ≤ 500	500 < s ≤ 1 000	1 000 < s ≤ 10 000	s > 10 000
//                Sofia	     5%	    7%	 8%	 12%
//                Varna	   4.5%	   7.5%	10%	 13%
//                Plovdiv	5.5%	8%	12%	14.5%
//                Напишете конзолна програма, която чете име на град (текст) и обем на продажби (реално число) , въведени от потребителя,
//        и изчислява и извежда размера на търговската комисионна според горната таблица.
//                Резултатът да се изведе форматиран до 2 цифри след десетичната точка.
//        При невалиден град или обем на продажбите (отрицателно число) да се отпечата "error".

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = 0.00;


        if (town.equals("Sofia")) {
            if (sales >= 0 && sales <= 500) {
                commission = 0.05;
                double sum = commission * sales;
                System.out.printf("%.2f", sum);
            } else if (sales > 500 && sales <= 1000) {
                commission = 0.07;
                double sum = commission * sales;
                System.out.printf("%.2f", sum);
            } else if (sales > 1000 && sales <= 10000) {
                commission = 0.08;
                double sum = commission * sales;
                System.out.printf("%.2f", sum);
            } else if (sales > 10000) {
                commission = 0.12;
                double sum = commission * sales;
                System.out.printf("%.2f", sum);
            } else {
                System.out.println("error");
            }
        }
        else if (town.equals("Varna")) {
            if (sales >= 0 && sales <= 500) {
                commission = 0.045;
                double sum = commission * sales;
                System.out.printf("%.2f", sum);
            } else if (sales > 500 && sales <= 1000) {
                commission = 0.075;
                double sum = commission * sales;
                System.out.printf("%.2f", sum);
            } else if (sales > 1000 && sales <= 10000) {
                commission = 0.10;
                double sum = commission * sales;
                System.out.printf("%.2f", sum);
            } else if (sales > 10000) {
                commission = 0.13;
                double sum = commission * sales;
                System.out.printf("%.2f", sum);
            } else {
                System.out.println("error");
            }
        }
        else if (town.equals("Plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                commission = 0.055;
                double sum = commission * sales;
                System.out.printf("%.2f", sum);
            } else if (sales > 500 && sales <= 1000) {
                commission = 0.08;
                double sum = commission * sales;
                System.out.printf("%.2f", sum);
            } else if (sales > 1000 && sales <= 10000) {
                commission = 0.12;
                double sum = commission * sales;
                System.out.printf("%.2f", sum);
            } else if (sales > 10000) {
                commission = 0.145;
                double sum = commission * sales;
                System.out.printf("%.2f", sum);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}