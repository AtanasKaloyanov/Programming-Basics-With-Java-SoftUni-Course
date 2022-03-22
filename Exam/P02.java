package Exam;

import java.util.Scanner;

public class P02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Остават 5 дни до рождения ден на брата на Тереза. Тя иска да му купи подарък и решава да си направи малък щанд
// и да продава плетени гривнички с мъниста, за да събере достатъчно пари. Вашата задача е да напишете програма,
// която да изчислява сумата, която Тереза е успяла да събере и да даде отговор на момичето, дали тя ще може да купи подарък или не.
// Трябва да се вземат предвид нейните разходи и цената на подаръка.
//Вход
//От конзолата се четат 4 реда:
// Първи ред – джобните на Тереза на ден – реално число в интервала [1.00 ...100.00]
// Втори ред – парите, които тя печели на ден от продажби – реално число в интервала [1.00...1000.00]
// Трети ред – разходите на Тереза за целия период – реално число в интервала [1.00...1000.00]
// Четвърти ред – цената на подаръка – реално число в интервала [1.00...10000.00]
//Изход
//На конзолата да се отпечата:
// Ако са изработени достатъчно пари за подарък:
//o "Profit: {всички спестени пари} BGN, the gift has been purchased."
// Ако са изработени по-малко нужните пари:
//o "Insufficient money: {сумата, която не достига} BGN."
//Числата трябва да са форматирани до втория знак след десетичната запетая.

        double teresasPocketMoney = Double.parseDouble(scanner.nextLine());
        double teresasMoneyFromWork = Double.parseDouble(scanner.nextLine());
        double teresasRazhodi = Double.parseDouble(scanner.nextLine());
        double priceGift = Double.parseDouble(scanner.nextLine());

        double sum = (teresasMoneyFromWork + teresasPocketMoney) * 5 - teresasRazhodi;

        if (sum >= priceGift) {

            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", sum);
        } else {
double neededMoney = priceGift - sum;
            System.out.printf("Insufficient money: %.2f BGN.", neededMoney);

        }
    }

}

