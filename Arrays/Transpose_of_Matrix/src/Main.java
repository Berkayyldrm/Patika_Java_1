import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Matrix : " + Arrays.deepToString(a));

        int[][] b = new int[a[1].length][a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j];
            }
        }
        System.out.println("Transpose : " + Arrays.deepToString(b));
    }
}