package T04ForLoop.Exercise;

import java.util.Scanner;

public class P03Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Дадени са n цели числа в интервала [1…1000]. От тях някакъв процент p1 са под 200, друг процент p2 са от 200 до 399,
//            друг процент p3 са от 400 до 599, друг процент p4 са от 600 до 799 и останалите p5 процента са от 800 нагоре.
//            Да се напише програма, която изчислява и отпечатва процентите p1, p2, p3, p4 и p5.


        int n = Integer.parseInt(scanner.nextLine());


        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 1; i <= n; i++) {

            int a = Integer.parseInt(scanner.nextLine());


            if (a >= 1 && a < 200) {
                p1++;


            }
            if (a >= 200 && a < 400) {
                p2++;

            }
            if (a >= 400 && a < 600) {
                p3++;

            }
            if (a >= 600 && a < 800) {
                p4++;

            }
            if (a >= 800) {
                p5++;

            }
        }

        System.out.printf("%.2f%%%n", p1  / n * 100  );
        System.out.printf("%.2f%%%n", p2  / n * 100  );
        System.out.printf("%.2f%%%n", p3  / n * 100  );
        System.out.printf("%.2f%%%n", p4  / n * 100  );
        System.out.printf("%.2f%%%n", p5  / n * 100  );

    }

}


