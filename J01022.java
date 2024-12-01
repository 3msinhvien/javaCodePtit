import java.util.Scanner;

public class J01022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            long K = scanner.nextLong();
            System.out.println(findKthCharacter(N, K));
        }
    }

    private static char findKthCharacter(int N, long K) {
        if (N == 1) return '0';
        if (N == 2) return '1';

        // Tính độ dài của chuỗi X[N-2]
        long lengthN_2 = fibonacciLength(N - 2);

        // Kiểm tra vị trí của K trong X[N]
        if (K <= lengthN_2) {
            return findKthCharacter(N - 2, K);
        } else {
            return findKthCharacter(N - 1, K - lengthN_2);
        }
    }

    // Hàm tính độ dài chuỗi X[n] bằng quy luật Fibonacci
    private static long fibonacciLength(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;

        long a = 1, b = 1, c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
