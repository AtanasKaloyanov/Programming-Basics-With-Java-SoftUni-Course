package T07Exams.ExamPreparation.Exam1July2020;

import java.util.Scanner;

public class P03AluminiumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Фирма-производител на алуминиева дограма приема поръчки за изработката и монтаж със следния ценоразпис за един брой.
// Фирмата приема само поръчки на едро (над 10 бр.).
// В зависимост от поръчания брой дограми, фирмата прави различна отстъпка на своите клиенти.
// Фирмата предлага също и доставка на поръчките си срещу 60 лв.
//Ако поръчката надвишава 99 броя – върху крайната цена се начисляват допълнителни 4% отстъпка (след като се начисли цената за доставка,
// ако има такава). При поръчка под 10 бр. на конзолата да бъде изписано "Invalid order"
//Вход:
//Потребителят въвежда 3 реда:
//1. Брой дограми – цяло число в интервала [0..1000];
//2. Вид на дограмите – текст "90X130" или "100X150" или "130X180" или "200X300";
//3. Начин на получаване – текст
// С доставка - "With delivery"
// Без доставка - "Without delivery"
//Изход:
//Извежда се едно число – стойността на поръчката, в следния формат:
//o "{Обща стойност на поръчката} BGN"
//Резултатът да се форматира до втори знак след десетичната запетая.

        int numberJoinery = Integer.parseInt(scanner.nextLine());
        String typeJoinery = scanner.nextLine();
        String delivery = scanner.nextLine();

        double priceJoinery = 0;

        switch (typeJoinery) {
            case "90X130":
                if (numberJoinery < 10) {
                    System.out.println("Invalid order");
                } else if (numberJoinery <= 30) {
                    priceJoinery = numberJoinery * 110;
                } else if (numberJoinery <= 60) {
                    priceJoinery = numberJoinery* 0.95 * 110;
                } else if (numberJoinery > 60 ) {
                    priceJoinery = numberJoinery * 0.92 * 110;
                }
                break;
            case "100X150":
                if (numberJoinery < 10) {
                    System.out.println("Invalid order");
                } else if (numberJoinery <= 40) {
                    priceJoinery = numberJoinery * 140;
                } else if (numberJoinery <= 80) {
                    priceJoinery = numberJoinery * 0.94 * 140;
                } else if (numberJoinery > 80 ) {
                    priceJoinery = numberJoinery * 0.90 * 140;
                }
                break;
            case "130X180":
                if (numberJoinery < 10) {
                    System.out.println("Invalid order");
                } else if (numberJoinery <= 20) {
                    priceJoinery = numberJoinery * 190;
                } else if (numberJoinery <= 50) {
                    priceJoinery = numberJoinery * 0.93 * 190;
                } else if (numberJoinery > 50 ) {
                    priceJoinery = numberJoinery * 0.88 * 190;
                }
                break;
            case "200X300":
                if (numberJoinery < 10) {
                    System.out.println("Invalid order");
                } else if (numberJoinery <= 25) {
                    priceJoinery = numberJoinery * 250;
                } else if (numberJoinery <= 50) {
                    priceJoinery = numberJoinery * 0.91 * 250;
                } else if (numberJoinery > 50 ) {
                    priceJoinery = numberJoinery * 0.86 * 250;
                }
                break;
        }
        if (delivery.equals("With delivery")) {
            priceJoinery = 60 + priceJoinery;
        } else {
            priceJoinery = priceJoinery;
        }
        if (numberJoinery > 99) {
            priceJoinery = 0.96 * priceJoinery;
        }
        if (numberJoinery > 10) System.out.printf("%.2f BGN", priceJoinery);
    }
}
