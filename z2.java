import java.util.*;

public class z2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int N = input.nextInt();
        int mass[] = new int[N];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < N; i++) {
            mass[i] = input.nextInt();
        }
        Arrays.sort(mass);
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1; j++) {
                if ((mass[j] > 0) & (mass[j] < mass[j + 1])) {
                    int h = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = h;
                }
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
