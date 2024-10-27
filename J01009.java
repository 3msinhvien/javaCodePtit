import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc giá trị n từ đầu vào
        int n = scanner.nextInt();
        long sum = 0;

        // Tính tổng S = 1 + 1*2 + 1*2*3 + ... + 1*2*3*...*n
        for (int i = 1; i <= n; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            sum += factorial;
        }

        // In ra kết quả
        System.out.println(sum);

        scanner.close();
    }
}
