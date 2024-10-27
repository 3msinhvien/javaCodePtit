import java.util.Scanner;

public class J01016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc giá trị N từ đầu vào
        String n = scanner.nextLine();

        int count = 0;

        // Duyệt qua từng ký tự của số N
        for (char c : n.toCharArray()) {
            if (c == '4' || c == '7') {
                count++;
            }
        }

        // Kiểm tra nếu tổng số chữ số 4 và 7 là 4 hoặc 7
        if (count == 4 || count == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
