package ExamPreparation.Exam4July2019;

import java.util.Scanner;

public class P02FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Семейство Иванови планират семейната си почивка. Вашата задача е да напишете програма,
        // която да изчислява дали предвидения от тях бюджет ще им стигне, като знаете колко нощувки са планирали,
        // каква е цената за нощувка и колко процента от бюджета са предвидили за допълнителни разходи.
        // Трябва да се има предвид, че ако броят на нощувките е по-голям от 7, цената за нощувка се намаля с 5%.
        //Вход
        //От конзолата се четат 4 реда:
        //• Бюджетът, с който разполагат – реално число в интервала [1.00 … 10000.00]
        //• Брой нощувки – цяло число в интервала [0 … 1000]
        //• Цена за нощувка – реално число в интервала [1.00 … 500.00]
        //• Процент за допълнителни разходи – цяло число в интервала [0 … 100]
        //Изход
        //Отпечатването на конзолата зависи от резултата:
        //• Ако сумата е достатъчна:
        //o "Ivanovi will be left with {останали пари след почивката} leva after vacation."
        //• Ако НЕ е достигната сумата:
        //o "{парите нужни до достигане на целта} leva needed."
        //Сума трябва да се форматира до втората цифра след десетичния знак.

        double budget = Double.parseDouble(scanner.nextLine());
        int numberNights = Integer.parseInt(scanner.nextLine());
        double accommodation = Double.parseDouble(scanner.nextLine());
        int percentage = Integer.parseInt(scanner.nextLine());

        double finalBudget = budget - budget * percentage / 100;
        if (numberNights > 7) {
            accommodation = 0.95 * accommodation;
        }
        double sum = numberNights * accommodation;

        if (finalBudget >= sum) {
            double leftedMoney = finalBudget - sum;
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", leftedMoney);
        } else {
            double neededMoney = sum - finalBudget;
            System.out.printf("%.2f leva needed.", neededMoney);
        }

    }
}
