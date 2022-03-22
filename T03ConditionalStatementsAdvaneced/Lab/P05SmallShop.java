package T03ConditionalStatementsAdvaneced.Lab;

import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Предприемчив българин отваря квартални магазинчета в няколко града и продава на различни цени:
//        град / продукт	coffee	water	beer	sweets	peanuts
//        Sofia	           0.50	   0.80	    1.20	1.45	1.60
//        Plovdiv          0.40	   0.70	    1.15	1.30	1.50
//        Varna	           0.45	   0.70	    1.10	1.35	1.55
//        Напишете програма, която чете продукт (низ), град (низ) и количество (десетично число),
//        въведени от потребителя, и пресмята и отпечатва колко струва съответното количество от избрания продукт в посочения град.
//                Примерен вход и изход
//        вход	изход		вход	изход		вход	изход		вход	изход		вход	изход
//        coffee
//                Varna
//        2	0.9		peanuts
//                Plovdiv
//        1	1.5		beer
//                Sofia
//        6	7.2		water
//                Plovdiv
//        3	2.1		sweets
//                Sofia
//        2.23	3.2335

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double number = Double.parseDouble(scanner.nextLine());


        if (town.equals("Sofia")) {
            if (product.equals("coffee")) {
                System.out.println(number * 0.50);
            } else if  (product.equals("water")) {
                System.out.println(number * 0.80);
            }else if  (product.equals("beer")) {
                System.out.println(number * 1.20);
            }else if  (product.equals("sweets")) {
                System.out.println(number * 1.45);
            }else if  (product.equals("peanuts")) {
                System.out.println(number * 1.60);
            }
        }

        if (town.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                System.out.println(number * 0.40);
            } else if  (product.equals("water")) {
                System.out.println(number * 0.70);
            }else if  (product.equals("beer")) {
                System.out.println(number * 1.15);
            }else if  (product.equals("sweets")) {
                System.out.println(number * 1.30);
            }else if  (product.equals("peanuts")) {
                System.out.println(number * 1.50);
            }
        }

        if (town.equals("Varna")) {
            if (product.equals("coffee")) {
                System.out.println(number * 0.45);
            } else if  (product.equals("water")) {
                System.out.println(number * 0.70);
            }else if  (product.equals("beer")) {
                System.out.println(number * 1.10);
            }else if  (product.equals("sweets")) {
                System.out.println(number * 1.35);
            }else if  (product.equals("peanuts")) {
                System.out.println(number * 1.55);
            }
        }

    }
}
