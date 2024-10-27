import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc số lượng bộ test
        int t = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng trống sau số lượng bộ test

        for (int i = 0; i < t; i++) {
            // Đọc hai số X và Y dưới dạng chuỗi
            String x = scanner.nextLine().trim();
            String y = scanner.nextLine().trim();

            // Sử dụng BigInteger để xử lý các số rất lớn
            BigInteger bigX = new BigInteger(x);
            BigInteger bigY = new BigInteger(y);

            // Tính LCM bằng công thức: LCM(a, b) = (a * b) / GCD(a, b)
            BigInteger gcd = bigX.gcd(bigY);
            BigInteger lcm = (bigX.multiply(bigY)).divide(gcd);

            // In ra kết quả
            System.out.println(lcm.toString());
        }

        scanner.close();
    }
}
