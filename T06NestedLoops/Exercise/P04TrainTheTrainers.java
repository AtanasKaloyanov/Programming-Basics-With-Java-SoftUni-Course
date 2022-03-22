package T06NestedLoops.Exercise;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Курсът "Train the trainers" е към края си и финалното оценяване наближава. Вашата задача е
// да помогнете на журито което ще оценява презентациите, като напишете програма в която да изчислява средната оценка от представянето
// на всяка една презентация от даден студент, а накрая средният успех от всички тях.
//От конзолата на първият ред се прочита броят на хората в журито n - цяло число в интервала [1…20]
//След това на отделен ред се прочита името на презентацията - текст
//За всяка една презентация на нов ред се четат n - на брой оценки - реално число в интервала [2.00…6.00]
//След изчисляване на средната оценка за конкретна презентация, на конзолата се печата
// "{името на презентацията} - {средна оценка}."
//След получаване на команда "Finish" на конзолата се печата "Student's final assessment is {среден успех от всички презентации}."
// и програмата приключва.
//Всички оценки трябва да бъдат форматирани до втория знак след десетичната запетая.


        int numberPeople = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double sumAvarageGrades = 0;
        int taskCounter = 0;

        while (!input.equals("Finish")) {
            String task = input;
             taskCounter++;

            double sumGrade = 0;
            for (int i = 1; i <= numberPeople; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sumGrade = grade + sumGrade;

            }
            double avarageGrade = sumGrade / numberPeople;
            sumAvarageGrades = avarageGrade + sumAvarageGrades;

            System.out.printf("%s - %.2f.%n", input, avarageGrade);

            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", sumAvarageGrades / taskCounter) ;
    }
}
