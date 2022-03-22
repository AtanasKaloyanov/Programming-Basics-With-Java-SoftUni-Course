package ExamPreparation.Exam6June2019;

import java.util.Scanner;

public class P02MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       //Вие сте режисьор на филма "Програмирането е забавно",
        // като имате определено време за снимки. От вас се иска да напишете програма,
        // с която ще разберете дали снимачният ден ще ви стигне да заснемете филма.
        // Снимачният ден започва с подготовка на терен, което е 15 процента от времето за снимки! Филмът има определен брой сцени,
        // които се заснемат за определено време.
        //Вход
        //От конзолата се четат 3 реда:
        //1. Време за снимки – цяло число в диапазона [0… 1440]
        //2. Брой сцени – цяло число в диапазона [5… 25]
        //3. Времетраене на сцена – цяло число в диапазона [20… 90]
        //Изход
        //На конзолата да се отпечата един ред:
        //• Ако времето за заснемане на филма ви стигне:
        //"You managed to finish the movie on time! You have {останало време} minutes left!"
        //• Ако времето НЕ ВИ стигне:
        //"Time is up! To complete the movie you need {нужно време} minutes."
        //Останалото време да се закръгли до най-близкото цяло число.


        int timeFilming = Integer.parseInt(scanner.nextLine());
        int numberScenes = Integer.parseInt(scanner.nextLine());
        int timeOneScene = Integer.parseInt(scanner.nextLine());

        double sum = numberScenes * timeOneScene + 0.15 * timeFilming;


        if (timeFilming >= sum) {
            double leftedMinutes = timeFilming - sum;
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", leftedMinutes);
        } else {
           double neededMinutes = sum - timeFilming;
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", neededMinutes);
        }


    }
}
