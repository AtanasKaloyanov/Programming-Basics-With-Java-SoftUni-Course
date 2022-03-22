package ExamPreparation.Exam6June2019;

import java.util.Scanner;

public class P05Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От телевизионна компания ви наемат да създадете програма,
        // която да изчислява дали за клиентите ще е възможно да си закупят желаните сериали.
        // Разполагате с бюджет и брой сериали, които потребителят ще желае да закупи.
        // Всеки сериал съответно има заглавие и цена. Някои от сериалите имат намаление:
        // • Thrones – 50% • Lucifer – 40% • Protector – 30% • TotalDrama – 20% • Area – 10%
        //Вход
        //От конзолата се четат:
        //• Бюджет - реално число в интервала [10.0… 100.0]
        //• Брой сериали - n - цяло положително число в интервала [1… 10]
        //За всеки сериал се четат по два реда:
        //o Име на сериал - текст
        //o Цена за сериал - реално число в интервала [1.0… 15.0]
        //Изход
        //На конзолата да се изпише един ред:
        //• Ако бюджета ви е по-голям или равен на цената на сериалите:
        //"You bought all the series and left with {останали пари} lv."
        //• Ако бюджета ви е по-малък от цената на сериалите:
        //"You need {нужни пари} lv. more to buy the series!"
        //Резултатът да бъде закръглен до втората цифра след десетичния знак.

        double budget = Double.parseDouble(scanner.nextLine());
        int nuberserials = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        for (int i = 1; i <= nuberserials; i++) {
            String nameSerial = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());
            if (nameSerial.equals("Thrones")) {
                price = 0.5 * price;
            }
            // // • Thrones – 50% • Lucifer – 40% • Protector – 30% • TotalDrama – 20% • Area – 10%
            if (nameSerial.equals("Lucifer")) {
                price = 0.6 * price;
            }
            if (nameSerial.equals("Protector")) {
                price = 0.7 * price;
            }
            if (nameSerial.equals("TotalDrama")) {
                price = 0.8 * price;
            }
            if (nameSerial.equals("Area")) {
                price = 0.9 * price;
            }
            sum = price + sum;
        }
        if (budget >= sum) {
            double leftedMoney = budget - sum;
            System.out.printf("You bought all the series and left with %.2f lv.", leftedMoney);
        } else {
            double neededMoney = sum - budget;
            System.out.printf("You need %.2f lv. more to buy the series!", neededMoney);
        }
    }
}
