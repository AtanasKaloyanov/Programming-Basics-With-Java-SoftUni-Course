package T07Exams.ExamPreparation.Exam3April2019;

import java.util.Scanner;

public class P01OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Филмовата академия на САЩ от 1929г. ежегодно раздава награди Оскар на грандиозна церемония.
        // Организаторите искат да разберат колко са разходите по организирането на една такава церемония.
        // Напишете програма, която изчислява какви разходи ще има академията по организацията на събитието,
        // като знаете колко е наемът на залата, в която ще се проведе.
        //• Статуетки – цената им е 30% по-малка от наема на залата
        //• Кетъринг – цената му е 15% по-малка от тази на статуетките
        //• Озвучаване – цената му е 1 / 2 от цената за кетъринг
        //Вход
        //От конзолата се четe 1 ред:
        //• Наем за залата – цяло число в интервала [0 … 999]
        //Изход
        //Да се отпечата на конзолата колко ще са разходите по организирането на церемонията.
        // Сумата да бъде форматирана до втория знак след десетичния знак.

        int rent = Integer.parseInt(scanner.nextLine());

        double statues = 0.7 * rent;
        double catering = 0.85 * statues;
        double sound = 0.5 * catering;

        double sum = rent + statues + catering + sound;
        System.out.printf("%.2f", sum);
    }
}
