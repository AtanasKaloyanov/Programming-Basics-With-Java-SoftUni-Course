package T05WhileLoop.Exercise;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Напишете програма, в която Марин решава задачи от изпити, докато не получи съобщение "Enough" от лектора си.
//При всяка решена задача, той получава оценка.
// Програмата трябва да приключи прочитането на данни при команда "Enough" или ако Марин получи определеният брой незадоволителни оценки.
//Незадоволителна е всяка оценка, която е по-малка или равна на 4.
//Вход
//•	На първи ред - брой незадоволителни оценки - цяло число в интервала [1…5]
//•	След това многократно се четат по два реда:
//o	Име на задача - текст
//o	Оценка - цяло число в интервала [2…6]
//Изход
//•	Ако Марин стигне до командата "Enough", отпечатайте на 3 реда:
//o	"Average score: {средна оценка}"
//o	"Number of problems: {броя на всички задачи}"
//o	"Last problem: {името на последната задача}"
//•	Ако получи определения брой незадоволителни оценки:
//o	"You need a break, {брой незадоволителни оценки} poor grades."
//Средната оценка да бъде форматирана до втория знак след десетичната запетая

        int excludedGrades = Integer.parseInt(scanner.nextLine());

        int excludedGradesCounter = 0;
        int gradesCounter = 0;
        double sum = 0;
        String lastProblem = "";
        boolean isFailed = true;
        while (excludedGradesCounter < excludedGrades) {
            String task = scanner.nextLine();
            if (task.equals("Enough")) {
                isFailed = false;
                break;
            }

            int grade = Integer.parseInt(scanner.nextLine());


            gradesCounter++;

            if (grade <= 4.00) {
                excludedGradesCounter++;

            }
            sum = grade + sum;
            lastProblem = task;

        }
        if (excludedGradesCounter >= excludedGrades) {
            System.out.printf("You need a break, %d poor grades.", excludedGradesCounter);
        } else {
            System.out.printf("Average score: %.2f%n", sum / gradesCounter);
            System.out.printf("Number of problems: %d%n", gradesCounter);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
