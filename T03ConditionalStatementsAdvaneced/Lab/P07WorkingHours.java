package T03ConditionalStatementsAdvaneced.Lab;

import java.util.Scanner;

public class P07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Да се напише програма, която чете час от денонощието(цяло число) и ден от седмицата(текст)
//        - въведени от потребителя и проверява дали офисът на фирма е отворен,
//        като работното време на офисът е от 10-18 часа, от понеделник до събота включително
//        Примерен вход и изход
//        вход	изход		вход	изход	 	вход	изход
//        11
//        Monday	open		19
//        Friday	closed		11
//        Sunday	closed

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if ((hour >= 10 && hour <= 18) && (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") ||
                day.equals("Friday") || day.equals("Saturday"))) {
            System.out.println("open");

        } else System.out.println("closed");
    }
}
