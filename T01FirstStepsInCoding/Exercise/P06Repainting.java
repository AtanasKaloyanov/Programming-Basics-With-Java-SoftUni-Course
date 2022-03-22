package T01FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //количество найлон2 = количество найлон + 2
        //количество боя2 = 1.1 * количество боя
        //Разходи за материали = количество найлон2 * 1.50 + количество боя2 * 14.50 + количество разредител за боя * 5.00
        // + 0.40
        //Разходи за боядисване за 1 час = 0.3 * разходи за материали
        //Разходи за боядисване = Разходи за боядисване за 1 час * часовете
        //Общо разходи = разходи за боядисване + разходи за материали

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        int nylon2 = nylon + 2;
        double paint2 = 1.1 * paint;
        double costsForMaterials = nylon2 * 1.50 + paint2 * 14.50 + thinner * 5 + 0.4;
        double costsForPaintingFor1Hour = costsForMaterials * 0.3;
        double totalCostsForPainting = costsForPaintingFor1Hour * hours;
        double totalCosts = totalCostsForPainting + costsForMaterials;
        System.out.println(totalCosts);
    }
}
