package T07Exams.ExamPreparation.Exam3April2019;

import java.util.Scanner;

public class P05MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Деси много обича да гледа филми, но често й е трудно да си избере подходящ за гледане.
        // Набелязва си определен брой филми и иска да си избере кой филм да гледа спрямо рейтинга на филмите.
        //Напишете програма, която показва кой филм е с най-висок рейтинг, кой е с най-нисък и колко е средният рейтинг от всички филми,
        // които си е набелязала да гледа.
        //Вход
        //От конзолата първо се чете един ред:
        //• Брой филми, които си е набелязала Деси – цяло число в интервала [1…20]
        //За всеки филм се прочитат два отделни реда:
        //• Име на филма – текст
        //• Рейтинг на филма - реално число в интервала [1.00…10.00]
        //Изход
        //Отпечатват се три реда в следния формат:
        //• "{име на филма с най-висок рейтинг} is with highest rating: {рейтинг на филма}"
        //• "{име на филма с най-нисък рейтинг} is with lowest rating: {рейтинг на филма}"
        //• "Average rating: {средният рейтинг на всички филми}"
        //Максималният, минималният и средният рейтинг да се форматира до първата цифра след десетичния знак.

        int numberFilms = Integer.parseInt(scanner.nextLine());
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;
        String maxRating = "";
        String minRating = "";
        int counter = 0;

        for (int i = 1; i <= numberFilms; i++) {
            String name = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            counter++;

            if (rating > max) {
                max = rating;
                maxRating = name;
            } if (rating < min) {
                min = rating;
                minRating = name;
            }
            sum = rating + sum;
        }
        System.out.printf("%s is with highest rating: %.1f%n", maxRating, max );
        System.out.printf("%s is with lowest rating: %.1f%n", minRating, min);
        System.out.printf("Average rating: %.1f", sum / counter);
    }
}
