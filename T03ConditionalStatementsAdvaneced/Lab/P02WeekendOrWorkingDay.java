package T03ConditionalStatementsAdvaneced.Lab;

import java.util.Scanner;

public class P02WeekendOrWorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Напишете програма която, чете ден от седмицата (текст), на английски език - въведен от потребителя.
//        Ако денят е работен отпечатва на конзолата - "Working day", ако е почивен - "Weekend".
//        Ако се въведе текст различен от ден от седмицата да се отпечата - "Error".
//                Примерен вход и изход
//        Вход	Изход
//        Monday	Working day
//
//        Вход	Изход
//        Sunday	Weekend
//
//        Вход	Изход
//        April	Error

        String dayOfWeek = scanner.nextLine();

        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday" :
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
            break;


        }

    }
}
