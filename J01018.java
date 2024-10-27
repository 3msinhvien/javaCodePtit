import java.util.Scanner;

public class J01018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc số lượng bộ test
        int t = scanner.nextInt();
        scanner.nextLine(); // Đọc qua dòng trống sau số bộ test

        for (int i = 0; i < t; i++) {
            String n = scanner.nextLine();
            if (isValidNumber(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }

    // Hàm kiểm tra tính hợp lệ của số N
    private static boolean isValidNumber(String n) {
        // Kiểm tra tổng các chữ số có chia hết cho 10 không
        int digitSum = 0;
        for (char c : n.toCharArray()) {
            digitSum += c - '0';
        }
        if (digitSum % 10 != 0) {
            return false;
        }

        // Kiểm tra các chữ số cạnh nhau có khác nhau đúng 2 đơn vị không
        for (int i = 1; i < n.length(); i++) {
            int currentDigit = n.charAt(i) - '0';
            int previousDigit = n.charAt(i - 1) - '0';
            if (Math.abs(currentDigit - previousDigit) != 2) {
                return false;
            }
        }

        return true;
    }
}
