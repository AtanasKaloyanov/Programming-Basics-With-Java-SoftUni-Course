package Exam;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Коледа наближава, а Дядо Коледа още не е готов с подаръците. Той трябва да поръча материали,
        // с които джуджетата да изработят коледните подаръци. Всяка Коледа в магазина,
        // в който Дядо Коледа пазарува има намаление, което представлява някакъв процент от цената на материалите
        // (материалите са опаковъчна хартия във вид на ролки, плат също във вид на ролки и лепило в литри).
        // От конзолата се въвеждат количеството ролки хартия, ролки плат, лепило в литри и намаление в проценти.
        // Колко пари ще са необходими на дядо Коледа, за да плати сметката си, ако цените на материалите в магазина са следните:
        // Опаковъчна хартия - 5.80 лв. за ролка
        // Плат - 7.20 лв. за ролка
        // Лепило - 1.20 лв. за литър
        //Вход:
        //От конзолата се четат 4 числа:
        // Първи ред – брой ролки опаковъчна хартия - цяло число в интервала [0...100]
        // Втори ред – брой ролки плат - цяло число в интервала [0...100]
        // Трети ред – литри лепило - реално число в интервала [0.00…50.00]
        // Четвърти ред – процент намаление - цяло число в интервала [0...100]
        //Изход:
        //Да се отпечата на конзолата реално число – колко пари ще са нужни на Дядо Коледа, за да си плати сметката.
        //Резултатът да се форматира до третия знак след десетичния разделител. (1.2457 -> 1.246).

        int numberPaper = Integer.parseInt(scanner.nextLine());
        int numberPlat = Integer.parseInt(scanner.nextLine());
        double litres = Double.parseDouble(scanner.nextLine());
        int percentage = Integer.parseInt(scanner.nextLine());

        double sum = numberPaper * 5.80 + numberPlat * 7.20 + litres * 1.20;
        double totalSum = sum - percentage * 1.00 / 100 * sum;

        System.out.printf("%.3f", totalSum);
    }
}
