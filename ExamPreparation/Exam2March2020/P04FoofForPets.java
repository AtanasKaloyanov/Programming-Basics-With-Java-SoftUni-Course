package ExamPreparation.Exam2March2020;

import java.util.Scanner;

public class P04FoofForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ани има два домашни любимеца - куче и котка.
        // Напишете програма, която изготвя статистика за храната на домашните любимци за определен брой дни.
        // Всеки ден кучето и котката изяждат различно количество от общата им храна.
        // На всеки трети ден получават награда - бисквитки. Количеството на бисквитките е 10% от общо изядената храна за деня.
        //Вашата програма трябва да отпечатва статистика за количеството бисквитки,
        // които са изяли, колко процента от първоначалното количество обща храна са изяли и
        // колко процента от изядената храна е изяло кучето и колко е изяла котката.
        //Вход
        //Първоначално се чете един ред:
        // Брой дни – цяло число в диапазона [1…30]
        // Общо количество храна – реално число в диапазона [0.00…10000.00]
        //След това за всеки ден се чете:
        //o Количество изядена храна от кучето – цяло число в диапазона [10…500]
        //o Количество изядена храна от котката – цяло число в диапазона [10…500]
        //Изход
        //На конзолата да се отпечатват четири реда:
        // "Total eaten biscuits: {количество изядени бисквитки}gr."
        // "{процент изядена храна}% of the food has been eaten."
        // "{процент изядена храна от кучето}% eaten from the dog."
        // "{процент изядена храна от котката}% eaten from the cat."
        //Количеството изядени бисквитки трябва да бъде закръглено до най – близкото цяло число,
        // а процентът храна трябва да бъде форматиран до втората цифра след десетичния знак.

        int numberDays = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());



        double biscuits = 0;
        double totalBiscuits = 0;
        double eatenFoodForDay = 0;
        double allEatenFood = 0;
        double dogEatenFood = 0;
        double catEatenFood = 0;


        for (int i = 1; i <= numberDays ; i++) {

            int dogFoot = Integer.parseInt(scanner.nextLine());
            int catFoot = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0) {
                 biscuits = 0.1 * (dogFoot + catFoot);
                totalBiscuits = biscuits + totalBiscuits;
            } else {
                biscuits = 0;
            }
            eatenFoodForDay = dogFoot + catFoot;
            allEatenFood = eatenFoodForDay + allEatenFood;

            dogEatenFood = dogFoot + dogEatenFood;
            catEatenFood = catFoot + catEatenFood;
        }
//"Total eaten biscuits: {количество изядени бисквитки}gr."
// "{процент изядена храна}% of the food has been eaten."
// "{процент изядена храна от кучето}% eaten from the dog."
// "{процент изядена храна от котката}% eaten from the cat."


        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(totalBiscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", allEatenFood / food * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", dogEatenFood / allEatenFood * 100);
        System.out.printf("%.2f%% eaten from the cat.", catEatenFood / allEatenFood * 100);
    }
}
