import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J01008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc số lượng bộ test
        int testCount = scanner.nextInt();

        // Xử lý từng bộ test
        for (int i = 1; i <= testCount; i++) {
            int n = scanner.nextInt();
            Map<Integer, Integer> primeFactors = getPrimeFactors(n);

            // In kết quả theo định dạng yêu cầu
            System.out.print("Test " + i + ": ");
            boolean isFirst = true;
            for (Map.Entry<Integer, Integer> entry : primeFactors.entrySet()) {
                if (!isFirst) {
                    System.out.print(" ");
                }
                System.out.print(entry.getKey() + "(" + entry.getValue() + ")");
                isFirst = false;
            }
            System.out.println();
        }

        scanner.close();
    }

    // Hàm lấy các thừa số nguyên tố và số lần xuất hiện của chúng
    private static Map<Integer, Integer> getPrimeFactors(int n) {
        Map<Integer, Integer> factors = new HashMap<>();
        int divisor = 2;

        // Thực hiện phân tích thừa số nguyên tố
        while (n > 1) {
            int count = 0;
            while (n % divisor == 0) {
                n /= divisor;
                count++;
            }
            if (count > 0) {
                factors.put(divisor, count);
            }
            divisor++;
        }

        return factors;
    }
}
