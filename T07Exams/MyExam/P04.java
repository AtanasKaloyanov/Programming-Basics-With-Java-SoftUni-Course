package T07Exams.MyExam;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Напишете програма, която да пресмята статистика за оценки от изпит.
// В началото програмата получава броя на студентите явили се на изпита и за всеки студент неговата оценка.
// На края програмата трябва да отпечата процента студенти с оценка между 2.00 и 2.99, между 3.00 и 3.99, между 4.00 и 4.99, 5.00
// или повече. Също така и средния успех на изпита.
//Вход:
//От конзолата се четат:
// На първия ред – броя на студентите явили се на изпит – цяло число в интервала [1...1000]
// За всеки един студент на отделен ред – оценката от изпита – реално число в интервала [2.00...6.00]
//Изход:
//Да се отпечатат на конзолата 5 реда, които съдържат следната информация:
//Ред 1 - "Top students: {процент студенти с успех 5.00 или повече}%"
//Ред 2 - "Between 4.00 and 4.99: {между 4.00 и 4.99 включително}%"
//Ред 3 - "Between 3.00 and 3.99: {между 3.00 и 3.99 включително}%"
//Ред 4 - "Fail: {по-малко от 3.00}%"
//Ред 5 - "Average: {среден успех}"
//Всички числа трябва да са форматирани до втория знак след десетичната запетая.

        int numberStudents = Integer.parseInt(scanner.nextLine());
        double totalGrades = 0;

        int allGradesCounter = 0;
        int gradeCounter5 = 0;
        int gradeCounter4 = 0;
        int gradeCounter3 = 0;
        int gradeCounter2 = 0;



        for (int i = 1; i <= numberStudents ; i++) {

            double grade = Double.parseDouble(scanner.nextLine());
            allGradesCounter++;

            if (grade >= 5.00) {
                gradeCounter5++;
            } else if (grade >= 4.00) {
                gradeCounter4++;
            } else if (grade >= 3.00) {
                gradeCounter3++;
            } else if (grade >= 2.00) {
                gradeCounter2++;
            }

totalGrades = grade + totalGrades;
        }

        System.out.printf("Top students: %.2f%%%n", gradeCounter5 * 1.00 / allGradesCounter * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", gradeCounter4 * 1.00 / allGradesCounter * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", gradeCounter3 * 1.00 / allGradesCounter * 100);
        System.out.printf("Fail: %.2f%%%n", gradeCounter2 * 1.00 / allGradesCounter * 100);
        System.out.printf("Average: %.2f", totalGrades / allGradesCounter );
    }
}
