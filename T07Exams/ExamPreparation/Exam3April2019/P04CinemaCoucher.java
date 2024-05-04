package T07Exams.ExamPreparation.Exam3April2019;

import java.util.Scanner;

public class P04CinemaCoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Любо е голям почитател на киното и редовно ходи на прожекции и участва в томболи,
        // от които често печели ваучери за кино.
        // Вашата задача е да напишете програма, която да изчислява колко покупки от киното може да си купи Любо със спечеленият ваучер.
        // Ако името на покупката съдържа повече от 8 символа,
        // то тя е билет за филм, а нейната цена представлява сумата на ASCII символите от първите ѝ два символа.
        // Ако името на покупката съдържа 8 или по-малко символа, нейната цена е равна на стойността на първия ASCII символ в името.
        // Любо въвежда името на покупките, които желае, докато не въведе "End" или не въведе покупка,
        // чиято стойност е по-голяма от останалата сума на ваучера.
        //Вход
        //Първоначално се чете един ред:
        //• Стойността на ваучера – цяло число в интервала [1…100000]
        //След това до получаване на команда "End" или до изчерпването на ваучера, се чете по един ред:
        //o Покупката, която Любо е избрал – текст
        //Изход
        //Програмата приключва при въвеждане на команда "End" или при покупка чиято стойност е по-голяма от останалите пари от ваучера.
        // На конзолата трябва да се напечатат три реда:
        //• "{брои закупени билети}"
        //• "{брой закупени други покупки}"

        int voucher = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int price = 0;
        int sum = 0;
        int filmCounter = 0;
        int otherCounter = 0;

        while(!input.equals("End")) {
            String film = input;
            if (film.length() > 8) {
                price = film.charAt(0) + film.charAt(1);
                sum = price + sum;
                if (sum > voucher) {
                    break;
                }
                filmCounter++;
            } else {
                price = film.charAt(0);
                sum = price + sum;
                if (sum > voucher) {
                    break;
                }
                otherCounter++;
            }



            input = scanner.nextLine();
        }
        System.out.printf("%d%n", filmCounter);
        System.out.printf("%d%n", otherCounter);
    }
}
