package T01FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P05SuppliesToSchool {
    public static void main(String[] args) {
        // 1. Input Reading
        Scanner scanner = new Scanner(System.in);
        int packagesPens = Integer.parseInt(scanner.nextLine());
        int packagesMarkers = Integer.parseInt(scanner.nextLine());
        int litersPreparation = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        // 2. Sum calculating
        double discount2 = discount / 100.00;
        double amountBeforeDiscount = packagesPens * 5.80 + packagesMarkers * 7.20 + litersPreparation * 1.20;

        // 3. Result printing
        double amountAfterDiscount = amountBeforeDiscount - (amountBeforeDiscount * discount2);
        System.out.println(amountAfterDiscount);
    }
}
