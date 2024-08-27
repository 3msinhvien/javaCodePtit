import java.util.Scanner;

public class J02106 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N][3];

        // Đọc ma trận
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        // Duyệt qua từng hàng của ma trận
        for (int i = 0; i < N; i++) {
            int ones = 0; // Đếm số lượng số 1 trong hàng

            // Duyệt qua từng phần tử trong hàng
            for (int j = 0; j < 3; j++) {
                if (A[i][j] == 1) {
                    ones++;
                }
            }

            // Kiểm tra nếu số lượng số 1 nhiều hơn số lượng số 0
            if (ones > 3 - ones) {
                count++;
            }
        }

        System.out.println(count);
    }
}