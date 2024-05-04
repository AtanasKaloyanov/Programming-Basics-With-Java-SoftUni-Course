package T07Exams.ExamPreparation.Exam4July2019;

import java.util.Scanner;

public class P05PCGameshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Магазин за компютърни игри ви наема за да направите статистика на процента продажби на игрите от последния месец,
        // като изчислите по колко процента от общите продажби са за някоя от игрите.
        // Процентите трябва да бъдат разделени на четири части, три заглавия на игри и всички останали : • Hearthstone • Fornite
        //• Overwatch
        //• Others
        //Вход
        //От конзолата се четат:
        //• Брой продадени игри- n - цяло положително число в интервала [1… 100]
        //За следващите n реда се чете по един ред:
        //o Име на игра - текст
        //Изход
        //На конзолата да се изпишат четири реда:
        //"Hearthstone - {процент продажби на Hearthstone}%"
        //"Fornite - {процент продажби на Fornite}%"
        //"Overwatch - {процент продажби на Overwatch}%"
        //"Others - {процент продажби на всички останали игри}%"
        //Резултатът да бъде закръглен до втората цифра след десетичния знак.

        int numberGames = Integer.parseInt(scanner.nextLine());
        int hearthstoneCounter = 0;
        int forniteCounter = 0;
        int overwatchCounter = 0;
        int otherCounter = 0;

        for (int i = 1; i <= numberGames; i++) {
            String game = scanner.nextLine();

            if (game.equals("Hearthstone")) {
                hearthstoneCounter++;
            }
            if (game.equals("Fornite")) {
                forniteCounter++;
            }
            if (game.equals("Overwatch")) {
                overwatchCounter++;
            }
            if (!game.equals("Hearthstone") && !game.equals("Fornite") && !game.equals("Overwatch")) {
                otherCounter++;
            }
        }
        System.out.printf("Hearthstone - %.2f%%%n", hearthstoneCounter * 1.00/ numberGames * 100 );
        System.out.printf("Fornite - %.2f%%%n", forniteCounter * 1.00 / numberGames * 100);
        System.out.printf("Overwatch - %.2f%%%n", overwatchCounter * 1.00 / numberGames * 100);
        System.out.printf("Others - %.2f%%", otherCounter * 1.00 / numberGames * 100);
        //"Hearthstone - {процент продажби на Hearthstone}%"
        //"Fornite - {процент продажби на Fornite}%"
        //"Overwatch - {процент продажби на Overwatch}%"
        //"Others - {процент продажби на всички останали игри}%"
    }
}
