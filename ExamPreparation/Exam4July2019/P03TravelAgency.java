package ExamPreparation.Exam4July2019;

import java.util.Scanner;

public class P03TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Име на града - текст с възможности ("Bansko", "Borovets", "Varna" или "Burgas")
        //2. Вид на пакета - текст с възможности ("noEquipment", "withEquipment", "noBreakfast" или "withBreakfast")
        // 3. Притежание на VIP отстъпка - текст с възможности "yes" или "no"
        //4. Дни за престой - цяло число в интервала [1 … 10000]

        String name = scanner.nextLine();
        String type = scanner.nextLine();
        String vipOrNot = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        if ((name.equals("Bansko") || name.equals("Borovets")) && vipOrNot.equals("no")) {
            switch (type) {
                case "withEquipment":
                    if (days > 7) {
                        days = days - 1;
                    }
                    sum = days * 100;

                    break;

                case "noEquipment":
                    if (days > 7) {
                        days = days - 1;
                    }
                    sum = days * 80;

                    break;


            }
        }

        if ((name.equals("Bansko") || name.equals("Borovets")) && vipOrNot.equals("yes")) {
            switch (type) {
                case "withEquipment":
                    if (days > 7) {
                        days = days - 1;
                    }
                    sum = 0.90 * (days * 100);

                    break;

                case "noEquipment":
                    if (days > 7) {
                        days = days - 1;
                    }
                    sum = 0.95 * (days * 80);

                    break;


            }
        }
        if ((name.equals("Burgas") || name.equals("Varna")) && vipOrNot.equals("no")) {
            switch (type) {
                case "withBreakfast":
                    if (days > 7) {
                        days = days - 1;
                    }
                    sum = days * 130;

                    break;

                case "noBreakfast":
                    if (days > 7) {
                        days = days - 1;
                    }
                    sum = days * 100;

                    break;


            }
        }

        if ((name.equals("Burgas") || name.equals("Varna")) && vipOrNot.equals("yes")) {
            switch (type) {
                case "withBreakfast":
                    if (days > 7) {
                        days = days - 1;
                    }
                    sum = 0.88 * (days * 130);

                    break;

                case "noBreakfast":
                    if (days > 7) {
                        days = days - 1;
                    }
                    sum = 0.93 * (days * 100);

                    break;


            }
        }
        if ((name.equals("Borovets") || name.equals("Bansko") || name.equals("Varna") || name.equals("Burgas")) &&
                (type.equals("withBreakfast") || type.equals("noBreakfast") || type.equals("withEquipment") ||
                        type.equals("noEquipment")) && days > 0) {
            System.out.printf("The price is %.2flv! Have a nice time!", sum);
        }
        else if (days < 1) {
            System.out.println("Days must be positive number!");
        }
        else {
            System.out.println("Invalid input!");
        }

    }
}
