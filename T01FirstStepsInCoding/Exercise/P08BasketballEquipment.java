package T01FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        //Баскетболни кецове =  Цена на тренировка - 0.4 * Цена за тренировка = 219
        //Баскетболен екип = Цена на кецовете - 0.2 * Цена на кецовете = 175.2
        //Баскетболна топка = Баскетболен екип * 0.25
        //Баскетболни аксесоари = Баскетболна топка * 0.2
        //Всички разходи = Цена на тренировка + Баскетболни кецове + Баскетболен екип + Баскетболна топка + Баскетболни аксесоари

        int training = Integer.parseInt(scanner.nextLine());
        double shoes = training - 0.4 * training;
        double jersey = shoes - 0.2 * shoes;
        double ball = jersey * 0.25;
        double accessories = ball * 0.2;
        double totalCosts = training + shoes + jersey + ball + accessories;
        System.out.println(totalCosts);
    }
}
