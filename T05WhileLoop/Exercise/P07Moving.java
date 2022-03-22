package T05WhileLoop.Exercise;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // На осемнадесетия си рожден ден на Хосе взел решение, че ще се изнесе да живее на квартира.
        // Опаковал багажа си в кашони и намерил подходяща обява за апартамент под наем. Той започва да пренася своя багаж на части,
        // защото не може да пренесе целия наведнъж. Има ограничено свободно пространство в новото си жилище,
        // където може да разположи вещите, така че мястото да бъде подходящо за живеене.
        //Напишете програма, която изчислява свободния обем от жилището на Хосе, който остава след като пренесе багажа си.
        //Бележка: Един кашон е с точни размери:  1m. x 1m. x 1m.
        //Вход
        //Потребителят въвежда следните данни на отделни редове:
        //1.	Широчина на свободното пространство - цяло число в интервала [1...1000]
        //2.	Дължина на свободното пространство - цяло число в интервала [1...1000]
        //3.	Височина на свободното пространство - цяло число в интервала [1...1000]
        //4.	На следващите редове (до получаване на команда "Done") - брой кашони, които се пренасят в квартирата -
        // цяло число в интервала [1...10000]
        //Програмата трябва да приключи прочитането на данни при команда "Done" или ако свободното място свърши.
        //Изход
        //Да се отпечата на конзолата един от следните редове:
        //•	Ако стигнете до командата "Done" и има още свободно място:
        //"{брой свободни куб. метри} Cubic meters left."
        //•	Ако свободното място свърши преди да е дошла команда "Done":
        //"No more free space! You need {брой недостигащи куб. метри} Cubic meters more."

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int heigth = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int volume = width * length * heigth;
        int sum = 0;

        while (!input.equals("Done"))  {
            int box = Integer.parseInt(input);
            sum = box + sum;

            if (sum >= volume) {
                break;
            }

            input = scanner.nextLine();
        }
if (input.equals("Done")) {
    int leftedMeters = volume - sum;
    System.out.printf("%d Cubic meters left.", leftedMeters);
}
if (sum >= volume) {
    int neededMeters = sum - volume;
    System.out.printf("No more free space! You need %d Cubic meters more.", neededMeters);
}
    }
}
