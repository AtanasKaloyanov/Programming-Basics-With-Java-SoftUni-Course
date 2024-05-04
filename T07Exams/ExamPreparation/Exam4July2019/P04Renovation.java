package T07Exams.ExamPreparation.Exam4July2019;

import java.util.Scanner;

public class P04Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат следните редове:
        //1. Височина на стената - цяло число [0… 100]
        //2. Ширина на стената - цяло число [0… 100]
        //3. Процент от общата площ на стените, който няма да бъде боядисан - цяло число [5… 95]
        // На следващите редове до получаване на командата "Tired!" или докато не бъдат боядисани всички стени, се чете по едно число:
        //• Литри боя – цяло число [0…100]:
        //Забележка: Площта за боядисване да бъде закръглена нагоре до най-близкото цяло число.

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percentage = Integer.parseInt(scanner.nextLine());

        double area = Math.floor(height * width * 4 - percentage * 1.00 / 100 * height * width * 4);
        double sumLitres = 0;


        String input = scanner.nextLine();

        while (!input.equals("Tired!")) {

            int litre = Integer.parseInt(input);
            sumLitres = litre + sumLitres;

            if (sumLitres >= area) {
                break;
            }


            input = scanner.nextLine();
        }
        if (input.equals("Tired!")) {
            double leftedMeters = area - sumLitres;
            System.out.printf("%.0f quadratic m left.", leftedMeters);
        }
        if (sumLitres > area) {
           double litresLefted = sumLitres - area;
            System.out.printf("All walls are painted and you have %.0f l paint left!", litresLefted);
        }
        if (sumLitres == area) {
            System.out.println("All walls are painted! Great job, Pesho!");
        }
    }
}
