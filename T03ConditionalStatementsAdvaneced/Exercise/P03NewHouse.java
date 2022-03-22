package T03ConditionalStatementsAdvaneced.Exercise;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Марин и Нели си купуват къща не далеч от София. Нели толкова много обича цветята,
//                че Ви убеждава да напишете програма която да изчисли колко  ще им струва,
//        да си засадят определен брой цветя и дали наличния бюджет ще им е достатъчен. Различните цветя са с различни цени.
//        цвете	               Роза	  Далия	 Лале   Нарцис	  Гладиола
//        Цена на брой в лева	5	  3.80	 2.80	  3	       2.50
//        Съществуват следните отстъпки:
//•	Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
//•	Ако Нели купи повече от 90  Далии - 15% отстъпка от крайната цена
//•	Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
//•	Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
//•	Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%
//                От конзолата се четат 3 реда:
//•	Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
//•	Брой цветя - цяло число в интервала [10…1000]
//•	Бюджет - цяло число в интервала [50…2500]
//        Да се отпечата на конзолата на един ред:
//•	Ако бюджета им е достатъчен - "Hey, you have a great garden with {броя цвета} {вид цветя} and {останалата сума} leva left."
//•	Ако бюджета им е НЕ достатъчен - "Not enough money, you need {нужната сума} leva more."
//        Сумата да бъде форматирана до втория знак след десетичната запетая.

        String flower = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0.00;
        double sum = 0.00;
        double leftMoney = 0.00;
        double neededMoney = 0.00;

        if (flower.equals("Roses")) {
            if (number <= 80) {
                price = 5.00;
                sum = number * 5.00;
                if (budget >= sum) {
                    leftMoney = budget - sum;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flower, leftMoney);

                } else if (budget < sum) {
                    neededMoney = sum - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
                }

            } else {
                price = 5.00;
                sum = 0.90 * (number * 5.00);
                if (budget >= sum) {
                    leftMoney = budget - sum;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flower, leftMoney);

                } else if (budget < sum) {
                    neededMoney = sum - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
                }

            }
        } else if (flower.equals("Dahlias")) {
            if (number <= 90) {
                price = 3.80;
                sum = number * 3.80;
                if (budget >= sum) {
                    leftMoney = budget - sum;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flower, leftMoney);

                } else if (budget < sum) {
                    neededMoney = sum - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
                }

            } else {
                price = 3.80;
                sum = 0.85 * (number * 3.80);
                if (budget >= sum) {
                    leftMoney = budget - sum;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flower, leftMoney);

                } else if (budget < sum) {
                    neededMoney = sum - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
                }


            }
        } else if (flower.equals("Tulips")) {
            if (number <= 80) {
                price = 2.80;
                sum = number * 2.80;
                if (budget >= sum) {
                    leftMoney = budget - sum;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flower, leftMoney);

                } else if (budget < sum) {
                    neededMoney = sum - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
                }

            } else {
                price = 2.80;
                sum = 0.85 * (number * 2.80);
                if (budget >= sum) {
                    leftMoney = budget - sum;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flower, leftMoney);

                } else if (budget < sum) {
                    neededMoney = sum - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
                }


            }
        } else if (flower.equals("Narcissus")) {
            if (number >= 120) {
                price = 3.00;
                sum = number * 3.00;
                if (budget >= sum) {
                    leftMoney = budget - sum;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flower, leftMoney);

                } else if (budget < sum) {
                    neededMoney = sum - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
                }

            } else {
                price = 3.45;
                sum =  (number * 3.45);
                if (budget >= sum) {
                    leftMoney = budget - sum;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flower, leftMoney);

                } else if (budget < sum) {
                    neededMoney = sum - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
                }


            }
        } else if (flower.equals("Gladiolus")) {
            if (number >= 80) {
                price = 2.50;
                sum = number * 2.50;
                if (budget >= sum) {
                    leftMoney = budget - sum;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flower, leftMoney);

                } else if (budget < sum) {
                    neededMoney = sum - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
                }

            } else {
                price = 3.00;
                sum = (number * 3.00);
                if (budget >= sum) {
                    leftMoney = budget - sum;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flower, leftMoney);

                } else if (budget < sum) {
                    neededMoney = sum - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
                }


            }
        }
    }
}

