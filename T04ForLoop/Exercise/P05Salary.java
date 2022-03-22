package T04ForLoop.Exercise;

import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Шеф на компания забелязва че все повече служители прекарват  време в сайтове, които ги разсейват.
//        За да предотврати това, той въвежда изненадващи проверки на отворените табове на браузъра на служителите си.
//                Според отворения сайт в таба се налагат следните глоби:
//	"Facebook" -> 150 лв.
//	"Instagram" -> 100 лв.
//	"Reddit" -> 50 лв.
//                От конзолата се четат два реда:
//	Брой отворени табове в браузъра n - цяло число в интервала [1...10]
//	Заплата - число в интервала [500...1500]
//        След това n – на брой пъти се чете име на уебсайт – текст
//                Изход
//	Ако по време на проверката заплатата стане по-малка или равна на 0 лева, на конзолата се изписва
//        "You have lost your salary." и програмата приключва.
//        	В противен случай след проверката на конзолата се изписва остатъкът от заплатата (да се изпише като цяло число).

        int n = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());





        for (int i = 1 ; i <= n ; i++) {
String site = scanner.nextLine();
            if (site.equals("Facebook"))
            {
               salary = salary - 150;

            }if (site.equals("Instagram")) {
                salary = salary - 100;

            }if (site.equals("Reddit")) {
                salary =salary - 50;

            }
            if  (salary  <= 0) {
                      break;
            }
        }



        if (salary  <= 0) {
            System.out.println("You have lost your salary.");
        } else {

            System.out.printf("%.0f", salary);;
        }
    }
}
