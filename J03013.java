import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Đọc số lượng bộ test
            int t = Integer.parseInt(scanner.nextLine().trim());

            for (int i = 0; i < t; i++) {
                // Đọc hai số X và Y dưới dạng chuỗi
                String x = scanner.nextLine().trim();
                String y = scanner.nextLine().trim();

                // Sử dụng BigInteger để xử lý các số rất lớn
                BigInteger bigX = new BigInteger(x);
                BigInteger bigY = new BigInteger(y);

                // Tính hiệu tuyệt đối |X - Y|
                BigInteger result = bigX.subtract(bigY).abs();

                // In ra kết quả
                System.out.println(result);
            }
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format. Please ensure all inputs are correct.");
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
