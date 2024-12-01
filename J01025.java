import java.util.Scanner;

public class J01025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tọa độ của hình chữ nhật thứ nhất
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        // Nhập tọa độ của hình chữ nhật thứ hai
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();

        // Tìm tọa độ bao phủ hình vuông
        int minX = Math.min(x1, x3);
        int maxX = Math.max(x2, x4);
        int minY = Math.min(y1, y3);
        int maxY = Math.max(y2, y4);

        // Tính chiều dài cạnh của hình vuông
        int sideLength = Math.max(maxX - minX, maxY - minY);

        // Tính diện tích hình vuông
        int area = sideLength * sideLength;

        System.out.println(area);

        scanner.close();
    }
}
