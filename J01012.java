import java.util.Scanner;

public class J01012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc số lượng bộ test
        int testCount = scanner.nextInt();

        for (int i = 0; i < testCount; i++) {
            long n = scanner.nextLong();
            System.out.println(countEvenDivisors(n));
        }

        scanner.close();
    }

    // Hàm đếm số ước của N chia hết cho 2
    private static int countEvenDivisors(long n) {
        int count = 0;

        // Duyệt từ 1 đến căn bậc 2 của N để tìm các ước
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                // Nếu i là ước và nó là số chẵn
                if (i % 2 == 0) {
                    count++;
                }

                // Kiểm tra ước còn lại (n / i)
                long otherDivisor = n / i;
                if (otherDivisor != i && otherDivisor % 2 == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
