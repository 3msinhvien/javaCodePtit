import java.util.Scanner;

public class J01024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng mới sau số lượng bộ test

        while (T-- > 0) {
            String number = scanner.nextLine().trim();
            if (isTernary(number)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }

    private static boolean isTernary(String number) {
        for (char c : number.toCharArray()) {
            if (c != '0' && c != '1' && c != '2') {
                return false;
            }
        }
        return true;
    }
}
