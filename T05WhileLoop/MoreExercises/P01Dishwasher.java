package T05WhileLoop.MoreExercises;

import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {
        // 1. Reading input
        Scanner scanner = new Scanner(System.in);
        int bottles = Integer.parseInt(scanner.nextLine());

        // 2. All milliliters computation then liquid using via while cycle
       int washigUpLiquid = bottles * 750;

        // 2.1. counting and reading number
        int allCounter = 0;
        int dishes = 0;
        int pots = 0;
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            allCounter++;
            int currentNumber = Integer.parseInt(input);

            //2.2. liquid computation
            if (allCounter % 3 == 0) {
                washigUpLiquid -= currentNumber * 15;
                pots += currentNumber;
            } else {
                washigUpLiquid -= currentNumber * 5;
                dishes += currentNumber;
            }

            if (washigUpLiquid < 0) {
                int neededLiquid = Math.abs(washigUpLiquid);
                System.out.printf("Not enough detergent, %d ml. more necessary!", neededLiquid);
                return;
            }
            // 2.3 variable update
            input = scanner.nextLine();
        }

        // Printing
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n", dishes, pots);
            System.out.printf("Leftover detergent %d ml.", washigUpLiquid);
    }
}
