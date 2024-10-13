package TH2;

import java.util.Scanner;

public class SoNguyenThuy {

    static int count = 0; // Biến đếm số lượng số nguyên thủy đã in

    public static void sinhSoNguyenThuy(int n, StringBuilder sb, int N) {
        if (count >= N) { // Kiểm tra xem đã in đủ N số chưa
            return;
        }

        if (sb.length() * 2 > n) {
            return;
        }

        if (sb.length() > 0) {
            System.out.print(sb.toString() + sb.reverse() + " ");
            count++;
        }

        sinhSoNguyenThuy(n, sb.append('4'), N);
        sb.deleteCharAt(sb.length() - 1);
        sinhSoNguyenThuy(n, sb.append('5'), N);
        sb.deleteCharAt(sb.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            count = 0; // Reset biến đếm cho mỗi test case
            StringBuilder sb = new StringBuilder();

            sinhSoNguyenThuy(N, sb, N);
            System.out.println();
        }
    }
}