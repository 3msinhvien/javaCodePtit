import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc số lượng phần tử N
        int n = scanner.nextInt();
        List<Integer> sequence = new ArrayList<>();

        // Đọc dãy số
        for (int i = 0; i < n; i++) {
            sequence.add(scanner.nextInt());
        }

        // Tìm số lớn nhất trong dãy
        int max = sequence.get(sequence.size() - 1);
        boolean isExcellent = true;

        // Kiểm tra các số từ 1 đến max có thiếu số nào không
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            if (!sequence.contains(i)) {
                missingNumbers.add(i);
                isExcellent = false;
            }
        }

        // In kết quả
        if (isExcellent) {
            System.out.println("Excellent!");
        } else {
            for (int number : missingNumbers) {
                System.out.println(number);
            }
        }

        scanner.close();
    }
}
