package T06NestedLoops.Lab;

public class P02MultiplicationTable {
    public static void main(String[] args) {
        // 1. Output printing
        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= 10 ; j++) {
                int result = i * j;
                System.out.printf("%d * %d = %d\n", i, j, result);
            }
        }
    }
}
