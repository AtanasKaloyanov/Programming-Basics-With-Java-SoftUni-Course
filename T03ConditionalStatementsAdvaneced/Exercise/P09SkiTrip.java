package T03ConditionalStatementsAdvaneced.Exercise;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Атанас решава да прекара отпуската си в Банско и да кара ски. Преди да отиде обаче,
//        трябва да резервира хотел и да изчисли колко ще му струва престоя. Налични са следните видове помещения,
//                със следните цени за престой:
//	"room for one person" – 18.00 лв за нощувка
//	"apartment" – 25.00 лв за нощувка
//	"president apartment" – 35.00 лв за нощувка
//        Според броят на дните, в които ще остане в хотела (пример: 11 дни = 10 нощувки) и видът на помещението, което ще избере,
//        той може да ползва различно намаление.
//                Намаленията са както следва:
//        вид помещение	по-малко от 10 дни	между 10 и 15 дни	повече от 15 дни
//        room for one person	не ползва намаление	не ползва намаление	не ползва намаление
//        apartment	30% от крайната цена	35% от крайната цена	50% от крайната цена
//        president apartment	10% от крайната цена	15% от крайната цена	20% от крайната цена
//        След престоя, оценката на Атанас за услугите на хотела може да е позитивна (positive) или негативна (negative) .
//        Ако оценката му е позитивна, към цената с вече приспаднатото намаление Атанас добавя 25% от нея.
//        Ако оценката му е негативна приспада от цената 10%.
//        Вход
//        Входът се чете от конзолата и се състои от три реда:
//•	Първи ред - дни за престой - цяло число в интервала [0...365]
//•	Втори ред - вид помещение - "room for one person", "apartment" или "president apartment"
//•	Трети ред - оценка - "positive"  или "negative"
//        Изход
//        На конзолата трябва да се отпечата един ред:
//•	Цената за престоят му в хотела, форматирана до втория знак след десетичната запетая.

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String attitude = scanner.nextLine();


        double sum = 0.00;


        switch (room) {

            case "room for one person":
                double price = 18.00;
                if (days < 10) {
                    sum = (days - 1) * price;
                }
                if (days >= 10 && days <= 15) {

                    sum = (days - 1) * price;
                }
                if (days > 15)
                    sum = (days - 1) * price;
                break;
            case "apartment":
                double price2 = 25.00;
                if (days < 10) {
                    sum = 0.7 * ((days - 1) * price2);
                }
                if (days >= 10 && days  <= 15) {

                    sum = 0.65 * ((days - 1) * price2);
                }
                if (days > 15)
                    sum = 0.50 * ((days - 1) * price2);
                break;
            case "president apartment":
               double price3 = 35.00;
                if (days < 10) {
                    sum = 0.90 * ((days - 1) * price3);
                }
                if (days >= 10 && days <= 15) {

                    sum = 0.85 * ((days - 1) * price3);
                }
                if (days > 15)
                    sum = 0.80 * ((days - 1) * price3);
                break;
        }
                if (attitude.equals("positive")) {
                    sum = 1.25 * sum;
                } if (attitude.equals("negative")) {
                    sum = 0.90 * sum;

        }
        System.out.printf("%.2f", sum);
    }
}
