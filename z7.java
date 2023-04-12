import java.util.*;

public class z7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите порядок матрицы");
        int m = in.nextInt();
        Integer[][] matrix = new Integer[m][m];
        int n = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = 0;
            }
        }
        for (int k = 0; k < m / 2; k++) {
            for (int i = k, j = k; i < m - 1 - k; i++, n++) {
                matrix[j][i] = n;
            }
            for (int i = m - 1 - k, j = k; j < m - k; j++, n++) {
                matrix[j][i] = n;
            }
            for (int i = k + 1, j = k; i < m - 1 - k; i++, n++) {
                matrix[i][j] = n;
            }
            for (int i = m - 1 - k, j = k; j < m - k - 1; j++, n++) {
                matrix[i][j] = n;
            }
        }
        if (m % 2 != 0) {
            matrix[m / 2][m / 2] = n;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(String.format("%3.0f", (double) matrix[i][j]) + " ");
            }
            System.out.println("");
        }
    }
}