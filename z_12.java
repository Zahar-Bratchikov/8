import java.util.*;

import static java.lang.Math.*;


public class z_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность СЛАУ");
        int N = input.nextInt();
        int A[][] = new int[N][N];
        int F[] = new int[N];
        int X[] = new int[N];
        System.out.println("Введите коэффициенты СЛАУ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("Введите столбец решений F");
        for (int i = 0; i < N; i++) {
            F[i] = input.nextInt();
        }
        System.out.println("Введите столбец полученных решений X");
        for (int i = 0; i < N; i++) {
            X[i] = input.nextInt();
        }
        int answer[] = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = 0;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                answer[i] += A[i][j] * X[j];
            }
        }
        if (Arrays.equals(answer, F)) {
            System.out.println("СЛАУ решена верно");
        } else System.out.println("СЛАУ решена с ошибкой");
    }
}
