package T04ForLoop.Exercise;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Поканени сте от академията да напишете софтуер, който да пресмята точките за актьор/актриса.
//        Академията ще ви даде първоначални точки за актьора. След това всеки оценяващ ще дава своята оценка.
//        Точките, които актьора получава се формират от: дължината на името на оценяващия умножено по точките, които дава делено на две.
//        Ако резултатът в някой момент надхвърли 1250.5 програмата трябва да прекъсне и да се отпечата,
//        че дадения актьор е получил номинация.
//                Вход
//•	Име на актьора - текст
//•	Точки от академията - реално число в интервала [2.0... 450.5]
//•	Брой оценяващи n - цяло число в интервала[1… 20]
//        На следващите n-на брой реда:
//        	Име на оценяващия - текст
//        	Точки от оценяващия - реално число в интервала [1.0... 50.0]
//        Изход
//        Да се отпечата на конзолата един ред:
//	Ако точките са над 1250.5:
//        "Congratulations, {име на актьора} got a nominee for leading role with {точки}!"
//	Ако точките не са достатъчни:
//        "Sorry, {име на актьора} you need {нужни точки} more!"
//        Резултатът да се форматирана до първата цифра след десетичния знак!

        String nameOfActor = scanner.nextLine();
        double pointsOfAcademy = Double.parseDouble(scanner.nextLine());
        int numberEvaluaters = Integer.parseInt(scanner.nextLine());

        double points = 0.00;

        for (int i = 1; i <= numberEvaluaters; i++) {

            String nameOfEvaluater = scanner.nextLine();
            double pointsOfEvaluater = Double.parseDouble(scanner.nextLine());

            points =  nameOfEvaluater.length() * pointsOfEvaluater / 2;
            pointsOfAcademy = pointsOfAcademy  + points;



if (pointsOfAcademy > 1250.50) {
    break;
}
        }
       if (pointsOfAcademy > 1250.50) {
           System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameOfActor, pointsOfAcademy);

       }else {
           double neededMoney = 1250.50 - pointsOfAcademy;
           System.out.printf("Sorry, %s you need %.1f more!", nameOfActor, neededMoney);
       }

    }
}
