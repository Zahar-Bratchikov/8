import java.util.*;
import static java.lang.Math.*;

public class z11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите n");
        int n = input.nextInt(); double ab, bc, cd, ad, ac, bd;
        int [][] coord = new int[2][4 * n]; int [][] answer = new int[4][n];
        getArr(coord);
        PrintOut(coord);
        for (int i = 0, j = 0; j < n * 4; j+=4, i++){
            ab = sqrt(pow(coord[0][j] - coord[0][j + 1], 2) + pow(coord[1][j] - coord[1][j + 1], 2));
            bc = sqrt(pow(coord[0][j + 1] - coord[0][j + 2], 2) + pow(coord[1][j + 1] - coord[1][j + 2], 2));
            cd = sqrt(pow(coord[0][j + 2] - coord[0][j + 3], 2) + pow(coord[1][j + 2] - coord[1][j + 3], 2));
            ad = sqrt(pow(coord[0][j + 3] - coord[0][j], 2) + pow(coord[1][j + 3] - coord[1][j], 2));
            ac = sqrt(pow(coord[0][j] - coord[0][j + 2], 2) + pow(coord[1][j] - coord[1][j + 2], 2));
            bd = sqrt(pow(coord[0][j + 1] - coord[0][j + 3], 2) + pow(coord[1][j + 1] - coord[1][j + 3], 2));
            if ((coord[0][j + 2] - coord[0][j]) / ((coord[0][j + 1] - coord[0][j])) == (coord[1][j + 2] - coord[1][j]) / ((coord[1][j + 1] - coord[1][j]))){
                answer[0][i] = 0;
                answer[1][i] = 0;
                answer[2][i] = 0;
                answer[3][i] = 0;
            }
            else {
                answer[0][i] = 1;
                if (ab == bc & bc == cd & cd == ad & ac == bd){
                    answer[1][i] = 2;
                }
                else if (ab == cd & bc == ad & ac == bd){
                    answer[1][i] = 1;
                }
                else if (ab == bc & bc == cd & cd == ad){
                    answer[1][i] = 3;
                }
                else if ((coord[0][j + 1] - coord[0][j]) / (coord[0][j + 3] - coord[0][j + 2]) == (coord[1][j + 1] - coord[1][j]) / (coord[1][j + 3] - coord[1][j + 2])){
                    answer[1][i] = 4;
                }
                else answer[1][i] = 5;
                answer[2][i] = abs((coord[0][j] - coord[0][j + 1]) * (coord[1][j] + coord[1][j + 1]) +
                        (coord[0][j + 1] - coord[0][j + 2]) * (coord[1][j + 1] + coord[1][j + 2]) +
                        (coord[0][j + 2] - coord[0][j + 3]) * (coord[1][j + 2] + coord[1][j + 3]) +
                        (coord[0][j + 3] - coord[0][j]) * (coord[1][j + 3] + coord[1][j]))/2;
                if (ab == cd & bc == ad) answer[3][i] = 1;
                else answer[3][i] = -1;
            }
        }
        PrintOut(answer);
    }
    public static void getArr(int [][] arr){
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10);
            }
        }
    }
    public static void PrintOut(int[][] arr){
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " | \t");
            }
            System.out.println();
        }
    }
}