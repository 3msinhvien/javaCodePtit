import java.util.Scanner;

public class J01014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc số lượng bộ test
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            System.out.println(findLargestPrimeFactor(n));
        }

        scanner.close();
    }

    // Hàm tìm ước số nguyên tố lớn nhất của N
    private static long findLargestPrimeFactor(long n) {
        long largestPrime = -1;

        // Loại bỏ tất cả các ước số 2
        while (n % 2 == 0) {
            largestPrime = 2;
            n /= 2;
        }

        // Kiểm tra các số lẻ từ 3 trở đi
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                largestPrime = i;
                n /= i;
            }
        }

        // Nếu n là một số nguyên tố lớn hơn 2
        if (n > 2) {
            largestPrime = n;
        }

        return largestPrime;
    }
}
