package T02ConditionalStatements.Exercise;

import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distanc = Double.parseDouble(scanner.nextLine());
        double timeFor1m = Double.parseDouble(scanner.nextLine());

        double delay = Math.floor(distanc / 15);


        double timeIvan = timeFor1m * distanc  + delay * 12.5;
        if (timeIvan < record)
        {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeIvan);

        }
        else {double neededSeconds = timeIvan - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", neededSeconds);
        }
    }
}
