package ExamPreparation.Exam2March2020;

import java.util.Scanner;

public class P06TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Напишете програма, която проследява представянето на вашия отбор на благотворителен коледен турнир.
// Всеки ден получавате имена на игри до команда "Finish".
// Със спечелването на всяка една игра печелите по 20лв. за благотворителност.
// Трябва да изчислите колко пари сте спечелили на края на деня.
// Ако имате повече спечелени игри, отколкото загубени – вие сте победители този ден и увеличавате парите от него с 10%.
// При приключване на турнира ако през повечето дни сте били победители печелите турнира и увеличавате всичките спечелени пари с 20%.
//Никога няма да имате равен брой спечелени и загубени игри.
//Вход
//Първоначално от конзолата се прочита броя дни на турнира – цяло число в интервала [1… 20]
//До получаване на командата "Finish" се чете:
// Спорт – текст
//За всеки спорт се прочита:
//o Резултат – текст с възможности: "win" или "lose"
//Изход
//Накрая се отпечатва един ред:
// Ако сте спечелили турнира:
//"You won the tournament! Total raised money: {спечелените пари}"
// Ако сте загубили на турнира:
//"You lost the tournament! Total raised money: {спечелените пари}"
//Парите да бъдат форматирани до втората цифра след десетичния знак.

        int days = Integer.parseInt(scanner.nextLine());

        double totalMoney = 0;

        int winningDaysCounter = 0;
        int losingDayCounter = 0;

        for (int i = 1; i <= days; i++) {


            String input = scanner.nextLine();

            double money = 0;
            int winCounter = 0;
            int loseCounter = 0;


            while (!input.equals("Finish")) {

                String sport = input;
                String result = scanner.nextLine();

                if (result.equals("win")) {
                    money = money + 20;
                    winCounter++;
                }
                if (result.equals("lose")) {
                    loseCounter++;
                }


                input = scanner.nextLine();
            }


            if (winCounter > loseCounter) {
                money = 1.1 * money;
                winningDaysCounter++;

            }
            if (loseCounter > winCounter) {
                losingDayCounter++;
            }


            totalMoney = money + totalMoney;
        }


        if (winningDaysCounter > losingDayCounter) {
            totalMoney = 1.2 * totalMoney;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        } if (losingDayCounter > winningDaysCounter) {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }

    }
}
