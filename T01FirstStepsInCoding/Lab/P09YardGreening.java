package T01FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //discount = (meters * 7.61) * 0.18
        //The final price is {крайната цена на услугата} lv.
        //The discount is {отстъпка} lv.

        double meters = Double.parseDouble(scanner.nextLine());
        double priceWithoutDiscount = meters * 7.61;
        double discount = priceWithoutDiscount * 0.18;
        double finalPrice = priceWithoutDiscount - discount;
        System.out.println("The final price is: "  + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
