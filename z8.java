import java.util.*;

public class z8 {
    public static void vivod(Integer[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(String.format("%3.0f", (double) matrix[i][j]) + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void nuli(Integer[][] matrix) {
        int n = matrix.length;
        int p = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public static void block(Integer[][] matrix, int ni, int nj) {
        int n = matrix.length / 2;
        int p = 1;
        for (int k = 0; k < n / 2; k++) {
            for (int i = k + ni, j = k + nj; i < n - 1 - k + ni; i++, p++) {
                matrix[j][i] = p;
            }
            for (int i = n - 1 - k + ni, j = k + nj; j < n - k + nj; j++, p++) {
                matrix[j][i] = p;
            }
            if (n%2!=0) {
                matrix[n / 2 + nj][n / 2 + ni] = p;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите порядок матрицы");
        int n = in.nextInt();
        Integer[][] matrix = new Integer[2 * n][2 * n];
        nuli(matrix);
        block(matrix, 0, 0);
        block(matrix, 0, n);
        block(matrix, n, n);
        block(matrix, n, 0);
        vivod(matrix);
    }
}