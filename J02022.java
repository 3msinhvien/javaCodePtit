import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc số lượng bộ test
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            List<String> results = new ArrayList<>();

            // Sinh tất cả các hoán vị của các số từ 1 đến N
            permute("", "123456789".substring(0, n), results);

            // Lọc các hoán vị để lấy các số thỏa mãn điều kiện
            for (String s : results) {
                if (isValid(s)) {
                    System.out.println(s);
                }
            }

            // In một dòng trống giữa các bộ test
            if (i < t - 1) {
                System.out.println();
            }
        }

        scanner.close();
    }

    // Hàm để sinh tất cả các hoán vị của một chuỗi
    private static void permute(String prefix, String str, List<String> results) {
        int n = str.length();
        if (n == 0) {
            results.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permute(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), results);
            }
        }
    }

    // Hàm kiểm tra tính hợp lệ của một hoán vị
    private static boolean isValid(String s) {
        for (int i = 1; i < s.length(); i++) {
            int diff = Math.abs(s.charAt(i) - s.charAt(i - 1));
            if (diff == 1) {
                return false;
            }
        }
        return true;
    }
}
