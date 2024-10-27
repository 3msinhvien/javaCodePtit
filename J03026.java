import java.util.Scanner;

public class J03026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc số lượng bộ test
        int t = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng trống sau số lượng bộ test

        for (int i = 0; i < t; i++) {
            // Đọc hai xâu A và B
            String a = scanner.nextLine().trim();
            String b = scanner.nextLine().trim();

            // Kiểm tra nếu A và B giống nhau
            if (a.equals(b)) {
                System.out.println(-1);
            } else {
                // Nếu A và B khác nhau, độ dài xâu lớn nhất là độ dài của xâu dài hơn
                System.out.println(Math.max(a.length(), b.length()));
            }
        }

        scanner.close();
    }
}
