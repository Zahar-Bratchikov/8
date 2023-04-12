import java.util.Scanner;
import java.util.Arrays;
public class z4 {
    public static int a = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int N = scanner.nextInt();
        int l = 0;
        int quicksort[];
        int puzir[];
        quicksort = new int[N];
        puzir = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Введите элемент массива");
            int a = scanner.nextInt();
            quicksort[i] = a;
            puzir[i] = a;
        }
        int left = 0;
        int right = N-1;
        quick_sort(left,right,quicksort);
        System.out.println();
        System.out.println("Количество итераций при методе быстрой сортировки: " + a);
        System.out.println("Преобразование массива методом быстрой сортировки:");
        System.out.println(Arrays.toString(quicksort));
        System.out.println();
        System.out.println();
        puzirec(puzir, N);
        System.out.println("Преобразование массива методом пузырек:");
        System.out.println(Arrays.toString(puzir));
    }

    public static void puzirec (int el[], int N) {
        int c = 0;
        for (int i = 1; i<N; i++){
            for (int j = 1; j<N; j++){
                if (el[j] < el[j-1]) {
                    int el2 = el[j];
                    el[j] = el[j-1];
                    el[j-1] = el2;
                    c = c +1;
                    System.out.println(Arrays.toString(el));
                }
            }
        }
        System.out.println();
        System.out.println("Количество итераций при сортировке пузырьком: " + c);
    }

    public static void quick_sort(int left, int right, int quick[]) {
        if (left >= right)
            return;

        int middle = left + (right - left)/2;
        int pivot = quick[middle];
        int i = left;
        int j = right;
        while (i <= j) {
            while (quick[i] < pivot) {
                i = i + 1;
            }
            while (quick[j] > pivot) {
                j = j - 1;
            }
            if (i <= j) {
                int el2 = quick[i];
                quick[i] = quick[j];
                quick[j] = el2;
                i = i + 1;
                j = j - 1;

            }
            if (left < j) {
                a=a+1;
                System.out.println(Arrays.toString(quick));
                quick_sort(left,j,quick);
            }
            if (right > i) {
                a=a+1;
                System.out.println(Arrays.toString(quick));
                quick_sort(i,right,quick);
            }
        }
    }
}
