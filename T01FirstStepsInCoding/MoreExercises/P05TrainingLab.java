package T01FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {
        // 1. Reading the input
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        // 2. Converting the input from meters in centimeters and finding the area
        // of the room. Then finding the width without the corridor
        length = length * 100;
        width = width * 100 - 100;

       // 3. Finding the quantity of the workplaces by width and by length
        int workPlacesByLength = (int) length / 120;
        int workPlacesByWidth = (int) width / 70;

        // 4. Finding all places by multiplication of the places by width
        // and places by length. And then subtraction of 3
        int workPlaces = workPlacesByWidth * workPlacesByLength - 3;

        // 5. Result printing
        System.out.println(workPlaces);
    }
}

// rectangle form - w * h
// left side - rows
// right side - rows

// back side -  1 work place
// front side - 2 work place

// one work place - 70 cm * 120 cm
// the corridor is with 100 cm width



