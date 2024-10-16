package TH2.DanhSachCanh;


import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        ArrayList<Pair> edge = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (matrix[i][j] == 1) {
                    Pair p = new Pair(i, j);
                    edge.add(p);
                    matrix[j][i] = 0;
                }
            }
        }

        for (Pair p : edge) {
            System.out.println(p);
        }
    }

}
