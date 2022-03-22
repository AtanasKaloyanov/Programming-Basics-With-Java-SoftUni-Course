package ExamPreparation.Exam8April2019;

import java.util.Scanner;

public class P06EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //За великденските празници, магазин започва да продава три вида великденска украса – кошнички за яйца (basket),
        // великденски венци (wreath) и шоколадови зайци (chocolate bunny). Вашата задача е да напишете програма,
        // която да изчислява каква сметка трябва да плати всеки един клиент на магазина, като се има в предвид,
        // че всеки клиент закупил четен брой продукти, ще получи 20% отстъпка от крайната цена.
        // След като всички клиенти приключат с покупките, трябва да се отпечата средно по колко пари е похарчил всеки човек.
        //Цените на продуктите са:
        //• кошничка за яйца (basket) – 1.50 лв.
        //• великденски венец (wreath) – 3.80 лв.
        //• шоколадов заек (chocolate bunny) – 7 лв.
        //Вход
        //От конзолата първоначално се чете един ред:
        //• Брои на клиентите в магазина – цяло число [1… 100]
        //• След това за всеки един клиент на нов ред до получаване на командата "Finish" се чете:
        //o Покупката която клиента е избрал – текст ("basket", "wreath" или "chocolate bunny")
        //Изход
        //• При получаване на командата "Finish" да се отпечата един ред:
        //o "You purchased {броя на покупките} items for {крайната цена} leva."
        //• Накрая, след като всички клиенти приключат с покупките, да се отпечата на един ред
        //o "Average bill per client is: {средно аритметично на парите които е похарчил всеки един клиент} leva."
        //Всички пари трябва да бъдат форматирани до втората цифра след десетичния знак.

        int numberCostumer = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double allProductCounter = 0;
        double totalSum = 0;

        for (int i = 1; i <= numberCostumer; i++) {

            String input = scanner.nextLine();

            int productCounter = 0;
            double sum = 0;

            while (!input.equals("Finish")) {
                String product = input;
                productCounter++;
                allProductCounter++;

                if (product.equals("basket")) {
                    price = 1.50;
                }
                if (product.equals("wreath")) {
                    price = 3.80;
                }
                if (product.equals("chocolate bunny")) {
                    price = 7;
                }

                sum = price + sum;

                input = scanner.nextLine();
            }
            if (productCounter % 2 == 0) {
                sum = 0.8 * sum;
            }
            totalSum = sum + totalSum;
            System.out.printf("You purchased %d items for %.2f leva.%n", productCounter, sum);
        }
        System.out.printf("Average bill per client is: %.2f leva.", totalSum / numberCostumer );
    }
}
