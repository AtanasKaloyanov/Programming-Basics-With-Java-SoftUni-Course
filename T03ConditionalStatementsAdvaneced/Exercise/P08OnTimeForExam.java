package T03ConditionalStatementsAdvaneced.Exercise;

import java.util.Scanner;

public class P08OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Студент трябва да отиде на изпит в определен час. Той идва в изпитната зала в даден час на пристигане.
//        Счита се, че студентът е дошъл навреме, ако е пристигнал в часа на изпита или до половин час преди това.
//        Ако е пристигнал по-рано повече от 30 минути, той е подранил.
//        Ако е дошъл след часа на изпита, той е закъснял.
//        Напишете програма, която прочита време на изпит и време на пристигане и отпечатва дали студентът е дошъл навреме,
//                дали е подранил или е закъснял и с колко часа или минути е подранил или закъснял.
//
//                Вход
//        От конзолата се четат 4 цели числа (по едно на ред), въведени от потребителя:
//•	Първият ред съдържа час на изпита – цяло число от 0 до 23.
//•	Вторият ред съдържа минута на изпита – цяло число от 0 до 59.
//•	Третият ред съдържа час на пристигане – цяло число от 0 до 23.
//•	Четвъртият ред съдържа минута на пристигане – цяло число от 0 до 59.
//        Изход
//        На първият ред отпечатайте:
//•	“Late”, ако студентът пристига по-късно от часа на изпита.
//•	“On time”, ако студентът пристига точно в часа на изпита или до 30 минути по-рано.
//•	“Early”, ако студентът пристига повече от 30 минути преди часа на изпита.
//                Ако студентът пристига с поне минута разлика от часа на изпита, отпечатайте на следващия ред:

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int minutesExam = examHour * 60 + examMinutes;
        int minutesArrival = arrivalHour * 60 + arrivalMinutes;

        if (minutesArrival > minutesExam && minutesArrival < minutesExam + 60) {
            int minutesLate = minutesArrival - minutesExam;
            System.out.println("Late");
            System.out.printf("%d minutes after the start", minutesLate);


        }
        if (minutesArrival >= minutesExam + 60) {
            int minutesLate = minutesArrival - minutesExam;
            int hourAfterTheStart = minutesLate / 60;
            int minutesAfterTheStart = minutesLate % 60;
            if (minutesAfterTheStart < 10) {
                System.out.println("Late");
                System.out.printf("%d:0%d hours after the start", hourAfterTheStart, minutesAfterTheStart);}
                if (minutesAfterTheStart >= 10) {
                    System.out.println("Late");
                    System.out.printf("%d:%d hours after the start", hourAfterTheStart, minutesAfterTheStart);
            }

        }
        if (minutesArrival == minutesExam) {
            System.out.println("On time");
        }
        if (minutesArrival < minutesExam && minutesArrival >= minutesExam - 30) {
            int minutesBeforeTheStart = minutesArrival - minutesExam;
            System.out.println("On time");
            System.out.printf("%d minutes before the start", Math.abs(minutesBeforeTheStart));
        }
        if (minutesArrival < minutesExam - 30 && minutesArrival >= minutesExam - 59) {
            int minutesBeforeTheStart = minutesArrival - minutesExam;

            System.out.println("Early");
            System.out.printf("%d minutes before the start", Math.abs(minutesBeforeTheStart));
        }
        if (minutesArrival <= minutesExam - 60) {
            int minutesBeforeTheStart = minutesExam - minutesArrival;
            int minutesBeforeTheStart1 = minutesBeforeTheStart % 60;
            int hoursBeforeTheStart = minutesBeforeTheStart / 60;
            if (minutesBeforeTheStart1 < 10) {
                System.out.println("Early");
                System.out.printf("%d:0%d hours before the start", Math.abs(hoursBeforeTheStart), Math.abs(minutesBeforeTheStart1));
            } else if (minutesBeforeTheStart1 >= 10) {
                System.out.println("Early");
                System.out.printf("%d:%d hours before the start", Math.abs(hoursBeforeTheStart), Math.abs(minutesBeforeTheStart1));
            }

        }
    }
}


