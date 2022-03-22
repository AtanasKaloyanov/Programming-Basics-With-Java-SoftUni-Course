package ExamPreparation.Exam7March2019;

import java.util.Scanner;

public class P06HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Българският лекоатлет Тихомир Иванов започва тренировки за предстоящото европейско първенство по лека атлетика на закрито
        // в Глазгоу, Шотландия.
        //Вашата задача е да напишете софтуер,
        // с който Иванов да следи своя прогрес и дали е достигнал желаните резултати.
        // В началото програмата получава желаната височина на летвата от Тихомир,
        // той започва тренировката си като поставя летвата на височина 30см по-ниско от целта.
        // За всяка височина той има право на 3 скока, като за да бъде един скок успешен,
        // той трябва да бъде над височината на летвата. При успешен скок (над летвата),
        // височината й се вдига с 5 сантиметра. При три неуспешни скока на една и съща височина,
        // тренировката приключва с неуспех. При достигане на желаната височина и нейното успешно прескачане,
        // тренировката приключва с успех.
        //Вход
        //Входът е поредица от цели числа в интервала [100…300]:
        //• На първия ред се прочита желаната от Тихомир Иванов височина в сантиметри
        //• На всеки следващ ред до приключване на програмата се прочита височината от скока на Иванов
        //Изход
        //На конзолата трябва да се отпечата един ред:
        //• Ако Тихомир не успее да преодолее желаната височина:
        //o "Tihomir failed at {височина на летвата към момента на провала}cm after {брой скокове от началото на тренировката} jumps."
        //• Ако Тихомир успее да преодолее височината:
        //o "Tihomir succeeded, he jumped over {височина на прескочената последно летва}cm after {брой скокове за цялата тренировка} jumps."


        int wishedHeight = Integer.parseInt(scanner.nextLine());
        int trainedHeight = wishedHeight - 30;

        boolean isFailed = false;
        int jumpCounter = 0;

        while (trainedHeight <= wishedHeight) {

            for (int i = 1; i <= 3; i++) {

                int jump = Integer.parseInt(scanner.nextLine());
                jumpCounter++;
                if (jump > trainedHeight) {

                    break;
                }
                if (i == 3) {
                    isFailed = true;
                    break;

                }

            }

            if (isFailed) {
                break;
            }

            trainedHeight = trainedHeight + 5;

        }

        if (isFailed) {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", trainedHeight, jumpCounter );
        } else {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", wishedHeight, jumpCounter);
        }

    }
}

