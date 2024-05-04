package T07Exams.ExamPreparation.Exam1July2020;

import java.util.Scanner;

public class P02AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Мими има закупени самолетни билети, но в последствие решава да си добави багаж към тях.
        // Таксите за багаж се изчисляват въз основа на теглото на чекирания багаж:
        // до 10кг – 20% от цената на багаж над 20кг
        // между 10кг и 20кг вкл. – 50% от цената на багаж над 20кг.
        // над 20кг – таксата се чете от конзолата
        //В зависимост от броя на дните, които остават до пътуването, цената се оскъпява:
        // повече от 30 дни - цената на багажа се оскъпява с 10%
        // между 7 и 30 дни вкл. - цената на багажа се оскъпява с 15%
        // по-малко от 7 дни - цената на багажа се оскъпява с 40%
        //Напишете програма, която пресмята колко ще трябва да заплати Мими, спрямо горните условия.
        //Вход:
        //От конзолата се четат 4 реда:
        //1. Цената на багаж над 20кг - реално число в диапазона [10.0…80.0]
        //2. Килограми на багажа – реално число в диапазона [1.0…32.0]
        //3. Дни до пътуването – цяло число в диапазона [1…60]
        //4. Брой багажи – цяло число в диапазона [1…10]

        double priceLuggage20 = Double.parseDouble(scanner.nextLine());
        double kilosLuggage = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int numberLuggage = Integer.parseInt(scanner.nextLine());

        double priceLuggage = 0;
        if (kilosLuggage < 10) {
            priceLuggage = 0.2 * priceLuggage20;
        } else if (kilosLuggage <= 20) {
            priceLuggage = priceLuggage20 * 0.5;
        } else if (kilosLuggage > 20 ) {
            priceLuggage = priceLuggage20;
        }

        if (days < 7) {
            priceLuggage = 1.4 * priceLuggage;

        }
        else if (days <= 30) {
            priceLuggage = 1.15 * priceLuggage;
        }
        else if (days > 30 ) {
            priceLuggage = 1.1 * priceLuggage;
        }
        double finalPrice = priceLuggage * numberLuggage;
        System.out.printf("The total price of bags is: %.2f lv.", finalPrice);
    }
}
