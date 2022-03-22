package T06NestedLoops.Exercise;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int number = 1;
        boolean isBigger = false;

        for (int rows = 1; rows <= n ; rows++) {
            for (int print = 1; print <= rows; print++) {

                System.out.print(number + " ");
                number++;
                if ( number > n) {
                    isBigger = true;
                    break;
                }

            }

            System.out.println();
            if (isBigger) {
                break;
            }


        }

    }
}

// 10
//  редове:  от 1 до n (10)   -    1 2 3 4 5 6 7 8 9 10
// брой печатания: от 1 до горното число: за горно число 1  -1; за горно число 2 -  1,2; за  горно число 3 -  1,2,3 ;
//за горно число 4 - 1,2,3,4, за горно число 5  - 1,2,3,4,5 и т.н.
// за итерацията на външния цикъл имаме само принтиране