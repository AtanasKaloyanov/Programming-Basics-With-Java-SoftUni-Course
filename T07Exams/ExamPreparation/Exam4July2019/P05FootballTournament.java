package T07Exams.ExamPreparation.Exam4July2019;

import java.util.Scanner;

public class P05FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задачата ви е да напишете програма, която приема името на отбор и прави статистика за него.
        // През един сезон всеки отбор изиграва определен брой футболни срещи,
        // като за всяка среща на отбора се дават точки в зависимост от изхода от срещата.
        // Има три възможни изхода от една среща:
        //▪ W - Отборът е победител и получава 3 точки
        //▪ D - Срещата е завършила без победител и отборът получава 1 точка
        //▪ L - Отборът е загубил срещата и не получава точки
        //Напишете програма, която приема името на футболен отбор и извежда неговата статистика,
        // на база на изиграните срещи през този сезон.
        // Неговата статистика трябва да включва общия брой спечелени точки през настоящия сезон,
        // подробна статистика за изхода на изиграните игри и процент победи през сезона.
        // Ако отборът по някаква причина не е играл мачове през настоящия сезон се извежда специално съобщение.
        //Вход
        //От конзолата се четат два реда:
        //• Името на футболния отбор, за който водим статистика - текст
        //• Броя изиграни срещи през настоящия сезон - цяло число в интервала [0… 100]
        //За всяка изиграна среща се прочита отделен ред:
        //o Резултатът от изиграната среща в един от горепосочените формати – символ с възможности 'W', 'D' и 'L'
        //Изход
        //В зависимост от това дали отборът е играл мачове през настоящия сезон се извеждат два вида изход.
        //• Ако отборът не е изиграл нито един мач през настоящия сезон се извежда точно един ред в следния формат:
        //o "{името на отбора} hasn't played any games during this season."
        //• Ако отборът е изиграл един мач или повече се извеждат шест реда в следния формат:
        //o "{името на отбора} has won {брой спечелени точки} points during this season"
        //o "Total stats:"
        //o "## W: {брой спечелени игри}"
        //o "## D: {брой игри, завършили наравно}"
        //o "## L: {брой загубени игри}"
        //o "Win rate: {процент спечелени игри}%"
        //Процентът спечелени игри трябва да бъде форматиран до втората цифра след десетичния знак.
        int result = 0;
        int sum = 0;
        int winsCounter = 0;
        int losesCounter = 0;
        int drawsCounter = 0;

        String team = scanner.nextLine();
        int matches = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= matches; i++) {


            String symbol = scanner.nextLine();

            if (symbol.equals("W")) {
                result = 3;
                winsCounter++;
            }
            if (symbol.equals("D")) {
                result = 1;
                drawsCounter++;
            }
            if (symbol.equals("L")) {
                result = 0;
                losesCounter++;

            }
            sum = result + sum;
        }
            if (matches == 0) {
                System.out.printf("%s hasn't played any games during this season.", team);
            } else {
                System.out.printf("%s has won %d points during this season.%n", team, sum);
                System.out.println("Total stats:");


                //"{името на отбора} has won {брой спечелени точки} points during this season"
                //o "Total stats:"
                //o "## W: {брой спечелени игри}"
                //o "## D: {брой игри, завършили наравно}"
                //o "## L: {брой загубени игри}"
                //o "Win rate: {процент спечелени игри}%"
                System.out.printf("## W: %d%n", winsCounter);
                System.out.printf("## D: %d%n", drawsCounter);
                System.out.printf("## L: %d%n", losesCounter);
                System.out.printf("Win rate: %.2f%%", winsCounter * 1.0 / matches * 100 );
        }
    }
}

