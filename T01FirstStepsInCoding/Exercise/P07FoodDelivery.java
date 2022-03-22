package T01FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Меню без десерт = пилешко меню * 10.35 + рибно меню * 12.40 + веган меню * 8.15
        //десерт = 0.2 * меню без десерт
        //Сметка = Меню без десерт + десер + 2.50

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());
        double menuWithoutDessert = chickenMenu * 10.35 + fishMenu * 12.40 + veganMenu * 8.15;
        double dessert = menuWithoutDessert * 0.2;
        double totalCosts = menuWithoutDessert + dessert + 2.50;
        System.out.println(totalCosts);
    }
}
