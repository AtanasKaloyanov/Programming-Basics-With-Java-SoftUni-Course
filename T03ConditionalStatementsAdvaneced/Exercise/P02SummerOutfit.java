package T03ConditionalStatementsAdvaneced.Exercise;

import java.util.Scanner;

public class P02SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Лято е с много променливо време и Виктор има нужда от вашата помощ.
//                Напишете програма която спрямо времето от денонощието и градусите да препоръча на Виктор какви дрехи да си облече.
//                Вашия приятел има различни планове за всеки етап от деня,
//                които изискват и различен външен вид, тях може да видите от таблицата.
//                От конзолата се четат точно два реда:
//•	Градусите - цяло число в интервала [10…42]
//•	Текст, време от денонощието - с възможности - "Morning", "Afternoon", "Evening"

        // Да се отпечата на конзолата на един ред: "It's {градуси} degrees, get your {облекло} and {обувки}."

        int grades = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        String outfit = "";
        String shoes = "";


        if (time.equals("Morning")) {
            if (grades >= 10 && grades <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
                System.out.printf("It's %d degrees, get your %s and %s.", grades, outfit, shoes);
            } else if (grades > 18 && grades <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", grades, outfit, shoes);
            } else if (grades >= 25) {
                outfit = "T-Shirt";
                shoes = "Sandals";
                System.out.printf("It's %d degrees, get your %s and %s.", grades, outfit, shoes);
            }

        } else if (time.equals("Afternoon")) {
            if (grades >= 10 && grades <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", grades, outfit, shoes);
            } else if (grades > 18 && grades <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
                System.out.printf("It's %d degrees, get your %s and %s.", grades, outfit, shoes);
            } else if (grades >= 25) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
                System.out.printf("It's %d degrees, get your %s and %s.", grades, outfit, shoes);
            }


        } else if (time.equals("Evening")) {
            if (grades >= 10 && grades <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", grades, outfit, shoes);
            } else if (grades > 18 && grades <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", grades, outfit, shoes);
            } else if (grades >= 25) {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", grades, outfit, shoes);
            }
        }
    }
}