package T06NestedLoops.Lab;

import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която извежда на конзолата номерата на стаите в една сграда (в низходящ ред), като са изпълнени следните
        // условия:

        //•	На всеки нечетен етаж има само апартаменти
        //•	На всеки четен етаж има само офиси
        //•	Всеки апартамент се означава по следния начин : А{номер на етажа}{номер на апартамента},
        // номерата на апартаментите започват от 0.
        //•	Всеки офис се означава по следния начин : О{номер на етажа}{номер на офиса}, номерата на офисите също започват от 0.
        //•	На последният етаж винаги има апартаменти и те са по-големи от останалите, за това пред номера им пише 'L',
        // вместо 'А'. Ако има само един етаж, то има само големи апартаменти!
        //От конзолата се прочитат две цели числа - броят на етажите и броят на стаите за един етаж.

        int stage = Integer.parseInt(scanner.nextLine());
        int room = Integer.parseInt(scanner.nextLine());

        for (int s = stage; s >  0; s--) {
            for (int r = 0; r <  room; r++) {

                String letter = "";

                 if (s == stage )  {
                    letter = "L";
                }
                else if  (s % 2 == 0) {
                    letter = "O";
                } else {
                    letter = "A";
                }
                System.out.printf("%s%d%d ",letter, s, r);

            }
            System.out.println();
        }

    }
}
