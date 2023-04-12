import java.util.*;

public class z3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите количество точек");
        int N = input.nextInt();
        int coord[] = new int[2 * N];
        for (int i = 0; i < 2 * N; i++) {
            if (i % 2 == 0) {
                System.out.println("введите x-координату точки " + ((i / 2) + 1));
                coord[i] = input.nextInt();
            } else {
                System.out.println("введите y-координату точки " + ((i / 2) + 1));
                coord[i] = input.nextInt();
            }
        }
        for (int i = 0; i < (2 * N - 4); i += 2) {
            for (int j = i + 2; j < (2 * N - 3); j += 2) {
                for (int k = j + 2; k < (2 * N - 2); k += 2) {
                    for (int l = k + 2; l < (2 * N - 1); l += 2) {
                        if (((coord[i] == coord[j]) & (coord[k] == coord[l]) & (coord[i + 1] == coord[l + 1]) & (coord[j + 1] == coord[k + 1])) ||
                                ((coord[i] == coord[l]) & (coord[k] == coord[l]) & (coord[i + 1] == coord[j + 1]) & (coord[l + 1] == coord[k + 1])) ||
                                ((coord[i] == coord[l]) & (coord[k] == coord[j]) & (coord[i + 1] == coord[k + 1]) & (coord[j + 1] == coord[l + 1]))){
                            System.out.println("Точки с координатами " + "(" + coord[i] + ";" + coord[i + 1] + "), (" + coord[j] + ";" + coord[j + 1] + "), ("
                                    + coord[k] + ";" + coord[k + 1] + "), (" + coord[l] + ";" + coord[l + 1] + ") являются вершинами прямоугольника");
                        }
                    }
                }
            }
        }
    }
}
