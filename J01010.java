import java.util.Scanner;

public class J01010  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc số lượng bộ test
        int testCount = scanner.nextInt();
        scanner.nextLine();  // Đọc qua dòng trống sau số bộ test

        for (int i = 0; i < testCount; i++) {
            String number = scanner.nextLine();
            String result = cutNumber(number);
            System.out.println(result);
        }

        scanner.close();
    }

    // Hàm để thực hiện "cắt đôi" số
    private static String cutNumber(String number) {
        // Mảng các chữ số hợp lệ để có thể cắt đôi
        String validDigits = "0189";

        StringBuilder result = new StringBuilder();

        // Duyệt qua từng ký tự của số đầu vào
        for (char c : number.toCharArray()) {
            if (validDigits.indexOf(c) == -1) {
                return "INVALID";
            }
            // Xử lý và chuyển đổi các chữ số
            if (c == '1' ) {
                result.append(c);
            } else if (c == '9'|| c == '0' || c == '8') {
                result.append('0');
            }
        }

        // Kiểm tra nếu kết quả cuối cùng toàn là 0 thì không hợp lệ
        String finalResult = result.toString();
        if (finalResult.matches("^0+$")) {
            return "INVALID";
        }

        // Loại bỏ các chữ số 0 ở đầu
        return finalResult.replaceFirst("^0+", "");
    }
}
