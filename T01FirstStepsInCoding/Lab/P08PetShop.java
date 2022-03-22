package T01FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberPackageDogFood = Integer.parseInt(scanner.nextLine());
        int numberPackageCatFood = Integer.parseInt(scanner.nextLine());
        double costsDogFood = numberPackageDogFood * 2.50;
        int costsCatFood = numberPackageCatFood * 4;
        double allCosts = costsDogFood + costsCatFood;
        // "{крайната сума} lv."
        System.out.println(allCosts + " lv.");
    }
}
