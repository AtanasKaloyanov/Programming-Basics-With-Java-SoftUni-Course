package T02ConditionalStatements.Exercise;

import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serial = scanner.nextLine();
        int durationSerial = Integer.parseInt(scanner.nextLine());
        int durationBreak = Integer.parseInt(scanner.nextLine());

        double lunch = 0.125 * durationBreak ;
        double rest = 0.25 * durationBreak;

        if (durationSerial <= durationBreak - lunch - rest )
        {
            double leftTime = (durationBreak - lunch - rest - durationSerial);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serial, Math.ceil(leftTime));

        }
        else {
            double timeNeeded = (durationSerial - (durationBreak -lunch - rest));
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serial, Math.ceil(timeNeeded));
        }
    }
}
