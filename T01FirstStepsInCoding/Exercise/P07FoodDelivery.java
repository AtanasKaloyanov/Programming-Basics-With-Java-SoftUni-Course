package T01FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        // 1. Reading the input
        Scanner scanner = new Scanner(System.in);
        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegetarianMenus = Integer.parseInt(scanner.nextLine());

        // 2. Calculating the main menu and then the dessert
        double mainFoodSum = chickenMenus * 10.35 + fishMenus * 12.40 + vegetarianMenus * 8.15;
        double dessertSum = mainFoodSum * 0.2;

        // 3. Adding the dessert and the delivery to the main menu
        double delivery = 2.50;
        double check = mainFoodSum + dessertSum + delivery;

        // 4. Printing
        System.out.println(check);
    }
}

/*
Prices:

chicken - 10.35
fish - 12.40
vegetarian - 8.15

dessert - 20 & of all costs but without the delivery
delivery - 2.50;

 */
