package T07Exams.ExamPreparation.Exam6June2019;

import java.util.Scanner;

public class P01SeriesCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която изчислява колко време ще ви отнеме да изгледате всички епизоди на един сериал в минути.
        // Ще разполагате с брой сезони, брой епизоди на сезон и времетраене на един епизод.
        // Във всеки епизод има реклами, които са с продължителност 20% от времето на един епизод.
        // Също така знаете, че всеки сезон завършва със специален епизод, който е с 10м по-дълъг от обичайното.
        //Вход
        //От конзолата се четат 4 реда:
        //• Име на сериал - текст
        //• Брой сезони – цяло число в диапазона [1… 10]
        //• Брой епизоди – цяло число в диапазона [10… 80]
        //• Времетраене на обикновен епизод без рекламите – реално число в диапазона [40.0… 65.0]
        //Изход
        //Да се отпечата на конзолата времето, необходимо за изглеждане на всички епизоди,
        // закръглено до най-близкото цяло число надолу в следния формат:
        //"Total time needed to watch the {име на сериал} series is {време} minutes."

        String name = scanner.nextLine();
        int numberSeason = Integer.parseInt(scanner.nextLine());
        int numberEpisodes = Integer.parseInt(scanner.nextLine());
        double oneEpisode = Double.parseDouble(scanner.nextLine());

        double sum = 1.2 * oneEpisode * numberEpisodes * numberSeason + numberSeason * 10;
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", name, sum);
    }
}
