package T04ForLoop.MoreExercises;

public class P08Clock {
    public static void main(String[] args) {
        // Output printing
        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 59; j++) {
                System.out.printf("%d : %d\n", i, j);
            }
        }
    }
}
