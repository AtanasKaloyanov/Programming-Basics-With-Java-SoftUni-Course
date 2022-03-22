package T03ConditionalStatementsAdvaneced.Lab;

import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Магазин за плодове през работните дни работи на следните цени:
//        плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
//        цена	2.50	1.20	0.85	1.45	   2.70	      5.50	     3.85
//        Събота и неделя магазинът работи на по-високи цени:
//        плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
//        цена	2.70	1.25	 0.90	 1.60	   3.00	      5.60	     4.20
//        Напишете програма, която чете от конзолата плод (banana / apple / orange / grapefruit / kiwi / pineapple / grapes),
//        ден от седмицата (Monday / Tuesday / Wednesday / Thursday / Friday / Saturday / Sunday) и количество (десетично число) ,
//        въведени от потребителя, и пресмята цената според цените от таблиците по-горе.
//        При невалиден ден от седмицата или невалидно име на плод да се отпечата "error".
//
//                Примерен вход и изход
//        вход	изход		вход	изход		вход	изход		вход	изход		вход	изход
//        apple
//                Tuesday
//        2	2.40		orange
//                Sunday
//        3	2.70		kiwi
//                Monday
//        2.5	6.75		grapes
//                Saturday
//        0.5	2.10		tomato
//                Monday
//        0.5	error

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double number = Double.parseDouble(scanner.nextLine());
        double price = 0.00;

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            if (fruit.equals("banana")) {
                price = 2.50;
                double sum = price * number;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("apple")) {
                price = 1.20;
                double sum = price * number;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("orange")) {
                price = 0.85;
                double sum = price * number;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("grapefruit")) {
                price = 1.45;
                double sum = price * number;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("kiwi")) {
                price = 2.70;
                double sum = price * number;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("pineapple")) {
                price = 5.50;
                double sum = price * number;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("grapes")) {
                price = 3.85;
                double sum = price * number;
                System.out.printf("%.2f", sum);
            }

                else System.out.println("error");




            //   плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
//            цена	2.50	1.20	0.85	  1.45	   2.70	      5.50	     3.85


        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            if (fruit.equals("banana")) {
                price = 2.70;
                double sum = price * number;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("apple")) {
                price = 1.25;
                double sum = price * number;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("orange")) {
                price = 0.90;
                double sum = price * number;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("grapefruit")) {
                price = 1.60;
                double sum = price * number;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("kiwi")) {
                price = 3.00;
                double sum = price * number;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("pineapple")) {
                price = 5.60;
                double sum = price * number;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("grapes")) {
                price = 4.20;
                double sum = price * number;
                System.out.printf("%.2f", sum);
            }
//        плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
//        цена	2.70	1.25	 0.90	 1.60	   3.00	      5.60	     4.20

              else System.out.println("error");

        } else {
            System.out.println("error");
        }
    }
}
