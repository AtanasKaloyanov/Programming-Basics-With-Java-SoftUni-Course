package T01FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        // 1. Reading the input
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        // 2. Computing the area for the green paint

        // 2.1. 2 square walls
        double squareWallsArea = 2 * x * x - 1.2 * 2;

        // 2.2. 2 rectangle walls
        double rectangleWallsArea = 2 * x * y - 2 * 1.5 * 1.5;

        // 2.3. green paint area
        double greenPaintArea = squareWallsArea + rectangleWallsArea;

        // 3. Red paint area

        // 3.1. Rectangle are
        double rectAngleRoofArea = 2 * x * y;

        // 3.2. Triangle area
        double triangleRoofArea = 2 * ((x * h) / 2);

        // 3.3. Red paint area
        double redPaintArea = rectAngleRoofArea + triangleRoofArea;

        // 4. Finding liter
        double greenPaintliters = greenPaintArea / 3.4;
        double redPaintLiters = redPaintArea / 4.3;

        // 5. Result printing
        System.out.printf("%.2f\n", greenPaintliters);
        System.out.printf("%.2f", redPaintLiters );
    }
}

// walls -> green paint
// roof -> red paint

// 1 liter green paint -> for 3.4. m2
// 1 liter red paint -> for 4.3. m2

// walls:

// 4 walls -> 2 front square walls with x size. The first wall has a door with sizes - 1.2m x 2m
//         -> 2 side rectangle walls with sizes x and y. They both have one square
// window with size 1.5m.

// roof:

// 2 recangles with sizes x and y
// 2 triangles - with x and a height - h