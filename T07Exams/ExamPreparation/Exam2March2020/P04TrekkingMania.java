package T07Exams.ExamPreparation.Exam2March2020;

import java.util.Scanner;

public class P04TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Катерачи от цяла България се събират на групи и набелязват следващите върхове за изкачване.
        // Според размера на групата, катерачите ще изкачват различни върхове.
        // Група до 5 човека– Мусала
        // Група от 6 до 12 – Монблан
        // Група от 13 до 25 – Килиманджаро
        // Група от 26 до 40 – К2
        // Група от 41 или повече – Еверест
        //Да се напише програма, която изчислява процента на катерачите изкачващи всеки връх.
        //Вход
        //От конзолата се четат поредица от числа, всяко на отделен ред:
        // На първия ред – броя на групите от катерачи – цяло число в интервала [1...1000]
        // За всяка една група на отделен ред – броя на хората в групата – цяло число в интервала [1...1000]
        //Изход
        //Да се отпечатат на конзолата 5 реда, всеки от които съдържа процент между 0.00% и 100.00%
        // с точност до втората цифра след десетичната запетая.
        // Първи ред - процентът изкачващи Мусала
        // Втори ред – процентът изкачващи Монблан
        // Трети ред – процентът изкачващи Килиманджаро
        // Четвърти ред – процентът изкачващи К2
        // Пети ред – процентът изкачващи Еверест

        int numberGroups = Integer.parseInt(scanner.nextLine());
        int allPeople = 0;
        int musala = 0;
        int monblan = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <= numberGroups; i++) {
            int numberPeopleInGroup = Integer.parseInt(scanner.nextLine());
            allPeople = numberPeopleInGroup + allPeople;

            if (numberPeopleInGroup <= 5) {
          musala = numberPeopleInGroup + musala;
            }else if (numberPeopleInGroup <= 12) {
                monblan = numberPeopleInGroup + monblan;
            }else if (numberPeopleInGroup <= 25) {
                kilimanjaro = numberPeopleInGroup + kilimanjaro;
            }else if (numberPeopleInGroup <= 40) {
                k2 = numberPeopleInGroup + k2;
            }else if (numberPeopleInGroup > 40) {
                everest = numberPeopleInGroup + everest;
            }
        }
        System.out.printf("%.2f%%%n", musala * 1.00 / allPeople * 100 );
        System.out.printf("%.2f%%%n", monblan * 1.00 / allPeople * 100 );
        System.out.printf("%.2f%%%n", kilimanjaro * 1.00 / allPeople * 100 );
        System.out.printf("%.2f%%%n", k2 * 1.00 / allPeople * 100 );
        System.out.printf("%.2f%%", everest * 1.00 / allPeople * 100 );
    }
}
