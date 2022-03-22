package T03ConditionalStatementsAdvaneced.Exercise;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Хотел предлага 2 вида стаи: студио и апартамент. Напишете програма,
//        която изчислява цената за целия престой за студио и апартамент
//                . Цените зависят от месеца на престоя:
//        Май и октомври	Юни и септември	Юли и август
//        Студио – 50 лв./нощувка	Студио – 75.20 лв./нощувка	Студио – 76 лв./нощувка
//        Апартамент – 65 лв./нощувка	Апартамент – 68.70 лв./нощувка	Апартамент – 77 лв./нощувка
//        Предлагат се и следните отстъпки:
//•	За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
//•	За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
//•	За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
//•	За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.
//                Вход
//        Входът се чете от конзолата и съдържа точно 2 реда, въведени от потребителя:
//•	На първия ред е месецът – May, June, July, August, September или October
//•	На втория ред е броят на нощувките – цяло число в интервала [0 ... 200]
//        Изход
//        Да се отпечатат на конзолата 2 реда:
//•	На първия ред: “Apartment: {цена за целият престой} lv.”
//•	На втория ред: “Studio: {цена за целият престой} lv.“
//        Цената за целия престой форматирана с точност до два знака след десетичната запетая.

        String month = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        String room = "";
        double sumStudio = 0.00;
        double sumApartment = 0.00;

        switch (month) {

            case "May":
            case "October":
                sumStudio = number * 50;
                sumApartment = number * 65;

                break;

            case "June":
            case "September":
                sumStudio = number * 75.20;
                sumApartment = number * 68.70;
                break;

            case "July":
            case "August":
                sumStudio = number * 76;
                sumApartment = number * 77;
                break;


        }
//•	За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
//•	За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
//•	За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
//•	За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.
        if (number > 7 && (number <= 14)  && (month.equals("May") || month.equals("October"))) {
            sumStudio = 0.95 * sumStudio;
        }
        else if (number > 14 && (month.equals("May") || month.equals("October"))) {
            sumStudio = 0.70 * sumStudio;

        }
         if (number > 14 && (month.equals("June") || month.equals("September"))) {
            sumStudio = 0.80 * sumStudio;

        }
         if (number > 14) {
            sumApartment = 0.90 * sumApartment;
        }
        System.out.printf("Apartment: %.2f lv.%n", sumApartment);
        System.out.printf("Studio: %.2f lv.", sumStudio);
    }
}

