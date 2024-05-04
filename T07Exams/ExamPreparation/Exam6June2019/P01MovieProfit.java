package T07Exams.ExamPreparation.Exam6June2019;

import java.util.Scanner;

public class P01MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Наети сте от "SoftUni Studios" да напишете програма която пресмята потенциалната печалба от продажбата на билети за филм.
        // Прожекцията на филма трае предварително зададен брой дни, като всеки ден се продават определен брой билети.
        // Цената на 1 билет се определя от студиото. За излъчване на продукцията, определен процент от общия приход остава за киното.
        //Вход
        //От конзолата се четат 5 реда:
        //1. Име на филм - текст
        //2. Брой дни - цяло число в диапазона [1… 90]
        //3. Брой билети - цяло число в диапазона [100… 100000]
        //4. Цена на билет - реално число в диапазона [5.0… 25.0]
        //5. Процент за киното - цяло число в диапазона [5... 35]
        //Изход
        //Да се отпечата на конзолата прихода от продажбите, в следния формат:
        //• "The profit from the movie {име на филм} is {приход на студиото} lv."
        //Цената на прихода да бъде форматирана до втората цифра след десетичния знак.

        String name = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticket = Double.parseDouble(scanner.nextLine());
        int percentage = Integer.parseInt(scanner.nextLine());

        double sum = ticket * tickets * days - (percentage * 1.00 / 100) *  ticket * tickets * days;

        System.out.printf("The profit from the movie %s is %.2f lv.", name, sum);

    }
}
