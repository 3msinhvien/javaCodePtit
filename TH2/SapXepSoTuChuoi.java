//package TH2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SapXepSoTuChuoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống sau số N

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();
            numbers.addAll(extractNumbers(str));
        }

        Collections.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static ArrayList<Integer> extractNumbers(String str) {
        ArrayList<Integer> numbers = new ArrayList<>();
        String currentNumber = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                currentNumber += c;
            } else if (!currentNumber.isEmpty()) {
                numbers.add(Integer.parseInt(currentNumber));
                currentNumber = "";
            }
        }
        if (!currentNumber.isEmpty()) {
            numbers.add(Integer.parseInt(currentNumber));
        }
        return numbers;
    }
}
