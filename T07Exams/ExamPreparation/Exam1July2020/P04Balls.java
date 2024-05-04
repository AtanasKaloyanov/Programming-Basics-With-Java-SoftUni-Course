package T07Exams.ExamPreparation.Exam1July2020;

import java.util.Scanner;

public class P04Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //В кутия имаме неопределен брой топки с различни цветове, които ни носят различен брой точки. Задачата ни е да извадим Х бр.
        // топки, които ще бъдат въведени от конзолата, като се има в предвид, че всеки различен цвят влияе на точките ни по следния начин:
        //•	Ако топката е “red” точките ни се повишават с 5.
        //•	Ако топката е “orange” точките ни се повишават с 10.
        //•	Ако топката е “yellow” точките ни се повишават с 15.
        //•	Ако топката е “white” точките ни се повишават с 20.
        //•	Ако топката е “black” точките ни се делят на 2, като закръгляме към по-малкото цяло число.
        //Ако топката е с какъвто и да е цвят, различен от по-горните, точките не се манипулират и програмата продължава да работи.
        //Вход:
        //1.	От конзолата се чете 1 цяло число N, което е броят на топките в диапазон (0-1000).
        //2.	След това се четат N на брой цветове.
        //Изход:
        //Отпечатват се следните редове:
        //“Total points: {всичките събрани точки}”
        //“Points from red balls {броят червени топки}”
        //“Points from orange balls {броят оранжеви топки}”
        //“Points from yellow balls {броят жълти топки}”
        //“Points from white balls {броят бели топки}”
        //“Other colors picked: {броят на избраните топки извън зададените цветове}”
        //“Divides from black balls: {броят на пътите, в които точките са били разделяни на 2}”

        int N = Integer.parseInt(scanner.nextLine());

        double totalPoints = 0;
        int redPointsCounter = 0;
        int orangePointsCounter = 0;
        int yellowPointsCounter = 0;
        int whitePointsCounter = 0;
        int blackPointsCounter = 0;
        int otherColourCounter = 0;


        for (int i = 1; i <= N; i++) {
           String colour = scanner.nextLine();
            switch (colour) {
                case "red":
                    totalPoints = totalPoints + 5;
                    redPointsCounter++;
                    break;
                case "orange":
                    totalPoints = totalPoints + 10;
                    orangePointsCounter++;
                    break;
                case "yellow":
                    totalPoints = totalPoints + 15;
                    yellowPointsCounter++;
                    break;
                case "white":
                    totalPoints = totalPoints + 20;
                    whitePointsCounter++;
                    break;
                case "black":
                    totalPoints = Math.floor(totalPoints / 2);
                    blackPointsCounter++;
                    break;
            }
            if (!colour.equals("red") && !colour.equals("orange") && !colour.equals("yellow")
                    && !colour.equals("white") && !colour.equals("black")) {
                otherColourCounter++;
                continue;
            }

        }
        System.out.printf("Total points: %.0f%n", totalPoints);
        System.out.printf("Points from red balls: %d%n", redPointsCounter);
        System.out.printf("Points from orange balls: %d%n", orangePointsCounter);
        System.out.printf("Points from yellow balls: %d%n", yellowPointsCounter);
        System.out.printf("Points from white balls: %d%n", whitePointsCounter);
        System.out.printf("Other colors picked: %d%n", otherColourCounter);
        System.out.printf("Divides from black balls: %d", blackPointsCounter);

    }
}
