package T03ConditionalStatementsAdvaneced.Exercise;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        // 2. Studio and apartment prices assignment
        double studioPrice = 0;
        double apartmentPrice = 0;

        switch (month) {
            case "May":
            case "October":
                studioPrice = 50;
                if (nights > 7 && nights <= 14) {
                    studioPrice *= 0.95;
                } else if (nights > 14) {
                    studioPrice *= 0.70;
                }

                apartmentPrice = 65;
                break;

            case "June":
            case "September":
                studioPrice = 75.20;
                if (nights > 14) {
                    studioPrice *= 0.80;
                }

                apartmentPrice = 68.70;
                break;

            case "July":
            case "August":
                studioPrice = 76;
                apartmentPrice = 77;
                break;
        }

        if (nights > 14) {
            apartmentPrice *= 0.90;
        }

        // 3. Studio and apartment sum computation
        double apartmentSum = apartmentPrice * nights;
        double studioSum = studioPrice * nights;

        // 4. Output printing - 2 cases:
        System.out.printf("Apartment: %.2f lv.\n", apartmentSum);
        System.out.printf("Studio: %.2f lv.", studioSum);
    }
}

