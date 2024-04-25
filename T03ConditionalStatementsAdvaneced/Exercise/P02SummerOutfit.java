package T03ConditionalStatementsAdvaneced.Exercise;

import java.util.Scanner;

public class P02SummerOutfit {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int grades = Integer.parseInt(scanner.nextLine());
        String timeDay = scanner.nextLine();

        // 2. Assignment of the outfit and the shoes
        String outfit = null;
        String shoes = null;
        switch (timeDay) {
            case "Morning":
                if (grades >= 10 && grades <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (grades <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (grades >= 10 && grades <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (grades <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                if (grades >= 10 && grades <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (grades <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;
        }

        // 3. Output printing
        System.out.printf("It's %d degrees, get your %s and %s.", grades, outfit, shoes);
    }
}