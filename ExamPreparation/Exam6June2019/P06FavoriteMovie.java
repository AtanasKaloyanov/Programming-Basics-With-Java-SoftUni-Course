package ExamPreparation.Exam6June2019;

import java.util.Scanner;

public class P06FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Петък вечер е и се чудите кой филм да си пуснете да гледате.
        // Решавате да напишете програма, която да избере това вместо вас.
        // До команда "STOP" получавате заглавия на любими ваши филми. Най-добрият филм за вас ще бъде този, който има най-много точки.
        // Точките се изчисляват като сбор от ASCII стойностите на символите в заглавието на филма.
        // (няма да има случай, в който имаме два филма с равен брой точки)
        // При изчислението на точките трябва да се има предвид следното: •
        // За всяка малка буква в заглавието, от сумата трябва да се извади два пъти дължината на заглавието на филма. •
        // За всяка главна буква в заглавието, от сумата трябва да се извади дължината на заглавието на филма.
        // Може да имате максимум 7 заглавия на филми.
        //Вход
        //От конзолата се четат редове до команда "STOP" или до достигането на лимита от 7 филма:
        //• Заглавие на филм – текст;
        //Изход
        //На конзолата да се отпечата:
        //• Ако сте достигнали лимита от 7 филма трябва да отпечатате:
        //"The limit is reached."
        //Да се отпечата най-добрият филм за вас:
        //"The best movie for you is {заглавие на филм} with {сума на символите} ASCII sum."

        String input = scanner.nextLine();
        int nameCounter = 0;
        double max = Double.MIN_VALUE;
        String winner = "";

        while(!input.equals("STOP")) {
            String name = input;

            double points = 0;
            double totalPoints = 0;

            for (int i = 0; i < name.length()  ; i++) {
                points = name.charAt(i);
                totalPoints = points + totalPoints;
                if (points >= 97 && points <= 122) {
                    totalPoints = totalPoints - 2 * name.length();
                }
                if (points >= 65  && points <= 90 ) {
                    totalPoints = totalPoints - name.length();
                }
                if (totalPoints > max) {
                    max = totalPoints;
                    winner = name;
                }
            }


            nameCounter++;
            if (nameCounter == 7) {
                System.out.println("The limit is reached.");
                break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("The best movie for you is %s with %.0f ASCII sum.", winner, max);

    }
}
