package T01FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P05SuppliesToSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Сумата без отстъпка = (пакет химикали * 5.80 + пакет маркери * 7.20 + литри препарат * 1.20)
        // Сумата с отстъпка = Сумата без отстъпка - (Сумата без отстъпка * отстъпка)
        // amountBeforeDiscount = (packagesPens * 5.80 + packagesMarkers * 7.20 + litersPreparation * 1.20
        // amountAfterDiscount = amountBeforeDiscount - (amountBeforeDiscount * discount)

        int packagesPens = Integer.parseInt(scanner.nextLine());
        int packagesMarkers = Integer.parseInt(scanner.nextLine());
        int litersPreparation = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double discount2 = discount / 100.00;
        double amountBeforeDiscount = packagesPens * 5.80 + packagesMarkers * 7.20 + litersPreparation * 1.20;
        double amountAfterDiscount = amountBeforeDiscount - (amountBeforeDiscount * discount2);
        System.out.println(amountAfterDiscount);
    }
}
