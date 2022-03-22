package T03ConditionalStatementsAdvaneced.Exercise;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //       Тони и приятели много обичали да ходят за риба, те са толкова запалени по риболова,
//        че решават да отидат на риболов с кораб. Цената за наема на кораба зависи от сезона и броя рибари.
//                Цената зависи от сезона:
//•	Цената за наем на кораба през пролетта е  3000 лв.
//•	Цената за наем на кораба през лятото и есента е  4200 лв.
//•	Цената за наем на кораба през зимата е  2600 лв.
//                В зависимост от броя си групата ползва отстъпка:
//•	Ако групата е до 6 човека включително  –  отстъпка от 10%.
//•	Ако групата е от 7 до 11 човека включително  –  отстъпка от 15%.
//•	Ако групата е от 12 нагоре  –  отстъпка от 25%.
//        Рибарите ползват допълнително 5% отстъпка ако са четен брой освен ако не е есен - тогава нямат допълнителна отстъпка.
//                Напишете програма, която да пресмята дали рибарите ще съберат достатъчно пари.
//        Вход
//        От конзолата се четат точно три реда.
//•	Бюджет на групата – цяло число в интервала [1…8000]
//•	Сезон –  текст : "Spring", "Summer", "Autumn", "Winter"
//•	Брой рибари – цяло число в интервала [4…18]
//        Изход
//        Да се отпечата на конзолата един ред:
//•	Ако бюджетът е достатъчен:
//        "Yes! You have {останалите пари} leva left."
//•	Ако бюджетът НЕ Е достатъчен:
//        "Not enough money! You need {сумата, която не достига} leva."
//        Сумите трябва да са форматирани с точност до два знака след десетичната запетая.

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        double rent = 0.00;
        double neededMoney = 0.00;
        double leftedMoney = 0.00;

        switch (season) {
            case "Spring":
                if (number <= 6) {
                    if (number % 2 == 0) {
                        rent = 0.95 * (0.90 * 3000);
                    }
                    if (number % 2 != 0) {
                        rent = 0.90 * 3000;
                    }
                } else if (number <= 11) {
                    if (number % 2 == 0) {
                        rent = 0.95 * (0.85 * 3000);
                    }
                    if (number % 2 != 0) {
                        rent = 0.85 * 3000;
                    }
                } else if (number >= 12) {
                    if (number % 2 == 0) {
                        rent = 0.95 *  (0.75 * 3000);
                    }
                    if (number % 2 != 0) {
                        rent = 0.75 * 3000;
                    }
                }
                if (budget >= rent) {
                    neededMoney = budget - rent;
                    System.out.printf("Yes! You have %.2f leva left.", neededMoney);
                } else {
                    leftedMoney = rent - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", leftedMoney);
                }

                break;

            case "Summer":
                if (number <= 6) {
                    if (number % 2 == 0) {
                        rent = 0.95 * (0.90 * 4200);
                    }
                    if (number % 2 != 0) {
                        rent = 0.90 * 4200;
                    }
                } else if (number <= 11) {
                    if (number % 2 == 0) {
                        rent = 0.95 * (0.85 * 4200);
                    }
                    if (number % 2 != 0) {
                        rent = 0.85 * 4200;
                    }
                } else if (number >= 12) {
                    if (number % 2 == 0) {
                        rent = 0.95 * (0.75 * 4200);
                    }
                    if (number % 2 != 0) {
                        rent = 0.75 * 4200;
                    }
                }
                if (budget >= rent) {
                    neededMoney = budget - rent;
                    System.out.printf("Yes! You have %.2f leva left.", neededMoney);
                } else {
                    leftedMoney = rent - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", leftedMoney);
                }

                break;

            case "Autumn":
                if (number <= 6) {
                    rent = 0.90 * 4200;
                } else if (number <= 11) {
                    rent = 0.85 * 4200;
                } else if (number >= 12) {
                    rent = 0.75 * 4200;
                }
                if (budget >= rent) {
                    neededMoney = budget - rent;
                    System.out.printf("Yes! You have %.2f leva left.", neededMoney);
                } else {
                    leftedMoney = rent - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", leftedMoney);
                }
                break;
            case "Winter":
                if (number <= 6) {
                    if (number % 2 == 0) {
                        rent = 0.95 * (0.90 * 2600);
                    }
                    if (number % 2 != 0) {
                        rent = 0.90 * 2600;
                    }
                } else if (number <= 11) {
                    if (number % 2 == 0) {
                        rent = 0.95 *  (0.85 * 2600);
                    }
                    if (number % 2 != 0) {
                        rent = 0.85 * 4200;
                    }
                } else if (number >= 12) {
                    if (number % 2 == 0) {
                        rent = 0.95 * (0.75 * 2600);
                    }
                    if (number % 2 != 0) {
                        rent = 0.75 * 2600;
                    }
                }
                if (budget >= rent) {
                    neededMoney = budget - rent;
                    System.out.printf("Yes! You have %.2f leva left.", neededMoney);
                } else {
                    leftedMoney = rent - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", leftedMoney);
                }

                break;
        }
    }
}






