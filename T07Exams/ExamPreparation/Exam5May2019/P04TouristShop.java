package T07Exams.ExamPreparation.Exam5May2019;

import java.util.Scanner;

public class P04TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Времето се затопля и туристи, започват да си правят разходки високо в планината,
        // където все още сняг, като за целта те трябва да закупят нужната туристическа екипировка.
        //Вашата задача е да напишете програма, която да изчислява, стойността на екипировката,
        // както и дали определения бюджет е достатъчен или не, като се знае, че в магазина има следната промоция:
        // Всеки трети продукт е на половин цена.
        //Вход
        //От конзолата се чете:
        //• На първи ред – бюджетът - реално число в интервала [1.00… 100000.00]
        //• След това поредица от два реда (до получаване на команда "Stop" или при заявка за купуване на продукт,
        // чиято стойност е по-висока от наличния бюджет) :
        //o Име на продукта – текст
        //o Цена на продукта – реално число в интервала [1.00… 5000.00]
        //Изход
        //На конзолата да се отпечатат следните редове според случая:
        //• При получаване на командата "Stop", на един ред:
        //o "You bought {брой на закупените продукти} products for {цена на покупките} leva."
        //• При заявка за покупка на продукт, чиято цена е по-висока от останалите пари, на два реда:
        //o "You don't have enough money!"
        //o "You need {недостигащи пари} leva!"

        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int counter = 0;
        double sum = 0;

        while(!input.equals("Stop")) {
            String product = input;
            counter++;
            double price = Double.parseDouble(scanner.nextLine());

            if (counter % 3 == 0) {
                price = 0.5 * price;
            }
                sum = price + sum;
            if (sum > budget) {
                break;
            }
            input = scanner.nextLine();
        }
if (input.equals("Stop")) {
    System.out.printf("You bought %d products for %.2f leva.", counter, sum);
}
if (sum > budget) {
    double neededMoney = sum - budget;
    System.out.println("You don't have enough money!");
    System.out.printf("You need %.2f leva!", neededMoney);
}
    }
}
