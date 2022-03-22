package T04ForLoop.Exercise;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Катерачи от цяла България се събират на групи и набелязват следващите върхове за изкачване.
//        Според размера на групата, катерачите ще изкачват различни върхове.
//•	Група до 5 човека – изкачват Мусала
//•	Група от 6 до 12 човека – изкачват Монблан
//•	Група от 13 до 25 човека – изкачват Килиманджаро
//•	Група от 26 до 40 човека –  изкачват К2
//•	Група от 41 или повече човека – изкачват Еверест
//        Да се напише програма, която изчислява процента на катерачите изкачващи всеки връх.
//                Вход
//        От конзолата се четат поредица от числа, всяко на отделен ред:
//•	На първия ред – броя на групите от катерачи – цяло число в интервала [1...1000]
//•	За всяка една група на отделен ред – броя на хората в групата – цяло число в интервала [1...1000]
//        Изход
//        Да се отпечатат на конзолата 5 реда, всеки от които съдържа процент между 0.00% и 100.00% с точност до втората цифра
//        след десетичната запетая.
//•	Първи ред - процентът изкачващи Мусала
//•	Втори ред – процентът изкачващи Монблан
//•	Трети ред – процентът изкачващи Килиманджаро
//•	Четвърти ред – процентът изкачващи К2
//•	Пети ред – процентът изкачващи Еверест




        int numberOfGroups = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <= numberOfGroups ; i++) {
           int numberOfPeopleInGroup = Integer.parseInt(scanner.nextLine());

           if (numberOfPeopleInGroup <= 5) {
               musala += numberOfPeopleInGroup;

           } else if (numberOfPeopleInGroup <= 12) {
               monblan += numberOfPeopleInGroup;

           }else if (numberOfPeopleInGroup <= 25) {
               kilimandjaro += numberOfPeopleInGroup;

           }else if (numberOfPeopleInGroup <= 40) {
               k2 += numberOfPeopleInGroup;

           }else if (numberOfPeopleInGroup  > 40) {
               everest += numberOfPeopleInGroup;


           }
        }
        int totalPeople = musala + monblan + kilimandjaro + k2 + everest;
                System.out.printf("%.2f%%%n", (musala * 1.00/ totalPeople) * 100);
        System.out.printf("%.2f%%%n",  (monblan * 1.00/ totalPeople) * 100);
        System.out.printf("%.2f%%%n", (kilimandjaro * 1.00/ totalPeople) * 100);
        System.out.printf("%.2f%%%n", (k2 * 1.00 / totalPeople) * 100);
        System.out.printf("%.2f%%%n", (everest * 1.00 / totalPeople) * 100);
    }
}
