import java.util.*;

import static java.lang.Math.*;

public class z1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите количество цифр в числе");
        int N = input.nextInt();
        int tz[] = new int[N];
        ArrayList<int[]> C10 = new ArrayList<int[]>();
        int counter = 0;
        System.out.println("ведите число в троичной системе счисления по цифрам");
        for (int i = 0; i < N; i++) {
            tz[i] = input.nextInt();
            while (tz[0] == 0 || tz[i] > 2 || tz[i] < 0) {
                System.out.println("Вы ввели неверное число. Попробуйте еще раз");
                tz[i] = input.nextInt();
            }
        }
        int tmpc10 = 0;
        for (int i = N - 1, j = 0; i >= 0; i--, j++) {
            tmpc10 += (int) (tz[i] * pow(3, j));
        }
        while (tmpc10 > 0) {
            C10.add(new int[1]);
            C10.get(counter)[0] = tmpc10 % 10;
            tmpc10 /= 10;
            counter++;
        }
        int result[] = new int[counter];
        for (int i = counter - 1, j = 0; i >= 0; i--, j++){
            result[j] = C10.get(i)[0];
        }
        System.out.print("ваше число в 3-ой системе счисления\n\t");
        for (int i = 0; i<N;i++){
            System.out.print(tz[i]);
        }
        System.out.print("\nВаше число в 10-ой системе счисления\n\t");
        for (int i = 0; i<N;i++) {
            System.out.print(result[i]);
        }
    }
}
